package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
import com.google.gson.annotations.SerializedName


data class UserpoolResponse(

    @SerializedName("userpool")
    val result: UserPool
)

class UserpoolParam {


    fun build(): UserpoolParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            userpoolDocument,
            this
        );
    }

    private val userpoolDocument: String = """
query userpool {
  userpool {
    id
    name
    domain
    description
    secret
    jwtSecret
    userpoolTypes {
      code
      name
      description
      image
      sdks
    }
    logo
    createdAt
    updatedAt
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWxQRCodeWhenRegisterDisabled
    allowedOrigins
    tokenExpiresAfter
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enabled
    }
    loginFailCheck {
      timeInterval
      limit
      enabled
    }
    changePhoneStrategy {
      verifyOldPhone
    }
    changeEmailStrategy {
      verifyOldEmail
    }
    qrcodeLoginStrategy {
      qrcodeExpiresAfter
      returnFullUserInfo
      allowExchangeUserInfoFromBrowser
      ticketExpiresAfter
    }
    app2WxappLoginStrategy {
      ticketExpriresAfter
      ticketExchangeUserInfoNeedSecret
    }
    whitelist {
      phoneEnabled
      emailEnabled
      usernameEnabled
    }
    customSMSProvider {
      enabled
      provider
    }
  }
}
"""
}


data class DeleteUserpoolResponse(

    @SerializedName("deleteUserpool")
    val result: CommonMessage
)

class DeleteUserpoolParam {


    fun build(): DeleteUserpoolParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deleteUserpoolDocument,
            this
        );
    }

    private val deleteUserpoolDocument: String = """
mutation deleteUserpool {
  deleteUserpool {
    message
    code
  }
}
"""
}


data class UpdateUserpoolResponse(

    @SerializedName("updateUserpool")
    val result: UserPool
)

class UpdateUserpoolParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: UpdateUserpoolInput
) {


    fun build(): UpdateUserpoolParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            updateUserpoolDocument,
            this
        );
    }

    private val updateUserpoolDocument: String = """
mutation updateUserpool(${'$'}input: UpdateUserpoolInput!) {
  updateUserpool(input: ${'$'}input) {
    id
    name
    domain
    description
    secret
    jwtSecret
    userpoolTypes {
      code
      name
      description
      image
      sdks
    }
    logo
    createdAt
    updatedAt
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWxQRCodeWhenRegisterDisabled
    allowedOrigins
    tokenExpiresAfter
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enabled
    }
    loginFailCheck {
      timeInterval
      limit
      enabled
    }
    changePhoneStrategy {
      verifyOldPhone
    }
    changeEmailStrategy {
      verifyOldEmail
    }
    qrcodeLoginStrategy {
      qrcodeExpiresAfter
      returnFullUserInfo
      allowExchangeUserInfoFromBrowser
      ticketExpiresAfter
    }
    app2WxappLoginStrategy {
      ticketExpriresAfter
      ticketExchangeUserInfoNeedSecret
    }
    whitelist {
      phoneEnabled
      emailEnabled
      usernameEnabled
    }
    customSMSProvider {
      enabled
      provider
    }
  }
}
"""
}


data class CreateUserpoolResponse(

    @SerializedName("createUserpool")
    val result: UserPool
)

