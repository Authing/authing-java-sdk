package cn.authing.core

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLRequest
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.AuthMethodEnum
import cn.authing.core.types.ProtocolEnum
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.TypeAdapterFactory
import com.google.gson.internal.bind.ObjectTypeAdapter
import com.google.gson.reflect.TypeToken
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import java.lang.reflect.Field
import java.security.KeyFactory
import java.security.SecureRandom
import java.security.cert.X509Certificate
import java.security.spec.X509EncodedKeySpec
import java.util.*
import java.util.concurrent.TimeUnit
import javax.crypto.Cipher
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager
import javax.security.cert.CertificateException


/**
 * Authing 客户端类
 */
abstract class BaseClient {

    init {
        System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2")
    }

    // 可选参数
    var host: String = "https://core.authing.cn"
    var publicKey: String = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC4xKeUgQ+Aoz7TLfAfs9+paePb" +
            "5KIofVthEopwrXFkp8OCeocaTHt9ICjTT2QeJh6cZaDaArfZ873GPUn00eOIZ7Ae" +
            "+TiA2BKHbCvloW3w5Lnqm70iSsUi5Fmu9/2+68GZRH9L7Mlh8cFksCicW2Y2W2uM" +
            "GKl64GDcIq3au+aqJQIDAQAB"

    var userPoolId: String? = null
    /**
     * 每次发出请求时会附加在请求头的 token
     *
     * 访问某些需要权限的接口则必须设置此变量
     */
    var token: String? = null
    /**
     * token 过期时间
     */
    var accessTokenExpiresAt: Long? = null

    /**
     * 应用 Id
     */
    var appId: String? = ""

    //应用密钥
    var secret: String? = ""
    //应用身份协议
    var protocol: ProtocolEnum? = ProtocolEnum.OIDC
    //获取 token 端点认证方式
    var tokenEndPointAuthMethod: AuthMethodEnum? = AuthMethodEnum.CLIENT_SECRET_POST
    //检查 token 端点认证方式
    var introspectionEndPointAuthMethod: AuthMethodEnum? = AuthMethodEnum.CLIENT_SECRET_POST
    //撤回 token 端点认证方式
    var revocationEndPointAuthMethod: AuthMethodEnum? = AuthMethodEnum.CLIENT_SECRET_POST

    //应用回调地址
    var redirectUri: String? = ""
    //Websocket 服务器域名
    var websocketHost: String? = ""

    var skipHttpsApprove = false;
    var connectTimeOut = 10000L;
    var readTimeOut = 10000L;

    // 常量
    protected val mediaTypeJson: MediaType? = "application/json".toMediaTypeOrNull()
    protected val mediaTypeUrlencoded: MediaType? = "application/x-www-form-urlencoded".toMediaTypeOrNull()
    protected val sdkType: String = "SDK"
    protected val sdkVersion: String = "java:4.3.45"

    // graphql 端点
    private val endpoint: String
        get() {
            return "$host/graphql/v2"
        }

    protected var okHttpClient: OkHttpClient = OkHttpClient()
    //protected val json = GsonBuilder().create()

    protected  val json : Gson = getGson()

