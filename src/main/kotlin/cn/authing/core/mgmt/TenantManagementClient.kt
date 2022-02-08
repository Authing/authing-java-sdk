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
     * 添加租户成员
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
     * 删除租户成员
     */
    fun removeMembers(tenantId: String, userId: String): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpDeleteCall(
            "${client.host}/api/v2/tenant/${tenantId}/user?userId=${userId}",
            object : TypeToken<CommonMessage>() {}) {
            it
        }
    }

    /**
     * 更新租户成员
     */
    fun updateTenantMember(
        tenantId: String,
        userId: String,
        options:UpdateTenantMemberParam
    ): HttpCall<RestfulResponse<CreateIdpResponse>, CreateIdpResponse> {
        return client.createHttpPutCall(
            "${client.host}/api/v2/tenant/${tenantId}/${userId}",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<CreateIdpResponse>>() {}
        ) {
            it.data
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

    /**
     * 设置租户管理员
     */
    fun setTanentAdmin(tenantId: String, options:UserTenantIdList): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpPutCall(
            "${client.host}/api/v2/tenant/${tenantId}/admin",
            GsonBuilder().create().toJson(options),
            object : TypeToken<CommonMessage>() {}
        ) {
            it
        }
    }

    /**
     * 取消租户管理员
     */
    fun deleteTanentAdmin(tenantId:String, userId:String): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpDeleteCall(
            "${client.host}/api/v2/tenant/${tenantId}/admin/${userId}",
            object : TypeToken<CommonMessage>() {}) {
            it
        }
    }

