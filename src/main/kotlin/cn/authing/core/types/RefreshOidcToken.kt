package cn.authing.core.types

import com.google.gson.annotations.SerializedName

class RefreshOidcTokenParam(
    var appId: String,
    var appSecret: String,
    var refreshToken: String
) {
    fun appId(appId: String): RefreshOidcTokenParam {
        this.appId = appId
        return this
    }

    fun appSecret(appSecret: String): RefreshOidcTokenParam {
        this.appSecret = appSecret
        return this
    }

    fun refreshToken(refreshToken: String): RefreshOidcTokenParam {
        this.refreshToken = refreshToken
        return this
    }

    fun build(): RefreshOidcTokenParam {
        return this
    }
}

data class RefreshOidcTokenResponse(
    @SerializedName("access_token")
    val accessToken: String? = null,
    @SerializedName("id_token")
    val idToken: String? = null,
    @SerializedName("refresh_token")
    val refreshToken: String? = null,
    @SerializedName("expires_in")
    val expiresIn: Int? = null
)
