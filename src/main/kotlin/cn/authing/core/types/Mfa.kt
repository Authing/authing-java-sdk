package cn.authing.core.types

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.sql.Blob

data class IMfaAuthenticator(
    val id: String,
    val createdAt: String,
    val updatedAt: String,
    val userId: String,
    val enable: Boolean,
    val secret: String,
    val authenticatorType: String,
    val recoveryCode: String
)

enum class TotpSource {
    @SerializedName("APPLICATION")
    APPLICATION,
    @SerializedName("SELF")
    SELF;
}

data class GetMfaAuthenticatorsParams
@JvmOverloads
constructor(
    @Expose
    val type: String,
    val mfaToken: String? = null ,
    @Expose
    val source: TotpSource? = TotpSource.SELF
)

data class AssosicateMfaAuthenticatorParams
@JvmOverloads
constructor(
    @Expose
    @SerializedName("authenticator_type")
    val authenticatorType: String,
    val mfaToken: String? = null,
    @Expose
    val source: TotpSource? = TotpSource.SELF
)

data class IMfaAssociation(
    val authenticator_type: String,
    val secret: String,
    val qrcode_uri: String,
    val qrcode_data_url: String,
    val recovery_code: String
)

data class ConfirmAssosicateMfaAuthenticatorParams
@JvmOverloads
constructor(
    @Expose
    @SerializedName("authenticator_type")
    val authenticatorType: String,
    @Expose
    val totp: String? = null,
    @Expose
    val source: TotpSource? = TotpSource.SELF,
    val mfaToken: String? = null
)

data class VerifyTotpMfaParams(
    val totp: String,
    val mfaToken: String
)

data class PhoneOrEmailBindableParams
@JvmOverloads
constructor(
    @Expose
    val phone: String? = null,
    @Expose
    val email: String? = null,
    val mfaToken: String
)

data class VerifyTotpRecoveryCodeParams(
    @Expose
    val recoveryCode: String,
    val mfaToken: String
)

data class AssociateFaceByUrlParams
@JvmOverloads
constructor(
    @Expose
    val baseFace: String,
    @Expose
    val compareFace: String,
    val mfaToken: String? = null
)

data class AssociateFaceByBlobParams
@JvmOverloads
constructor(
    val baseFace: Blob,
    val compareFace: Blob,
    val mfaToken: String? = null
)
