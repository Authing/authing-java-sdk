package cn.authing.core.mgmt

import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.reflect.TypeToken

/**
 * 管理日志统计信息
 */
class StatisticsManagementClient(private val client: ManagementClient) {

    /**
     * 查看用户操作日志
     */
    fun listUserActions(options: LogsPageParam?): HttpCall<RestfulResponse<UserActions>, UserActions> {
        var url = "${client.host}/api/v2/analysis/user-action?";
        url += if (options?.clientIp != null) "&clientip=${options.clientIp}" else ""
        url += if (options?.page != null) "&page=${options.page}" else ""
        url += if (options?.limit != null) "&limit=${options.limit}" else ""

        if (options!=null && options.operationNames != null && options.operationNames!!.isNotEmpty()){
            options.operationNames!!.forEach {
                url += "&operation_name=$it"
            }
        }
        if (options!=null && options.userIds != null && options.userIds!!.isNotEmpty()){
            options.userIds!!.forEach {
                url += "&operator_arn=arn:cn:authing:${this.client.userPoolId}:user:${it}"
            }
        }

        return client.createHttpGetCall(url ,object:TypeToken<RestfulResponse<UserActions>>() {}){
            it.data
        };
    }

    /**
     * 审计日志列表查询
     */
    fun listAuditLogs(options: AuditLogPageParam?): HttpCall<RestfulResponse<PaginatedAuditLogs>, PaginatedAuditLog> {
        var url = "${client.host}/api/v2/analysis/audit?"
        url += if (options?.clientIp != null) "&clientip=${options.clientIp}" else ""
        url += if (options?.page != null) "&page=${options.page}" else ""
        url += if (options?.limit != null) "&limit=${options.limit}" else ""

        if (options!=null && options.operationNames != null && options.operationNames!!.isNotEmpty()){
            options.operationNames!!.forEach {
                url += "&operation_name=$it"
            }
        }
        if (options!=null && options.operatorArns != null && options.operatorArns!!.isNotEmpty()){
            options.operatorArns!!.forEach {
                url += "&operator_arn=$it"
            }
        }

        return client.createHttpGetCall(url,object:TypeToken<RestfulResponse<PaginatedAuditLogs>>() {}){
            PaginatedAuditLog(it.data.totalCount, it.data.list)
        };
    }

}