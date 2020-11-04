package cn.authing.core.types

import com.google.gson.annotations.SerializedName

data class Org(
    /** @param [id] 组织机构 ID */
    @SerializedName("id")
    var id: String,
    /** @param [rootNode] 根节点 */
    @SerializedName("rootNode")
    var rootNode: Node,
    /** @param [nodes] 组织机构节点列表 */
    @SerializedName("nodes")
    var nodes: List<Node>
)

data class OrgResponse(

    @SerializedName("org")
    val result: Org
)

data class OrgsResponse(

    @SerializedName("orgs")
    val result: PaginatedOrgs
)

data class CreateOrgResponse(

    @SerializedName("createOrg")
    val result: Org
)

data class DeleteOrgResponse(

    @SerializedName("deleteOrg")
    val result: CommonMessage
)

data class PaginatedOrgs(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<Org>
)
