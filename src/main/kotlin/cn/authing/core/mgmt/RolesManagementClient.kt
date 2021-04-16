package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

/**
 * 角色管理类
 */
class RolesManagementClient(private val client: ManagementClient) {

    /**
     * 获取角色列表
     */
    @JvmOverloads
    fun list(
        page: Int? = null,
        limit: Int? = null,
        sortBy: SortByEnum? = null,
        namespace: String? = null
    ): GraphQLCall<RolesResponse, PaginatedRoles> {
        val param = RolesParam(namespace, page, limit, sortBy)
        return list(param)
    }

    /**
     * 获取角色列表
     */
    fun list(param: RolesParam): GraphQLCall<RolesResponse, PaginatedRoles> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RolesResponse>>() {}) {
            it.result
        }
    }

    /**
     * 创建角色
     */
    @JvmOverloads
    fun create(
        code: String,
        description: String? = null,
        parent: String? = null,
        namespace: String? = null
    ): GraphQLCall<CreateRoleResponse, Role> {
        val param = CreateRoleParam(namespace, code, description, parent)
        return create(param)
    }

    /**
     * 创建角色
     */
    fun create(param: CreateRoleParam): GraphQLCall<CreateRoleResponse, Role> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<CreateRoleResponse>>() {}) {
            it.result
        }
    }

    /**
     * 角色详情
     */
    @Deprecated("use findByCode", ReplaceWith("this.findByCode(param)"))
    fun detail(code: String): GraphQLCall<RoleResponse, Role> {
        val param = RoleParam(code)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RoleResponse>>() {}) {
            it.result
        }
    }

    fun findByCode(param: RoleParam): GraphQLCall<RoleResponse, Role> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RoleResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新角色
     */
    @JvmOverloads
    fun update(
        code: String,
        description: String? = null,
        newCode: String? = null
    ): GraphQLCall<UpdateRoleResponse, Role> {
        val param = UpdateRoleParam(code, description, newCode)
        return update(param)
    }

    /**
     * 更新角色
     */
    fun update(param: UpdateRoleParam): GraphQLCall<UpdateRoleResponse, Role> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdateRoleResponse>>() {}) {
            it.result
        }
    }

    /**
     * 删除角色
     */
    fun delete(code: String): GraphQLCall<DeleteRoleResponse, CommonMessage> {
        val param = DeleteRoleParam(code)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteRoleResponse>>() {}) {
            it.result
        }
    }

    fun delete(param: DeleteRoleParam): GraphQLCall<DeleteRoleResponse, CommonMessage> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteRoleResponse>>() {}) {
            it.result
        }
    }

    /**
     * 批量删除角色
     */
    fun deleteMany(codeList: List<String>): GraphQLCall<DeleteRolesResponse, CommonMessage> {
        val param = DeleteRolesParam(codeList)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteRolesResponse>>() {}) {
            it.result
        }
    }

    fun deleteMany(param: DeleteRolesParam): GraphQLCall<DeleteRolesResponse, CommonMessage> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteRolesResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取用户列表
     */
    fun listUsers(code: String): GraphQLCall<RoleWithUsersResponse, PaginatedUsers> {
        val param = RoleWithUsersParam(code)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RoleWithUsersResponse>>() {}) {
            it.result.users
        }
    }

    fun listUsers(param: RoleWithUsersParam): GraphQLCall<RoleWithUsersResponse, PaginatedUsers> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RoleWithUsersResponse>>() {}) {
            it.result.users
        }
    }

    /**
     * 批量添加用户
     */
    fun addUsers(code: String, userIds: List<String>): GraphQLCall<AssignRoleResponse, CommonMessage> {
        val param = AssignRoleParam().withUserIds(userIds).withRoleCode(code)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AssignRoleResponse>>() {}) {
            it.result
        }
    }

    fun addUsers(param: AssignRoleParam): GraphQLCall<AssignRoleResponse, CommonMessage> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AssignRoleResponse>>() {}) {
            it.result
        }
    }

    /**
     * 批量移除用户
     */
    fun removeUsers(code: String, userIds: List<String>): GraphQLCall<RevokeRoleResponse, CommonMessage> {
        val param = RevokeRoleParam(code).withUserIds(userIds)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RevokeRoleResponse>>() {}) {
            it.result
        }
    }

    fun removeUsers(param: RevokeRoleParam): GraphQLCall<RevokeRoleResponse, CommonMessage> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RevokeRoleResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取策略列表
     */
    @JvmOverloads
    fun listPolicies(
        code: String,
        page: Int? = null,
        limit: Int? = null,
        namespace: String? = null,
        targetIdentifier: String? = null
    ): GraphQLCall<PolicyAssignmentsResponse, PaginatedPolicyAssignments> {
        val param =
            PolicyAssignmentsParam(namespace, code, PolicyAssignmentTargetType.ROLE, targetIdentifier, page, limit)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<PolicyAssignmentsResponse>>() {}) {
            it.result
        }
    }

    /**
     * 批量添加策略
     */
    fun addPolicies(
        code: String,
        policies: List<String>
    ): GraphQLCall<AddPolicyAssignmentsResponse, CommonMessage> {
        val param =
            AddPolicyAssignmentsParam(policies, PolicyAssignmentTargetType.ROLE).withTargetIdentifiers(listOf(code))
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AddPolicyAssignmentsResponse>>() {}) {
            it.result
        }
    }

    /**
     * 批量移除策略
     */
    fun removePolicies(
        code: String,
        policies: List<String>
    ): GraphQLCall<RemovePolicyAssignmentsResponse, CommonMessage> {
        val param =
            RemovePolicyAssignmentsParam(policies, PolicyAssignmentTargetType.ROLE).withTargetIdentifiers(listOf(code))
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RemovePolicyAssignmentsResponse>>() {}) {
            it.result
        }
    }

    fun listAuthorizedResources(
        param: ListRoleAuthorizedResourcesParam
    ): GraphQLCall<ListRoleAuthorizedResourcesResponse, PaginatedAuthorizedResources?> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<ListRoleAuthorizedResourcesResponse>>() {}
        ) { it.result.authorizedResources }
    }
}