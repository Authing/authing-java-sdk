package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.mgmt.ManagementClient
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

/**
 * 用户管理类
 */
class UsersManagementClient(private val client: ManagementClient) {
    /**
     * 获取用户池用户列表
     */
    @JvmOverloads
    fun list(param: UsersParam? = null): GraphQLCall<UsersResponse, PaginatedUsers> {
        return client.createGraphQLCall(
            (param ?: UsersParam()).createRequest(),
            object : TypeToken<GraphQLResponse<UsersResponse>>() {}) {
            it.result
        }
    }

    /**
     * 创建新用户
     */
    fun create(userInfo: CreateUserInput): GraphQLCall<CreateUserResponse, User> {
        val param = CreateUserParam(userInfo)
        if (param.userInfo.password !== null) {
            param.userInfo.password = client.encrypt(param.userInfo.password!!)
        }
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<CreateUserResponse>>() {}) {
            it.result
        }
    }

    /**
     * 更新用户信息
     */
    fun update(userId: String, updates: UpdateUserInput): GraphQLCall<UpdateUserResponse, User> {
        val param = UpdateUserParam(userId, updates)
        if (param.input.password !== null) {
            param.input.password = client.encrypt(param.input.password!!)
        }
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdateUserResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取用户信息，需要传入用户 ID
     */
    fun detail(userId: String): GraphQLCall<UserResponse, User> {
        val param = UserParam(userId)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UserResponse>>() {}) {
            it.result
        }
    }

    /**
     * 模糊搜索用户
     */
    fun search(query: String): GraphQLCall<SearchUserResponse, PaginatedUsers> {
        val param = SearchUserParam(query);
        return search(param);
    }

    /**
     * 模糊搜索用户
     */
    fun search(param: SearchUserParam): GraphQLCall<SearchUserResponse, PaginatedUsers> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<SearchUserResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过用户 ID 列表批量获取用户信息
     */
    fun batch(userIds: List<String>): GraphQLCall<UserBatchResponse, List<User>> {
        val param = UserBatchParam(userIds)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UserBatchResponse>>() {}) {
            it.result
        }
    }

    /**
     * 删除单个用户
     */
    fun delete(userId: String): GraphQLCall<DeleteUserResponse, CommonMessage> {
        val param = DeleteUserParam(userId)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteUserResponse>>() {}) {
            it.result
        }
    }

    /**
     * 删除多个用户
     */
    fun deleteMany(userIds: List<String>): GraphQLCall<DeleteUsersResponse, CommonMessage> {
        val param = DeleteUsersParam(userIds)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteUsersResponse>>() {}) {
            it.result
        }
    }

    /**
     * 查询用户角色列表
     */
    fun listRoles(userId: String): GraphQLCall<GetUserRolesResponse, PaginatedRoles> {
        val param = GetUserRolesParam(userId)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<GetUserRolesResponse>>() {}) {
            it.result.roles!!
        }
    }

    /**
     * 批量添加用户角色
     */
    fun addRoles(userId: String, roles: List<String>): GraphQLCall<AssignRoleResponse, CommonMessage> {
        val param = AssignRoleParam().withUserIds(listOf(userId)).withRoleCodes(roles)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AssignRoleResponse>>() {}) {
            it.result
        }
    }

    /**
     * 批量撤销用户角色
     */
    fun removeRoles(userId: String, roles: List<String>): GraphQLCall<RevokeRoleResponse, CommonMessage> {
        val param = RevokeRoleParam().withUserIds(listOf(userId)).withRoleCodes(roles)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RevokeRoleResponse>>() {}) {
            it.result
        }
    }

    /**
     * 刷新用户 token
     */
    fun refreshToken(userId: String): GraphQLCall<RefreshTokenResponse, RefreshToken> {
        val param = RefreshTokenParam(userId)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RefreshTokenResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取策略列表
     */
    @JvmOverloads
    fun listPolicies(
        userId: String,
        page: Int = 1,
        limit: Int = 10
    ): GraphQLCall<PolicyAssignmentsResponse, PaginatedPolicyAssignments> {
        val param =
            PolicyAssignmentsParam().withTargetType(PolicyAssignmentTargetType.USER).withTargetIdentifier(userId)
                .withPage(page).withLimit(limit)
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
        userId: String,
        policies: List<String>
    ): GraphQLCall<AddPolicyAssignmentsResponse, CommonMessage> {
        val param =
            AddPolicyAssignmentsParam(policies, PolicyAssignmentTargetType.USER).withTargetIdentifiers(listOf(userId))
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
        userId: String,
        policies: List<String>
    ): GraphQLCall<RemovePolicyAssignmentsResponse, CommonMessage> {
        val param = RemovePolicyAssignmentsParam(
            policies,
            PolicyAssignmentTargetType.USER
        ).withTargetIdentifiers(listOf(userId))
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RemovePolicyAssignmentsResponse>>() {}) {
            it.result
        }
    }
}