package cn.authing.core.business

import cn.authing.core.Authing
import cn.authing.core.http.Call
import cn.authing.core.param.*
import cn.authing.core.result.*
import cn.authing.core.utils.AuthingUtils.URL_CORE
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

    override fun updatePhone(param: UpdatePhoneParam): Call<UserInfoResult> {
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


    override fun createUser(param: RegisterParam): Call<RegisterResult> {
        return register(param)
    }


    override fun list(param: UserListParam): Call<UserListResult> {
        return Authing.getUserManageService().getUserList(param)
    }

    override fun user(param: UserInfoParam): Call<UserInfoResult> {
        return getUserInfo(param)
    }

    override fun signIn(param: SigninParam): Call<SigninResult> {
        return helper.createTokenCall(
                URL_USER,
                object : TypeToken<AuthingResponse<SigninResult>>() {},
                param
        )
    }

    override fun refreshSignInToken(param: RefreshSigninTokenParam): Call<RefreshSigninTokenResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<RefreshSigninTokenResult>>() {},
                param
        )
    }

    override fun checkLoginStatus(param: CheckLoginStatusParam): Call<CheckLoginStatusResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<CheckLoginStatusResult>>() {},
                param
        )
    }

    override fun loginByOidc(param: LoginByOidcParam): Call<SigninResult> {
        return helper.createLoginByOidcCall(
                URL_CORE,
                param.params
        )
    }

    override fun refreshOidcToken(param: RefreshOidcTokenParam): Call<RefreshOidcTokenResult> {
        return helper.createNormalPostCall(
                URL_CORE,
                RefreshOidcTokenResult::class.java,
                param.params
        )
    }
} 