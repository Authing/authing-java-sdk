package cn.authing.core.graphql

import com.google.gson.GsonBuilder
import com.google.gson.TypeAdapter
import com.google.gson.reflect.TypeToken
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class GraphQLCall<TData, TResult>(
    private val call: Call,
    private val adapter: TypeAdapter<GraphQLResponse<TData>>,
    private val resolver: (data: TData) -> TResult
) : cn.authing.core.http.Call<TData, TResult> {
    /**
     * Gson 对象，用来序列化 Json
     */
    private val gson = GsonBuilder().create()

    /**
     * 开始同步请求
     */
    @Throws(IOException::class, GraphQLException::class)
    override fun execute(): TResult {
        // 开始同步请求
        val response: Response = call.execute()

        // 处理返回数据
        if (response.isSuccessful) {
            val body = response.body?.string()
            val graphQLResponse: GraphQLResponse<TData> = adapter.fromJson(body)
            if (graphQLResponse.errors != null && graphQLResponse.errors.isNotEmpty()) {
                throw GraphQLException(gson.toJson(graphQLResponse.errors))
            }
            return resolver(graphQLResponse.data!!)
        } else {
            throw IOException("${response.code}: ${response.message}\n${response.body?.string()}")
        }
    }

    /**
     * 开始异步请求
     */
    override fun enqueue(callback: cn.authing.core.http.Callback<TResult>) {
        // 创建一个 wrapper，处理返回的原始数据
        val callbackWrapper: Callback = object : Callback {
            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    val graphQLResponse: GraphQLResponse<TData> = adapter.fromJson(response.body?.string())
                    if (graphQLResponse.errors != null && graphQLResponse.errors.isNotEmpty()) {
                        val firstError = graphQLResponse.errors[0].message
                        callback.onFailure(GraphQLResponse.ErrorInfo(firstError?.code ?: 500, firstError?.message))
                    }
                    callback.onSuccess(resolver(graphQLResponse.data!!))
                } else {
                    throw IOException("Unexpected code $response")
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
        return call.cancel();
    }

    override fun isCanceled(): Boolean {
        return call.isCanceled()
    }

    override fun request(): Request? {
        return call.request()
    }

}