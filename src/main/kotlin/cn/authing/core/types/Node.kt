package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
import com.google.gson.annotations.SerializedName


data class Node(
    /** @param [id] id */
    @SerializedName("id")
    var id: String,
    /** @param [orgId] 组织机构 ID */
    @SerializedName("orgId")
    var orgId: String? = null,
    /** @param [name] 节点名称 */
    @SerializedName("name")
    var name: String,
    /** @param [nameI18n] 多语言名称，**key** 为标准 **i18n** 语言编码，**value** 为对应语言的名称。 */
    @SerializedName("nameI18n")
    var nameI18n: String? = null,
    /** @param [description] 描述信息 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [descriptionI18n] 多语言描述信息 */
    @SerializedName("descriptionI18n")
    var descriptionI18n: String? = null,
    /** @param [order] 在父节点中的次序值。**order** 值大的排序靠前。有效的值范围是[0, 2^32) */
    @SerializedName("order")
    var order: Int? = null,
    /** @param [code] 节点唯一标志码，可以通过 code 进行搜索 */
    @SerializedName("code")
    var code: String? = null,
    /** @param [root] 是否为根节点 */
    @SerializedName("root")
    var root: Boolean? = null,
    /** @param [depth] 距离父节点的深度（如果是查询整棵树，返回的 **depth** 为距离根节点的深度，如果是查询某个节点的子节点，返回的 **depth** 指的是距离该节点的深度。） */
    @SerializedName("depth")
    var depth: Int? = null,
    /** @param [path] path */
    @SerializedName("path")
    var path: List<String>,
    /** @param [codePath] codePath */
    @SerializedName("codePath")
    var codePath: List<String>,
    /** @param [namePath] namePath */
    @SerializedName("namePath")
    var namePath: List<String>,
    /** @param [createdAt] createdAt */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] updatedAt */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [children] 该节点的子节点 **ID** 列表 */
    @SerializedName("children")
    var children: List<String>? = null,
    /** @param [users] 节点的用户列表 */
    @SerializedName("users")
    var users: PaginatedUsers
)

data class DeleteNodeResponse(

    @SerializedName("deleteNode")
    val result: CommonMessage
)

class DeleteNodeParam @JvmOverloads constructor(
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("nodeId")
    var nodeId: String
) {


    fun build(): DeleteNodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deleteNodeDocument,
            this
        );
    }

    private val deleteNodeDocument: String = """
mutation deleteNode(${'$'}orgId: String!, ${'$'}nodeId: String!) {
  deleteNode(orgId: ${'$'}orgId, nodeId: ${'$'}nodeId) {
    message
    code
  }
}
"""
}


data class UpdateNodeResponse(

    @SerializedName("updateNode")
    val result: Node
)

class UpdateNodeParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("description")
    var description: String? = null
) {

    fun withPage(page: Int?): UpdateNodeParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): UpdateNodeParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): UpdateNodeParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): UpdateNodeParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun withName(name: String?): UpdateNodeParam {
        this.name = name
        return this
    }

    fun withCode(code: String?): UpdateNodeParam {
        this.code = code
        return this
    }

    fun withDescription(description: String?): UpdateNodeParam {
        this.description = description
        return this
    }

    fun build(): UpdateNodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            updateNodeDocument,
            this
        );
    }

    private val updateNodeDocument: String = """
mutation updateNode(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}id: String!, ${'$'}name: String, ${'$'}code: String, ${'$'}description: String) {
  updateNode(id: ${'$'}id, name: ${'$'}name, code: ${'$'}code, description: ${'$'}description) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
    }
  }
}
"""
}


data class AddNodeResponse(

    @SerializedName("addNodeV2")
    val result: Node
)

