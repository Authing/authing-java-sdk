package cn.authing.core.types

import com.google.gson.annotations.SerializedName

class LoginByOidcParam(
        var appId: String,
        var appSecret: String,
        var email: String,
        var password: String
) {
    fun appId(appId: String): LoginByOidcParam {
        this.appId = appId
        return this
    }

    fun appSecret(appSecret: String): LoginByOidcParam {
        this.appSecret = appSecret
        return this
    }

    fun email(email: String): LoginByOidcParam {
        this.email = email
        return this
    }

    fun password(password: String): LoginByOidcParam {
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
        val expiresIn: Int? = null
)
