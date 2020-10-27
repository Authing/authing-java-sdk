package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * 用户池管理类
 */
class UserpoolManagementClient(private val client: ManagementClient) {
    /**
     * 查询用户池配置
     */
    fun detail(): GraphQLCall<UserpoolResponse, UserPool> {
        val param = UserpoolParam()
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UserpoolResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新用户池配置
     */
    fun update(updates: UpdateUserpoolInput): GraphQLCall<UpdateUserpoolResponse, UserPool> {
        val param = UpdateUserpoolParam(updates)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdateUserpoolResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取环境变量列表
     */
    fun listEnv(): HttpCall<RestfulResponse<List<Env>>, List<Env>> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/env",
            object : TypeToken<RestfulResponse<List<Env>>>() {}) {
            it.data
        }
    }

    /**
     * 添加环境变量
     */
    fun addEnv(key: String, value: Any): HttpCall<RestfulResponse<Env>, Env> {
        val json = Gson()
        val data = "{\"key\": \"$key\", \"value\": ${json.toJson(value)}}"
        return client.createHttpPostCall(
            "${client.host}/api/v2/env",
            data,
            object : TypeToken<RestfulResponse<Env>>() {}) {
            it.data
        }
    }

    /**
     * 移除环境变量
     */
    fun removeEnv(key: String): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpDeleteCall("${client.host}/api/v2/env/$key", object : TypeToken<CommonMessage>() {}) {
            it
        }
    }
}