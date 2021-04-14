package cn.authing.core.mgmt

import cn.authing.core.BaseClient
import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

class ManagementClient(userPoolId: String,  secret: String) : BaseClient(userPoolId, secret) {

    /**
     * 获取管理员 access token，获取成功后即可使用其他接口
     */
    fun requestToken(): GraphQLCall<AccessTokenResponse, AccessTokenRes> {
        val param = AccessTokenParam(userPoolId!!, secret!!)
        return createGraphQLCall(
            param.createRequest(),
            object : TypeToken<GraphQLResponse<AccessTokenResponse>>() {}) {
            token = it.result.accessToken!!
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

    /**
     * 获取自定义字段管理模块
     */
    fun udf(): UdfManagementClient {
        return UdfManagementClient(this)
    }

    /**
     * 获取策略管理模块
     */
    fun policies(): PoliciesManagementClient {
        return PoliciesManagementClient(this)
    }

    /**
     * 获取用户池管理模块
     */
    fun userpool(): UserpoolManagementClient {
        return UserpoolManagementClient(this)
    }

    /**
     * 获取注册白名单管理模块
     */
    fun whitelist(): WhitelistManagementClient {
        return WhitelistManagementClient(this)
    }

    /**
     * 获取分组管理模块
     */
    fun group(): GroupsManagementClient {
        return GroupsManagementClient(this)
    }

    /**
     * 获取组织机构管理模块
     */
    fun org(): OrgManagementClient {
        return OrgManagementClient(this)
    }

    /**
     * 应用管理模块
     */
    fun application(): ApplicationManagementClient {
        return ApplicationManagementClient(this)
    }

    /**
     * 管理日志统计信息模块
     */
    fun statistics(): StatisticsManagementClient {
        return StatisticsManagementClient(this)
    }
}
