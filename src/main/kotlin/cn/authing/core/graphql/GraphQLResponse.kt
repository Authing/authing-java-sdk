package cn.authing.core.graphql

class GraphQLResponse<T>(val data: T? = null, val errors: List<ResponseError>? = null) {
    class ResponseError(val message: ErrorInfo? = null) {}
    class ErrorInfo(val code: Int = 0, val message: String? = null , val data: Any? = null) {}
}