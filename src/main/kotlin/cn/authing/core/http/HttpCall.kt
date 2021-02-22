package cn.authing.core.http

import cn.authing.core.graphql.GraphQLResponse
import com.google.gson.GsonBuilder
import com.google.gson.TypeAdapter
import okhttp3.Call
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class HttpCall<TData, TResult>(
    private val call: Call,
    private val adapter: TypeAdapter<TData>,
    private val resolver: (data: TData) -> TResult
) :
    cn.authing.core.http.Call<TData, TResult> {
    /**
     * Gson 对象，用来序列化 Json
     */
    private val gson = GsonBuilder().create()

    /**
     * 开始同步请求
     */
    @Throws(IOException::class)
    override fun execute(): TResult {
        // 开始同步请求
        val response: Response = call.execute()

        // 处理返回数据
        if (response.isSuccessful) {
            val body = response.body?.string()
            val data = adapter.fromJson(body)
            return resolver(data)
        } else {
            throw IOException("Unexpected code $response\n${response.body?.string()}")
        }
    }

    /**
     * 开始异步请求
     */
    override fun enqueue(callback: Callback<TResult>) {
        // 创建一个 wrapper，处理返回的原始数据
        val callbackWrapper: okhttp3.Callback = object : okhttp3.Callback {
            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    val data = adapter.fromJson(response.body?.string())
                    callback.onSuccess(resolver(data))
                } else {
                    throw IOException("Unexpected code $response\n${response.body?.string()}")
                }
            }

            override fun onFailure(call: okhttp3.Call, e: IOException) {
                callback.onFailure(GraphQLResponse.ErrorInfo(500, e.message))
            }
        }
        // 开始异步请求
        call.enqueue(callbackWrapper);
    }

    override fun isExecuted(): Boolean {
        return call.isExecuted()
    }

    override fun cancel() {
        return call.cancel()
    }

    override fun isCanceled(): Boolean {
        return call.isCanceled()
    }

    override fun request(): Request? {
        return call.request()
    }

}