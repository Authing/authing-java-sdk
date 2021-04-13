package cn.authing.core.mgmt

import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLException
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

/**
 * 管理注册白名单
 */
class WhitelistManagementClient(private val client: ManagementClient) {

    /**
     * 获取白名单记录
     */
    fun list(type: WhitelistType): GraphQLCall<WhitelistResponse, List<WhiteList>> {
        val param = WhitelistParam(type)
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<WhitelistResponse>>() {}) {
            it.result
        }
    }

    /**
     * 添加白名单
     * @param {WhitelistType} type 白名单类型，USERNAME 为用户名、Email 为邮箱、Phone 为手机号。
     * @param {string[]} list 白名单列表，请注意邮箱不区分大小写。
     */
    fun add(param: AddWhitelistParam): GraphQLCall<AddWhitelistResponse, List<WhiteList>> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AddWhitelistResponse>>() {}) {
            it.result
        }
    }

    /**
     * 移除白名单
     */
    fun remove(param: RemoveWhitelistParam): GraphQLCall<RemoveWhitelistResponse, List<WhiteList>> {
        return client.createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<RemoveWhitelistResponse>>() {}) {
            it.result
        }
    }

    /**
     * 开启白名单
     */
    fun enable(type: WhitelistType): GraphQLCall<UpdateUserpoolResponse, UserPool> {
        return enableOrDisable(type, true)
    }

    /**
     * 关闭白名单
     */
    fun disable(type: WhitelistType): GraphQLCall<UpdateUserpoolResponse, UserPool> {
        return enableOrDisable(type, false)
    }

    private fun enableOrDisable(type: WhitelistType, action: Boolean): GraphQLCall<UpdateUserpoolResponse, UserPool> {
        val updatesWhite = RegisterWhiteListConfigInput()
        when (type) {
            WhitelistType.EMAIL -> updatesWhite.emailEnabled = action
            WhitelistType.PHONE -> updatesWhite.phoneEnabled = action
            WhitelistType.USERNAME -> updatesWhite.usernameEnabled = action
            else -> {
                throw GraphQLException(message = "不支持的白名单类型")
            }
        }

        val updates = UpdateUserpoolInput(whitelist = updatesWhite)
        return client.userpool().update(updates)
    }
}