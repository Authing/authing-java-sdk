package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

/**
 * 权限控制类
 */
class AclManagementClient(private val client: ManagementClient) {
    /**
     * 允许某用户操作某资源
     */
    fun allow(param: AllowParam): GraphQLCall<AllowResponse, CommonMessage> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AllowResponse>>() {}) {
            it.result
        }
    }

    /**
     * 是否允许某用户操作某资源
     */
    fun isAllowed(param: IsActionAllowedParam): GraphQLCall<IsActionAllowedResponse, Boolean> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<IsActionAllowedResponse>>() {}) {
            it.result
        }
    }
}