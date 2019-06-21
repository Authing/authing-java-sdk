package cn.authing.core.business

import cn.authing.core.http.Call
import cn.authing.core.http.Callback
import cn.authing.core.result.ErrorInfo
import com.google.gson.TypeAdapter
import okhttp3.Request

internal open class AuthingCall<ResultType>(
        request: Request,
        callFactory: okhttp3.Call.Factory,
        adapter: TypeAdapter<AuthingResponse<ResultType>>
) : Call<ResultType> {

    private val delegate = NormalCall<AuthingResponse<ResultType>>(request, callFactory, adapter)

    override fun execute(): ResultType? {
        return delegate.execute()?.result
    }

    override fun enqueue(callback: Callback<ResultType>?) {
        delegate.enqueue(object : Callback<AuthingResponse<ResultType>> {
            override fun onSuccess(result: AuthingResponse<ResultType>?) {
                if (result?.error != null) {
                    callback?.onFailure(result.error)
                } else {
                    callback?.onSuccess(result?.result)
                }
            }

            override fun onFailure(error: ErrorInfo?) {
                callback?.onFailure(error)
            }
        })
    }

    override fun isExecuted(): Boolean {
        return delegate.isExecuted
    }

    override fun cancel() {
        return delegate.cancel()
    }

    override fun isCanceled(): Boolean {
        return delegate.isCanceled
    }

    override fun request(): Request {
        return delegate.request()
    }
}