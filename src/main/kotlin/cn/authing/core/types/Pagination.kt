package cn.authing.core.types

class Pagination<T>(
    val list: List<T>,
    val totalCount: Int
)

data class PageOptions
@JvmOverloads
constructor(
    val page: Int? = 1,
    val limit: Int? = 10
)