//    /**
//     * 用户池管理员给租户管理员授权资源
//     */
//    fun userPoolAdminAddTanentAdminAuthorizeResources(options:UserPoolAdminToTanentAdminAuthorizeResourcesParam): HttpCall<CommonMessage, CommonMessage> {
//        return client.createHttpPostCall(
//            "${client.host}/api/v2/acl/tenant/authorize-resources-for-tenant",
//            GsonBuilder().create().toJson(options),
//            object : TypeToken<CommonMessage>() {}
//        ) {
//            it
//        }
//    }
//
//    /**
//     * 用户池管理员给租户成员撤销资源
//     */
//    fun revokeResources(options:UserPoolAdminToTanentAdminAuthorizeResourcesParam): HttpCall<CommonMessage, CommonMessage> {
//        return client.createHttpPostCall(
//            "${client.host}/api/v2/acl/tenant/revoke-resources-for-tenant",
//            GsonBuilder().create().toJson(options),
//            object : TypeToken<CommonMessage>() {}
//        ) {
//            it
//        }
//    }
//
//    /**
//     * 用户池管理员获取租户管理员被授权的业务资源
//     */
//    fun userPoolAdminGetTenantAdminResourceList(
//        tenantId: String,
//        userId:String,
//        resourceType:String): HttpCall<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>, UserPoolAdminGetTenantAdminResourceList> {
//        return client.createHttpGetCall(
//            "${client.host}/api/v2/acl/tenant/tenant-authorized-resources?tenant_id=${tenantId}&user_id=${userId}&resource_type=${resourceType}",
//            object : TypeToken<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>>() {}) {
//            it.data
//        }
//    }
//
//    /**
//     * 租户管理员给租户成员授权资源
//     */
//    fun tanentAdminAddTanentMemberAuthorizeResources(options:TanentAdminAddTanentMemberAuthorizeResourcesParam): HttpCall<CommonMessage, CommonMessage> {
//        return client.createHttpPostCall(
//            "${client.host}/api/v2/acl/tenant/authorize-resources",
//            GsonBuilder().create().toJson(options),
//            object : TypeToken<CommonMessage>() {}
//        ) {
//            it
//        }
//    }
//
//    /**
//     * 租户管理员给租户成员取消授权资源
//     */
//    fun tenantAdminRevokeResources(options:TanentAdminAddTanentMemberAuthorizeResourcesParam): HttpCall<CommonMessage, CommonMessage> {
//        return client.createHttpPostCall(
//            "${client.host}/api/v2/acl/tenant/revoke-resources",
//            GsonBuilder().create().toJson(options),
//            object : TypeToken<CommonMessage>() {}
//        ) {
//            it
//        }
//    }
//
//    /**
//     * 租户管理员获取租户成员被授权的资源列表
//     */
//    fun tenantAdminGetTenantMemberResourceList(
//        userId:String,
//        resourceType:String): HttpCall<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>, UserPoolAdminGetTenantAdminResourceList> {
//        return client.createHttpGetCall(
//            "${client.host}/api/v2/acl/tenant/authorized-resources?user_id=${userId}&resource_type=${resourceType}",
//            object : TypeToken<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>>() {}) {
//            it.data
//        }
//    }
//
//    /**
//     * 租户成员自己获取被授权的资源列表
//     */
//    fun tenantMemberGetResourceList(
//        tenantId: String,
//        resourceType:String): HttpCall<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>, UserPoolAdminGetTenantAdminResourceList> {
//        return client.createHttpGetCall(
//            "${client.host}/api/v2/users/me/tenant/authorized-resources?tenant_id=${tenantId}&resource_type=${resourceType}",
//            object : TypeToken<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>>() {}) {
//            it.data
//        }
//    }
//
//    /**
//     * 用户池管理员获取租户成员被授权的资源
//     */
//    fun userPoolAdminGetTenantMemberResourceList(
//        tenantId: String,
//        userId:String,
//        resourceType:String): HttpCall<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>, UserPoolAdminGetTenantAdminResourceList> {
//        return client.createHttpGetCall(
//            "${client.host}/api/v2/users/${userId}/tenant/authorized-resources?tenant_id=${tenantId}&user_id=${userId}&resource_type=${resourceType}",
//            object : TypeToken<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>>() {}) {
//            it.data
//        }
//    }

    /**
     * 授权业务资源
     */
    fun authorizeResources(options:AuthorizeResourcesParam): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/acl/authorize-resources",
            GsonBuilder().create().toJson(options),
            object : TypeToken<CommonMessage>() {}
        ) {
            it
        }
    }

    /**
     * 撤销业务资源
     */
    fun revokeAuthorizeResources(options:AuthorizeResourcesParam): HttpCall<CommonMessage, CommonMessage> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/acl/revoke-resources",
            GsonBuilder().create().toJson(options),
            object : TypeToken<CommonMessage>() {}
        ) {
            it
        }
    }

    /**
     * 获取被授权的资源
     */
    fun getAuthorizeResources(options:GetAuthorizeResourcesParam): HttpCall<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>, RestfulResponse<UserPoolAdminGetTenantAdminResourceList>> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/acl/list-authorized-resources",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>>() {}
        ) {
            it
        }
    }

    /**
     * 获取被授权的资源（用户侧）
     */
    fun getMeAuthorizeResources(
        namespace: String,
        tenant_id:String,
        resource_type:String): HttpCall<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>, UserPoolAdminGetTenantAdminResourceList> {
        return client.createHttpGetCall(
            "${client.host}/api/v2/acl/users/me/authorized-resources?namespace=${namespace}&tenant_id=${tenant_id}&resource_type=${resource_type}",
            object : TypeToken<RestfulResponse<UserPoolAdminGetTenantAdminResourceList>>() {}) {
            it.data
        }
    }

    /**
     * 批量获取被授权的资源
     */

    fun getAuthorizeResourcesBatch(options:BatchGetAuthorizeResourcesParam): HttpCall<RestfulResponse<BatchGetAuthorizeResourcesList>, RestfulResponse<BatchGetAuthorizeResourcesList>> {
        return client.createHttpPostCall(
            "${client.host}/api/v2/acl/list-authorized-resources-batch",
            GsonBuilder().create().toJson(options),
            object : TypeToken<RestfulResponse<BatchGetAuthorizeResourcesList>>() {}
        ) {
            it
        }
    }
}
