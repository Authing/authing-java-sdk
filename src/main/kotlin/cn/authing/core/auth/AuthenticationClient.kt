package cn.authing.core.auth

import cn.authing.core.BaseClient
import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

class AuthenticationClient(userPoolId: String) : BaseClient(userPoolId) {
    /**
     * 获取当前用户信息
     */
    fun currentUser(): GraphQLCall<UserResponse, User> {
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
    fun loginByUsername(input: LoginByUsernameInput): GraphQLCall<LoginByUsernameResponse, User> {
        val param = LoginByUsernameParam(input)
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
    fun loginByEmail(input: LoginByEmailInput): GraphQLCall<LoginByEmailResponse, User> {
        val param = LoginByEmailParam(input)
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
    fun loginByPhoneCode(input: LoginByPhoneCodeInput): GraphQLCall<LoginByPhoneCodeResponse, User> {
        val param = LoginByPhoneCodeParam(input)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<LoginByPhoneCodeResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过手机号和密码登录
     */
    fun loginByPhonePassword(input: LoginByPhonePasswordInput): GraphQLCall<LoginByPhonePasswordResponse, User> {
        val param = LoginByPhonePasswordParam(input)
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
    fun registerByUsername(input: RegisterByUsernameInput): GraphQLCall<RegisterByUsernameResponse, User> {
        val param = RegisterByUsernameParam(input)
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
    fun registerByEmail(input: RegisterByEmailInput): GraphQLCall<RegisterByEmailResponse, User> {
        val param = RegisterByEmailParam(input)
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
    fun registerByPhoneCode(input: RegisterByPhoneCodeInput): GraphQLCall<RegisterByPhoneCodeResponse, User> {
        val param = RegisterByPhoneCodeParam(input)
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
     * 更新用户信息，ID 参数为当前用户 ID
     */
    fun updateProfile(input: UpdateUserInput): GraphQLCall<UpdateUserResponse, User> {
        val param = UpdateUserParam(input = input)
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdateUserResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新用户密码
     */
    fun updatePassword(param: UpdatePasswordParam): GraphQLCall<UpdatePasswordResponse, User> {
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdatePasswordResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新用户手机号
     */
    fun updatePhone(param: UpdatePhoneParam): GraphQLCall<UpdatePhoneResponse, User> {
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdatePhoneResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新用户邮箱
     */
    fun updateEmail(param: UpdateEmailParam): GraphQLCall<UpdateEmailResponse, User> {
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdateEmailResponse>>() {}) {
            it.result
        }
    }

    /**
     * 刷新用户 access token
     * @param [param] asd
     */
    fun refreshToken(): GraphQLCall<RefreshTokenResponse, RefreshToken> {
        val param = RefreshTokenParam()
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RefreshTokenResponse>>() {}) {
            it.result
        }
    }

    /**
     * 绑定手机号
     */
    fun bindPhone(phone: String, phoneCode: String): GraphQLCall<BindPhoneResponse, User> {
        val param = BindPhoneParam(phone, phoneCode)
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<BindPhoneResponse>>() {}) {
            it.result
        }
    }

    /**
     * 解绑定手机号
     */
    fun unbindPhone(): GraphQLCall<UnbindPhoneResponse, User> {
        val param = UnbindPhoneParam()
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UnbindPhoneResponse>>() {}) {
            it.result
        }
    }

    /**
     * 注销当前用户
     */
    fun logout(): GraphQLCall<Unit, Unit> {
        val param = UpdateUserParam(input = UpdateUserInput().withTokenExpiredAt("0"))
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<Unit>>() {}) {
            accessToken = null
        }
    }
}