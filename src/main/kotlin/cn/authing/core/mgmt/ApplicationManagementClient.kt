package cn.authing.core.mgmt

import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

/**
 * 应用管理类
 */
class ApplicationManagementClient(private val client: ManagementClient) {

    /**
     * 获取应用列表
     *
     * @deprecated
     */
    @JvmOverloads
    @Deprecated("方法已经弃用，请使用 list()", ReplaceWith("list (page, limit)"))
    fun listApplications(
        page: Int? = 1,
        limit: Int? = 10
    ): HttpCall<RestfulResponse<ListApplicationResponse>, List<Application>> {
        return this.list(page, limit)
    }

    /**
     * 获取应用列表
     */
    @JvmOverloads
    fun list(
        page: Int? = 1,
        limit: Int? = 10
    ): HttpCall<RestfulResponse<ListApplicationResponse>, List<Application>> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/applications?limit=$limit&page=$page",
            object : TypeToken<RestfulResponse<ListApplicationResponse>>() {}) {
            it.data.list
        }
    }

    /**
     * 获取应用详情
     */
    @Deprecated("方法已弃用，请使用 findById ()", ReplaceWith("findById (appId)"))
    fun detail(appId: String): HttpCall<RestfulResponse<Application>, Application> {
        return this.findById(appId)
    }

    fun findById(appId: String): HttpCall<RestfulResponse<Application>, Application> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/applications/${appId}",
            object : TypeToken<RestfulResponse<Application>>() {}) {
            it.data
        }
    }

    /**
     * 刷新应用密钥
     */
    fun refreshApplicationSecret(
        appId: String
    ): HttpCall<RestfulResponse<Application>, Application> {
        val url = "${client.host}/api/v2/application/${appId}/refresh-secret"

        return this.client.createHttpPatchCall(
            url,
            "",
            object : TypeToken<RestfulResponse<Application>>() {}) { it.data }
    }

    /**
     * 查看应用下已登录用户
     */
    fun activeUsers(
        option: IActiveUsersParam
    ): HttpCall<RestfulResponse<Pagination<ActiveUser>>, Pagination<ActiveUser>> {
        val url =
            "${client.host}/api/v2/applications/${option.appId}/active-users?page=${option.page}&limit=${option.limit}"

        return this.client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<Pagination<ActiveUser>>>() {}) { it.data }

    }


}