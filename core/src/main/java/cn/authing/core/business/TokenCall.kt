package cn.authing.core.business

import cn.authing.core.http.Callback
import cn.authing.core.result.ErrorInfo
import cn.authing.core.result.ITokenResult
import com.google.gson.TypeAdapter
import okhttp3.Request

internal class TokenCall<T : ITokenResult>(
        request: Request,
        callFactory: okhttp3.Call.Factory,
        adapter: TypeAdapter<AuthingResponse<T>>
) : AuthingCall<T>(request, callFactory, adapter) {

    override fun execute(): T? {
        val result = super.execute()
        saveUserToken(result)
        return result
    }

    override fun enqueue(callback: Callback<T>?) {
        super.enqueue(object : Callback<T> {
            override fun onSuccess(result: T?) {
                saveUserToken(result)
                callback?.onSuccess(result)
            }

            override fun onFailure(error: ErrorInfo?) {
                callback?.onFailure(error)
            }
        })
    }

    private fun saveUserToken(result: T?) {
        ImportantParam.userToken = result?.token
    }
}
