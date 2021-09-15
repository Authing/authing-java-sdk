package cn.authing.core.mgmt

import cn.authing.core.http.HttpCall
import cn.authing.core.types.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class AgreementManagementClient(private val client: ManagementClient) {

    /**
     * @description 在某个应用下创建注册协议
     * @param {object} appId 应用 ID
     * @param {object} agreement
     * @param {string} agreement.title 协议标题，可以包含 HTML A 标签
     * @param {boolean} [agreement.required] 是否必须才允许注册，默认为 true
     * @param {lang} [agreement.lang] 协议标题语言，可选 zh-CN, en-US，默认为 zh-CN，在托管登录页面中会根据界面语言展示协议
     */
    fun create(
    appId: String,
    options: AgreementParams
    ):HttpCall<RestfulResponse<AgreementDetail>, AgreementDetail> {
        val url = "${this.client.host}/api/v2/applications/${appId}/agreements"
        return client.createHttpPostCall(
            url,
            Gson().toJson(options),
            object : TypeToken<RestfulResponse<AgreementDetail>>() {}
        ) { it.data }
    }

    /**
     * @description 获取应用注册协议列表
     * @param {string} appId 应用 ID
     */
    fun list(
        appId: String
    ):HttpCall<RestfulResponse<AgreementList>, AgreementList>{
        val url = "${this.client.host}/api/v2/applications/${appId}/agreements"
        return client.createHttpGetCall(
            url,
            object : TypeToken<RestfulResponse<AgreementList>>() {}
        ) { it.data }
    }

    /**
     * @description 删除应用下某个注册协议
     * @param {string} appId 应用 ID
     * @param {number} agreementId 协议 ID
     */
    fun delete(
        appId: String,
        agreementId: String
    ):HttpCall<RestfulResponse<Boolean>,Boolean>{
        val url = "${this.client.host}/api/v2/applications/${appId}/agreements/${agreementId}"
        return client.createHttpDeleteCall(
            url,
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.code == 200 }
    }

    /**
     * @description 修改应用下某个注册协议
     * @param {string} appId 应用 ID
     * @param {number} agreementId 协议 ID
     * @param {object} updates 更新内容
     * @param {string} [updates.title] 协议标题，可以包含 HTML A 标签
     * @param {boolean} [updates.required] 是否必须才允许注册，默认为 true
     * @param {lang} [updates.lang] 协议标题语言，可选 zh-CN, en-US，默认为 zh-CN，在托管登录页面中会根据界面语言展示协议
     */
    fun modify(
        appId: String,
        agreementId: String,
        updates: AgreementParams
    ):HttpCall<RestfulResponse<AgreementDetail>,AgreementDetail>{
        val url = "${this.client.host}/api/v2/applications/${appId}/agreements/${agreementId}"
        return client.createHttpPutCall(
            url,
            Gson().toJson(updates),
            object : TypeToken<RestfulResponse<AgreementDetail>>() {}
        ) { it.data }
    }

    /**
     * @description 对某个应用下的注册协议进行排序
     * @param {string} appId 应用 ID
     * @param {number[]} order 应用下所有协议的 ID 列表，按需要的顺序排列
     */
   fun sort(
       appId: String,
       order: List<String>
   ):HttpCall<RestfulResponse<Boolean>,Boolean>{
        val url = "${this.client.host}/api/v2/applications/${appId}/agreements/sort"
        return client.createHttpPutCall(
            url,
            "{ ids : ${Gson().toJson(order)} }",
            object : TypeToken<RestfulResponse<Boolean>>() {}
        ) { it.data }
    }
}