package cn.authing.core.auth

import cn.authing.core.BaseClient
import cn.authing.core.Utils
import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import okhttp3.FormBody
import okhttp3.Request
import java.io.IOException
import java.net.http.HttpRequest
import java.nio.Buffer
import java.util.*
import java.util.regex.Pattern

class AuthenticationClient : BaseClient {
    constructor(userPoolId: String) {
        this.userPoolId = userPoolId
    }

    constructor(appId: String, appHost: String) {
        this.appId = appId

        this.host = appHost
    }

    private var user: User? = null

    fun mfa(): MfaAuthenticationClient {
        return MfaAuthenticationClient(this)
    }

    /**
     * 获取当前用户信息
     */
    fun getCurrentUser(): GraphQLCall<UserResponse, User> {
        val param = UserParam()
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UserResponse>>() {}) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    fun checkLoggedIn(): Boolean {
        if (this.user == null) return false

        if (this.token == null) return false

        return true
    }

    /**
     * 通过微信登录，获取用户信息
     */
    @JvmOverloads
    fun loginByWechat(
        code: String,
        country: String? = null,
        lang: String? = null,
        state: String? = null
    ): HttpCall<RestfulResponse<User>, User> {
        var url = "$host/connection/social/wechat:mobile/$userPoolId/callback?code=$code"
        url += if (country != null) "&country=$country" else ""
        url += if (lang != null) "&lang=$lang" else ""
        url += if (state != null) "&state=$state" else ""
        url += if (appId != null) "&app_id=$appId" else ""

        return createHttpGetCall(url, object : TypeToken<RestfulResponse<User>>() {}) {
            user = it.data
            token = it.data.token ?: token
            it.data
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
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
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
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
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
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
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
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    fun loginBySubAccount(
        options: LoginBySubAccountParam
    ): GraphQLCall<LoginBySubAccountResponse, User> {
        return createGraphQLCall(
            options.createRequest(),
            object : TypeToken<GraphQLResponse<LoginBySubAccountResponse>>() {}
        ) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 检查密码强度
     */
    fun checkPasswordStrength(password: String): GraphQLCall<CheckPasswordStrengthResponse, CheckPasswordStrengthResult> {
        val param = CheckPasswordStrengthParam(password);
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<CheckPasswordStrengthResponse>>() {}) {
            return@createGraphQLCall it.result
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
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
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
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
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
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 发送手机验证码
     */
    fun sendSmsCode(phone: String): HttpCall<CommonMessage, CommonMessage> {
        val url = "$host/api/v2/sms/send"
        val json = "{ \"phone\": \"$phone\" }"

        return createHttpPostCall(url, json, object : TypeToken<CommonMessage>() {}) {
            if (it.code != 200) {
                throw IOException(it.message)
            } else {
                it
            }
        }
    }

    /**
     * 检查当前登录状态
     */
    fun checkLoginStatus(): GraphQLCall<CheckLoginStatusResponse, JwtTokenStatus> {
        val param = CheckLoginStatusParam(token = token)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<CheckLoginStatusResponse>>() {}) {
            it.result
        }
    }

    /**
     * 发送邮件
     */
    fun sendEmail(email: String, scene: EmailScene): GraphQLCall<SendEmailResponse, CommonMessage> {
        val param = SendEmailParam(email, scene)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<SendEmailResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过邮件验证码来重置密码
     */
    fun resetPasswordByEmailCode(
        email: String,
        code: String,
        newPassword: String
    ): GraphQLCall<ResetPasswordResponse, CommonMessage> {
        val param = ResetPasswordParam(null, email, code, encrypt(newPassword))

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<ResetPasswordResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过手机号验证码来重置密码
     */
    fun resetPasswordByPhoneCode(
        phone: String,
        code: String,
        newPassword: String
    ): GraphQLCall<ResetPasswordResponse, CommonMessage> {
        val param = ResetPasswordParam(phone, null, code, encrypt(newPassword))

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
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdateUserResponse>>() {}) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 更新用户密码
     */
    @JvmOverloads
    fun updatePassword(newPassword: String, oldPassword: String? = null): GraphQLCall<UpdatePasswordResponse, User> {
        val param = UpdatePasswordParam(encrypt(newPassword), encrypt(oldPassword))

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdatePasswordResponse>>() {}) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 更新用户手机号
     */
    @JvmOverloads
    fun updatePhone(
        phone: String,
        phoneCode: String,
        oldPhone: String? = null,
        oldPhoneCode: String? = null
    ): GraphQLCall<UpdatePhoneResponse, User> {
        val param = UpdatePhoneParam(phone, phoneCode, oldPhone, oldPhoneCode)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdatePhoneResponse>>() {}) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 更新用户邮箱
     */
    @JvmOverloads
    fun updateEmail(
        email: String,
        emailCode: String,
        oldEmail: String? = null,
        oldEmailCode: String? = null
    ): GraphQLCall<UpdateEmailResponse, User> {
        val param = UpdateEmailParam(email, emailCode, oldEmail, oldEmailCode)

        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdateEmailResponse>>() {}) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 绑定邮箱
     */
    fun bindEmail(email: String, emailCode: String): GraphQLCall<BindEmailResponse, User> {
        val param = BindEmailParam(email, emailCode)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<BindEmailResponse>>() {}) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 解绑邮箱
     */
    fun unbindEmail(): GraphQLCall<UnbindEmailResponse, User> {
        val param = UnbindEmailParam()
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UnbindEmailResponse>>() {}) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 关联账号，将社交账号绑定到主账号（手机号、邮箱账号）
     * primaryUserToken: 主账号 Token
     * secondaryUserToken: 社交账号 Token
     */
    fun linkAccount(primaryUserToken: String, secondaryUserToken: String): HttpCall<CommonMessage, CommonMessage> {
        val url = "$host/api/v2/users/link"
        val json = "{ \"primaryUserToken\": \"$primaryUserToken\", \"secondaryUserToken\": \"$secondaryUserToken\" }"

        return createHttpPostCall(url, json, object : TypeToken<CommonMessage>() {}) {
            if (it.code != 200) {
                throw IOException(it.message)
            } else {
                it
            }
        }
    }

    fun unLinkAccount(options: UnLinkAccountParam): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "$host/api/v2/users/unlink"

        return createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code == 200 }
    }

    /**
     * 刷新用户 access token
     */
    fun refreshToken(): GraphQLCall<RefreshTokenResponse, RefreshToken> {
        val param = RefreshTokenParam()
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RefreshTokenResponse>>() {}) {
            token = it.result.token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 绑定手机号
     */
    fun bindPhone(phone: String, phoneCode: String): GraphQLCall<BindPhoneResponse, User> {
        val param = BindPhoneParam(phone, phoneCode)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<BindPhoneResponse>>() {}) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 解绑定手机号
     */
    fun unbindPhone(): GraphQLCall<UnbindPhoneResponse, User> {
        val param = UnbindPhoneParam()
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UnbindPhoneResponse>>() {}) {
            user = it.result
            token = it.result.token ?: token
            return@createGraphQLCall it.result
        }
    }

    /**
     * 注销当前用户
     */
    fun logout(): HttpCall<RestfulResponse<Unit>, Unit> {
        if (appId == null) {
            throw Exception("appId cannot be null")
        }
        val url = "$host/api/v2/logout?app_id=$appId"
        return createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Unit>>() {}
        ) {
            user = null
            token = null
        }
    }


    /**
     * 获取当前用户的自定义数据列表
     */
    fun listUdv(): GraphQLCall<UdvResponse, List<UserDefinedData>> {
        if (user == null) {
            throw Exception("login first")
        }
        val param = UdvParam(UdfTargetType.USER, user!!.id)
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UdvResponse>>() {}) {
            it.result
        }
    }

    /**
     * 添加自定义数据
     */
    fun setUdv(key: String, value: Any): GraphQLCall<SetUdvResponse, List<UserDefinedData>> {
        if (user == null) {
            throw Exception("login first")
        }
        val json = Gson()
        val param = SetUdvParam(UdfTargetType.USER, user!!.id, key, json.toJson(value))
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<SetUdvResponse>>() {}) {
            it.result
        }
    }

