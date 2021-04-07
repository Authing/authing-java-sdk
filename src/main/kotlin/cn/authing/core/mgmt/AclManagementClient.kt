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

    /**
     * 获取应用访问控制策略
     */
    fun getApplicationAccessPolicies(options: IAppAccessPolicyQueryFilter):
            HttpCall<RestfulResponse<Pagination<IApplicationAccessPolicies>>, Pagination<IApplicationAccessPolicies>> {
        val url =
            "${client.host}/api/v2/applications/${options.appId}/authorization/records?limit=${options.limit}&page=${options.page}"

        return this.client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Pagination<IApplicationAccessPolicies>>>() {}) { it.data }
    }

    /**
     * 启用应用访问控制策略
     */
    fun enableApplicationAccessPolicy(options: IAppAccessPolicy): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url =
            "${client.host}/api/v2/applications/${options.appId}/authorization/enable-effect"

        return this.client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}) { it.code == 200 }
    }

    /**
     * 停用应用访问控制策略
     */
    fun disableApplicationAccessPolicy(options: IAppAccessPolicy): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url =
            "${client.host}/api/v2/applications/${options.appId}/authorization/disable-effect"

        return this.client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}) { it.code == 200 }
    }

    /**
     * 删除应用访问控制策略
     */
    fun deleteApplicationAccessPolicy(options: IAppAccessPolicy): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url =
            "${client.host}/api/v2/applications/${options.appId}/authorization/revoke"

        return this.client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}) { it.code == 200 }
    }

    /**
     * 配置「允许主体（用户、角色、分组、组织机构节点）访问应用」的控制策略
     */
    fun allowAccessApplication(options: IAppAccessPolicy): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "${client.host}/api/v2/applications/${options.appId}/authorization/allow"

        return this.client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}) { it.code == 200 }

    }

    /**
     * 配置「拒绝主体（用户、角色、分组、组织机构节点）访问应用」的控制策略
     */
    fun denyAccessApplication(options: IAppAccessPolicy): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "${client.host}/api/v2/applications/${options.appId}/authorization/deny"

        return this.client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}) { it.code == 200 }

    }

    /**
     * 更改默认应用访问策略（默认拒绝所有用户访问应用、默认允许所有用户访问应用）
     */
    fun updateDefaultApplicationAccessPolicy(options: IDefaultAppAccessPolicy): HttpCall<RestfulResponse<Application>, Application> {
        val url = "${client.host}/api/v2/applications/${options.appId}"

        return this.client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<Application>>() {}){ it.data }

    }
}