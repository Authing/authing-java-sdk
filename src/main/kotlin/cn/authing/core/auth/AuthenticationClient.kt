package cn.authing.core.auth

import cn.authing.core.BaseClient
import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

class AuthenticationClient(userPoolId: String) : BaseClient(userPoolId) {
    /**
     * 检查是否保存了 access token
     */
    private fun checkAccessToken() {
        if (accessToken === null) {
            throw IllegalArgumentException("need to call setAccessToken first")
        }
    }

    /**
     * 获取当前用户信息
     */
    fun currentUser(): GraphQLCall<UserResponse, User> {
        checkAccessToken()
        val param = UserParam()

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UserResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过用户名和密码登录
     */
    fun loginByUsername(param: LoginByUsernameParam): GraphQLCall<LoginByUsernameResponse, User> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<LoginByUsernameResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过邮箱密码登录
     */
    fun loginByEmail(param: LoginByEmailParam): GraphQLCall<LoginByEmailResponse, User> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<LoginByEmailResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过手机号和验证码登录
     */
    fun loginByPhoneCode(param: LoginByPhoneCodeParam): GraphQLCall<LoginByPhoneCodeResponse, User> {
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<LoginByPhoneCodeResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过手机号和密码登录
     */
    fun loginByPhonePassword(param: LoginByPhonePasswordParam): GraphQLCall<LoginByPhonePasswordResponse, User> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<LoginByPhonePasswordResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过用户名注册
     */
    fun registerByUsername(param: RegisterByUsernameParam): GraphQLCall<RegisterByUsernameResponse, User> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RegisterByUsernameResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过邮箱注册
     */
    fun registerByEmail(param: RegisterByEmailParam): GraphQLCall<RegisterByEmailResponse, User> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RegisterByEmailResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过手机号验证码注册
     */
    fun registerByPhoneCode(param: RegisterByPhoneCodeParam): GraphQLCall<RegisterByPhoneCodeResponse, User> {
        if (param.input.password !== null) {
            param.input.password = encrypt(param.input.password!!)
        }

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RegisterByPhoneCodeResponse>>() {}) {
            it.result
        }
    }

    /**
     * 发送手机验证码
     */
    fun sendSmsCode(phone: String): HttpCall<CommonMessage> {
        val url = "$host/api/v2/sms/send"
        val json = "{ \"phone\": \"$phone\" }";

        return createHttpPostCall(url, json, object : TypeToken<CommonMessage>() {})
    }

    /**
     * 检查当前登录状态
     */
    fun checkLoginStatus(): GraphQLCall<CheckLoginStatusResponse, JwtTokenStatus> {
        checkAccessToken()
        val param = CheckLoginStatusParam(token = accessToken)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<CheckLoginStatusResponse>>() {}) {
            it.result
        }
    }

    /**
     * 发送邮件
     */
    fun sendEmail(param: SendEmailParam): GraphQLCall<SendEmailResponse, CommonMessage> {
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<SendEmailResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过手机号验证码或邮件验证码来重置密码
     */
    fun resetPassword(param: ResetPasswordParam): GraphQLCall<ResetPasswordResponse, CommonMessage> {
        param.newPassword = encrypt(param.newPassword)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<ResetPasswordResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新当前用户信息
     */
    fun updateProfile(param: UpdateUserParam): GraphQLCall<UpdateUserResponse, User> {
        checkAccessToken()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdateUserResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新当前用户密码
     */
    fun updatePassword(param: UpdatePasswordParam): GraphQLCall<UpdatePasswordResponse, User> {
        checkAccessToken()
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdatePasswordResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新当前用户手机号
     */
    fun updatePhone(param: UpdatePhoneParam): GraphQLCall<UpdatePhoneResponse, User> {
        checkAccessToken()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdatePhoneResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新当前用户邮箱
     */
    fun updateEmail(param: UpdateEmailParam): GraphQLCall<UpdateEmailResponse, User> {
        checkAccessToken()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdateEmailResponse>>() {}) {
            it.result
        }
    }

    /**
     * 刷新用户 access token
     * @param [param] asd
     */
    fun refreshToken(param: RefreshTokenParam): GraphQLCall<RefreshTokenResponse, RefreshToken> {
        checkAccessToken()
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RefreshTokenResponse>>() {}) {
            it.result
        }
    }

    /**
     * 绑定手机号
     */
    fun bindPhone(param: BindPhoneParam): GraphQLCall<BindPhoneResponse, User> {
        checkAccessToken()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<BindPhoneResponse>>() {}) {
            it.result
        }
    }

    /**
     * 解绑定手机号
     */
    fun unbindPhone(): GraphQLCall<UnbindPhoneResponse, User> {
        checkAccessToken()
        val param = UnbindPhoneParam()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UnbindPhoneResponse>>() {}) {
            it.result
        }
    }

    /**
     * 注销当前用户
     */
    fun logout(): GraphQLCall<Unit, Unit> {
        checkAccessToken()
        val param = UpdateUserParam(input = UpdateUserInput().withTokenExpiredAt("0"))
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<Unit>>() {}) {}
    }
}