    fun setUdvValue(param: SetUdfValueBatchParam): GraphQLCall<SetUdvResponse, List<UserDefinedData>> {
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<SetUdvResponse>>() {}
        ) { it.result }
    }

    /**
     * 移除自定义数据
     */
    private fun removeUdv(key: String): GraphQLCall<RemoveUdvResponse, List<UserDefinedData>> {
        if (user == null) {
            throw Exception("login first")
        }
        val param = RemoveUdvParam(UdfTargetType.USER, user!!.id, key)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RemoveUdvResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取用户所在组织机构数据列表
     */
    fun listOrgs(): HttpCall<RestfulResponse<List<List<Org>>>, List<List<Org>>> {
        return this.createHttpGetCall(
            "${this.host}/api/v2/users/me/orgs",
            object : TypeToken<RestfulResponse<List<List<Org>>>>() {}) {
            it.data
        }
    }

    /**
     * 使用 LDAP 用户名登录，如果你的用户池配置了登录失败检测，当同一  IP 下登录多次失败的时候会要求用户输入图形验证码（code 为 2000)。
     */
    fun loginByLdap(param: LoginByLdapParam): HttpCall<RestfulResponse<User>, User> {
        return this.createHttpPostCall(
            "${this.host}/api/v2/ldap/verify-user",
            GsonBuilder().create().toJson(param),
            object : TypeToken<RestfulResponse<User>>() {}) {
            user = it.data
            token = it.data.token ?: token
            it.data
        }
    }

    /**
     * 使用 AD 用户名登录
     */
    fun loginByAd(username: String, password: String): HttpCall<RestfulResponse<User>, User> {
        return this.createHttpPostCall(
            "ws.${this.host}/api/v2/ad/verify-user",
            "{ \"username\": \"$username\", \"password\": \"$password\" }",
            object : TypeToken<RestfulResponse<User>>() {}) {
            user = it.data
            token = it.data.token ?: token
            it.data
        }
    }

    /**
     * 获取用户被授权的所有资源
     */
    fun listAuthorizedResources(namespace: String): GraphQLCall<ListUserAuthorizedResourcesResponse, PaginatedAuthorizedResources> {
        if (user == null) {
            throw Exception("login first")
        }
        val param = ListUserAuthorizedResourcesParam(user!!.id, namespace)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<ListUserAuthorizedResourcesResponse>>() {}) {
            it.result.authorizedResources!!
        }
    }

    /**
     * 获取用户的安全等级评分
     * 此接口需要登录后才可以调用
     */
    fun getSecurityLevel(): HttpCall<RestfulResponse<SecurityLevel>, SecurityLevel> {
        if (user == null) {
            throw Exception("login first")
        }

        return this.createHttpGetCall(
            "${this.host}/api/v2/users/me/security-level",
            object : TypeToken<RestfulResponse<SecurityLevel>>() {}) {
            it.data
        }
    }

    /**
     * 获取当前用户的所有自定义数据
     *
     */
    fun getUdfValue(): GraphQLCall<UdvResponse, Map<String, Any>> {
        if (user == null) {
            throw Exception("login first")
        }
        val param = UdvParam(UdfTargetType.USER, user!!.id)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UdvResponse>>() {}) {
            convertUdvToKeyValuePair(it.result)
        }
    }

    /**
     * 设置自定义字段值
     */
    fun setUdfValue(data: Map<String, String>): GraphQLCall<SetUdvBatchResponse, List<UserDefinedData>> {
        if (user == null) {
            throw Exception("login first")
        }

        val udvList = data.entries.map { UserDefinedDataInput(it.key, Gson().toJson(it.value)) }
        val param = SetUdvBatchParam(UdfTargetType.USER, user!!.id, udvList)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<SetUdvBatchResponse>>() {}) {
            it.result
        }
    }

    /**
     * 移除自定义数据
     */
    fun removeUdfValue(key: String): GraphQLCall<RemoveUdvResponse, List<UserDefinedData>> {
        return removeUdv(key)
    }

    /**
     * 根据code获得AccessToken
     */
    fun getAccessTokenByCode(code: String): HttpCall<Any, Any> {

        if (this.secret.isNullOrBlank()
            && this.tokenEndPointAuthMethod != AuthMethodEnum.NONE
        ) {
            throw Exception("请在初始化 AuthenticationClient 时传入 appId 和 secret 参数")
        }

        val url = "${this.host}/oidc/token"
        when (this.tokenEndPointAuthMethod) {
            AuthMethodEnum.CLIENT_SECRET_POST -> {
                return HttpCall(
                    okHttpClient.newCall(
                        Request.Builder()
                            .url(url)
                            .addHeader("Content-Type", "application/x-www-form-urlencoded")
                            .post(
                                FormBody.Builder().add("client_id", this.appId!!)
                                    .add("client_secret", this.secret!!)
                                    .add("grant_type", "authorization_code")
                                    .add("code", code)
                                    .add("redirect_uri", this.redirectUri!!).build()
                            )
                            .build()
                    ), json.getAdapter(object : TypeToken<Any>() {})
                ) {
                    it
                }
            }
            AuthMethodEnum.CLIENT_SECRET_BASIC -> {
                val basic64Str =
                    "Basic " + Base64.getEncoder().encodeToString(("${this.appId}:${this.secret}").toByteArray())

                return HttpCall(
                    okHttpClient.newCall(
                        Request.Builder()
                            .url(url)
                            .addHeader("Authorization", basic64Str)
                            .addHeader("Content-Type", "application/x-www-form-urlencoded")
                            .post(
                                FormBody.Builder()
                                    .add("grant_type", "authorization_code")
                                    .add("code", code)
                                    .add("redirect_uri", this.redirectUri!!).build()
                            )
                            .build()
                    ), json.getAdapter(object : TypeToken<Any>() {})
                ) {
                    it
                }
            }
            else -> {//AuthMethodEnum.NONE
                return HttpCall(
                    okHttpClient.newCall(
                        Request.Builder()
                            .url(url)
                            .addHeader("Content-Type", "application/x-www-form-urlencoded")
                            .post(
                                FormBody.Builder().add("client_id", this.appId!!)
                                    .add("grant_type", "authorization_code")
                                    .add("code", code)
                                    .add("redirect_uri", this.redirectUri!!).build()
                            )
                            .build()
                    ), json.getAdapter(object : TypeToken<Any>() {})
                ) {
                    it
                }
            }
        }
    }

    /**
     * 根据 ClientCredentials 获得AccessToken
     */
    fun getAccessTokenByClientCredentials(scope: String, options: ClientCredentialInput?): HttpCall<Any, Any> {
        if (scope.isBlank()) {
            throw Exception("请传入 scope 参数，请看文档：https://docs.authing.cn/v2/guides/authorization/m2m-authz.html")
        }

        if (options == null) {
            throw Exception("请在调用本方法时传入 { accessKey: string, accessSecret: string }，请看文档：https://docs.authing.cn/v2/guides/authorization/m2m-authz.html")
        }

        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url("${this.host}/oidc/token")
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .post(
                        FormBody.Builder().add("client_id", options.accessKey)
                            .add("client_secret", options.accessSecret)
                            .add("grant_type", "client_credentials")
                            .add("scope", scope).build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it
        }
    }

    /**
     * 根据token获取用户信息
     */
    fun getUserInfoByAccessToken(accessToken: String): HttpCall<Any, Any> {
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url("${this.host}/oidc/me?access_token=${accessToken}")
                    .get()
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it
        }
    }


    /**
     * 获取当前用户能够访问的应用
     */
    @JvmOverloads
    fun listApplications(
        page: Int = 1,
        limit: Int = 10
    ): HttpCall<RestfulResponse<Pagination<ApplicationPublicDetail>>, Pagination<ApplicationPublicDetail>> {
        val url = "$host/api/v2/users/me/applications/allowed?page=$page&limit=$limit"

        return createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Pagination<ApplicationPublicDetail>>>() {}) { it.data }
    }

    fun computedPasswordSecurityLevel(
        password: String
    ): PasswordSecurityLevel {
        val highLevel = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[\\^]{12,}\$"
        val middleLevel = "^(?=.*[a-zA-Z])(?=.*\\d)[\\^]{8,}\$"

        if (Pattern.matches(highLevel, password)) {
            return PasswordSecurityLevel.HIGH;
        }
        if (Pattern.matches(middleLevel, password)) {
            return PasswordSecurityLevel.MIDDLE;
        }
        return PasswordSecurityLevel.LOW;
    }

    fun buildAuthorizeUrl(): String {
        if (this.appId == null)
            throw Exception("请在初始化 AuthenticationClient 时传入 appId")

        if (this.protocol != ProtocolEnum.SAML)
            throw Exception("初始化 AuthenticationClient 传入的 protocol 应为 ProtocolEnum.SAML 不应该为 $protocol")

        return "$host/api/v2/saml-idp/$appId"
    }

    fun buildAuthorizeUrl(param: IOidcParams): String {
        if (this.appId == null)
            throw Exception("请在初始化 AuthenticationClient 时传入 appId")

        if (this.protocol != ProtocolEnum.OIDC)
            throw Exception("初始化 AuthenticationClient 传入的 protocol 应为 ProtocolEnum.OIDC 不应该为 $protocol")

        if (this.redirectUri == "" && param.redirectUri == null)
            throw Exception("redirectUri 不应该为空 解决方法：请在 AuthenticationClient 初始化时传入 redirectUri，或者调用 buildAuthorizeUrl 时传入 redirectUri")

        val map = mutableMapOf<String, String?>(
            "client_id" to
                    if (param.appId != null) param.appId
                    else this.appId,
            "scope" to
                    if (param.scope != null) param.scope
                    else "openid profile email phone address",
            "state" to
                    if (param.state != null) param.state
                    else Utils().randomString(12),
            "nonce" to
                    if (param.nonce != null) param.nonce
                    else Utils().randomString(12),
            "response_mode" to
                    if (param.responseMode != null) param.responseMode.toString()
                    else null,
            "response_type" to
                    if (param.responseType != null) param.responseType
                    else "code",
            "redirect_uri" to
                    if (param.redirectUri != null) param.redirectUri
                    else this.redirectUri,
            "prompt" to
                    if (param.scope?.contains("offline_access") == true) "consent"
                    else null
        )

        val params = Utils().getQueryUrl(map.filter { (_, value) -> value != null })

        return "$host/oidc/auth$params"
    }

    fun buildAuthorizeUrl(param: IOauthParams): String {
        if (this.appId == null)
            throw Exception("请在初始化 AuthenticationClient 时传入 appId")

        if (this.protocol != ProtocolEnum.OAUTH)
            throw Exception("初始化 AuthenticationClient 传入的 protocol 应为 ProtocolEnum.OAUTH 不应该为 $protocol")


        if (this.redirectUri == "" && param.redirectUri == null)
            throw Exception("redirectUri 不应该为空 解决方法：请在 AuthenticationClient 初始化时传入 redirectUri，或者调用 buildAuthorizeUrl 时传入 redirectUri")


        val paramsMap = mutableMapOf<String, String?>(
            "client_id" to
                    if (param.appId != null) param.appId
                    else this.appId,
            "scope" to
                    if (param.scope != null) param.scope
                    else "user",
            "state" to
                    if (param.state != null) param.state
                    else Utils().randomString(12),
            "response_type" to
                    if (param.responseType != null) param.responseType
                    else "code",
            "redirect_uri" to
                    if (param.redirectUri != null) param.redirectUri
                    else this.redirectUri
        )

        val params = Utils().getQueryUrl(paramsMap.filter { (_, value) -> value != null })

        return "$host/oauth/auth$params"
    }

    fun buildAuthorizeUrl(param: ICasParams): String {
        if (this.appId == null)
            throw Exception("请在初始化 AuthenticationClient 时传入 appId")

        if (this.protocol != ProtocolEnum.CAS)
            throw Exception("初始化 AuthenticationClient 传入的 protocol 应为 ProtocolEnum.CAS 不应该为 $protocol")

        if (this.appId == null) {
            throw Exception("请在初始化 AuthenticationClient 时传入 appId")
        }

        return if (param.service != null)
            "$host/cas-idp/$appId?service=${param.service}"
        else
            "$host/cas-idp/$appId"
    }

    fun getNewAccessTokenByRefreshToken(refreshToken: String): HttpCall<Any, Any> {
        if (listOf<ProtocolEnum>(ProtocolEnum.OAUTH, ProtocolEnum.OIDC).contains(this.protocol)) {
            throw Exception("初始化 AuthenticationClient 时传入的 protocol 参数必须为 ProtocolEnum.OAUTH 或 ProtocolEnum.OIDC，请检查参数")
        }

        if (this.secret.isNullOrBlank()
            && this.tokenEndPointAuthMethod != AuthMethodEnum.NONE
        ) {
            throw Exception("请在初始化 AuthenticationClient 时传入 appId 和 secret 参数")
        }

        return when (this.tokenEndPointAuthMethod) {
            AuthMethodEnum.CLIENT_SECRET_POST -> {
                getNewAccessTokenByRefreshTokenWithClientSecretPost(refreshToken)
            }
            AuthMethodEnum.CLIENT_SECRET_BASIC -> {
                getNewAccessTokenByRefreshTokenWithClientSecretBasic(refreshToken)
            }
            else -> {
                getNewAccessTokenByRefreshTokenWithNone(refreshToken)
            }
        }
    }

    private fun getNewAccessTokenByRefreshTokenWithClientSecretPost(refreshToken: String): HttpCall<Any, Any> {
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(
                        if (this.protocol == ProtocolEnum.OIDC) "$host/oidc/token"
                        else "$host/oauth/token"
                    )
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .post(
                        FormBody.Builder()
                            .add("client_id", this.appId!!)
                            .add("client_secret", this.secret!!)
                            .add("grant_type", "refresh_token")
                            .add("refresh_token", refreshToken)
                            .build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it
        }
    }

    private fun getNewAccessTokenByRefreshTokenWithClientSecretBasic(refreshToken: String): HttpCall<Any, Any> {
        val basic64Str =
            "Basic " + Base64.getEncoder().encodeToString(("${this.appId}:${this.secret}").toByteArray())
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(
                        if (this.protocol == ProtocolEnum.OIDC) "$host/oidc/token"
                        else "$host/oauth/token"
                    )
                    .addHeader("Authorization", basic64Str)
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .post(
                        FormBody.Builder()
                            .add("grant_type", "refresh_token")
                            .add("refresh_token", refreshToken)
                            .build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it
        }
    }

    private fun getNewAccessTokenByRefreshTokenWithNone(refreshToken: String): HttpCall<Any, Any> {
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(
                        if (this.protocol == ProtocolEnum.OIDC) "$host/oidc/token"
                        else "$host/oauth/token"
                    )
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .post(
                        FormBody.Builder()
                            .add("client_id", this.appId!!)
                            .add("grant_type", "refresh_token")
                            .add("refresh_token", refreshToken)
                            .build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it
        }
    }

    fun introspectToken(token: String): HttpCall<Any, Any> {
        if (listOf<ProtocolEnum>(ProtocolEnum.OAUTH, ProtocolEnum.OIDC).contains(this.protocol)) {
            throw Exception("初始化 AuthenticationClient 时传入的 protocol 参数必须为 ProtocolEnum.OAUTH 或 ProtocolEnum.OIDC，请检查参数")
        }

        if (this.secret.isNullOrBlank()
            && this.tokenEndPointAuthMethod != AuthMethodEnum.NONE
        ) {
            throw Exception("请在初始化 AuthenticationClient 时传入 appId 和 secret 参数")
        }

        return when (this.introspectionEndPointAuthMethod) {
            AuthMethodEnum.CLIENT_SECRET_POST -> introspectTokenWithClientSecretPost(token)
            AuthMethodEnum.CLIENT_SECRET_BASIC -> introspectTokenWithClientSecretBasic(token)
            else -> introspectTokenWithNone(token)

        }
    }

    private fun introspectTokenWithClientSecretPost(token: String): HttpCall<Any, Any> {
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(
                        if (this.protocol == ProtocolEnum.OIDC) "$host/oidc/token/introspection"
                        else "$host/oauth/token/introspection"
                    )
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .post(
                        FormBody.Builder()
                            .add("client_id", this.appId!!)
                            .add("client_secret", this.secret!!)
                            .add("token", token)
                            .build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it
        }
    }

    private fun introspectTokenWithClientSecretBasic(token: String): HttpCall<Any, Any> {
        val basic64Str =
            "Basic " + Base64.getEncoder().encodeToString(("${this.appId}:${this.secret}").toByteArray())
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(
                        if (this.protocol == ProtocolEnum.OIDC) "$host/oidc/token/introspection"
                        else "$host/oauth/token/introspection"
                    )
                    .addHeader("Authorization", basic64Str)
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .post(
                        FormBody.Builder()
                            .add("token", token)
                            .build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it
        }
    }

    private fun introspectTokenWithNone(token: String): HttpCall<Any, Any> {
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(
                        if (this.protocol == ProtocolEnum.OIDC) "$host/oidc/token/introspection"
                        else "$host/oauth/token/introspection"
                    )
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .post(
                        FormBody.Builder()
                            .add("client_id", this.appId!!)
                            .add("token", token)
                            .build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it
        }
    }

    fun validateToken(param: ValidateTokenParams): HttpCall<Any, Any> {
        val (accessToken, idToken) = param
        if (accessToken == null && idToken == null)
            throw Exception("请在传入的参数对象中包含 accessToken 或 idToken 字段")
        if (accessToken != null && idToken != null)
            throw Exception("accessToken 和 idToken 只能传入一个，不能同时传入")

        var url = "$host/api/v2/oidc/validate_token"
        url += if (accessToken != null) "?access_token=$accessToken" else "?id_token=$idToken"

        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(url)
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .get()
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it
        }
    }


    fun revokeToken(token: String): HttpCall<Any, Boolean> {
        if (listOf<ProtocolEnum>(ProtocolEnum.OAUTH, ProtocolEnum.OIDC).contains(this.protocol)) {
            throw Exception("初始化 AuthenticationClient 时传入的 protocol 参数必须为 ProtocolEnum.OAUTH 或 ProtocolEnum.OIDC，请检查参数")
        }

        if (this.secret.isNullOrBlank()
            && this.tokenEndPointAuthMethod != AuthMethodEnum.NONE
        ) {
            throw Exception("请在初始化 AuthenticationClient 时传入 appId 和 secret 参数")
        }

        return when (this.introspectionEndPointAuthMethod) {
            AuthMethodEnum.CLIENT_SECRET_POST -> revokeTokenWithClientSecretPost(token)
            AuthMethodEnum.CLIENT_SECRET_BASIC -> revokeTokenWithClientSecretBasic(token)
            else -> revokeTokenWithNone(token)

        }
    }

    private fun revokeTokenWithClientSecretPost(token: String): HttpCall<Any, Boolean> {
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(
                        if (this.protocol == ProtocolEnum.OIDC) "$host/oidc/token/revocation"
                        else "$host/oauth/token/revocation"
                    )
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .post(
                        FormBody.Builder()
                            .add("token", token)
                            .add("client_id", this.appId!!)
                            .add("client_secret", this.secret!!)
                            .build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it != null
        }
    }

    private fun revokeTokenWithClientSecretBasic(token: String): HttpCall<Any, Boolean> {
        if (this.protocol == ProtocolEnum.OAUTH)
            throw Exception("OAuth 2.0 暂不支持用 client_secret_basic 模式身份验证撤回 Token")

        val basic64Str =
            "Basic " + Base64.getEncoder().encodeToString(("${this.appId}:${this.secret}").toByteArray())
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url("$host/oidc/token/revocation")
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .addHeader("Authorization", basic64Str)
                    .post(
                        FormBody.Builder()
                            .add("token", token)
                            .build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it != null
        }
    }

    private fun revokeTokenWithNone(token: String): HttpCall<Any, Boolean> {
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(
                        if (this.protocol == ProtocolEnum.OIDC) "$host/oidc/token/revocation"
                        else "$host/oauth/token/revocation"
                    )
                    .addHeader("Content-Type", "application/x-www-form-urlencoded")
                    .post(
                        FormBody.Builder()
                            .add("token", token)
                            .add("client_id", this.appId!!)
                            .build()
                    )
                    .build()
            ), json.getAdapter(object : TypeToken<Any>() {})
        ) {
            it != null
        }
    }

    fun buildLogoutUrl(options: ILogoutParams): String {
        if (this.protocol == ProtocolEnum.OAUTH)
            return this.buildCasLogoutUrl(options)

        if (this.protocol == ProtocolEnum.OIDC && options.expert != null)
            return this.buildOidcLogoutUrl(options)

        return buildEasyLogoutUrl(options)
    }

    private fun buildCasLogoutUrl(options: ILogoutParams): String {
        return if (options.redirectUri != null)
            "$host/cas-idp/logout?url=${options.redirectUri}"
        else
            "$host/cas-idp/logout"
    }

    private fun buildOidcLogoutUrl(options: ILogoutParams): String {
        if ((options.redirectUri != null && options.idToken != null) || (options.redirectUri == null && options.idToken == null))
            throw Exception("必须同时传入 idToken 和 redirectUri 参数，或者同时都不传入")

        return if (options.redirectUri != null)
            "${host}/oidc/session/end?id_token_hint=${options.idToken}&post_logout_redirect_uri=${options.redirectUri}"
        else
            "${host}/oidc/session/end"
    }

    private fun buildEasyLogoutUrl(options: ILogoutParams): String {
        return if (options.redirectUri != null)
            "${host}/login/profile/logout?redirect_uri=${options.redirectUri}"
        else
            "${host}/login/profile/logout"
    }
}