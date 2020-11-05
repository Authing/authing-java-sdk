package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
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


class OrgParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


    fun build(): OrgParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            orgDocument,
            this
        );
    }

    private val orgDocument: String = """
query org(${'$'}id: String!) {
  org(id: ${'$'}id) {
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

class OrgsParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null
) {

    fun withPage(page: Int?): OrgsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): OrgsParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): OrgsParam {
        this.sortBy = sortBy
        return this
    }

    fun build(): OrgsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            orgsDocument,
            this
        );
    }

    private val orgsDocument: String = """
query orgs(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  orgs(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
    totalCount
    list {
      id
      rootNode {
        id
        name
        nameI18n
        path
        description
        descriptionI18n
        order
        code
        root
        depth
        createdAt
        updatedAt
        children
      }
      nodes {
        id
        name
        path
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
      }
    }
  }
}
"""
}

class CreateOrgParam @JvmOverloads constructor(
    @SerializedName("name")
    var name: String,
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("description")
    var description: String? = null
) {

    fun withCode(code: String?): CreateOrgParam {
        this.code = code
        return this
    }

    fun withDescription(description: String?): CreateOrgParam {
        this.description = description
        return this
    }

    fun build(): CreateOrgParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            createOrgDocument,
            this
        );
    }

    private val createOrgDocument: String = """
mutation createOrg(${'$'}name: String!, ${'$'}code: String, ${'$'}description: String) {
  createOrg(name: ${'$'}name, code: ${'$'}code, description: ${'$'}description) {
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


class DeleteOrgParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


    fun build(): DeleteOrgParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deleteOrgDocument,
            this
        );
    }

    private val deleteOrgDocument: String = """
mutation deleteOrg(${'$'}id: String!) {
  deleteOrg(id: ${'$'}id) {
    message
    code
  }
}
"""
}

