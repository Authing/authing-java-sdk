package cn.authing.core.types

import com.google.gson.Gson
import java.util.*

//此文件放置自定义扩展类型


data class SecurityLevel(
    // 是否绑定了邮箱
    var email: Boolean?,
    // 是否设置了密码
    var password: Boolean?,
    // 是否绑定了手机号
    var phone: Boolean?,
    // 账户的总体安全等级评分
    var score: String?,
    // 密码安全等级，null 表示密码还未做过安全等级检测检测
    var passwordSecurityLevel: PasswordSecurityLevel?
)


enum class PasswordSecurityLevel(val level: Int) {
    LOW(1),
    MIDDLE(2),
    HIGH(3);

    companion object {
        @JvmStatic
        fun valueOfLabel(level: Int): PasswordSecurityLevel? {
            return values().find { it.level == level }
        }
    }
}

fun convertUdvToKeyValuePair(data:List<UserDefinedData>): Map<String,Any> {
    val hashtable = Hashtable<String, Any>()
    val gson = Gson()
    for (item in data){
        hashtable.put(item.key,item.value)
//        if (item.dataType === UdfDataType.NUMBER) {
//            hashtable.put(item.key,gson.fromJson(item.value, Map::class.java))
//        } else if (item.dataType === UdfDataType.BOOLEAN) {
//            hashtable.put(item.key,gson.fromJson(item.value, Map::class.java))
//        } else if (item.dataType === UdfDataType.DATETIME) {
//            hashtable.put(item.key,item.value)
//        } else if (item.dataType === UdfDataType.OBJECT) {
//            hashtable.put(item.key,gson.fromJson(item.value, Map::class.java))
//        }
    }
    return hashtable
}

data class SetUdfValueBatchInputItem(
    // 用户id
    var userId: String,
    // 用户自定义属性键值对
    var data: Map<String,String>
)

enum class ProtocolEnum(val value: String) {
    OAUTH("oauth"),
    OIDC("oidc"),
    CAS("cas"),
    SAML("saml");

    companion object {
        @JvmStatic
        fun valueOfLabel(value: String): ProtocolEnum? {
            return values().find { it.value == value }
        }
    }
}

enum class AuthMethodEnum(val value: String) {
    CLIENT_SECRET_POST("client_secret_post"),
    CLIENT_SECRET_BASIC("client_secret_basic"),
    NONE("none");

    companion object {
        @JvmStatic
        fun valueOfLabel(value: String): AuthMethodEnum? {
            return values().find { it.value == value }
        }
    }
}

data class ClientCredentialInput(
    // key,appid
    var accessKey: String,
    // 密钥
    var accessSecret: String
)
