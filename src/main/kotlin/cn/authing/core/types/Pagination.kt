package cn.authing.core.types

class Pagination<T>(
    var list: List<T>,
    var totalCount: Int
)

data class PageOptions
@JvmOverloads
constructor(
    var page: Int? = 1,
    var limit: Int? = 10
)
