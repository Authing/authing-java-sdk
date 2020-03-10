package cn.authing.core.business

import cn.authing.core.http.Call
import cn.authing.core.http.Callback
import cn.authing.core.result.ErrorInfo
import cn.authing.core.result.RefreshOidcTokenResult
import cn.authing.core.utils.AuthingUtils.URL_CORE_ME
import com.google.gson.Gson
import okhttp3.FormBody
import okhttp3.Request

class LoginByOidcCall<ResultTwo>(
        requestOne: Request,
        private val callFactory: okhttp3.Call.Factory,
        private val clazzResultTwo: Class<ResultTwo>
) : Call<ResultTwo> {
    private val gson = Gson()
    private val callOne = NormalCall<RefreshOidcTokenResult>(requestOne, callFactory, gson.getAdapter(RefreshOidcTokenResult::class.java))
    private var callTwo: Call<ResultTwo>? = null

    override fun execute(): ResultTwo? {
        val resultOne = callOne.execute() ?: return null
        newTwoCall(resultOne)
        return callTwo?.execute()
    }

    override fun enqueue(callback: Callback<ResultTwo>?) {
        callOne.enqueue(object : Callback<RefreshOidcTokenResult> {
            override fun onSuccess(result: RefreshOidcTokenResult) {
                callback ?: return
                newTwoCall(result)
                callTwo?.enqueue(callback)
            }

            override fun onFailure(error: ErrorInfo?) {
                callback?.onFailure(error)
            }
        })
    }

    override fun isExecuted(): Boolean {
        return callOne.isExecuted
    }

    override fun cancel() {
        callOne.cancel()
        callTwo?.cancel()
    }

    override fun isCanceled(): Boolean {
        return callOne.isCanceled
    }

    override fun request(): Request {
        throw UnsupportedOperationException()
    }

    private fun newTwoCall(resultOne: RefreshOidcTokenResult) {
        val builder = FormBody.Builder()
        builder.add("access_token", resultOne.accessToken)
        val request = Request.Builder()
                .url(URL_CORE_ME)
                .post(builder.build())
                .build()
        callTwo = NormalCall<ResultTwo>(request, callFactory, gson.getAdapter(clazzResultTwo))
    }
}