package cn.authing.core.types

import com.google.gson.annotations.SerializedName

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

data class CreateTenantParams
@JvmOverloads
constructor(
    var name: String,
    var appIds: String,
    var logo: String,
    var description: String
)

data class UpdateTenantParams
@JvmOverloads
constructor(
    var name: String,
    var appIds: String,
    var logo: String,
    var description: String
)

data class CreateTenantResponse(
    @SerializedName("apps")
    var apps: List<AppTenant>,
    @SerializedName("createdAt")
    var createdAt: String,
    @SerializedName("css")
    var css: Any,
    @SerializedName("description")
    var description: Any,
    @SerializedName("extendsFields")
    var extendsFields: Any,
    @SerializedName("id")
    var id: String,
    @SerializedName("logo")
    var logo: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("ssoPageCustomizationSettings")
    var ssoPageCustomizationSettings: Any,
    @SerializedName("updatedAt")
    var updatedAt: String,
    @SerializedName("userPoolId")
    var userPoolId: String
)

data class AppTenant(
    @SerializedName("adConnections")
    var adConnections: List<Any>,
    @SerializedName("agreementEnabled")
    var agreementEnabled: Boolean,
    @SerializedName("appType")
    var appType: String,
    @SerializedName("casConfig")
    var casConfig: CasConfig,
    @SerializedName("casExpireBaseBrowser")
    var casExpireBaseBrowser: Boolean,
    @SerializedName("casProviderEnabled")
    var casProviderEnabled: Boolean,
    @SerializedName("createdAt")
    var createdAt: String,
    @SerializedName("css")
    var css: String,
    @SerializedName("defaultLoginTab")
    var defaultLoginTab: String,
    @SerializedName("defaultRegisterTab")
    var defaultRegisterTab: String,
    @SerializedName("description")
    var description: Any,
    @SerializedName("disabledAzureAdConnections")
    var disabledAzureAdConnections: List<Any>,
    @SerializedName("disabledCasConnections")
    var disabledCasConnections: List<Any>,
    @SerializedName("disabledOauth2Connections")
    var disabledOauth2Connections: List<Any>,
    @SerializedName("disabledOidcConnections")
    var disabledOidcConnections: List<Any>,
    @SerializedName("disabledSamlConnections")
    var disabledSamlConnections: List<Any>,
    @SerializedName("disabledSocialConnections")
    var disabledSocialConnections: Any,
    @SerializedName("enableDeviceMutualExclusion")
    var enableDeviceMutualExclusion: Boolean,
    @SerializedName("enableSubAccount")
    var enableSubAccount: Boolean,
    @SerializedName("ext")
    var ext: Any,
    @SerializedName("extendsFields")
    var extendsFields: List<Any>,
    @SerializedName("extendsFieldsEnabled")
    var extendsFieldsEnabled: Boolean,
    @SerializedName("id")
    var id: String,
    @SerializedName("identifier")
    var identifier: String,
    @SerializedName("initLoginUrl")
    var initLoginUrl: Any,
    @SerializedName("isDefault")
    var isDefault: Boolean,
    @SerializedName("isDeleted")
    var isDeleted: Boolean,
    @SerializedName("isDemo")
    var isDemo: Boolean,
    @SerializedName("isIntegrate")
    var isIntegrate: Boolean,
    @SerializedName("isOfficial")
    var isOfficial: Boolean,
    @SerializedName("jwks")
    var jwks: Jwks,
    @SerializedName("ldapConnections")
    var ldapConnections: Any,
    @SerializedName("loginRequireEmailVerified")
    var loginRequireEmailVerified: Boolean,
    @SerializedName("loginTabs")
    var loginTabs: List<String>,
    @SerializedName("logo")
    var logo: String,
    @SerializedName("logoutRedirectUris")
    var logoutRedirectUris: List<Any>,
    @SerializedName("name")
    var name: String,
    @SerializedName("oauthConfig")
    var oauthConfig: OauthConfig,
    @SerializedName("oauthProviderEnabled")
    var oauthProviderEnabled: Boolean,
    @SerializedName("oidcConfig")
    var oidcConfig: OidcConfig,
    @SerializedName("oidcJWEConfig")
    var oidcJWEConfig: OidcJWEConfig,
    @SerializedName("oidcProviderEnabled")
    var oidcProviderEnabled: Boolean,
    @SerializedName("passwordTabConfig")
    var passwordTabConfig: PasswordTabConfig,
    @SerializedName("permissionStrategy")
    var permissionStrategy: PermissionStrategy,
    @SerializedName("protocol")
    var protocol: String,
    @SerializedName("qrcodeScanning")
    var qrcodeScanning: QrcodeScanning,
    @SerializedName("redirectUris")
    var redirectUris: List<String>,
    @SerializedName("registerDisabled")
    var registerDisabled: Boolean,
    @SerializedName("registerTabs")
    var registerTabs: List<String>,
    @SerializedName("samlConfig")
    var samlConfig: SamlConfig,
    @SerializedName("samlProviderEnabled")
    var samlProviderEnabled: Boolean,
    @SerializedName("secret")
    var secret: String,
    @SerializedName("showAuthorizationPage")
    var showAuthorizationPage: Boolean,
    @SerializedName("skipMfa")
    var skipMfa: Boolean,
    @SerializedName("ssoEnabled")
    var ssoEnabled: Boolean,
    @SerializedName("ssoPageCustomizationSettings")
    var ssoPageCustomizationSettings: SsoPageCustomizationSettings,
    @SerializedName("template")
    var template: Any,
    @SerializedName("updatedAt")
    var updatedAt: String,
    @SerializedName("userPoolId")
    var userPoolId: String
)

