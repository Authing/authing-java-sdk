package cn.authing.core

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLRequest
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.Call
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.security.KeyFactory
import java.security.spec.X509EncodedKeySpec
import java.util.*
import javax.crypto.Cipher


/**
 * Authing 客户端类
 */
open class Authing(private val userPoolId: String, private val secret: String? = null) {
    // 兼容 Java 的单参数构造方法
    constructor(clientId: String): this(clientId, null)

    // 可选参数
    var host: String = "https://core.authing.cn"
    var publicKey: String = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC4xKeUgQ+Aoz7TLfAfs9+paePb" +
            "5KIofVthEopwrXFkp8OCeocaTHt9ICjTT2QeJh6cZaDaArfZ873GPUn00eOIZ7Ae" +
            "+TiA2BKHbCvloW3w5Lnqm70iSsUi5Fmu9/2+68GZRH9L7Mlh8cFksCicW2Y2W2uM" +
            "GKl64GDcIq3au+aqJQIDAQAB"

    // 常量
    private val MEDIA_TYPE_JSON: MediaType? = "application/json".toMediaTypeOrNull()
    private val TYPE: String = "SDK"
    private val VERSION: String = "java:2.0.2"

    // graphql 端点
    private val endpoint: String get() { return "$host/graphql" }

    /**
     * 每次发出请求时会附加在请求头的 AccessToken
     *
     * 访问某些需要权限的接口则必须设置此变量
     */
    var accessToken: String? = null

    protected val client: OkHttpClient = OkHttpClient()
    protected val gson = GsonBuilder().create()

    /**
     * 密码加密方法
     */
    protected open fun encrypt(msg: String?): String? {
        if (msg == null) {
            return null
        }
        var result: String? = null
        try {
            // get publicKey
            val keyBytes: ByteArray = Base64.getDecoder().decode(publicKey)
            val keySpec = X509EncodedKeySpec(keyBytes)
            val keyFactory = KeyFactory.getInstance("RSA")
            val publicKey = keyFactory.generatePublic(keySpec)
            val cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding")
            cipher.init(Cipher.ENCRYPT_MODE, publicKey)
            val cipherMsg = cipher.doFinal(msg.toByteArray())
            result = String(Base64.getEncoder().encode(cipherMsg))
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return result
    }

    /**
     * 创建 GraphQL 请求
     */
    protected open fun <TResponse> createGraphQLCall(request: GraphQLRequest, typeToken: TypeToken<GraphQLResponse<TResponse>>): Call<TResponse> {
        val adapter = gson.getAdapter(typeToken)
        return GraphQLCall(client.newCall(Request.Builder()
                .url(endpoint)
                .addHeader("Authorization", "Bearer " + this.accessToken)
                .addHeader("Content-Type", "application/json")
                .addHeader("x-authing-userpool-id", userPoolId)
                .addHeader("x-authing-request-from", TYPE)
                .addHeader("x-authing-sdk-version", VERSION)
                .post(gson.toJson(request).toRequestBody(MEDIA_TYPE_JSON))
                .build()), adapter)
    }

    /**
     * 创建 HTTP GET 请求
     */
    protected open fun <TResponse> createHttpGetCall(url: String, typeToken: TypeToken<TResponse>): Call<TResponse> {
        val adapter = gson.getAdapter(typeToken)
        return HttpCall(client.newCall(Request.Builder()
                .url(url)
                .addHeader("x-authing-userpool-id", userPoolId)
                .addHeader("x-authing-request-from", TYPE)
                .addHeader("x-authing-sdk-version", VERSION)
                .get()
                .build()), adapter)
    }


    /**
     * 创建 HTTP POST 请求
     */
    protected open fun <TResponse> createHttpPostCall(url: String, body: RequestBody, typeToken: TypeToken<TResponse>): Call<TResponse> {
        val adapter = gson.getAdapter(typeToken)
        return HttpCall(client.newCall(Request.Builder()
            .url(url)
            .addHeader("x-authing-userpool-id", userPoolId)
            .addHeader("x-authing-request-from", TYPE)
            .addHeader("x-authing-sdk-version", VERSION)
            .post(body)
            .build()), adapter)
    }

    /**
     * 通过初始化时传入的 Secret 登录
     *
     * 仅用户池管理员可用
     * @return AccessToken
     */
    fun loginBySecret(): Call<LoginBySecretResponse> {
        if (secret == null) {
            throw java.lang.IllegalArgumentException("secret is null")
        }

        val param = LoginBySecretParam(
                clientId = userPoolId,
                secret = secret
        )

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<LoginBySecretResponse>>() {})
    }

