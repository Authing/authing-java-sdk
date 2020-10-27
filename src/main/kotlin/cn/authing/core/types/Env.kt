package cn.authing.core.types

data class Env(
    var id: String,
    var userPoolId: String,
    var key: String,
    var value: Any,
    var createdAt: String,
    var updatedAt: String
)
