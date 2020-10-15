package cn.authing.core

import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.Call
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
    fun currentUser(): Call<UserResponse> {
        checkAccessToken()
        val param = UserParam()

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UserResponse>>() {})
    }

    /**
     * 通过用户名和密码登录
     */
    fun loginByUsername(param: LoginByUsernameParam): Call<LoginByUsernameResponse> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<LoginByUsernameResponse>>() {})
    }

    /**
     * 通过邮箱密码登录
     */
    fun loginByEmail(param: LoginByEmailParam): Call<LoginByEmailResponse> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<LoginByEmailResponse>>() {})
    }

    /**
     * 通过手机号和验证码登录
     */
    fun loginByPhoneCode(param: LoginByPhoneCodeParam): Call<LoginByPhoneCodeResponse> {
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<LoginByPhoneCodeResponse>>() {})
    }

    /**
     * 通过手机号和密码登录
     */
    fun loginByPhonePassword(param: LoginByPhonePasswordParam): Call<LoginByPhonePasswordResponse> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<LoginByPhonePasswordResponse>>() {})
    }

    /**
     * 通过用户名注册
     */
    fun registerByUsername(param: RegisterByUsernameParam): Call<RegisterByUsernameResponse> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RegisterByUsernameResponse>>() {})
    }

    /**
     * 通过邮箱注册
     */
    fun registerByEmail(param: RegisterByEmailParam): Call<RegisterByEmailResponse> {
        param.input.password = encrypt(param.input.password)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RegisterByEmailResponse>>() {})
    }

    /**
     * 通过手机号验证码注册
     */
    fun registerByPhoneCode(param: RegisterByPhoneCodeParam): Call<RegisterByPhoneCodeResponse> {
        if (param.input.password !== null) {
            param.input.password = encrypt(param.input.password!!)
        }

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RegisterByPhoneCodeResponse>>() {})
    }

    /**
     * 发送手机验证码
     */
    fun sendSmsCode(phone: String): Call<CommonMessage> {
        val url = "$host/api/v2/sms/send"
        val json = "{ \"phone\": \"$phone\" }";

        return createHttpPostCall(url, json, object : TypeToken<CommonMessage>() {})
    }

    /**
     * 检查当前登录状态
     */
    fun checkLoginStatus(): Call<CheckLoginStatusResponse> {
        checkAccessToken()
        val param = CheckLoginStatusParam(token = accessToken)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<CheckLoginStatusResponse>>() {})
    }

    /**
     * 发送邮件
     */
    fun sendEmail(param: SendEmailParam): Call<SendEmailResponse> {
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<SendEmailResponse>>() {})
    }

    /**
     * 通过手机号验证码或邮件验证码来重置密码
     */
    fun resetPassword(param: ResetPasswordParam): Call<ResetPasswordResponse> {
        param.newPassword = encrypt(param.newPassword)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<ResetPasswordResponse>>() {})
    }

    /**
     * 更新当前用户信息
     */
    fun updateUser(param: UpdateUserParam): Call<UpdateUserResponse> {
        checkAccessToken()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdateUserResponse>>() {})
    }

    /**
     * 更新当前用户密码
     */
    fun updatePassword(param: UpdatePasswordParam): Call<UpdatePasswordResponse> {
        checkAccessToken()
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdatePasswordResponse>>() {})
    }

    /**
     * 更新当前用户手机号
     */
    fun updatePhone(param: UpdatePhoneParam): Call<UpdatePhoneResponse> {
        checkAccessToken()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdatePhoneResponse>>() {})
    }

    /**
     * 更新当前用户邮箱
     */
    fun updateEmail(param: UpdateEmailParam): Call<UpdateEmailResponse> {
        checkAccessToken()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdateEmailResponse>>() {})
    }

    /**
     * 刷新用户 access token
     */
    fun refreshToken(param: RefreshTokenParam): Call<RefreshTokenResponse> {
        checkAccessToken()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<RefreshTokenResponse>>() {})
    }

    /**
     * 绑定手机号
     */
    fun bindPhone(param: BindPhoneParam): Call<BindPhoneResponse> {
        checkAccessToken()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<BindPhoneResponse>>() {})
    }

    /**
     * 解绑定手机号
     */
    fun unbindPhone(): Call<UnbindPhoneResponse> {
        checkAccessToken()
        val param = UnbindPhoneParam()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UnbindPhoneResponse>>() {})
    }

    /**
     * 注销当前用户
     */
    fun logout(): Call<VoidResponse> {
        checkAccessToken()
        val param = UpdateUserParam(input = UpdateUserInput().withTokenExpiredAt("0"))
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<VoidResponse>>() {})
    }
}