package cn.authing.core.http

import okhttp3.Request
import java.io.IOException

interface Call<TData, TResult> {
    @Throws(IOException::class)
    fun execute(): TResult
    fun enqueue(callback: Callback<TResult>)
    fun isExecuted(): Boolean
    fun cancel()
    fun isCanceled(): Boolean
    fun request(): Request?
}