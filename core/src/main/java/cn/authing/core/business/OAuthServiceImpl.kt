package cn.authing.core.business

import cn.authing.core.http.Call
import cn.authing.core.param.*
import cn.authing.core.result.*
import cn.authing.core.utils.AuthingUtils.URL_OAUTH
import cn.authing.core.utils.AuthingUtils.URL_USER
import com.google.gson.reflect.TypeToken

internal class OAuthServiceImpl(private val helper: HttpHelper) : cn.authing.core.service.OAuthService {

    override fun readOAuthList(param: ReadOAuthListParam): Call<List<OAuthData>> {
        return helper.createAuthingCall(
                URL_OAUTH,
                object : TypeToken<AuthingResponse<List<OAuthData>>>() {},
                param
        )
    }

    override fun readUserOAuthList(param: ReadUserOAuthListParam): Call<List<UserOAuthData>> {
        return helper.createAuthingCall(
                URL_OAUTH,
                object : TypeToken<AuthingResponse<List<UserOAuthData>>>() {},
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

    override fun bindThirdPartyOAuth(param: BindThirdPartyOAuthParam): Call<BindThirdPartyOAuthResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<BindThirdPartyOAuthResult>>() {},
                param,
                ImportantParam.userToken
        )
    }

    override fun unbindThirdPartyOAuth(param: UnbindThirdPartyOAuthParam): Call<UnbindThirdPartyOAuthResult> {
        return helper.createAuthingCall(
                URL_USER,
                object : TypeToken<AuthingResponse<UnbindThirdPartyOAuthResult>>() {},
                param,
                ImportantParam.userToken
        )
    }
}
