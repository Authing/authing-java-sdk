package cn.authing.core.types

import com.google.gson.annotations.SerializedName

data class SendPhoneVerifyCodeResponse(
        @SerializedName("message")
        var message: String? = null,
        @SerializedName("code")
        var code: Int? = null,
        @SerializedName("status")
        var status: Boolean? = null
)