class CreateUserpoolParam @JvmOverloads constructor(
    @SerializedName("name")
    var name: String,
    @SerializedName("domain")
    var domain: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("logo")
    var logo: String? = null,
    @SerializedName("userpoolTypes")
    var userpoolTypes: List<String>? = null
) {

    fun withDescription(description: String?): CreateUserpoolParam {
        this.description = description
        return this
    }

    fun withLogo(logo: String?): CreateUserpoolParam {
        this.logo = logo
        return this
    }

    fun withUserpoolTypes(userpoolTypes: List<String>?): CreateUserpoolParam {
        this.userpoolTypes = userpoolTypes
        return this
    }

    fun build(): CreateUserpoolParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            createUserpoolDocument,
            this
        );
    }

    private val createUserpoolDocument: String = """
mutation createUserpool(${'$'}name: String!, ${'$'}domain: String!, ${'$'}description: String, ${'$'}logo: String, ${'$'}userpoolTypes: [String!]) {
  createUserpool(name: ${'$'}name, domain: ${'$'}domain, description: ${'$'}description, logo: ${'$'}logo, userpoolTypes: ${'$'}userpoolTypes) {
    id
    name
    domain
    description
    secret
    jwtSecret
    userpoolTypes {
      code
      name
      description
      image
      sdks
    }
    logo
    createdAt
    updatedAt
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWxQRCodeWhenRegisterDisabled
    allowedOrigins
    tokenExpiresAfter
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enabled
    }
    loginFailCheck {
      timeInterval
      limit
      enabled
    }
    changePhoneStrategy {
      verifyOldPhone
    }
    changeEmailStrategy {
      verifyOldEmail
    }
    qrcodeLoginStrategy {
      qrcodeExpiresAfter
      returnFullUserInfo
      allowExchangeUserInfoFromBrowser
      ticketExpiresAfter
    }
    app2WxappLoginStrategy {
      ticketExpriresAfter
      ticketExchangeUserInfoNeedSecret
    }
    whitelist {
      phoneEnabled
      emailEnabled
      usernameEnabled
    }
    customSMSProvider {
      enabled
      provider
    }
  }
}
"""
}

