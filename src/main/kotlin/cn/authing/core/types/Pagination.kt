package cn.authing.core.types

class Pagination<T>(
    val list: List<T>,
    val totalCount: Number
)

abstract class PaginationQuery(
    val page: Number? = 1,
    val limit: Number? = 10
)