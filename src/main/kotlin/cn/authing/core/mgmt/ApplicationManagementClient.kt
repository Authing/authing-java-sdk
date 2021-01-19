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
     */
    fun listApplications(): HttpCall<RestfulResponse<ListApplicationResponse>, List<Application>> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/applications?limit=-1",
            object : TypeToken<RestfulResponse<ListApplicationResponse>>() {}) {
            it.data.list
        }
    }

    /**
     * 获取应用详情
     */
    fun detail(appId: String): HttpCall<RestfulResponse<Application>, Application> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/applications/${appId}",
            object : TypeToken<RestfulResponse<Application>>() {}) {
            it.data
        }
    }

}