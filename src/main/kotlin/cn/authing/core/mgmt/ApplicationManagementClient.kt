package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

/**
 * 应用管理类
 */
class ApplicationManagementClient(private val client: ManagementClient) {

    private val acl: AclManagementClient = client.acl()
    private val role: RolesManagementClient = client.roles()

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
     * 获取应用详情
     */
    @Deprecated("方法已弃用，请使用 findById ()", ReplaceWith("findById (appId)"))
    fun detail(appId: String): HttpCall<RestfulResponse<Application>, Application> {
        return this.findById(appId)
    }

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

    @JvmOverloads
    fun listResources(
        appId: String,
        type: ResourceType? = null,
        limit: Number = 10,
        page: Number = 1
    ): HttpCall<RestfulResponse<Pagination<IResourceResponse>>, Pagination<IResourceResponse>> {
        return acl.listResources(appId, type, limit, page)
    }

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

    fun findResourceByCode(
        appId: String,
        code: String
    ): HttpCall<RestfulResponse<IResourceResponse>, IResourceResponse> {
        return acl.findResourceByCode(code, appId)
    }

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

    fun deleteResource(
        appId: String,
        code: String
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return acl.deleteResource(code, appId)
    }

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

    fun updateDefaultAccessPolicy(
        appId: String,
        defaultStrategy: DefaultStrategy
    ): HttpCall<RestfulResponse<Application>, Application> {
        return acl.updateDefaultApplicationAccessPolicy(
            IDefaultAppAccessPolicy(appId, defaultStrategy)
        )
    }

    fun createRole(
        appId: String,
        options: CreateRoleParams
    ): GraphQLCall<CreateRoleResponse, Role> {
        return role.create(
            CreateRoleParam(code = options.code).withNamespace(appId).withDescription(options.description)
        )
    }

    fun deleteRole(
        appId: String,
        code: String
    ): GraphQLCall<DeleteRoleResponse, CommonMessage> {
        return role.delete(
            DeleteRoleParam(code).withNamespace(appId)
        )
    }

    fun deleteRoles(
        appId: String,
        codes: List<String>
    ): GraphQLCall<DeleteRolesResponse, CommonMessage> {
        return role.deleteMany(
            DeleteRolesParam(codes, appId)
        )
    }

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

    fun findRole(
        appId: String,
        code: String
    ): GraphQLCall<RoleResponse, Role> {
        return role.findByCode(RoleParam(code).withNamespace(appId))
    }

    @JvmOverloads
    fun getRoles(
        appId: String,
        options: PageOptions = PageOptions()
    ): GraphQLCall<RolesResponse, PaginatedRoles> {
        return role.list(
            RolesParam(namespace = appId).withPage(options.page).withLimit(options.limit)
        )
    }

    fun getUsersByRoleCode(
        appId: String,
        code: String
    ): GraphQLCall<RoleWithUsersResponse, PaginatedUsers> {
        return role.listUsers(RoleWithUsersParam(code).withNamespace(appId))
    }

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
}