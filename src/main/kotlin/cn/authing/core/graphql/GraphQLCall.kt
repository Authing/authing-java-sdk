package cn.authing.core.graphql

import com.google.gson.GsonBuilder
import com.google.gson.TypeAdapter
import com.google.gson.reflect.TypeToken
import okhttp3.Call
import okhttp3.Callback
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class GraphQLCall<T>(private val call: Call, private val adapter: TypeAdapter<GraphQLResponse<T>>) : cn.authing.core.http.Call<T> {
    /**
     * Gson 对象，用来序列化 Json
     */
    private val gson = GsonBuilder().create()

    /**
     * 开始同步请求
     */
    @Throws(IOException::class, GraphQLException::class)
    override fun execute(): T? {
        // 开始同步请求
        val response: Response = call.execute()

        // 处理返回数据
        if (response.isSuccessful) {
            val body = response.body?.string()
            val graphQLResponse: GraphQLResponse<T> = adapter.fromJson(body)
            if (graphQLResponse.errors != null && graphQLResponse.errors.size > 0) {
                throw GraphQLException(gson.toJson(graphQLResponse.errors))
            }
            return graphQLResponse.data;
        } else {
            throw IOException("Unexpected code ${response}")
        }
    }

    /**
     * 开始异步请求
     */
    override fun enqueue(callback: cn.authing.core.http.Callback<T>) {
        // 创建一个 wrapper，处理返回的原始数据
        val callbackWrapper: Callback = object : Callback {
            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful) {
                    val graphQLResponse: GraphQLResponse<T> = adapter.fromJson(response.body?.string())
                    if (graphQLResponse.errors?.size!! > 0) {
                        val firstError = graphQLResponse.errors[0].message
                        callback.onFailure(GraphQLResponse.ErrorInfo(firstError?.code ?: 500, firstError?.message))
                    }
                    callback.onSuccess(graphQLResponse.data)
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