package cn.authing.core.types

class OidcUserParam (
    var accessToken: String
) {
    fun build(): OidcUserParam {
        return this
    }
}
