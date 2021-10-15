package cn.authing.core.mgmt

import cn.authing.core.Utils
import cn.authing.core.http.HttpCall
import cn.authing.core.types.AgreementList
import cn.authing.core.types.RestfulResponse
import cn.authing.core.types.UserActionParam
import cn.authing.core.types.UserActions
import com.google.gson.reflect.TypeToken

class UserActionManagementClient(private val client: ManagementClient) {

    /**
     * 审计日志列表
     * @param options.page 当前页数
     * @param options.limit 每页显示条数
     * @param options.clientIp 客户端 IP 地址
     * @param options.operationName 操作类型
     * @param options.operatoArn 用户 Arn 通过 searchUser 方法获得
     * @returns Promise<UserActions>
     */
    fun list(
        options: UserActionParam
    ): HttpCall<RestfulResponse<UserActions>, UserActions> {
        val url = "${this.client.host}/api/v2/analysis/user-action"
        Utils().getQueryUrl(url, options)
        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<UserActions>>() {}
        ) { it.data }
    }
}