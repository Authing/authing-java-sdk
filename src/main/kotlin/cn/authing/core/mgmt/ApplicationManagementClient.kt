package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlin.collections.HashMap

/**
 * 应用管理类
 */
class ApplicationManagementClient(private val client: ManagementClient) {

    private val acl: AclManagementClient = client.acl()
    private val role: RolesManagementClient = client.roles()

    /**
     * 创建应用
     */
    fun create(
        options: CreateAppParams
    ): HttpCall<RestfulResponse<Application>, Application> {
        val url = "${this.client.host}/api/v2/applications"

        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<Application>>() {}
        ) {
            if (it.code == 200) {
                it.data
            } else {
                throw Exception(it.message)
            }
        }
    }

    /**
     * 删除应用
     */
    fun delete(
        appId: String
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "${this.client.host}/api/v2/applications/${appId}"

        return client.createHttpDeleteCall(
            url,
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code == 200 }
    }

    /**
     * 获取应用列表
     */
    @JvmOverloads
    @Deprecated("方法已经弃用，请使用 list()", ReplaceWith("list (page, limit)"))
    fun listApplications(
        page: Int? = 1,
        limit: Int? = 10
    ): HttpCall<RestfulResponse<ListApplicationResponse>, List<Application>> {
        return this.list(page, limit)
    }

    /**
     * 获取应用列表
     */
    @JvmOverloads
    fun list(
        page: Int? = 1,
        limit: Int? = 10
    ): HttpCall<RestfulResponse<ListApplicationResponse>, List<Application>> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/applications?limit=$limit&page=$page",
            object : TypeToken<RestfulResponse<ListApplicationResponse>>() {}) {
            it.data.list
        }
    }

    /**
     * 通过应用 id 查找应用详情
     */
    @Deprecated("方法已弃用，请使用 findById ()", ReplaceWith("findById (appId)"))
    fun detail(appId: String): HttpCall<RestfulResponse<Application>, Application> {
        return this.findById(appId)
    }

    /**
     * 通过应用 id 查找应用详情
     */
    fun findById(appId: String): HttpCall<RestfulResponse<Application>, Application> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/applications/${appId}",
            object : TypeToken<RestfulResponse<Application>>() {}) {
            it.data
        }
    }

    /**
     * 刷新应用密钥
     */
    fun refreshApplicationSecret(
        appId: String
    ): HttpCall<RestfulResponse<Application>, Application> {
        val url = "${client.host}/api/v2/application/${appId}/refresh-secret"

        return this.client.createHttpPatchCall(
            url,
            "",
            object : TypeToken<RestfulResponse<Application>>() {}) { it.data }
    }

    /**
     * 查看应用下已登录用户
     */
    fun activeUsers(
        option: IActiveUsersParam
    ): HttpCall<RestfulResponse<Pagination<ActiveUser>>, Pagination<ActiveUser>> {
        val url =
            "${client.host}/api/v2/applications/${option.appId}/active-users?page=${option.page}&limit=${option.limit}"

        return this.client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Pagination<ActiveUser>>>() {}) { it.data }

    }

    /**
     * 获取资源列表
     */
    fun listResources(
        options: ListResourcesParams
    ): HttpCall<RestfulResponse<Pagination<IResourceResponse>>, Pagination<IResourceResponse>> {
        val (appId, type, limit, page) = options
        return acl.listResources(appId, type, limit, page)
    }

    /**
     * 创建资源
     */
    fun createResource(
        appId: String,
        options: ResourceOptionsParams
    ): HttpCall<RestfulResponse<IResourceResponse>, IResourceResponse> {
        return acl.createResource(
            IResourceDto(
                options.code,
                options.type,
                options.description,
                options.actions,
                appId
            )
        )
    }

    /**
     * 根据 Code 获取单个资源
     */
    fun findResourceByCode(
        appId: String,
        code: String
    ): HttpCall<RestfulResponse<IResourceResponse>, IResourceResponse> {
        return acl.findResourceByCode(code, appId)
    }

    /**
     * 更新资源
     */
    fun updateResource(
        appId: String,
        options: ResourceOptionsParams
    ): HttpCall<RestfulResponse<IResourceResponse>, IResourceResponse> {
        return acl.updateResource(
            options.code,
            IResourceDto(
                code = options.code,
                type = options.type,
                description = options.description,
                actions = options.actions,
                namespace = appId
            )
        )
    }

    /**
     * 删除资源
     */
    fun deleteResource(
        appId: String,
        code: String
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return acl.deleteResource(code, appId)
    }

    /**
     * 获取应用访问控制策略列表
     */
    @JvmOverloads
    fun getAccessPolicies(
        appId: String,
        options: PageOptions = PageOptions()
    ): HttpCall<RestfulResponse<Pagination<IApplicationAccessPolicies>>, Pagination<IApplicationAccessPolicies>> {
        return acl.getApplicationAccessPolicies(
            IAppAccessPolicyQueryFilter(
                appId,
                options.page,
                options.limit
            )
        )
    }

    /**
     * 启用应用访问控制策略
     */
    fun enableAccessPolicy(
        appId: String,
        options: IAccessPolicyParams
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return acl.enableApplicationAccessPolicy(
            IAppAccessPolicy(
                appId = appId,
                targetType = options.targetType,
                targetIdentifiers = options.targetIdentifiers,
                inheritByChildren = options.inheritByChildren,
                namespace = appId
            )
        )
    }

    /**
     * 停用应用访问控制策略
     */
    fun disableAccessPolicy(
        appId: String,
        options: IAccessPolicyParams
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return acl.disableApplicationAccessPolicy(
            IAppAccessPolicy(
                appId = appId,
                targetType = options.targetType,
                targetIdentifiers = options.targetIdentifiers,
                inheritByChildren = options.inheritByChildren,
                namespace = appId
            )
        )
    }

    /**
     * 删除应用访问控制策略
     */
    fun deleteAccessPolicy(
        appId: String,
        options: IAccessPolicyParams
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return acl.deleteApplicationAccessPolicy(
            IAppAccessPolicy(
                appId = appId,
                targetType = options.targetType,
                targetIdentifiers = options.targetIdentifiers,
                inheritByChildren = options.inheritByChildren,
                namespace = appId
            )
        )
    }

    /**
     * 配置「允许主体（用户、角色、分组、组织机构节点）访问应用」的控制策略
     */
    fun allowAccess(
        appId: String,
        options: IAccessPolicyParams
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return acl.allowAccessApplication(
            IAppAccessPolicy(
                appId = appId,
                targetType = options.targetType,
                targetIdentifiers = options.targetIdentifiers,
                inheritByChildren = options.inheritByChildren,
                namespace = appId
            )
        )
    }

    /**
     * 配置「拒绝主体（用户、角色、分组、组织机构节点）访问应用」的控制策略
     */
    fun denyAccess(
        appId: String,
        options: DenyAccessParams
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return acl.denyAccessApplication(
            IAppAccessPolicy(
                appId = appId,
                targetType = options.targetType,
                targetIdentifiers = options.targetIdentifiers,
                inheritByChildren = options.inheritByChildren,
                namespace = appId
            )
        )
    }

    /**
     * 更改默认应用访问策略（默认拒绝所有用户访问应用、默认允许所有用户访问应用）
     */
    fun updateDefaultAccessPolicy(
        appId: String,
        defaultStrategy: DefaultStrategy
    ): HttpCall<RestfulResponse<Application>, Application> {
        return acl.updateDefaultApplicationAccessPolicy(
            IDefaultAppAccessPolicy(appId, defaultStrategy)
        )
    }

    /**
     * 创建角色
     */
    fun createRole(
        appId: String,
        options: CreateRoleParams
    ): HttpCall<RestfulResponse<Role>, Role> {
        return role.create(
            CreateRoleParam(code = options.code).withNamespace(appId).withDescription(options.description)
        )
    }

    /**
     * 删除角色
     */
    fun deleteRole(
        appId: String,
        code: String
    ): GraphQLCall<DeleteRoleResponse, CommonMessage> {
        return role.delete(
            DeleteRoleParam(code).withNamespace(appId)
        )
    }

    /**
     * 批量删除角色
     */
    fun deleteRoles(
        appId: String,
        codes: List<String>
    ): GraphQLCall<DeleteRolesResponse, CommonMessage> {
        return role.deleteMany(
            DeleteRolesParam(codes, appId)
        )
    }

    /**
     * 修改角色
     */
    fun updateRole(
        appId: String,
        options: UpdateRoleParams
    ): GraphQLCall<UpdateRoleResponse, Role> {
        return role.update(
            UpdateRoleParam(code = options.code, namespace = appId)
                .withDescription(options.description)
                .withNewCode(options.newCode)
        )
    }

    /**
     * 获取角色详情
     */
    fun findRole(
        appId: String,
        code: String
    ): GraphQLCall<RoleResponse, Role> {
        return role.findByCode(RoleParam(code).withNamespace(appId))
    }

    /**
     * 获取角色列表
     */
    @JvmOverloads
    fun getRoles(
        appId: String,
        options: PageOptions = PageOptions()
    ): HttpCall<RestfulResponse<PaginatedRoles>, PaginatedRoles> {
        return role.list(
            RolesParam(namespace = appId).withPage(options.page).withLimit(options.limit)
        )
    }

    /**
     * 获取角色用户列表
     */
    fun getUsersByRoleCode(
        appId: String,
        code: String
    ): GraphQLCall<RoleWithUsersResponse, PaginatedUsers> {
        return role.listUsers(RoleWithUsersParam(code).withNamespace(appId))
    }

    /**
     * 添加用户
     */
    fun addUsersToRole(
        appId: String,
        code: String,
        userIds: List<String>
    ): GraphQLCall<AssignRoleResponse, CommonMessage> {
        return role.addUsers(
            AssignRoleParam(
                roleCode = code,
                userIds = userIds,
                namespace = appId
            )
        )
    }

    /**
     * 移除用户
     */
    fun removeUsersFromRole(
        appId: String,
        code: String,
        userIds: List<String>
    ): GraphQLCall<RevokeRoleResponse, CommonMessage> {
        return role.removeUsers(
            RevokeRoleParam(
                roleCode = code,
                userIds = userIds,
                namespace = appId
            )
        )
    }

    /**
     * 获取角色被授权的所有资源
     */
    @JvmOverloads
    fun listAuthorizedResourcesByRole(
        appId: String,
        code: String,
        resourceType: ResourceType? = null
    ): GraphQLCall<ListRoleAuthorizedResourcesResponse, PaginatedAuthorizedResources?> {
        return role.listAuthorizedResources(
            ListRoleAuthorizedResourcesParam(
                code = code,
                namespace = appId
            ).withResourceType(resourceType.toString())
        )
    }

    /**
     * 创建应用协议
     */
    fun createAgreement(
        appId: String,
        agreement: AgreementParams
    ): HttpCall<RestfulResponse<AgreementDetail>, AgreementDetail> {
        val url = "${client.host}/api/v2/applications/${appId}/agreements"

        return client.createHttpPostCall(
            url,
            Gson().toJson(agreement),
            object : TypeToken<RestfulResponse<AgreementDetail>>() {}
        ) { it.data }
    }

    /**
     * 应用协议列表
     */
    fun listAgreement(appId: String): HttpCall<RestfulResponse<Pagination<AgreementDetail>>, Pagination<AgreementDetail>> {
        val url = "${client.host}/api/v2/applications/${appId}/agreements"

        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Pagination<AgreementDetail>>>() {}
        ) { it.data }
    }

    /**
     * 修改应用协议
     */
    fun modifyAgreement(
        appId: String,
        agreementId: String,
        updates: AgreementParams
    ): HttpCall<RestfulResponse<AgreementDetail>, AgreementDetail> {
        val url = "${client.host}/api/v2/applications/${appId}/agreements/${agreementId}"

        return client.createHttpPutCall(
            url,
            Gson().toJson(updates),
            object : TypeToken<RestfulResponse<AgreementDetail>>() {}
        ) { it.data }
    }

    /**
     * 删除应用协议
     */
    fun deleteAgreement(
        appId: String,
        agreementId: String
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "${client.host}/api/v2/applications/${appId}/agreements/${agreementId}"

        return client.createHttpDeleteCall(
            url,
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code == 200 }
    }

    /**
     * 应用协议排序
     */
    fun sortAgreement(
        appId: String,
        order: List<String>
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "${client.host}/api/v2/applications/${appId}/agreements/sort"
        val body = HashMap<String, Any>()
        body["ids"] = order
        return client.createHttpPostCall(
            url,
            Gson().toJson(body),
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code == 200 }
    }

    /**
     * 查看应用下已登录用户
     */
    @JvmOverloads
    fun activeUsers(
        appId: String,
        options: PageOptions? = PageOptions()
    ): HttpCall<RestfulResponse<ActiveUser>, ActiveUser> {
        val url =
            "${client.host}/api/v2/applications/${appId}/active-users?page=${options?.page}&limit=${options?.limit}"

        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<ActiveUser>>() {}
        ) { it.data }
    }
}