    /**
     * 通过用户名和密码登录
     */
    fun loginByUsername(param: LoginByUsernameParam): Call<LoginByUsernameResponse> {
        param.clientId = userPoolId
        param.password = encrypt(param.password)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<LoginByUsernameResponse>>() {})
    }

    /**
     * 通过邮箱密码登录
     */
    fun loginByEmail(param: LoginByEmailParam): Call<LoginByEmailResponse> {
        param.clientId = userPoolId
        param.password = encrypt(param.password)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<LoginByEmailResponse>>() {})
    }

    /**
     * 通过手机号和验证码登录
     */
    fun loginByPhoneCode(param: LoginByPhoneCodeParam): Call<LoginByPhoneCodeResponse> {
        param.clientId = userPoolId
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<LoginByPhoneCodeResponse>>() {})
    }

    /**
     * 通过手机号和密码登录
     */
    fun loginByPhonePassword(param: LoginByPhonePasswordParam): Call<LoginByPhonePasswordResponse> {
        param.clientId = userPoolId
        param.password = encrypt(param.password)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<LoginByPhonePasswordResponse>>() {})
    }

    /**
     * 通过 AD 登录
     */
    fun loginByAd(param: LoginByAdParam): Call<LoginByAdResponse> {
        param.password = encrypt(param.password)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<LoginByAdResponse>>() {})
    }

    /**
     * 通过 LDAP 登录
     */
    fun loginByLdap(param: LoginByLdapParam): Call<LoginByLdapResponse> {
        param.clientId = userPoolId
        param.password = encrypt(param.password)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<LoginByLdapResponse>>() {})
    }

    /**
     * 通过 OIDC passord 模式登录
     */
    fun loginByOidc(param: LoginByOidcParam): Call<LoginByOidcResponse> {
        val body = FormBody
            .Builder()
            .add("grant_type", "password")
            .add("email", param.email)
            .add("password", param.password)
            .add("client_id", param.appId)
            .add("client_secret", param.appSecret)
            .add("scope", "offline_access")
            .build()
        return createHttpPostCall("$host/oauth/oidc/token", body, object : TypeToken<LoginByOidcResponse>() {})
    }


    /**
     * 通过 OIDC passord 模式登录
     */
    fun refreshOidcToken(param: RefreshOidcTokenParam): Call<RefreshOidcTokenResponse> {
        val body = FormBody
            .Builder()
            .add("grant_type", "refresh_token")
            .add("client_id", param.appId)
            .add("client_secret", param.appSecret)
            .add("refresh_token", param.refreshToken)
            .build()
        return createHttpPostCall("$host/oauth/oidc/token", body, object : TypeToken<RefreshOidcTokenResponse>() {})
    }

    /**
     * 注册
     */
    fun register(param: RegisterParam): Call<RegisterResponse> {
        param.userInfo = param.userInfo ?: UserRegisterInput()
        param.userInfo!!.registerInClient = userPoolId
        param.userInfo!!.password = encrypt(param.userInfo!!.password)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<RegisterResponse>>() {})
    }

    /**
     * 刷新用户 Token
     */
    fun refreshToken(param: RefreshTokenParam): Call<RefreshTokenResponse> {
        param.client = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<RefreshTokenResponse>>() {})
    }

    /**
     * 查询用户信息
     */
    fun user(param: UserParam): Call<UserResponse> {
        param.registerInClient = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UserResponse>>() {})
    }

    /**
     * 更新用户信息
     *
     * 用户池管理员可以通过此接口直接更新用户手机号
     */
    fun updateUser(param: UpdateUserParam): Call<UpdateUserResponse> {
        param.options = param.options ?: UserUpdateInput()
        param.options!!.registerInClient = userPoolId
        param.options!!.password = encrypt(param.options!!.password)
        param.options!!.oldPassword = encrypt(param.options!!.oldPassword)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdateUserResponse>>() {})
    }

    /**
     * 更新用户手机号
     *
     * 普通用户需要在登录后使用，管理员请调用 updateUser 接口
     */
    fun updatePhone(param: UpdatePhoneParam): Call<UpdatePhoneResponse> {
        param.userPoolId = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UpdatePhoneResponse>>() {})
    }

    /**
     * 通过 Token 检查用户登录状态
     */
    fun checkLoginStatus(param: CheckLoginStatusParam): Call<CheckLoginStatusResponse> {
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<CheckLoginStatusResponse>>() {})
    }

    /**
     * 重置密码
     *
     * 需要先发送重置密码邮件来得到验证码
     */
    fun resetPassword(param: ResetPasswordParam): Call<ResetPasswordResponse> {
        param.clientId = userPoolId
        param.password = encrypt(param.password)

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<ResetPasswordResponse>>() {})
    }

    /**
     * 解绑定邮箱
     *
     * 需要已经绑定了其他登录方式
     */
    fun unbindEmail(param: UnbindEmailParam): Call<UnbindEmailResponse> {
        param.client = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UnbindEmailResponse>>() {})
    }

    /**
     * 读取用户 OAuth 授权列表
     */
    fun readOauthList(param: ReadOauthListParam): Call<ReadOauthListResponse> {
        param.clientId = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<ReadOauthListResponse>>() {})
    }

    /**
     * 发送验证邮件，邮件内包含认证链接
     */
    fun sendVerifyEmail(param: SendVerifyEmailParam): Call<SendVerifyEmailResponse> {
        param.client = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<SendVerifyEmailResponse>>() {})
    }

    /**
     * 发送手机验证码
     */
    fun sendPhoneVerifyCode(phone: String): Call<SendPhoneVerifyCodeResponse> {
        val url = "$host/send_smscode/$phone/$userPoolId"

        return createHttpGetCall(url, object : TypeToken<SendPhoneVerifyCodeResponse>() {})
    }

    /**
     * 发送重置密码邮件，邮件内包含验证码
     */
    fun sendResetPasswordEmail(param: SendResetPasswordEmailParam): Call<SendResetPasswordEmailResponse> {
        param.client = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<SendResetPasswordEmailResponse>>() {})
    }

    /**
     * 验证重置密码邮件
     */
    fun verifyResetPasswordCode(param: VerifyResetPasswordVerifyCodeParam): Call<VerifyResetPasswordVerifyCodeResponse> {
        param.client = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<VerifyResetPasswordVerifyCodeResponse>>() {})
    }

    /**
     * 通过 ID 列表批量获取用户信息
     *
     * 多个 ID 以英文逗号分隔，如：id1,id2,id3
     */
    fun userPatch(param: UserPatchParam): Call<UserPatchResponse> {
        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UserPatchResponse>>() {})
    }

    /**
     * 通过分页批量获取用户池中的用户信息
     */
    fun users(param: UsersParam): Call<UsersResponse> {
        param.registerInClient = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<UsersResponse>>() {})
    }

    /**
     * 通过 ID 列表批量删除用户
     *
     * 多个 ID 以英文逗号分隔，如：id1,id2,id3
     */
    fun removeUsers(param: RemoveUsersParam): Call<RemoveUsersResponse> {
        param.registerInClient = userPoolId

        return createGraphQLCall(param.createRequest(), object : TypeToken<GraphQLResponse<RemoveUsersResponse>>() {})
    }
}
