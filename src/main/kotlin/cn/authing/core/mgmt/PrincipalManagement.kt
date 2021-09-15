package cn.authing.core.mgmt

import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class PrincipalManagement(private val client: ManagementClient)  {
    /**
     * @name detail
     * @name_zh 获取主体认证详情
     * @description 获取主体认证详情，未认证时返回 null
     *
     * @example
     * const authenticationClient = new AuthenticationClient({
     *    appId: "YOUR_APP_ID",
     * })
     * const authenticators = await authenticationClient.principal.detail()
     *
     * @returns {Promise<PrincipalDetail | null>}
     * @memberof PrincipalAuthenticationClient
     */
    fun detail(
        userId: String
    ): HttpCall<RestfulResponse<PrincipalDetail>, PrincipalDetail> {
        val url = "${this.client.host}/api/v2/users/${userId}/management/principal_authentication"
        return client.createHttpDeleteCall(
            url,
            object : TypeToken<RestfulResponse<PrincipalDetail>>() {}
        ) { it.data }
    }

    fun authenticate(
        userId: String,
        info: PrincipalInput
    ):HttpCall<RestfulResponse<Boolean>, Boolean> {
        val url = "${this.client.host}/api/v2/users/${userId}/management/principal_authentication"

        var params = {
        };

        if (info.type == 'P') {
            params = {
                var type = 'P';
                var name = info.name;
                var idCard = info.idCard;
                var ext = info.bankCard
            }
        } else {
            params = {
                var type = 'E';
                var name = info.enterpriseName;
                var idCard = info.enterpriseCode;
                var ext = info.legalPersonName
            };
        }
        return client.createHttpPostCall(
            url,
            Gson().toJson(params),
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code === 200 }
    }
}