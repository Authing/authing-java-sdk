package cn.authing.core.mgmt

import cn.authing.core.Utils
import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.util.*

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
    ): HttpCall<RestfulResponse<PaginatedRoles>, PaginatedRoles> {
        val param = RolesParam(namespace, page, limit, sortBy)
        return list(param)
    }

    /**
     * 获取角色列表
     */
    fun list(param: RolesParam): HttpCall<RestfulResponse<PaginatedRoles>, PaginatedRoles> {
        var url = "${client.host}/api/v2/roles"
        url += if (param.page != null) "?page=${param.page}" else "?page=1"
        url += if (param.limit != null) "&limit=${param.limit}" else "&limit=10"
        url += if (param.sortBy != null) "&sortBy=${param.sortBy}" else ""

        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<PaginatedRoles>> () {}
        ) {
            it.data
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
    ): HttpCall<RestfulResponse<Role>, Role> {
        val param = CreateRoleParam(namespace, code, description, parent)
        return create(param)
    }

    /**
     * 创建角色
     */
    fun create(param: CreateRoleParam): HttpCall<RestfulResponse<Role>, Role> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/roles",
            GsonBuilder().create().toJson(param),
            object : TypeToken<RestfulResponse<Role>> () {}
        ) {
            it.data
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

    fun getUdfValue(roleCode: String): GraphQLCall<UdvResponse, Map<String, Any>> {
        val param = UdvParam(UdfTargetType.ROLE, roleCode)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UdvResponse>>() {}) {
            convertUdvToKeyValuePair(it.result)
        }
    }

    fun getUdfValueBatch(roleCodes: List<String>): GraphQLCall<UdfValueBatchResponse, Map<String, Map<String, Any>>> {
        if (roleCodes.isEmpty()) {
            throw Exception("userIds can't be null")
        }

        val param = UdfValueBatchParam(UdfTargetType.ROLE, roleCodes)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UdfValueBatchResponse>>() {}) {
            val hashtable = Hashtable<String, Map<String, Any>>()
            it.result.map { hashtable.put(it.targetId, convertUdvToKeyValuePair(it.data)) }
            hashtable
        }
    }

    fun setUdfValue(
        roleCode: String,
        data: Map<String, String>
    ): HttpCall<RestfulResponse<List<UserDefinedData>>, List<UserDefinedData>> {

        val params = RestSetUdfValueParams(UdfTargetType.ROLE, roleCode, data)

        return client.createHttpPostCall(
            "${client.host}/api/v2/udvs",
            GsonBuilder().create().toJson(params),
            object : TypeToken<RestfulResponse<List<UserDefinedData>>> () {}
        ) {
            it.data
        }
    }

    fun setUdfValue(
        roleCode: String,
        key: String,
        value: String
    ): HttpCall<RestfulResponse<List<UserDefinedData>>, List<UserDefinedData>> {
        val map: MutableMap<String, Any> = HashMap()
        map[key] = value
        val param = RestSetUdfValueParams(UdfTargetType.ROLE, roleCode, map)

        return client.createHttpPostCall(
            "${client.host}/api/v2/udvs",
            GsonBuilder().create().toJson(param),
            object : TypeToken<RestfulResponse<List<UserDefinedData>>> () {}
        ) {
            it.data
        }
    }

    fun setUdfValueBatch(input: List<RoleSetUdfValueBatchParams>): GraphQLCall<SetUdvBatchResponse, List<UserDefinedData>> {
        if (input.isEmpty()) {
            throw Exception("empty input list")
        }

        val param = SetUdfValueBatchParam(UdfTargetType.ROLE,
            input.flatMap { item ->
                item.data.map { SetUdfValueBatchInput(item.roleCode, it.key, Gson().toJson(it.value)) }
            }
        )

        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<SetUdvBatchResponse>>() {})
        {
            it.result
        }
    }

    fun removeUdfValue(roleCode: String, key: String): GraphQLCall<RemoveUdvResponse, List<UserDefinedData>> {
        val param = RemoveUdvParam(UdfTargetType.ROLE, roleCode, key)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RemoveUdvResponse>>() {}) {
            it.result
        }
    }

}