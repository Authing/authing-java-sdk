package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlin.random.Random

/**
 * 权限控制类
 */
class AclManagementClient(private val client: ManagementClient) {

    private fun randomString(randomLength: Number): String {
        val template = "abcdefhijkmnprstwxyz2345678".toCharArray()


        var returnValue = "";

        for (item in 1..randomLength as Int)
            returnValue += template[Random.nextInt(template.size)]

        return returnValue
    }

    /**
     * 允许某个用户对某个资源进行某个操作
     */
    fun allow(
        resource: String,
        action: String,
        userId: String
    ): GraphQLCall<AllowResponse, CommonMessage> {
        val param = AllowParam(resource, action).withUserId(userId)

        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AllowResponse>>() {}) {
            it.result
        }
    }

    /**
     * 判断某个用户是否对某个资源有某个操作权限
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
     * 获取资源列表
     */
    @Deprecated("use listResources", ReplaceWith("this.listResources(namespaceCode, type, limit, page)"))
    @JvmOverloads
    fun getResources(
        namespaceCode: String? = null,
        type: ResourceType? = null,
        limit: Number = 10,
        page: Number = 1
    ): HttpCall<RestfulResponse<Pagination<IResourceResponse>>, Pagination<IResourceResponse>> {
        return this.listResources(namespaceCode, type, limit, page)
    }

    /**
     * 获取资源列表
     */
    @JvmOverloads
    fun listResources(
        namespaceCode: String? = null,
        type: ResourceType? = null,
        limit: Number = 10,
        page: Number = 1,
        fetchAll: Boolean = false
    ): HttpCall<RestfulResponse<Pagination<IResourceResponse>>, Pagination<IResourceResponse>> {

        var url = "${client.host}/api/v2/resources?limit=${if (fetchAll) -1 else limit}&page=$page"

        url += if (namespaceCode != null) "&namespace=${namespaceCode}" else ""
        url += if (type != null) "&type=${type}" else ""

        return this.client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Pagination<IResourceResponse>>>() {}) { it.data }

    }

    /**
     * 获取资源列表
     */
    fun listResources(params: AclListResourcesParams): HttpCall<RestfulResponse<Pagination<IResourceResponse>>, Pagination<IResourceResponse>> {
        var (namespaceCode, type, limit, page, fetchAll) = params
        if (fetchAll) limit = -1
        return this.listResources(namespaceCode, type, limit, page)
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
     * 根据资源 Code 获取资源
     */
    @JvmOverloads
    fun findResourceByCode(
        code: String,
        namespace: String? = null
    ): HttpCall<RestfulResponse<IResourceResponse>, IResourceResponse> {
        var url = "${client.host}/api/v2/resources/detail/$code"

        url += if (namespace != null) "?namespace=$namespace" else ""

        return this.client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<IResourceResponse>>() {}) { it.data }
    }

    /**
     * 更新资源
     */
    fun updateResource(
        code: String,
        options: IResourceDto
    ): HttpCall<RestfulResponse<IResourceResponse>, IResourceResponse> {

        val data = Gson().toJson(options);
        return this.client.createHttpPostCall(
            "${client.host}/api/v2/resources/$code",
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<IResourceResponse>>() {}) { it.data }
    }

    /**
     * 删除资源
     */
    fun deleteResource(code: String, namespaceCode: String): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return this.client.createHttpDeleteCall(
            "${client.host}/api/v2/resources/$code?namespace=$namespaceCode",
            object : TypeToken<RestfulResponse<Boolean>>() {}) { it.code == 200 }
    }

    /**
     * 获取应用访问控制策略列表
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
        val param = UpdateDefaultApplicationParams(options)
        return this.client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(param),
            object : TypeToken<RestfulResponse<Application>>() {}) { it.data }

    }

    /**
     * 将一个（类）资源授权给用户、角色、分组、组织机构，且可以分别指定不同的操作权限。
     */
    fun authorizeResource(
        namespace: String,
        resource: String,
        opts: List<AuthorizeResourceOptInput>
    ): GraphQLCall<AuthorizeResourceResponse, CommonMessage> {
        val param = AuthorizeResourceParam(namespace).withResource(resource).withOpts(opts)

        return this.client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AuthorizeResourceResponse>>() {}) { it.result }
    }

    /**
     * 刷新编程访问账号密钥
     * @param options.id 编程访问账号 ID
     * @param options.secret 编程访问账号 Secret
     * @returns ProgrammaticAccessAccount
     */
    fun refreshProgrammaticAccessAccountSecret(
        options: IProgrammaticAccessAccountProps
    ): HttpCall<RestfulResponse<ProgrammaticAccessAccount>, ProgrammaticAccessAccount> {
        val url = "${client.host}/api/v2/applications/programmatic-access-accounts"

        if (options.secret == null) options.secret = randomString(32)

        return this.client.createHttpPatchCall(
            url,
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<ProgrammaticAccessAccount>>() {}) { it.data }

    }

    /**
     * 编程访问账号列表
     * @param options.appId 应用 ID
     * @param options.page 当前页数
     * @param options.limit 每页显示条数
     * @returns Pagination<ProgrammaticAccessAccount>
     */
    fun programmaticAccessAccountList(
        options: IProgrammaticAccessAccountListProps
    ): HttpCall<RestfulResponse<Pagination<ProgrammaticAccessAccount>>, Pagination<ProgrammaticAccessAccount>> {

        val url =
            "${client.host}/api/v2/applications/${options.appId}/programmatic-access-accounts?limit=${options.limit}&page=${options.page}"

        return this.client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Pagination<ProgrammaticAccessAccount>>>() {}) { it.data }
    }

    /**
     * 添加编程访问账号
     *
     * @param options.appId 应用 ID
     * @param options.tokenLifetime AccessToken 过期时间（秒）
     * @param options.remarks 备注
     * @returns ProgrammaticAccessAccount
     */
    fun createProgrammaticAccessAccount(
        options: ICreateProgrammaticAccessAccountProps
    ): HttpCall<RestfulResponse<ProgrammaticAccessAccount>, ProgrammaticAccessAccount> {
        val url =
            "${client.host}/api/v2/applications/${options.appId}/programmatic-access-accounts"

        return this.client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<ProgrammaticAccessAccount>>() {})
        { it.data }

    }

    /**
     * 删除编程访问账号
     * @param programmaticAccessAccountId 编程访问账号 ID
     * @returns Boolean
     */
    fun deleteProgrammaticAccessAccount(
        programmaticAccessAccountId: String
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url =
            "${client.host}/api/v2/applications/programmatic-access-accounts?id=${programmaticAccessAccountId}"

        return this.client.createHttpDeleteCall(
            url,
            object : TypeToken<RestfulResponse<Boolean>>() {}) { it.code == 200 }

    }

    /**
     * 启用编程访问账号
     * @param programmaticAccessAccountId 编程访问账号 ID
     * @returns ProgrammaticAccessAccount
     */
    fun enableProgrammaticAccessAccount(
        programmaticAccessAccountId: String
    ): HttpCall<RestfulResponse<ProgrammaticAccessAccount>, ProgrammaticAccessAccount> {
        val url =
            "${client.host}/api/v2/applications/programmatic-access-accounts"

        return this.client.createHttpPatchCall(
            url,
            GsonBuilder().create().toJson(IEnableProgrammaticAccessAccount(programmaticAccessAccountId, true)),
            object : TypeToken<RestfulResponse<ProgrammaticAccessAccount>>() {}) { it.data }

    }

    /**
     * 禁用编程访问账号
     * @param programmaticAccessAccountId 编程访问账号 ID
     * @returns ProgrammaticAccessAccount
     */
    fun disableProgrammaticAccessAccount(
        programmaticAccessAccountId: String
    ): HttpCall<RestfulResponse<ProgrammaticAccessAccount>, ProgrammaticAccessAccount> {
        val url =
            "${client.host}/api/v2/applications/programmatic-access-accounts"

        return this.client.createHttpPatchCall(
            url,
            GsonBuilder().create().toJson(IEnableProgrammaticAccessAccount(programmaticAccessAccountId, false)),
            object : TypeToken<RestfulResponse<ProgrammaticAccessAccount>>() {}) { it.data }

    }

    /**
     * 创建权限分组
     */
    @JvmOverloads
    fun createNamespace(
        code: String,
        name: String,
        description: String? = null
    ): HttpCall<RestfulResponse<ResourceNamespace>, ResourceNamespace> {
        val url = "${client.host}/api/v2/resource-namespace/${client.userPoolId}"
        return this.client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(CreateNamespaceBody(code, name, description)),
            object : TypeToken<RestfulResponse<ResourceNamespace>>() {}) { it.data }
    }

    /**
     * 权限分组列表
     */
    @JvmOverloads
    fun listNamespaces(
        page: Int? = 1,
        limit: Int? = 10
    ): HttpCall<RestfulResponse<Pagination<ResourceNamespace>>, Pagination<ResourceNamespace>> {
        val url = "${client.host}/api/v2/resource-namespace/${client.userPoolId}?limit=$limit&page=$page"
        return this.client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Pagination<ResourceNamespace>>>() {}) { it.data }
    }

    /**
     * 修改权限分组
     */
    fun updateNamespace(
        id: Int,
        updates: UpdateNamespaceParams
    ): HttpCall<RestfulResponse<ResourceNamespace>, ResourceNamespace> {
        val url = "${client.host}/api/v2/resource-namespace/${client.userPoolId}/${id}"

        return client.createHttpPutCall(
            url,
            Gson().toJson(updates),
            object : TypeToken<RestfulResponse<ResourceNamespace>>() {}
        ) { it.data }
    }

    /**
     * 删除权限分组
     */
    fun deleteNamespace(id: Int): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "${this.client.host}/api/v2/resource-namespace/${this.client.userPoolId}/${id}"

        return client.createHttpDeleteCall(
            url,
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code == 200 }
    }

    /**
     * 获取具备某些资源操作权限的主体
     */
    fun getAuthorizedTargets(
        options: AuthorizedTargetsParam
    ): GraphQLCall<AuthorizedTargetsResponse, PaginatedAuthorizedTargets> {

        return client.createGraphQLCall(
            options.createRequest(),
            object : TypeToken<GraphQLResponse<AuthorizedTargetsResponse>>() {}
        ) { it.result }
    }

    /**
     *  根据 id 获取资源
     */
    fun getResourceById(id: String) : HttpCall<RestfulResponse<IResourceResponse>, IResourceResponse>{
        val url = "${client.host}/api/v2/resources/detail?id=" + id;
        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<IResourceResponse>>() {}
        ) { it.data }
    }

    /**
     * 获取用户被授权的所有资源
     */
    fun listAuthorizedResources(targetType: PolicyAssignmentTargetType,
                                targetIdentifier: String,
                                namespace: String,
                                options: ListAuthorizedResourcesOptions?
    ) : GraphQLCall<ListAuthorizedResourcesResponse, PaginatedAuthorizedResources> {
        var param = ListAuthorizedResourcesParam(targetType, targetIdentifier, namespace, options?.resourceType)
        return this.client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<ListAuthorizedResourcesResponse>>() {}) { it.authorizedResources }
    }
}