    open fun getGson(): Gson {
        val gson: Gson = GsonBuilder().create()
        try {
            val factories: Field = Gson::class.java.getDeclaredField("factories")
            factories.setAccessible(true)
            val o: Any = factories.get(gson)
            val declaredClasses = Collections::class.java.declaredClasses
            for (c in declaredClasses) {
                if ("java.util.Collections\$UnmodifiableList" == c.name) {
                    val listField: Field = c.getDeclaredField("list")
                    listField.setAccessible(true)
                    val list: MutableList<TypeAdapterFactory> = listField.get(o) as MutableList<TypeAdapterFactory>
                    val i = list.indexOf(ObjectTypeAdapter.FACTORY)
                    list[i] = CustomTypeAdapter.FACTORY
                    break
                }
            }
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        return gson
    }

    private val unsafeOkHttpClient: OkHttpClient
        // Install the all-trusting trust manager
        // Create an ssl socket factory with our all-trusting manager
        private get() = try {
            // Create a trust manager that does not validate certificate chains
            val trustAllCerts = arrayOf<TrustManager>(
                object : X509TrustManager {
                    @Throws(CertificateException::class)
                    override fun checkClientTrusted(
                        chain: Array<X509Certificate>,
                        authType: String
                    ) {
                    }

                    @Throws(CertificateException::class)
                    override fun checkServerTrusted(
                        chain: Array<X509Certificate>,
                        authType: String
                    ) {
                    }

                    override fun getAcceptedIssuers(): Array<X509Certificate> {
                        return arrayOf()
                    }
                }
            )

            // Install the all-trusting trust manager
            val sslContext = SSLContext.getInstance("SSL")
            sslContext.init(null, trustAllCerts, SecureRandom())
            // Create an ssl socket factory with our all-trusting manager
            val sslSocketFactory = sslContext.socketFactory
            val builder = OkHttpClient.Builder()
            var trustManager = trustAllCerts[0] as X509TrustManager;
            builder.sslSocketFactory(sslSocketFactory,trustManager)
            builder.hostnameVerifier(HostnameVerifier { hostname, session -> true })
            builder.connectTimeout(connectTimeOut, TimeUnit.MILLISECONDS).readTimeout(readTimeOut, TimeUnit.MILLISECONDS)
            builder.build()
        } catch (e: Exception) {
            throw RuntimeException(e)
        }

    open fun setClientTimeOut(connectTimeOut: Long, readTimeOut: Long) {
        this.connectTimeOut = connectTimeOut;
        this.readTimeOut = readTimeOut;
        var okHttp = OkHttpClient.Builder().connectTimeout(connectTimeOut, TimeUnit.MILLISECONDS).readTimeout(readTimeOut, TimeUnit.MILLISECONDS).build()
        this.okHttpClient = okHttp
    }

    open fun setSkipCheckHttps(skipHttpsApprove: Boolean) {
        if (skipHttpsApprove) {
            this.okHttpClient = unsafeOkHttpClient
        } else {
            var okHttp = OkHttpClient.Builder().connectTimeout(this.connectTimeOut, TimeUnit.MILLISECONDS).readTimeout(this.readTimeOut, TimeUnit.MILLISECONDS).build()
            this.okHttpClient = okHttp
        }
    }

    /**
     * 密码加密方法
     */
    internal open fun encrypt(msg: String?): String {
        if (msg === null) {
            return ""
        }

        // get publicKey
        val keyBytes: ByteArray = Base64.getDecoder().decode(publicKey)
        val keySpec = X509EncodedKeySpec(keyBytes)
        val keyFactory = KeyFactory.getInstance("RSA")
        val publicKey = keyFactory.generatePublic(keySpec)
        val cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding")
        cipher.init(Cipher.ENCRYPT_MODE, publicKey)
        val cipherMsg = cipher.doFinal(msg.toByteArray())

        return String(Base64.getEncoder().encode(cipherMsg))
    }

    /**
     * 创建 GraphQL 请求
     */
    internal open fun <TData, TResult> createGraphQLCall(
        request: GraphQLRequest,
        typeToken: TypeToken<GraphQLResponse<TData>>,
        resolver: (data: TData) -> TResult
    ): GraphQLCall<TData, TResult> {
        val adapter = json.getAdapter(typeToken)
        return GraphQLCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(endpoint)
                    .addHeader("Authorization", "Bearer " + this.token)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("x-authing-userpool-id", "" + userPoolId)
                    .addHeader("x-authing-request-from", sdkType)
                    .addHeader("x-authing-sdk-version", sdkVersion)
                    .addHeader("x-authing-app-id", "" + this.appId)
                    .post(json.toJson(request).toRequestBody(mediaTypeJson))
                    .build()
            ), adapter, resolver
        )
    }

    /**
     * 创建 HTTP GET 请求
     */
    internal open fun <TData, TResult> createHttpGetCall(
        url: String,
        typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        val adapter = json.getAdapter(typeToken)
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(url)
                    .addHeader("Authorization", "Bearer " + this.token)
                    .addHeader("x-authing-userpool-id", "" + userPoolId)
                    .addHeader("x-authing-request-from", sdkType)
                    .addHeader("x-authing-sdk-version", sdkVersion)
                    .addHeader("x-authing-app-id", "" + this.appId)
                    .get()
                    .build()
            ), adapter, resolver
        )
    }


    /**
     * 创建 HTTP POST 请求
     */
    internal open fun <TData, TResult> createHttpPostCall(
        url: String,
        body: String,
        typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        val adapter = json.getAdapter(typeToken)
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(url)
                    .addHeader("Authorization", "Bearer " + this.token)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("x-authing-userpool-id", "" + userPoolId)
                    .addHeader("x-authing-request-from", sdkType)
                    .addHeader("x-authing-sdk-version", sdkVersion)
                    .addHeader("x-authing-app-id", "" + this.appId)
                    .post(body.toRequestBody(mediaTypeJson))
                    .build()
            ), adapter, resolver
        )
    }

    /**
     * 创建 HTTP DELETE 请求
     */
    internal open fun <TData, TResult> createHttpDeleteCall(
        url: String, typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        val adapter = json.getAdapter(typeToken)
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(url)
                    .addHeader("Authorization", "Bearer " + this.token)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("x-authing-userpool-id", "" + userPoolId)
                    .addHeader("x-authing-request-from", sdkType)
                    .addHeader("x-authing-sdk-version", sdkVersion)
                    .addHeader("x-authing-app-id", "" + this.appId)
                    .delete()
                    .build()
            ), adapter, resolver
        )
    }


    /**
     * 创建 HTTP Patch 请求
     */
    internal open fun <TData, TResult> createHttpPatchCall(
        url: String,
        body: String,
        typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        val adapter = json.getAdapter(typeToken)
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(url)
                    .addHeader("Authorization", "Bearer " + this.token)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("x-authing-userpool-id", "" + userPoolId)
                    .addHeader("x-authing-request-from", sdkType)
                    .addHeader("x-authing-sdk-version", sdkVersion)
                    .addHeader("x-authing-app-id", "" + this.appId)
                    .patch(body.toRequestBody(mediaTypeJson))
                    .build()
            ), adapter, resolver
        )
    }

    /**
     * PUT
     */
    internal open fun <TData, TResult> createHttpPutCall(
        url: String,
        body: String,
        typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        val adapter = json.getAdapter(typeToken)
        return HttpCall(
            okHttpClient.newCall(
                Request.Builder()
                    .url(url)
                    .addHeader("Authorization", "Bearer " + this.token)
                    .addHeader("Content-Type", "application/json")
                    .addHeader("x-authing-userpool-id", "" + userPoolId)
                    .addHeader("x-authing-request-from", sdkType)
                    .addHeader("x-authing-sdk-version", sdkVersion)
                    .addHeader("x-authing-app-id", "" + this.appId)
                    .put(body.toRequestBody(mediaTypeJson))
                    .build()
            ), adapter, resolver
        )
    }
}
