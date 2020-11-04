package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * 管理注册白名单
 */
class WhitelistManagementClient(private val client: ManagementClient) {

    /**
     * 获取白名单记录
     */
    fun list(type: WhitelistType): GraphQLCall<WhitelistResponse, List<WhiteList>> {
        val param = WhitelistParam(type)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<WhitelistResponse>>() {}) {
            it.result
        }
    }
}