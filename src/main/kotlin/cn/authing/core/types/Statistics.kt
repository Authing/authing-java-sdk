package cn.authing.core.types

import com.google.gson.annotations.SerializedName

data class UA(
    var os_name: String?,
    var major: String?,
    var minor: String?,
    var os: String?,
    var build: String?,
    var device: String?,
    var name: String?,
    var patch: String?
)

data class GeoIP(
    var country_code2: String?,
    var longitude: Double?,
    var country_name: String?,
    var city_name: String?,
    var timezone: String?,
    var region_code: String?,
    var region_name: String?,
    var country_code3: String?,
    var continent_code: String?,
    var location: GeoIpLocation?,
    var latitude: Double?,
    var ip: String?
)

data class GeoIpLocation(
    var lon: String?,
    var lat: String?,
)

data class LogUser(
    var userpoolId: String?,
    var displayName: String?,
    var id: String?,
    var photo: String?
)

data class LogApp(
    var name: String?
)

data class Arn(
    var region: String?,
    var userPoolId: String?,
    var resourceType: String?,
    var resourceIds: List<String>?
)

data class Log(
    var request_id: String?,
    var operator_arn: String?,
    var message: String?,
    var operation_name: String?,
    var user_agent: String?,
    var extra_data: String?,
    var host: String?,
    var timestamp: String?,
    var path: String?,
    var geoip: GeoIP?,
    var userpool_id: String?,
    var clientip: String?,
    var operation_desc: String?,
    var ua: UA?,
    var user: LogUser?,
    var app: LogApp?,
    var app_id: String?
)

data class AuditLog(
    var request_id: String?,
    var operator_arn: String?,
    var message: String?,
    var operation_name: String?,
    var user_agent: String?,
    var extra_data: String?,
    var host: String?,
    var timestamp: String?,
    var resource_arn: String?,
    var ua: UA?,
    var path: String?,
    var geoip: GeoIP?,
    var userpool_id: String?,
    var clientip: String?,
    var operator_arn_parsed: Arn?,
    var operator_type: String?,
    var resource_arn_parsed: Arn?,
    var resource_type: String?,
    var resource_desc: String?,
    var resource_detail: List<LogUser>?,
    var operator_detail: LogUser?
)

/**
 * 管理日志统计信息分页查询参数
 */
data class LogsPageParam(
    var clientIp: String?,
    var operationNames: List<String>?,
    var userIds: List<String>?,
    var page: Int?,
    var limit: Int?
)

data class AuditLogPageParam(
    var clientIp: String?,
    var operationNames: List<String>?,
    var operatorArns: List<String>?,
    var page: Int?,
    var limit: Int?
)

data class PaginatedLogs(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<Log>
)

data class PaginatedAuditLogs(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<AuditLogResponse>
)

/**
 * 用户操作日志返回结构
 */
data class UserActionLogResponse(
    var userpoolId: String?,
    var userId: String?,
    var username: String?,
    var cityName: String?,
    var regionName: String?,
    var clientIp: String?,
    var operationDesc: String?,
    var operationName: String?,
    var timestamp: String?,
    var appId: String?,
    var appName: String?
)

/**
 * 审计日志返回结构
 */
data class AuditLogResponse(
    var operatorType: String?,
    var clientIp: String?,
    var resourceName: String?,
    var requestId: String?,
    var targetValue: String?,
    var ua: UA?,
    var filedate: String?,
    var operationMode: String?,
    var path: String?,
    var roleCode: String?,
    var logId: String?,
    var userPoolId: String?,
    var eventType: String?,
    var originValue: String?,
    var host: String?,
    var resourceType: String?,
    var timestamp: String?,
    var resourceDetails: String?,
    var userId: String?,
    var targetId: String?,
    var message: String?,
    var roleId: String?,
    var operationParam: String?,
    var geoip: GeoIP?,
    var eventDetails: String?,
    var appId: String?,
    var roleName: String?,
    var userName: String?,
    var userAgent: String?,
    var eventResultCode: String?,
    var photoUrl: String?,
    var userPoolName: String?,
)

data class PaginatedUserActionLog(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<UserActionLogResponse>
)

data class PaginatedAuditLog(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<AuditLogResponse>
)