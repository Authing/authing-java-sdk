package cn.authing.core.types

class IHasRoleParam
@JvmOverloads
constructor(
    val userId: String,
    val roleCode: String,
    val namespace: String? = null
)