class AddNodeParam @JvmOverloads constructor(
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("parentNodeId")
    var parentNodeId: String? = null,
    @SerializedName("name")
    var name: String,
    @SerializedName("nameI18n")
    var nameI18n: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("descriptionI18n")
    var descriptionI18n: String? = null,
    @SerializedName("order")
    var order: Int? = null,
    @SerializedName("code")
    var code: String? = null
) {

    fun withParentNodeId(parentNodeId: String?): AddNodeParam {
        this.parentNodeId = parentNodeId
        return this
    }

    fun withNameI18n(nameI18n: String?): AddNodeParam {
        this.nameI18n = nameI18n
        return this
    }

    fun withDescription(description: String?): AddNodeParam {
        this.description = description
        return this
    }

    fun withDescriptionI18n(descriptionI18n: String?): AddNodeParam {
        this.descriptionI18n = descriptionI18n
        return this
    }

    fun withOrder(order: Int?): AddNodeParam {
        this.order = order
        return this
    }

    fun withCode(code: String?): AddNodeParam {
        this.code = code
        return this
    }

    fun build(): AddNodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            addNodeDocument,
            this
        );
    }

    private val addNodeDocument: String = """
mutation addNodeV2(${'$'}orgId: String!, ${'$'}parentNodeId: String, ${'$'}name: String!, ${'$'}nameI18n: String, ${'$'}description: String, ${'$'}descriptionI18n: String, ${'$'}order: Int, ${'$'}code: String) {
  addNodeV2(orgId: ${'$'}orgId, parentNodeId: ${'$'}parentNodeId, name: ${'$'}name, nameI18n: ${'$'}nameI18n, description: ${'$'}description, descriptionI18n: ${'$'}descriptionI18n, order: ${'$'}order, code: ${'$'}code) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
  }
}
"""
}


data class MoveNodeResponse(

    @SerializedName("moveNode")
    val result: Org
)

class MoveNodeParam @JvmOverloads constructor(
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("nodeId")
    var nodeId: String,
    @SerializedName("targetParentId")
    var targetParentId: String
) {


    fun build(): MoveNodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            moveNodeDocument,
            this
        );
    }

    private val moveNodeDocument: String = """
mutation moveNode(${'$'}orgId: String!, ${'$'}nodeId: String!, ${'$'}targetParentId: String!) {
  moveNode(orgId: ${'$'}orgId, nodeId: ${'$'}nodeId, targetParentId: ${'$'}targetParentId) {
    id
    rootNode {
      id
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
    nodes {
      id
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
  }
}
"""
}


data class ChildrenNodesResponse(

    @SerializedName("childrenNodes")
    val result: List<Node>
)

class ChildrenNodesParam @JvmOverloads constructor(
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("nodeId")
    var nodeId: String
) {


    fun build(): ChildrenNodesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            childrenNodesDocument,
            this
        );
    }

    private val childrenNodesDocument: String = """
query childrenNodes(${'$'}orgId: String!, ${'$'}nodeId: String!) {
  childrenNodes(orgId: ${'$'}orgId, nodeId: ${'$'}nodeId) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
  }
}
"""
}


data class IsRootNodeResponse(

    @SerializedName("isRootNode")
    val result: Boolean
)

class IsRootNodeParam @JvmOverloads constructor(
    @SerializedName("nodeId")
    var nodeId: String,
    @SerializedName("orgId")
    var orgId: String
) {


    fun build(): IsRootNodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            isRootNodeDocument,
            this
        );
    }

    private val isRootNodeDocument: String = """
query isRootNode(${'$'}nodeId: String!, ${'$'}orgId: String!) {
  isRootNode(nodeId: ${'$'}nodeId, orgId: ${'$'}orgId)
}
"""
}


data class NodeByCodeResponse(

    @SerializedName("nodeByCode")
    val result: Node
)

class NodeByCodeParam @JvmOverloads constructor(
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("code")
    var code: String
) {


    fun build(): NodeByCodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            nodeByCodeDocument,
            this
        );
    }

    private val nodeByCodeDocument: String = """
query nodeByCode(${'$'}orgId: String!, ${'$'}code: String!) {
  nodeByCode(orgId: ${'$'}orgId, code: ${'$'}code) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
  }
}
"""
}


data class NodeByIdResponse(

    @SerializedName("nodeById")
    val result: Node
)

class NodeByIdParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


    fun build(): NodeByIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            nodeByIdDocument,
            this
        );
    }

    private val nodeByIdDocument: String = """
query nodeById(${'$'}id: String!) {
  nodeById(id: ${'$'}id) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
  }
}
"""
}


data class NodeByIdWithMembersResponse(

    @SerializedName("nodeById")
    val result: Node
)

class NodeByIdWithMembersParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("id")
    var id: String
) {

    fun withPage(page: Int?): NodeByIdWithMembersParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): NodeByIdWithMembersParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): NodeByIdWithMembersParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): NodeByIdWithMembersParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun build(): NodeByIdWithMembersParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            nodeByIdWithMembersDocument,
            this
        );
    }

    private val nodeByIdWithMembersDocument: String = """
query nodeByIdWithMembers(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}id: String!) {
  nodeById(id: ${'$'}id) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
      list {
        id
        arn
        userPoolId
        username
        email
        emailVerified
        phone
        phoneVerified
        unionid
        openid
        nickname
        registerSource
        photo
        password
        oauth
        token
        tokenExpiredAt
        loginsCount
        lastLogin
        lastIP
        signedUp
        blocked
        isDeleted
        device
        browser
        company
        name
        givenName
        familyName
        middleName
        profile
        preferredUsername
        website
        gender
        birthdate
        zoneinfo
        locale
        address
        formatted
        streetAddress
        locality
        region
        postalCode
        city
        province
        country
        createdAt
        updatedAt
        externalId
      }
    }
  }
}
"""
}


data class RootNodeResponse(

    @SerializedName("rootNode")
    val result: Node
)

class RootNodeParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("orgId")
    var orgId: String
) {

    fun withPage(page: Int?): RootNodeParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): RootNodeParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): RootNodeParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): RootNodeParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun build(): RootNodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            rootNodeDocument,
            this
        );
    }

    private val rootNodeDocument: String = """
query rootNode(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}orgId: String!) {
  rootNode(orgId: ${'$'}orgId) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
    }
  }
}
"""
}


data class NodeByCodeWithMembersResponse(

    @SerializedName("nodeByCode")
    val result: Node
)

class NodeByCodeWithMembersParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("code")
    var code: String
) {

    fun withPage(page: Int?): NodeByCodeWithMembersParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): NodeByCodeWithMembersParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): NodeByCodeWithMembersParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): NodeByCodeWithMembersParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun build(): NodeByCodeWithMembersParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            nodeByCodeWithMembersDocument,
            this
        );
    }

    private val nodeByCodeWithMembersDocument: String = """
query nodeByCodeWithMembers(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}orgId: String!, ${'$'}code: String!) {
  nodeByCode(orgId: ${'$'}orgId, code: ${'$'}code) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
      list {
        id
        arn
        userPoolId
        username
        email
        emailVerified
        phone
        phoneVerified
        unionid
        openid
        nickname
        registerSource
        photo
        password
        oauth
        token
        tokenExpiredAt
        loginsCount
        lastLogin
        lastIP
        signedUp
        blocked
        isDeleted
        device
        browser
        company
        name
        givenName
        familyName
        middleName
        profile
        preferredUsername
        website
        gender
        birthdate
        zoneinfo
        locale
        address
        formatted
        streetAddress
        locality
        region
        postalCode
        city
        province
        country
        createdAt
        updatedAt
        externalId
      }
    }
  }
}
"""
}


data class AddMemberResponse(

    @SerializedName("addMember")
    val result: Node
)

class AddMemberParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("nodeId")
    var nodeId: String? = null,
    @SerializedName("orgId")
    var orgId: String? = null,
    @SerializedName("nodeCode")
    var nodeCode: String? = null,
    @SerializedName("userIds")
    var userIds: List<String>,
    @SerializedName("isLeader")
    var isLeader: Boolean? = null
) {

    fun withPage(page: Int?): AddMemberParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): AddMemberParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): AddMemberParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): AddMemberParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun withNodeId(nodeId: String?): AddMemberParam {
        this.nodeId = nodeId
        return this
    }

    fun withOrgId(orgId: String?): AddMemberParam {
        this.orgId = orgId
        return this
    }

    fun withNodeCode(nodeCode: String?): AddMemberParam {
        this.nodeCode = nodeCode
        return this
    }

    fun withIsLeader(isLeader: Boolean?): AddMemberParam {
        this.isLeader = isLeader
        return this
    }

    fun build(): AddMemberParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            addMemberDocument,
            this
        );
    }

    private val addMemberDocument: String = """
mutation addMember(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}nodeId: String, ${'$'}orgId: String, ${'$'}nodeCode: String, ${'$'}userIds: [String!]!, ${'$'}isLeader: Boolean) {
  addMember(nodeId: ${'$'}nodeId, orgId: ${'$'}orgId, nodeCode: ${'$'}nodeCode, userIds: ${'$'}userIds, isLeader: ${'$'}isLeader) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
      list {
        id
        arn
        userPoolId
        username
        email
        emailVerified
        phone
        phoneVerified
        unionid
        openid
        nickname
        registerSource
        photo
        password
        oauth
        token
        tokenExpiredAt
        loginsCount
        lastLogin
        lastIP
        signedUp
        blocked
        isDeleted
        device
        browser
        company
        name
        givenName
        familyName
        middleName
        profile
        preferredUsername
        website
        gender
        birthdate
        zoneinfo
        locale
        address
        formatted
        streetAddress
        locality
        region
        postalCode
        city
        province
        country
        createdAt
        updatedAt
        externalId
      }
    }
  }
}
"""
}


data class RemoveMemberResponse(

    @SerializedName("removeMember")
    val result: Node
)

class RemoveMemberParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("nodeId")
    var nodeId: String? = null,
    @SerializedName("orgId")
    var orgId: String? = null,
    @SerializedName("nodeCode")
    var nodeCode: String? = null,
    @SerializedName("userIds")
    var userIds: List<String>
) {

    fun withPage(page: Int?): RemoveMemberParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): RemoveMemberParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): RemoveMemberParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): RemoveMemberParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun withNodeId(nodeId: String?): RemoveMemberParam {
        this.nodeId = nodeId
        return this
    }

    fun withOrgId(orgId: String?): RemoveMemberParam {
        this.orgId = orgId
        return this
    }

    fun withNodeCode(nodeCode: String?): RemoveMemberParam {
        this.nodeCode = nodeCode
        return this
    }

    fun build(): RemoveMemberParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            removeMemberDocument,
            this
        );
    }

    private val removeMemberDocument: String = """
mutation removeMember(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}nodeId: String, ${'$'}orgId: String, ${'$'}nodeCode: String, ${'$'}userIds: [String!]!) {
  removeMember(nodeId: ${'$'}nodeId, orgId: ${'$'}orgId, nodeCode: ${'$'}nodeCode, userIds: ${'$'}userIds) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
      list {
        id
        arn
        userPoolId
        username
        email
        emailVerified
        phone
        phoneVerified
        unionid
        openid
        nickname
        registerSource
        photo
        password
        oauth
        token
        tokenExpiredAt
        loginsCount
        lastLogin
        lastIP
        signedUp
        blocked
        isDeleted
        device
        browser
        company
        name
        givenName
        familyName
        middleName
        profile
        preferredUsername
        website
        gender
        birthdate
        zoneinfo
        locale
        address
        formatted
        streetAddress
        locality
        region
        postalCode
        city
        province
        country
        createdAt
        updatedAt
      }
    }
  }
}
"""
}

data class SearchNodesResponse (

    @SerializedName("searchNodes")
    val result: List<Node>
)

class SearchNodesParam @JvmOverloads constructor (    @SerializedName("keyword")
                                                      var keyword: String)  {


    fun build(): SearchNodesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            searchNodesDocument,
            this
        );
    }

    private val searchNodesDocument: String = """
query searchNodes(${'$'}keyword: String!) {
  searchNodes(keyword: ${'$'}keyword) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    codePath
    namePath
    createdAt
    updatedAt
    children
  }
}
"""
}
