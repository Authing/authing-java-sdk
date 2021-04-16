package cn.authing.core.types

data class UnLinkAccountParam(
    val primaryUserToken: String,
    val provider: ProviderType
)