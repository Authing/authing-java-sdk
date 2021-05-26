package cn.authing.core.types

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.sql.Blob

data class IMfaAuthenticator(
    var id: String,
    var createdAt: String,
    var updatedAt: String,
    var userId: String,
    var enable: Boolean,
    var secret: String,
    var authenticatorType: String,
    var recoveryCode: String
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
    var type: String,
    var mfaToken: String? = null,
    @Expose
    var source: TotpSource? = TotpSource.SELF
)

data class AssosicateMfaAuthenticatorParams
@JvmOverloads
constructor(
    @Expose
    @SerializedName("authenticator_type")
    var authenticatorType: String,
    var mfaToken: String? = null,
    @Expose
    var source: TotpSource? = TotpSource.SELF
)

data class IMfaAssociation(
    var authenticator_type: String,
    var secret: String,
    var qrcode_uri: String,
    var qrcode_data_url: String,
    var recovery_code: String
)

data class ConfirmAssosicateMfaAuthenticatorParams
@JvmOverloads
constructor(
    @Expose
    @SerializedName("authenticator_type")
    var authenticatorType: String,
    @Expose
    var totp: String? = null,
    @Expose
    var source: TotpSource? = TotpSource.SELF,
    var mfaToken: String? = null
)

data class VerifyTotpMfaParams(
    var totp: String,
    var mfaToken: String
)

data class PhoneOrEmailBindableParams
@JvmOverloads
constructor(
    @Expose
    var phone: String? = null,
    @Expose
    var email: String? = null,
    var mfaToken: String
)

data class VerifyTotpRecoveryCodeParams(
    @Expose
    var recoveryCode: String,
    var mfaToken: String
)

data class AssociateFaceByUrlParams
@JvmOverloads
constructor(
    @Expose
    var baseFace: String,
    @Expose
    var compareFace: String,
    var mfaToken: String? = null
)

data class AssociateFaceByBlobParams
@JvmOverloads
constructor(
    var baseFace: Blob,
    var compareFace: Blob,
    var mfaToken: String? = null
)

data class VerifyAppSmsMfaParams
constructor(
    @Expose
    var phone: String,
    @Expose
    var code: String,
    var mfaToken: String
)

data class VerifyAppEmailMfaParams
constructor(
    @Expose
    var email: String,
    @Expose
    var code: String,
    var mfaToken: String
)

data class ImportTotpParams
@JvmOverloads
constructor(
    var userId: String,
    var secret: String,
    var recoveryCode: String? = null
)

data class ISetTotpResp
constructor(
    var userId: String,
    var enable: Boolean,
    var secret: String,
    var authenticatorType: String,
    var recoveryCode: String,
    var createdAt: String,
    var updatedAt: String,
    var id: String
)
