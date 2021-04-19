package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLException
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * 管理分组
 */
class GroupsManagementClient(private val client: ManagementClient) {
    /**
     * 创建分组
     */
    fun create(param: CreateGroupParam): GraphQLCall<CreateGroupResponse, Group> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<CreateGroupResponse>>() {}) {
            it.result
        }
    }

    /**
     * 删除分组
     */
    fun delete(code: String): GraphQLCall<DeleteGroupsResponse, CommonMessage> {
        val param = DeleteGroupsParam(listOf(code))
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteGroupsResponse>>() {}) {
            it.result
        }
    }


    /**
     * 更新分组
     */
    fun update(param: UpdateGroupParam): GraphQLCall<UpdateGroupResponse, Group> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<UpdateGroupResponse>>() {}) {
            it.result
        }
    }

    /**
     * 分组详情
     */
    fun detail(code: String): GraphQLCall<GroupResponse, Group> {
        val param = GroupParam(code)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<GroupResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取分组列表
     */
    fun list(param: GroupsParam): GraphQLCall<GroupsResponse, PaginatedGroups> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<GroupsResponse>>() {}) {
            it.result
        }
    }

    /**
     * 批量删除分组
     */
    fun deleteMany(codeList: List<String>): GraphQLCall<DeleteGroupsResponse, CommonMessage> {
        val param = DeleteGroupsParam(codeList)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<DeleteGroupsResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取用户列表
     */
    fun listUsers(code: String): GraphQLCall<GroupWithUsersResponse, PaginatedUsers> {
        val param = GroupWithUsersParam(code)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<GroupWithUsersResponse>>() {}) {
            it.result.users
        }
    }
    /**
     * 获取用户列表, 带分页参数
     */
    fun listUsers(param: GroupWithUsersParam): GraphQLCall<GroupWithUsersResponse, PaginatedUsers> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<GroupWithUsersResponse>>() {}) {
            it.result.users
        }
    }

    /**
     * 批量添加用户
     */
    fun addUsers(param: AddUserToGroupParam): GraphQLCall<AddUserToGroupResponse, CommonMessage> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AddUserToGroupResponse>>() {}) {
            it.result
        }
    }

    /**
     * 批量移除用户
     */
    fun removeUsers(param: RemoveUserFromGroupParam): GraphQLCall<RemoveUserFromGroupResponse, CommonMessage> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RemoveUserFromGroupResponse>>() {}) {
            it.result
        }
    }

    fun listAuthorizedResources(
        param: ListGroupAuthorizedResourcesParam
    ): GraphQLCall<ListGroupAuthorizedResourcesResponse, Group> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<ListGroupAuthorizedResourcesResponse>>() {}
        ) {
            it.result
        }
    }
}