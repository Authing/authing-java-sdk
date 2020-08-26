package cn.authing.core.types

import com.google.gson.annotations.SerializedName

class LoginByOidcParam(
    var appId: String,
    var appSecret: String,
    var email: String?,
    var phone: String?,
    var username: String?,
    var password: String?
) {
    constructor(appId: String, appSecret: String) : this(appId, appSecret, null, null, null, null)

    fun appId(appId: String): LoginByOidcParam {
        this.appId = appId
        return this
    }

    fun appSecret(appSecret: String): LoginByOidcParam {
        this.appSecret = appSecret
        return this
    }

    fun initWithEmail(email: String, password: String): LoginByOidcParam {
        this.email = email
        this.password = password
        return this
    }

    fun initWithPhone(phone: String, password: String): LoginByOidcParam {
        this.phone = phone
        this.password = password
        return this
    }

    fun initWithUsername(username: String, password: String): LoginByOidcParam {
        this.username = username
        this.password = password
        return this
    }

    fun build(): LoginByOidcParam {
        return this
    }
}

data class LoginByOidcResponse(
    @SerializedName("access_token")
    val accessToken: String? = null,
    @SerializedName("id_token")
    val idToken: String? = null,
    @SerializedName("refresh_token")
    val refreshToken: String? = null,
    @SerializedName("expires_in")
    val expiresIn: Int? = null,
    @SerializedName("scope")
    val scope: String? = null
)