data class CasConfig(
    @SerializedName("allowedServices")
    var allowedServices: List<String>,
    @SerializedName("allowedTargetServices")
    var allowedTargetServices: List<String>,
    @SerializedName("casUserIdentifier")
    var casUserIdentifier: String,
    @SerializedName("customAttributes")
    var customAttributes: CustomAttributes,
    @SerializedName("stLifetime")
    var stLifetime: String
)

data class Jwks(
    @SerializedName("keys")
    var keys: List<Key>
)

data class OauthConfig(
    @SerializedName("client_secret")
    var client_secret: String,
    @SerializedName("grants")
    var grants: List<String>,
    @SerializedName("id")
    var id: String,
    @SerializedName("introspection_endpoint_auth_method")
    var introspection_endpoint_auth_method: String,
    @SerializedName("redirect_uris")
    var redirect_uris: List<String>,
    @SerializedName("revocation_endpoint_auth_method")
    var revocation_endpoint_auth_method: String
)

data class OidcConfig(
    @SerializedName("access_token_expire")
    var access_token_expire: String,
    @SerializedName("authorization_code_expire")
    var authorization_code_expire: String,
    @SerializedName("cas_expire")
    var cas_expire: String,
    @SerializedName("client_id")
    var client_id: String,
    @SerializedName("client_secret")
    var client_secret: String,
    @SerializedName("grant_types")
    var grant_types: List<String>,
    @SerializedName("id_token_expire")
    var id_token_expire: String,
    @SerializedName("id_token_signed_response_alg")
    var id_token_signed_response_alg: String,
    @SerializedName("introspection_endpoint_auth_method")
    var introspection_endpoint_auth_method: String,
    @SerializedName("post_logout_redirect_uris")
    var post_logout_redirect_uris: List<Any>,
    @SerializedName("redirect_uris")
    var redirect_uris: List<String>,
    @SerializedName("refresh_token_expire")
    var refresh_token_expire: String,
    @SerializedName("response_types")
    var response_types: List<String>,
    @SerializedName("revocation_endpoint_auth_method")
    var revocation_endpoint_auth_method: String,
    @SerializedName("skip_consent")
    var skip_consent: Boolean,
    @SerializedName("skip_implicit_flow_rules")
    var skip_implicit_flow_rules: Boolean,
    @SerializedName("token_endpoint_auth_method")
    var token_endpoint_auth_method: String
)

class OidcJWEConfig

data class PasswordTabConfig(
    @SerializedName("enabledLoginMethods")
    var enabledLoginMethods: List<String>
)

data class PermissionStrategy(
    @SerializedName("allowPolicyId")
    var allowPolicyId: String,
    @SerializedName("defaultStrategy")
    var defaultStrategy: String,
    @SerializedName("denyPolicyId")
    var denyPolicyId: String,
    @SerializedName("enabled")
    var enabled: Boolean
)

