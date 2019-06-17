package cn.authing.core.business

import cn.authing.core.http.Call
import cn.authing.core.http.Callback
import cn.authing.core.result.ErrorInfo
import okhttp3.Request
import java.util.concurrent.Executor

internal class ExecutorCallbackCall<T>(
        private val callbackExecutor: Executor,
        private val delegate: Call<T>
) : Call<T> {

    override fun execute(): T? {
        return delegate.execute()
    }

    override fun enqueue(callback: Callback<T>?) {
        delegate.enqueue(object : Callback<T> {
            override fun onSuccess(result: T?) {
                if (callback == null) {
                    return
                }
                callbackExecutor.execute { callback.onSuccess(result) }
            }

            override fun onFailure(error: ErrorInfo?) {
                if (callback == null) {
                    return
                }
                callbackExecutor.execute { callback.onFailure(error) }
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