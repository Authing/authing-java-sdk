package cn.authing.core.types

class IHasRoleParam
@JvmOverloads
constructor(
    var userId: String,
    var roleCode: String,
    var namespace: String? = null
)