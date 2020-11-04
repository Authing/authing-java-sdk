package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
import com.google.gson.annotations.SerializedName

enum class WhitelistType(val label: String) {
    USERNAME("USERNAME"),
    EMAIL("EMAIL"),
    PHONE("PHONE");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): WhitelistType? {
            return values().find { it.label == label }
        }
    }
}

data class WhiteList(
    /** @param [createdAt] createdAt */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] updatedAt */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [value] value */
    @SerializedName("value")
    var value: String
)

class WhitelistParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: WhitelistType
) {
    fun build(): WhitelistParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            whitelistDocument,
            this
        );
    }

    private val whitelistDocument: String = """
query whitelist(${'$'}type: WhitelistType!) {
  whitelist(type: ${'$'}type) {
    createdAt
    updatedAt
    value
  }
}
"""
}

class AddWhitelistParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: WhitelistType,
    @SerializedName("list")
    var list: List<String>
) {


    fun build(): AddWhitelistParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            addWhitelistDocument,
            this
        );
    }

    private val addWhitelistDocument: String = """
mutation addWhitelist(${'$'}type: WhitelistType!, ${'$'}list: [String!]!) {
  addWhitelist(type: ${'$'}type, list: ${'$'}list) {
    createdAt
    updatedAt
    value
  }
}
"""
}


class RemoveWhitelistParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: WhitelistType,
    @SerializedName("list")
    var list: List<String>
) {


    fun build(): RemoveWhitelistParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            removeWhitelistDocument,
            this
        );
    }

    private val removeWhitelistDocument: String = """
mutation removeWhitelist(${'$'}type: WhitelistType!, ${'$'}list: [String!]!) {
  removeWhitelist(type: ${'$'}type, list: ${'$'}list) {
    createdAt
    updatedAt
    value
  }
}
"""
}

data class WhitelistResponse(

    @SerializedName("whitelist")
    val result: List<WhiteList>
)

data class RemoveWhitelistResponse(

    @SerializedName("removeWhitelist")
    val result: List<WhiteList>
)


data class AddWhitelistResponse(

    @SerializedName("addWhitelist")
    val result: List<WhiteList>
)
