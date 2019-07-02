package cn.authing.core.business

import androidx.annotation.NonNull
import cn.authing.core.http.Call
import cn.authing.core.param.*
import cn.authing.core.result.ReadPermissionsResult
import cn.authing.core.result.ReadRolesResult
import cn.authing.core.result.RoleInfoResult
import cn.authing.core.service.PermissionService
import cn.authing.core.utils.AuthingUtils
import com.google.gson.reflect.TypeToken

internal class PermissionServiceImpl(private val helper: HttpHelper) : PermissionService {

    override fun readRoles(@NonNull param: ReadRolesParam): Call<ReadRolesResult> {
        return helper.createAuthingCall(
                AuthingUtils.URL_USER,
                object : TypeToken<AuthingResponse<ReadRolesResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    override fun readPermissions(@NonNull param: ReadPermissionsParam): Call<ReadPermissionsResult> {
        return helper.createAuthingCall(
                AuthingUtils.URL_USER,
                object : TypeToken<AuthingResponse<ReadPermissionsResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    override fun createRole(@NonNull param: CreateRoleParam): Call<RoleInfoResult> {
        return helper.createAuthingCall(
                AuthingUtils.URL_USER,
                object : TypeToken<AuthingResponse<RoleInfoResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    override fun updateRoleInfo(@NonNull param: UpdateRoleParam): Call<RoleInfoResult> {
        return helper.createAuthingCall(
                AuthingUtils.URL_USER,
                object : TypeToken<AuthingResponse<RoleInfoResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    override fun assiginRoleToUser(@NonNull param: AssignRoleToUserParam): Call<ReadRolesResult> {
        return helper.createAuthingCall(
                AuthingUtils.URL_USER,
                object : TypeToken<AuthingResponse<ReadRolesResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    override fun removeUserFromRole(@NonNull param: RemoveUserFromRoleParam): Call<Any> {
        return helper.createAuthingCall(
                AuthingUtils.URL_USER,
                object : TypeToken<AuthingResponse<Any>>() {},
                param,
                ImportantParam.ownerToken
        )
    }
}