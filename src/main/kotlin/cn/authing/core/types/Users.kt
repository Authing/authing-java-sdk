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
    var queryField: BatchGetUserQueryFieldEnum,
    var userId: String,
    var roleCode: String,
    var namespace: String? = null
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