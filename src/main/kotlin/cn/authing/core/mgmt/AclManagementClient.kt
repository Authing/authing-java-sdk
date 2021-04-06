package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.GsonBuilder
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

    /**
     * 获取资源
     */
    @JvmOverloads
    fun getResources(
        namespaceCode: String? = null,
        type: ResourceType? = null,
        limit: Number? = 10,
        page: Number? = 1
    ): HttpCall<RestfulResponse<Pagination<IResourceResponse>>, Pagination<IResourceResponse>> {
        var url = "${client.host}/api/v2/resources?limit=$limit&page=$page"

        url += if (namespaceCode != null) "&namespaceCode=${namespaceCode}" else ""
        url += if (type != null) "&type=${type}" else ""

        println(url)
        return this.client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Pagination<IResourceResponse>>>() {}) { it.data }

    }

    /**
     * 创建资源
     */
    fun createResource(options: IResourceDto): HttpCall<RestfulResponse<IResourceResponse>, IResourceResponse> {

        return this.client.createHttpPostCall(
            "${client.host}/api/v2/resources",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<IResourceResponse>>() {}) { it.data }
    }

    /**
     * 更新资源
     */
    fun updateResource(
        code: String,
        options: IResourceDto
    ): HttpCall<RestfulResponse<IResourceResponse>, IResourceResponse> {

        return this.client.createHttpPostCall(
            "${client.host}/api/v2/resources/$code",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<IResourceResponse>>() {}) { it.data }
    }

    /**
     * 删除资源
     */
    fun deleteResource(code: String, namespaceCode: String): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return this.client.createHttpDeleteCall(
            "${client.host}/api/v2/resources/$code?namespaceCode=$namespaceCode",
            object : TypeToken<RestfulResponse<Boolean>>() {}) { it.code == 200 }
    }
}