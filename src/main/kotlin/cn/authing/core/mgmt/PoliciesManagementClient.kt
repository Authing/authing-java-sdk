package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

/**
 * 策略管理类
 */
class PoliciesManagementClient(private val client: ManagementClient) {
    /**
     * 获取策略列表
     */
    @JvmOverloads
    fun list(
        page: Int? = null,
        limit: Int? = null,
        namespace: String? = null
    ): GraphQLCall<PoliciesResponse, PaginatedPolicies> {
        val param = PoliciesParam(page, limit, namespace)
        return list(param)
    }

    /**
     * 获取策略列表
     */
    fun list(param: PoliciesParam): GraphQLCall<PoliciesResponse, PaginatedPolicies> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<PoliciesResponse>>() {}) {
            it.result
        }
    }

    /**
     * 创建策略
     */
    @JvmOverloads
    fun create(
        code: String,
        statements: List<PolicyStatementInput>,
        description: String? = null,
        namespace: String? = null
    ): GraphQLCall<CreatePolicyResponse, Policy> {
        val param = CreatePolicyParam(namespace, code, description, statements)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<CreatePolicyResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取策略详情
     */
    fun detail(code: String, namespace: String? = null): GraphQLCall<PolicyResponse, Policy> {
        val param = PolicyParam(namespace, code)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<PolicyResponse>>() {}) {
            it.result
        }
    }

    /**
     * 修改策略
     */
    @JvmOverloads
    fun update(
        code: String,
        statements: List<PolicyStatementInput>? = null,
        description: String? = null,
        newCode: String? = null,
        namespace: String? = null
    ): GraphQLCall<UpdatePolicyResponse, Policy> {
        val param = UpdatePolicyParam(namespace, code).withStatements(statements).withDescription(description)
            .withNewCode(newCode)
        return update(param)
    }

    /**
     * 修改策略
     */
    fun update(param: UpdatePolicyParam): GraphQLCall<UpdatePolicyResponse, Policy> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdatePolicyResponse>>() {}) {
            it.result
        }
    }

    /**
     * 删除策略
     */
    fun delete(code: String): GraphQLCall<DeletePolicyResponse, CommonMessage> {
        val param = DeletePolicyParam(code)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeletePolicyResponse>>() {}) {
            it.result
        }
    }

    /**
     * 批量删除策略
     */
    fun deleteMany(codeList: List<String>): GraphQLCall<DeletePoliciesResponse, CommonMessage> {
        val param = DeletePoliciesParam(codeList)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeletePoliciesResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取策略授权记录
     */
    @JvmOverloads
    fun listAssignments(
        code: String,
        page: Int? = null,
        limit: Int? = null
    ): GraphQLCall<PolicyAssignmentsResponse, PaginatedPolicyAssignments> {
        val param = PolicyAssignmentsParam(code, page = page, limit = limit)
        return listAssignments(param)
    }

    /**
     * 获取策略授权记录
     */
    fun listAssignments(param: PolicyAssignmentsParam): GraphQLCall<PolicyAssignmentsResponse, PaginatedPolicyAssignments> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<PolicyAssignmentsResponse>>() {}) {
            it.result
        }
    }

    /**
     * 添加策略授权
     */
    fun addAssignments(
        policies: List<String>,
        targetType: PolicyAssignmentTargetType,
        targetIdentifiers: List<String>
    ): GraphQLCall<AddPolicyAssignmentsResponse, CommonMessage> {
        val param = AddPolicyAssignmentsParam(policies, targetType, targetIdentifiers)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AddPolicyAssignmentsResponse>>() {}) {
            it.result
        }
    }

    /**
     * 撤销策略授权
     */
    fun removeAssignments(
        policies: List<String>,
        targetType: PolicyAssignmentTargetType,
        targetIdentifiers: List<String>
    ): GraphQLCall<RemovePolicyAssignmentsResponse, CommonMessage> {
        val param = RemovePolicyAssignmentsParam(policies, targetType, targetIdentifiers)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RemovePolicyAssignmentsResponse>>() {}) {
            it.result
        }
    }

    /**
     * 设置策略授权状态为关闭
     */
    fun disableAssignment(
        policy: String,
        targetType: PolicyAssignmentTargetType,
        targetIdentifier: String,
        namespace: String? = null
    ): GraphQLCall<DisableAssignmentResponse, CommonMessage> {
        val param = DisableAssignmentParam(policy, targetType, targetIdentifier, namespace)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DisableAssignmentResponse>>() {}) {
            it.disbalePolicyAssignment
        }
    }

    /**
     * 设置策略授权状态为开启
     */
    fun enableAssignment(
        policy: String,
        targetType: PolicyAssignmentTargetType,
        targetIdentifier: String,
        namespace: String? = null
    ): GraphQLCall<EnableAssignmentResponse, CommonMessage> {
        val param = EnableAssignmentParam(policy, targetType, targetIdentifier, namespace)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<EnableAssignmentResponse>>() {}) {
            it.enablePolicyAssignment
        }
    }

}