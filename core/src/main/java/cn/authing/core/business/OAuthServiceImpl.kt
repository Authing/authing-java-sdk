package cn.authing.core.business

import com.google.gson.reflect.TypeToken

import cn.authing.core.http.Call
import cn.authing.core.param.ReadOAuthListParam
import cn.authing.core.param.RefreshTokenParam
import cn.authing.core.param.UnbindEmailParam
import cn.authing.core.result.OAuthData
import cn.authing.core.result.RefreshTokenResult
import cn.authing.core.result.UserInfoResult

import cn.authing.core.utils.AuthingUtils.URL_OAUTH
import cn.authing.core.utils.AuthingUtils.URL_USER

internal class OAuthServiceImpl(private val helper: HttpHelper) : cn.authing.core.service.OAuthService {

    override fun readOAuthList(param: ReadOAuthListParam): Call<List<OAuthData>> {
        return helper.createAuthingCall(
                URL_OAUTH,
                object : TypeToken<AuthingResponse<List<OAuthData>>>() {},
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

    override fun unbindEmail(param: UnbindEmailParam): Call<UserInfoResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<UserInfoResult>>() {},
                param,
                ImportantParam.userToken
        )
    }
}
