package cn.authing.core.types

import com.google.gson.annotations.SerializedName

class LoginByOidcParam(
        var clientId: String? = null,
        var secret: String? = null,
        var username: String? = null,
        var password: String? = null,
        var phone: String? = null,
        var email: String? = null
) {
    val params: Map<String, String> = HashMap<String, String>()

    fun clientId(clientId: String?): LoginByOidcParam {
        this.clientId = clientId
        return this
    }

    fun secret(secret: String?): LoginByOidcParam {
        this.secret = secret
        return this
    }

    fun username(username: String?): LoginByOidcParam {
        this.username = username
        return this
    }

    fun password(password: String?): LoginByOidcParam {
        this.password = password
        return this
    }

    fun phone(phone: String?): LoginByOidcParam {
        this.phone = phone
        return this
    }

    fun email(email: String?): LoginByOidcParam {
        this.email = email
        return this
    }

    fun build(): LoginByOidcParam {
        return this
    }
}

data class LoginByOidcResponse(
        @SerializedName("sub")
        val sub: String? = null,
        @SerializedName("birthdate")
        val birthdate: String? = null,
        @SerializedName("family_name")
        val familyName: String? = null,
        @SerializedName("gender")
        val gender: String? = null,
        @SerializedName("given_name")
        val givenName: String? = null,
        @SerializedName("locale")
        val locale: String? = null,
        @SerializedName("middle_name")
        val middleName: String? = null,
        @SerializedName("preferred_username")
        val preferredUsername: String? = null,
        @SerializedName("updated_at")
        val updatedAt: String? = null,
        @SerializedName("logins_count")
        val loginsCount: Int? = null,
        @SerializedName("register_method")
        val registerMethod: String? = null,
        @SerializedName("last_ip")
        val lastIp: String? = null,
        @SerializedName("register_in_userpool")
        val registerInUserpool: String? = null,
        @SerializedName("last_login")
        val lastLogin: String? = null,
        @SerializedName("signed_up")
        val signedUp: String? = null,
        @SerializedName("email_verified")
        val isEmailVerified: Boolean? = null,
        @SerializedName("phone_number")
        val phoneNumber: String? = null,
        @SerializedName("phone_number_verified")
        val isPhoneNumberVerified: Boolean? = null,
        @SerializedName("access_token")
        val accessToken: String? = null,
        @SerializedName("id_token")
        val idToken: String? = null,
        @SerializedName("refresh_token")
        val refreshToken: String? = null,
        @SerializedName("expires_in")
        val expiresIn: Int? = null,
        @SerializedName("token_type")
        val tokenType: String? = null,
        @SerializedName("name")
        val name: String? = null,
        @SerializedName("nickname")
        val nickname: String? = null,
        @SerializedName("picture")
        val picture: String? = null,
        @SerializedName("profile")
        val profile: String? = null,
        @SerializedName("website")
        val website: String? = null,
        @SerializedName("zoneinfo")
        val zoneinfo: String? = null,
        @SerializedName("username")
        val username: String? = null,
        @SerializedName("_id")
        val id: String? = null,
        @SerializedName("company")
        val company: String? = null,
        @SerializedName("browser")
        val browser: String? = null,
        @SerializedName("device")
        val device: String? = null,
        @SerializedName("blocked")
        val blocked: Boolean? = null,
        @SerializedName("email")
        val email: String? = null,
        @SerializedName("token")
        val token: String? = null,
        @SerializedName("scope")
        val scope: String? = null
)
