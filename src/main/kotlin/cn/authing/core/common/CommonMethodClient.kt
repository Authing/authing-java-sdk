package cn.authing.core.common

import cn.authing.core.Utils
import cn.authing.core.http.HttpCall
import cn.authing.core.mgmt.ManagementClient
import cn.authing.core.types.HttpRequestParam
import cn.authing.core.types.MethodEnum
import cn.authing.core.types.RestfulResponse
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken


class CommonMethodClient(private val client: ManagementClient) {

    /**
     * 通用方法进行 http 请求通信
     */
    fun commonHttpClient(options: HttpRequestParam): HttpCall<RestfulResponse<Any>, RestfulResponse<Any>> {

        var method = options.method;

        var url = "${client.host}"+options.url;

        if (MethodEnum.GET.equals(method)) {
            return client.createHttpGetCall(
                Utils().getQueryUrl(url, options.params),
                object : TypeToken<RestfulResponse<Any>>() {}
            ) {
                it
            }
        } else if (MethodEnum.POST.equals(method)) {
            return client.createHttpPostCall(url,
                GsonBuilder().create().toJson(options.params),
                object : TypeToken<RestfulResponse<Any>>() {}
            ) {
                it
            }
        } else if (MethodEnum.PUT.equals(method)) {
            return client.createHttpPutCall(url,
                GsonBuilder().create().toJson(options.params),
                object : TypeToken<RestfulResponse<Any>>() {}
            ) {
                it
            }
        } else if (MethodEnum.DELETE.equals(method)) {
            return client.createHttpDeleteCall(
                url,
                object : TypeToken<RestfulResponse<Any>>() {}
            ) {
                it
            }
        }else{
            throw Exception("抱歉，目前暂不支持对应的请求方式，支持的请求方式有：POST/GET/PUT/DELETE");
        }

        throw Exception("调用失败");
    }


}