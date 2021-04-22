package cn.authing.core.types

import com.google.gson.annotations.SerializedName

class IHasRoleParam
@JvmOverloads
constructor(
    val userId: String,
    val roleCode: String,
    val namespace: String? = null
)

data class CreateUserOptions
@JvmOverloads
constructor(
    val keepPassword: Boolean?
)

enum class BatchGetUserQueryFieldEnum {

    @SerializedName("id")
    Id,

    @SerializedName("username")
    Username,

    @SerializedName("phone")
    Phone,

    @SerializedName("email")
    Email,

    @SerializedName("externalId")
    ExternalId;
}

data class BatchGetUserPostData(
    val ids: List<String>,
    val type: BatchGetUserQueryFieldEnum? = BatchGetUserQueryFieldEnum.Id
)

data class BatchGetUserOptions
@JvmOverloads
constructor(
    var queryField: BatchGetUserQueryFieldEnum
)

data class UserMfaStatus
@JvmOverloads
constructor(
    val OTP: Boolean? = null,
    val FACE: Boolean? = null
)

enum class UserMfaType {
    OTP,
    FACE
}

data class ListUserActionsParams
@JvmOverloads
constructor(
    @SerializedName("clientip")
    var clientIp: String? = null,
    @SerializedName("operation_name")
    var operationName: String? = null,
    @SerializedName("operator_arn")
    var operatoArn: String? = null,
    var page: Int? = 1,
    var limit: Int? = 10
)
