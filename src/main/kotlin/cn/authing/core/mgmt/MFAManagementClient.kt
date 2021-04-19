package cn.authing.core.mgmt

import cn.authing.core.http.HttpCall
import cn.authing.core.types.RestfulResponse
import cn.authing.core.types.UserMfaStatus
import cn.authing.core.types.UserMfaType
import com.google.gson.reflect.TypeToken

class MFAManagementClient(private val client: ManagementClient) {

    fun getStatus(
        userId: String
    ): HttpCall<RestfulResponse<UserMfaStatus>, UserMfaStatus> {
        val url = "${client.host}/api/v2/users/${userId}/mfa-bound"

        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<UserMfaStatus>>() {}
        ) { it.data }
    }

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
}