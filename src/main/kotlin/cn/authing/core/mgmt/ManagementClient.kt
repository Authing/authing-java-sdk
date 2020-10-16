package cn.authing.core.mgmt

import UsersManagementClient
import cn.authing.core.BaseClient
import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

class ManagementClient(userPoolId: String, private val secret: String) : BaseClient(userPoolId) {
    /**
     * 获取管理员 access token，获取成功后即可使用其他接口
     */
    fun requestToken(): GraphQLCall<AccessTokenResponse, AccessTokenRes> {
        val param = AccessTokenParam(userPoolId, secret)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AccessTokenResponse>>() {}) {
            accessToken = it.result.accessToken!!
            return@createGraphQLCall it.result
        }
    }

    /**
     * 检查登录状态
     */
    fun checkLoginStatus(param: CheckLoginStatusParam): GraphQLCall<CheckLoginStatusResponse, JwtTokenStatus> {
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<CheckLoginStatusResponse>>() {}) {
            it.result
        }
    }

    /**
     * 获取用户管理模块
     */
    fun users(): UsersManagementClient {
        return UsersManagementClient(this)
    }

    /**
     * 获取角色管理模块
     */
    fun roles(): RolesManagementClient {
        return RolesManagementClient(this)
    }

    /**
     * 获取权限管理模块
     */
    fun acl(): AclManagementClient {
        return AclManagementClient(this)
    }
}
