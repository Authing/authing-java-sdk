package cn.authing.core.mgmt

import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import org.omg.CORBA.Object

class TenantManagementClient(private val client: ManagementClient) {

    /**
     * 创建租户
     */
    fun create(
        options: CreateTenantParams
    ): HttpCall<RestfulResponse<CreateTenantResponse>, CreateTenantResponse> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/tenant",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<CreateTenantResponse>>() {}
        ) {
            it.data
        }
    }

    /**
     * 根据租户 ID 查询租户
     */
    fun details(tenantId: String): HttpCall<RestfulResponse<TenantDetail>, TenantDetail> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/tenant/${tenantId}",
            object : TypeToken<RestfulResponse<TenantDetail>>() {}) {
            it.data
        }
    }

    /**
     * 获取租户列表
     */
    fun list(page: Number, limit: Number): HttpCall<RestfulResponse<PaginatedTenants>, PaginatedTenants> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/tenants?page=${page}&limit=${limit}",
            object : TypeToken<RestfulResponse<PaginatedTenants>>() {}) {
            it.data
        }
    }

    /**
     * 修改租户信息
     */
    fun update(
        tenantId: String,
        options: UpdateTenantParams
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/tenant/${tenantId}",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) {
            it.data
        }
    }

    /**
     * 刪除租戶
     */
    fun delete(
        tenantId: String
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "${this.client.host}/api/v2/tenant/${tenantId}"
        return client.createHttpDeleteCall(
            url,
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) {
            it.code == 200
            it.message == "删除租户成功"
        }
    }

    /**
     * 配置租户品牌化
     */
    fun config(
        tenantId: String,
        options: ConfigSsoPageCustomizationSetting
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/tenant/${tenantId}",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) {
            it.data
        }
    }

    /**
     * 给租户添加成员
     */

    fun addMembers(
        tenantId: String,
        options: UserTenantIdList
    ): HttpCall<RestfulResponse<CreateTenantMemberResponse>, CreateTenantMemberResponse> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/tenant/${tenantId}/user",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<CreateTenantMemberResponse>>() {}
        ) {
            it.data
        }
    }

    /**
     * 移除成员
     */
    fun removeMembers(tenantId: String, userId: String): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpDeleteCall(
            "${client.host}/api/v2/tenant/${tenantId}/user?userId=${userId}",
            object : TypeToken<CommonMessage>() {}) {
            it
        }
    }

    /**
     * 获取租户成员列表
     */
    fun memeber(
        tenantId: String,
        page: Number,
        limit: Number
    ): HttpCall<RestfulResponse<PaginatedTenants>, PaginatedTenants> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/tenant/${tenantId}/users?page=${page}&limit=${limit}",
            object : TypeToken<RestfulResponse<PaginatedTenants>>() {}) {
            it.data
        }
    }

    /**
     * 创建身份源
     */
    fun createExtIdp(options: CreateIdpParam): HttpCall<RestfulResponse<CreateIdpResponse>, CreateIdpResponse> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/extIdp",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<CreateIdpResponse>>() {}
        ) {
            it.data
        }
    }

    /**
     * 更新身份源
     */
    fun updateExtIdp(
        extIdpId: String,
        options: UpdateIdpParam
    ): HttpCall<RestfulResponse<CreateIdpResponse>, CreateIdpResponse> {
        return client.createHttpPutCall(
            "${client.host}/api/v2/extIdp/${extIdpId}",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<CreateIdpResponse>>() {}
        ) {
            it.data
        }
    }

    /**
     * 删除身份源
     */
    fun deleteExtIdp(extIdpId: String): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpDeleteCall(
            "${client.host}/api/v2/extIdp/${extIdpId}",
            object : TypeToken<CommonMessage>() {}) {
            it
        }
    }

    /**
     * 获取身份源详细信息
     */
    fun extIdpDetail(extIdpId: String): HttpCall<RestfulResponse<CreateIdpResponse>, CreateIdpResponse> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/extIdp/${extIdpId}",
            object : TypeToken<RestfulResponse<CreateIdpResponse>>() {}) {
            it.data
        }
    }

    /**
     * 获取身份源列表
     */
    fun listExtIdp(tenantId: String): HttpCall<RestfulResponse<List<CreateIdpResponse>>, List<CreateIdpResponse>> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/extIdp?tenantId=${tenantId}",
            object : TypeToken<RestfulResponse<List<CreateIdpResponse>>>() {}) {
            it.data
        }
    }

    /**
     *创建身份源连接
     */
    fun createExtIdpConnection(options:CreatIdpConnParam): HttpCall<RestfulResponse<CreateIdpConnResponse>, CreateIdpConnResponse> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/extIdpConn",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<CreateIdpConnResponse>>() {}
        ) {
            it.data
        }
    }

    /**
     * 更新身份源连接
     */
    fun updateExtIdpConnection(extIdpConnectionId:String,
    options:UpdateIdpConnParm): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpPutCall(
            "${client.host}/api/v2/extIdpConn/${extIdpConnectionId}",
            GsonBuilder().create().toJson(options),
            object : TypeToken<CommonMessage>() {}
        ) {
            it
        }
    }

    /**
     * 删除身份源连接
     */
    fun deleteExtIdpConnection(extIdpConnectionId:String): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpDeleteCall(
            "${client.host}/api/v2/extIdpConn/${extIdpConnectionId}",
            object : TypeToken<CommonMessage>() {}) {
            it
        }
    }

    /**
     *检查连接唯一标识是否冲突
     */
   fun checkExtIdpConnectionIdentifierUnique(options:CheckExtIdpConnectionIdentifierUnique): HttpCall<CommonMessage, CommonMessage> {
       return client.createHttpPostCall(
           "${client.host}/api/v2/check/extIdpConn/identifier",
           GsonBuilder().create().toJson(options),
           object : TypeToken<CommonMessage>() {}
       ) {
           it
       }
   }

    /**
     *   开关身份源连接
     */
    fun changeExtIdpConnectionState(extIdpConnectionId: String, options:ConnState):HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpPutCall(
            "${client.host}/api/v2/extIdpConn/${extIdpConnectionId}/state",
            GsonBuilder().create().toJson(options),
            object : TypeToken<CommonMessage>() {}
        ) {
            it
        }
    }

    /**
     *   批量开关身份源连接
     */
    fun batchChangeExtIdpConnectionState(extIdpConnectionId: String, options:ConnState):HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpPutCall(
            "${client.host}/api/v2/extIdp/${extIdpConnectionId}/connState",
            GsonBuilder().create().toJson(options),
            object : TypeToken<CommonMessage>() {}
        ) {
            it
        }
    }
}
