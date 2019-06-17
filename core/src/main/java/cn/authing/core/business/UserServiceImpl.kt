package cn.authing.core.business

import com.google.gson.reflect.TypeToken

import cn.authing.core.http.Call
import cn.authing.core.param.LoginByEmailParam
import cn.authing.core.param.LoginByLADPParam
import cn.authing.core.param.LoginByPhoneParam
import cn.authing.core.param.RefreshTokenParam
import cn.authing.core.param.RegisterParam
import cn.authing.core.param.RemoveUserParam
import cn.authing.core.param.ResetPasswordParam
import cn.authing.core.param.UnbindEmailParam
import cn.authing.core.param.UpdateUserInfoParam
import cn.authing.core.param.UserInfoParam
import cn.authing.core.param.UserListParam
import cn.authing.core.param.UserPatchParam
import cn.authing.core.result.LoginResult
import cn.authing.core.result.RefreshTokenResult
import cn.authing.core.result.RegisterResult
import cn.authing.core.result.RemoveUserResult
import cn.authing.core.result.UserInfoResult
import cn.authing.core.result.UserListResult
import cn.authing.core.result.UserPatchResult

import cn.authing.core.utils.AuthingUtils.URL_USER

internal class UserServiceImpl(private val helper: HttpHelper) : cn.authing.core.service.UserService {

    override fun register(param: RegisterParam): Call<RegisterResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<RegisterResult>>() {},
                param
        )
    }

    override fun loginByEmail(param: LoginByEmailParam): Call<LoginResult> {
        return helper.createLoginCall(URL_USER, param)
    }

    override fun loginByPhone(param: LoginByPhoneParam): Call<LoginResult> {
        return helper.createLoginCall(URL_USER, param)
    }

    override fun loginByLDAP(param: LoginByLADPParam): Call<LoginResult> {
        return helper.createLoginCall(URL_USER, param)
    }

    override fun getUserInfo(param: UserInfoParam): Call<UserInfoResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<UserInfoResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    override fun updateUserInfo(param: UpdateUserInfoParam): Call<UserInfoResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<UserInfoResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    override fun resetPassword(param: ResetPasswordParam): Call<UserInfoResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<UserInfoResult>>() {},
                param
        )
    }

    private fun logout() {
        ImportantParam.userToken = null
    }
}
