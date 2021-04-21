package cn.authing.core.types

data class UnLinkAccountParam(
    var primaryUserToken: String,
    var provider: ProviderType
)

enum class ResponseMode(val label: String) {
    QUERY("query"),
    FRAGMENT("fragment"),
    FORM_POST("form_post");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): SortByEnum? {
            return SortByEnum.values().find { it.label == label }
        }
    }
}

data class IOidcParams
@JvmOverloads
constructor(
    var appId: String? = null,
    var redirectUri: String? = null,
    /**
     * 'code' 'code id_token token' 'code id_token' 'code token' 'id_token token' 'id_token' 'none'
     */
    var responseType: String? = null,
    var responseMode: ResponseMode? = null,
    var state: String? = null,
    var nonce: String? = null,
    var scope: String? = null
)

data class IOauthParams
@JvmOverloads
constructor(
    var appId: String? = null,
    var redirectUri: String? = null,
    /**
     * 'code' | 'token'
     */
    var responseType: String? = null,
    var state: String? = null,
    var scope: String? = null
)

data class ICasParams
@JvmOverloads
constructor(
    var service: String? = null
)

data class ValidateTokenParams
@JvmOverloads
constructor(
    var accessToken: String? = null,
    var idToken: String? = null
)

data class ILogoutParams
@JvmOverloads
constructor(
    var expert: String? = null,
    var redirectUri: String? = null,
    var idToken: String? = null
)