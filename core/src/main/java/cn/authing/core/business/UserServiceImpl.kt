package cn.authing.core.business

import cn.authing.core.http.Call
import cn.authing.core.param.*
import cn.authing.core.result.LoginResult
import cn.authing.core.result.RefreshTokenResult
import cn.authing.core.result.RegisterResult
import cn.authing.core.result.UserInfoResult
import cn.authing.core.utils.AuthingUtils.URL_USER
import com.google.gson.reflect.TypeToken

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

    override fun refreshToken(param: RefreshTokenParam): Call<RefreshTokenResult> {
        return helper.createTokenCall(
                URL_USER,
                object : TypeToken<AuthingResponse<RefreshTokenResult>>() {},
                param,
                ImportantParam.ownerToken
        )
    }

    private fun logout() {
        ImportantParam.userToken = null
    }
}