data class QrcodeScanning(
    @SerializedName("interval")
    var interval: String,
    @SerializedName("redirect")
    var redirect: Boolean
)

data class SamlConfig(
    @SerializedName("acs")
    var acs: String,
    @SerializedName("authnContextClassRef")
    var authnContextClassRef: String,
    @SerializedName("digestAlgorithm")
    var digestAlgorithm: String,
    @SerializedName("lifetimeInSeconds")
    var lifetimeInSeconds: String,
    @SerializedName("nameIdentifierFormat")
    var nameIdentifierFormat: String,
    @SerializedName("samlResponseSigningCert")
    var samlResponseSigningCert: String,
    @SerializedName("samlResponseSigningCertFingerprint")
    var samlResponseSigningCertFingerprint: String,
    @SerializedName("samlResponseSigningKey")
    var samlResponseSigningKey: String,
    @SerializedName("signatureAlgorithm")
    var signatureAlgorithm: String
)

data class SsoPageCustomizationSettings(
    @SerializedName("hideIdp")
    var hideIdp: Boolean,
    @SerializedName("hideSocialLogin")
    var hideSocialLogin: Boolean
)

class CustomAttributes

data class Key(
    @SerializedName("alg")
    var alg: String,
    @SerializedName("d")
    var d: String,
    @SerializedName("dp")
    var dp: String,
    @SerializedName("dq")
    var dq: String,
    @SerializedName("e")
    var e: String,
    @SerializedName("kid")
    var kid: String,
    @SerializedName("kty")
    var kty: String,
    @SerializedName("n")
    var n: String,
    @SerializedName("p")
    var p: String,
    @SerializedName("q")
    var q: String,
    @SerializedName("qi")
    var qi: String,
    @SerializedName("use")
    var use: String
)


data class TenantDetail(
    var appIds: List<String>,
    var createdAt: String,
    var description: Any,
    var id: String,
    var logo: Any,
    var name: String,
    var updatedAt: String,
    var userPoolId: String
)

//data class PaginatedTenants(
//    /** @param [totalCount] totalCount */
//    @SerializedName("listTotal")
//    var listTotal: Int,
//    /** @param [list] list */
//    @SerializedName("list")
//    var list: List<TenantDetail>
//)

data class PaginatedTenants(
    var list: List<listMember>,
    var listTotal: Int
)

data class listMember(
    var id: String,
    var tenantId: String,
    var user: UserMem
)

data class UserMem(
    var address: Any,
    var arn: String,
    var birthdate: Any,
    var blocked: Boolean,
    var city: Any,
    var company: Any,
    var country: Any,
    var email: Any,
    var emailVerified: Boolean,
    var familyName: Any,
    var formatted: Any,
    var gender: String,
    var givenName: Any,
    var id: String,
    var lastIp: String,
    var loginsCount: Int,
    var middleName: Any,
    var name: Any,
    var nickname: String,
    var openid: String,
    var phone: Any,
    var phoneVerified: Boolean,
    var photo: String,
    var postalCode: Any,
    var preferredUsername: Any,
    var profile: Any,
    var province: Any,
    var region: Any,
    var streetAddress: Any,
    var unionid: String,
    var userPoolId: String,
    var username: String,
    var website: Any,
    var zoneinfo: Any
)

data class TenantConfig(
    var css: String,
    var ssoPageCustomizationSettings: SsoPageCustomizationSetting
)

data class ConfigSsoPageCustomizationSetting(
    var css: String,
    var ssoPageCustomizationSettings: SsoPageCustomizationSetting
)

data class UserTenantIdList(
    var userIds: List<String>
)

data class UpdateTenantMemberParam(
    var isEnabled: Boolean
)

data class AuthorizeResourcesParam(
    var namespace: String,
    var opts: List<AuthorizeResourcesParamItem>
)

data class GetAuthorizeResourcesParam(
    var namespace: String,
    var targetType: String? = null,
    var targetIdentifier: String? = null,
    var resourceType: String? = null
)

data class BatchGetAuthorizeResourcesParam(
    var namespace: String,
    var targets: List<BatchGetAuthorizeResourcesParamItem>,
    var resourceType: String? = null
)

data class Allowed(
    var allowed: Boolean
)

data class IsAllowedParam(
    var userId: String,
    var resource: String,
    var action: String,
    var namespace: String? = null,
    var tenantId: String
)

