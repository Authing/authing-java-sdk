package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
import com.google.gson.annotations.SerializedName


data class Group(
    /** @param [code] 唯一标志 code */
    @SerializedName("code")
    var code: String,
    /** @param [name] 名称 */
    @SerializedName("name")
    var name: String,
    /** @param [description] 描述 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [createdAt] 创建时间 */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] 修改时间 */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [users] 包含的用户列表 */
    @SerializedName("users")
    var users: PaginatedUsers
)

data class PaginatedGroups(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<Group>
)


data class GroupResponse(

    @SerializedName("group")
    val result: Group
)

class GroupParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String
) {


    fun build(): GroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            groupDocument,
            this
        );
    }

    private val groupDocument: String = """
query group(${'$'}code: String!) {
  group(code: ${'$'}code) {
    code
    name
    description
    createdAt
    updatedAt
  }
}
"""
}


data class CreateGroupResponse(

    @SerializedName("createGroup")
    val result: Group
)

class CreateGroupParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("description")
    var description: String? = null
) {

    fun withDescription(description: String?): CreateGroupParam {
        this.description = description
        return this
    }

    fun build(): CreateGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            createGroupDocument,
            this
        );
    }

    private val createGroupDocument: String = """
mutation createGroup(${'$'}code: String!, ${'$'}name: String!, ${'$'}description: String) {
  createGroup(code: ${'$'}code, name: ${'$'}name, description: ${'$'}description) {
    code
    name
    description
    createdAt
    updatedAt
  }
}
"""
}

data class GroupsResponse(

    @SerializedName("groups")
    val result: PaginatedGroups
)

class GroupsParam @JvmOverloads constructor(
    @SerializedName("userId")
    var userId: String? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null
) {

    fun withUserId(userId: String?): GroupsParam {
        this.userId = userId
        return this
    }

    fun withPage(page: Int?): GroupsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): GroupsParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): GroupsParam {
        this.sortBy = sortBy
        return this
    }

    fun build(): GroupsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            groupsDocument,
            this
        );
    }

    private val groupsDocument: String = """
query groups(${'$'}userId: String, ${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  groups(userId: ${'$'}userId, page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
    totalCount
    list {
      code
      name
      description
      createdAt
      updatedAt
    }
  }
}
"""
}


data class UpdateGroupResponse(

    @SerializedName("updateGroup")
    val result: Group
)

class UpdateGroupParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("newCode")
    var newCode: String? = null
) {

    fun withName(name: String?): UpdateGroupParam {
        this.name = name
        return this
    }

    fun withDescription(description: String?): UpdateGroupParam {
        this.description = description
        return this
    }

    fun withNewCode(newCode: String?): UpdateGroupParam {
        this.newCode = newCode
        return this
    }

    fun build(): UpdateGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            updateGroupDocument,
            this
        );
    }

    private val updateGroupDocument: String = """
mutation updateGroup(${'$'}code: String!, ${'$'}name: String, ${'$'}description: String, ${'$'}newCode: String) {
  updateGroup(code: ${'$'}code, name: ${'$'}name, description: ${'$'}description, newCode: ${'$'}newCode) {
    code
    name
    description
    createdAt
    updatedAt
  }
}
"""
}


data class DeleteGroupsResponse(

    @SerializedName("deleteGroups")
    val result: CommonMessage
)

class DeleteGroupsParam @JvmOverloads constructor(
    @SerializedName("codeList")
    var codeList: List<String>
) {


    fun build(): DeleteGroupsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deleteGroupsDocument,
            this
        );
    }

    private val deleteGroupsDocument: String = """
mutation deleteGroups(${'$'}codeList: [String!]!) {
  deleteGroups(codeList: ${'$'}codeList) {
    message
    code
  }
}
"""
}


data class GroupWithUsersResponse(

    @SerializedName("group")
    val result: Group
)

class GroupWithUsersParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null
) {

    fun withPage(page: Int?): GroupWithUsersParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): GroupWithUsersParam {
        this.limit = limit
        return this
    }

    fun build(): GroupWithUsersParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            groupWithUsersDocument,
            this
        );
    }

    private val groupWithUsersDocument: String = """
query groupWithUsers(${'$'}code: String!, ${'$'}page: Int, ${'$'}limit: Int) {
  group(code: ${'$'}code) {
    users(page: ${'$'}page, limit: ${'$'}limit) {
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

data class AddUserToGroupResponse(

    @SerializedName("addUserToGroup")
    val result: CommonMessage
)

class AddUserToGroupParam @JvmOverloads constructor(
    @SerializedName("userIds")
    var userIds: List<String>,
    @SerializedName("code")
    var code: String? = null
) {

    fun withCode(code: String?): AddUserToGroupParam {
        this.code = code
        return this
    }

    fun build(): AddUserToGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            addUserToGroupDocument,
            this
        );
    }

    private val addUserToGroupDocument: String = """
mutation addUserToGroup(${'$'}userIds: [String!]!, ${'$'}code: String) {
  addUserToGroup(userIds: ${'$'}userIds, code: ${'$'}code) {
    message
    code
  }
}
"""
}


data class RemoveUserFromGroupResponse(

    @SerializedName("removeUserFromGroup")
    val result: CommonMessage
)

class RemoveUserFromGroupParam @JvmOverloads constructor(
    @SerializedName("userIds")
    var userIds: List<String>,
    @SerializedName("code")
    var code: String? = null
) {

    fun withCode(code: String?): RemoveUserFromGroupParam {
        this.code = code
        return this
    }

    fun build(): RemoveUserFromGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            removeUserFromGroupDocument,
            this
        );
    }

    private val removeUserFromGroupDocument: String = """
mutation removeUserFromGroup(${'$'}userIds: [String!]!, ${'$'}code: String) {
  removeUserFromGroup(userIds: ${'$'}userIds, code: ${'$'}code) {
    message
    code
  }
}
"""
}