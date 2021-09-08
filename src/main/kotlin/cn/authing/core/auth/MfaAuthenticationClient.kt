package cn.authing.core.auth

import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken

class MfaAuthenticationClient(private val client: AuthenticationClient) {

    /**
     * 获取 MFA 认证器
     */
    @JvmOverloads
    fun getMfaAuthenticators(
        options: GetMfaAuthenticatorsParams? =
            GetMfaAuthenticatorsParams(
                "totp",
                source = TotpSource.SELF
            )
    ): HttpCall<RestfulResponse<IMfaAuthenticator>, IMfaAuthenticator> {
//        val url = "${client.host}/api/v2/mfa/authenticator"
//
//        if (options?.mfaToken != null) client.token = options.mfaToken

//        return client.createHttpPostCall(
//            url,
//            Gson().toJson(options),
//            object : TypeToken<RestfulResponse<IMfaAuthenticator>>() {}
//        ) { it.data }

        val url = "${client.host}/api/v2/mfa/authenticator?client.token=${options?.mfaToken}&type=${options?.type}&source=${options?.source}"
        if (options?.mfaToken != null) client.token = options.mfaToken
        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<IMfaAuthenticator>>() {}
        ){it.data}

    }

    /**
     * 请求 MFA 二维码和密钥信息
     */
    @JvmOverloads
    fun assosicateMfaAuthenticator(
        options: AssosicateMfaAuthenticatorParams? =
            AssosicateMfaAuthenticatorParams(
                "totp",
                source = TotpSource.SELF
            )
    ): HttpCall<RestfulResponse<IMfaAssociation>, IMfaAssociation> {

        if (options?.mfaToken != null) client.token = options.mfaToken

        val url = "${client.host}/api/v2/mfa/totp/associate"

        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<IMfaAssociation>>() {}
        ) { it.data }
    }


    /**
     * 确认绑定 MFA
     */
    @JvmOverloads
    fun confirmAssosicateMfaAuthenticator(
        options: ConfirmAssosicateMfaAuthenticatorParams? =
            ConfirmAssosicateMfaAuthenticatorParams(
                "totp",
                source = TotpSource.SELF
            )
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        if (options?.mfaToken != null) client.token = options.mfaToken

        val url = "${client.host}/api/v2/mfa/totp/associate/confirm"

        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code == 200 }
    }

    /**
     * 检验二次验证 MFA 口令
     */
    fun verifyTotpMfa(
        options: VerifyTotpMfaParams
    ): HttpCall<RestfulResponse<User>, User> {
        val url = "${client.host}/api/v2/mfa/totp/verify"

        client.token = options.mfaToken

        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<User>>() {}
        ) { it.data }
    }

    fun phoneOrEmailBindable(
        options: PhoneOrEmailBindableParams
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "${client.host}/api/v2/applications/mfa/check"

        client.token = options.mfaToken

        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code == 200 }
    }

    fun verifyTotpRecoveryCode(
        options: VerifyTotpRecoveryCodeParams
    ): HttpCall<RestfulResponse<User>, User> {
        val url = "${client.host}/api/v2/mfa/totp/recovery"

        client.token = options.mfaToken

        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<User>>() {}
        ) { it.data }
    }

    fun associateFaceByUrl(
        options: AssociateFaceByUrlParams
    ): HttpCall<RestfulResponse<User>, User> {
        if (options.mfaToken != null) client.token = options.mfaToken

        val url = "${client.host}/api/v2/mfa/face/associate"

        val gson = GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create()
        val json = gson.toJsonTree(options)

        json.asJsonObject.addProperty("isExternal", true)

        return client.createHttpPostCall(
            url,
            gson.toJson(json),
            object : TypeToken<RestfulResponse<User>>() {}
        ) { it.data }
    }


    fun verifyFaceMfa(
        photo: String,
        mfaToken: String
    ): HttpCall<RestfulResponse<User>, User> {
        val url = "${client.host}/api/v2/mfa/face/verify"

        client.token = mfaToken

        val jsonObject = JsonObject()

        jsonObject.addProperty("photo", photo)
        return client.createHttpPostCall(
            url,
            jsonObject.toString(),
            object : TypeToken<RestfulResponse<User>>() {}
        ) { it.data }
    }

    /**
     * verifyAppSmsMfa
     * 检验二次验证 MFA 短信验证码
     */
    fun verifyAppSmsMfa(
        options: VerifyAppSmsMfaParams
    ): HttpCall<RestfulResponse<User>, User> {
        val url = "${client.host}/api/v2/applications/mfa/sms/verify"

        client.token = options.mfaToken

        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<User>>() {}
        ) { it.data }
    }

    fun verifyAppEmailMfa(
        options: VerifyAppEmailMfaParams
    ): HttpCall<RestfulResponse<User>, User> {
        val url = "${client.host}/api/v2/applications/mfa/email/verify"

        client.token = options.mfaToken

        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<User>>() {}
        ) { it.data }
    }
}