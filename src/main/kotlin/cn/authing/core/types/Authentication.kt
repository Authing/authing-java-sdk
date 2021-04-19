package cn.authing.core.types

data class UnLinkAccountParam(
    var primaryUserToken: String,
    var provider: ProviderType
)