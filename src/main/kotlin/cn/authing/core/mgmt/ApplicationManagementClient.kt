package cn.authing.core.mgmt

import cn.authing.core.http.HttpCall
import cn.authing.core.types.Application
import cn.authing.core.types.ListApplicationResponse
import cn.authing.core.types.RestfulResponse
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
    @Deprecated("方法弃用请使用 ApplicationManagementClient.list")
    fun listApplications(
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
     * 获取应用列表
     */
    @JvmOverloads
    fun list(
        page: Int? = 1,
        limit: Int? = 10
    ): HttpCall<RestfulResponse<ListApplicationResponse>, List<Application>> {
        return this.listApplications(page, limit)
    }

    /**
     * 获取应用详情
     */
    @Deprecated("方法已弃用，请使用 ApplicationManagementClient.finById")
    fun detail(appId: String): HttpCall<RestfulResponse<Application>, Application> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/applications/${appId}",
            object : TypeToken<RestfulResponse<Application>>() {}) {
            it.data
        }
    }

    fun finById(id: String): HttpCall<RestfulResponse<Application>, Application> {
        return this.detail(id)
    }


}