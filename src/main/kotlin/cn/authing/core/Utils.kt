package cn.authing.core

import java.net.URLDecoder
import kotlin.random.Random


class Utils {
    fun getQueryUrl(url: String?, params: Map<String, String?>): String {
        val builder = StringBuilder(url)
        var isFirst = true
        for (key in params.keys) {
            if (params[key] != null) {
                if (isFirst) {
                    isFirst = false
                    builder.append("?")
                } else {
                    builder.append("&")
                }
                builder.append(key)
                    .append("=")
                    .append(params[key])
            }
        }
        return builder.toString()
    }

    fun getQueryUrl(params: Map<String, String?>): String {
        return this.getQueryUrl("", params)
    }

    fun randomString(randomLength: Number): String {
        val template = "abcdefhijkmnprstwxyz2345678".toCharArray()


        var returnValue = "";

        for (item in 1..randomLength as Int)
            returnValue += template[Random.nextInt(template.size)]

        return returnValue
    }

    fun getQueryParams(url: String): Map<String, Any> {
        var url = url
        val map: MutableMap<String, Any> = HashMap()
        try {
            val charset = "utf-8"
            url = URLDecoder.decode(url, charset)
            if (url.indexOf('?') != -1) {
                val contents = url.substring(url.indexOf('?') + 1)
                val keyValues = contents.split("&").toTypedArray()
                for (i in keyValues.indices) {
                    val key = keyValues[i].substring(0, keyValues[i].indexOf("="))
                    val value = keyValues[i].substring(keyValues[i].indexOf("=") + 1)
                    map[key] = value
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return map
    }
}