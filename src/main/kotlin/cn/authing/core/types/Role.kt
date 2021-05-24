package cn.authing.core.types

data class SetUdfValueParams(
    var targetType: UdfTargetType,
    var key: String,
    var value: String
)

data class RoleSetUdfValueBatchParams(
    var roleCode: String,
    var data: Map<String, String>
)