package cn.authing.core.http

import okhttp3.Request
import java.io.IOException

interface Call<T> {
    @Throws(IOException::class)
    fun execute(): T?
    fun enqueue(callback: Callback<T>)
    fun isExecuted(): Boolean
    fun cancel()
    fun isCanceled(): Boolean
    fun request(): Request?
}