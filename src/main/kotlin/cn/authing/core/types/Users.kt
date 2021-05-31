package cn.authing.core.types

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class IHasRoleParam
@JvmOverloads
constructor(
    var userId: String,
    var roleCode: String,
    var namespace: String? = null
)

data class CreateUserOptions
@JvmOverloads
constructor(
    var keepPassword: Boolean?
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
    var ids: List<String>,
    var type: BatchGetUserQueryFieldEnum? = BatchGetUserQueryFieldEnum.Id
)

data class BatchGetUserOptions
@JvmOverloads
constructor(
    var queryField: BatchGetUserQueryFieldEnum
)

data class UserMfaStatus
@JvmOverloads
constructor(
    var OTP: Boolean? = null,
    var FACE: Boolean? = null
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

data class CheckLoginStatusParams
@JvmOverloads
constructor(
    var userId: String,
    var appId: String? = null,
    var deviceId: String? = null
)

data class UserCheckLoginStatusResponse
@JvmOverloads
constructor(
    var isLogin: Boolean,
    var user: User? = null,
    var application: List<Application>? = null
)

data class UserLogoutParams
@JvmOverloads
constructor(
    var userId: String,
    var appId: String? = null
)

data class RestSetUdfValueParams
constructor(
    val targetType: String,
    val targetId: String,
    val data: Map<String, Any>
)

data class RestAddRolesParams
constructor(
    val userId: String,
    @Expose
    val namespace: String,
    @Expose
    val list: List<String>
)
