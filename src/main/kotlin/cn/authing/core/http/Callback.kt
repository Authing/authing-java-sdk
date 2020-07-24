package cn.authing.core.http

import cn.authing.core.graphql.GraphQLResponse.ErrorInfo

interface Callback<T> {
    fun onSuccess(result: T?)
    fun onFailure(error: ErrorInfo?)
}