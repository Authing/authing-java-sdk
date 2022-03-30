package cn.authing.core.mgmt

import cn.authing.core.BaseClient
import cn.authing.core.common.CommonMethodClient
import cn.authing.core.graphql.GraphQLCall
import cn.authing.core.graphql.GraphQLRequest
import cn.authing.core.graphql.GraphQLResponse
import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.auth0.jwt.JWT
import com.google.gson.reflect.TypeToken
import java.util.*

class ManagementClient(userPoolId: String, secret: String) : BaseClient() {

    init {
        this.userPoolId = userPoolId

        this.secret = secret
    }


    override fun <TData, TResult> createGraphQLCall(
        request: GraphQLRequest,
        typeToken: TypeToken<GraphQLResponse<TData>>,
        resolver: (data: TData) -> TResult
    ): GraphQLCall<TData, TResult> {
        this.checkToken()
        return super.createGraphQLCall(request, typeToken, resolver)
    }

    override fun <TData, TResult> createHttpGetCall(
        url: String,
        typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        this.checkToken()
        return super.createHttpGetCall(url, typeToken, resolver)
    }

    override fun <TData, TResult> createHttpDeleteCall(
        url: String,
        typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        this.checkToken()
        return super.createHttpDeleteCall(url, typeToken, resolver)
    }

    override fun <TData, TResult> createHttpPatchCall(
        url: String,
        body: String,
        typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        this.checkToken()
        return super.createHttpPatchCall(url, body, typeToken, resolver)
    }

    override fun <TData, TResult> createHttpPostCall(
        url: String,
        body: String,
        typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        this.checkToken()
        return super.createHttpPostCall(url, body, typeToken, resolver)
    }

    override fun <TData, TResult> createHttpPutCall(
        url: String,
        body: String,
        typeToken: TypeToken<TData>,
        resolver: (data: TData) -> TResult
    ): HttpCall<TData, TResult> {
        this.checkToken()
        return super.createHttpPutCall(url, body, typeToken, resolver)
    }

    /**
     * 获取管理员 access token，获取成功后即可使用其他接口
     */
    fun requestToken(): HttpCall<AccessTokenRes, AccessTokenRes> {

        val url = "${this.host}/api/v2/userpools/accessToken?userPoolId=${this.userPoolId}&secret=${this.secret}"

        return super.createHttpGetCall(
            url,
            object : TypeToken<AccessTokenRes>() {}
        ) {
            token = it.accessToken!!
            accessTokenExpiresAt = JWT.decode(token).claims["exp"]?.asLong()?.times(1000)
            it
        }
    }

    private fun checkToken() {
        if (this.token == null)
            this.requestToken().execute()
        if (accessTokenExpiresAt!! < Date().time + 3600 * 1000)
            this.requestToken().execute()
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

    fun mfa(): MFAManagementClient {
        return MFAManagementClient(this)
    }

    fun tanantManagement(): TenantManagementClient {
        return TenantManagementClient(this)
    }

    /**
     * 通用模块
     */
    fun commonMethod(): CommonMethodClient {
        return CommonMethodClient(this)
    }
}
