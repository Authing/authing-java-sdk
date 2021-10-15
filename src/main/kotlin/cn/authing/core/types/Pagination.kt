package cn.authing.core.types

class Pagination<T>(
    var list: List<T>,
    var totalCount: Int,
    /*
        兼容部分接口返回的不是 totalAmount，而
     */
    var total: Int
)

data class PageOptions
@JvmOverloads
constructor(
    var page: Int? = 1,
    var limit: Int? = 10
)
