package cn.authing.core.mgmt

import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MFAManagementClient(private val client: ManagementClient) {

    /**
     * 用户是否绑定了 TOTP MFA
     */
    fun getStatus(
        userId: String
    ): HttpCall<RestfulResponse<UserMfaStatus>, UserMfaStatus> {
        val url = "${client.host}/api/v2/users/${userId}/mfa-bound"

        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<UserMfaStatus>>() {}
        ) { it.data }
    }

    /**
     * 解绑用户 TOTP MFA
     */
    fun unAssociateMfa(
        userId: String,
        type: UserMfaType
    ): HttpCall<RestfulResponse<Boolean>, Boolean> {

        val url = "${client.host}/api/v2/users/${userId}/mfa-bound?type=${type}"

        return client.createHttpDeleteCall(
            url,
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code == 200 }
    }

    /**
     * @name importTotp
     * @name_zh 将已有的 TOTP 的 secret 和恢复代码导入到 Authing，并为用户开启 TOTP 多因素认证
     * @description 设置用户 TOTP 的 secret 和恢复代码，并自动启用 MFA
     *
     * @param {ImportTotpParams} options
     * @param options - {String} userId 用户 ID
     * @param options - {String} secret TOTP 密钥
     * @param options - {String} recoveryCode 恢复代码
     */
    fun importTotp(
        options: ImportTotpParams
    ): HttpCall<RestfulResponse<ISetTotpResp>, ISetTotpResp> {
        val url = "${client.host}/api/v2/mfa/totp/import"

        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<ISetTotpResp>>() {}
        ) { it.data }
    }
}