package cn.authing.core.business

import com.google.gson.reflect.TypeToken

import cn.authing.core.http.Call
import cn.authing.core.param.RemoveUserParam
import cn.authing.core.param.UserListParam
import cn.authing.core.param.UserPatchParam
import cn.authing.core.result.RemoveUserResult
import cn.authing.core.result.UserListResult
import cn.authing.core.result.UserPatchResult

import cn.authing.core.utils.AuthingUtils.URL_USER

internal class UserManageServiceImpl(private val helper: HttpHelper) : cn.authing.core.service.UserManageService {

    override fun getUserInfo(param: UserPatchParam): Call<UserPatchResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<UserPatchResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    override fun getUserList(param: UserListParam): Call<UserListResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<UserListResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    override fun removeUser(param: RemoveUserParam): Call<List<RemoveUserResult>> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<List<RemoveUserResult>>>() {},
                param,
                ImportantParam.ownerToken
        )
    }
}
