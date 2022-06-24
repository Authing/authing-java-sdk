package cn.authing.core.mgmt

import cn.authing.core.Utils
import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import java.lang.Exception

/**
 * 管理组织机构
 */
class OrgManagementClient(private val client: ManagementClient) {
    /**
     * 创建组织机构
     */
    fun create(param: CreateOrgParam): HttpCall<RestfulResponse<Org>, Org> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/orgs",
            GsonBuilder().create().toJson(param),
            object : TypeToken<RestfulResponse<Org>> () {}
        ) {
            it.data
        }
    }

    /**
     * 删除组织机构
     */
    fun deleteById(id: String): GraphQLCall<DeleteOrgResponse, CommonMessage> {
        val param = DeleteOrgParam(id)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteOrgResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取用户池组织机构列表
     */
    fun list(param: OrgsParam): HttpCall<RestfulResponse<PaginatedOrgs>, PaginatedOrgs> {
        var url = "${client.host}/api/v2/orgs/pagination"
        url += "?limit=${param.limit ?: -1}"
        url += if (param.page != null) "&page=${param.page}" else ""
        url += if (param.sortBy != null) "&sortBy=${param.sortBy}" else ""

        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<PaginatedOrgs>> () {}
        ) {
            it.data
        }
    }

    /**
     * 获取某个节点详情
     */
    fun findNodeById(nodeId: String): GraphQLCall<NodeByIdResponse, Node> {
        val param = NodeByIdParam(id = nodeId)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<NodeByIdResponse>>() {}) {
            it.result
        }
    }

    /**
     * 在组织机构中添加一个节点
     */
    fun addNode(param: AddNodeV2Param): HttpCall<RestfulResponse<Node>, Node> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/orgs/${param.orgId}/nodes",
            GsonBuilder().create().toJson(param),
            object : TypeToken<RestfulResponse<Node>> () {}
        ) {
            it.data
        }
    }

    /**
     * 修改节点
     */
    fun updateNode(param: UpdateNodeParam): GraphQLCall<UpdateNodeResponse, Node> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdateNodeResponse>>() {}) {
            it.result
        }
    }

    /**
     * 删除节点
     */
    fun deleteNode(param: DeleteNodeParam): GraphQLCall<DeleteNodeResponse, CommonMessage> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteNodeResponse>>() {}) {
            it.result
        }
    }

    /**
     * 移动节点
     */
    fun moveNode(orgId: String, nodeId: String, targetParentId: String): GraphQLCall<MoveNodeResponse, Org> {
        val param = MoveNodeParam(orgId, nodeId, targetParentId);
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<MoveNodeResponse>>() {}) {
            it.result
        }
    }

    /**
     * 判断是否为根节点
     */
    fun isRootNode(nodeId: String, orgId: String): GraphQLCall<IsRootNodeResponse, Boolean> {
        val param = IsRootNodeParam(nodeId = nodeId, orgId = orgId)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<IsRootNodeResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取根节点
     */
    fun rootNode(param: RootNodeParam): GraphQLCall<RootNodeResponse, Node> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RootNodeResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取子节点列表
     */
    fun listChildren(orgId: String, nodeId: String): GraphQLCall<ChildrenNodesResponse, List<Node>> {
        val param = ChildrenNodesParam(orgId = orgId, nodeId = nodeId)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<ChildrenNodesResponse>>() {}) {
            it.result
        }
    }

    /**
     * 搜索组织机构节点
     */
    fun searchNodes(param: SearchNodesParam): HttpCall<RestfulResponse<List<Node>>, List<Node>> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/orgs/nodes/search?q=${param.keyword}",
            object : TypeToken<RestfulResponse<List<Node>>> () {}
        ) {
            it.data
        }
    }

    /**
     * 节点添加成员
     */
    fun addMembers(nodeId: String, userIds: List<String>): HttpCall<RestfulResponse<Node>, Node> {
        val options = RestAddMembersParams(nodeId, userIds)
        return client.createHttpPostCall(
            "${client.host}/api/v2/orgs/nodes/${options.nodeId}/members",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<Node>> () {}
        ) {
            it.data
        }
    }

    /**
     * 获取节点成员
     */
    fun listMembers(param: NodeByIdWithMembersParam): GraphQLCall<NodeByIdWithMembersResponse, Node> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<NodeByIdWithMembersResponse>>() {}) {
            it.result
        }
    }

    /**
     * 节点删除成员
     */
    fun removeMembers(nodeId: String, userIds: List<String>): GraphQLCall<RemoveMemberResponse, Node> {
        val param = RemoveMemberParam(nodeId = nodeId, userIds = userIds)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RemoveMemberResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取组织机构详情
     */
    fun findById(id: String): GraphQLCall<OrgResponse, Org> {
        val param = OrgParam(id)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<OrgResponse>>() {}) {
            it.result
        }
    }

    /**
     * 通过 JSON 导入
     */
    fun importByJson(json: String): HttpCall<RestfulResponse<OrgNode>, OrgNode> {
        val gson = Gson()
        val node = gson.fromJson(json, Map::class.java)
        val data = mapOf("filetype" to "json", "file" to node)

        val dataStr = gson.toJson(data)
        return client.createHttpPostCall(
            "${client.host}/api/v2/orgs/import",
            dataStr,
            object : TypeToken<RestfulResponse<OrgNode>>() {}) {
            it.data
        }
    }

    /**
     * 导出所有组织机构
     */
    fun exportAll(): HttpCall<RestfulResponse<List<OrgNode>>, List<OrgNode>> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/orgs/export",
            object : TypeToken<RestfulResponse<List<OrgNode>>>() {}) {
            it.data
        }
    }

    /**
     * 导出某个组织机构
     */
    fun exportByOrgId(orgId: String): HttpCall<RestfulResponse<OrgNode>, OrgNode> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/orgs/export?org_id=${orgId}",
            object : TypeToken<RestfulResponse<OrgNode>>() {}) {
            it.data
        }
    }

    /**
     * 获取组织机构节点被授权的所有资源
     */
    fun listAuthorizedResourcesByNodeId(
        param: ListNodeByIdAuthorizedResourcesParam
    ): GraphQLCall<ListNodeByIdAuthorizedResourcesResponse, Node> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<ListNodeByIdAuthorizedResourcesResponse>>() {}
        ) { it.result }
    }

    /**
     * 移动节点成员
     */
    fun moveMembers(options: MoveMembersParam) : GraphQLCall<MoveMembersResponse, CommonMessage>  {
        return client.createGraphQLCall(
            options.createRequest(),
            object : TypeToken<GraphQLResponse<MoveMembersResponse>>() {}
        ) { it.moveMembers }
    }

    /**
     * 设置用户主部门
     */
    fun setMainDepartment(userId: String, departmentId: String):GraphQLCall<SetMainDepartmentResponse, CommonMessage> {
        var param = SetMainDepartmentParam(userId, departmentId)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<SetMainDepartmentResponse>>() {}
        ) { it.result}
    }

    /**
     * @description 获取组织机构节点被授权的所有资源
     *
     * @param orgId: 组织机构 ID；
     * @param code: 节点 code
     * @param namespace: 权限组 namespace code
     * @param options.resourceType 资源类型
     */
    fun listAuthorizedResourcesByNodeCode(
        param: ListNodeByCodeAuthorizedResourcesParam
    ): GraphQLCall<ListNodeByCodeAuthorizedResourcesResponse, Node> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<ListNodeByCodeAuthorizedResourcesResponse>>() {}
        ) {
            it.result
        }
    }

    /**
     * 组织机构同步
     */
    fun startSync(options: OrgStartSyncOptions): HttpCall<RestfulResponse<Org>, Boolean> {
        val providerType = options.providerType;
        val adConnectorId = options.adConnectorId;
        var url = "";
        if (providerType == "wechatwork") {
            url = "${client.host}/connections/enterprise/wechatwork/start-sync"
        } else if (providerType == "dingtalk") {
            url = "${client.host}/connections/enterprise/dingtalk/start-sync"
        } else if (providerType == "ad") {
            if (adConnectorId == null || adConnectorId == "") {
                throw Exception("must provider adConnectorId");
            }
            url = "${client.host}/api/v2/ad/sync"
        }

        val param = OrgStartSyncParam(adConnectorId)
        return client.createHttpPostCall(
            url,
            GsonBuilder().create().toJson(param),
            object : TypeToken<RestfulResponse<Org>> () {}
        ) {
            it.code == 200
        }
    }

    /**
     * @description 通过租户 ID 获取对应的组织机构
     * @param tenantId 租户 ID
     */
    fun getOrgByTenantId(
        tenantId: String
        ): HttpCall<RestfulResponse<List<TenantOrgNode>>, List<TenantOrgNode>> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/orgs/by-tenant?tenant_id=${tenantId}",
            object : TypeToken<RestfulResponse<List<TenantOrgNode>>>() {}) {
            it.data
        }
    }
}