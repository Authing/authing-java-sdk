package cn.authing.core.business

import cn.authing.core.http.Call
import cn.authing.core.http.Callback
import cn.authing.core.result.ErrorInfo
import cn.authing.core.result.RefreshOidcTokenResult
import cn.authing.core.result.SigninResult
import cn.authing.core.utils.AuthingUtils.URL_CORE_ME
import com.google.gson.Gson
import okhttp3.FormBody
import okhttp3.Request

class LoginByOidcCall(
        requestOne: Request,
        private val callFactory: okhttp3.Call.Factory
) : Call<SigninResult> {
    private val gson = Gson()
    private val callOne = NormalCall<RefreshOidcTokenResult>(requestOne, callFactory, gson.getAdapter(RefreshOidcTokenResult::class.java))
    private var callTwo: Call<SigninResult>? = null

    override fun execute(): SigninResult? {
        val resultOne = callOne.execute() ?: return null
        newTwoCall(resultOne)
        val resultTwo = callTwo?.execute() ?: return null
        return fillResult(resultOne, resultTwo)
    }

    override fun enqueue(callback: Callback<SigninResult>?) {
        callOne.enqueue(object : Callback<RefreshOidcTokenResult> {
            override fun onSuccess(result1: RefreshOidcTokenResult) {
                callback ?: return
                newTwoCall(result1)
                callTwo?.enqueue(object : Callback<SigninResult> {
                    override fun onSuccess(result2: SigninResult) {
                        callback.onSuccess(fillResult(result1, result2))
                    }

                    override fun onFailure(error: ErrorInfo?) {
                        callback.onFailure(error)
                    }
                })
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
        callTwo = NormalCall<SigninResult>(request, callFactory, gson.getAdapter(SigninResult::class.java))
    }

    private fun fillResult(resultOne: RefreshOidcTokenResult, resultTwo: SigninResult): SigninResult {
        resultTwo.setAccessToken(resultOne.accessToken)
        resultTwo.setRefreshToken(resultOne.refreshToken)
        resultTwo.setIdToken(resultOne.idToken)
        resultTwo.setScope(resultOne.scope)
        resultTwo.setTokenType(resultOne.tokenType)
        resultTwo.setToken(ImportantParam.userToken)
        resultTwo.setExpiresIn(resultOne.expiresIn)
        return resultTwo
    }
} 