data class BatchResourceParam(
    var bulk: List<BatchInsertParam>
)

data class BatchInsertParam(
    var code: String,
    var type: ResourceType,
    var description: String? = null,
    var actions: List<ActionParam>,
    var apiIdentifier: String? = null,
    var namespace: String? = null
)

data class ActionParam(
    var name: String,
    var description: String
)

data class BatchGetAuthorizeResourcesParamItem(
    var targetType: TargetTypeEnum,
    var targetIdentifier: String
)


data class AuthorizeResourcesParamItem(
    var targetType: TargetTypeEnum,
    var targetIdentifiers: List<String>,
    var resources: List<ResourceTenant>
)


data class SsoPageCustomizationSetting(
    var autoRegisterThenLogin: Boolean,
    var hideForgetPassword: Boolean,
    var hideIdp: Boolean,
    var hideSocialLogin: Boolean
)


data class CreateTenantMemberResponse(
    var createdAt: String,
    var css: Any,
    var defaultLoginTab: String,
    var defaultRegisterTab: String,
    var description: Any,
    var extendsFields: Any,
    var id: String,
    var loginTabs: Any,
    var logo: Any,
    var name: String,
    var passwordTabConfig: PasswordTabConfigMember,
    var registerTabs: Any,
    var ssoPageCustomizationSettings: Any,
    var updatedAt: String,
    var userPoolId: String,
    var users: List<UserTenant>
)

data class PasswordTabConfigMember(
    var enabledLoginMethods: List<String>
)

data class UserTenant(
    var address: Any,
    var arn: String,
    var birthdate: Any,
    var blocked: Boolean,
    var city: Any,
    var company: Any,
    var country: Any,
    var email: Any,
    var emailVerified: Boolean,
    var familyName: Any,
    var formatted: Any,
    var gender: String,
    var givenName: Any,
    var id: String,
    var lastIp: Any,
    var loginsCount: Int,
    var middleName: Any,
    var name: Any,
    var nickname: Any,
    var openid: Any,
    var phone: Any,
    var phoneVerified: Boolean,
    var photo: String,
    var postalCode: Any,
    var preferredUsername: Any,
    var profile: Any,
    var province: Any,
    var region: Any,
    var streetAddress: Any,
    var unionid: Any,
    var userPoolId: String,
    var username: String,
    var website: Any,
    var zoneinfo: Any
)

data class TenantUserListResponse(
    var list: List<TenantUser>,
    var listTotal: Int
)

data class UserPoolAdminToTanentAdminAuthorizeResourcesParam(
    var tenantId: String,
    var userIds: List<String>,
    var resources: List<ResourceTenant>
)

data class Targents(
    var targetType: TargetTypeEnum,
    var targetIdentifiers: List<String>
)

data class ResourceTenant(
    var code: String,
    var actions: List<String>,
    var resourceType: ResourceType
)

data class TanentAdminAddTanentMemberAuthorizeResourcesParam(
    var userIds: List<String>,
    var resources: List<ResourceTenant>
)


data class TenantUser(
    var address: Any,
    var arn: String,
    var birthdate: Any,
    var blocked: Boolean,
    var city: Any,
    var company: Any,
    var country: Any,
    var email: String,
    var emailVerified: Boolean,
    var familyName: Any,
    var formatted: Any,
    var gender: String,
    var givenName: Any,
    var id: String,
    var lastIp: String,
    var loginsCount: Int,
    var middleName: Any,
    var name: Any,
    var nickname: Any,
    var openid: Any,
    var phone: Any,
    var phoneVerified: Boolean,
    var photo: String,
    var postalCode: Any,
    var preferredUsername: Any,
    var profile: Any,
    var province: Any,
    var region: Any,
    var streetAddress: Any,
    var unionid: Any,
    var userPoolId: String,
    var username: String,
    var website: Any,
    var zoneinfo: Any
)

data class CreateIdpParam(
    var tenantId: String,
    var name: String,
    var type: String,
    var connections: List<Connection>
)

data class UpdateIdpParam(
    var name: String
)

data class Connection(
    var displayName: String,
    var fields: Fields,
    var identifier: String,
    var type: String,
    var userMatchFields: List<String>
)

data class Fields(
    var clientID: String,
    var clientSecret: String
)

