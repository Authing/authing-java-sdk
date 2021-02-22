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
    fun listUserActions(options: LogsPageParam?): HttpCall<RestfulResponse<PaginatedLogs>, List<UserActionLogResponse>> {
        var url = "${client.host}/api/v2/analysis/user-action?";
        url += if (options?.clientIp != null) "&clientip=${options.clientIp}" else ""
        url += if (options?.page != null) "&page=${options.page}" else ""
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

        return client.createHttpGetCall(url ,object:TypeToken<RestfulResponse<PaginatedLogs>>() {}){
            val result: MutableList<UserActionLogResponse> = mutableListOf()
            it.data.list.forEach {
                result.add(UserActionLogResponse(it.userpool_id, it.user?.id, it.user?.displayName,it.geoip?.city_name,
                    it.geoip?.region_name,it.geoip?.ip,it.operation_desc,
                    it.operation_name,it.timestamp,it.app_id,it.app?.name))
            }
            result
        };
    }

    /**
     * 查看审计日志
     */
    fun listAuditLogs(options: AuditLogPageParam?): HttpCall<RestfulResponse<PaginatedAuditLogs>, List<AuditLogResponse>> {
        var url = "${client.host}/api/v2/analysis/audit?"
        url += if (options?.clientIp != null) "&clientip=${options.clientIp}" else ""
        url += if (options?.page != null) "&page=${options.page}" else ""
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
            val result: MutableList<AuditLogResponse> = mutableListOf()
            it.data.list.forEach {
                AuditLogResponse("","","",""
                    ,"","","",""
                    ,"","","","")
                result.add(AuditLogResponse(it.userpool_id, it.operator_type, it.operator_detail?.id,it.operator_detail?.displayName,
                    it.operation_name,it.geoip?.city_name,it.geoip?.region_name,it.geoip?.ip,
                    it.resource_type,it.resource_desc,it.resource_arn,it.timestamp))
            }
            result
        };
    }

}