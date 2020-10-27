package cn.authing.core.types

class RestfulResponse<T>(
    val code: Int,
    val message: String,
    val data: T
)