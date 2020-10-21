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
    @JvmOverloads
    fun allow(
        resource: String,
        action: String,
        userId: String? = null,
        role: String? = null
    ): GraphQLCall<AllowResponse, CommonMessage> {
        val param = AllowParam(resource, action).withUserId(userId).withRoleCode(role)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AllowResponse>>() {}) {
            it.result
        }
    }

    /**
     * 是否允许某用户操作某资源
     */
    fun isAllowed(userId: String, resource: String, action: String): GraphQLCall<IsActionAllowedResponse, Boolean> {
        val param = IsActionAllowedParam(resource, action, userId)

        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<IsActionAllowedResponse>>() {}) {
            it.result
        }
    }
}