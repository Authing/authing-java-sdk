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
    var logoutRedirectUris: List<String>,

    /**
     * 是否开启 OIDC 协议功能
     */
    var oidcProviderEnabled: Boolean,

    /**
     * 是否开启 ouath 协议功能
     */
    var oauthProviderEnabled: Boolean,

    /**
     * 是否开启 saml 协议功能
     */
    var samlProviderEnabled: Boolean,

    /**
     * 是否禁止注册
     */
    var registerDisabled: Boolean,

    /**
     * 登录 Tab 列表
     */
    var loginTabs: List<String>,

    /**
     * 默认登录 Tab
     */
    var defaultLoginTab: String,

    /**
     * 注册 Tab 列表
     */
    var registerTabs: List<String>,

    /**
     * 默认注册 Tab
     */
    var defaultRegisterTab: String,

    /**
     * 开启的 ldap 连接 id
     */
    var ldapConnections: List<String>,

    /**
     * 开启的 Active Directory 连接 ID
     */
    var adConnections: List<String>,

    /**
     * 不开启的社会化登录 provider, 如 google, wechat
     */
    var disabledSocialConnections: List<String>,

    /**
     * 不开启的 OIDC 连接 ID
     */
    var disabledOidcConnections: List<String>,

    /**
     * 不开启的 SAML 连接 ID
     */
    var disabledSamlConnections: List<String>,

    /**
     * 不开启的 OAuth2.0 连接 ID
     */
    var disabledOauth2Connections: List<String>,

    /**
     * 不开启的 CAS 连接 ID
     */
    var disabledCasConnections: List<String>,

    /**
     * 不开启的 Azure AD 连接 ID
     */
    var disabledAzureAdConnections: List<String>,

    var extendsFieldsEnabled: Boolean,

    /**
     * 注册信息补全配置
     */
    var extendsFields: List<ExtendsField>,

    var ext: Any,

    /**
     * 自定义 CSS
     */
    var css: String,

    var qrcodeScanning: ApplicationQRCodeScanning,

    /**
     * OIDC 配置
     */
    var oidcConfig: Any,

    var samlConfig: Any,

    var oauthConfig: Any,

    var showAuthorizationPage: Boolean,

    var permissionStrategy: ApplicationPermissionStrategyConfig,

    /**
     * 是否开启子账号功能
     */
    var enableSubAccount: Boolean

)

data class ISsoPageCustomizationSettings(
    var hideIdp: Boolean,
    var hideForgetPassword: Boolean,
    var autoRegisterThenLogin: Boolean,
    var hideSocialLogin: Boolean,
    var hideLoginByPhoneCode: Boolean,
    var hideRegister: Boolean,
    var hideUserPasswordLogin: Boolean,
    var hideWxMpScanLogin: Boolean,
    var hideRegisterByPhone: Boolean,
    var hideRegisterByEmail: Boolean
)

data class ExtendsField(
    var type: String,
    var id: String,
    var name: String,
    var label: String,
    var inputType: String
)

data class ApplicationQRCodeScanning(
    var redirect: Boolean,
    var intervar: Int
)

data class ApplicationPermissionStrategyConfig(
    /**
     * 是否开启应用授权功能
     */
    var enabled: Boolean,

    /**
     * 应用授权默认策略，允许所有（ALLOW_ALL）或者拒绝所有（DENY_ALL）
     */
    var defaultStrategy: String,

    /**
     * 「允许登录策略」的 ID
     */
    var allowPolicyId: String,

    /**
     * 「拒绝登录策略」的 ID
     */
    var denyPolicyId: String
)

data class ListApplicationResponse(
    var list: List<Application>,
    var totalCount: Int
)

data class ApplicationPublicDetail(
    var id: String,
    var createdAt: String,
    var updatedAt: String,
    var name: String,
    var logo: String,
    var domain: String,
    var description: String,
    var protocol: String
)

class IActiveUsersParam
@JvmOverloads
constructor(
    var appId: String,
    var page: Int? = 1,
    var limit: Int? = 10
)

data class IThirdPartyIdentity(
    var provider: String,
    var refreshToken: String,
    var accessToken: String,
    var scope: String,
    var expiresIn: String,
    var updatedAt: String
)

class ActiveUser
@JvmOverloads
constructor(
    var id: String,
    var createdAt: String,
    var updatedAt: String,
    var userPoolId: String,
    var isRoot: Boolean,
    var status: String,
    var oauth: String? = null,
    var email: String? = null,
    var phone: String? = null,
    var username: String,
    var unionid: String? = null,
    var openid: String? = null,
    var nickname: String? = null,
    var company: String? = null,
    var photo: String,
    var browser: String? = null,
    var device: String? = null,
    var password: String,
    var salt: String? = null,
    var token: String,
    var tokenExpiredAt: String,
    var loginsCount: Int,
    var lastIp: String,
    var name: String? = null,
    var givenName: String? = null,
    var familyName: String? = null,
    var middleName: String? = null,
    var profile: String? = null,
    var preferredUsername: String? = null,
    var website: String? = null,
    var gender: String,
    var birthdate: String? = null,
    var zoneinfo: String? = null,
    var locale: String? = null,
    var address: String? = null,
    var formatted: Boolean?,
    var streetAddress: String? = null,
    var locality: String? = null,
    var region: String? = null,
    var postalCode: String? = null,
    var city: String? = null,
    var province: String? = null,
    var country: String? = null,
    var registerSource: List<String>,
    var secretInfo: String? = null,
    var emailVerified: Boolean,
    var phoneVerified: Boolean,
    var lastLogin: String,
    var blocked: Boolean,
    var isDeleted: Boolean,
    var sendSmsCount: Int,
    var sendSmsLimitCount: Int,
    var signedUp: String,
    var externalId: String? = null,
    var mainDepartmentId: String? = null,
    var mainDepartmentCode: String? = null,
    var lastMfaTime: String? = null,
    var passwordSecurityLevel: Int,
    var thirdPartyIdentity: IThirdPartyIdentity
)


data class CreateResourceParams
@JvmOverloads
constructor(
    var code: String,
    var type: ResourceType,
    var actions: List<IAction>,
    var description: String? = null
)

data class UpdateResourceParams
@JvmOverloads
constructor(
    var code: String,
    var type: ResourceType,
    var actions: List<IAction>,
    var description: String? = null
)

data class ResourceOptionsParams
@JvmOverloads
constructor(
    var code: String,
    var type: ResourceType,
    var actions: List<IAction>,
    var description: String? = null
)

data class IAccessPolicyParams
@JvmOverloads
constructor(
    var targetType: TargetTypeEnum,
    var targetIdentifiers: List<String>,
    var inheritByChildren: String? = null
)

data class CreateRoleParams
@JvmOverloads
constructor(
    var code: String,
    var description: String? = null
)

data class UpdateRoleParams @JvmOverloads constructor(
    var code: String,
    var description: String? = null,
    var newCode: String? = null
)

data class DenyAccessParams
@JvmOverloads
constructor(
    var targetType: TargetTypeEnum,
    var targetIdentifiers: List<String>,
    var inheritByChildren: String? = null
)

data class CreateAppParams
@JvmOverloads
constructor(
    var name: String,
    var identifier: String,
    var redirectUris: List<String>,
    var logo: String? = null

)

data class ListResourcesParams
@JvmOverloads
constructor(
    var appId: String,
    var type: ResourceType? = null,
    var limit: Number = 10,
    var page: Number = 1
)