data class UpdateUserpoolInput @JvmOverloads constructor(
    /** @param [name] name */
    @SerializedName("name")
    var name: String? = null,
    /** @param [logo] logo */
    @SerializedName("logo")
    var logo: String? = null,
    /** @param [domain] domain */
    @SerializedName("domain")
    var domain: String? = null,
    /** @param [description] description */
    @SerializedName("description")
    var description: String? = null,
    /** @param [userpoolTypes] userpoolTypes */
    @SerializedName("userpoolTypes")
    var userpoolTypes: List<String>? = null,
    /** @param [emailVerifiedDefault] emailVerifiedDefault */
    @SerializedName("emailVerifiedDefault")
    var emailVerifiedDefault: Boolean? = null,
    /** @param [sendWelcomeEmail] sendWelcomeEmail */
    @SerializedName("sendWelcomeEmail")
    var sendWelcomeEmail: Boolean? = null,
    /** @param [registerDisabled] registerDisabled */
    @SerializedName("registerDisabled")
    var registerDisabled: Boolean? = null,
    /** @param [allowedOrigins] allowedOrigins */
    @SerializedName("allowedOrigins")
    var allowedOrigins: String? = null,
    /** @param [tokenExpiresAfter] tokenExpiresAfter */
    @SerializedName("tokenExpiresAfter")
    var tokenExpiresAfter: Int? = null,
    /** @param [frequentRegisterCheck] frequentRegisterCheck */
    @SerializedName("frequentRegisterCheck")
    var frequentRegisterCheck: FrequentRegisterCheckConfigInput? = null,
    /** @param [loginFailCheck] loginFailCheck */
    @SerializedName("loginFailCheck")
    var loginFailCheck: LoginFailCheckConfigInput? = null,
    /** @param [changePhoneStrategy] changePhoneStrategy */
    @SerializedName("changePhoneStrategy")
    var changePhoneStrategy: ChangePhoneStrategyInput? = null,
    /** @param [changeEmailStrategy] changeEmailStrategy */
    @SerializedName("changeEmailStrategy")
    var changeEmailStrategy: ChangeEmailStrategyInput? = null,
    /** @param [qrcodeLoginStrategy] qrcodeLoginStrategy */
    @SerializedName("qrcodeLoginStrategy")
    var qrcodeLoginStrategy: QrcodeLoginStrategyInput? = null,
    /** @param [app2WxappLoginStrategy] app2WxappLoginStrategy */
    @SerializedName("app2WxappLoginStrategy")
    var app2WxappLoginStrategy: App2WxappLoginStrategyInput? = null,
    /** @param [whitelist] whitelist */
    @SerializedName("whitelist")
    var whitelist: RegisterWhiteListConfigInput? = null,
    /** @param [customSMSProvider] 自定义短信服务商配置 */
    @SerializedName("customSMSProvider")
    var customSMSProvider: CustomSmsProviderInput? = null
) {

    /** @param [name] name */
    fun withName(name: String): UpdateUserpoolInput {
        this.name = name
        return this
    }

    /** @param [logo] logo */
    fun withLogo(logo: String): UpdateUserpoolInput {
        this.logo = logo
        return this
    }

    /** @param [domain] domain */
    fun withDomain(domain: String): UpdateUserpoolInput {
        this.domain = domain
        return this
    }

    /** @param [description] description */
    fun withDescription(description: String): UpdateUserpoolInput {
        this.description = description
        return this
    }

    /** @param [userpoolTypes] userpoolTypes */
    fun withUserpoolTypes(userpoolTypes: List<String>): UpdateUserpoolInput {
        this.userpoolTypes = userpoolTypes
        return this
    }

    /** @param [emailVerifiedDefault] emailVerifiedDefault */
    fun withEmailVerifiedDefault(emailVerifiedDefault: Boolean): UpdateUserpoolInput {
        this.emailVerifiedDefault = emailVerifiedDefault
        return this
    }

    /** @param [sendWelcomeEmail] sendWelcomeEmail */
    fun withSendWelcomeEmail(sendWelcomeEmail: Boolean): UpdateUserpoolInput {
        this.sendWelcomeEmail = sendWelcomeEmail
        return this
    }

    /** @param [registerDisabled] registerDisabled */
    fun withRegisterDisabled(registerDisabled: Boolean): UpdateUserpoolInput {
        this.registerDisabled = registerDisabled
        return this
    }

    /** @param [allowedOrigins] allowedOrigins */
    fun withAllowedOrigins(allowedOrigins: String): UpdateUserpoolInput {
        this.allowedOrigins = allowedOrigins
        return this
    }

    /** @param [tokenExpiresAfter] tokenExpiresAfter */
    fun withTokenExpiresAfter(tokenExpiresAfter: Int): UpdateUserpoolInput {
        this.tokenExpiresAfter = tokenExpiresAfter
        return this
    }

    /** @param [frequentRegisterCheck] frequentRegisterCheck */
    fun withFrequentRegisterCheck(frequentRegisterCheck: FrequentRegisterCheckConfigInput): UpdateUserpoolInput {
        this.frequentRegisterCheck = frequentRegisterCheck
        return this
    }

    /** @param [loginFailCheck] loginFailCheck */
    fun withLoginFailCheck(loginFailCheck: LoginFailCheckConfigInput): UpdateUserpoolInput {
        this.loginFailCheck = loginFailCheck
        return this
    }

    /** @param [changePhoneStrategy] changePhoneStrategy */
    fun withChangePhoneStrategy(changePhoneStrategy: ChangePhoneStrategyInput): UpdateUserpoolInput {
        this.changePhoneStrategy = changePhoneStrategy
        return this
    }

    /** @param [changeEmailStrategy] changeEmailStrategy */
    fun withChangeEmailStrategy(changeEmailStrategy: ChangeEmailStrategyInput): UpdateUserpoolInput {
        this.changeEmailStrategy = changeEmailStrategy
        return this
    }

    /** @param [qrcodeLoginStrategy] qrcodeLoginStrategy */
    fun withQrcodeLoginStrategy(qrcodeLoginStrategy: QrcodeLoginStrategyInput): UpdateUserpoolInput {
        this.qrcodeLoginStrategy = qrcodeLoginStrategy
        return this
    }

    /** @param [app2WxappLoginStrategy] app2WxappLoginStrategy */
    fun withApp2WxappLoginStrategy(app2WxappLoginStrategy: App2WxappLoginStrategyInput): UpdateUserpoolInput {
        this.app2WxappLoginStrategy = app2WxappLoginStrategy
        return this
    }

    /** @param [whitelist] whitelist */
    fun withWhitelist(whitelist: RegisterWhiteListConfigInput): UpdateUserpoolInput {
        this.whitelist = whitelist
        return this
    }

    /** @param [customSMSProvider] 自定义短信服务商配置 */
    fun withCustomSmsProvider(customSMSProvider: CustomSmsProviderInput): UpdateUserpoolInput {
        this.customSMSProvider = customSMSProvider
        return this
    }

    fun build(): UpdateUserpoolInput {
        return this
    }
}
