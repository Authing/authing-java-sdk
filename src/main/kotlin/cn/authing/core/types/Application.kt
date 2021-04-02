package cn.authing.core.types

/**
 * 应用信息
 */
data class Application(

    /**
     * 应用 ID
     */
    var id: String,

    /**
     * 所属用户池 ID
     */
    var userPoolId: String,

    /**
     * 该应用对应的协议类型
     */
    var protocol: String,

    /**
     * 是否为官方应用
     */
    var isOfficial: Boolean,

    /**
     * 是否删除
     */
    var isDeleted: Boolean,

    /**
     * 是否为用户池默认应用
     */
    var isDefault: Boolean,

    /**
     * 应用名称
     */
    var name: String,

    /**
     * 应用描述信息
     */
    var description: String,

    /**
     * 密钥
     */
    var secret: String,

    /**
     * 应用唯一标志符，目前作为应用的二级域名
     */
    var identifier: String,

    /**
     * 为 id_token 签名的 jwk
     */
    var jwks: Any,

    /**
     * 页面自定义配置
     */
    var ssoPageCustomizationSettings: ISsoPageCustomizationSettings,

    /**
     * Logo
     */
    var logo: String,

    /**
     * 回调链接
     */
    var redirectUris: List<String>,

    /**
     * 退出登录回调链接
     */
    val logoutRedirectUris: List<String>,

    /**
     * 是否开启 OIDC 协议功能
     */
    val oidcProviderEnabled: Boolean,

    /**
     * 是否开启 ouath 协议功能
     */
    val oauthProviderEnabled: Boolean,

    /**
     * 是否开启 saml 协议功能
     */
    val samlProviderEnabled: Boolean,

    /**
     * 是否禁止注册
     */
    val registerDisabled: Boolean,

    /**
     * 登录 Tab 列表
     */
    val loginTabs: List<String>,

    /**
     * 默认登录 Tab
     */
    val defaultLoginTab: String,

    /**
     * 注册 Tab 列表
     */
    val registerTabs: List<String>,

    /**
     * 默认注册 Tab
     */
    val defaultRegisterTab: String,

    /**
     * 开启的 ldap 连接 id
     */
    val ldapConnections: List<String>,

    /**
     * 开启的 Active Directory 连接 ID
     */
    val adConnections: List<String>,

    /**
     * 不开启的社会化登录 provider, 如 google, wechat
     */
    val disabledSocialConnections: List<String>,

    /**
     * 不开启的 OIDC 连接 ID
     */
    val disabledOidcConnections: List<String>,

    /**
     * 不开启的 SAML 连接 ID
     */
    val disabledSamlConnections: List<String>,

    /**
     * 不开启的 OAuth2.0 连接 ID
     */
    val disabledOauth2Connections: List<String>,

    /**
     * 不开启的 CAS 连接 ID
     */
    val disabledCasConnections: List<String>,

    /**
     * 不开启的 Azure AD 连接 ID
     */
    val disabledAzureAdConnections: List<String>,

    val extendsFieldsEnabled: Boolean,

    /**
     * 注册信息补全配置
     */
    val extendsFields: List<ExtendsField>,

    val ext: Any,

    /**
     * 自定义 CSS
     */
    val css: String,

    val qrcodeScanning: ApplicationQRCodeScanning,

    /**
     * OIDC 配置
     */
    val oidcConfig: Any,

    val samlConfig: Any,

    val oauthConfig: Any,

    val showAuthorizationPage: Boolean,

    val permissionStrategy: ApplicationPermissionStrategyConfig,

    /**
     * 是否开启子账号功能
     */
    val enableSubAccount: Boolean

)

data class ISsoPageCustomizationSettings(
    val hideIdp: Boolean,
    val hideForgetPassword: Boolean,
    val autoRegisterThenLogin: Boolean,
    val hideSocialLogin: Boolean,
    val hideLoginByPhoneCode: Boolean,
    val hideRegister: Boolean,
    val hideUserPasswordLogin: Boolean,
    val hideWxMpScanLogin: Boolean,
    val hideRegisterByPhone: Boolean,
    val hideRegisterByEmail: Boolean
)

data class ExtendsField(
    val type: String,
    val id: String,
    val name: String,
    val label: String,
    val inputType: String
)

data class ApplicationQRCodeScanning(
    var redirect: Boolean,
    var interval: Number
)

data class ApplicationPermissionStrategyConfig(
    /**
     * 是否开启应用授权功能
     */
    val enabled: Boolean,

    /**
     * 应用授权默认策略，允许所有（ALLOW_ALL）或者拒绝所有（DENY_ALL）
     */
    val defaultStrategy: String,

    /**
     * 「允许登录策略」的 ID
     */
    val allowPolicyId: String,

    /**
     * 「拒绝登录策略」的 ID
     */
    var denyPolicyId: String
)

data class ListApplicationResponse(
    val list: List<Application>,
    val totalCount: Number
)

data class ApplicationPublicDetail(
    val id: String,
    val createdAt: String,
    val updatedAt: String,
    val name: String,
    val logo: String,
    val domain: String,
    val description: String,
    val protocol: String
)

data class ListAppPublicDetailResponse(
    val list: List<ApplicationPublicDetail>,
    val totalCount: Number
)