data class CreateIdpResponse(
    var connections: List<Connection>,
    var id: String,
    var name: String,
    var type: String
)


data class CreatIdpConnParam(
    var extIdpId: String,
    var type: String,
    var identifier: String,
    var displayName: String,
    var fields: Fields,
    var tenantId: String,
    var userMatchFields: List<String>
)

data class UpdateIdpConnParm(
    var displayName: String,
    var fields: Fields,
    var userMatchFields: List<String>,
    var tenantId: String
)

data class CreateIdpConnResponse(
    var id: String,
    var type: String,
    var identifier: String,
    var displayName: String,
    var fields: Fields
)

data class CheckExtIdpConnectionIdentifierUnique(
    var identifier: String
)

data class ConnState(
    var tenantId: String,
    var enabled: Boolean
)

data class ListResourcesParams
@JvmOverloads
constructor(
    var appId: String,
    var type: ResourceType? = null,
    var limit: Int = 10,
    var page: Int = 1
)

data class AgreementParams
@JvmOverloads
constructor(
    var title: String,
    var required: Boolean? = true,
    var lang: String? = "zh-CN"
)

data class AgreementDetail
constructor(
    var title: String,
    var required: Boolean,
    var lang: String,
    var appId: String,
    var order: String,
    var userPoolId: String,
    var id: String
)

data class PrincipalDetail
constructor(
    var authenticationTime: String,
    var createdAt: String,
    var id: String,
    var principalCode: String,
    var principalName: String,
    val principalType: String? = "P",
    var updatedAt: String,
    var userId: String,
    var userPoolId: String
)

data class PrincipalInput
constructor(
    var type: Char? = 'P',
    /** 姓名 */
    var name: String,
    /** 身份证 */
    var idCard: String,
    /** 银行卡号 */
    var bankCard: String,
    /** 企业名称 */
    var enterpriseName: String,
    /** 统一社会信用代码/注册号/组织机构代码 */
    var enterpriseCode: String,
    /** 企业法人名称 */
    var legalPersonName: String
)

data class AgreementList
constructor(
    var list: List<AgreementDetail>,
    var totalCount: Number
)

data class UserActionParam
constructor(
    var page: Number,
    var limit: Number? = 10,
    var clientIp: String,
    var operationName: String,
    var operatoArn: String
)

data class UserAction
constructor(
    var operator_arn: String,
    var timestamp: String,
    var user_agent: String,
    var geoip: GeoIP,
    var message: String,
    var ua: UA,
    val userpool_id: String,
    var host: String,
    var version: String,
    var app_id: String,
    var operation_name: String,
    var clientip: String,
    var extra_data: String,
    var request_id: String,
    var path: String,
    var user: LogUser,
    var app: App,
    var operation_desc: String
)

data class App
constructor(
    var qrcodeScanning: Any,
    var id: String,
    var name: String,
    var description: Any,
    var identifier: String,
    var logo: String,
    var loginTabs: List<String>,
    var registerTabs: List<String>,
    var adConnections: List<Any>,
    var disabledOidcConnections: List<Any>,
    var disabledSamlConnections: List<Any>,
    var extendsFields: List<Any>,
    var disabledAzureAdConnections: List<Any>,
    var disabledOauth2Connections: List<Any>,
    var disabledCasConnections: List<Any>
)

data class UserActions
constructor(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: List<UserAction>
)

data class UserPoolReturn
constructor(
    var code: String,
    var type: String,
    var actions: List<String>,
    var apiIdentifier: String
)

data class UserPoolAdminGetTenantAdminResourceList
constructor(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: List<UserPoolReturn>
)

data class BatchGetAuthorizeResourcesList
constructor(
    @SerializedName("list")
    var list: List<BatchGetAuthorizeResourcesItem>
)

data class BatchGetAuthorizeResourcesItem
constructor(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: List<UserPoolReturn>
)

enum class MethodEnum {
    GET,
    POST,
    PUT,
    DELETE;
}

data class HttpRequestParam(
    /**
     * 需要带前缀 "/" ,且支持restful,直接拼接url即可
     */
    var url: String,

    /**
     * 请求方式，目前支持的方式参考 MethodEnum
     */
    var method: MethodEnum,

    /**
     * 请求参数 key-value
     */
    var params: Map<String, Any>
)





