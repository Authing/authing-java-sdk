package cn.authing.core.business

import cn.authing.core.result.ErrorInfo
import com.google.gson.annotations.SerializedName


/**
 * An HTTP response.
 */
internal class AuthingResponse<Result> {

    private val data: ResponseData<Result>? = null
    private var errors: List<ResponseError>? = null
    private var errorInfo: ErrorInfo? = null

    val result: Result?
        get() = data?.result

    val error: ErrorInfo?
        get() {
            if (errorInfo != null) {
                return errorInfo
            }
            if (errors.isNullOrEmpty()) {
                return null
            }
            for (e in errors!!) {
                if (null != e.message) {
                    errorInfo = e.message
                    errors = null
                    return errorInfo
                }
            }
            return null
        }

    private class ResponseData<T> {
        @SerializedName(
                value = "result", // result 这个名称永远不会用
                alternate = [
                    "getClientWhenSdkInit",
                    "ReadOauthList",
                    "user",
                    "users",
                    "userPatch",
                    "register", "login",
                    "LoginByLDAP",
                    "refreshToken",
                    "removeUsers",
                    "updateUser",
                    "sendResetPasswordEmail",
                    "verifyResetPasswordVerifyCode",
                    "changePassword",
                    "sendVerifyEmail",
                    "unbindEmail",
                    "notBindOAuthList",
                    "bindOtherOAuth",
                    "unbindOtherOAuth"
                ])
        val result: T? = null
    }

    private class ResponseError {
        val message: ErrorInfo? = null
    }
}
