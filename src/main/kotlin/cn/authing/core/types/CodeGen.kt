package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
import com.google.gson.annotations.SerializedName

data class Query(
        @SerializedName("ReadEmailSentList")
        var ReadEmailSentList: Email? = null,
        @SerializedName("ReadEmailSentListByClient")
        var ReadEmailSentListByClient: EmailListPaged? = null,
        @SerializedName("ReadEmailProvider")
        var ReadEmailProvider: List<EmailProviderList>? = null,
        @SerializedName("ReadEmailProviderByClientAndName")
        var ReadEmailProviderByClientAndName: List<EmailProviderWithClientList>? = null,
        @SerializedName("ReadEmailTemplatesByClient")
        var ReadEmailTemplatesByClient: List<EmailTemplateWithClient>? = null,
        @SerializedName("ReadEmailProviderWithClient")
        var ReadEmailProviderWithClient: List<EmailProviderWithClientList>? = null,
        @SerializedName("ReadEmailTemplateByClientAndType")
        var ReadEmailTemplateByClientAndType: EmailTemplate? = null,
        @SerializedName("PreviewEmailByType")
        var PreviewEmailByType: String? = null,
        @SerializedName("ReadEmailTemplatesBySystem")
        var ReadEmailTemplatesBySystem: List<EmailTemplateWithClient>? = null,
        @SerializedName("ReadOauthList")
        var ReadOauthList: List<OAuthList>? = null,
        @SerializedName("ReadSAMLSPList")
        var ReadSAMLSPList: List<SamlspListItem>? = null,
        @SerializedName("userOAuthCount")
        var userOAuthCount: List<Int>? = null,
        @SerializedName("wxQRCodeLog")
        var wxQRCodeLog: WxQrCodeLog? = null,
        @SerializedName("querySystemOAuthSetting")
        var querySystemOAuthSetting: List<OAuthList>? = null,
        @SerializedName("notBindOAuthList")
        var notBindOAuthList: List<NotBindOAuth>? = null,
        @SerializedName("QueryClientIdByAppId")
        var QueryClientIdByAppId: OAuthProviderClient? = null,
        @SerializedName("getOAuthedAppInfo")
        var getOAuthedAppInfo: OAuthProviderClient? = null,
        @SerializedName("getOAuthedAppList")
        var getOAuthedAppList: OAuthAppPagedList? = null,
        @SerializedName("GetOIDCAppInfo")
        var GetOIDCAppInfo: OidcProviderClient? = null,
        @SerializedName("GetOIDCAppList")
        var GetOIDCAppList: OidcAppPagedList? = null,
        @SerializedName("queryProviderInfoByDomain")
        var queryProviderInfoByDomain: ProviderGeneralInfo? = null,
        @SerializedName("queryProviderInfoByAppId")
        var queryProviderInfoByAppId: ProviderGeneralInfo? = null,
        @SerializedName("QueryAppInfoByAppID")
        var QueryAppInfoByAppID: OAuthProviderClient? = null,
        @SerializedName("QueryAppInfoByDomain")
        var QueryAppInfoByDomain: OAuthProviderClient? = null,
        @SerializedName("QueryOIDCAppInfoByDomain")
        var QueryOIDCAppInfoByDomain: OidcProviderClient? = null,
        @SerializedName("QueryOIDCAppInfoByAppID")
        var QueryOIDCAppInfoByAppID: OidcProviderClient? = null,
        @SerializedName("QuerySAMLServiceProviderInfoByAppID")
        var QuerySAMLServiceProviderInfoByAppID: SamlServiceProviderClient? = null,
        @SerializedName("QuerySAMLServiceProviderInfoByDomain")
        var QuerySAMLServiceProviderInfoByDomain: SamlServiceProviderClient? = null,
        @SerializedName("QuerySAMLIdentityProviderInfoByAppID")
        var QuerySAMLIdentityProviderInfoByAppID: SamlIdentityProviderClient? = null,
        @SerializedName("QuerySAMLIdentityProviderInfoByDomain")
        var QuerySAMLIdentityProviderInfoByDomain: SamlIdentityProviderClient? = null,
        @SerializedName("QueryDefaultSAMLIdentityProviderSettingsList")
        var QueryDefaultSAMLIdentityProviderSettingsList: SamlDefaultIdentityProviderSettingsList? = null,
        @SerializedName("GetSAMLServiceProviderList")
        var GetSAMLServiceProviderList: SamlServiceProviderAppPagedList? = null,
        @SerializedName("GetSAMLServiceProviderInfo")
        var GetSAMLServiceProviderInfo: SamlServiceProviderClient? = null,
        @SerializedName("GetSAMLIdentityProviderInfo")
        var GetSAMLIdentityProviderInfo: SamlIdentityProviderClient? = null,
        @SerializedName("GetSAMLIdentityProviderList")
        var GetSAMLIdentityProviderList: SamlIdentityProviderAppPagedList? = null,
        @SerializedName("QueryLDAPServerList")
        var QueryLDAPServerList: LdapServerList? = null,
        @SerializedName("TestLDAPServer")
        var TestLDAPServer: LdapServerTesterType? = null,
        @SerializedName("TestLDAPUser")
        var TestLDAPUser: LdapUserTesterType? = null,
        @SerializedName("QueryClientHasLDAPConfigs")
        var QueryClientHasLDAPConfigs: ClientHasLdapConfigs? = null,
        @SerializedName("GetUserAuthorizedApps")
        var GetUserAuthorizedApps: UserAuthorizedAppPagedList? = null,
        @SerializedName("isAppAuthorizedByUser")
        var isAppAuthorizedByUser: IsAppAuthorizedByUser? = null,
        @SerializedName("checkIsReservedDomain")
        var checkIsReservedDomain: IsReservedDomain? = null,
        @SerializedName("ReadSystemPricing")
        var ReadSystemPricing: List<PricingList>? = null,
        @SerializedName("ReadOrders")
        var ReadOrders: PagedOrders? = null,
        @SerializedName("ReadUserPricing")
        var ReadUserPricing: UserPricingType? = null,
        @SerializedName("users")
        var users: PagedUsers? = null,
        @SerializedName("usersByOidcApp")
        var usersByOidcApp: UserIds? = null,
        @SerializedName("user")
        var user: ExtendUser? = null,
        @SerializedName("userAnalytics")
        var userAnalytics: UserAnalytics? = null,
        @SerializedName("isLoginExpired")
        var isLoginExpired: Boolean? = null,
        @SerializedName("client")
        var client: UserClient? = null,
        @SerializedName("userClients")
        var userClients: PagedUserClients? = null,
        @SerializedName("searchUser")
        var searchUser: PagedUsers? = null,
        @SerializedName("userClientTypes")
        var userClientTypes: List<UserClientType>? = null,
        @SerializedName("isClientOfUser")
        var isClientOfUser: Boolean? = null,
        @SerializedName("getAccessTokenByAppSecret")
        var getAccessTokenByAppSecret: String? = null,
        @SerializedName("loginCount")
        var loginCount: UserLoginCount? = null,
        @SerializedName("qiNiuUploadToken")
        var qiNiuUploadToken: String? = null,
        @SerializedName("decodeJwtToken")
        var decodeJwtToken: JwtDecodedData? = null,
        @SerializedName("checkLoginStatus")
        var checkLoginStatus: JwtDecodedDataCheckLogin? = null,
        @SerializedName("getAppSecretByClientId")
        var getAppSecretByClientId: AppSecretByClientId? = null,
        @SerializedName("previewEmailTemplate")
        var previewEmailTemplate: CommonMessage? = null,
        @SerializedName("loginHotDotPicData")
        var loginHotDotPicData: LoginHotDotPicData? = null,
        @SerializedName("registerEveryDayCount")
        var registerEveryDayCount: RegisterEveryDayCount? = null,
        @SerializedName("statistic")
        var statistic: Statistic? = null,
        @SerializedName("userClientList")
        var userClientList: PagedUserClientList? = null,
        @SerializedName("usersInGroup")
        var usersInGroup: UsersInGroup? = null,
        @SerializedName("qpsByTime")
        var qpsByTime: List<QpsByTime>? = null,
        @SerializedName("todayGeoDistribution")
        var todayGeoDistribution: List<GeographicalDistributionList>? = null,
        @SerializedName("findClientsByIdArray")
        var findClientsByIdArray: PagedUserClientList? = null,
        @SerializedName("recentServiceCall")
        var recentServiceCall: DayServiceCallListOfAllServices? = null,
        @SerializedName("platformUserGrowthTrend")
        var platformUserGrowthTrend: List<DayUserGrowth>? = null,
        @SerializedName("requestList")
        var requestList: PagedRequestList? = null,
        @SerializedName("bindedOAuthList")
        var bindedOAuthList: List<UserOAuthBind>? = null,
        @SerializedName("userPatch")
        var userPatch: PatchExtendUser? = null,
        @SerializedName("isClientBelongToUser")
        var isClientBelongToUser: Boolean? = null,
        @SerializedName("queryClient")
        var queryClient: UserClient? = null,
        @SerializedName("clientRoles")
        var clientRoles: PagedRoles? = null,
        @SerializedName("userGroup")
        var userGroup: PagedUserGroup? = null,
        @SerializedName("queryRoleByUserId")
        var queryRoleByUserId: PagedUserGroup? = null,
        @SerializedName("getClientWhenSdkInit")
        var getClientWhenSdkInit: ClientInfoAndAccessToken? = null,
        @SerializedName("getWebhookDetail")
        var getWebhookDetail: ClientWebhook? = null,
        @SerializedName("getAllWebhooks")
        var getAllWebhooks: List<ClientWebhook>? = null,
        @SerializedName("getWebhookLogDetail")
        var getWebhookLogDetail: WebhookLog? = null,
        @SerializedName("getWebhookLogs")
        var getWebhookLogs: List<WebhookLog>? = null,
        @SerializedName("getWebhookSettingOptions")
        var getWebhookSettingOptions: WebhookSettingOptions? = null,
        @SerializedName("queryCollaborativeUserPoolByUserId")
        var queryCollaborativeUserPoolByUserId: CollaborativeUserPoolList? = null,
        @SerializedName("queryCollaboratorsByUserPoolId")
        var queryCollaboratorsByUserPoolId: Collaborators? = null,
        @SerializedName("queryCollaboratorPermissions")
        var queryCollaboratorPermissions: CollaboratorPermissions? = null,
        @SerializedName("queryPasswordStrengthSettingsByUserPoolId")
        var queryPasswordStrengthSettingsByUserPoolId: PasswordStrengthSettings? = null,
        @SerializedName("queryCollaborationByUserPoolIdAndUserId")
        var queryCollaborationByUserPoolIdAndUserId: Collaboration? = null,
        @SerializedName("queryPermissionList")
        var queryPermissionList: PermissionList? = null,
        @SerializedName("searchUserBasicInfoById")
        var searchUserBasicInfoById: BasicUserInfo? = null,
        @SerializedName("queryPasswordFaasEnabled")
        var queryPasswordFaasEnabled: PaaswordFaas? = null,
        @SerializedName("emailDomainTopNList")
        var emailDomainTopNList: List<LoginTopEmailList>? = null,
        @SerializedName("registerMethodTopList")
        var registerMethodTopList: List<RegisterMethodList>? = null,
        @SerializedName("querySMSSendCount")
        var querySMSSendCount: SmsCountInfo? = null,
        @SerializedName("queryInvitation")
        var queryInvitation: List<Invitation>? = null,
        @SerializedName("queryInvitationState")
        var queryInvitationState: InvitationState? = null,
        @SerializedName("queryMFA")
        var queryMFA: Mfa? = null,
        @SerializedName("queryAuthorizedUserPool")
        var queryAuthorizedUserPool: PagedUserPoolWithMfa? = null,
        @SerializedName("getCustomMFA")
        var getCustomMFA: PagedCustomMfaList? = null,
        @SerializedName("validatePassword")
        var validatePassword: ValidateResult? = null,
        @SerializedName("getUserLoginAreaStatisticOfClient")
        var getUserLoginAreaStatisticOfClient: String? = null,
        @SerializedName("getUserPoolSettings")
        var getUserPoolSettings: UserClient? = null,
        @SerializedName("queryAuthAuditRecords")
        var queryAuthAuditRecords: AuthAuditRecordsList? = null,
        @SerializedName("queryUserPoolCommonInfo")
        var queryUserPoolCommonInfo: UserPoolCommonInfo? = null,
        @SerializedName("isDomainAvaliable")
        var isDomainAvaliable: Boolean? = null,
        @SerializedName("checkPhoneCode")
        var checkPhoneCode: CommonMessage? = null,
        @SerializedName("userExist")
        var userExist: Boolean? = null,
        @SerializedName("adConnectorByProvider")
        var adConnectorByProvider: AdConnctorCommonInfo? = null,
        @SerializedName("isAdConnectorAlive")
        var isAdConnectorAlive: IsAdConenctorAlive? = null,
        @SerializedName("adConnectorList")
        var adConnectorList: List<AdConnector>? = null,
        @SerializedName("providerListByADConnector")
        var providerListByADConnector: List<AdConnectorEnabledProvider>? = null,
        @SerializedName("checkAdConnectorStatus")
        var checkAdConnectorStatus: Boolean? = null,
        @SerializedName("samlIdPFieldMappings")
        var samlIdPFieldMappings: List<SamlFieldMappings>? = null,
        @SerializedName("supportedSAMLFieldMappings")
        var supportedSAMLFieldMappings: List<SamlAvaliableFieldMappings>? = null,
        @SerializedName("rbacRole")
        var rbacRole: RbacRole? = null,
        @SerializedName("rbacRoleList")
        var rbacRoleList: PagedRbacRole? = null,
        @SerializedName("rbacGroup")
        var rbacGroup: RbacGroup? = null,
        @SerializedName("rbacGroupList")
        var rbacGroupList: PagedRbacGroup? = null,
        @SerializedName("rbacPermission")
        var rbacPermission: RbacPermission? = null,
        @SerializedName("rbacPermissionList")
        var rbacPermissionList: PagedRbacPermission? = null,
        @SerializedName("userPermissionList")
        var userPermissionList: UserPermissionList? = null,
        @SerializedName("userGroupList")
        var userGroupList: UserGroupList? = null,
        @SerializedName("userRoleList")
        var userRoleList: UserRoleList? = null,
        @SerializedName("org")
        var org: Org? = null,
        @SerializedName("orgs")
        var orgs: PagedOrg? = null,
        @SerializedName("orgRootNode")
        var orgRootNode: RbacGroup? = null,
        @SerializedName("orgChildrenNodes")
        var orgChildrenNodes: List<OrgChildNode>? = null,
        @SerializedName("isRootNodeOfOrg")
        var isRootNodeOfOrg: Boolean? = null,
        @SerializedName("groupMetadata")
        var groupMetadata: List<GroupMetadata>? = null,
        @SerializedName("searchGroupByMetadata")
        var searchGroupByMetadata: PagedRbacGroup? = null,
        @SerializedName("searchOrgNodes")
        var searchOrgNodes: List<RbacGroup>? = null,
        @SerializedName("orgNodeUserList")
        var orgNodeUserList: PagedUsers? = null,
        @SerializedName("isUserInGroup")
        var isUserInGroup: Boolean? = null,
        @SerializedName("searchOrgNodeUser")
        var searchOrgNodeUser: PagedUsers? = null,
        @SerializedName("DingTalkCorp")
        var DingTalkCorp: DingTalkCorp? = null,
        @SerializedName("wechatWorkCorp")
        var wechatWorkCorp: WechatWorkCorp? = null,
        @SerializedName("ruleById")
        var ruleById: Rule? = null,
        @SerializedName("rules")
        var rules: PagedRules? = null,
        @SerializedName("ruleEnv")
        var ruleEnv: PagedRuleEnvVariable? = null,
        @SerializedName("queryOperationLogs")
        var queryOperationLogs: OperationLogsList? = null,
        @SerializedName("getUserPoolByDomain")
        var getUserPoolByDomain: UserPoolCommonInfo? = null,
        @SerializedName("interConnections")
        var interConnections: List<InterConnection>? = null,
        @SerializedName("userMetadata")
        var userMetadata: UserMetaDataList? = null
)

data class Email(
        @SerializedName("list")
        var list: List<PopulatedEmailSentList>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class PopulatedEmailSentList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("subject")
        var subject: String? = null,
        @SerializedName("content")
        var content: String? = null,
        @SerializedName("sender")
        var sender: String? = null,
        @SerializedName("receivers")
        var receivers: List<String>? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("client")
        var client: Client? = null
)

data class Client(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("user")
        var user: User? = null
)

data class User(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("unionid")
        var unionid: String? = null,
        @SerializedName("openid")
        var openid: String? = null,
        @SerializedName("emailVerified")
        var emailVerified: Boolean? = null,
        @SerializedName("phone")
        var phone: String? = null,
        @SerializedName("phoneVerified")
        var phoneVerified: Boolean? = null,
        @SerializedName("nickname")
        var nickname: String? = null,
        @SerializedName("company")
        var company: String? = null,
        @SerializedName("photo")
        var photo: String? = null,
        @SerializedName("browser")
        var browser: String? = null,
        @SerializedName("password")
        var password: String? = null,
        @SerializedName("registerInClient")
        var registerInClient: String? = null,
        @SerializedName("registerMethod")
        var registerMethod: String? = null,
        @SerializedName("oauth")
        var oauth: String? = null,
        @SerializedName("token")
        var token: String? = null,
        @SerializedName("tokenExpiredAt")
        var tokenExpiredAt: String? = null,
        @SerializedName("loginsCount")
        var loginsCount: Int? = null,
        @SerializedName("lastLogin")
        var lastLogin: String? = null,
        @SerializedName("lastIP")
        var lastIP: String? = null,
        @SerializedName("signedUp")
        var signedUp: String? = null,
        @SerializedName("blocked")
        var blocked: Boolean? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("device")
        var device: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("givenName")
        var givenName: String? = null,
        @SerializedName("familyName")
        var familyName: String? = null,
        @SerializedName("middleName")
        var middleName: String? = null,
        @SerializedName("profile")
        var profile: String? = null,
        @SerializedName("preferredUsername")
        var preferredUsername: String? = null,
        @SerializedName("website")
        var website: String? = null,
        @SerializedName("gender")
        var gender: String? = null,
        @SerializedName("birthdate")
        var birthdate: String? = null,
        @SerializedName("zoneinfo")
        var zoneinfo: String? = null,
        @SerializedName("locale")
        var locale: String? = null,
        @SerializedName("address")
        var address: String? = null,
        @SerializedName("formatted")
        var formatted: String? = null,
        @SerializedName("streetAddress")
        var streetAddress: String? = null,
        @SerializedName("locality")
        var locality: String? = null,
        @SerializedName("region")
        var region: String? = null,
        @SerializedName("postalCode")
        var postalCode: String? = null,
        @SerializedName("country")
        var country: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("thirdPartyIdentity")
        var thirdPartyIdentity: ThirdPartyIdentity? = null,
        @SerializedName("oldPassword")
        var oldPassword: String? = null,
        @SerializedName("metadata")
        var metadata: String? = null
)

data class ThirdPartyIdentity(
        @SerializedName("provider")
        var provider: String? = null,
        @SerializedName("refreshToken")
        var refreshToken: String? = null,
        @SerializedName("accessToken")
        var accessToken: String? = null,
        @SerializedName("expiresIn")
        var expiresIn: Int? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null
)

data class EmailListPaged(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<EmailSentList>? = null
)

data class EmailSentList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("subject")
        var subject: String? = null,
        @SerializedName("content")
        var content: String? = null,
        @SerializedName("sender")
        var sender: String? = null,
        @SerializedName("receivers")
        var receivers: List<String>? = null,
        @SerializedName("post")
        var post: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("rejected")
        var rejected: List<String>? = null,
        @SerializedName("isDeleted")
        var isDeleted: String? = null,
        @SerializedName("client")
        var client: String? = null
)

data class EmailProviderList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("fields")
        var fields: List<EmailProviderForm>? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("provider")
        var provider: EmailProviderChildrenList? = null
)

data class EmailProviderForm(
        @SerializedName("label")
        var label: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("placeholder")
        var placeholder: String? = null,
        @SerializedName("help")
        var help: String? = null,
        @SerializedName("value")
        var value: String? = null,
        @SerializedName("options")
        var options: List<String>? = null
)

data class EmailProviderChildrenList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("fields")
        var fields: List<EmailProviderForm>? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("provider")
        var provider: EmailProviderChildrenList? = null
)

data class EmailProviderWithClientList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("fields")
        var fields: List<EmailProviderWithClientForm>? = null,
        @SerializedName("provider")
        var provider: EmailProviderWithClient? = null
)

data class EmailProviderWithClientForm(
        @SerializedName("label")
        var label: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("placeholder")
        var placeholder: String? = null,
        @SerializedName("help")
        var help: String? = null,
        @SerializedName("value")
        var value: String? = null,
        @SerializedName("options")
        var options: List<String>? = null
)

data class EmailProviderWithClient(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("description")
        var description: String? = null
)

data class EmailTemplateWithClient(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("template")
        var template: EmailTemplate? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("sender")
        var sender: String? = null,
        @SerializedName("object")
        var _object: String? = null,
        @SerializedName("hasURL")
        var hasURL: Boolean? = null,
        @SerializedName("URLExpireTime")
        var URLExpireTime: Int? = null,
        @SerializedName("redirectTo")
        var redirectTo: String? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("content")
        var content: String? = null
)

data class EmailTemplate(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("sender")
        var sender: String? = null,
        @SerializedName("object")
        var _object: String? = null,
        @SerializedName("hasURL")
        var hasURL: Boolean? = null,
        @SerializedName("URLExpireTime")
        var URLExpireTime: Int? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("redirectTo")
        var redirectTo: String? = null,
        @SerializedName("content")
        var content: String? = null
)

data class OAuthList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("alias")
        var alias: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("oAuthUrl")
        var oAuthUrl: String? = null,
        @SerializedName("wxappLogo")
        var wxappLogo: String? = null,
        @SerializedName("fields")
        var fields: List<OAuthListFieldsForm>? = null,
        @SerializedName("oauth")
        var oauth: ChildrenOAuthList? = null
)

data class OAuthListFieldsForm(
        @SerializedName("label")
        var label: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("placeholder")
        var placeholder: String? = null,
        @SerializedName("value")
        var value: String? = null,
        @SerializedName("children")
        var children: List<OAuthListFieldsFormRecursion>? = null,
        @SerializedName("checked")
        var checked: List<String>? = null
)

data class OAuthListFieldsFormRecursion(
        @SerializedName("label")
        var label: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("placeholder")
        var placeholder: String? = null,
        @SerializedName("value")
        var value: String? = null,
        @SerializedName("children")
        var children: List<OAuthListFieldsFormRecursion>? = null
)

data class ChildrenOAuthList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("alias")
        var alias: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("oAuthUrl")
        var oAuthUrl: String? = null,
        @SerializedName("wxappLogo")
        var wxappLogo: String? = null,
        @SerializedName("fields")
        var fields: List<OAuthListFieldsForm>? = null,
        @SerializedName("oauth")
        var oauth: ChildrenOAuthList? = null
)

data class SamlspListItem(
        @SerializedName("providerName")
        var providerName: String? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("logo")
        var logo: String? = null
)

data class WxQrCodeLog(
        @SerializedName("list")
        var list: List<WxQrCodeLogList>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class WxQrCodeLogList(
        @SerializedName("random")
        var random: String? = null,
        @SerializedName("expiredAt")
        var expiredAt: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("success")
        var success: Boolean? = null,
        @SerializedName("qrcode")
        var qrcode: String? = null,
        @SerializedName("used")
        var used: Boolean? = null,
        @SerializedName("accessToken")
        var accessToken: String? = null,
        @SerializedName("openid")
        var openid: String? = null,
        @SerializedName("userInfo")
        var userInfo: String? = null,
        @SerializedName("redirect")
        var redirect: String? = null,
        @SerializedName("client")
        var client: ClientInWxQrCodeLogList? = null
)

data class ClientInWxQrCodeLogList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("user")
        var user: UserInClientInWxQrCodeLogList? = null
)

data class UserInClientInWxQrCodeLogList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("username")
        var username: String? = null
)

data class NotBindOAuth(
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("oAuthUrl")
        var oAuthUrl: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("binded")
        var binded: Boolean? = null
)

data class OAuthProviderClient(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("domain")
        var domain: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("redirectUris")
        var redirectUris: List<String>? = null,
        @SerializedName("appSecret")
        var appSecret: String? = null,
        @SerializedName("client_id")
        var client_id: String? = null,
        @SerializedName("clientId")
        var clientId: String? = null,
        @SerializedName("grants")
        var grants: List<String>? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("homepageURL")
        var homepageURL: String? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("when")
        var _when: String? = null,
        @SerializedName("css")
        var css: String? = null,
        @SerializedName("loginUrl")
        var loginUrl: String? = null,
        @SerializedName("casExpire")
        var casExpire: Int? = null
)

data class OAuthAppPagedList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<OAuthProviderClient>? = null
)

data class OidcProviderClient(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("domain")
        var domain: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("redirect_uris")
        var redirect_uris: List<String>? = null,
        @SerializedName("client_id")
        var client_id: String? = null,
        @SerializedName("client_secret")
        var client_secret: String? = null,
        @SerializedName("token_endpoint_auth_method")
        var token_endpoint_auth_method: String? = null,
        @SerializedName("id_token_signed_response_alg")
        var id_token_signed_response_alg: String? = null,
        @SerializedName("id_token_encrypted_response_alg")
        var id_token_encrypted_response_alg: String? = null,
        @SerializedName("id_token_encrypted_response_enc")
        var id_token_encrypted_response_enc: String? = null,
        @SerializedName("userinfo_signed_response_alg")
        var userinfo_signed_response_alg: String? = null,
        @SerializedName("userinfo_encrypted_response_alg")
        var userinfo_encrypted_response_alg: String? = null,
        @SerializedName("userinfo_encrypted_response_enc")
        var userinfo_encrypted_response_enc: String? = null,
        @SerializedName("request_object_signing_alg")
        var request_object_signing_alg: String? = null,
        @SerializedName("request_object_encryption_alg")
        var request_object_encryption_alg: String? = null,
        @SerializedName("request_object_encryption_enc")
        var request_object_encryption_enc: String? = null,
        @SerializedName("jwks_uri")
        var jwks_uri: String? = null,
        @SerializedName("_jwks_uri")
        var _jwks_uri: String? = null,
        @SerializedName("custom_jwks")
        var custom_jwks: String? = null,
        @SerializedName("jwks")
        var jwks: String? = null,
        @SerializedName("_jwks")
        var _jwks: String? = null,
        @SerializedName("clientId")
        var clientId: String? = null,
        @SerializedName("grant_types")
        var grant_types: List<String>? = null,
        @SerializedName("response_types")
        var response_types: List<String>? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("homepageURL")
        var homepageURL: String? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("isDefault")
        var isDefault: Boolean? = null,
        @SerializedName("when")
        var _when: String? = null,
        @SerializedName("css")
        var css: String? = null,
        @SerializedName("authorization_code_expire")
        var authorization_code_expire: String? = null,
        @SerializedName("id_token_expire")
        var id_token_expire: String? = null,
        @SerializedName("access_token_expire")
        var access_token_expire: String? = null,
        @SerializedName("cas_expire")
        var cas_expire: String? = null,
        @SerializedName("loginUrl")
        var loginUrl: String? = null,
        @SerializedName("customStyles")
        var customStyles: OidcProviderCustomStyles? = null,
        @SerializedName("isForTeamory")
        var isForTeamory: Boolean? = null,
        @SerializedName("confirmAuthorization")
        var confirmAuthorization: Boolean? = null
)

data class OidcProviderCustomStyles(
        @SerializedName("forceLogin")
        var forceLogin: Boolean? = null,
        @SerializedName("hideQRCode")
        var hideQRCode: Boolean? = null,
        @SerializedName("hideUP")
        var hideUP: Boolean? = null,
        @SerializedName("hideUsername")
        var hideUsername: Boolean? = null,
        @SerializedName("hideRegister")
        var hideRegister: Boolean? = null,
        @SerializedName("hidePhone")
        var hidePhone: Boolean? = null,
        @SerializedName("hideSocial")
        var hideSocial: Boolean? = null,
        @SerializedName("hideClose")
        var hideClose: Boolean? = null,
        @SerializedName("hidePhonePassword")
        var hidePhonePassword: Boolean? = null,
        @SerializedName("placeholder")
        var placeholder: OidcProviderCustomStylesPlaceholder? = null,
        @SerializedName("qrcodeScanning")
        var qrcodeScanning: OidcProviderCustomStylesQrcodeScanning? = null,
        @SerializedName("defaultLoginMethod")
        var defaultLoginMethod: OidcProviderDefaultLoginMethod? = null
)

data class OidcProviderCustomStylesPlaceholder(
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("password")
        var password: String? = null,
        @SerializedName("confirmPassword")
        var confirmPassword: String? = null,
        @SerializedName("verfiyCode")
        var verfiyCode: String? = null,
        @SerializedName("newPassword")
        var newPassword: String? = null,
        @SerializedName("phone")
        var phone: String? = null,
        @SerializedName("phoneCode")
        var phoneCode: String? = null
)

data class OidcProviderCustomStylesQrcodeScanning(
        @SerializedName("redirect")
        var redirect: Boolean? = null,
        @SerializedName("interval")
        var interval: Int? = null,
        @SerializedName("tips")
        var tips: String? = null
)

enum class OidcProviderDefaultLoginMethod(val label: String) {
    Phone("PHONE"),
    Password("PASSWORD"),
    Qrcode("QRCODE");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): OidcProviderDefaultLoginMethod? {
            return values().find { it.label == label }
        }
    }
}

data class OidcAppPagedList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<OidcProviderClient>? = null
)

data class ProviderGeneralInfo(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("domain")
        var domain: String? = null,
        @SerializedName("clientId")
        var clientId: String? = null,
        @SerializedName("client_id")
        var client_id: String? = null,
        @SerializedName("css")
        var css: String? = null,
        @SerializedName("redirect_uris")
        var redirect_uris: List<String>? = null
)

data class SamlServiceProviderClient(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("domain")
        var domain: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("appSecret")
        var appSecret: String? = null,
        @SerializedName("defaultIdPMap")
        var defaultIdPMap: SamlDefaultIdentityProviderSettings? = null,
        @SerializedName("defaultIdPMapId")
        var defaultIdPMapId: String? = null,
        @SerializedName("appId")
        var appId: String? = null,
        @SerializedName("clientId")
        var clientId: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("when")
        var _when: String? = null,
        @SerializedName("SPMetadata")
        var SPMetadata: String? = null,
        @SerializedName("IdPMetadata")
        var IdPMetadata: String? = null,
        @SerializedName("IdPEntityID")
        var IdPEntityID: String? = null,
        @SerializedName("assertionConsumeService")
        var assertionConsumeService: List<AssertionConsumeService>? = null,
        @SerializedName("mappings")
        var mappings: AssertionMap? = null,
        @SerializedName("redirectUrl")
        var redirectUrl: String? = null,
        @SerializedName("loginUrl")
        var loginUrl: String? = null,
        @SerializedName("logoutUrl")
        var logoutUrl: String? = null,
        @SerializedName("nameId")
        var nameId: String? = null,
        @SerializedName("enableSignRes")
        var enableSignRes: Boolean? = null,
        @SerializedName("resSignPublicKey")
        var resSignPublicKey: String? = null,
        @SerializedName("hasResEncrypted")
        var hasResEncrypted: Boolean? = null,
        @SerializedName("resEncryptAlgorithm")
        var resEncryptAlgorithm: String? = null,
        @SerializedName("resAbstractAlgorithm")
        var resAbstractAlgorithm: String? = null,
        @SerializedName("resDecryptPrivateKey")
        var resDecryptPrivateKey: String? = null,
        @SerializedName("resDecryptPrivateKeyPass")
        var resDecryptPrivateKeyPass: String? = null,
        @SerializedName("resEncryptPublicKey")
        var resEncryptPublicKey: String? = null,
        @SerializedName("enableSignReq")
        var enableSignReq: Boolean? = null,
        @SerializedName("reqSignAlgorithm")
        var reqSignAlgorithm: String? = null,
        @SerializedName("reqAbstractAlgorithm")
        var reqAbstractAlgorithm: String? = null,
        @SerializedName("reqSignPrivateKey")
        var reqSignPrivateKey: String? = null,
        @SerializedName("reqSignPrivateKeyPass")
        var reqSignPrivateKeyPass: String? = null,
        @SerializedName("reqSignPublicKey")
        var reqSignPublicKey: String? = null,
        @SerializedName("SPUrl")
        var SPUrl: String? = null
)

data class SamlDefaultIdentityProviderSettings(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("mappings")
        var mappings: AssertionMap? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null
)

data class AssertionMap(
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("nickname")
        var nickname: String? = null,
        @SerializedName("photo")
        var photo: String? = null,
        @SerializedName("company")
        var company: String? = null,
        @SerializedName("providerName")
        var providerName: String? = null,
        @SerializedName("email")
        var email: String? = null
)

data class AssertionConsumeService(
        @SerializedName("binding")
        var binding: String? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("isDefault")
        var isDefault: Boolean? = null
)

data class SamlIdentityProviderClient(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("domain")
        var domain: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("appSecret")
        var appSecret: String? = null,
        @SerializedName("appId")
        var appId: String? = null,
        @SerializedName("clientId")
        var clientId: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("when")
        var _when: String? = null,
        @SerializedName("SPMetadata")
        var SPMetadata: String? = null,
        @SerializedName("attributeNameFormat")
        var attributeNameFormat: String? = null,
        @SerializedName("customAttributes")
        var customAttributes: String? = null,
        @SerializedName("emailDomainTransformation")
        var emailDomainTransformation: String? = null,
        @SerializedName("authnContextClassRef")
        var authnContextClassRef: String? = null,
        @SerializedName("IdPMetadata")
        var IdPMetadata: String? = null,
        @SerializedName("assertionConsumerUrl")
        var assertionConsumerUrl: String? = null,
        @SerializedName("bindings")
        var bindings: List<String>? = null,
        @SerializedName("nameIds")
        var nameIds: List<String>? = null,
        @SerializedName("attributes")
        var attributes: List<String>? = null,
        @SerializedName("enableSignRes")
        var enableSignRes: Boolean? = null,
        @SerializedName("resSignAlgorithm")
        var resSignAlgorithm: String? = null,
        @SerializedName("resAbstractAlgorithm")
        var resAbstractAlgorithm: String? = null,
        @SerializedName("resSignPublicKey")
        var resSignPublicKey: String? = null,
        @SerializedName("resSignPrivateKey")
        var resSignPrivateKey: String? = null,
        @SerializedName("resSignPrivateKeyPass")
        var resSignPrivateKeyPass: String? = null,
        @SerializedName("enableSignReq")
        var enableSignReq: Boolean? = null,
        @SerializedName("reqSignPublicKey")
        var reqSignPublicKey: String? = null,
        @SerializedName("enableEncryptRes")
        var enableEncryptRes: Boolean? = null,
        @SerializedName("resEncryptPublicKey")
        var resEncryptPublicKey: String? = null,
        @SerializedName("css")
        var css: String? = null
)

data class SamlDefaultIdentityProviderSettingsList(
        @SerializedName("list")
        var list: List<SamlDefaultIdentityProviderSettings>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class SamlServiceProviderAppPagedList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<SamlServiceProviderClient>? = null
)

data class SamlIdentityProviderAppPagedList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<SamlIdentityProviderClient>? = null
)

data class LdapServerList(
        @SerializedName("list")
        var list: List<LdapSingleServer>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class LdapSingleServer(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("clientId")
        var clientId: String? = null,
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("ldapLink")
        var ldapLink: String? = null,
        @SerializedName("baseDN")
        var baseDN: String? = null,
        @SerializedName("searchStandard")
        var searchStandard: String? = null,
        @SerializedName("emailPostfix")
        var emailPostfix: String? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("password")
        var password: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null
)

data class LdapServerTesterType(
        @SerializedName("result")
        var result: Boolean? = null
)

data class LdapUserTesterType(
        @SerializedName("result")
        var result: Boolean? = null
)

data class ClientHasLdapConfigs(
        @SerializedName("result")
        var result: Boolean? = null
)

data class UserAuthorizedAppPagedList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("OAuthApps")
        var OAuthApps: List<OAuthProviderClient>? = null,
        @SerializedName("OIDCApps")
        var OIDCApps: List<OidcProviderClient>? = null
)

data class IsAppAuthorizedByUser(
        @SerializedName("authorized")
        var authorized: Boolean? = null
)

data class IsReservedDomain(
        @SerializedName("domainValue")
        var domainValue: String? = null,
        @SerializedName("isReserved")
        var isReserved: Boolean? = null
)

data class PricingList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("startNumber")
        var startNumber: Int? = null,
        @SerializedName("freeNumber")
        var freeNumber: Int? = null,
        @SerializedName("startPrice")
        var startPrice: Int? = null,
        @SerializedName("maxNumber")
        var maxNumber: Int? = null,
        @SerializedName("d")
        var d: Int? = null,
        @SerializedName("features")
        var features: List<String>? = null
)

data class PagedOrders(
        @SerializedName("list")
        var list: List<OrderList>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class OrderList(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("timeOfPurchase")
        var timeOfPurchase: Int? = null,
        @SerializedName("flowNumber")
        var flowNumber: Int? = null,
        @SerializedName("price")
        var price: Float? = null,
        @SerializedName("pricing")
        var pricing: OrderPricing? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("completed")
        var completed: Boolean? = null,
        @SerializedName("payMethod")
        var payMethod: String? = null,
        @SerializedName("endAt")
        var endAt: String? = null,
        @SerializedName("clientInfo")
        var clientInfo: OrderClient? = null
)

data class OrderPricing(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("startNumber")
        var startNumber: Int? = null,
        @SerializedName("freeNumber")
        var freeNumber: Int? = null,
        @SerializedName("startPrice")
        var startPrice: Int? = null,
        @SerializedName("maxNumber")
        var maxNumber: Int? = null,
        @SerializedName("d")
        var d: Int? = null,
        @SerializedName("features")
        var features: List<String>? = null
)

data class OrderClient(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("secret")
        var secret: String? = null,
        @SerializedName("descriptions")
        var descriptions: String? = null,
        @SerializedName("jwtExpired")
        var jwtExpired: Int? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null
)

data class UserPricingType(
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("isFree")
        var isFree: Boolean? = null,
        @SerializedName("pricing")
        var pricing: UserPricingNotFreeType? = null,
        @SerializedName("freeNumber")
        var freeNumber: Int? = null
)

data class UserPricingNotFreeType(
        @SerializedName("number")
        var number: Int? = null
)

data class PagedUsers(
        @SerializedName("list")
        var list: List<ExtendUser>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class ExtendUser(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("unionid")
        var unionid: String? = null,
        @SerializedName("openid")
        var openid: String? = null,
        @SerializedName("emailVerified")
        var emailVerified: Boolean? = null,
        @SerializedName("phone")
        var phone: String? = null,
        @SerializedName("phoneVerified")
        var phoneVerified: Boolean? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("nickname")
        var nickname: String? = null,
        @SerializedName("company")
        var company: String? = null,
        @SerializedName("photo")
        var photo: String? = null,
        @SerializedName("browser")
        var browser: String? = null,
        @SerializedName("device")
        var device: String? = null,
        @SerializedName("password")
        var password: String? = null,
        @SerializedName("registerInClient")
        var registerInClient: String? = null,
        @SerializedName("registerMethod")
        var registerMethod: String? = null,
        @SerializedName("oauth")
        var oauth: String? = null,
        @SerializedName("token")
        var token: String? = null,
        @SerializedName("tokenExpiredAt")
        var tokenExpiredAt: String? = null,
        @SerializedName("loginsCount")
        var loginsCount: Int? = null,
        @SerializedName("lastLogin")
        var lastLogin: String? = null,
        @SerializedName("lastIP")
        var lastIP: String? = null,
        @SerializedName("signedUp")
        var signedUp: String? = null,
        @SerializedName("blocked")
        var blocked: Boolean? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("givenName")
        var givenName: String? = null,
        @SerializedName("familyName")
        var familyName: String? = null,
        @SerializedName("middleName")
        var middleName: String? = null,
        @SerializedName("profile")
        var profile: String? = null,
        @SerializedName("preferredUsername")
        var preferredUsername: String? = null,
        @SerializedName("website")
        var website: String? = null,
        @SerializedName("gender")
        var gender: String? = null,
        @SerializedName("birthdate")
        var birthdate: String? = null,
        @SerializedName("zoneinfo")
        var zoneinfo: String? = null,
        @SerializedName("locale")
        var locale: String? = null,
        @SerializedName("address")
        var address: String? = null,
        @SerializedName("formatted")
        var formatted: String? = null,
        @SerializedName("streetAddress")
        var streetAddress: String? = null,
        @SerializedName("locality")
        var locality: String? = null,
        @SerializedName("region")
        var region: String? = null,
        @SerializedName("postalCode")
        var postalCode: String? = null,
        @SerializedName("country")
        var country: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("group")
        var group: Group? = null,
        @SerializedName("clientType")
        var clientType: UserClientType? = null,
        @SerializedName("userLocation")
        var userLocation: List<UserLocation>? = null,
        @SerializedName("userLoginHistory")
        var userLoginHistory: PagedUserLoginHistory? = null,
        @SerializedName("systemApplicationType")
        var systemApplicationType: SystemApplicationType? = null,
        @SerializedName("thirdPartyIdentity")
        var thirdPartyIdentity: ThirdPartyIdentity? = null,
        @SerializedName("customData")
        var customData: String? = null,
        @SerializedName("metadata")
        var metadata: String? = null,
        @SerializedName("salt")
        var salt: String? = null
)

data class Group(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("descriptions")
        var descriptions: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("permissions")
        var permissions: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null
)

data class UserClientType(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("example")
        var example: String? = null
)

data class UserLocation(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: User? = null,
        @SerializedName("userPool")
        var userPool: UserClient? = null,
        @SerializedName("when")
        var _when: String? = null,
        @SerializedName("where")
        var where: String? = null
)

data class UserClient(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: User? = null,
        @SerializedName("iamType")
        var iamType: IamType? = null,
        @SerializedName("domain")
        var domain: String? = null,
        @SerializedName("clientType")
        var clientType: UserClientType? = null,
        @SerializedName("userLimit")
        var userLimit: Int? = null,
        @SerializedName("userPoolTypes")
        var userPoolTypes: List<UserClientType>? = null,
        @SerializedName("usersCount")
        var usersCount: Int? = null,
        @SerializedName("logo")
        var logo: String? = null,
        @SerializedName("emailVerifiedDefault")
        var emailVerifiedDefault: Boolean? = null,
        @SerializedName("sendWelcomeEmail")
        var sendWelcomeEmail: Boolean? = null,
        @SerializedName("registerDisabled")
        var registerDisabled: Boolean? = null,
        @SerializedName("showWXMPQRCode")
        var showWXMPQRCode: Boolean? = null,
        @SerializedName("useMiniLogin")
        var useMiniLogin: Boolean? = null,
        @SerializedName("useSelfWxapp")
        var useSelfWxapp: Boolean? = null,
        @SerializedName("allowedOrigins")
        var allowedOrigins: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("secret")
        var secret: String? = null,
        @SerializedName("token")
        var token: String? = null,
        @SerializedName("descriptions")
        var descriptions: String? = null,
        @SerializedName("jwtExpired")
        var jwtExpired: Int? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("frequentRegisterCheck")
        var frequentRegisterCheck: FrequentRegisterCheckConfig? = null,
        @SerializedName("loginFailCheck")
        var loginFailCheck: LoginFailCheckConfig? = null,
        @SerializedName("enableEmail")
        var enableEmail: Boolean? = null,
        @SerializedName("changePhoneStrategy")
        var changePhoneStrategy: ChangePhoneStrategy? = null,
        @SerializedName("changeEmailStrategy")
        var changeEmailStrategy: ChangeEmailStrategy? = null,
        @SerializedName("qrcodeLoginStrategy")
        var qrcodeLoginStrategy: QrcodeLoginStrategy? = null,
        @SerializedName("app2WxappLoginStrategy")
        var app2WxappLoginStrategy: App2WxappLoginStrategy? = null
)

enum class IamType(val label: String) {
    Eiam("EIAM"),
    Ciam("CIAM");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): IamType? {
            return values().find { it.label == label }
        }
    }
}

data class FrequentRegisterCheckConfig(
        @SerializedName("timeInterval")
        var timeInterval: Int? = null,
        @SerializedName("limit")
        var limit: Int? = null,
        @SerializedName("enable")
        var enable: Boolean? = null
)

data class LoginFailCheckConfig(
        @SerializedName("timeInterval")
        var timeInterval: Int? = null,
        @SerializedName("limit")
        var limit: Int? = null,
        @SerializedName("enable")
        var enable: Boolean? = null
)

data class ChangePhoneStrategy(
        @SerializedName("verifyOldPhone")
        var verifyOldPhone: Boolean? = null
)

data class ChangeEmailStrategy(
        @SerializedName("verifyOldEmail")
        var verifyOldEmail: Boolean? = null
)

data class QrcodeLoginStrategy(
        @SerializedName("qrcodeExpiresAfter")
        var qrcodeExpiresAfter: Int? = null,
        @SerializedName("returnFullUserInfo")
        var returnFullUserInfo: Boolean? = null,
        @SerializedName("allowExchangeUserInfoFromBrowser")
        var allowExchangeUserInfoFromBrowser: Boolean? = null,
        @SerializedName("ticketExpiresAfter")
        var ticketExpiresAfter: Int? = null
)

data class App2WxappLoginStrategy(
        @SerializedName("ticketExpriresAfter")
        var ticketExpriresAfter: Int? = null,
        @SerializedName("ticketExchangeUserInfoNeedSecret")
        var ticketExchangeUserInfoNeedSecret: Boolean? = null
)

data class PagedUserLoginHistory(
        @SerializedName("list")
        var list: List<UserLoginHistory>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class UserLoginHistory(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: User? = null,
        @SerializedName("when")
        var _when: String? = null,
        @SerializedName("client")
        var client: UserClient? = null,
        @SerializedName("success")
        var success: Boolean? = null,
        @SerializedName("ip")
        var ip: String? = null,
        @SerializedName("result")
        var result: String? = null,
        @SerializedName("device")
        var device: String? = null,
        @SerializedName("browser")
        var browser: String? = null
)

data class SystemApplicationType(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("descriptions")
        var descriptions: String? = null,
        @SerializedName("price")
        var price: Int? = null
)

data class UserIds(
        @SerializedName("list")
        var list: List<String>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class UserAnalytics(
        @SerializedName("usersAddedToday")
        var usersAddedToday: UserAnalyticsItem? = null,
        @SerializedName("usersAddedLastWeek")
        var usersAddedLastWeek: UserAnalyticsItem? = null,
        @SerializedName("usersLoginLastWeek")
        var usersLoginLastWeek: UserAnalyticsItem? = null,
        @SerializedName("totalUsers")
        var totalUsers: UserAnalyticsItem? = null,
        @SerializedName("allUsers")
        var allUsers: Int? = null,
        @SerializedName("totalApps")
        var totalApps: Int? = null
)

data class UserAnalyticsItem(
        @SerializedName("list")
        var list: List<User>? = null,
        @SerializedName("length")
        var length: Int? = null
)

data class PagedUserClients(
        @SerializedName("list")
        var list: List<UserClient>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class UserLoginCount(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("count")
        var count: Int? = null,
        @SerializedName("month")
        var month: String? = null,
        @SerializedName("isError")
        var isError: Boolean? = null,
        @SerializedName("totalNumber")
        var totalNumber: Int? = null
)

data class JwtDecodedData(
        @SerializedName("data")
        var data: JwtPayloadData? = null,
        @SerializedName("status")
        var status: CommonMessage? = null,
        @SerializedName("iat")
        var iat: String? = null,
        @SerializedName("exp")
        var exp: Int? = null
)

data class JwtPayloadData(
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("id")
        var id: String? = null,
        @SerializedName("clientId")
        var clientId: String? = null,
        @SerializedName("unionid")
        var unionid: String? = null
)

data class CommonMessage(
        @SerializedName("message")
        var message: String? = null,
        @SerializedName("code")
        var code: Int? = null,
        @SerializedName("status")
        var status: Boolean? = null
)

data class JwtDecodedDataCheckLogin(
        @SerializedName("message")
        var message: String? = null,
        @SerializedName("code")
        var code: Int? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("token")
        var token: TokenWholeInfo? = null
)

data class TokenWholeInfo(
        @SerializedName("data")
        var data: TokenMoreInfo? = null,
        @SerializedName("iat")
        var iat: Int? = null,
        @SerializedName("exp")
        var exp: Int? = null
)

data class TokenMoreInfo(
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("id")
        var id: String? = null,
        @SerializedName("clientId")
        var clientId: String? = null,
        @SerializedName("unionid")
        var unionid: String? = null
)

data class AppSecretByClientId(
        @SerializedName("secret")
        var secret: String? = null,
        @SerializedName("clientId")
        var clientId: String? = null
)

data class LoginHotDotPicData(
        @SerializedName("list")
        var list: List<List<String>>? = null
)

data class RegisterEveryDayCount(
        @SerializedName("list")
        var list: List<List<String>>? = null
)

data class Statistic(
        @SerializedName("list")
        var list: List<StatisticInfo>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class StatisticInfo(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("loginsCount")
        var loginsCount: Int? = null,
        @SerializedName("appsCount")
        var appsCount: Int? = null,
        @SerializedName("OAuthCount")
        var OAuthCount: Int? = null
)

data class PagedUserClientList(
        @SerializedName("list")
        var list: List<PagedUserClientListItem>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class PagedUserClientListItem(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("usersCount")
        var usersCount: Int? = null,
        @SerializedName("user")
        var user: UserBrief? = null
)

data class UserBrief(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("username")
        var username: String? = null
)

data class UsersInGroup(
        @SerializedName("list")
        var list: List<UsersInGroupListItem>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class UsersInGroupListItem(
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("upgrade")
        var upgrade: Boolean? = null
)

data class QpsByTime(
        @SerializedName("qps")
        var qps: Float? = null,
        @SerializedName("time")
        var time: String? = null
)

data class GeographicalDistributionList(
        @SerializedName("city")
        var city: String? = null,
        @SerializedName("size")
        var size: Float? = null,
        @SerializedName("point")
        var point: List<Float>? = null
)

data class DayServiceCallListOfAllServices(
        @SerializedName("userService")
        var userService: List<DayServiceCallList>? = null,
        @SerializedName("emailService")
        var emailService: List<DayServiceCallList>? = null,
        @SerializedName("oAuthService")
        var oAuthService: List<DayServiceCallList>? = null,
        @SerializedName("payService")
        var payService: List<DayServiceCallList>? = null
)

data class DayServiceCallList(
        @SerializedName("day")
        var day: String? = null,
        @SerializedName("count")
        var count: Int? = null
)

data class DayUserGrowth(
        @SerializedName("day")
        var day: String? = null,
        @SerializedName("count")
        var count: Int? = null
)

data class PagedRequestList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<Request>? = null
)

data class Request(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("when")
        var _when: String? = null,
        @SerializedName("where")
        var where: String? = null,
        @SerializedName("ip")
        var ip: String? = null,
        @SerializedName("size")
        var size: Int? = null,
        @SerializedName("responseTime")
        var responseTime: Int? = null,
        @SerializedName("service")
        var service: String? = null
)

data class UserOAuthBind(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("unionid")
        var unionid: String? = null,
        @SerializedName("userInfo")
        var userInfo: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null
)

data class PatchExtendUser(
        @SerializedName("list")
        var list: List<ExtendUser>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class PermissionDescriptorsListInputTypeInput(
        @SerializedName("permissionId")
        var permissionId: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("operationAllow")
        var operationAllow: Int? = null
) {

    fun permissionId(permissionId: String): PermissionDescriptorsListInputTypeInput {
        this.permissionId = permissionId
        return this
    }

    fun name(name: String): PermissionDescriptorsListInputTypeInput {
        this.name = name
        return this
    }

    fun operationAllow(operationAllow: Int): PermissionDescriptorsListInputTypeInput {
        this.operationAllow = operationAllow
        return this
    }

    fun build(): PermissionDescriptorsListInputTypeInput {
        return this
    }
}

data class PagedRoles(
        @SerializedName("list")
        var list: List<Group>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class PagedUserGroup(
        @SerializedName("list")
        var list: List<UserGroup>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class UserGroup(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: User? = null,
        @SerializedName("client")
        var client: UserClient? = null,
        @SerializedName("group")
        var group: Group? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null
)

data class ClientInfoAndAccessToken(
        @SerializedName("clientInfo")
        var clientInfo: UserClient? = null,
        @SerializedName("accessToken")
        var accessToken: String? = null
)

data class ClientWebhook(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("events")
        var events: List<WebhookEvent>? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("isLastTimeSuccess")
        var isLastTimeSuccess: Boolean? = null,
        @SerializedName("contentType")
        var contentType: String? = null,
        @SerializedName("secret")
        var secret: String? = null,
        @SerializedName("enable")
        var enable: Boolean? = null
)

data class WebhookEvent(
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("label")
        var label: String? = null,
        @SerializedName("description")
        var description: String? = null
)

data class WebhookLog(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("webhook")
        var webhook: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("event")
        var event: String? = null,
        @SerializedName("request")
        var request: WebhookRequestType? = null,
        @SerializedName("response")
        var response: WebhookResponseType? = null,
        @SerializedName("errorMessage")
        var errorMessage: String? = null,
        @SerializedName("when")
        var _when: String? = null
)

data class WebhookRequestType(
        @SerializedName("headers")
        var headers: String? = null,
        @SerializedName("payload")
        var payload: String? = null
)

data class WebhookResponseType(
        @SerializedName("headers")
        var headers: String? = null,
        @SerializedName("body")
        var body: String? = null,
        @SerializedName("statusCode")
        var statusCode: Int? = null
)

data class WebhookSettingOptions(
        @SerializedName("webhookEvents")
        var webhookEvents: List<WebhookEvent>? = null,
        @SerializedName("contentTypes")
        var contentTypes: List<WebhookContentType>? = null
)

data class WebhookContentType(
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("label")
        var label: String? = null
)

data class CollaborativeUserPoolList(
        @SerializedName("list")
        var list: List<Collaboration>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class Collaboration(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("owner")
        var owner: User? = null,
        @SerializedName("collaborator")
        var collaborator: User? = null,
        @SerializedName("userPool")
        var userPool: UserClient? = null,
        @SerializedName("permissionDescriptors")
        var permissionDescriptors: List<PermissionDescriptors>? = null
)

data class PermissionDescriptors(
        @SerializedName("permissionId")
        var permissionId: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("operationAllow")
        var operationAllow: Int? = null
)

data class Collaborators(
        @SerializedName("collaborationId")
        var collaborationId: String? = null,
        @SerializedName("list")
        var list: List<Collaboration>? = null
)

data class CollaboratorPermissions(
        @SerializedName("collaborator")
        var collaborator: User? = null,
        @SerializedName("list")
        var list: List<PermissionDescriptors>? = null
)

data class PasswordStrengthSettings(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("pwdStrength")
        var pwdStrength: Int? = null
)

data class PermissionList(
        @SerializedName("list")
        var list: List<Permission>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class Permission(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("affect")
        var affect: String? = null,
        @SerializedName("description")
        var description: String? = null
)

data class BasicUserInfo(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("photo")
        var photo: String? = null,
        @SerializedName("email")
        var email: String? = null
)

data class PaaswordFaas(
        @SerializedName("encryptUrl")
        var encryptUrl: String? = null,
        @SerializedName("decryptUrl")
        var decryptUrl: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("logs")
        var logs: String? = null,
        @SerializedName("enable")
        var enable: Boolean? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null
)

data class LoginTopEmailList(
        @SerializedName("domain")
        var domain: String? = null,
        @SerializedName("count")
        var count: Int? = null
)

data class RegisterMethodList(
        @SerializedName("method")
        var method: String? = null,
        @SerializedName("count")
        var count: Int? = null
)

data class SmsCountInfo(
        @SerializedName("count")
        var count: Int? = null,
        @SerializedName("limitCount")
        var limitCount: Int? = null
)

data class Invitation(
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("phone")
        var phone: String? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null
)

data class InvitationState(
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("enablePhone")
        var enablePhone: Boolean? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null
)

data class Mfa(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("enable")
        var enable: Boolean? = null,
        @SerializedName("shareKey")
        var shareKey: String? = null
)

data class PagedUserPoolWithMfa(
        @SerializedName("list")
        var list: List<UserPoolWithMfa>? = null,
        @SerializedName("total")
        var total: Int? = null
)

data class UserPoolWithMfa(
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("userPool")
        var userPool: UserClient? = null,
        @SerializedName("MFA")
        var MFA: Mfa? = null
)

data class PagedCustomMfaList(
        @SerializedName("list")
        var list: List<CustomMfa>? = null,
        @SerializedName("total")
        var total: Int? = null
)

data class CustomMfa(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("userIdInMiniLogin")
        var userIdInMiniLogin: String? = null,
        @SerializedName("userPoolId")
        var userPoolId: UserClient? = null,
        @SerializedName("remark")
        var remark: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("secret")
        var secret: String? = null
)

data class ValidateResult(
        @SerializedName("isValid")
        var isValid: Boolean? = null
)

data class AuthAuditRecordsList(
        @SerializedName("list")
        var list: List<AuthAuditRecord>? = null,
        @SerializedName("totalCount")
        var totalCount: Int? = null
)

data class AuthAuditRecord(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("appType")
        var appType: String? = null,
        @SerializedName("appId")
        var appId: String? = null,
        @SerializedName("event")
        var event: String? = null,
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null
)

data class UserPoolCommonInfo(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("domain")
        var domain: String? = null,
        @SerializedName("logo")
        var logo: String? = null,
        @SerializedName("iamType")
        var iamType: IamType? = null,
        @SerializedName("userLimit")
        var userLimit: Int? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("changePhoneStrategy")
        var changePhoneStrategy: ChangePhoneStrategy? = null,
        @SerializedName("changeEmailStrategy")
        var changeEmailStrategy: ChangeEmailStrategy? = null,
        @SerializedName("qrcodeLoginStrategy")
        var qrcodeLoginStrategy: QrcodeLoginStrategy? = null,
        @SerializedName("app2WxappLoginStrategy")
        var app2WxappLoginStrategy: App2WxappLoginStrategy? = null
)

enum class ProviderType(val label: String) {
    Oidc("OIDC"),
    OAuth("OAuth");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): ProviderType? {
            return values().find { it.label == label }
        }
    }
}

data class AdConnctorCommonInfo(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("logo")
        var logo: String? = null,
        @SerializedName("status")
        var status: Boolean? = null
)

data class IsAdConenctorAlive(
        @SerializedName("isAlive")
        var isAlive: Boolean? = null
)

data class AdConnector(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("secret")
        var secret: String? = null,
        @SerializedName("salt")
        var salt: String? = null,
        @SerializedName("logo")
        var logo: String? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null
)

data class AdConnectorEnabledProvider(
        @SerializedName("providerType")
        var providerType: String? = null,
        @SerializedName("providerId")
        var providerId: String? = null,
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("adConnectorId")
        var adConnectorId: String? = null
)

data class SamlFieldMappings(
        @SerializedName("sourceExpression")
        var sourceExpression: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("targetField")
        var targetField: String? = null
)

data class SamlAvaliableFieldMappings(
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("editable")
        var editable: Boolean? = null
)

data class RbacRole(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("permissions")
        var permissions: PagedRbacPermission? = null,
        @SerializedName("users")
        var users: PagedUsers? = null
)

data class PagedRbacPermission(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<RbacPermission>? = null
)

data class RbacPermission(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("description")
        var description: String? = null
)

enum class SortByEnum(val label: String) {
    CreatedatDesc("CREATEDAT_DESC"),
    CreatedatAsc("CREATEDAT_ASC"),
    UpdatedatDesc("UPDATEDAT_DESC"),
    UpdatedatAsc("UPDATEDAT_ASC");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): SortByEnum? {
            return values().find { it.label == label }
        }
    }
}

data class PagedRbacRole(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<RbacRole>? = null
)

data class RbacGroup(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("roles")
        var roles: PagedRbacRole? = null,
        @SerializedName("permissions")
        var permissions: PagedRbacPermission? = null,
        @SerializedName("users")
        var users: PagedUsers? = null
)

data class PagedRbacGroup(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<RbacGroup>? = null
)

data class UserPermissionList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<RbacPermission>? = null,
        @SerializedName("rawList")
        var rawList: List<String>? = null
)

data class UserGroupList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<RbacGroup>? = null,
        @SerializedName("rawList")
        var rawList: List<String>? = null
)

data class UserRoleList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<RbacRole>? = null,
        @SerializedName("rawList")
        var rawList: List<String>? = null
)

data class Org(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("logo")
        var logo: String? = null,
        @SerializedName("nodes")
        var nodes: List<OrgNode>? = null
)

data class OrgNode(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("children")
        var children: List<String>? = null,
        @SerializedName("root")
        var root: Boolean? = null,
        @SerializedName("depth")
        var depth: Int? = null
)

data class PagedOrg(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<Org>? = null
)

data class OrgChildrenNodesInput(
        @SerializedName("groupId")
        var groupId: String? = null,
        @SerializedName("orgId")
        var orgId: String? = null
) {

    fun groupId(groupId: String): OrgChildrenNodesInput {
        this.groupId = groupId
        return this
    }

    fun orgId(orgId: String): OrgChildrenNodesInput {
        this.orgId = orgId
        return this
    }

    fun build(): OrgChildrenNodesInput {
        return this
    }
}

data class OrgChildNode(
        @SerializedName("group")
        var group: RbacGroup? = null,
        @SerializedName("depth")
        var depth: Int? = null
)

data class IsRootNodeOfOrgInput(
        @SerializedName("groupId")
        var groupId: String? = null,
        @SerializedName("orgId")
        var orgId: String? = null
) {

    fun groupId(groupId: String): IsRootNodeOfOrgInput {
        this.groupId = groupId
        return this
    }

    fun orgId(orgId: String): IsRootNodeOfOrgInput {
        this.orgId = orgId
        return this
    }

    fun build(): IsRootNodeOfOrgInput {
        return this
    }
}

data class GroupMetadata(
        @SerializedName("key")
        var key: String? = null,
        @SerializedName("value")
        var value: String? = null
)

data class KeyValuePairInput(
        @SerializedName("key")
        var key: String? = null,
        @SerializedName("value")
        var value: String? = null
) {

    fun key(key: String): KeyValuePairInput {
        this.key = key
        return this
    }

    fun value(value: String): KeyValuePairInput {
        this.value = value
        return this
    }

    fun build(): KeyValuePairInput {
        return this
    }
}

data class DingTalkCorp(
        @SerializedName("corpId")
        var corpId: String? = null,
        @SerializedName("twoWaySynchronizationOn")
        var twoWaySynchronizationOn: Boolean? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("AESKey")
        var AESKey: String? = null,
        @SerializedName("token")
        var token: String? = null,
        @SerializedName("orgId")
        var orgId: String? = null
)

data class WechatWorkCorp(
        @SerializedName("corpId")
        var corpId: String? = null,
        @SerializedName("corpName")
        var corpName: String? = null,
        @SerializedName("addressBookSyncHelperSecret")
        var addressBookSyncHelperSecret: String? = null,
        @SerializedName("addressBookSyncHelperToken")
        var addressBookSyncHelperToken: String? = null,
        @SerializedName("addressBookSyncHelperEncodingAESKey")
        var addressBookSyncHelperEncodingAESKey: String? = null,
        @SerializedName("twoWaySynchronizationOn")
        var twoWaySynchronizationOn: Boolean? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("orgId")
        var orgId: String? = null
)

data class Rule(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("type")
        var type: RuleTypes? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("faasUrl")
        var faasUrl: String? = null,
        @SerializedName("code")
        var code: String? = null,
        @SerializedName("order")
        var order: Int? = null,
        @SerializedName("async")
        var async: Boolean? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null
)

enum class RuleTypes(val label: String) {
    PreRegister("PRE_REGISTER"),
    PostRegister("POST_REGISTER"),
    PostAuthentication("POST_AUTHENTICATION"),
    PreOidctokenissued("PRE_OIDCTOKENISSUED");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): RuleTypes? {
            return values().find { it.label == label }
        }
    }
}

data class PagedRules(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<Rule>? = null
)

data class PagedRuleEnvVariable(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<RuleEnvVariable>? = null
)

data class RuleEnvVariable(
        @SerializedName("key")
        var key: String? = null,
        @SerializedName("value")
        var value: String? = null
)

data class OperationLogsList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<OperationLog>? = null
)

data class OperationLog(
        @SerializedName("operatorId")
        var operatorId: String? = null,
        @SerializedName("operatorName")
        var operatorName: String? = null,
        @SerializedName("operatorAvatar")
        var operatorAvatar: String? = null,
        @SerializedName("isAdmin")
        var isAdmin: Boolean? = null,
        @SerializedName("isCollaborator")
        var isCollaborator: Boolean? = null,
        @SerializedName("isOwner")
        var isOwner: Boolean? = null,
        @SerializedName("operationType")
        var operationType: String? = null,
        @SerializedName("updatedFields")
        var updatedFields: String? = null,
        @SerializedName("removedFields")
        var removedFields: List<String>? = null,
        @SerializedName("operateAt")
        var operateAt: String? = null,
        @SerializedName("fullDocument")
        var fullDocument: String? = null,
        @SerializedName("coll")
        var coll: String? = null
)

data class InterConnection(
        @SerializedName("sourceUserPoolId")
        var sourceUserPoolId: String? = null,
        @SerializedName("sourceUserId")
        var sourceUserId: String? = null,
        @SerializedName("targetUserPoolId")
        var targetUserPoolId: String? = null,
        @SerializedName("targetUserId")
        var targetUserId: String? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("expiresdAt")
        var expiresdAt: String? = null
)

data class UserMetaDataList(
        @SerializedName("totalCount")
        var totalCount: Int? = null,
        @SerializedName("list")
        var list: List<UserMetaData>? = null
)

data class UserMetaData(
        @SerializedName("key")
        var key: String? = null,
        @SerializedName("value")
        var value: String? = null
)

data class Mutation(
        @SerializedName("SendEmail")
        var SendEmail: EmailSentList? = null,
        @SerializedName("AddEmailProvider")
        var AddEmailProvider: EmailProviderList? = null,
        @SerializedName("RemoveEmailProvider")
        var RemoveEmailProvider: List<EmailProviderList>? = null,
        @SerializedName("UpdateEmailProvider")
        var UpdateEmailProvider: EmailProviderList? = null,
        @SerializedName("SaveEmailProviderWithClient")
        var SaveEmailProviderWithClient: EmailProviderWithClientList? = null,
        @SerializedName("UpdateEmailTemplateWithClient")
        var UpdateEmailTemplateWithClient: EmailProviderWithClientList? = null,
        @SerializedName("SendEmailByType")
        var SendEmailByType: EmailSentList? = null,
        @SerializedName("UseDefaultEmailProvider")
        var UseDefaultEmailProvider: Boolean? = null,
        @SerializedName("UpdateEmailTemplate")
        var UpdateEmailTemplate: EmailTemplate? = null,
        @SerializedName("AddOAuthList")
        var AddOAuthList: OAuthList? = null,
        @SerializedName("RemoveOAuthList")
        var RemoveOAuthList: List<String>? = null,
        @SerializedName("RemoveOAuthProvider")
        var RemoveOAuthProvider: OAuthProviderClient? = null,
        @SerializedName("UpdateOAuthList")
        var UpdateOAuthList: OAuthList? = null,
        @SerializedName("UpdateApplicationOAuth")
        var UpdateApplicationOAuth: OAuthList? = null,
        @SerializedName("SetApplicationOAuthEnableOrDisable")
        var SetApplicationOAuthEnableOrDisable: OAuthList? = null,
        @SerializedName("CreateOAuthProvider")
        var CreateOAuthProvider: OAuthProviderClient? = null,
        @SerializedName("UpdateOAuthProvider")
        var UpdateOAuthProvider: OAuthProviderClient? = null,
        @SerializedName("CreateOIDCApp")
        var CreateOIDCApp: OidcProviderClient? = null,
        @SerializedName("UpdateOIDCApp")
        var UpdateOIDCApp: OidcProviderClient? = null,
        @SerializedName("RemoveOIDCApp")
        var RemoveOIDCApp: OidcProviderClient? = null,
        @SerializedName("CreateSAMLServiceProvider")
        var CreateSAMLServiceProvider: SamlServiceProviderClient? = null,
        @SerializedName("UpdateSAMLServiceProvider")
        var UpdateSAMLServiceProvider: SamlServiceProviderClient? = null,
        @SerializedName("RemoveSAMLServiceProvider")
        var RemoveSAMLServiceProvider: SamlServiceProviderClient? = null,
        @SerializedName("EnableSAMLServiceProvider")
        var EnableSAMLServiceProvider: SamlServiceProviderClient? = null,
        @SerializedName("CreateSAMLIdentityProvider")
        var CreateSAMLIdentityProvider: SamlIdentityProviderClient? = null,
        @SerializedName("UpdateSAMLIdentityProvider")
        var UpdateSAMLIdentityProvider: SamlIdentityProviderClient? = null,
        @SerializedName("RemoveSAMLIdentityProvider")
        var RemoveSAMLIdentityProvider: SamlIdentityProviderClient? = null,
        @SerializedName("EnableSAMLIdentityProvider")
        var EnableSAMLIdentityProvider: SamlIdentityProviderClient? = null,
        @SerializedName("CreateDefaultSAMLIdentityProviderSettings")
        var CreateDefaultSAMLIdentityProviderSettings: SamlDefaultIdentityProviderSettings? = null,
        @SerializedName("AddLDAPServer")
        var AddLDAPServer: LdapSingleServer? = null,
        @SerializedName("UpdateLDAPServer")
        var UpdateLDAPServer: LdapSingleServer? = null,
        @SerializedName("RemoveLDAPServer")
        var RemoveLDAPServer: LdapSingleServer? = null,
        @SerializedName("LoginByLDAP")
        var LoginByLDAP: User? = null,
        @SerializedName("ClearAvatarSrc")
        var ClearAvatarSrc: OAuthList? = null,
        @SerializedName("RevokeUserAuthorizedApp")
        var RevokeUserAuthorizedApp: UserAuthorizedApp? = null,
        @SerializedName("UpdateSystemPricing")
        var UpdateSystemPricing: PricingList? = null,
        @SerializedName("AddSystemPricing")
        var AddSystemPricing: PricingList? = null,
        @SerializedName("order")
        var order: OrderSuccess? = null,
        @SerializedName("ContinuePay")
        var ContinuePay: OrderSuccess? = null,
        @SerializedName("IncClientFlowNumber")
        var IncClientFlowNumber: OrderSuccess? = null,
        @SerializedName("register")
        var register: ExtendUser? = null,
        @SerializedName("createUser")
        var createUser: ExtendUser? = null,
        @SerializedName("login")
        var login: ExtendUser? = null,
        @SerializedName("updateUser")
        var updateUser: User? = null,
        @SerializedName("removeUsers")
        var removeUsers: List<User>? = null,
        @SerializedName("newClient")
        var newClient: UserClient? = null,
        @SerializedName("removeUserClients")
        var removeUserClients: List<UserClient>? = null,
        @SerializedName("updateUserClient")
        var updateUserClient: UserClient? = null,
        @SerializedName("changePassword")
        var changePassword: ExtendUser? = null,
        @SerializedName("sendResetPasswordEmail")
        var sendResetPasswordEmail: CommonMessage? = null,
        @SerializedName("verifyResetPasswordVerifyCode")
        var verifyResetPasswordVerifyCode: CommonMessage? = null,
        @SerializedName("sendVerifyEmail")
        var sendVerifyEmail: CommonMessage? = null,
        @SerializedName("generateInvitationCode")
        var generateInvitationCode: InvitationCode? = null,
        @SerializedName("refreshAppSecret")
        var refreshAppSecret: UserClient? = null,
        @SerializedName("updateSuperAdminUser")
        var updateSuperAdminUser: UsersInGroupListItem? = null,
        @SerializedName("addSuperAdminUser")
        var addSuperAdminUser: UsersInGroupListItem? = null,
        @SerializedName("removeSuperAdminUser")
        var removeSuperAdminUser: UsersInGroupListItem? = null,
        @SerializedName("recordRequest")
        var recordRequest: CommonMessage? = null,
        @SerializedName("bindOtherOAuth")
        var bindOtherOAuth: UserOAuthBind? = null,
        @SerializedName("unbindOtherOAuth")
        var unbindOtherOAuth: UserOAuthBind? = null,
        @SerializedName("unbindEmail")
        var unbindEmail: User? = null,
        @SerializedName("oauthPasswordLogin")
        var oauthPasswordLogin: ExtendUser? = null,
        @SerializedName("createRole")
        var createRole: Group? = null,
        @SerializedName("updateRole")
        var updateRole: Group? = null,
        @SerializedName("updatePermissions")
        var updatePermissions: Group? = null,
        @SerializedName("assignUserToRole")
        var assignUserToRole: PagedUserGroup? = null,
        @SerializedName("removeUserFromGroup")
        var removeUserFromGroup: UserGroup? = null,
        @SerializedName("addClientWebhook")
        var addClientWebhook: ClientWebhook? = null,
        @SerializedName("updateClientWebhook")
        var updateClientWebhook: ClientWebhook? = null,
        @SerializedName("deleteClientWebhook")
        var deleteClientWebhook: ClientWebhook? = null,
        @SerializedName("SendWebhookTest")
        var SendWebhookTest: Boolean? = null,
        @SerializedName("refreshToken")
        var refreshToken: RefreshToken? = null,
        @SerializedName("addCollaborator")
        var addCollaborator: Collaboration? = null,
        @SerializedName("removeCollaborator")
        var removeCollaborator: Collaboration? = null,
        @SerializedName("updateCollaborator")
        var updateCollaborator: Collaboration? = null,
        @SerializedName("addPermission")
        var addPermission: Permission? = null,
        @SerializedName("updatePasswordStrengthSettingsByUserPoolId")
        var updatePasswordStrengthSettingsByUserPoolId: PasswordStrengthSettings? = null,
        @SerializedName("resetUserPoolFromWechat")
        var resetUserPoolFromWechat: PagedUsers? = null,
        @SerializedName("encryptPassword")
        var encryptPassword: EncryptPassword? = null,
        @SerializedName("enablePasswordFaas")
        var enablePasswordFaas: PaaswordFaas? = null,
        @SerializedName("addToInvitation")
        var addToInvitation: Invitation? = null,
        @SerializedName("removeFromInvitation")
        var removeFromInvitation: Invitation? = null,
        @SerializedName("setInvitationState")
        var setInvitationState: InvitationState? = null,
        @SerializedName("changeMFA")
        var changeMFA: Mfa? = null,
        @SerializedName("createCustomMFA")
        var createCustomMFA: CustomMfa? = null,
        @SerializedName("removeCustomMFA")
        var removeCustomMFA: CustomMfa? = null,
        @SerializedName("recordAuthAudit")
        var recordAuthAudit: CommonMessage? = null,
        @SerializedName("refreshAccessToken")
        var refreshAccessToken: RefreshAccessTokenData? = null,
        @SerializedName("passwordLessForceLogin")
        var passwordLessForceLogin: User? = null,
        @SerializedName("createUserWithoutAuthentication")
        var createUserWithoutAuthentication: User? = null,
        @SerializedName("refreshThirdPartyToken")
        var refreshThirdPartyToken: RefreshThirdPartyIdentityResult? = null,
        @SerializedName("signIn")
        var signIn: OidcPasswordModeUserInfo? = null,
        @SerializedName("refreshSignInToken")
        var refreshSignInToken: RefreshedSignInToken? = null,
        @SerializedName("createAdConnector")
        var createAdConnector: AdConnector? = null,
        @SerializedName("updateAdConnector")
        var updateAdConnector: AdConnector? = null,
        @SerializedName("refreshAdConnectorSecret")
        var refreshAdConnectorSecret: AdConnector? = null,
        @SerializedName("removeAdConnector")
        var removeAdConnector: Boolean? = null,
        @SerializedName("enableAdConnector")
        var enableAdConnector: Boolean? = null,
        @SerializedName("disableAdConnector")
        var disableAdConnector: Boolean? = null,
        @SerializedName("enableAdConnectorForProvider")
        var enableAdConnectorForProvider: Boolean? = null,
        @SerializedName("disableAdConnectorForProvider")
        var disableAdConnectorForProvider: Boolean? = null,
        @SerializedName("loginByAd")
        var loginByAd: User? = null,
        @SerializedName("setSAMLIdPFieldMapping")
        var setSAMLIdPFieldMapping: SamlFieldMappings? = null,
        @SerializedName("removeSAMLIdpFieldMapping")
        var removeSAMLIdpFieldMapping: CommonMessage? = null,
        @SerializedName("createRBACPermission")
        var createRBACPermission: RbacPermission? = null,
        @SerializedName("updateRBACPermission")
        var updateRBACPermission: RbacPermission? = null,
        @SerializedName("deleteRBACPermission")
        var deleteRBACPermission: CommonMessage? = null,
        @SerializedName("deleteRBACPermissionBatch")
        var deleteRBACPermissionBatch: CommonMessage? = null,
        @SerializedName("createRBACRole")
        var createRBACRole: RbacRole? = null,
        @SerializedName("updateRBACRole")
        var updateRBACRole: RbacRole? = null,
        @SerializedName("deleteRBACRole")
        var deleteRBACRole: CommonMessage? = null,
        @SerializedName("deleteRBACRoleBatch")
        var deleteRBACRoleBatch: CommonMessage? = null,
        @SerializedName("createRBACGroup")
        var createRBACGroup: RbacGroup? = null,
        @SerializedName("updateRBACGroup")
        var updateRBACGroup: RbacGroup? = null,
        @SerializedName("deleteRBACGroup")
        var deleteRBACGroup: CommonMessage? = null,
        @SerializedName("deleteRBACGroupBatch")
        var deleteRBACGroupBatch: CommonMessage? = null,
        @SerializedName("assignRBACRoleToUser")
        var assignRBACRoleToUser: RbacRole? = null,
        @SerializedName("assignRBACRoleToUserBatch")
        var assignRBACRoleToUserBatch: RbacRole? = null,
        @SerializedName("revokeRBACRoleFromUser")
        var revokeRBACRoleFromUser: RbacRole? = null,
        @SerializedName("revokeRBACRoleFromUserBatch")
        var revokeRBACRoleFromUserBatch: RbacRole? = null,
        @SerializedName("addPermissionToRBACRole")
        var addPermissionToRBACRole: RbacRole? = null,
        @SerializedName("addPermissionToRBACRoleBatch")
        var addPermissionToRBACRoleBatch: RbacRole? = null,
        @SerializedName("removePermissionFromRBACRole")
        var removePermissionFromRBACRole: RbacRole? = null,
        @SerializedName("removePermissionFromRBACRoleBatch")
        var removePermissionFromRBACRoleBatch: RbacRole? = null,
        @SerializedName("addRoleToRBACGroup")
        var addRoleToRBACGroup: RbacGroup? = null,
        @SerializedName("addRoleToRBACGroupBatch")
        var addRoleToRBACGroupBatch: RbacGroup? = null,
        @SerializedName("removeRoleFromRBACGroup")
        var removeRoleFromRBACGroup: RbacGroup? = null,
        @SerializedName("removeRoleFromRBACGroupBatch")
        var removeRoleFromRBACGroupBatch: RbacGroup? = null,
        @SerializedName("addUserToRBACGroup")
        var addUserToRBACGroup: RbacGroup? = null,
        @SerializedName("addUserToRBACGroupBatch")
        var addUserToRBACGroupBatch: RbacGroup? = null,
        @SerializedName("removeUserFromRBACGroup")
        var removeUserFromRBACGroup: RbacGroup? = null,
        @SerializedName("removeUserFromRBACGroupBatch")
        var removeUserFromRBACGroupBatch: RbacGroup? = null,
        @SerializedName("createOrg")
        var createOrg: Org? = null,
        @SerializedName("updateOrg")
        var updateOrg: Org? = null,
        @SerializedName("deleteOrg")
        var deleteOrg: CommonMessage? = null,
        @SerializedName("addOrgNode")
        var addOrgNode: Org? = null,
        @SerializedName("removeOrgNode")
        var removeOrgNode: Org? = null,
        @SerializedName("addGroupMetadata")
        var addGroupMetadata: List<GroupMetadata>? = null,
        @SerializedName("removeGroupMetadata")
        var removeGroupMetadata: List<GroupMetadata>? = null,
        @SerializedName("addDingTalkCorp")
        var addDingTalkCorp: DingTalkCorp? = null,
        @SerializedName("startDingTalkCorpInitialSync")
        var startDingTalkCorpInitialSync: CorpSyncResult? = null,
        @SerializedName("addWechatWorkCorp")
        var addWechatWorkCorp: WechatWorkCorp? = null,
        @SerializedName("startWechatWorkCorpInitialSync")
        var startWechatWorkCorpInitialSync: CorpSyncResult? = null,
        @SerializedName("createRule")
        var createRule: Rule? = null,
        @SerializedName("updateRule")
        var updateRule: Rule? = null,
        @SerializedName("deleteRule")
        var deleteRule: CommonMessage? = null,
        @SerializedName("setRuleEnv")
        var setRuleEnv: PagedRuleEnvVariable? = null,
        @SerializedName("removeRuleEnv")
        var removeRuleEnv: PagedRuleEnvVariable? = null,
        @SerializedName("updateRuleOrder")
        var updateRuleOrder: CommonMessage? = null,
        @SerializedName("updatePhone")
        var updatePhone: User? = null,
        @SerializedName("updateEmail")
        var updateEmail: User? = null,
        @SerializedName("sendChangeEmailVerifyCode")
        var sendChangeEmailVerifyCode: CommonMessage? = null,
        @SerializedName("createInterConnection")
        var createInterConnection: CommonMessage? = null,
        @SerializedName("setUserMetadata")
        var setUserMetadata: UserMetaDataList? = null,
        @SerializedName("removeUserMetadata")
        var removeUserMetadata: UserMetaDataList? = null
)

data class EmailProviderListInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("fields")
        var fields: List<EmailProviderFormInput>? = null
) {

    fun _id(_id: String): EmailProviderListInput {
        this._id = _id
        return this
    }

    fun name(name: String): EmailProviderListInput {
        this.name = name
        return this
    }

    fun image(image: String): EmailProviderListInput {
        this.image = image
        return this
    }

    fun description(description: String): EmailProviderListInput {
        this.description = description
        return this
    }

    fun fields(fields: List<EmailProviderFormInput>): EmailProviderListInput {
        this.fields = fields
        return this
    }

    fun build(): EmailProviderListInput {
        return this
    }
}

data class EmailProviderFormInput(
        @SerializedName("label")
        var label: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("placeholder")
        var placeholder: String? = null,
        @SerializedName("help")
        var help: String? = null,
        @SerializedName("value")
        var value: String? = null,
        @SerializedName("options")
        var options: List<String>? = null
) {

    fun label(label: String): EmailProviderFormInput {
        this.label = label
        return this
    }

    fun type(type: String): EmailProviderFormInput {
        this.type = type
        return this
    }

    fun placeholder(placeholder: String): EmailProviderFormInput {
        this.placeholder = placeholder
        return this
    }

    fun help(help: String): EmailProviderFormInput {
        this.help = help
        return this
    }

    fun value(value: String): EmailProviderFormInput {
        this.value = value
        return this
    }

    fun options(options: List<String>): EmailProviderFormInput {
        this.options = options
        return this
    }

    fun build(): EmailProviderFormInput {
        return this
    }
}

data class EmailProviderWithClientAddInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("fields")
        var fields: List<EmailProviderFormAddInput>? = null,
        @SerializedName("provider")
        var provider: String? = null
) {

    fun _id(_id: String): EmailProviderWithClientAddInput {
        this._id = _id
        return this
    }

    fun user(user: String): EmailProviderWithClientAddInput {
        this.user = user
        return this
    }

    fun client(client: String): EmailProviderWithClientAddInput {
        this.client = client
        return this
    }

    fun status(status: Boolean): EmailProviderWithClientAddInput {
        this.status = status
        return this
    }

    fun fields(fields: List<EmailProviderFormAddInput>): EmailProviderWithClientAddInput {
        this.fields = fields
        return this
    }

    fun provider(provider: String): EmailProviderWithClientAddInput {
        this.provider = provider
        return this
    }

    fun build(): EmailProviderWithClientAddInput {
        return this
    }
}

data class EmailProviderFormAddInput(
        @SerializedName("label")
        var label: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("placeholder")
        var placeholder: String? = null,
        @SerializedName("help")
        var help: String? = null,
        @SerializedName("value")
        var value: String? = null,
        @SerializedName("options")
        var options: List<String>? = null
) {

    fun label(label: String): EmailProviderFormAddInput {
        this.label = label
        return this
    }

    fun type(type: String): EmailProviderFormAddInput {
        this.type = type
        return this
    }

    fun placeholder(placeholder: String): EmailProviderFormAddInput {
        this.placeholder = placeholder
        return this
    }

    fun help(help: String): EmailProviderFormAddInput {
        this.help = help
        return this
    }

    fun value(value: String): EmailProviderFormAddInput {
        this.value = value
        return this
    }

    fun options(options: List<String>): EmailProviderFormAddInput {
        this.options = options
        return this
    }

    fun build(): EmailProviderFormAddInput {
        return this
    }
}

data class EmailTemplateWithClientInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("template")
        var template: String? = null,
        @SerializedName("sender")
        var sender: String? = null,
        @SerializedName("object")
        var _object: String? = null,
        @SerializedName("hasURL")
        var hasURL: Boolean? = null,
        @SerializedName("URLExpireTime")
        var URLExpireTime: Int? = null,
        @SerializedName("redirectTo")
        var redirectTo: String? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("content")
        var content: String? = null
) {

    fun _id(_id: String): EmailTemplateWithClientInput {
        this._id = _id
        return this
    }

    fun user(user: String): EmailTemplateWithClientInput {
        this.user = user
        return this
    }

    fun client(client: String): EmailTemplateWithClientInput {
        this.client = client
        return this
    }

    fun template(template: String): EmailTemplateWithClientInput {
        this.template = template
        return this
    }

    fun sender(sender: String): EmailTemplateWithClientInput {
        this.sender = sender
        return this
    }

    fun _object(_object: String): EmailTemplateWithClientInput {
        this._object = _object
        return this
    }

    fun hasURL(hasURL: Boolean): EmailTemplateWithClientInput {
        this.hasURL = hasURL
        return this
    }

    fun URLExpireTime(URLExpireTime: Int): EmailTemplateWithClientInput {
        this.URLExpireTime = URLExpireTime
        return this
    }

    fun redirectTo(redirectTo: String): EmailTemplateWithClientInput {
        this.redirectTo = redirectTo
        return this
    }

    fun status(status: Boolean): EmailTemplateWithClientInput {
        this.status = status
        return this
    }

    fun content(content: String): EmailTemplateWithClientInput {
        this.content = content
        return this
    }

    fun build(): EmailTemplateWithClientInput {
        return this
    }
}

data class EmailTemplateInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("sender")
        var sender: String? = null,
        @SerializedName("object")
        var _object: String? = null,
        @SerializedName("hasURL")
        var hasURL: Boolean? = null,
        @SerializedName("URLExpireTime")
        var URLExpireTime: Int? = null,
        @SerializedName("status")
        var status: Boolean? = null,
        @SerializedName("redirectTo")
        var redirectTo: String? = null,
        @SerializedName("content")
        var content: String? = null
) {

    fun _id(_id: String): EmailTemplateInput {
        this._id = _id
        return this
    }

    fun type(type: String): EmailTemplateInput {
        this.type = type
        return this
    }

    fun sender(sender: String): EmailTemplateInput {
        this.sender = sender
        return this
    }

    fun _object(_object: String): EmailTemplateInput {
        this._object = _object
        return this
    }

    fun hasURL(hasURL: Boolean): EmailTemplateInput {
        this.hasURL = hasURL
        return this
    }

    fun URLExpireTime(URLExpireTime: Int): EmailTemplateInput {
        this.URLExpireTime = URLExpireTime
        return this
    }

    fun status(status: Boolean): EmailTemplateInput {
        this.status = status
        return this
    }

    fun redirectTo(redirectTo: String): EmailTemplateInput {
        this.redirectTo = redirectTo
        return this
    }

    fun content(content: String): EmailTemplateInput {
        this.content = content
        return this
    }

    fun build(): EmailTemplateInput {
        return this
    }
}

data class OAuthListUpdateInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("alias")
        var alias: String? = null,
        @SerializedName("image")
        var image: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("oAuthUrl")
        var oAuthUrl: String? = null,
        @SerializedName("wxappLogo")
        var wxappLogo: String? = null
) {

    fun _id(_id: String): OAuthListUpdateInput {
        this._id = _id
        return this
    }

    fun name(name: String): OAuthListUpdateInput {
        this.name = name
        return this
    }

    fun alias(alias: String): OAuthListUpdateInput {
        this.alias = alias
        return this
    }

    fun image(image: String): OAuthListUpdateInput {
        this.image = image
        return this
    }

    fun description(description: String): OAuthListUpdateInput {
        this.description = description
        return this
    }

    fun enabled(enabled: Boolean): OAuthListUpdateInput {
        this.enabled = enabled
        return this
    }

    fun url(url: String): OAuthListUpdateInput {
        this.url = url
        return this
    }

    fun client(client: String): OAuthListUpdateInput {
        this.client = client
        return this
    }

    fun user(user: String): OAuthListUpdateInput {
        this.user = user
        return this
    }

    fun oAuthUrl(oAuthUrl: String): OAuthListUpdateInput {
        this.oAuthUrl = oAuthUrl
        return this
    }

    fun wxappLogo(wxappLogo: String): OAuthListUpdateInput {
        this.wxappLogo = wxappLogo
        return this
    }

    fun build(): OAuthListUpdateInput {
        return this
    }
}

data class OAuthListFieldsFormUpdateInput(
        @SerializedName("label")
        var label: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("placeholder")
        var placeholder: String? = null,
        @SerializedName("value")
        var value: String? = null,
        @SerializedName("children")
        var children: List<OAuthListFieldsFormRecursionInput>? = null,
        @SerializedName("checked")
        var checked: List<String>? = null
) {

    fun label(label: String): OAuthListFieldsFormUpdateInput {
        this.label = label
        return this
    }

    fun type(type: String): OAuthListFieldsFormUpdateInput {
        this.type = type
        return this
    }

    fun placeholder(placeholder: String): OAuthListFieldsFormUpdateInput {
        this.placeholder = placeholder
        return this
    }

    fun value(value: String): OAuthListFieldsFormUpdateInput {
        this.value = value
        return this
    }

    fun children(children: List<OAuthListFieldsFormRecursionInput>): OAuthListFieldsFormUpdateInput {
        this.children = children
        return this
    }

    fun checked(checked: List<String>): OAuthListFieldsFormUpdateInput {
        this.checked = checked
        return this
    }

    fun build(): OAuthListFieldsFormUpdateInput {
        return this
    }
}

data class OAuthListFieldsFormRecursionInput(
        @SerializedName("label")
        var label: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("placeholder")
        var placeholder: String? = null,
        @SerializedName("value")
        var value: String? = null,
        @SerializedName("children")
        var children: List<OAuthListFieldsFormRecursionInput>? = null
) {

    fun label(label: String): OAuthListFieldsFormRecursionInput {
        this.label = label
        return this
    }

    fun type(type: String): OAuthListFieldsFormRecursionInput {
        this.type = type
        return this
    }

    fun placeholder(placeholder: String): OAuthListFieldsFormRecursionInput {
        this.placeholder = placeholder
        return this
    }

    fun value(value: String): OAuthListFieldsFormRecursionInput {
        this.value = value
        return this
    }

    fun children(children: List<OAuthListFieldsFormRecursionInput>): OAuthListFieldsFormRecursionInput {
        this.children = children
        return this
    }

    fun build(): OAuthListFieldsFormRecursionInput {
        return this
    }
}

data class OidcProviderCustomStylesInput(
        @SerializedName("forceLogin")
        var forceLogin: Boolean? = null,
        @SerializedName("hideQRCode")
        var hideQRCode: Boolean? = null,
        @SerializedName("hideUP")
        var hideUP: Boolean? = null,
        @SerializedName("hideUsername")
        var hideUsername: Boolean? = null,
        @SerializedName("hideRegister")
        var hideRegister: Boolean? = null,
        @SerializedName("hidePhone")
        var hidePhone: Boolean? = null,
        @SerializedName("hideSocial")
        var hideSocial: Boolean? = null,
        @SerializedName("hideClose")
        var hideClose: Boolean? = null,
        @SerializedName("hidePhonePassword")
        var hidePhonePassword: Boolean? = null,
        @SerializedName("placeholder")
        var placeholder: OidcProviderCustomStylesPlaceholderInput? = null,
        @SerializedName("qrcodeScanning")
        var qrcodeScanning: OidcProviderCustomStylesQrcodeScanningInput? = null,
        @SerializedName("defaultLoginMethod")
        var defaultLoginMethod: OidcProviderDefaultLoginMethod? = null
) {

    fun forceLogin(forceLogin: Boolean): OidcProviderCustomStylesInput {
        this.forceLogin = forceLogin
        return this
    }

    fun hideQRCode(hideQRCode: Boolean): OidcProviderCustomStylesInput {
        this.hideQRCode = hideQRCode
        return this
    }

    fun hideUP(hideUP: Boolean): OidcProviderCustomStylesInput {
        this.hideUP = hideUP
        return this
    }

    fun hideUsername(hideUsername: Boolean): OidcProviderCustomStylesInput {
        this.hideUsername = hideUsername
        return this
    }

    fun hideRegister(hideRegister: Boolean): OidcProviderCustomStylesInput {
        this.hideRegister = hideRegister
        return this
    }

    fun hidePhone(hidePhone: Boolean): OidcProviderCustomStylesInput {
        this.hidePhone = hidePhone
        return this
    }

    fun hideSocial(hideSocial: Boolean): OidcProviderCustomStylesInput {
        this.hideSocial = hideSocial
        return this
    }

    fun hideClose(hideClose: Boolean): OidcProviderCustomStylesInput {
        this.hideClose = hideClose
        return this
    }

    fun hidePhonePassword(hidePhonePassword: Boolean): OidcProviderCustomStylesInput {
        this.hidePhonePassword = hidePhonePassword
        return this
    }

    fun placeholder(placeholder: OidcProviderCustomStylesPlaceholderInput): OidcProviderCustomStylesInput {
        this.placeholder = placeholder
        return this
    }

    fun qrcodeScanning(qrcodeScanning: OidcProviderCustomStylesQrcodeScanningInput): OidcProviderCustomStylesInput {
        this.qrcodeScanning = qrcodeScanning
        return this
    }

    fun defaultLoginMethod(defaultLoginMethod: OidcProviderDefaultLoginMethod): OidcProviderCustomStylesInput {
        this.defaultLoginMethod = defaultLoginMethod
        return this
    }

    fun build(): OidcProviderCustomStylesInput {
        return this
    }
}

data class OidcProviderCustomStylesPlaceholderInput(
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("password")
        var password: String? = null,
        @SerializedName("confirmPassword")
        var confirmPassword: String? = null,
        @SerializedName("verfiyCode")
        var verfiyCode: String? = null,
        @SerializedName("newPassword")
        var newPassword: String? = null,
        @SerializedName("phone")
        var phone: String? = null,
        @SerializedName("phoneCode")
        var phoneCode: String? = null
) {

    fun username(username: String): OidcProviderCustomStylesPlaceholderInput {
        this.username = username
        return this
    }

    fun email(email: String): OidcProviderCustomStylesPlaceholderInput {
        this.email = email
        return this
    }

    fun password(password: String): OidcProviderCustomStylesPlaceholderInput {
        this.password = password
        return this
    }

    fun confirmPassword(confirmPassword: String): OidcProviderCustomStylesPlaceholderInput {
        this.confirmPassword = confirmPassword
        return this
    }

    fun verfiyCode(verfiyCode: String): OidcProviderCustomStylesPlaceholderInput {
        this.verfiyCode = verfiyCode
        return this
    }

    fun newPassword(newPassword: String): OidcProviderCustomStylesPlaceholderInput {
        this.newPassword = newPassword
        return this
    }

    fun phone(phone: String): OidcProviderCustomStylesPlaceholderInput {
        this.phone = phone
        return this
    }

    fun phoneCode(phoneCode: String): OidcProviderCustomStylesPlaceholderInput {
        this.phoneCode = phoneCode
        return this
    }

    fun build(): OidcProviderCustomStylesPlaceholderInput {
        return this
    }
}

data class OidcProviderCustomStylesQrcodeScanningInput(
        @SerializedName("redirect")
        var redirect: Boolean? = null,
        @SerializedName("interval")
        var interval: Int? = null,
        @SerializedName("tips")
        var tips: String? = null
) {

    fun redirect(redirect: Boolean): OidcProviderCustomStylesQrcodeScanningInput {
        this.redirect = redirect
        return this
    }

    fun interval(interval: Int): OidcProviderCustomStylesQrcodeScanningInput {
        this.interval = interval
        return this
    }

    fun tips(tips: String): OidcProviderCustomStylesQrcodeScanningInput {
        this.tips = tips
        return this
    }

    fun build(): OidcProviderCustomStylesQrcodeScanningInput {
        return this
    }
}

data class AssertionMapInputTypeInput(
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("nickname")
        var nickname: String? = null,
        @SerializedName("photo")
        var photo: String? = null,
        @SerializedName("company")
        var company: String? = null,
        @SerializedName("providerName")
        var providerName: String? = null,
        @SerializedName("email")
        var email: String? = null
) {

    fun username(username: String): AssertionMapInputTypeInput {
        this.username = username
        return this
    }

    fun nickname(nickname: String): AssertionMapInputTypeInput {
        this.nickname = nickname
        return this
    }

    fun photo(photo: String): AssertionMapInputTypeInput {
        this.photo = photo
        return this
    }

    fun company(company: String): AssertionMapInputTypeInput {
        this.company = company
        return this
    }

    fun providerName(providerName: String): AssertionMapInputTypeInput {
        this.providerName = providerName
        return this
    }

    fun email(email: String): AssertionMapInputTypeInput {
        this.email = email
        return this
    }

    fun build(): AssertionMapInputTypeInput {
        return this
    }
}

data class AssertionConsumeServiceInputTypeInput(
        @SerializedName("binding")
        var binding: String? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("isDefault")
        var isDefault: Boolean? = null
) {

    fun binding(binding: String): AssertionConsumeServiceInputTypeInput {
        this.binding = binding
        return this
    }

    fun url(url: String): AssertionConsumeServiceInputTypeInput {
        this.url = url
        return this
    }

    fun isDefault(isDefault: Boolean): AssertionConsumeServiceInputTypeInput {
        this.isDefault = isDefault
        return this
    }

    fun build(): AssertionConsumeServiceInputTypeInput {
        return this
    }
}

data class UserAuthorizedApp(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("appId")
        var appId: String? = null,
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("scope")
        var scope: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("isRevoked")
        var isRevoked: String? = null,
        @SerializedName("when")
        var _when: String? = null
)

data class PricingFieldsInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("type")
        var type: String? = null,
        @SerializedName("startNumber")
        var startNumber: Int? = null,
        @SerializedName("freeNumber")
        var freeNumber: Int? = null,
        @SerializedName("startPrice")
        var startPrice: Int? = null,
        @SerializedName("maxNumber")
        var maxNumber: Int? = null,
        @SerializedName("d")
        var d: Int? = null,
        @SerializedName("features")
        var features: List<String>? = null
) {

    fun _id(_id: String): PricingFieldsInput {
        this._id = _id
        return this
    }

    fun type(type: String): PricingFieldsInput {
        this.type = type
        return this
    }

    fun startNumber(startNumber: Int): PricingFieldsInput {
        this.startNumber = startNumber
        return this
    }

    fun freeNumber(freeNumber: Int): PricingFieldsInput {
        this.freeNumber = freeNumber
        return this
    }

    fun startPrice(startPrice: Int): PricingFieldsInput {
        this.startPrice = startPrice
        return this
    }

    fun maxNumber(maxNumber: Int): PricingFieldsInput {
        this.maxNumber = maxNumber
        return this
    }

    fun d(d: Int): PricingFieldsInput {
        this.d = d
        return this
    }

    fun features(features: List<String>): PricingFieldsInput {
        this.features = features
        return this
    }

    fun build(): PricingFieldsInput {
        return this
    }
}

data class OrderAddInput(
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("pricing")
        var pricing: String? = null,
        @SerializedName("flowNumber")
        var flowNumber: Int? = null,
        @SerializedName("price")
        var price: Float? = null,
        @SerializedName("timeOfPurchase")
        var timeOfPurchase: Int? = null
) {

    fun user(user: String): OrderAddInput {
        this.user = user
        return this
    }

    fun client(client: String): OrderAddInput {
        this.client = client
        return this
    }

    fun pricing(pricing: String): OrderAddInput {
        this.pricing = pricing
        return this
    }

    fun flowNumber(flowNumber: Int): OrderAddInput {
        this.flowNumber = flowNumber
        return this
    }

    fun price(price: Float): OrderAddInput {
        this.price = price
        return this
    }

    fun timeOfPurchase(timeOfPurchase: Int): OrderAddInput {
        this.timeOfPurchase = timeOfPurchase
        return this
    }

    fun build(): OrderAddInput {
        return this
    }
}

data class OrderSuccess(
        @SerializedName("code")
        var code: Int? = null,
        @SerializedName("url")
        var url: String? = null,
        @SerializedName("charge")
        var charge: String? = null
)

data class UserRegisterInput(
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("unionid")
        var unionid: String? = null,
        @SerializedName("openid")
        var openid: String? = null,
        @SerializedName("phone")
        var phone: String? = null,
        @SerializedName("phoneCode")
        var phoneCode: String? = null,
        @SerializedName("password")
        var password: String? = null,
        @SerializedName("salt")
        var salt: String? = null,
        @SerializedName("forceLogin")
        var forceLogin: Boolean? = null,
        @SerializedName("lastIP")
        var lastIP: String? = null,
        @SerializedName("registerInClient")
        var registerInClient: String? = null,
        @SerializedName("registerMethod")
        var registerMethod: String? = null,
        @SerializedName("oauth")
        var oauth: String? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("nickname")
        var nickname: String? = null,
        @SerializedName("company")
        var company: String? = null,
        @SerializedName("photo")
        var photo: String? = null,
        @SerializedName("device")
        var device: String? = null,
        @SerializedName("browser")
        var browser: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("givenName")
        var givenName: String? = null,
        @SerializedName("familyName")
        var familyName: String? = null,
        @SerializedName("middleName")
        var middleName: String? = null,
        @SerializedName("profile")
        var profile: String? = null,
        @SerializedName("preferredUsername")
        var preferredUsername: String? = null,
        @SerializedName("website")
        var website: String? = null,
        @SerializedName("gender")
        var gender: String? = null,
        @SerializedName("birthdate")
        var birthdate: String? = null,
        @SerializedName("zoneinfo")
        var zoneinfo: String? = null,
        @SerializedName("locale")
        var locale: String? = null,
        @SerializedName("address")
        var address: String? = null,
        @SerializedName("formatted")
        var formatted: String? = null,
        @SerializedName("streetAddress")
        var streetAddress: String? = null,
        @SerializedName("locality")
        var locality: String? = null,
        @SerializedName("region")
        var region: String? = null,
        @SerializedName("postalCode")
        var postalCode: String? = null,
        @SerializedName("country")
        var country: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("signedUp")
        var signedUp: String? = null,
        @SerializedName("lastLogin")
        var lastLogin: String? = null
) {

    fun email(email: String): UserRegisterInput {
        this.email = email
        return this
    }

    fun unionid(unionid: String): UserRegisterInput {
        this.unionid = unionid
        return this
    }

    fun openid(openid: String): UserRegisterInput {
        this.openid = openid
        return this
    }

    fun phone(phone: String): UserRegisterInput {
        this.phone = phone
        return this
    }

    fun phoneCode(phoneCode: String): UserRegisterInput {
        this.phoneCode = phoneCode
        return this
    }

    fun password(password: String): UserRegisterInput {
        this.password = password
        return this
    }

    fun salt(salt: String): UserRegisterInput {
        this.salt = salt
        return this
    }

    fun forceLogin(forceLogin: Boolean): UserRegisterInput {
        this.forceLogin = forceLogin
        return this
    }

    fun lastIP(lastIP: String): UserRegisterInput {
        this.lastIP = lastIP
        return this
    }

    fun registerInClient(registerInClient: String): UserRegisterInput {
        this.registerInClient = registerInClient
        return this
    }

    fun registerMethod(registerMethod: String): UserRegisterInput {
        this.registerMethod = registerMethod
        return this
    }

    fun oauth(oauth: String): UserRegisterInput {
        this.oauth = oauth
        return this
    }

    fun username(username: String): UserRegisterInput {
        this.username = username
        return this
    }

    fun nickname(nickname: String): UserRegisterInput {
        this.nickname = nickname
        return this
    }

    fun company(company: String): UserRegisterInput {
        this.company = company
        return this
    }

    fun photo(photo: String): UserRegisterInput {
        this.photo = photo
        return this
    }

    fun device(device: String): UserRegisterInput {
        this.device = device
        return this
    }

    fun browser(browser: String): UserRegisterInput {
        this.browser = browser
        return this
    }

    fun name(name: String): UserRegisterInput {
        this.name = name
        return this
    }

    fun givenName(givenName: String): UserRegisterInput {
        this.givenName = givenName
        return this
    }

    fun familyName(familyName: String): UserRegisterInput {
        this.familyName = familyName
        return this
    }

    fun middleName(middleName: String): UserRegisterInput {
        this.middleName = middleName
        return this
    }

    fun profile(profile: String): UserRegisterInput {
        this.profile = profile
        return this
    }

    fun preferredUsername(preferredUsername: String): UserRegisterInput {
        this.preferredUsername = preferredUsername
        return this
    }

    fun website(website: String): UserRegisterInput {
        this.website = website
        return this
    }

    fun gender(gender: String): UserRegisterInput {
        this.gender = gender
        return this
    }

    fun birthdate(birthdate: String): UserRegisterInput {
        this.birthdate = birthdate
        return this
    }

    fun zoneinfo(zoneinfo: String): UserRegisterInput {
        this.zoneinfo = zoneinfo
        return this
    }

    fun locale(locale: String): UserRegisterInput {
        this.locale = locale
        return this
    }

    fun address(address: String): UserRegisterInput {
        this.address = address
        return this
    }

    fun formatted(formatted: String): UserRegisterInput {
        this.formatted = formatted
        return this
    }

    fun streetAddress(streetAddress: String): UserRegisterInput {
        this.streetAddress = streetAddress
        return this
    }

    fun locality(locality: String): UserRegisterInput {
        this.locality = locality
        return this
    }

    fun region(region: String): UserRegisterInput {
        this.region = region
        return this
    }

    fun postalCode(postalCode: String): UserRegisterInput {
        this.postalCode = postalCode
        return this
    }

    fun country(country: String): UserRegisterInput {
        this.country = country
        return this
    }

    fun updatedAt(updatedAt: String): UserRegisterInput {
        this.updatedAt = updatedAt
        return this
    }

    fun signedUp(signedUp: String): UserRegisterInput {
        this.signedUp = signedUp
        return this
    }

    fun lastLogin(lastLogin: String): UserRegisterInput {
        this.lastLogin = lastLogin
        return this
    }

    fun build(): UserRegisterInput {
        return this
    }
}

data class UserUpdateInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("unionid")
        var unionid: String? = null,
        @SerializedName("openid")
        var openid: String? = null,
        @SerializedName("emailVerified")
        var emailVerified: Boolean? = null,
        @SerializedName("phone")
        var phone: String? = null,
        @SerializedName("phoneVerified")
        var phoneVerified: Boolean? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("nickname")
        var nickname: String? = null,
        @SerializedName("company")
        var company: String? = null,
        @SerializedName("photo")
        var photo: String? = null,
        @SerializedName("browser")
        var browser: String? = null,
        @SerializedName("device")
        var device: String? = null,
        @SerializedName("password")
        var password: String? = null,
        @SerializedName("registerInClient")
        var registerInClient: String? = null,
        @SerializedName("registerMethod")
        var registerMethod: String? = null,
        @SerializedName("oauth")
        var oauth: String? = null,
        @SerializedName("token")
        var token: String? = null,
        @SerializedName("tokenExpiredAt")
        var tokenExpiredAt: String? = null,
        @SerializedName("loginsCount")
        var loginsCount: Int? = null,
        @SerializedName("lastLogin")
        var lastLogin: String? = null,
        @SerializedName("lastIP")
        var lastIP: String? = null,
        @SerializedName("signedUp")
        var signedUp: String? = null,
        @SerializedName("blocked")
        var blocked: Boolean? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("givenName")
        var givenName: String? = null,
        @SerializedName("familyName")
        var familyName: String? = null,
        @SerializedName("middleName")
        var middleName: String? = null,
        @SerializedName("profile")
        var profile: String? = null,
        @SerializedName("preferredUsername")
        var preferredUsername: String? = null,
        @SerializedName("website")
        var website: String? = null,
        @SerializedName("gender")
        var gender: String? = null,
        @SerializedName("birthdate")
        var birthdate: String? = null,
        @SerializedName("zoneinfo")
        var zoneinfo: String? = null,
        @SerializedName("locale")
        var locale: String? = null,
        @SerializedName("address")
        var address: String? = null,
        @SerializedName("formatted")
        var formatted: String? = null,
        @SerializedName("streetAddress")
        var streetAddress: String? = null,
        @SerializedName("locality")
        var locality: String? = null,
        @SerializedName("region")
        var region: String? = null,
        @SerializedName("postalCode")
        var postalCode: String? = null,
        @SerializedName("country")
        var country: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("oldPassword")
        var oldPassword: String? = null
) {

    fun _id(_id: String): UserUpdateInput {
        this._id = _id
        return this
    }

    fun email(email: String): UserUpdateInput {
        this.email = email
        return this
    }

    fun unionid(unionid: String): UserUpdateInput {
        this.unionid = unionid
        return this
    }

    fun openid(openid: String): UserUpdateInput {
        this.openid = openid
        return this
    }

    fun emailVerified(emailVerified: Boolean): UserUpdateInput {
        this.emailVerified = emailVerified
        return this
    }

    fun phone(phone: String): UserUpdateInput {
        this.phone = phone
        return this
    }

    fun phoneVerified(phoneVerified: Boolean): UserUpdateInput {
        this.phoneVerified = phoneVerified
        return this
    }

    fun username(username: String): UserUpdateInput {
        this.username = username
        return this
    }

    fun nickname(nickname: String): UserUpdateInput {
        this.nickname = nickname
        return this
    }

    fun company(company: String): UserUpdateInput {
        this.company = company
        return this
    }

    fun photo(photo: String): UserUpdateInput {
        this.photo = photo
        return this
    }

    fun browser(browser: String): UserUpdateInput {
        this.browser = browser
        return this
    }

    fun device(device: String): UserUpdateInput {
        this.device = device
        return this
    }

    fun password(password: String): UserUpdateInput {
        this.password = password
        return this
    }

    fun registerInClient(registerInClient: String): UserUpdateInput {
        this.registerInClient = registerInClient
        return this
    }

    fun registerMethod(registerMethod: String): UserUpdateInput {
        this.registerMethod = registerMethod
        return this
    }

    fun oauth(oauth: String): UserUpdateInput {
        this.oauth = oauth
        return this
    }

    fun token(token: String): UserUpdateInput {
        this.token = token
        return this
    }

    fun tokenExpiredAt(tokenExpiredAt: String): UserUpdateInput {
        this.tokenExpiredAt = tokenExpiredAt
        return this
    }

    fun loginsCount(loginsCount: Int): UserUpdateInput {
        this.loginsCount = loginsCount
        return this
    }

    fun lastLogin(lastLogin: String): UserUpdateInput {
        this.lastLogin = lastLogin
        return this
    }

    fun lastIP(lastIP: String): UserUpdateInput {
        this.lastIP = lastIP
        return this
    }

    fun signedUp(signedUp: String): UserUpdateInput {
        this.signedUp = signedUp
        return this
    }

    fun blocked(blocked: Boolean): UserUpdateInput {
        this.blocked = blocked
        return this
    }

    fun isDeleted(isDeleted: Boolean): UserUpdateInput {
        this.isDeleted = isDeleted
        return this
    }

    fun name(name: String): UserUpdateInput {
        this.name = name
        return this
    }

    fun givenName(givenName: String): UserUpdateInput {
        this.givenName = givenName
        return this
    }

    fun familyName(familyName: String): UserUpdateInput {
        this.familyName = familyName
        return this
    }

    fun middleName(middleName: String): UserUpdateInput {
        this.middleName = middleName
        return this
    }

    fun profile(profile: String): UserUpdateInput {
        this.profile = profile
        return this
    }

    fun preferredUsername(preferredUsername: String): UserUpdateInput {
        this.preferredUsername = preferredUsername
        return this
    }

    fun website(website: String): UserUpdateInput {
        this.website = website
        return this
    }

    fun gender(gender: String): UserUpdateInput {
        this.gender = gender
        return this
    }

    fun birthdate(birthdate: String): UserUpdateInput {
        this.birthdate = birthdate
        return this
    }

    fun zoneinfo(zoneinfo: String): UserUpdateInput {
        this.zoneinfo = zoneinfo
        return this
    }

    fun locale(locale: String): UserUpdateInput {
        this.locale = locale
        return this
    }

    fun address(address: String): UserUpdateInput {
        this.address = address
        return this
    }

    fun formatted(formatted: String): UserUpdateInput {
        this.formatted = formatted
        return this
    }

    fun streetAddress(streetAddress: String): UserUpdateInput {
        this.streetAddress = streetAddress
        return this
    }

    fun locality(locality: String): UserUpdateInput {
        this.locality = locality
        return this
    }

    fun region(region: String): UserUpdateInput {
        this.region = region
        return this
    }

    fun postalCode(postalCode: String): UserUpdateInput {
        this.postalCode = postalCode
        return this
    }

    fun country(country: String): UserUpdateInput {
        this.country = country
        return this
    }

    fun updatedAt(updatedAt: String): UserUpdateInput {
        this.updatedAt = updatedAt
        return this
    }

    fun oldPassword(oldPassword: String): UserUpdateInput {
        this.oldPassword = oldPassword
        return this
    }

    fun build(): UserUpdateInput {
        return this
    }
}

data class NewUserClientInput(
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("logo")
        var logo: String? = null,
        @SerializedName("clientTypeId")
        var clientTypeId: String? = null,
        @SerializedName("userPoolTypeList")
        var userPoolTypeList: List<String>? = null,
        @SerializedName("iamType")
        var iamType: IamType? = null,
        @SerializedName("domain")
        var domain: String? = null
) {

    fun name(name: String): NewUserClientInput {
        this.name = name
        return this
    }

    fun userId(userId: String): NewUserClientInput {
        this.userId = userId
        return this
    }

    fun logo(logo: String): NewUserClientInput {
        this.logo = logo
        return this
    }

    fun clientTypeId(clientTypeId: String): NewUserClientInput {
        this.clientTypeId = clientTypeId
        return this
    }

    fun userPoolTypeList(userPoolTypeList: List<String>): NewUserClientInput {
        this.userPoolTypeList = userPoolTypeList
        return this
    }

    fun iamType(iamType: IamType): NewUserClientInput {
        this.iamType = iamType
        return this
    }

    fun domain(domain: String): NewUserClientInput {
        this.domain = domain
        return this
    }

    fun build(): NewUserClientInput {
        return this
    }
}

data class UpdateUserClientInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("clientType")
        var clientType: String? = null,
        @SerializedName("userPoolTypeList")
        var userPoolTypeList: List<String>? = null,
        @SerializedName("emailVerifiedDefault")
        var emailVerifiedDefault: Boolean? = null,
        @SerializedName("sendWelcomeEmail")
        var sendWelcomeEmail: Boolean? = null,
        @SerializedName("registerDisabled")
        var registerDisabled: Boolean? = null,
        @SerializedName("showWXMPQRCode")
        var showWXMPQRCode: Boolean? = null,
        @SerializedName("useMiniLogin")
        var useMiniLogin: Boolean? = null,
        @SerializedName("useSelfWxapp")
        var useSelfWxapp: Boolean? = null,
        @SerializedName("enableEmail")
        var enableEmail: Boolean? = null,
        @SerializedName("allowedOrigins")
        var allowedOrigins: String? = null,
        @SerializedName("descriptions")
        var descriptions: String? = null,
        @SerializedName("jwtExpired")
        var jwtExpired: Int? = null,
        @SerializedName("secret")
        var secret: String? = null,
        @SerializedName("frequentRegisterCheck")
        var frequentRegisterCheck: FrequentRegisterCheckConfigInput? = null,
        @SerializedName("loginFailCheck")
        var loginFailCheck: LoginFailCheckConfigInput? = null,
        @SerializedName("logo")
        var logo: String? = null,
        @SerializedName("changePhoneStrategy")
        var changePhoneStrategy: ChangePhoneStrategyInput? = null,
        @SerializedName("changeEmailStrategy")
        var changeEmailStrategy: ChangeEmailStrategyInput? = null,
        @SerializedName("qrcodeLoginStrategy")
        var qrcodeLoginStrategy: QrcodeLoginStrategyInput? = null,
        @SerializedName("app2WxappLoginStrategy")
        var app2WxappLoginStrategy: App2WxappLoginStrategyInput? = null
) {

    fun _id(_id: String): UpdateUserClientInput {
        this._id = _id
        return this
    }

    fun name(name: String): UpdateUserClientInput {
        this.name = name
        return this
    }

    fun userId(userId: String): UpdateUserClientInput {
        this.userId = userId
        return this
    }

    fun clientType(clientType: String): UpdateUserClientInput {
        this.clientType = clientType
        return this
    }

    fun userPoolTypeList(userPoolTypeList: List<String>): UpdateUserClientInput {
        this.userPoolTypeList = userPoolTypeList
        return this
    }

    fun emailVerifiedDefault(emailVerifiedDefault: Boolean): UpdateUserClientInput {
        this.emailVerifiedDefault = emailVerifiedDefault
        return this
    }

    fun sendWelcomeEmail(sendWelcomeEmail: Boolean): UpdateUserClientInput {
        this.sendWelcomeEmail = sendWelcomeEmail
        return this
    }

    fun registerDisabled(registerDisabled: Boolean): UpdateUserClientInput {
        this.registerDisabled = registerDisabled
        return this
    }

    fun showWXMPQRCode(showWXMPQRCode: Boolean): UpdateUserClientInput {
        this.showWXMPQRCode = showWXMPQRCode
        return this
    }

    fun useMiniLogin(useMiniLogin: Boolean): UpdateUserClientInput {
        this.useMiniLogin = useMiniLogin
        return this
    }

    fun useSelfWxapp(useSelfWxapp: Boolean): UpdateUserClientInput {
        this.useSelfWxapp = useSelfWxapp
        return this
    }

    fun enableEmail(enableEmail: Boolean): UpdateUserClientInput {
        this.enableEmail = enableEmail
        return this
    }

    fun allowedOrigins(allowedOrigins: String): UpdateUserClientInput {
        this.allowedOrigins = allowedOrigins
        return this
    }

    fun descriptions(descriptions: String): UpdateUserClientInput {
        this.descriptions = descriptions
        return this
    }

    fun jwtExpired(jwtExpired: Int): UpdateUserClientInput {
        this.jwtExpired = jwtExpired
        return this
    }

    fun secret(secret: String): UpdateUserClientInput {
        this.secret = secret
        return this
    }

    fun frequentRegisterCheck(frequentRegisterCheck: FrequentRegisterCheckConfigInput): UpdateUserClientInput {
        this.frequentRegisterCheck = frequentRegisterCheck
        return this
    }

    fun loginFailCheck(loginFailCheck: LoginFailCheckConfigInput): UpdateUserClientInput {
        this.loginFailCheck = loginFailCheck
        return this
    }

    fun logo(logo: String): UpdateUserClientInput {
        this.logo = logo
        return this
    }

    fun changePhoneStrategy(changePhoneStrategy: ChangePhoneStrategyInput): UpdateUserClientInput {
        this.changePhoneStrategy = changePhoneStrategy
        return this
    }

    fun changeEmailStrategy(changeEmailStrategy: ChangeEmailStrategyInput): UpdateUserClientInput {
        this.changeEmailStrategy = changeEmailStrategy
        return this
    }

    fun qrcodeLoginStrategy(qrcodeLoginStrategy: QrcodeLoginStrategyInput): UpdateUserClientInput {
        this.qrcodeLoginStrategy = qrcodeLoginStrategy
        return this
    }

    fun app2WxappLoginStrategy(app2WxappLoginStrategy: App2WxappLoginStrategyInput): UpdateUserClientInput {
        this.app2WxappLoginStrategy = app2WxappLoginStrategy
        return this
    }

    fun build(): UpdateUserClientInput {
        return this
    }
}

data class FrequentRegisterCheckConfigInput(
        @SerializedName("timeInterval")
        var timeInterval: Int? = null,
        @SerializedName("limit")
        var limit: Int? = null,
        @SerializedName("enable")
        var enable: Boolean? = null
) {

    fun timeInterval(timeInterval: Int): FrequentRegisterCheckConfigInput {
        this.timeInterval = timeInterval
        return this
    }

    fun limit(limit: Int): FrequentRegisterCheckConfigInput {
        this.limit = limit
        return this
    }

    fun enable(enable: Boolean): FrequentRegisterCheckConfigInput {
        this.enable = enable
        return this
    }

    fun build(): FrequentRegisterCheckConfigInput {
        return this
    }
}

data class LoginFailCheckConfigInput(
        @SerializedName("timeInterval")
        var timeInterval: Int? = null,
        @SerializedName("limit")
        var limit: Int? = null,
        @SerializedName("enable")
        var enable: Boolean? = null
) {

    fun timeInterval(timeInterval: Int): LoginFailCheckConfigInput {
        this.timeInterval = timeInterval
        return this
    }

    fun limit(limit: Int): LoginFailCheckConfigInput {
        this.limit = limit
        return this
    }

    fun enable(enable: Boolean): LoginFailCheckConfigInput {
        this.enable = enable
        return this
    }

    fun build(): LoginFailCheckConfigInput {
        return this
    }
}

data class ChangePhoneStrategyInput(
        @SerializedName("verifyOldPhone")
        var verifyOldPhone: Boolean? = null
) {

    fun verifyOldPhone(verifyOldPhone: Boolean): ChangePhoneStrategyInput {
        this.verifyOldPhone = verifyOldPhone
        return this
    }

    fun build(): ChangePhoneStrategyInput {
        return this
    }
}

data class ChangeEmailStrategyInput(
        @SerializedName("verifyOldEmail")
        var verifyOldEmail: Boolean? = null
) {

    fun verifyOldEmail(verifyOldEmail: Boolean): ChangeEmailStrategyInput {
        this.verifyOldEmail = verifyOldEmail
        return this
    }

    fun build(): ChangeEmailStrategyInput {
        return this
    }
}

data class QrcodeLoginStrategyInput(
        @SerializedName("qrcodeExpiresAfter")
        var qrcodeExpiresAfter: Int? = null,
        @SerializedName("returnFullUserInfo")
        var returnFullUserInfo: Boolean? = null,
        @SerializedName("allowExchangeUserInfoFromBrowser")
        var allowExchangeUserInfoFromBrowser: Boolean? = null,
        @SerializedName("ticketExpiresAfter")
        var ticketExpiresAfter: Int? = null
) {

    fun qrcodeExpiresAfter(qrcodeExpiresAfter: Int): QrcodeLoginStrategyInput {
        this.qrcodeExpiresAfter = qrcodeExpiresAfter
        return this
    }

    fun returnFullUserInfo(returnFullUserInfo: Boolean): QrcodeLoginStrategyInput {
        this.returnFullUserInfo = returnFullUserInfo
        return this
    }

    fun allowExchangeUserInfoFromBrowser(allowExchangeUserInfoFromBrowser: Boolean): QrcodeLoginStrategyInput {
        this.allowExchangeUserInfoFromBrowser = allowExchangeUserInfoFromBrowser
        return this
    }

    fun ticketExpiresAfter(ticketExpiresAfter: Int): QrcodeLoginStrategyInput {
        this.ticketExpiresAfter = ticketExpiresAfter
        return this
    }

    fun build(): QrcodeLoginStrategyInput {
        return this
    }
}

data class App2WxappLoginStrategyInput(
        @SerializedName("ticketExpriresAfter")
        var ticketExpriresAfter: Int? = null,
        @SerializedName("ticketExchangeUserInfoNeedSecret")
        var ticketExchangeUserInfoNeedSecret: Boolean? = null
) {

    fun ticketExpriresAfter(ticketExpriresAfter: Int): App2WxappLoginStrategyInput {
        this.ticketExpriresAfter = ticketExpriresAfter
        return this
    }

    fun ticketExchangeUserInfoNeedSecret(ticketExchangeUserInfoNeedSecret: Boolean): App2WxappLoginStrategyInput {
        this.ticketExchangeUserInfoNeedSecret = ticketExchangeUserInfoNeedSecret
        return this
    }

    fun build(): App2WxappLoginStrategyInput {
        return this
    }
}

data class InvitationCode(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("code")
        var code: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null
)

data class SuperAdminUpdateInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("password")
        var password: String? = null
) {

    fun _id(_id: String): SuperAdminUpdateInput {
        this._id = _id
        return this
    }

    fun username(username: String): SuperAdminUpdateInput {
        this.username = username
        return this
    }

    fun email(email: String): SuperAdminUpdateInput {
        this.email = email
        return this
    }

    fun password(password: String): SuperAdminUpdateInput {
        this.password = password
        return this
    }

    fun build(): SuperAdminUpdateInput {
        return this
    }
}

data class RefreshToken(
        @SerializedName("token")
        var token: String? = null,
        @SerializedName("iat")
        var iat: Int? = null,
        @SerializedName("exp")
        var exp: Int? = null
)

data class PermissionDescriptorsInputTypeInput(
        @SerializedName("permissionId")
        var permissionId: String? = null,
        @SerializedName("operationAllow")
        var operationAllow: Int? = null
) {

    fun permissionId(permissionId: String): PermissionDescriptorsInputTypeInput {
        this.permissionId = permissionId
        return this
    }

    fun operationAllow(operationAllow: Int): PermissionDescriptorsInputTypeInput {
        this.operationAllow = operationAllow
        return this
    }

    fun build(): PermissionDescriptorsInputTypeInput {
        return this
    }
}

data class EncryptPassword(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("encryptUrl")
        var encryptUrl: String? = null,
        @SerializedName("decryptUrl")
        var decryptUrl: String? = null,
        @SerializedName("client")
        var client: String? = null,
        @SerializedName("user")
        var user: String? = null,
        @SerializedName("logs")
        var logs: String? = null,
        @SerializedName("enable")
        var enable: Boolean? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null,
        @SerializedName("password")
        var password: String? = null
)

data class RefreshAccessTokenData(
        @SerializedName("accessToken")
        var accessToken: String? = null
)

data class RefreshThirdPartyIdentityResult(
        @SerializedName("refreshSuccess")
        var refreshSuccess: Boolean? = null,
        @SerializedName("message")
        var message: String? = null,
        @SerializedName("provider")
        var provider: String? = null,
        @SerializedName("refreshToken")
        var refreshToken: String? = null,
        @SerializedName("accessToken")
        var accessToken: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null
)

data class OidcPasswordModeUserInfo(
        @SerializedName("sub")
        var sub: String? = null,
        @SerializedName("birthdate")
        var birthdate: String? = null,
        @SerializedName("family_name")
        var family_name: String? = null,
        @SerializedName("gender")
        var gender: String? = null,
        @SerializedName("given_name")
        var given_name: String? = null,
        @SerializedName("locale")
        var locale: String? = null,
        @SerializedName("middle_name")
        var middle_name: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("nickname")
        var nickname: String? = null,
        @SerializedName("picture")
        var picture: String? = null,
        @SerializedName("preferred_username")
        var preferred_username: String? = null,
        @SerializedName("profile")
        var profile: String? = null,
        @SerializedName("updated_at")
        var updated_at: String? = null,
        @SerializedName("website")
        var website: String? = null,
        @SerializedName("zoneinfo")
        var zoneinfo: String? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("company")
        var company: String? = null,
        @SerializedName("browser")
        var browser: String? = null,
        @SerializedName("device")
        var device: String? = null,
        @SerializedName("logins_count")
        var logins_count: Int? = null,
        @SerializedName("register_method")
        var register_method: String? = null,
        @SerializedName("blocked")
        var blocked: Boolean? = null,
        @SerializedName("last_ip")
        var last_ip: String? = null,
        @SerializedName("register_in_userpool")
        var register_in_userpool: String? = null,
        @SerializedName("last_login")
        var last_login: String? = null,
        @SerializedName("signed_up")
        var signed_up: String? = null,
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("email_verified")
        var email_verified: Boolean? = null,
        @SerializedName("phone_number")
        var phone_number: String? = null,
        @SerializedName("phone_number_verified")
        var phone_number_verified: Boolean? = null,
        @SerializedName("token")
        var token: String? = null,
        @SerializedName("access_token")
        var access_token: String? = null,
        @SerializedName("id_token")
        var id_token: String? = null,
        @SerializedName("refresh_token")
        var refresh_token: String? = null,
        @SerializedName("expires_in")
        var expires_in: Int? = null,
        @SerializedName("token_type")
        var token_type: String? = null,
        @SerializedName("scope")
        var scope: String? = null
)

data class RefreshedSignInToken(
        @SerializedName("access_token")
        var access_token: String? = null,
        @SerializedName("id_token")
        var id_token: String? = null,
        @SerializedName("refresh_token")
        var refresh_token: String? = null,
        @SerializedName("scope")
        var scope: String? = null,
        @SerializedName("expires_in")
        var expires_in: Int? = null
)

data class CreateRbacPermissionInput(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null
) {

    fun userPoolId(userPoolId: String): CreateRbacPermissionInput {
        this.userPoolId = userPoolId
        return this
    }

    fun name(name: String): CreateRbacPermissionInput {
        this.name = name
        return this
    }

    fun description(description: String): CreateRbacPermissionInput {
        this.description = description
        return this
    }

    fun build(): CreateRbacPermissionInput {
        return this
    }
}

data class UpdateRbacPermissionInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null
) {

    fun _id(_id: String): UpdateRbacPermissionInput {
        this._id = _id
        return this
    }

    fun name(name: String): UpdateRbacPermissionInput {
        this.name = name
        return this
    }

    fun description(description: String): UpdateRbacPermissionInput {
        this.description = description
        return this
    }

    fun build(): UpdateRbacPermissionInput {
        return this
    }
}

data class CreateRbacRoleInput(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null
) {

    fun userPoolId(userPoolId: String): CreateRbacRoleInput {
        this.userPoolId = userPoolId
        return this
    }

    fun name(name: String): CreateRbacRoleInput {
        this.name = name
        return this
    }

    fun description(description: String): CreateRbacRoleInput {
        this.description = description
        return this
    }

    fun build(): CreateRbacRoleInput {
        return this
    }
}

data class UpdateRbacRoleInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null
) {

    fun _id(_id: String): UpdateRbacRoleInput {
        this._id = _id
        return this
    }

    fun name(name: String): UpdateRbacRoleInput {
        this.name = name
        return this
    }

    fun description(description: String): UpdateRbacRoleInput {
        this.description = description
        return this
    }

    fun build(): UpdateRbacRoleInput {
        return this
    }
}

data class CreateRbacGroupInput(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null
) {

    fun userPoolId(userPoolId: String): CreateRbacGroupInput {
        this.userPoolId = userPoolId
        return this
    }

    fun name(name: String): CreateRbacGroupInput {
        this.name = name
        return this
    }

    fun description(description: String): CreateRbacGroupInput {
        this.description = description
        return this
    }

    fun build(): CreateRbacGroupInput {
        return this
    }
}

data class UpdateRbacGroupInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null
) {

    fun _id(_id: String): UpdateRbacGroupInput {
        this._id = _id
        return this
    }

    fun name(name: String): UpdateRbacGroupInput {
        this.name = name
        return this
    }

    fun description(description: String): UpdateRbacGroupInput {
        this.description = description
        return this
    }

    fun build(): UpdateRbacGroupInput {
        return this
    }
}

data class AssignUserToRbacRoleInput(
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("roleId")
        var roleId: String? = null
) {

    fun userId(userId: String): AssignUserToRbacRoleInput {
        this.userId = userId
        return this
    }

    fun roleId(roleId: String): AssignUserToRbacRoleInput {
        this.roleId = roleId
        return this
    }

    fun build(): AssignUserToRbacRoleInput {
        return this
    }
}

data class AssignUserToRbacRoleBatchInput(
        @SerializedName("userIdList")
        var userIdList: List<String>? = null,
        @SerializedName("roleId")
        var roleId: String? = null
) {

    fun userIdList(userIdList: List<String>): AssignUserToRbacRoleBatchInput {
        this.userIdList = userIdList
        return this
    }

    fun roleId(roleId: String): AssignUserToRbacRoleBatchInput {
        this.roleId = roleId
        return this
    }

    fun build(): AssignUserToRbacRoleBatchInput {
        return this
    }
}

data class RevokeRbacRoleFromUserInput(
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("roleId")
        var roleId: String? = null
) {

    fun userId(userId: String): RevokeRbacRoleFromUserInput {
        this.userId = userId
        return this
    }

    fun roleId(roleId: String): RevokeRbacRoleFromUserInput {
        this.roleId = roleId
        return this
    }

    fun build(): RevokeRbacRoleFromUserInput {
        return this
    }
}

data class RevokeRbacRoleFromUserBatchInput(
        @SerializedName("userIdList")
        var userIdList: List<String>? = null,
        @SerializedName("roleId")
        var roleId: String? = null
) {

    fun userIdList(userIdList: List<String>): RevokeRbacRoleFromUserBatchInput {
        this.userIdList = userIdList
        return this
    }

    fun roleId(roleId: String): RevokeRbacRoleFromUserBatchInput {
        this.roleId = roleId
        return this
    }

    fun build(): RevokeRbacRoleFromUserBatchInput {
        return this
    }
}

data class AddPermissionToRbacRoleInput(
        @SerializedName("permissionId")
        var permissionId: String? = null,
        @SerializedName("roleId")
        var roleId: String? = null
) {

    fun permissionId(permissionId: String): AddPermissionToRbacRoleInput {
        this.permissionId = permissionId
        return this
    }

    fun roleId(roleId: String): AddPermissionToRbacRoleInput {
        this.roleId = roleId
        return this
    }

    fun build(): AddPermissionToRbacRoleInput {
        return this
    }
}

data class AddPermissionToRbacRoleBatchInput(
        @SerializedName("permissionIdList")
        var permissionIdList: List<String>? = null,
        @SerializedName("roleId")
        var roleId: String? = null
) {

    fun permissionIdList(permissionIdList: List<String>): AddPermissionToRbacRoleBatchInput {
        this.permissionIdList = permissionIdList
        return this
    }

    fun roleId(roleId: String): AddPermissionToRbacRoleBatchInput {
        this.roleId = roleId
        return this
    }

    fun build(): AddPermissionToRbacRoleBatchInput {
        return this
    }
}

data class RemovePermissionFromRbacRoleInput(
        @SerializedName("permissionId")
        var permissionId: String? = null,
        @SerializedName("roleId")
        var roleId: String? = null
) {

    fun permissionId(permissionId: String): RemovePermissionFromRbacRoleInput {
        this.permissionId = permissionId
        return this
    }

    fun roleId(roleId: String): RemovePermissionFromRbacRoleInput {
        this.roleId = roleId
        return this
    }

    fun build(): RemovePermissionFromRbacRoleInput {
        return this
    }
}

data class RemovePermissionFromRbacRoleBatchInput(
        @SerializedName("permissionIdList")
        var permissionIdList: List<String>? = null,
        @SerializedName("roleId")
        var roleId: String? = null
) {

    fun permissionIdList(permissionIdList: List<String>): RemovePermissionFromRbacRoleBatchInput {
        this.permissionIdList = permissionIdList
        return this
    }

    fun roleId(roleId: String): RemovePermissionFromRbacRoleBatchInput {
        this.roleId = roleId
        return this
    }

    fun build(): RemovePermissionFromRbacRoleBatchInput {
        return this
    }
}

data class AddRoleToRbacGroupInput(
        @SerializedName("roleId")
        var roleId: String? = null,
        @SerializedName("groupId")
        var groupId: String? = null
) {

    fun roleId(roleId: String): AddRoleToRbacGroupInput {
        this.roleId = roleId
        return this
    }

    fun groupId(groupId: String): AddRoleToRbacGroupInput {
        this.groupId = groupId
        return this
    }

    fun build(): AddRoleToRbacGroupInput {
        return this
    }
}

data class AddRoleToRbacGroupBatchInput(
        @SerializedName("roleIdList")
        var roleIdList: List<String>? = null,
        @SerializedName("groupId")
        var groupId: String? = null
) {

    fun roleIdList(roleIdList: List<String>): AddRoleToRbacGroupBatchInput {
        this.roleIdList = roleIdList
        return this
    }

    fun groupId(groupId: String): AddRoleToRbacGroupBatchInput {
        this.groupId = groupId
        return this
    }

    fun build(): AddRoleToRbacGroupBatchInput {
        return this
    }
}

data class RemoveRoleFromRbacGroupInput(
        @SerializedName("roleId")
        var roleId: String? = null,
        @SerializedName("groupId")
        var groupId: String? = null
) {

    fun roleId(roleId: String): RemoveRoleFromRbacGroupInput {
        this.roleId = roleId
        return this
    }

    fun groupId(groupId: String): RemoveRoleFromRbacGroupInput {
        this.groupId = groupId
        return this
    }

    fun build(): RemoveRoleFromRbacGroupInput {
        return this
    }
}

data class RemoveRoleFromRbacGroupBatchInput(
        @SerializedName("roleIdList")
        var roleIdList: List<String>? = null,
        @SerializedName("groupId")
        var groupId: String? = null
) {

    fun roleIdList(roleIdList: List<String>): RemoveRoleFromRbacGroupBatchInput {
        this.roleIdList = roleIdList
        return this
    }

    fun groupId(groupId: String): RemoveRoleFromRbacGroupBatchInput {
        this.groupId = groupId
        return this
    }

    fun build(): RemoveRoleFromRbacGroupBatchInput {
        return this
    }
}

data class AddUserToRbacGroupInput(
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("groupId")
        var groupId: String? = null
) {

    fun userId(userId: String): AddUserToRbacGroupInput {
        this.userId = userId
        return this
    }

    fun groupId(groupId: String): AddUserToRbacGroupInput {
        this.groupId = groupId
        return this
    }

    fun build(): AddUserToRbacGroupInput {
        return this
    }
}

data class AddUserToRbacGroupBatchInput(
        @SerializedName("userIdList")
        var userIdList: List<String>? = null,
        @SerializedName("groupId")
        var groupId: String? = null
) {

    fun userIdList(userIdList: List<String>): AddUserToRbacGroupBatchInput {
        this.userIdList = userIdList
        return this
    }

    fun groupId(groupId: String): AddUserToRbacGroupBatchInput {
        this.groupId = groupId
        return this
    }

    fun build(): AddUserToRbacGroupBatchInput {
        return this
    }
}

data class RemoveUserFromRbacGroupInput(
        @SerializedName("userId")
        var userId: String? = null,
        @SerializedName("groupId")
        var groupId: String? = null
) {

    fun userId(userId: String): RemoveUserFromRbacGroupInput {
        this.userId = userId
        return this
    }

    fun groupId(groupId: String): RemoveUserFromRbacGroupInput {
        this.groupId = groupId
        return this
    }

    fun build(): RemoveUserFromRbacGroupInput {
        return this
    }
}

data class RemoveUserFromRbacGroupBatchInput(
        @SerializedName("userIdList")
        var userIdList: List<String>? = null,
        @SerializedName("groupId")
        var groupId: String? = null
) {

    fun userIdList(userIdList: List<String>): RemoveUserFromRbacGroupBatchInput {
        this.userIdList = userIdList
        return this
    }

    fun groupId(groupId: String): RemoveUserFromRbacGroupBatchInput {
        this.groupId = groupId
        return this
    }

    fun build(): RemoveUserFromRbacGroupBatchInput {
        return this
    }
}

data class CreateOrgInput(
        @SerializedName("rootGroupId")
        var rootGroupId: String? = null,
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("logo")
        var logo: String? = null
) {

    fun rootGroupId(rootGroupId: String): CreateOrgInput {
        this.rootGroupId = rootGroupId
        return this
    }

    fun userPoolId(userPoolId: String): CreateOrgInput {
        this.userPoolId = userPoolId
        return this
    }

    fun logo(logo: String): CreateOrgInput {
        this.logo = logo
        return this
    }

    fun build(): CreateOrgInput {
        return this
    }
}

data class UpdateOrgInput(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("orgId")
        var orgId: String? = null,
        @SerializedName("logo")
        var logo: String? = null
) {

    fun userPoolId(userPoolId: String): UpdateOrgInput {
        this.userPoolId = userPoolId
        return this
    }

    fun orgId(orgId: String): UpdateOrgInput {
        this.orgId = orgId
        return this
    }

    fun logo(logo: String): UpdateOrgInput {
        this.logo = logo
        return this
    }

    fun build(): UpdateOrgInput {
        return this
    }
}

data class AddOrgNodeInput(
        @SerializedName("orgId")
        var orgId: String? = null,
        @SerializedName("groupId")
        var groupId: String? = null,
        @SerializedName("parentGroupId")
        var parentGroupId: String? = null
) {

    fun orgId(orgId: String): AddOrgNodeInput {
        this.orgId = orgId
        return this
    }

    fun groupId(groupId: String): AddOrgNodeInput {
        this.groupId = groupId
        return this
    }

    fun parentGroupId(parentGroupId: String): AddOrgNodeInput {
        this.parentGroupId = parentGroupId
        return this
    }

    fun build(): AddOrgNodeInput {
        return this
    }
}

data class RemoveOrgNodeInput(
        @SerializedName("orgId")
        var orgId: String? = null,
        @SerializedName("groupId")
        var groupId: String? = null
) {

    fun orgId(orgId: String): RemoveOrgNodeInput {
        this.orgId = orgId
        return this
    }

    fun groupId(groupId: String): RemoveOrgNodeInput {
        this.groupId = groupId
        return this
    }

    fun build(): RemoveOrgNodeInput {
        return this
    }
}

data class CreateDingTalkCorpInput(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("corpId")
        var corpId: String? = null,
        @SerializedName("twoWaySynchronizationOn")
        var twoWaySynchronizationOn: Boolean? = null,
        @SerializedName("appkey")
        var appkey: String? = null,
        @SerializedName("secret")
        var secret: String? = null
) {

    fun userPoolId(userPoolId: String): CreateDingTalkCorpInput {
        this.userPoolId = userPoolId
        return this
    }

    fun corpId(corpId: String): CreateDingTalkCorpInput {
        this.corpId = corpId
        return this
    }

    fun twoWaySynchronizationOn(twoWaySynchronizationOn: Boolean): CreateDingTalkCorpInput {
        this.twoWaySynchronizationOn = twoWaySynchronizationOn
        return this
    }

    fun appkey(appkey: String): CreateDingTalkCorpInput {
        this.appkey = appkey
        return this
    }

    fun secret(secret: String): CreateDingTalkCorpInput {
        this.secret = secret
        return this
    }

    fun build(): CreateDingTalkCorpInput {
        return this
    }
}

data class CorpSyncResult(
        @SerializedName("code")
        var code: Int? = null,
        @SerializedName("message")
        var message: String? = null,
        @SerializedName("orgId")
        var orgId: String? = null
)

data class CreateWechatWorkCorpInput(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("corpId")
        var corpId: String? = null,
        @SerializedName("twoWaySynchronizationOn")
        var twoWaySynchronizationOn: Boolean? = null,
        @SerializedName("addressBookSyncHelperSecret")
        var addressBookSyncHelperSecret: String? = null,
        @SerializedName("addressBookSyncHelperToken")
        var addressBookSyncHelperToken: String? = null,
        @SerializedName("addressBookSyncHelperEncodingAESKey")
        var addressBookSyncHelperEncodingAESKey: String? = null
) {

    fun userPoolId(userPoolId: String): CreateWechatWorkCorpInput {
        this.userPoolId = userPoolId
        return this
    }

    fun corpId(corpId: String): CreateWechatWorkCorpInput {
        this.corpId = corpId
        return this
    }

    fun twoWaySynchronizationOn(twoWaySynchronizationOn: Boolean): CreateWechatWorkCorpInput {
        this.twoWaySynchronizationOn = twoWaySynchronizationOn
        return this
    }

    fun addressBookSyncHelperSecret(addressBookSyncHelperSecret: String): CreateWechatWorkCorpInput {
        this.addressBookSyncHelperSecret = addressBookSyncHelperSecret
        return this
    }

    fun addressBookSyncHelperToken(addressBookSyncHelperToken: String): CreateWechatWorkCorpInput {
        this.addressBookSyncHelperToken = addressBookSyncHelperToken
        return this
    }

    fun addressBookSyncHelperEncodingAESKey(addressBookSyncHelperEncodingAESKey: String): CreateWechatWorkCorpInput {
        this.addressBookSyncHelperEncodingAESKey = addressBookSyncHelperEncodingAESKey
        return this
    }

    fun build(): CreateWechatWorkCorpInput {
        return this
    }
}

data class CreateRuleInput(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("type")
        var type: RuleTypes? = null,
        @SerializedName("code")
        var code: String? = null,
        @SerializedName("async")
        var async: Boolean? = null
) {

    fun userPoolId(userPoolId: String): CreateRuleInput {
        this.userPoolId = userPoolId
        return this
    }

    fun name(name: String): CreateRuleInput {
        this.name = name
        return this
    }

    fun description(description: String): CreateRuleInput {
        this.description = description
        return this
    }

    fun type(type: RuleTypes): CreateRuleInput {
        this.type = type
        return this
    }

    fun code(code: String): CreateRuleInput {
        this.code = code
        return this
    }

    fun async(async: Boolean): CreateRuleInput {
        this.async = async
        return this
    }

    fun build(): CreateRuleInput {
        return this
    }
}

data class UpdateRuleInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("type")
        var type: RuleTypes? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("code")
        var code: String? = null,
        @SerializedName("async")
        var async: Boolean? = null
) {

    fun _id(_id: String): UpdateRuleInput {
        this._id = _id
        return this
    }

    fun name(name: String): UpdateRuleInput {
        this.name = name
        return this
    }

    fun description(description: String): UpdateRuleInput {
        this.description = description
        return this
    }

    fun type(type: RuleTypes): UpdateRuleInput {
        this.type = type
        return this
    }

    fun enabled(enabled: Boolean): UpdateRuleInput {
        this.enabled = enabled
        return this
    }

    fun code(code: String): UpdateRuleInput {
        this.code = code
        return this
    }

    fun async(async: Boolean): UpdateRuleInput {
        this.async = async
        return this
    }

    fun build(): UpdateRuleInput {
        return this
    }
}

data class SetRuleEnvInput(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("key")
        var key: String? = null,
        @SerializedName("value")
        var value: String? = null
) {

    fun userPoolId(userPoolId: String): SetRuleEnvInput {
        this.userPoolId = userPoolId
        return this
    }

    fun key(key: String): SetRuleEnvInput {
        this.key = key
        return this
    }

    fun value(value: String): SetRuleEnvInput {
        this.value = value
        return this
    }

    fun build(): SetRuleEnvInput {
        return this
    }
}

data class RemoveRuleEnvInput(
        @SerializedName("userPoolId")
        var userPoolId: String? = null,
        @SerializedName("key")
        var key: String? = null
) {

    fun userPoolId(userPoolId: String): RemoveRuleEnvInput {
        this.userPoolId = userPoolId
        return this
    }

    fun key(key: String): RemoveRuleEnvInput {
        this.key = key
        return this
    }

    fun build(): RemoveRuleEnvInput {
        return this
    }
}

data class UpdateRuleOrderInput(
        @SerializedName("list")
        var list: List<UpdateRuleOrderItemInput>? = null
) {

    fun list(list: List<UpdateRuleOrderItemInput>): UpdateRuleOrderInput {
        this.list = list
        return this
    }

    fun build(): UpdateRuleOrderInput {
        return this
    }
}

data class UpdateRuleOrderItemInput(
        @SerializedName("id")
        var id: String? = null,
        @SerializedName("order")
        var order: Int? = null
) {

    fun id(id: String): UpdateRuleOrderItemInput {
        this.id = id
        return this
    }

    fun order(order: Int): UpdateRuleOrderItemInput {
        this.order = order
        return this
    }

    fun build(): UpdateRuleOrderItemInput {
        return this
    }
}

data class SetUserMetadataInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("key")
        var key: String? = null,
        @SerializedName("value")
        var value: String? = null
) {

    fun _id(_id: String): SetUserMetadataInput {
        this._id = _id
        return this
    }

    fun key(key: String): SetUserMetadataInput {
        this.key = key
        return this
    }

    fun value(value: String): SetUserMetadataInput {
        this.value = value
        return this
    }

    fun build(): SetUserMetadataInput {
        return this
    }
}

data class RemoveUserMetadataInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("key")
        var key: String? = null
) {

    fun _id(_id: String): RemoveUserMetadataInput {
        this._id = _id
        return this
    }

    fun key(key: String): RemoveUserMetadataInput {
        this.key = key
        return this
    }

    fun build(): RemoveUserMetadataInput {
        return this
    }
}

data class AuthenticationContextInput(
        @SerializedName("protocol")
        var protocol: String? = null,
        @SerializedName("connection")
        var connection: String? = null,
        @SerializedName("ldapConfiguration")
        var ldapConfiguration: LdapConfigurationInput? = null
) {

    fun protocol(protocol: String): AuthenticationContextInput {
        this.protocol = protocol
        return this
    }

    fun connection(connection: String): AuthenticationContextInput {
        this.connection = connection
        return this
    }

    fun ldapConfiguration(ldapConfiguration: LdapConfigurationInput): AuthenticationContextInput {
        this.ldapConfiguration = ldapConfiguration
        return this
    }

    fun build(): AuthenticationContextInput {
        return this
    }
}

data class LdapConfigurationInput(
        @SerializedName("_id")
        var _id: String? = null,
        @SerializedName("enabled")
        var enabled: Boolean? = null,
        @SerializedName("isDeleted")
        var isDeleted: Boolean? = null,
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("ldapLink")
        var ldapLink: String? = null,
        @SerializedName("baseDN")
        var baseDN: String? = null,
        @SerializedName("searchStandard")
        var searchStandard: String? = null,
        @SerializedName("username")
        var username: String? = null,
        @SerializedName("description")
        var description: String? = null,
        @SerializedName("createdAt")
        var createdAt: String? = null,
        @SerializedName("updatedAt")
        var updatedAt: String? = null
) {

    fun _id(_id: String): LdapConfigurationInput {
        this._id = _id
        return this
    }

    fun enabled(enabled: Boolean): LdapConfigurationInput {
        this.enabled = enabled
        return this
    }

    fun isDeleted(isDeleted: Boolean): LdapConfigurationInput {
        this.isDeleted = isDeleted
        return this
    }

    fun name(name: String): LdapConfigurationInput {
        this.name = name
        return this
    }

    fun ldapLink(ldapLink: String): LdapConfigurationInput {
        this.ldapLink = ldapLink
        return this
    }

    fun baseDN(baseDN: String): LdapConfigurationInput {
        this.baseDN = baseDN
        return this
    }

    fun searchStandard(searchStandard: String): LdapConfigurationInput {
        this.searchStandard = searchStandard
        return this
    }

    fun username(username: String): LdapConfigurationInput {
        this.username = username
        return this
    }

    fun description(description: String): LdapConfigurationInput {
        this.description = description
        return this
    }

    fun createdAt(createdAt: String): LdapConfigurationInput {
        this.createdAt = createdAt
        return this
    }

    fun updatedAt(updatedAt: String): LdapConfigurationInput {
        this.updatedAt = updatedAt
        return this
    }

    fun build(): LdapConfigurationInput {
        return this
    }
}

data class DeleteOrgInput(
        @SerializedName("_id")
        var _id: String? = null
) {

    fun _id(_id: String): DeleteOrgInput {
        this._id = _id
        return this
    }

    fun build(): DeleteOrgInput {
        return this
    }
}

data class DeleteRbacGroupBatchResult(
        @SerializedName("success")
        var success: Boolean? = null,
        @SerializedName("requestCount")
        var requestCount: Int? = null,
        @SerializedName("deletedCount")
        var deletedCount: Int? = null
)

data class DeleteRbacRoleBatchResult(
        @SerializedName("success")
        var success: Boolean? = null,
        @SerializedName("requestCount")
        var requestCount: Int? = null,
        @SerializedName("deletedCount")
        var deletedCount: Int? = null
)

data class DeleteRbacPermissionBatchResult(
        @SerializedName("success")
        var success: Boolean? = null,
        @SerializedName("requestCount")
        var requestCount: Int? = null,
        @SerializedName("deletedCount")
        var deletedCount: Int? = null
)


data class AddEmailProviderResponse(

        @SerializedName("AddEmailProvider")
        val result: EmailProviderList
)

class AddEmailProviderParam(@SerializedName("options")
                            var options: EmailProviderListInput? = null) {

    fun options(options: EmailProviderListInput): AddEmailProviderParam {
        this.options = options
        return this
    }

    fun build(): AddEmailProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addEmailProviderDocument,
                this
        );
    }

    private val addEmailProviderDocument: String = """
mutation AddEmailProvider(${'$'}options: EmailProviderListInput) {
  AddEmailProvider(options: ${'$'}options) {
    _id
    name
    image
    description
    fields {
      label
      type
      placeholder
      help
      value
      options
    }
    client
    user
    status
    provider {
      _id
      name
      image
      description
      client
      user
      status
    }
  }
}
"""
}


data class AddLdapServerResponse(

        @SerializedName("AddLDAPServer")
        val result: LdapSingleServer
)

class AddLdapServerParam(@SerializedName("name")
                         var name: String? = null,
                         @SerializedName("clientId")
                         var clientId: String? = null,
                         @SerializedName("userId")
                         var userId: String? = null,
                         @SerializedName("ldapLink")
                         var ldapLink: String? = null,
                         @SerializedName("baseDN")
                         var baseDN: String? = null,
                         @SerializedName("searchStandard")
                         var searchStandard: String? = null,
                         @SerializedName("username")
                         var username: String? = null,
                         @SerializedName("password")
                         var password: String? = null,
                         @SerializedName("emailPostfix")
                         var emailPostfix: String? = null,
                         @SerializedName("description")
                         var description: String? = null,
                         @SerializedName("enabled")
                         var enabled: Boolean? = null) {

    fun name(name: String): AddLdapServerParam {
        this.name = name
        return this
    }

    fun clientId(clientId: String): AddLdapServerParam {
        this.clientId = clientId
        return this
    }

    fun userId(userId: String): AddLdapServerParam {
        this.userId = userId
        return this
    }

    fun ldapLink(ldapLink: String): AddLdapServerParam {
        this.ldapLink = ldapLink
        return this
    }

    fun baseDN(baseDN: String): AddLdapServerParam {
        this.baseDN = baseDN
        return this
    }

    fun searchStandard(searchStandard: String): AddLdapServerParam {
        this.searchStandard = searchStandard
        return this
    }

    fun username(username: String): AddLdapServerParam {
        this.username = username
        return this
    }

    fun password(password: String): AddLdapServerParam {
        this.password = password
        return this
    }

    fun emailPostfix(emailPostfix: String): AddLdapServerParam {
        this.emailPostfix = emailPostfix
        return this
    }

    fun description(description: String): AddLdapServerParam {
        this.description = description
        return this
    }

    fun enabled(enabled: Boolean): AddLdapServerParam {
        this.enabled = enabled
        return this
    }

    fun build(): AddLdapServerParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addLdapServerDocument,
                this
        );
    }

    private val addLdapServerDocument: String = """
mutation AddLDAPServer(${'$'}name: String!, ${'$'}clientId: String!, ${'$'}userId: String!, ${'$'}ldapLink: String!, ${'$'}baseDN: String!, ${'$'}searchStandard: String!, ${'$'}username: String!, ${'$'}password: String!, ${'$'}emailPostfix: String, ${'$'}description: String, ${'$'}enabled: Boolean) {
  AddLDAPServer(name: ${'$'}name, clientId: ${'$'}clientId, userId: ${'$'}userId, ldapLink: ${'$'}ldapLink, baseDN: ${'$'}baseDN, searchStandard: ${'$'}searchStandard, username: ${'$'}username, password: ${'$'}password, emailPostfix: ${'$'}emailPostfix, description: ${'$'}description, enabled: ${'$'}enabled) {
    _id
    name
    clientId
    userId
    ldapLink
    baseDN
    searchStandard
    emailPostfix
    username
    password
    description
    enabled
    isDeleted
    createdAt
    updatedAt
  }
}
"""
}


data class AddOAuthListResponse(

        @SerializedName("AddOAuthList")
        val result: OAuthList
)

class AddOAuthListParam(@SerializedName("options")
                        var options: OAuthListUpdateInput? = null,
                        @SerializedName("fields")
                        var fields: List<OAuthListFieldsFormUpdateInput>? = null) {

    fun options(options: OAuthListUpdateInput): AddOAuthListParam {
        this.options = options
        return this
    }

    fun fields(fields: List<OAuthListFieldsFormUpdateInput>): AddOAuthListParam {
        this.fields = fields
        return this
    }

    fun build(): AddOAuthListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addOAuthListDocument,
                this
        );
    }

    private val addOAuthListDocument: String = """
mutation AddOAuthList(${'$'}options: OAuthListUpdateInput, ${'$'}fields: [OAuthListFieldsFormUpdateInput]) {
  AddOAuthList(options: ${'$'}options, fields: ${'$'}fields) {
    _id
    name
    alias
    image
    description
    enabled
    url
    client
    user
    oAuthUrl
    wxappLogo
    fields {
      label
      type
      placeholder
      value
      checked
    }
    oauth {
      _id
      name
      alias
      image
      description
      enabled
      url
      client
      user
      oAuthUrl
      wxappLogo
    }
  }
}
"""
}


data class AddSystemPricingResponse(

        @SerializedName("AddSystemPricing")
        val result: PricingList
)

class AddSystemPricingParam(@SerializedName("options")
                            var options: PricingFieldsInput? = null) {

    fun options(options: PricingFieldsInput): AddSystemPricingParam {
        this.options = options
        return this
    }

    fun build(): AddSystemPricingParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addSystemPricingDocument,
                this
        );
    }

    private val addSystemPricingDocument: String = """
mutation AddSystemPricing(${'$'}options: PricingFieldsInput) {
  AddSystemPricing(options: ${'$'}options) {
    _id
    type
    startNumber
    freeNumber
    startPrice
    maxNumber
    d
    features
  }
}
"""
}


data class ClearAvatarSrcResponse(

        @SerializedName("ClearAvatarSrc")
        val result: OAuthList
)

class ClearAvatarSrcParam(@SerializedName("client")
                          var client: String? = null,
                          @SerializedName("oauth")
                          var oauth: String? = null,
                          @SerializedName("user")
                          var user: String? = null) {

    fun client(client: String): ClearAvatarSrcParam {
        this.client = client
        return this
    }

    fun oauth(oauth: String): ClearAvatarSrcParam {
        this.oauth = oauth
        return this
    }

    fun user(user: String): ClearAvatarSrcParam {
        this.user = user
        return this
    }

    fun build(): ClearAvatarSrcParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                clearAvatarSrcDocument,
                this
        );
    }

    private val clearAvatarSrcDocument: String = """
mutation ClearAvatarSrc(${'$'}client: String, ${'$'}oauth: String, ${'$'}user: String) {
  ClearAvatarSrc(client: ${'$'}client, oauth: ${'$'}oauth, user: ${'$'}user) {
    _id
    name
    alias
    image
    description
    enabled
    url
    client
    user
    oAuthUrl
    wxappLogo
    fields {
      label
      type
      placeholder
      value
      checked
    }
    oauth {
      _id
      name
      alias
      image
      description
      enabled
      url
      client
      user
      oAuthUrl
      wxappLogo
    }
  }
}
"""
}


data class ContinuePayResponse(

        @SerializedName("ContinuePay")
        val result: OrderSuccess
)

class ContinuePayParam(@SerializedName("order")
                       var order: String? = null) {

    fun order(order: String): ContinuePayParam {
        this.order = order
        return this
    }

    fun build(): ContinuePayParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                continuePayDocument,
                this
        );
    }

    private val continuePayDocument: String = """
mutation ContinuePay(${'$'}order: String!) {
  ContinuePay(order: ${'$'}order) {
    code
    url
    charge
  }
}
"""
}


data class CreateDefaultSamlIdentityProviderSettingsResponse(

        @SerializedName("CreateDefaultSAMLIdentityProviderSettings")
        val result: SamlDefaultIdentityProviderSettings
)

class CreateDefaultSamlIdentityProviderSettingsParam(@SerializedName("name")
                                                     var name: String? = null,
                                                     @SerializedName("image")
                                                     var image: String? = null,
                                                     @SerializedName("description")
                                                     var description: String? = null,
                                                     @SerializedName("mappings")
                                                     var mappings: AssertionMapInputTypeInput? = null) {

    fun name(name: String): CreateDefaultSamlIdentityProviderSettingsParam {
        this.name = name
        return this
    }

    fun image(image: String): CreateDefaultSamlIdentityProviderSettingsParam {
        this.image = image
        return this
    }

    fun description(description: String): CreateDefaultSamlIdentityProviderSettingsParam {
        this.description = description
        return this
    }

    fun mappings(mappings: AssertionMapInputTypeInput): CreateDefaultSamlIdentityProviderSettingsParam {
        this.mappings = mappings
        return this
    }

    fun build(): CreateDefaultSamlIdentityProviderSettingsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createDefaultSamlIdentityProviderSettingsDocument,
                this
        );
    }

    private val createDefaultSamlIdentityProviderSettingsDocument: String = """
mutation CreateDefaultSAMLIdentityProviderSettings(${'$'}name: String!, ${'$'}image: String, ${'$'}description: String, ${'$'}mappings: AssertionMapInputType) {
  CreateDefaultSAMLIdentityProviderSettings(name: ${'$'}name, image: ${'$'}image, description: ${'$'}description, mappings: ${'$'}mappings) {
    _id
    name
    image
    description
    mappings {
      username
      nickname
      photo
      company
      providerName
      email
    }
    isDeleted
  }
}
"""
}


data class CreateOAuthProviderResponse(

        @SerializedName("CreateOAuthProvider")
        val result: OAuthProviderClient
)

class CreateOAuthProviderParam(@SerializedName("name")
                               var name: String? = null,
                               @SerializedName("domain")
                               var domain: String? = null,
                               @SerializedName("redirectUris")
                               var redirectUris: List<String>? = null,
                               @SerializedName("grants")
                               var grants: List<String>? = null,
                               @SerializedName("clientId")
                               var clientId: String? = null,
                               @SerializedName("image")
                               var image: String? = null,
                               @SerializedName("description")
                               var description: String? = null,
                               @SerializedName("homepageURL")
                               var homepageURL: String? = null,
                               @SerializedName("casExpire")
                               var casExpire: Int? = null) {

    fun name(name: String): CreateOAuthProviderParam {
        this.name = name
        return this
    }

    fun domain(domain: String): CreateOAuthProviderParam {
        this.domain = domain
        return this
    }

    fun redirectUris(redirectUris: List<String>): CreateOAuthProviderParam {
        this.redirectUris = redirectUris
        return this
    }

    fun grants(grants: List<String>): CreateOAuthProviderParam {
        this.grants = grants
        return this
    }

    fun clientId(clientId: String): CreateOAuthProviderParam {
        this.clientId = clientId
        return this
    }

    fun image(image: String): CreateOAuthProviderParam {
        this.image = image
        return this
    }

    fun description(description: String): CreateOAuthProviderParam {
        this.description = description
        return this
    }

    fun homepageURL(homepageURL: String): CreateOAuthProviderParam {
        this.homepageURL = homepageURL
        return this
    }

    fun casExpire(casExpire: Int): CreateOAuthProviderParam {
        this.casExpire = casExpire
        return this
    }

    fun build(): CreateOAuthProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createOAuthProviderDocument,
                this
        );
    }

    private val createOAuthProviderDocument: String = """
mutation CreateOAuthProvider(${'$'}name: String!, ${'$'}domain: String!, ${'$'}redirectUris: [String]!, ${'$'}grants: [String!]!, ${'$'}clientId: String, ${'$'}image: String, ${'$'}description: String, ${'$'}homepageURL: String, ${'$'}casExpire: Int) {
  CreateOAuthProvider(name: ${'$'}name, domain: ${'$'}domain, redirectUris: ${'$'}redirectUris, grants: ${'$'}grants, clientId: ${'$'}clientId, image: ${'$'}image, description: ${'$'}description, homepageURL: ${'$'}homepageURL, casExpire: ${'$'}casExpire) {
    _id
    name
    domain
    image
    redirectUris
    appSecret
    client_id
    clientId
    grants
    description
    homepageURL
    isDeleted
    when
    css
    loginUrl
    casExpire
  }
}
"""
}


data class CreateOidcAppResponse(

        @SerializedName("CreateOIDCApp")
        val result: OidcProviderClient
)

class CreateOidcAppParam(@SerializedName("name")
                         var name: String? = null,
                         @SerializedName("domain")
                         var domain: String? = null,
                         @SerializedName("redirect_uris")
                         var redirect_uris: List<String>? = null,
                         @SerializedName("grant_types")
                         var grant_types: List<String>? = null,
                         @SerializedName("response_types")
                         var response_types: List<String>? = null,
                         @SerializedName("clientId")
                         var clientId: String? = null,
                         @SerializedName("client_id")
                         var client_id: String? = null,
                         @SerializedName("token_endpoint_auth_method")
                         var token_endpoint_auth_method: String? = null,
                         @SerializedName("image")
                         var image: String? = null,
                         @SerializedName("isDefault")
                         var isDefault: Boolean? = null,
                         @SerializedName("id_token_signed_response_alg")
                         var id_token_signed_response_alg: String? = null,
                         @SerializedName("id_token_encrypted_response_alg")
                         var id_token_encrypted_response_alg: String? = null,
                         @SerializedName("id_token_encrypted_response_enc")
                         var id_token_encrypted_response_enc: String? = null,
                         @SerializedName("userinfo_signed_response_alg")
                         var userinfo_signed_response_alg: String? = null,
                         @SerializedName("userinfo_encrypted_response_alg")
                         var userinfo_encrypted_response_alg: String? = null,
                         @SerializedName("userinfo_encrypted_response_enc")
                         var userinfo_encrypted_response_enc: String? = null,
                         @SerializedName("request_object_signing_alg")
                         var request_object_signing_alg: String? = null,
                         @SerializedName("request_object_encryption_alg")
                         var request_object_encryption_alg: String? = null,
                         @SerializedName("request_object_encryption_enc")
                         var request_object_encryption_enc: String? = null,
                         @SerializedName("jwks_uri")
                         var jwks_uri: String? = null,
                         @SerializedName("_jwks_uri")
                         var _jwks_uri: String? = null,
                         @SerializedName("jwks")
                         var jwks: String? = null,
                         @SerializedName("_jwks")
                         var _jwks: String? = null,
                         @SerializedName("custom_jwks")
                         var custom_jwks: String? = null,
                         @SerializedName("description")
                         var description: String? = null,
                         @SerializedName("homepageURL")
                         var homepageURL: String? = null,
                         @SerializedName("authorization_code_expire")
                         var authorization_code_expire: String? = null,
                         @SerializedName("id_token_expire")
                         var id_token_expire: String? = null,
                         @SerializedName("access_token_expire")
                         var access_token_expire: String? = null,
                         @SerializedName("cas_expire")
                         var cas_expire: String? = null,
                         @SerializedName("customStyles")
                         var customStyles: OidcProviderCustomStylesInput? = null) {

    fun name(name: String): CreateOidcAppParam {
        this.name = name
        return this
    }

    fun domain(domain: String): CreateOidcAppParam {
        this.domain = domain
        return this
    }

    fun redirect_uris(redirect_uris: List<String>): CreateOidcAppParam {
        this.redirect_uris = redirect_uris
        return this
    }

    fun grant_types(grant_types: List<String>): CreateOidcAppParam {
        this.grant_types = grant_types
        return this
    }

    fun response_types(response_types: List<String>): CreateOidcAppParam {
        this.response_types = response_types
        return this
    }

    fun clientId(clientId: String): CreateOidcAppParam {
        this.clientId = clientId
        return this
    }

    fun client_id(client_id: String): CreateOidcAppParam {
        this.client_id = client_id
        return this
    }

    fun token_endpoint_auth_method(token_endpoint_auth_method: String): CreateOidcAppParam {
        this.token_endpoint_auth_method = token_endpoint_auth_method
        return this
    }

    fun image(image: String): CreateOidcAppParam {
        this.image = image
        return this
    }

    fun isDefault(isDefault: Boolean): CreateOidcAppParam {
        this.isDefault = isDefault
        return this
    }

    fun id_token_signed_response_alg(id_token_signed_response_alg: String): CreateOidcAppParam {
        this.id_token_signed_response_alg = id_token_signed_response_alg
        return this
    }

    fun id_token_encrypted_response_alg(id_token_encrypted_response_alg: String): CreateOidcAppParam {
        this.id_token_encrypted_response_alg = id_token_encrypted_response_alg
        return this
    }

    fun id_token_encrypted_response_enc(id_token_encrypted_response_enc: String): CreateOidcAppParam {
        this.id_token_encrypted_response_enc = id_token_encrypted_response_enc
        return this
    }

    fun userinfo_signed_response_alg(userinfo_signed_response_alg: String): CreateOidcAppParam {
        this.userinfo_signed_response_alg = userinfo_signed_response_alg
        return this
    }

    fun userinfo_encrypted_response_alg(userinfo_encrypted_response_alg: String): CreateOidcAppParam {
        this.userinfo_encrypted_response_alg = userinfo_encrypted_response_alg
        return this
    }

    fun userinfo_encrypted_response_enc(userinfo_encrypted_response_enc: String): CreateOidcAppParam {
        this.userinfo_encrypted_response_enc = userinfo_encrypted_response_enc
        return this
    }

    fun request_object_signing_alg(request_object_signing_alg: String): CreateOidcAppParam {
        this.request_object_signing_alg = request_object_signing_alg
        return this
    }

    fun request_object_encryption_alg(request_object_encryption_alg: String): CreateOidcAppParam {
        this.request_object_encryption_alg = request_object_encryption_alg
        return this
    }

    fun request_object_encryption_enc(request_object_encryption_enc: String): CreateOidcAppParam {
        this.request_object_encryption_enc = request_object_encryption_enc
        return this
    }

    fun jwks_uri(jwks_uri: String): CreateOidcAppParam {
        this.jwks_uri = jwks_uri
        return this
    }

    fun _jwks_uri(_jwks_uri: String): CreateOidcAppParam {
        this._jwks_uri = _jwks_uri
        return this
    }

    fun jwks(jwks: String): CreateOidcAppParam {
        this.jwks = jwks
        return this
    }

    fun _jwks(_jwks: String): CreateOidcAppParam {
        this._jwks = _jwks
        return this
    }

    fun custom_jwks(custom_jwks: String): CreateOidcAppParam {
        this.custom_jwks = custom_jwks
        return this
    }

    fun description(description: String): CreateOidcAppParam {
        this.description = description
        return this
    }

    fun homepageURL(homepageURL: String): CreateOidcAppParam {
        this.homepageURL = homepageURL
        return this
    }

    fun authorization_code_expire(authorization_code_expire: String): CreateOidcAppParam {
        this.authorization_code_expire = authorization_code_expire
        return this
    }

    fun id_token_expire(id_token_expire: String): CreateOidcAppParam {
        this.id_token_expire = id_token_expire
        return this
    }

    fun access_token_expire(access_token_expire: String): CreateOidcAppParam {
        this.access_token_expire = access_token_expire
        return this
    }

    fun cas_expire(cas_expire: String): CreateOidcAppParam {
        this.cas_expire = cas_expire
        return this
    }

    fun customStyles(customStyles: OidcProviderCustomStylesInput): CreateOidcAppParam {
        this.customStyles = customStyles
        return this
    }

    fun build(): CreateOidcAppParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createOidcAppDocument,
                this
        );
    }

    private val createOidcAppDocument: String = """
mutation CreateOIDCApp(${'$'}name: String!, ${'$'}domain: String!, ${'$'}redirect_uris: [String]!, ${'$'}grant_types: [String!]!, ${'$'}response_types: [String!]!, ${'$'}clientId: String, ${'$'}client_id: String, ${'$'}token_endpoint_auth_method: String, ${'$'}image: String, ${'$'}isDefault: Boolean, ${'$'}id_token_signed_response_alg: String, ${'$'}id_token_encrypted_response_alg: String, ${'$'}id_token_encrypted_response_enc: String, ${'$'}userinfo_signed_response_alg: String, ${'$'}userinfo_encrypted_response_alg: String, ${'$'}userinfo_encrypted_response_enc: String, ${'$'}request_object_signing_alg: String, ${'$'}request_object_encryption_alg: String, ${'$'}request_object_encryption_enc: String, ${'$'}jwks_uri: String, ${'$'}_jwks_uri: String, ${'$'}jwks: String, ${'$'}_jwks: String, ${'$'}custom_jwks: String, ${'$'}description: String, ${'$'}homepageURL: String, ${'$'}authorization_code_expire: String, ${'$'}id_token_expire: String, ${'$'}access_token_expire: String, ${'$'}cas_expire: String, ${'$'}customStyles: OIDCProviderCustomStylesInput) {
  CreateOIDCApp(name: ${'$'}name, domain: ${'$'}domain, redirect_uris: ${'$'}redirect_uris, grant_types: ${'$'}grant_types, response_types: ${'$'}response_types, clientId: ${'$'}clientId, client_id: ${'$'}client_id, token_endpoint_auth_method: ${'$'}token_endpoint_auth_method, image: ${'$'}image, isDefault: ${'$'}isDefault, id_token_signed_response_alg: ${'$'}id_token_signed_response_alg, id_token_encrypted_response_alg: ${'$'}id_token_encrypted_response_alg, id_token_encrypted_response_enc: ${'$'}id_token_encrypted_response_enc, userinfo_signed_response_alg: ${'$'}userinfo_signed_response_alg, userinfo_encrypted_response_alg: ${'$'}userinfo_encrypted_response_alg, userinfo_encrypted_response_enc: ${'$'}userinfo_encrypted_response_enc, request_object_signing_alg: ${'$'}request_object_signing_alg, request_object_encryption_alg: ${'$'}request_object_encryption_alg, request_object_encryption_enc: ${'$'}request_object_encryption_enc, jwks_uri: ${'$'}jwks_uri, _jwks_uri: ${'$'}_jwks_uri, jwks: ${'$'}jwks, _jwks: ${'$'}_jwks, custom_jwks: ${'$'}custom_jwks, description: ${'$'}description, homepageURL: ${'$'}homepageURL, authorization_code_expire: ${'$'}authorization_code_expire, id_token_expire: ${'$'}id_token_expire, access_token_expire: ${'$'}access_token_expire, cas_expire: ${'$'}cas_expire, customStyles: ${'$'}customStyles) {
    _id
    name
    domain
    image
    redirect_uris
    client_id
    client_secret
    token_endpoint_auth_method
    id_token_signed_response_alg
    id_token_encrypted_response_alg
    id_token_encrypted_response_enc
    userinfo_signed_response_alg
    userinfo_encrypted_response_alg
    userinfo_encrypted_response_enc
    request_object_signing_alg
    request_object_encryption_alg
    request_object_encryption_enc
    jwks_uri
    _jwks_uri
    custom_jwks
    jwks
    _jwks
    clientId
    grant_types
    response_types
    description
    homepageURL
    isDeleted
    isDefault
    when
    css
    authorization_code_expire
    id_token_expire
    access_token_expire
    cas_expire
    loginUrl
    customStyles {
      forceLogin
      hideQRCode
      hideUP
      hideUsername
      hideRegister
      hidePhone
      hideSocial
      hideClose
      hidePhonePassword
      defaultLoginMethod
    }
  }
}
"""
}


data class CreateSamlIdentityProviderResponse(

        @SerializedName("CreateSAMLIdentityProvider")
        val result: SamlIdentityProviderClient
)

class CreateSamlIdentityProviderParam(@SerializedName("name")
                                      var name: String? = null,
                                      @SerializedName("domain")
                                      var domain: String? = null,
                                      @SerializedName("clientId")
                                      var clientId: String? = null,
                                      @SerializedName("image")
                                      var image: String? = null,
                                      @SerializedName("description")
                                      var description: String? = null,
                                      @SerializedName("SPMetadata")
                                      var SPMetadata: String? = null,
                                      @SerializedName("IdPMetadata")
                                      var IdPMetadata: String? = null) {

    fun name(name: String): CreateSamlIdentityProviderParam {
        this.name = name
        return this
    }

    fun domain(domain: String): CreateSamlIdentityProviderParam {
        this.domain = domain
        return this
    }

    fun clientId(clientId: String): CreateSamlIdentityProviderParam {
        this.clientId = clientId
        return this
    }

    fun image(image: String): CreateSamlIdentityProviderParam {
        this.image = image
        return this
    }

    fun description(description: String): CreateSamlIdentityProviderParam {
        this.description = description
        return this
    }

    fun SPMetadata(SPMetadata: String): CreateSamlIdentityProviderParam {
        this.SPMetadata = SPMetadata
        return this
    }

    fun IdPMetadata(IdPMetadata: String): CreateSamlIdentityProviderParam {
        this.IdPMetadata = IdPMetadata
        return this
    }

    fun build(): CreateSamlIdentityProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createSamlIdentityProviderDocument,
                this
        );
    }

    private val createSamlIdentityProviderDocument: String = """
mutation CreateSAMLIdentityProvider(${'$'}name: String!, ${'$'}domain: String!, ${'$'}clientId: String!, ${'$'}image: String, ${'$'}description: String, ${'$'}SPMetadata: String, ${'$'}IdPMetadata: String) {
  CreateSAMLIdentityProvider(name: ${'$'}name, domain: ${'$'}domain, clientId: ${'$'}clientId, image: ${'$'}image, description: ${'$'}description, SPMetadata: ${'$'}SPMetadata, IdPMetadata: ${'$'}IdPMetadata) {
    _id
    name
    domain
    image
    appSecret
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    attributeNameFormat
    customAttributes
    emailDomainTransformation
    authnContextClassRef
    IdPMetadata
    assertionConsumerUrl
    bindings
    nameIds
    attributes
    enableSignRes
    resSignAlgorithm
    resAbstractAlgorithm
    resSignPublicKey
    resSignPrivateKey
    resSignPrivateKeyPass
    enableSignReq
    reqSignPublicKey
    enableEncryptRes
    resEncryptPublicKey
    css
  }
}
"""
}


data class CreateSamlServiceProviderResponse(

        @SerializedName("CreateSAMLServiceProvider")
        val result: SamlServiceProviderClient
)

class CreateSamlServiceProviderParam(@SerializedName("name")
                                     var name: String? = null,
                                     @SerializedName("domain")
                                     var domain: String? = null,
                                     @SerializedName("clientId")
                                     var clientId: String? = null,
                                     @SerializedName("redirectUrl")
                                     var redirectUrl: String? = null,
                                     @SerializedName("description")
                                     var description: String? = null,
                                     @SerializedName("SPMetadata")
                                     var SPMetadata: String? = null,
                                     @SerializedName("IdPMetadata")
                                     var IdPMetadata: String? = null,
                                     @SerializedName("image")
                                     var image: String? = null,
                                     @SerializedName("mappings")
                                     var mappings: AssertionMapInputTypeInput? = null,
                                     @SerializedName("defaultIdPMapId")
                                     var defaultIdPMapId: String? = null) {

    fun name(name: String): CreateSamlServiceProviderParam {
        this.name = name
        return this
    }

    fun domain(domain: String): CreateSamlServiceProviderParam {
        this.domain = domain
        return this
    }

    fun clientId(clientId: String): CreateSamlServiceProviderParam {
        this.clientId = clientId
        return this
    }

    fun redirectUrl(redirectUrl: String): CreateSamlServiceProviderParam {
        this.redirectUrl = redirectUrl
        return this
    }

    fun description(description: String): CreateSamlServiceProviderParam {
        this.description = description
        return this
    }

    fun SPMetadata(SPMetadata: String): CreateSamlServiceProviderParam {
        this.SPMetadata = SPMetadata
        return this
    }

    fun IdPMetadata(IdPMetadata: String): CreateSamlServiceProviderParam {
        this.IdPMetadata = IdPMetadata
        return this
    }

    fun image(image: String): CreateSamlServiceProviderParam {
        this.image = image
        return this
    }

    fun mappings(mappings: AssertionMapInputTypeInput): CreateSamlServiceProviderParam {
        this.mappings = mappings
        return this
    }

    fun defaultIdPMapId(defaultIdPMapId: String): CreateSamlServiceProviderParam {
        this.defaultIdPMapId = defaultIdPMapId
        return this
    }

    fun build(): CreateSamlServiceProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createSamlServiceProviderDocument,
                this
        );
    }

    private val createSamlServiceProviderDocument: String = """
mutation CreateSAMLServiceProvider(${'$'}name: String!, ${'$'}domain: String!, ${'$'}clientId: String!, ${'$'}redirectUrl: String!, ${'$'}description: String, ${'$'}SPMetadata: String, ${'$'}IdPMetadata: String, ${'$'}image: String, ${'$'}mappings: AssertionMapInputType, ${'$'}defaultIdPMapId: String) {
  CreateSAMLServiceProvider(name: ${'$'}name, domain: ${'$'}domain, clientId: ${'$'}clientId, redirectUrl: ${'$'}redirectUrl, description: ${'$'}description, SPMetadata: ${'$'}SPMetadata, IdPMetadata: ${'$'}IdPMetadata, image: ${'$'}image, mappings: ${'$'}mappings, defaultIdPMapId: ${'$'}defaultIdPMapId) {
    _id
    name
    domain
    image
    appSecret
    defaultIdPMap {
      _id
      name
      image
      description
      isDeleted
    }
    defaultIdPMapId
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    IdPMetadata
    IdPEntityID
    assertionConsumeService {
      binding
      url
      isDefault
    }
    mappings {
      username
      nickname
      photo
      company
      providerName
      email
    }
    redirectUrl
    loginUrl
    logoutUrl
    nameId
    enableSignRes
    resSignPublicKey
    hasResEncrypted
    resEncryptAlgorithm
    resAbstractAlgorithm
    resDecryptPrivateKey
    resDecryptPrivateKeyPass
    resEncryptPublicKey
    enableSignReq
    reqSignAlgorithm
    reqAbstractAlgorithm
    reqSignPrivateKey
    reqSignPrivateKeyPass
    reqSignPublicKey
    SPUrl
  }
}
"""
}


data class EnableSamlIdentityProviderResponse(

        @SerializedName("EnableSAMLIdentityProvider")
        val result: SamlIdentityProviderClient
)

class EnableSamlIdentityProviderParam(@SerializedName("appId")
                                      var appId: String? = null,
                                      @SerializedName("clientId")
                                      var clientId: String? = null,
                                      @SerializedName("enabled")
                                      var enabled: Boolean? = null) {

    fun appId(appId: String): EnableSamlIdentityProviderParam {
        this.appId = appId
        return this
    }

    fun clientId(clientId: String): EnableSamlIdentityProviderParam {
        this.clientId = clientId
        return this
    }

    fun enabled(enabled: Boolean): EnableSamlIdentityProviderParam {
        this.enabled = enabled
        return this
    }

    fun build(): EnableSamlIdentityProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                enableSamlIdentityProviderDocument,
                this
        );
    }

    private val enableSamlIdentityProviderDocument: String = """
mutation EnableSAMLIdentityProvider(${'$'}appId: String!, ${'$'}clientId: String!, ${'$'}enabled: Boolean) {
  EnableSAMLIdentityProvider(appId: ${'$'}appId, clientId: ${'$'}clientId, enabled: ${'$'}enabled) {
    _id
    name
    domain
    image
    appSecret
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    attributeNameFormat
    customAttributes
    emailDomainTransformation
    authnContextClassRef
    IdPMetadata
    assertionConsumerUrl
    bindings
    nameIds
    attributes
    enableSignRes
    resSignAlgorithm
    resAbstractAlgorithm
    resSignPublicKey
    resSignPrivateKey
    resSignPrivateKeyPass
    enableSignReq
    reqSignPublicKey
    enableEncryptRes
    resEncryptPublicKey
    css
  }
}
"""
}


data class EnableSamlServiceProviderResponse(

        @SerializedName("EnableSAMLServiceProvider")
        val result: SamlServiceProviderClient
)

class EnableSamlServiceProviderParam(@SerializedName("appId")
                                     var appId: String? = null,
                                     @SerializedName("clientId")
                                     var clientId: String? = null,
                                     @SerializedName("enabled")
                                     var enabled: Boolean? = null) {

    fun appId(appId: String): EnableSamlServiceProviderParam {
        this.appId = appId
        return this
    }

    fun clientId(clientId: String): EnableSamlServiceProviderParam {
        this.clientId = clientId
        return this
    }

    fun enabled(enabled: Boolean): EnableSamlServiceProviderParam {
        this.enabled = enabled
        return this
    }

    fun build(): EnableSamlServiceProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                enableSamlServiceProviderDocument,
                this
        );
    }

    private val enableSamlServiceProviderDocument: String = """
mutation EnableSAMLServiceProvider(${'$'}appId: String!, ${'$'}clientId: String!, ${'$'}enabled: Boolean) {
  EnableSAMLServiceProvider(appId: ${'$'}appId, clientId: ${'$'}clientId, enabled: ${'$'}enabled) {
    _id
    name
    domain
    image
    appSecret
    defaultIdPMap {
      _id
      name
      image
      description
      isDeleted
    }
    defaultIdPMapId
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    IdPMetadata
    IdPEntityID
    assertionConsumeService {
      binding
      url
      isDefault
    }
    mappings {
      username
      nickname
      photo
      company
      providerName
      email
    }
    redirectUrl
    loginUrl
    logoutUrl
    nameId
    enableSignRes
    resSignPublicKey
    hasResEncrypted
    resEncryptAlgorithm
    resAbstractAlgorithm
    resDecryptPrivateKey
    resDecryptPrivateKeyPass
    resEncryptPublicKey
    enableSignReq
    reqSignAlgorithm
    reqAbstractAlgorithm
    reqSignPrivateKey
    reqSignPrivateKeyPass
    reqSignPublicKey
    SPUrl
  }
}
"""
}


data class IncClientFlowNumberResponse(

        @SerializedName("IncClientFlowNumber")
        val result: OrderSuccess
)

class IncClientFlowNumberParam(@SerializedName("user")
                               var user: String? = null,
                               @SerializedName("userInvitied")
                               var userInvitied: String? = null,
                               @SerializedName("client")
                               var client: String? = null,
                               @SerializedName("number")
                               var number: Int? = null) {

    fun user(user: String): IncClientFlowNumberParam {
        this.user = user
        return this
    }

    fun userInvitied(userInvitied: String): IncClientFlowNumberParam {
        this.userInvitied = userInvitied
        return this
    }

    fun client(client: String): IncClientFlowNumberParam {
        this.client = client
        return this
    }

    fun number(number: Int): IncClientFlowNumberParam {
        this.number = number
        return this
    }

    fun build(): IncClientFlowNumberParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                incClientFlowNumberDocument,
                this
        );
    }

    private val incClientFlowNumberDocument: String = """
mutation IncClientFlowNumber(${'$'}user: String, ${'$'}userInvitied: String, ${'$'}client: String, ${'$'}number: Int) {
  IncClientFlowNumber(user: ${'$'}user, userInvitied: ${'$'}userInvitied, client: ${'$'}client, number: ${'$'}number) {
    code
    url
    charge
  }
}
"""
}


data class LoginByLdapResponse(

        @SerializedName("LoginByLDAP")
        val result: User
)

class LoginByLdapParam(@SerializedName("username")
                       var username: String? = null,
                       @SerializedName("password")
                       var password: String? = null,
                       @SerializedName("clientId")
                       var clientId: String? = null,
                       @SerializedName("browser")
                       var browser: String? = null) {

    fun username(username: String): LoginByLdapParam {
        this.username = username
        return this
    }

    fun password(password: String): LoginByLdapParam {
        this.password = password
        return this
    }

    fun clientId(clientId: String): LoginByLdapParam {
        this.clientId = clientId
        return this
    }

    fun browser(browser: String): LoginByLdapParam {
        this.browser = browser
        return this
    }

    fun build(): LoginByLdapParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginByLdapDocument,
                this
        );
    }

    private val loginByLdapDocument: String = """
mutation LoginByLDAP(${'$'}username: String!, ${'$'}password: String!, ${'$'}clientId: String!, ${'$'}browser: String) {
  LoginByLDAP(username: ${'$'}username, password: ${'$'}password, clientId: ${'$'}clientId, browser: ${'$'}browser) {
    _id
    username
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    nickname
    company
    photo
    browser
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    device
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    oldPassword
    metadata
  }
}
"""
}


data class RemoveEmailProviderResponse(

        @SerializedName("RemoveEmailProvider")
        val result: List<EmailProviderList>
)

class RemoveEmailProviderParam(@SerializedName("_ids")
                               var _ids: List<String>? = null) {

    fun _ids(_ids: List<String>): RemoveEmailProviderParam {
        this._ids = _ids
        return this
    }

    fun build(): RemoveEmailProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeEmailProviderDocument,
                this
        );
    }

    private val removeEmailProviderDocument: String = """
mutation RemoveEmailProvider(${'$'}_ids: [String]!) {
  RemoveEmailProvider(_ids: ${'$'}_ids) {
    _id
    name
    image
    description
    fields {
      label
      type
      placeholder
      help
      value
      options
    }
    client
    user
    status
    provider {
      _id
      name
      image
      description
      client
      user
      status
    }
  }
}
"""
}


data class RemoveLdapServerResponse(

        @SerializedName("RemoveLDAPServer")
        val result: LdapSingleServer
)

class RemoveLdapServerParam(@SerializedName("ldapId")
                            var ldapId: String? = null,
                            @SerializedName("clientId")
                            var clientId: String? = null) {

    fun ldapId(ldapId: String): RemoveLdapServerParam {
        this.ldapId = ldapId
        return this
    }

    fun clientId(clientId: String): RemoveLdapServerParam {
        this.clientId = clientId
        return this
    }

    fun build(): RemoveLdapServerParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeLdapServerDocument,
                this
        );
    }

    private val removeLdapServerDocument: String = """
mutation RemoveLDAPServer(${'$'}ldapId: String!, ${'$'}clientId: String!) {
  RemoveLDAPServer(ldapId: ${'$'}ldapId, clientId: ${'$'}clientId) {
    _id
    name
    clientId
    userId
    ldapLink
    baseDN
    searchStandard
    emailPostfix
    username
    password
    description
    enabled
    isDeleted
    createdAt
    updatedAt
  }
}
"""
}


data class RemoveOAuthListResponse(

        @SerializedName("RemoveOAuthList")
        val result: List<String>
)

class RemoveOAuthListParam(@SerializedName("ids")
                           var ids: List<String>? = null) {

    fun ids(ids: List<String>): RemoveOAuthListParam {
        this.ids = ids
        return this
    }

    fun build(): RemoveOAuthListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeOAuthListDocument,
                this
        );
    }

    private val removeOAuthListDocument: String = """
mutation RemoveOAuthList(${'$'}ids: [String]) {
  RemoveOAuthList(ids: ${'$'}ids)
}
"""
}


data class RemoveOAuthProviderResponse(

        @SerializedName("RemoveOAuthProvider")
        val result: OAuthProviderClient
)

class RemoveOAuthProviderParam(@SerializedName("appId")
                               var appId: String? = null,
                               @SerializedName("clientId")
                               var clientId: String? = null) {

    fun appId(appId: String): RemoveOAuthProviderParam {
        this.appId = appId
        return this
    }

    fun clientId(clientId: String): RemoveOAuthProviderParam {
        this.clientId = clientId
        return this
    }

    fun build(): RemoveOAuthProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeOAuthProviderDocument,
                this
        );
    }

    private val removeOAuthProviderDocument: String = """
mutation RemoveOAuthProvider(${'$'}appId: String!, ${'$'}clientId: String!) {
  RemoveOAuthProvider(appId: ${'$'}appId, clientId: ${'$'}clientId) {
    _id
    name
    domain
    image
    redirectUris
    appSecret
    client_id
    clientId
    grants
    description
    homepageURL
    isDeleted
    when
    css
    loginUrl
    casExpire
  }
}
"""
}


data class RemoveOidcAppResponse(

        @SerializedName("RemoveOIDCApp")
        val result: OidcProviderClient
)

class RemoveOidcAppParam(@SerializedName("appId")
                         var appId: String? = null,
                         @SerializedName("clientId")
                         var clientId: String? = null) {

    fun appId(appId: String): RemoveOidcAppParam {
        this.appId = appId
        return this
    }

    fun clientId(clientId: String): RemoveOidcAppParam {
        this.clientId = clientId
        return this
    }

    fun build(): RemoveOidcAppParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeOidcAppDocument,
                this
        );
    }

    private val removeOidcAppDocument: String = """
mutation RemoveOIDCApp(${'$'}appId: String!, ${'$'}clientId: String!) {
  RemoveOIDCApp(appId: ${'$'}appId, clientId: ${'$'}clientId) {
    _id
    name
    domain
    image
    redirect_uris
    client_id
    client_secret
    token_endpoint_auth_method
    id_token_signed_response_alg
    id_token_encrypted_response_alg
    id_token_encrypted_response_enc
    userinfo_signed_response_alg
    userinfo_encrypted_response_alg
    userinfo_encrypted_response_enc
    request_object_signing_alg
    request_object_encryption_alg
    request_object_encryption_enc
    jwks_uri
    _jwks_uri
    custom_jwks
    jwks
    _jwks
    clientId
    grant_types
    response_types
    description
    homepageURL
    isDeleted
    isDefault
    when
    css
    authorization_code_expire
    id_token_expire
    access_token_expire
    cas_expire
    loginUrl
    customStyles {
      forceLogin
      hideQRCode
      hideUP
      hideUsername
      hideRegister
      hidePhone
      hideSocial
      hideClose
      hidePhonePassword
      defaultLoginMethod
    }
  }
}
"""
}


data class RemoveSamlIdentityProviderResponse(

        @SerializedName("RemoveSAMLIdentityProvider")
        val result: SamlIdentityProviderClient
)

class RemoveSamlIdentityProviderParam(@SerializedName("appId")
                                      var appId: String? = null,
                                      @SerializedName("clientId")
                                      var clientId: String? = null) {

    fun appId(appId: String): RemoveSamlIdentityProviderParam {
        this.appId = appId
        return this
    }

    fun clientId(clientId: String): RemoveSamlIdentityProviderParam {
        this.clientId = clientId
        return this
    }

    fun build(): RemoveSamlIdentityProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeSamlIdentityProviderDocument,
                this
        );
    }

    private val removeSamlIdentityProviderDocument: String = """
mutation RemoveSAMLIdentityProvider(${'$'}appId: String!, ${'$'}clientId: String!) {
  RemoveSAMLIdentityProvider(appId: ${'$'}appId, clientId: ${'$'}clientId) {
    _id
    name
    domain
    image
    appSecret
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    attributeNameFormat
    customAttributes
    emailDomainTransformation
    authnContextClassRef
    IdPMetadata
    assertionConsumerUrl
    bindings
    nameIds
    attributes
    enableSignRes
    resSignAlgorithm
    resAbstractAlgorithm
    resSignPublicKey
    resSignPrivateKey
    resSignPrivateKeyPass
    enableSignReq
    reqSignPublicKey
    enableEncryptRes
    resEncryptPublicKey
    css
  }
}
"""
}


data class RemoveSamlServiceProviderResponse(

        @SerializedName("RemoveSAMLServiceProvider")
        val result: SamlServiceProviderClient
)

class RemoveSamlServiceProviderParam(@SerializedName("appId")
                                     var appId: String? = null,
                                     @SerializedName("clientId")
                                     var clientId: String? = null) {

    fun appId(appId: String): RemoveSamlServiceProviderParam {
        this.appId = appId
        return this
    }

    fun clientId(clientId: String): RemoveSamlServiceProviderParam {
        this.clientId = clientId
        return this
    }

    fun build(): RemoveSamlServiceProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeSamlServiceProviderDocument,
                this
        );
    }

    private val removeSamlServiceProviderDocument: String = """
mutation RemoveSAMLServiceProvider(${'$'}appId: String!, ${'$'}clientId: String!) {
  RemoveSAMLServiceProvider(appId: ${'$'}appId, clientId: ${'$'}clientId) {
    _id
    name
    domain
    image
    appSecret
    defaultIdPMap {
      _id
      name
      image
      description
      isDeleted
    }
    defaultIdPMapId
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    IdPMetadata
    IdPEntityID
    assertionConsumeService {
      binding
      url
      isDefault
    }
    mappings {
      username
      nickname
      photo
      company
      providerName
      email
    }
    redirectUrl
    loginUrl
    logoutUrl
    nameId
    enableSignRes
    resSignPublicKey
    hasResEncrypted
    resEncryptAlgorithm
    resAbstractAlgorithm
    resDecryptPrivateKey
    resDecryptPrivateKeyPass
    resEncryptPublicKey
    enableSignReq
    reqSignAlgorithm
    reqAbstractAlgorithm
    reqSignPrivateKey
    reqSignPrivateKeyPass
    reqSignPublicKey
    SPUrl
  }
}
"""
}


data class RevokeUserAuthorizedAppResponse(

        @SerializedName("RevokeUserAuthorizedApp")
        val result: UserAuthorizedApp
)

class RevokeUserAuthorizedAppParam(@SerializedName("appId")
                                   var appId: String? = null,
                                   @SerializedName("userPoolId")
                                   var userPoolId: String? = null,
                                   @SerializedName("userId")
                                   var userId: String? = null) {

    fun appId(appId: String): RevokeUserAuthorizedAppParam {
        this.appId = appId
        return this
    }

    fun userPoolId(userPoolId: String): RevokeUserAuthorizedAppParam {
        this.userPoolId = userPoolId
        return this
    }

    fun userId(userId: String): RevokeUserAuthorizedAppParam {
        this.userId = userId
        return this
    }

    fun build(): RevokeUserAuthorizedAppParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                revokeUserAuthorizedAppDocument,
                this
        );
    }

    private val revokeUserAuthorizedAppDocument: String = """
mutation RevokeUserAuthorizedApp(${'$'}appId: String, ${'$'}userPoolId: String, ${'$'}userId: String) {
  RevokeUserAuthorizedApp(appId: ${'$'}appId, userPoolId: ${'$'}userPoolId, userId: ${'$'}userId) {
    _id
    appId
    userId
    scope
    type
    isRevoked
    when
  }
}
"""
}


data class SaveEmailProviderWithClientResponse(

        @SerializedName("SaveEmailProviderWithClient")
        val result: EmailProviderWithClientList
)

class SaveEmailProviderWithClientParam(@SerializedName("options")
                                       var options: EmailProviderWithClientAddInput? = null) {

    fun options(options: EmailProviderWithClientAddInput): SaveEmailProviderWithClientParam {
        this.options = options
        return this
    }

    fun build(): SaveEmailProviderWithClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                saveEmailProviderWithClientDocument,
                this
        );
    }

    private val saveEmailProviderWithClientDocument: String = """
mutation SaveEmailProviderWithClient(${'$'}options: EmailProviderWithClientAddInput) {
  SaveEmailProviderWithClient(options: ${'$'}options) {
    _id
    user
    client
    status
    fields {
      label
      type
      placeholder
      help
      value
      options
    }
    provider {
      _id
      name
      image
      description
    }
  }
}
"""
}


data class SendEmailResponse(

        @SerializedName("SendEmail")
        val result: EmailSentList
)

class SendEmailParam(@SerializedName("receivers")
                     var receivers: List<String>? = null,
                     @SerializedName("subject")
                     var subject: String? = null,
                     @SerializedName("client")
                     var client: String? = null,
                     @SerializedName("user")
                     var user: String? = null,
                     @SerializedName("testAvailable")
                     var testAvailable: Boolean? = null,
                     @SerializedName("providerName")
                     var providerName: String? = null,
                     @SerializedName("content")
                     var content: String? = null,
                     @SerializedName("sender")
                     var sender: String? = null,
                     @SerializedName("meta_data")
                     var meta_data: String? = null,
                     @SerializedName("secret")
                     var secret: String? = null) {

    fun receivers(receivers: List<String>): SendEmailParam {
        this.receivers = receivers
        return this
    }

    fun subject(subject: String): SendEmailParam {
        this.subject = subject
        return this
    }

    fun client(client: String): SendEmailParam {
        this.client = client
        return this
    }

    fun user(user: String): SendEmailParam {
        this.user = user
        return this
    }

    fun testAvailable(testAvailable: Boolean): SendEmailParam {
        this.testAvailable = testAvailable
        return this
    }

    fun providerName(providerName: String): SendEmailParam {
        this.providerName = providerName
        return this
    }

    fun content(content: String): SendEmailParam {
        this.content = content
        return this
    }

    fun sender(sender: String): SendEmailParam {
        this.sender = sender
        return this
    }

    fun meta_data(meta_data: String): SendEmailParam {
        this.meta_data = meta_data
        return this
    }

    fun secret(secret: String): SendEmailParam {
        this.secret = secret
        return this
    }

    fun build(): SendEmailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                sendEmailDocument,
                this
        );
    }

    private val sendEmailDocument: String = """
mutation SendEmail(${'$'}receivers: [String]!, ${'$'}subject: String!, ${'$'}client: String!, ${'$'}user: String, ${'$'}testAvailable: Boolean, ${'$'}providerName: String, ${'$'}content: String, ${'$'}sender: String, ${'$'}meta_data: String, ${'$'}secret: String) {
  SendEmail(receivers: ${'$'}receivers, subject: ${'$'}subject, client: ${'$'}client, user: ${'$'}user, testAvailable: ${'$'}testAvailable, providerName: ${'$'}providerName, content: ${'$'}content, sender: ${'$'}sender, meta_data: ${'$'}meta_data, secret: ${'$'}secret) {
    _id
    user
    subject
    content
    sender
    receivers
    post
    createdAt
    rejected
    isDeleted
    client
  }
}
"""
}


data class SendEmailByTypeResponse(

        @SerializedName("SendEmailByType")
        val result: EmailSentList
)

class SendEmailByTypeParam(@SerializedName("user")
                           var user: String? = null,
                           @SerializedName("type")
                           var type: String? = null,
                           @SerializedName("client")
                           var client: String? = null,
                           @SerializedName("receivers")
                           var receivers: List<String>? = null,
                           @SerializedName("meta_data")
                           var meta_data: String? = null) {

    fun user(user: String): SendEmailByTypeParam {
        this.user = user
        return this
    }

    fun type(type: String): SendEmailByTypeParam {
        this.type = type
        return this
    }

    fun client(client: String): SendEmailByTypeParam {
        this.client = client
        return this
    }

    fun receivers(receivers: List<String>): SendEmailByTypeParam {
        this.receivers = receivers
        return this
    }

    fun meta_data(meta_data: String): SendEmailByTypeParam {
        this.meta_data = meta_data
        return this
    }

    fun build(): SendEmailByTypeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                sendEmailByTypeDocument,
                this
        );
    }

    private val sendEmailByTypeDocument: String = """
mutation SendEmailByType(${'$'}user: String!, ${'$'}type: String!, ${'$'}client: String!, ${'$'}receivers: [String]!, ${'$'}meta_data: String) {
  SendEmailByType(user: ${'$'}user, type: ${'$'}type, client: ${'$'}client, receivers: ${'$'}receivers, meta_data: ${'$'}meta_data) {
    _id
    user
    subject
    content
    sender
    receivers
    post
    createdAt
    rejected
    isDeleted
    client
  }
}
"""
}


data class SendWebhookTestResponse(

        @SerializedName("SendWebhookTest")
        val result: Boolean
)

class SendWebhookTestParam(@SerializedName("id")
                           var id: String? = null) {

    fun id(id: String): SendWebhookTestParam {
        this.id = id
        return this
    }

    fun build(): SendWebhookTestParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                sendWebhookTestDocument,
                this
        );
    }

    private val sendWebhookTestDocument: String = """
mutation SendWebhookTest(${'$'}id: String!) {
  SendWebhookTest(id: ${'$'}id)
}
"""
}


data class SetApplicationOAuthEnableOrDisableResponse(

        @SerializedName("SetApplicationOAuthEnableOrDisable")
        val result: OAuthList
)

class SetApplicationOAuthEnableOrDisableParam(@SerializedName("client")
                                              var client: String? = null,
                                              @SerializedName("oauth")
                                              var oauth: String? = null,
                                              @SerializedName("user")
                                              var user: String? = null,
                                              @SerializedName("enabled")
                                              var enabled: Boolean? = null) {

    fun client(client: String): SetApplicationOAuthEnableOrDisableParam {
        this.client = client
        return this
    }

    fun oauth(oauth: String): SetApplicationOAuthEnableOrDisableParam {
        this.oauth = oauth
        return this
    }

    fun user(user: String): SetApplicationOAuthEnableOrDisableParam {
        this.user = user
        return this
    }

    fun enabled(enabled: Boolean): SetApplicationOAuthEnableOrDisableParam {
        this.enabled = enabled
        return this
    }

    fun build(): SetApplicationOAuthEnableOrDisableParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                setApplicationOAuthEnableOrDisableDocument,
                this
        );
    }

    private val setApplicationOAuthEnableOrDisableDocument: String = """
mutation SetApplicationOAuthEnableOrDisable(${'$'}client: String, ${'$'}oauth: String, ${'$'}user: String, ${'$'}enabled: Boolean) {
  SetApplicationOAuthEnableOrDisable(client: ${'$'}client, oauth: ${'$'}oauth, user: ${'$'}user, enabled: ${'$'}enabled) {
    _id
    name
    alias
    image
    description
    enabled
    url
    client
    user
    oAuthUrl
    wxappLogo
    fields {
      label
      type
      placeholder
      value
      checked
    }
    oauth {
      _id
      name
      alias
      image
      description
      enabled
      url
      client
      user
      oAuthUrl
      wxappLogo
    }
  }
}
"""
}


data class UpdateApplicationOAuthResponse(

        @SerializedName("UpdateApplicationOAuth")
        val result: OAuthList
)

class UpdateApplicationOAuthParam(@SerializedName("client")
                                  var client: String? = null,
                                  @SerializedName("oauth")
                                  var oauth: String? = null,
                                  @SerializedName("user")
                                  var user: String? = null,
                                  @SerializedName("alias")
                                  var alias: String? = null,
                                  @SerializedName("fields")
                                  var fields: List<OAuthListFieldsFormUpdateInput>? = null) {

    fun client(client: String): UpdateApplicationOAuthParam {
        this.client = client
        return this
    }

    fun oauth(oauth: String): UpdateApplicationOAuthParam {
        this.oauth = oauth
        return this
    }

    fun user(user: String): UpdateApplicationOAuthParam {
        this.user = user
        return this
    }

    fun alias(alias: String): UpdateApplicationOAuthParam {
        this.alias = alias
        return this
    }

    fun fields(fields: List<OAuthListFieldsFormUpdateInput>): UpdateApplicationOAuthParam {
        this.fields = fields
        return this
    }

    fun build(): UpdateApplicationOAuthParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateApplicationOAuthDocument,
                this
        );
    }

    private val updateApplicationOAuthDocument: String = """
mutation UpdateApplicationOAuth(${'$'}client: String, ${'$'}oauth: String, ${'$'}user: String, ${'$'}alias: String, ${'$'}fields: [OAuthListFieldsFormUpdateInput]) {
  UpdateApplicationOAuth(client: ${'$'}client, oauth: ${'$'}oauth, user: ${'$'}user, alias: ${'$'}alias, fields: ${'$'}fields) {
    _id
    name
    alias
    image
    description
    enabled
    url
    client
    user
    oAuthUrl
    wxappLogo
    fields {
      label
      type
      placeholder
      value
      checked
    }
    oauth {
      _id
      name
      alias
      image
      description
      enabled
      url
      client
      user
      oAuthUrl
      wxappLogo
    }
  }
}
"""
}


data class UpdateEmailProviderResponse(

        @SerializedName("UpdateEmailProvider")
        val result: EmailProviderList
)

class UpdateEmailProviderParam(@SerializedName("options")
                               var options: EmailProviderListInput? = null) {

    fun options(options: EmailProviderListInput): UpdateEmailProviderParam {
        this.options = options
        return this
    }

    fun build(): UpdateEmailProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateEmailProviderDocument,
                this
        );
    }

    private val updateEmailProviderDocument: String = """
mutation UpdateEmailProvider(${'$'}options: EmailProviderListInput) {
  UpdateEmailProvider(options: ${'$'}options) {
    _id
    name
    image
    description
    fields {
      label
      type
      placeholder
      help
      value
      options
    }
    client
    user
    status
    provider {
      _id
      name
      image
      description
      client
      user
      status
    }
  }
}
"""
}


data class UpdateEmailTemplateResponse(

        @SerializedName("UpdateEmailTemplate")
        val result: EmailTemplate
)

class UpdateEmailTemplateParam(@SerializedName("options")
                               var options: EmailTemplateInput? = null) {

    fun options(options: EmailTemplateInput): UpdateEmailTemplateParam {
        this.options = options
        return this
    }

    fun build(): UpdateEmailTemplateParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateEmailTemplateDocument,
                this
        );
    }

    private val updateEmailTemplateDocument: String = """
mutation UpdateEmailTemplate(${'$'}options: EmailTemplateInput!) {
  UpdateEmailTemplate(options: ${'$'}options) {
    _id
    type
    sender
    object
    hasURL
    URLExpireTime
    status
    redirectTo
    content
  }
}
"""
}


data class UpdateEmailTemplateWithClientResponse(

        @SerializedName("UpdateEmailTemplateWithClient")
        val result: EmailProviderWithClientList
)

class UpdateEmailTemplateWithClientParam(@SerializedName("options")
                                         var options: EmailTemplateWithClientInput? = null) {

    fun options(options: EmailTemplateWithClientInput): UpdateEmailTemplateWithClientParam {
        this.options = options
        return this
    }

    fun build(): UpdateEmailTemplateWithClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateEmailTemplateWithClientDocument,
                this
        );
    }

    private val updateEmailTemplateWithClientDocument: String = """
mutation UpdateEmailTemplateWithClient(${'$'}options: EmailTemplateWithClientInput!) {
  UpdateEmailTemplateWithClient(options: ${'$'}options) {
    _id
    user
    client
    status
    fields {
      label
      type
      placeholder
      help
      value
      options
    }
    provider {
      _id
      name
      image
      description
    }
  }
}
"""
}


data class UpdateLdapServerResponse(

        @SerializedName("UpdateLDAPServer")
        val result: LdapSingleServer
)

class UpdateLdapServerParam(@SerializedName("ldapId")
                            var ldapId: String? = null,
                            @SerializedName("name")
                            var name: String? = null,
                            @SerializedName("clientId")
                            var clientId: String? = null,
                            @SerializedName("userId")
                            var userId: String? = null,
                            @SerializedName("ldapLink")
                            var ldapLink: String? = null,
                            @SerializedName("baseDN")
                            var baseDN: String? = null,
                            @SerializedName("username")
                            var username: String? = null,
                            @SerializedName("searchStandard")
                            var searchStandard: String? = null,
                            @SerializedName("password")
                            var password: String? = null,
                            @SerializedName("emailPostfix")
                            var emailPostfix: String? = null,
                            @SerializedName("description")
                            var description: String? = null,
                            @SerializedName("enabled")
                            var enabled: Boolean? = null) {

    fun ldapId(ldapId: String): UpdateLdapServerParam {
        this.ldapId = ldapId
        return this
    }

    fun name(name: String): UpdateLdapServerParam {
        this.name = name
        return this
    }

    fun clientId(clientId: String): UpdateLdapServerParam {
        this.clientId = clientId
        return this
    }

    fun userId(userId: String): UpdateLdapServerParam {
        this.userId = userId
        return this
    }

    fun ldapLink(ldapLink: String): UpdateLdapServerParam {
        this.ldapLink = ldapLink
        return this
    }

    fun baseDN(baseDN: String): UpdateLdapServerParam {
        this.baseDN = baseDN
        return this
    }

    fun username(username: String): UpdateLdapServerParam {
        this.username = username
        return this
    }

    fun searchStandard(searchStandard: String): UpdateLdapServerParam {
        this.searchStandard = searchStandard
        return this
    }

    fun password(password: String): UpdateLdapServerParam {
        this.password = password
        return this
    }

    fun emailPostfix(emailPostfix: String): UpdateLdapServerParam {
        this.emailPostfix = emailPostfix
        return this
    }

    fun description(description: String): UpdateLdapServerParam {
        this.description = description
        return this
    }

    fun enabled(enabled: Boolean): UpdateLdapServerParam {
        this.enabled = enabled
        return this
    }

    fun build(): UpdateLdapServerParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateLdapServerDocument,
                this
        );
    }

    private val updateLdapServerDocument: String = """
mutation UpdateLDAPServer(${'$'}ldapId: String!, ${'$'}name: String!, ${'$'}clientId: String!, ${'$'}userId: String!, ${'$'}ldapLink: String!, ${'$'}baseDN: String!, ${'$'}username: String!, ${'$'}searchStandard: String!, ${'$'}password: String!, ${'$'}emailPostfix: String, ${'$'}description: String, ${'$'}enabled: Boolean) {
  UpdateLDAPServer(ldapId: ${'$'}ldapId, name: ${'$'}name, clientId: ${'$'}clientId, userId: ${'$'}userId, ldapLink: ${'$'}ldapLink, baseDN: ${'$'}baseDN, username: ${'$'}username, searchStandard: ${'$'}searchStandard, password: ${'$'}password, emailPostfix: ${'$'}emailPostfix, description: ${'$'}description, enabled: ${'$'}enabled) {
    _id
    name
    clientId
    userId
    ldapLink
    baseDN
    searchStandard
    emailPostfix
    username
    password
    description
    enabled
    isDeleted
    createdAt
    updatedAt
  }
}
"""
}


data class UpdateOAuthListResponse(

        @SerializedName("UpdateOAuthList")
        val result: OAuthList
)

class UpdateOAuthListParam(@SerializedName("options")
                           var options: OAuthListUpdateInput? = null,
                           @SerializedName("fields")
                           var fields: List<OAuthListFieldsFormUpdateInput>? = null) {

    fun options(options: OAuthListUpdateInput): UpdateOAuthListParam {
        this.options = options
        return this
    }

    fun fields(fields: List<OAuthListFieldsFormUpdateInput>): UpdateOAuthListParam {
        this.fields = fields
        return this
    }

    fun build(): UpdateOAuthListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateOAuthListDocument,
                this
        );
    }

    private val updateOAuthListDocument: String = """
mutation UpdateOAuthList(${'$'}options: OAuthListUpdateInput, ${'$'}fields: [OAuthListFieldsFormUpdateInput]) {
  UpdateOAuthList(options: ${'$'}options, fields: ${'$'}fields) {
    _id
    name
    alias
    image
    description
    enabled
    url
    client
    user
    oAuthUrl
    wxappLogo
    fields {
      label
      type
      placeholder
      value
      checked
    }
    oauth {
      _id
      name
      alias
      image
      description
      enabled
      url
      client
      user
      oAuthUrl
      wxappLogo
    }
  }
}
"""
}


data class UpdateOAuthProviderResponse(

        @SerializedName("UpdateOAuthProvider")
        val result: OAuthProviderClient
)

class UpdateOAuthProviderParam(@SerializedName("appId")
                               var appId: String? = null,
                               @SerializedName("domain")
                               var domain: String? = null,
                               @SerializedName("name")
                               var name: String? = null,
                               @SerializedName("image")
                               var image: String? = null,
                               @SerializedName("redirectUris")
                               var redirectUris: List<String>? = null,
                               @SerializedName("grants")
                               var grants: List<String>? = null,
                               @SerializedName("description")
                               var description: String? = null,
                               @SerializedName("homepageURL")
                               var homepageURL: String? = null,
                               @SerializedName("css")
                               var css: String? = null,
                               @SerializedName("casExpire")
                               var casExpire: Int? = null) {

    fun appId(appId: String): UpdateOAuthProviderParam {
        this.appId = appId
        return this
    }

    fun domain(domain: String): UpdateOAuthProviderParam {
        this.domain = domain
        return this
    }

    fun name(name: String): UpdateOAuthProviderParam {
        this.name = name
        return this
    }

    fun image(image: String): UpdateOAuthProviderParam {
        this.image = image
        return this
    }

    fun redirectUris(redirectUris: List<String>): UpdateOAuthProviderParam {
        this.redirectUris = redirectUris
        return this
    }

    fun grants(grants: List<String>): UpdateOAuthProviderParam {
        this.grants = grants
        return this
    }

    fun description(description: String): UpdateOAuthProviderParam {
        this.description = description
        return this
    }

    fun homepageURL(homepageURL: String): UpdateOAuthProviderParam {
        this.homepageURL = homepageURL
        return this
    }

    fun css(css: String): UpdateOAuthProviderParam {
        this.css = css
        return this
    }

    fun casExpire(casExpire: Int): UpdateOAuthProviderParam {
        this.casExpire = casExpire
        return this
    }

    fun build(): UpdateOAuthProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateOAuthProviderDocument,
                this
        );
    }

    private val updateOAuthProviderDocument: String = """
mutation UpdateOAuthProvider(${'$'}appId: String!, ${'$'}domain: String, ${'$'}name: String, ${'$'}image: String, ${'$'}redirectUris: [String], ${'$'}grants: [String], ${'$'}description: String, ${'$'}homepageURL: String, ${'$'}css: String, ${'$'}casExpire: Int) {
  UpdateOAuthProvider(appId: ${'$'}appId, domain: ${'$'}domain, name: ${'$'}name, image: ${'$'}image, redirectUris: ${'$'}redirectUris, grants: ${'$'}grants, description: ${'$'}description, homepageURL: ${'$'}homepageURL, css: ${'$'}css, casExpire: ${'$'}casExpire) {
    _id
    name
    domain
    image
    redirectUris
    appSecret
    client_id
    clientId
    grants
    description
    homepageURL
    isDeleted
    when
    css
    loginUrl
    casExpire
  }
}
"""
}


data class UpdateOidcAppResponse(

        @SerializedName("UpdateOIDCApp")
        val result: OidcProviderClient
)

class UpdateOidcAppParam(@SerializedName("appId")
                         var appId: String? = null,
                         @SerializedName("domain")
                         var domain: String? = null,
                         @SerializedName("name")
                         var name: String? = null,
                         @SerializedName("image")
                         var image: String? = null,
                         @SerializedName("redirect_uris")
                         var redirect_uris: List<String>? = null,
                         @SerializedName("token_endpoint_auth_method")
                         var token_endpoint_auth_method: String? = null,
                         @SerializedName("grant_types")
                         var grant_types: List<String>? = null,
                         @SerializedName("response_types")
                         var response_types: List<String>? = null,
                         @SerializedName("id_token_signed_response_alg")
                         var id_token_signed_response_alg: String? = null,
                         @SerializedName("id_token_encrypted_response_alg")
                         var id_token_encrypted_response_alg: String? = null,
                         @SerializedName("id_token_encrypted_response_enc")
                         var id_token_encrypted_response_enc: String? = null,
                         @SerializedName("userinfo_signed_response_alg")
                         var userinfo_signed_response_alg: String? = null,
                         @SerializedName("userinfo_encrypted_response_alg")
                         var userinfo_encrypted_response_alg: String? = null,
                         @SerializedName("userinfo_encrypted_response_enc")
                         var userinfo_encrypted_response_enc: String? = null,
                         @SerializedName("request_object_signing_alg")
                         var request_object_signing_alg: String? = null,
                         @SerializedName("request_object_encryption_alg")
                         var request_object_encryption_alg: String? = null,
                         @SerializedName("request_object_encryption_enc")
                         var request_object_encryption_enc: String? = null,
                         @SerializedName("jwks_uri")
                         var jwks_uri: String? = null,
                         @SerializedName("_jwks_uri")
                         var _jwks_uri: String? = null,
                         @SerializedName("custom_jwks")
                         var custom_jwks: String? = null,
                         @SerializedName("jwks")
                         var jwks: String? = null,
                         @SerializedName("_jwks")
                         var _jwks: String? = null,
                         @SerializedName("description")
                         var description: String? = null,
                         @SerializedName("homepageURL")
                         var homepageURL: String? = null,
                         @SerializedName("css")
                         var css: String? = null,
                         @SerializedName("authorization_code_expire")
                         var authorization_code_expire: String? = null,
                         @SerializedName("id_token_expire")
                         var id_token_expire: String? = null,
                         @SerializedName("access_token_expire")
                         var access_token_expire: String? = null,
                         @SerializedName("cas_expire")
                         var cas_expire: String? = null,
                         @SerializedName("customStyles")
                         var customStyles: OidcProviderCustomStylesInput? = null) {

    fun appId(appId: String): UpdateOidcAppParam {
        this.appId = appId
        return this
    }

    fun domain(domain: String): UpdateOidcAppParam {
        this.domain = domain
        return this
    }

    fun name(name: String): UpdateOidcAppParam {
        this.name = name
        return this
    }

    fun image(image: String): UpdateOidcAppParam {
        this.image = image
        return this
    }

    fun redirect_uris(redirect_uris: List<String>): UpdateOidcAppParam {
        this.redirect_uris = redirect_uris
        return this
    }

    fun token_endpoint_auth_method(token_endpoint_auth_method: String): UpdateOidcAppParam {
        this.token_endpoint_auth_method = token_endpoint_auth_method
        return this
    }

    fun grant_types(grant_types: List<String>): UpdateOidcAppParam {
        this.grant_types = grant_types
        return this
    }

    fun response_types(response_types: List<String>): UpdateOidcAppParam {
        this.response_types = response_types
        return this
    }

    fun id_token_signed_response_alg(id_token_signed_response_alg: String): UpdateOidcAppParam {
        this.id_token_signed_response_alg = id_token_signed_response_alg
        return this
    }

    fun id_token_encrypted_response_alg(id_token_encrypted_response_alg: String): UpdateOidcAppParam {
        this.id_token_encrypted_response_alg = id_token_encrypted_response_alg
        return this
    }

    fun id_token_encrypted_response_enc(id_token_encrypted_response_enc: String): UpdateOidcAppParam {
        this.id_token_encrypted_response_enc = id_token_encrypted_response_enc
        return this
    }

    fun userinfo_signed_response_alg(userinfo_signed_response_alg: String): UpdateOidcAppParam {
        this.userinfo_signed_response_alg = userinfo_signed_response_alg
        return this
    }

    fun userinfo_encrypted_response_alg(userinfo_encrypted_response_alg: String): UpdateOidcAppParam {
        this.userinfo_encrypted_response_alg = userinfo_encrypted_response_alg
        return this
    }

    fun userinfo_encrypted_response_enc(userinfo_encrypted_response_enc: String): UpdateOidcAppParam {
        this.userinfo_encrypted_response_enc = userinfo_encrypted_response_enc
        return this
    }

    fun request_object_signing_alg(request_object_signing_alg: String): UpdateOidcAppParam {
        this.request_object_signing_alg = request_object_signing_alg
        return this
    }

    fun request_object_encryption_alg(request_object_encryption_alg: String): UpdateOidcAppParam {
        this.request_object_encryption_alg = request_object_encryption_alg
        return this
    }

    fun request_object_encryption_enc(request_object_encryption_enc: String): UpdateOidcAppParam {
        this.request_object_encryption_enc = request_object_encryption_enc
        return this
    }

    fun jwks_uri(jwks_uri: String): UpdateOidcAppParam {
        this.jwks_uri = jwks_uri
        return this
    }

    fun _jwks_uri(_jwks_uri: String): UpdateOidcAppParam {
        this._jwks_uri = _jwks_uri
        return this
    }

    fun custom_jwks(custom_jwks: String): UpdateOidcAppParam {
        this.custom_jwks = custom_jwks
        return this
    }

    fun jwks(jwks: String): UpdateOidcAppParam {
        this.jwks = jwks
        return this
    }

    fun _jwks(_jwks: String): UpdateOidcAppParam {
        this._jwks = _jwks
        return this
    }

    fun description(description: String): UpdateOidcAppParam {
        this.description = description
        return this
    }

    fun homepageURL(homepageURL: String): UpdateOidcAppParam {
        this.homepageURL = homepageURL
        return this
    }

    fun css(css: String): UpdateOidcAppParam {
        this.css = css
        return this
    }

    fun authorization_code_expire(authorization_code_expire: String): UpdateOidcAppParam {
        this.authorization_code_expire = authorization_code_expire
        return this
    }

    fun id_token_expire(id_token_expire: String): UpdateOidcAppParam {
        this.id_token_expire = id_token_expire
        return this
    }

    fun access_token_expire(access_token_expire: String): UpdateOidcAppParam {
        this.access_token_expire = access_token_expire
        return this
    }

    fun cas_expire(cas_expire: String): UpdateOidcAppParam {
        this.cas_expire = cas_expire
        return this
    }

    fun customStyles(customStyles: OidcProviderCustomStylesInput): UpdateOidcAppParam {
        this.customStyles = customStyles
        return this
    }

    fun build(): UpdateOidcAppParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateOidcAppDocument,
                this
        );
    }

    private val updateOidcAppDocument: String = """
mutation UpdateOIDCApp(${'$'}appId: String!, ${'$'}domain: String, ${'$'}name: String, ${'$'}image: String, ${'$'}redirect_uris: [String], ${'$'}token_endpoint_auth_method: String, ${'$'}grant_types: [String], ${'$'}response_types: [String], ${'$'}id_token_signed_response_alg: String, ${'$'}id_token_encrypted_response_alg: String, ${'$'}id_token_encrypted_response_enc: String, ${'$'}userinfo_signed_response_alg: String, ${'$'}userinfo_encrypted_response_alg: String, ${'$'}userinfo_encrypted_response_enc: String, ${'$'}request_object_signing_alg: String, ${'$'}request_object_encryption_alg: String, ${'$'}request_object_encryption_enc: String, ${'$'}jwks_uri: String, ${'$'}_jwks_uri: String, ${'$'}custom_jwks: String, ${'$'}jwks: String, ${'$'}_jwks: String, ${'$'}description: String, ${'$'}homepageURL: String, ${'$'}css: String, ${'$'}authorization_code_expire: String, ${'$'}id_token_expire: String, ${'$'}access_token_expire: String, ${'$'}cas_expire: String, ${'$'}customStyles: OIDCProviderCustomStylesInput) {
  UpdateOIDCApp(appId: ${'$'}appId, domain: ${'$'}domain, name: ${'$'}name, image: ${'$'}image, redirect_uris: ${'$'}redirect_uris, token_endpoint_auth_method: ${'$'}token_endpoint_auth_method, grant_types: ${'$'}grant_types, response_types: ${'$'}response_types, id_token_signed_response_alg: ${'$'}id_token_signed_response_alg, id_token_encrypted_response_alg: ${'$'}id_token_encrypted_response_alg, id_token_encrypted_response_enc: ${'$'}id_token_encrypted_response_enc, userinfo_signed_response_alg: ${'$'}userinfo_signed_response_alg, userinfo_encrypted_response_alg: ${'$'}userinfo_encrypted_response_alg, userinfo_encrypted_response_enc: ${'$'}userinfo_encrypted_response_enc, request_object_signing_alg: ${'$'}request_object_signing_alg, request_object_encryption_alg: ${'$'}request_object_encryption_alg, request_object_encryption_enc: ${'$'}request_object_encryption_enc, jwks_uri: ${'$'}jwks_uri, _jwks_uri: ${'$'}_jwks_uri, custom_jwks: ${'$'}custom_jwks, jwks: ${'$'}jwks, _jwks: ${'$'}_jwks, description: ${'$'}description, homepageURL: ${'$'}homepageURL, css: ${'$'}css, authorization_code_expire: ${'$'}authorization_code_expire, id_token_expire: ${'$'}id_token_expire, access_token_expire: ${'$'}access_token_expire, cas_expire: ${'$'}cas_expire, customStyles: ${'$'}customStyles) {
    _id
    name
    domain
    image
    redirect_uris
    client_id
    client_secret
    token_endpoint_auth_method
    id_token_signed_response_alg
    id_token_encrypted_response_alg
    id_token_encrypted_response_enc
    userinfo_signed_response_alg
    userinfo_encrypted_response_alg
    userinfo_encrypted_response_enc
    request_object_signing_alg
    request_object_encryption_alg
    request_object_encryption_enc
    jwks_uri
    _jwks_uri
    custom_jwks
    jwks
    _jwks
    clientId
    grant_types
    response_types
    description
    homepageURL
    isDeleted
    isDefault
    when
    css
    authorization_code_expire
    id_token_expire
    access_token_expire
    cas_expire
    loginUrl
    customStyles {
      forceLogin
      hideQRCode
      hideUP
      hideUsername
      hideRegister
      hidePhone
      hideSocial
      hideClose
      hidePhonePassword
      defaultLoginMethod
    }
  }
}
"""
}


data class UpdateSamlIdentityProviderResponse(

        @SerializedName("UpdateSAMLIdentityProvider")
        val result: SamlIdentityProviderClient
)

class UpdateSamlIdentityProviderParam(@SerializedName("appId")
                                      var appId: String? = null,
                                      @SerializedName("clientId")
                                      var clientId: String? = null,
                                      @SerializedName("domain")
                                      var domain: String? = null,
                                      @SerializedName("image")
                                      var image: String? = null,
                                      @SerializedName("name")
                                      var name: String? = null,
                                      @SerializedName("description")
                                      var description: String? = null,
                                      @SerializedName("SPMetadata")
                                      var SPMetadata: String? = null,
                                      @SerializedName("attributeNameFormat")
                                      var attributeNameFormat: String? = null,
                                      @SerializedName("customAttributes")
                                      var customAttributes: String? = null,
                                      @SerializedName("emailDomainTransformation")
                                      var emailDomainTransformation: String? = null,
                                      @SerializedName("authnContextClassRef")
                                      var authnContextClassRef: String? = null,
                                      @SerializedName("IdPMetadata")
                                      var IdPMetadata: String? = null,
                                      @SerializedName("assertionConsumerUrl")
                                      var assertionConsumerUrl: String? = null,
                                      @SerializedName("bindings")
                                      var bindings: List<String>? = null,
                                      @SerializedName("nameIds")
                                      var nameIds: List<String>? = null,
                                      @SerializedName("attributes")
                                      var attributes: List<String>? = null,
                                      @SerializedName("enableSignRes")
                                      var enableSignRes: Boolean? = null,
                                      @SerializedName("resSignAlgorithm")
                                      var resSignAlgorithm: String? = null,
                                      @SerializedName("resAbstractAlgorithm")
                                      var resAbstractAlgorithm: String? = null,
                                      @SerializedName("resSignPublicKey")
                                      var resSignPublicKey: String? = null,
                                      @SerializedName("resSignPrivateKey")
                                      var resSignPrivateKey: String? = null,
                                      @SerializedName("resSignPrivateKeyPass")
                                      var resSignPrivateKeyPass: String? = null,
                                      @SerializedName("enableSignReq")
                                      var enableSignReq: Boolean? = null,
                                      @SerializedName("reqSignPublicKey")
                                      var reqSignPublicKey: String? = null,
                                      @SerializedName("enableEncryptRes")
                                      var enableEncryptRes: Boolean? = null,
                                      @SerializedName("resEncryptPublicKey")
                                      var resEncryptPublicKey: String? = null,
                                      @SerializedName("css")
                                      var css: String? = null) {

    fun appId(appId: String): UpdateSamlIdentityProviderParam {
        this.appId = appId
        return this
    }

    fun clientId(clientId: String): UpdateSamlIdentityProviderParam {
        this.clientId = clientId
        return this
    }

    fun domain(domain: String): UpdateSamlIdentityProviderParam {
        this.domain = domain
        return this
    }

    fun image(image: String): UpdateSamlIdentityProviderParam {
        this.image = image
        return this
    }

    fun name(name: String): UpdateSamlIdentityProviderParam {
        this.name = name
        return this
    }

    fun description(description: String): UpdateSamlIdentityProviderParam {
        this.description = description
        return this
    }

    fun SPMetadata(SPMetadata: String): UpdateSamlIdentityProviderParam {
        this.SPMetadata = SPMetadata
        return this
    }

    fun attributeNameFormat(attributeNameFormat: String): UpdateSamlIdentityProviderParam {
        this.attributeNameFormat = attributeNameFormat
        return this
    }

    fun customAttributes(customAttributes: String): UpdateSamlIdentityProviderParam {
        this.customAttributes = customAttributes
        return this
    }

    fun emailDomainTransformation(emailDomainTransformation: String): UpdateSamlIdentityProviderParam {
        this.emailDomainTransformation = emailDomainTransformation
        return this
    }

    fun authnContextClassRef(authnContextClassRef: String): UpdateSamlIdentityProviderParam {
        this.authnContextClassRef = authnContextClassRef
        return this
    }

    fun IdPMetadata(IdPMetadata: String): UpdateSamlIdentityProviderParam {
        this.IdPMetadata = IdPMetadata
        return this
    }

    fun assertionConsumerUrl(assertionConsumerUrl: String): UpdateSamlIdentityProviderParam {
        this.assertionConsumerUrl = assertionConsumerUrl
        return this
    }

    fun bindings(bindings: List<String>): UpdateSamlIdentityProviderParam {
        this.bindings = bindings
        return this
    }

    fun nameIds(nameIds: List<String>): UpdateSamlIdentityProviderParam {
        this.nameIds = nameIds
        return this
    }

    fun attributes(attributes: List<String>): UpdateSamlIdentityProviderParam {
        this.attributes = attributes
        return this
    }

    fun enableSignRes(enableSignRes: Boolean): UpdateSamlIdentityProviderParam {
        this.enableSignRes = enableSignRes
        return this
    }

    fun resSignAlgorithm(resSignAlgorithm: String): UpdateSamlIdentityProviderParam {
        this.resSignAlgorithm = resSignAlgorithm
        return this
    }

    fun resAbstractAlgorithm(resAbstractAlgorithm: String): UpdateSamlIdentityProviderParam {
        this.resAbstractAlgorithm = resAbstractAlgorithm
        return this
    }

    fun resSignPublicKey(resSignPublicKey: String): UpdateSamlIdentityProviderParam {
        this.resSignPublicKey = resSignPublicKey
        return this
    }

    fun resSignPrivateKey(resSignPrivateKey: String): UpdateSamlIdentityProviderParam {
        this.resSignPrivateKey = resSignPrivateKey
        return this
    }

    fun resSignPrivateKeyPass(resSignPrivateKeyPass: String): UpdateSamlIdentityProviderParam {
        this.resSignPrivateKeyPass = resSignPrivateKeyPass
        return this
    }

    fun enableSignReq(enableSignReq: Boolean): UpdateSamlIdentityProviderParam {
        this.enableSignReq = enableSignReq
        return this
    }

    fun reqSignPublicKey(reqSignPublicKey: String): UpdateSamlIdentityProviderParam {
        this.reqSignPublicKey = reqSignPublicKey
        return this
    }

    fun enableEncryptRes(enableEncryptRes: Boolean): UpdateSamlIdentityProviderParam {
        this.enableEncryptRes = enableEncryptRes
        return this
    }

    fun resEncryptPublicKey(resEncryptPublicKey: String): UpdateSamlIdentityProviderParam {
        this.resEncryptPublicKey = resEncryptPublicKey
        return this
    }

    fun css(css: String): UpdateSamlIdentityProviderParam {
        this.css = css
        return this
    }

    fun build(): UpdateSamlIdentityProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateSamlIdentityProviderDocument,
                this
        );
    }

    private val updateSamlIdentityProviderDocument: String = """
mutation UpdateSAMLIdentityProvider(${'$'}appId: String!, ${'$'}clientId: String!, ${'$'}domain: String, ${'$'}image: String, ${'$'}name: String, ${'$'}description: String, ${'$'}SPMetadata: String, ${'$'}attributeNameFormat: String, ${'$'}customAttributes: String, ${'$'}emailDomainTransformation: String, ${'$'}authnContextClassRef: String, ${'$'}IdPMetadata: String, ${'$'}assertionConsumerUrl: String, ${'$'}bindings: [String], ${'$'}nameIds: [String], ${'$'}attributes: [String], ${'$'}enableSignRes: Boolean, ${'$'}resSignAlgorithm: String, ${'$'}resAbstractAlgorithm: String, ${'$'}resSignPublicKey: String, ${'$'}resSignPrivateKey: String, ${'$'}resSignPrivateKeyPass: String, ${'$'}enableSignReq: Boolean, ${'$'}reqSignPublicKey: String, ${'$'}enableEncryptRes: Boolean, ${'$'}resEncryptPublicKey: String, ${'$'}css: String) {
  UpdateSAMLIdentityProvider(appId: ${'$'}appId, clientId: ${'$'}clientId, domain: ${'$'}domain, image: ${'$'}image, name: ${'$'}name, description: ${'$'}description, SPMetadata: ${'$'}SPMetadata, attributeNameFormat: ${'$'}attributeNameFormat, customAttributes: ${'$'}customAttributes, emailDomainTransformation: ${'$'}emailDomainTransformation, authnContextClassRef: ${'$'}authnContextClassRef, IdPMetadata: ${'$'}IdPMetadata, assertionConsumerUrl: ${'$'}assertionConsumerUrl, bindings: ${'$'}bindings, nameIds: ${'$'}nameIds, attributes: ${'$'}attributes, enableSignRes: ${'$'}enableSignRes, resSignAlgorithm: ${'$'}resSignAlgorithm, resAbstractAlgorithm: ${'$'}resAbstractAlgorithm, resSignPublicKey: ${'$'}resSignPublicKey, resSignPrivateKey: ${'$'}resSignPrivateKey, resSignPrivateKeyPass: ${'$'}resSignPrivateKeyPass, enableSignReq: ${'$'}enableSignReq, reqSignPublicKey: ${'$'}reqSignPublicKey, enableEncryptRes: ${'$'}enableEncryptRes, resEncryptPublicKey: ${'$'}resEncryptPublicKey, css: ${'$'}css) {
    _id
    name
    domain
    image
    appSecret
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    attributeNameFormat
    customAttributes
    emailDomainTransformation
    authnContextClassRef
    IdPMetadata
    assertionConsumerUrl
    bindings
    nameIds
    attributes
    enableSignRes
    resSignAlgorithm
    resAbstractAlgorithm
    resSignPublicKey
    resSignPrivateKey
    resSignPrivateKeyPass
    enableSignReq
    reqSignPublicKey
    enableEncryptRes
    resEncryptPublicKey
    css
  }
}
"""
}


data class UpdateSamlServiceProviderResponse(

        @SerializedName("UpdateSAMLServiceProvider")
        val result: SamlServiceProviderClient
)

class UpdateSamlServiceProviderParam(@SerializedName("appId")
                                     var appId: String? = null,
                                     @SerializedName("name")
                                     var name: String? = null,
                                     @SerializedName("domain")
                                     var domain: String? = null,
                                     @SerializedName("clientId")
                                     var clientId: String? = null,
                                     @SerializedName("redirectUrl")
                                     var redirectUrl: String? = null,
                                     @SerializedName("loginUrl")
                                     var loginUrl: String? = null,
                                     @SerializedName("logoutUrl")
                                     var logoutUrl: String? = null,
                                     @SerializedName("nameId")
                                     var nameId: String? = null,
                                     @SerializedName("IdPEntityID")
                                     var IdPEntityID: String? = null,
                                     @SerializedName("assertionConsumeService")
                                     var assertionConsumeService: List<AssertionConsumeServiceInputTypeInput>? = null,
                                     @SerializedName("image")
                                     var image: String? = null,
                                     @SerializedName("mappings")
                                     var mappings: AssertionMapInputTypeInput? = null,
                                     @SerializedName("defaultIdPMapId")
                                     var defaultIdPMapId: String? = null,
                                     @SerializedName("description")
                                     var description: String? = null,
                                     @SerializedName("SPMetadata")
                                     var SPMetadata: String? = null,
                                     @SerializedName("IdPMetadata")
                                     var IdPMetadata: String? = null,
                                     @SerializedName("enableSignRes")
                                     var enableSignRes: Boolean? = null,
                                     @SerializedName("resSignPublicKey")
                                     var resSignPublicKey: String? = null,
                                     @SerializedName("hasResEncrypted")
                                     var hasResEncrypted: Boolean? = null,
                                     @SerializedName("resEncryptAlgorithm")
                                     var resEncryptAlgorithm: String? = null,
                                     @SerializedName("resAbstractAlgorithm")
                                     var resAbstractAlgorithm: String? = null,
                                     @SerializedName("resDecryptPrivateKey")
                                     var resDecryptPrivateKey: String? = null,
                                     @SerializedName("resDecryptPrivateKeyPass")
                                     var resDecryptPrivateKeyPass: String? = null,
                                     @SerializedName("resEncryptPublicKey")
                                     var resEncryptPublicKey: String? = null,
                                     @SerializedName("enableSignReq")
                                     var enableSignReq: Boolean? = null,
                                     @SerializedName("reqSignAlgorithm")
                                     var reqSignAlgorithm: String? = null,
                                     @SerializedName("reqAbstractAlgorithm")
                                     var reqAbstractAlgorithm: String? = null,
                                     @SerializedName("reqSignPrivateKey")
                                     var reqSignPrivateKey: String? = null,
                                     @SerializedName("reqSignPrivateKeyPass")
                                     var reqSignPrivateKeyPass: String? = null,
                                     @SerializedName("reqSignPublicKey")
                                     var reqSignPublicKey: String? = null) {

    fun appId(appId: String): UpdateSamlServiceProviderParam {
        this.appId = appId
        return this
    }

    fun name(name: String): UpdateSamlServiceProviderParam {
        this.name = name
        return this
    }

    fun domain(domain: String): UpdateSamlServiceProviderParam {
        this.domain = domain
        return this
    }

    fun clientId(clientId: String): UpdateSamlServiceProviderParam {
        this.clientId = clientId
        return this
    }

    fun redirectUrl(redirectUrl: String): UpdateSamlServiceProviderParam {
        this.redirectUrl = redirectUrl
        return this
    }

    fun loginUrl(loginUrl: String): UpdateSamlServiceProviderParam {
        this.loginUrl = loginUrl
        return this
    }

    fun logoutUrl(logoutUrl: String): UpdateSamlServiceProviderParam {
        this.logoutUrl = logoutUrl
        return this
    }

    fun nameId(nameId: String): UpdateSamlServiceProviderParam {
        this.nameId = nameId
        return this
    }

    fun IdPEntityID(IdPEntityID: String): UpdateSamlServiceProviderParam {
        this.IdPEntityID = IdPEntityID
        return this
    }

    fun assertionConsumeService(assertionConsumeService: List<AssertionConsumeServiceInputTypeInput>): UpdateSamlServiceProviderParam {
        this.assertionConsumeService = assertionConsumeService
        return this
    }

    fun image(image: String): UpdateSamlServiceProviderParam {
        this.image = image
        return this
    }

    fun mappings(mappings: AssertionMapInputTypeInput): UpdateSamlServiceProviderParam {
        this.mappings = mappings
        return this
    }

    fun defaultIdPMapId(defaultIdPMapId: String): UpdateSamlServiceProviderParam {
        this.defaultIdPMapId = defaultIdPMapId
        return this
    }

    fun description(description: String): UpdateSamlServiceProviderParam {
        this.description = description
        return this
    }

    fun SPMetadata(SPMetadata: String): UpdateSamlServiceProviderParam {
        this.SPMetadata = SPMetadata
        return this
    }

    fun IdPMetadata(IdPMetadata: String): UpdateSamlServiceProviderParam {
        this.IdPMetadata = IdPMetadata
        return this
    }

    fun enableSignRes(enableSignRes: Boolean): UpdateSamlServiceProviderParam {
        this.enableSignRes = enableSignRes
        return this
    }

    fun resSignPublicKey(resSignPublicKey: String): UpdateSamlServiceProviderParam {
        this.resSignPublicKey = resSignPublicKey
        return this
    }

    fun hasResEncrypted(hasResEncrypted: Boolean): UpdateSamlServiceProviderParam {
        this.hasResEncrypted = hasResEncrypted
        return this
    }

    fun resEncryptAlgorithm(resEncryptAlgorithm: String): UpdateSamlServiceProviderParam {
        this.resEncryptAlgorithm = resEncryptAlgorithm
        return this
    }

    fun resAbstractAlgorithm(resAbstractAlgorithm: String): UpdateSamlServiceProviderParam {
        this.resAbstractAlgorithm = resAbstractAlgorithm
        return this
    }

    fun resDecryptPrivateKey(resDecryptPrivateKey: String): UpdateSamlServiceProviderParam {
        this.resDecryptPrivateKey = resDecryptPrivateKey
        return this
    }

    fun resDecryptPrivateKeyPass(resDecryptPrivateKeyPass: String): UpdateSamlServiceProviderParam {
        this.resDecryptPrivateKeyPass = resDecryptPrivateKeyPass
        return this
    }

    fun resEncryptPublicKey(resEncryptPublicKey: String): UpdateSamlServiceProviderParam {
        this.resEncryptPublicKey = resEncryptPublicKey
        return this
    }

    fun enableSignReq(enableSignReq: Boolean): UpdateSamlServiceProviderParam {
        this.enableSignReq = enableSignReq
        return this
    }

    fun reqSignAlgorithm(reqSignAlgorithm: String): UpdateSamlServiceProviderParam {
        this.reqSignAlgorithm = reqSignAlgorithm
        return this
    }

    fun reqAbstractAlgorithm(reqAbstractAlgorithm: String): UpdateSamlServiceProviderParam {
        this.reqAbstractAlgorithm = reqAbstractAlgorithm
        return this
    }

    fun reqSignPrivateKey(reqSignPrivateKey: String): UpdateSamlServiceProviderParam {
        this.reqSignPrivateKey = reqSignPrivateKey
        return this
    }

    fun reqSignPrivateKeyPass(reqSignPrivateKeyPass: String): UpdateSamlServiceProviderParam {
        this.reqSignPrivateKeyPass = reqSignPrivateKeyPass
        return this
    }

    fun reqSignPublicKey(reqSignPublicKey: String): UpdateSamlServiceProviderParam {
        this.reqSignPublicKey = reqSignPublicKey
        return this
    }

    fun build(): UpdateSamlServiceProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateSamlServiceProviderDocument,
                this
        );
    }

    private val updateSamlServiceProviderDocument: String = """
mutation UpdateSAMLServiceProvider(${'$'}appId: String!, ${'$'}name: String!, ${'$'}domain: String!, ${'$'}clientId: String!, ${'$'}redirectUrl: String!, ${'$'}loginUrl: String!, ${'$'}logoutUrl: String!, ${'$'}nameId: String!, ${'$'}IdPEntityID: String, ${'$'}assertionConsumeService: [AssertionConsumeServiceInputType], ${'$'}image: String, ${'$'}mappings: AssertionMapInputType, ${'$'}defaultIdPMapId: String, ${'$'}description: String, ${'$'}SPMetadata: String, ${'$'}IdPMetadata: String, ${'$'}enableSignRes: Boolean, ${'$'}resSignPublicKey: String, ${'$'}hasResEncrypted: Boolean, ${'$'}resEncryptAlgorithm: String, ${'$'}resAbstractAlgorithm: String, ${'$'}resDecryptPrivateKey: String, ${'$'}resDecryptPrivateKeyPass: String, ${'$'}resEncryptPublicKey: String, ${'$'}enableSignReq: Boolean, ${'$'}reqSignAlgorithm: String, ${'$'}reqAbstractAlgorithm: String, ${'$'}reqSignPrivateKey: String, ${'$'}reqSignPrivateKeyPass: String, ${'$'}reqSignPublicKey: String) {
  UpdateSAMLServiceProvider(appId: ${'$'}appId, name: ${'$'}name, domain: ${'$'}domain, clientId: ${'$'}clientId, redirectUrl: ${'$'}redirectUrl, loginUrl: ${'$'}loginUrl, logoutUrl: ${'$'}logoutUrl, nameId: ${'$'}nameId, IdPEntityID: ${'$'}IdPEntityID, assertionConsumeService: ${'$'}assertionConsumeService, image: ${'$'}image, mappings: ${'$'}mappings, defaultIdPMapId: ${'$'}defaultIdPMapId, description: ${'$'}description, SPMetadata: ${'$'}SPMetadata, IdPMetadata: ${'$'}IdPMetadata, enableSignRes: ${'$'}enableSignRes, resSignPublicKey: ${'$'}resSignPublicKey, hasResEncrypted: ${'$'}hasResEncrypted, resEncryptAlgorithm: ${'$'}resEncryptAlgorithm, resAbstractAlgorithm: ${'$'}resAbstractAlgorithm, resDecryptPrivateKey: ${'$'}resDecryptPrivateKey, resDecryptPrivateKeyPass: ${'$'}resDecryptPrivateKeyPass, resEncryptPublicKey: ${'$'}resEncryptPublicKey, enableSignReq: ${'$'}enableSignReq, reqSignAlgorithm: ${'$'}reqSignAlgorithm, reqAbstractAlgorithm: ${'$'}reqAbstractAlgorithm, reqSignPrivateKey: ${'$'}reqSignPrivateKey, reqSignPrivateKeyPass: ${'$'}reqSignPrivateKeyPass, reqSignPublicKey: ${'$'}reqSignPublicKey) {
    _id
    name
    domain
    image
    appSecret
    defaultIdPMap {
      _id
      name
      image
      description
      isDeleted
    }
    defaultIdPMapId
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    IdPMetadata
    IdPEntityID
    assertionConsumeService {
      binding
      url
      isDefault
    }
    mappings {
      username
      nickname
      photo
      company
      providerName
      email
    }
    redirectUrl
    loginUrl
    logoutUrl
    nameId
    enableSignRes
    resSignPublicKey
    hasResEncrypted
    resEncryptAlgorithm
    resAbstractAlgorithm
    resDecryptPrivateKey
    resDecryptPrivateKeyPass
    resEncryptPublicKey
    enableSignReq
    reqSignAlgorithm
    reqAbstractAlgorithm
    reqSignPrivateKey
    reqSignPrivateKeyPass
    reqSignPublicKey
    SPUrl
  }
}
"""
}


data class UpdateSystemPricingResponse(

        @SerializedName("UpdateSystemPricing")
        val result: PricingList
)

class UpdateSystemPricingParam(@SerializedName("options")
                               var options: PricingFieldsInput? = null) {

    fun options(options: PricingFieldsInput): UpdateSystemPricingParam {
        this.options = options
        return this
    }

    fun build(): UpdateSystemPricingParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateSystemPricingDocument,
                this
        );
    }

    private val updateSystemPricingDocument: String = """
mutation UpdateSystemPricing(${'$'}options: PricingFieldsInput) {
  UpdateSystemPricing(options: ${'$'}options) {
    _id
    type
    startNumber
    freeNumber
    startPrice
    maxNumber
    d
    features
  }
}
"""
}


data class UseDefaultEmailProviderResponse(

        @SerializedName("UseDefaultEmailProvider")
        val result: Boolean
)

class UseDefaultEmailProviderParam(@SerializedName("user")
                                   var user: String? = null,
                                   @SerializedName("client")
                                   var client: String? = null) {

    fun user(user: String): UseDefaultEmailProviderParam {
        this.user = user
        return this
    }

    fun client(client: String): UseDefaultEmailProviderParam {
        this.client = client
        return this
    }

    fun build(): UseDefaultEmailProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                useDefaultEmailProviderDocument,
                this
        );
    }

    private val useDefaultEmailProviderDocument: String = """
mutation UseDefaultEmailProvider(${'$'}user: String!, ${'$'}client: String!) {
  UseDefaultEmailProvider(user: ${'$'}user, client: ${'$'}client)
}
"""
}


data class AddClientWebhookResponse(

        @SerializedName("addClientWebhook")
        val result: ClientWebhook
)

class AddClientWebhookParam(@SerializedName("client")
                            var client: String? = null,
                            @SerializedName("events")
                            var events: List<String>? = null,
                            @SerializedName("url")
                            var url: String? = null,
                            @SerializedName("contentType")
                            var contentType: String? = null,
                            @SerializedName("enable")
                            var enable: Boolean? = null,
                            @SerializedName("secret")
                            var secret: String? = null,
                            @SerializedName("isLastTimeSuccess")
                            var isLastTimeSuccess: Boolean? = null) {

    fun client(client: String): AddClientWebhookParam {
        this.client = client
        return this
    }

    fun events(events: List<String>): AddClientWebhookParam {
        this.events = events
        return this
    }

    fun url(url: String): AddClientWebhookParam {
        this.url = url
        return this
    }

    fun contentType(contentType: String): AddClientWebhookParam {
        this.contentType = contentType
        return this
    }

    fun enable(enable: Boolean): AddClientWebhookParam {
        this.enable = enable
        return this
    }

    fun secret(secret: String): AddClientWebhookParam {
        this.secret = secret
        return this
    }

    fun isLastTimeSuccess(isLastTimeSuccess: Boolean): AddClientWebhookParam {
        this.isLastTimeSuccess = isLastTimeSuccess
        return this
    }

    fun build(): AddClientWebhookParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addClientWebhookDocument,
                this
        );
    }

    private val addClientWebhookDocument: String = """
mutation addClientWebhook(${'$'}client: String!, ${'$'}events: [String!]!, ${'$'}url: String!, ${'$'}contentType: String!, ${'$'}enable: Boolean!, ${'$'}secret: String, ${'$'}isLastTimeSuccess: Boolean) {
  addClientWebhook(client: ${'$'}client, events: ${'$'}events, url: ${'$'}url, contentType: ${'$'}contentType, enable: ${'$'}enable, secret: ${'$'}secret, isLastTimeSuccess: ${'$'}isLastTimeSuccess) {
    _id
    client
    events {
      name
      label
      description
    }
    url
    isLastTimeSuccess
    contentType
    secret
    enable
  }
}
"""
}


data class AddCollaboratorResponse(

        @SerializedName("addCollaborator")
        val result: Collaboration
)

class AddCollaboratorParam(@SerializedName("userPoolId")
                           var userPoolId: String? = null,
                           @SerializedName("collaboratorUserId")
                           var collaboratorUserId: String? = null,
                           @SerializedName("permissionDescriptors")
                           var permissionDescriptors: List<PermissionDescriptorsInputTypeInput>? = null) {

    fun userPoolId(userPoolId: String): AddCollaboratorParam {
        this.userPoolId = userPoolId
        return this
    }

    fun collaboratorUserId(collaboratorUserId: String): AddCollaboratorParam {
        this.collaboratorUserId = collaboratorUserId
        return this
    }

    fun permissionDescriptors(permissionDescriptors: List<PermissionDescriptorsInputTypeInput>): AddCollaboratorParam {
        this.permissionDescriptors = permissionDescriptors
        return this
    }

    fun build(): AddCollaboratorParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addCollaboratorDocument,
                this
        );
    }

    private val addCollaboratorDocument: String = """
mutation addCollaborator(${'$'}userPoolId: String!, ${'$'}collaboratorUserId: String!, ${'$'}permissionDescriptors: [PermissionDescriptorsInputType]!) {
  addCollaborator(userPoolId: ${'$'}userPoolId, collaboratorUserId: ${'$'}collaboratorUserId, permissionDescriptors: ${'$'}permissionDescriptors) {
    _id
  }
}
"""
}


data class AddGroupMetadataResponse(

        @SerializedName("addGroupMetadata")
        val result: List<GroupMetadata>
)

class AddGroupMetadataParam(@SerializedName("groupId")
                            var groupId: String? = null,
                            @SerializedName("key")
                            var key: String? = null,
                            @SerializedName("value")
                            var value: String? = null) {

    fun groupId(groupId: String): AddGroupMetadataParam {
        this.groupId = groupId
        return this
    }

    fun key(key: String): AddGroupMetadataParam {
        this.key = key
        return this
    }

    fun value(value: String): AddGroupMetadataParam {
        this.value = value
        return this
    }

    fun build(): AddGroupMetadataParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addGroupMetadataDocument,
                this
        );
    }

    private val addGroupMetadataDocument: String = """
mutation addGroupMetadata(${'$'}groupId: String!, ${'$'}key: String!, ${'$'}value: String!) {
  addGroupMetadata(groupId: ${'$'}groupId, key: ${'$'}key, value: ${'$'}value) {
    key
    value
  }
}
"""
}


data class AddOrgNodeResponse(

        @SerializedName("addOrgNode")
        val result: Org
)

class AddOrgNodeParam(@SerializedName("input")
                      var input: AddOrgNodeInput? = null) {

    fun input(input: AddOrgNodeInput): AddOrgNodeParam {
        this.input = input
        return this
    }

    fun build(): AddOrgNodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addOrgNodeDocument,
                this
        );
    }

    private val addOrgNodeDocument: String = """
mutation addOrgNode(${'$'}input: AddOrgNodeInput!) {
  addOrgNode(input: ${'$'}input) {
    _id
    nodes {
      _id
      name
      description
      createdAt
      updatedAt
      children
      root
    }
  }
}
"""
}


data class AddPermissionResponse(

        @SerializedName("addPermission")
        val result: Permission
)

class AddPermissionParam(@SerializedName("name")
                         var name: String? = null,
                         @SerializedName("description")
                         var description: String? = null) {

    fun name(name: String): AddPermissionParam {
        this.name = name
        return this
    }

    fun description(description: String): AddPermissionParam {
        this.description = description
        return this
    }

    fun build(): AddPermissionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addPermissionDocument,
                this
        );
    }

    private val addPermissionDocument: String = """
mutation addPermission(${'$'}name: String!, ${'$'}description: String) {
  addPermission(name: ${'$'}name, description: ${'$'}description) {
    _id
    name
    affect
    description
  }
}
"""
}


data class AddPermissionToRbacRoleResponse(

        @SerializedName("addPermissionToRBACRole")
        val result: RbacRole
)

class AddPermissionToRbacRoleParam(@SerializedName("sortBy")
                                   var sortBy: SortByEnum? = null,
                                   @SerializedName("page")
                                   var page: Int? = null,
                                   @SerializedName("count")
                                   var count: Int? = null,
                                   @SerializedName("input")
                                   var input: AddPermissionToRbacRoleInput? = null) {

    fun sortBy(sortBy: SortByEnum): AddPermissionToRbacRoleParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): AddPermissionToRbacRoleParam {
        this.page = page
        return this
    }

    fun count(count: Int): AddPermissionToRbacRoleParam {
        this.count = count
        return this
    }

    fun input(input: AddPermissionToRbacRoleInput): AddPermissionToRbacRoleParam {
        this.input = input
        return this
    }

    fun build(): AddPermissionToRbacRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addPermissionToRbacRoleDocument,
                this
        );
    }

    private val addPermissionToRbacRoleDocument: String = """
mutation addPermissionToRBACRole(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: AddPermissionToRBACRoleInput!) {
  addPermissionToRBACRole(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class AddPermissionToRbacRoleBatchResponse(

        @SerializedName("addPermissionToRBACRoleBatch")
        val result: RbacRole
)

class AddPermissionToRbacRoleBatchParam(@SerializedName("sortBy")
                                        var sortBy: SortByEnum? = null,
                                        @SerializedName("page")
                                        var page: Int? = null,
                                        @SerializedName("count")
                                        var count: Int? = null,
                                        @SerializedName("input")
                                        var input: AddPermissionToRbacRoleBatchInput? = null) {

    fun sortBy(sortBy: SortByEnum): AddPermissionToRbacRoleBatchParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): AddPermissionToRbacRoleBatchParam {
        this.page = page
        return this
    }

    fun count(count: Int): AddPermissionToRbacRoleBatchParam {
        this.count = count
        return this
    }

    fun input(input: AddPermissionToRbacRoleBatchInput): AddPermissionToRbacRoleBatchParam {
        this.input = input
        return this
    }

    fun build(): AddPermissionToRbacRoleBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addPermissionToRbacRoleBatchDocument,
                this
        );
    }

    private val addPermissionToRbacRoleBatchDocument: String = """
mutation addPermissionToRBACRoleBatch(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: AddPermissionToRBACRoleBatchInput) {
  addPermissionToRBACRoleBatch(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class AddRoleToRbacGroupResponse(

        @SerializedName("addRoleToRBACGroup")
        val result: RbacGroup
)

class AddRoleToRbacGroupParam(@SerializedName("sortBy")
                              var sortBy: SortByEnum? = null,
                              @SerializedName("page")
                              var page: Int? = null,
                              @SerializedName("count")
                              var count: Int? = null,
                              @SerializedName("input")
                              var input: AddRoleToRbacGroupInput? = null) {

    fun sortBy(sortBy: SortByEnum): AddRoleToRbacGroupParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): AddRoleToRbacGroupParam {
        this.page = page
        return this
    }

    fun count(count: Int): AddRoleToRbacGroupParam {
        this.count = count
        return this
    }

    fun input(input: AddRoleToRbacGroupInput): AddRoleToRbacGroupParam {
        this.input = input
        return this
    }

    fun build(): AddRoleToRbacGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addRoleToRbacGroupDocument,
                this
        );
    }

    private val addRoleToRbacGroupDocument: String = """
mutation addRoleToRBACGroup(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: AddRoleToRBACGroupInput!) {
  addRoleToRBACGroup(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class AddRoleToRbacGroupBatchResponse(

        @SerializedName("addRoleToRBACGroupBatch")
        val result: RbacGroup
)

class AddRoleToRbacGroupBatchParam(@SerializedName("sortBy")
                                   var sortBy: SortByEnum? = null,
                                   @SerializedName("page")
                                   var page: Int? = null,
                                   @SerializedName("count")
                                   var count: Int? = null,
                                   @SerializedName("input")
                                   var input: AddRoleToRbacGroupBatchInput? = null) {

    fun sortBy(sortBy: SortByEnum): AddRoleToRbacGroupBatchParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): AddRoleToRbacGroupBatchParam {
        this.page = page
        return this
    }

    fun count(count: Int): AddRoleToRbacGroupBatchParam {
        this.count = count
        return this
    }

    fun input(input: AddRoleToRbacGroupBatchInput): AddRoleToRbacGroupBatchParam {
        this.input = input
        return this
    }

    fun build(): AddRoleToRbacGroupBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addRoleToRbacGroupBatchDocument,
                this
        );
    }

    private val addRoleToRbacGroupBatchDocument: String = """
mutation addRoleToRBACGroupBatch(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: AddRoleToRBACGroupBatchInput!) {
  addRoleToRBACGroupBatch(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class AddSuperAdminUserResponse(

        @SerializedName("addSuperAdminUser")
        val result: UsersInGroupListItem
)

class AddSuperAdminUserParam(@SerializedName("options")
                             var options: SuperAdminUpdateInput? = null) {

    fun options(options: SuperAdminUpdateInput): AddSuperAdminUserParam {
        this.options = options
        return this
    }

    fun build(): AddSuperAdminUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addSuperAdminUserDocument,
                this
        );
    }

    private val addSuperAdminUserDocument: String = """
mutation addSuperAdminUser(${'$'}options: SuperAdminUpdateInput!) {
  addSuperAdminUser(options: ${'$'}options) {
    email
    username
    _id
    upgrade
  }
}
"""
}


data class AddToInvitationResponse(

        @SerializedName("addToInvitation")
        val result: Invitation
)

class AddToInvitationParam(@SerializedName("client")
                           var client: String? = null,
                           @SerializedName("phone")
                           var phone: String? = null) {

    fun client(client: String): AddToInvitationParam {
        this.client = client
        return this
    }

    fun phone(phone: String): AddToInvitationParam {
        this.phone = phone
        return this
    }

    fun build(): AddToInvitationParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addToInvitationDocument,
                this
        );
    }

    private val addToInvitationDocument: String = """
mutation addToInvitation(${'$'}client: String!, ${'$'}phone: String) {
  addToInvitation(client: ${'$'}client, phone: ${'$'}phone) {
    client
    phone
    isDeleted
    createdAt
    updatedAt
  }
}
"""
}


data class AddUserToRbacGroupResponse(

        @SerializedName("addUserToRBACGroup")
        val result: RbacGroup
)

class AddUserToRbacGroupParam(@SerializedName("sortBy")
                              var sortBy: SortByEnum? = null,
                              @SerializedName("page")
                              var page: Int? = null,
                              @SerializedName("count")
                              var count: Int? = null,
                              @SerializedName("input")
                              var input: AddUserToRbacGroupInput? = null) {

    fun sortBy(sortBy: SortByEnum): AddUserToRbacGroupParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): AddUserToRbacGroupParam {
        this.page = page
        return this
    }

    fun count(count: Int): AddUserToRbacGroupParam {
        this.count = count
        return this
    }

    fun input(input: AddUserToRbacGroupInput): AddUserToRbacGroupParam {
        this.input = input
        return this
    }

    fun build(): AddUserToRbacGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addUserToRbacGroupDocument,
                this
        );
    }

    private val addUserToRbacGroupDocument: String = """
mutation addUserToRBACGroup(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: AddUserToRBACGroupInput!) {
  addUserToRBACGroup(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class AddUserToRbacGroupBatchResponse(

        @SerializedName("addUserToRBACGroupBatch")
        val result: RbacGroup
)

class AddUserToRbacGroupBatchParam(@SerializedName("sortBy")
                                   var sortBy: SortByEnum? = null,
                                   @SerializedName("page")
                                   var page: Int? = null,
                                   @SerializedName("count")
                                   var count: Int? = null,
                                   @SerializedName("input")
                                   var input: AddUserToRbacGroupBatchInput? = null) {

    fun sortBy(sortBy: SortByEnum): AddUserToRbacGroupBatchParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): AddUserToRbacGroupBatchParam {
        this.page = page
        return this
    }

    fun count(count: Int): AddUserToRbacGroupBatchParam {
        this.count = count
        return this
    }

    fun input(input: AddUserToRbacGroupBatchInput): AddUserToRbacGroupBatchParam {
        this.input = input
        return this
    }

    fun build(): AddUserToRbacGroupBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                addUserToRbacGroupBatchDocument,
                this
        );
    }

    private val addUserToRbacGroupBatchDocument: String = """
mutation addUserToRBACGroupBatch(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: AddUserToRBACGroupBatchInput!) {
  addUserToRBACGroupBatch(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class AssignRbacRoleToUserResponse(

        @SerializedName("assignRBACRoleToUser")
        val result: RbacRole
)

class AssignRbacRoleToUserParam(@SerializedName("sortBy")
                                var sortBy: SortByEnum? = null,
                                @SerializedName("page")
                                var page: Int? = null,
                                @SerializedName("count")
                                var count: Int? = null,
                                @SerializedName("input")
                                var input: AssignUserToRbacRoleInput? = null) {

    fun sortBy(sortBy: SortByEnum): AssignRbacRoleToUserParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): AssignRbacRoleToUserParam {
        this.page = page
        return this
    }

    fun count(count: Int): AssignRbacRoleToUserParam {
        this.count = count
        return this
    }

    fun input(input: AssignUserToRbacRoleInput): AssignRbacRoleToUserParam {
        this.input = input
        return this
    }

    fun build(): AssignRbacRoleToUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                assignRbacRoleToUserDocument,
                this
        );
    }

    private val assignRbacRoleToUserDocument: String = """
mutation assignRBACRoleToUser(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: AssignUserToRBACRoleInput!) {
  assignRBACRoleToUser(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class AssignRbacRoleToUserBatchResponse(

        @SerializedName("assignRBACRoleToUserBatch")
        val result: RbacRole
)

class AssignRbacRoleToUserBatchParam(@SerializedName("sortBy")
                                     var sortBy: SortByEnum? = null,
                                     @SerializedName("page")
                                     var page: Int? = null,
                                     @SerializedName("count")
                                     var count: Int? = null,
                                     @SerializedName("input")
                                     var input: AssignUserToRbacRoleBatchInput? = null) {

    fun sortBy(sortBy: SortByEnum): AssignRbacRoleToUserBatchParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): AssignRbacRoleToUserBatchParam {
        this.page = page
        return this
    }

    fun count(count: Int): AssignRbacRoleToUserBatchParam {
        this.count = count
        return this
    }

    fun input(input: AssignUserToRbacRoleBatchInput): AssignRbacRoleToUserBatchParam {
        this.input = input
        return this
    }

    fun build(): AssignRbacRoleToUserBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                assignRbacRoleToUserBatchDocument,
                this
        );
    }

    private val assignRbacRoleToUserBatchDocument: String = """
mutation assignRBACRoleToUserBatch(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: AssignUserToRBACRoleBatchInput!) {
  assignRBACRoleToUserBatch(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class AssignUserToRoleResponse(

        @SerializedName("assignUserToRole")
        val result: PagedUserGroup
)

class AssignUserToRoleParam(@SerializedName("client")
                            var client: String? = null,
                            @SerializedName("user")
                            var user: String? = null,
                            @SerializedName("group")
                            var group: String? = null) {

    fun client(client: String): AssignUserToRoleParam {
        this.client = client
        return this
    }

    fun user(user: String): AssignUserToRoleParam {
        this.user = user
        return this
    }

    fun group(group: String): AssignUserToRoleParam {
        this.group = group
        return this
    }

    fun build(): AssignUserToRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                assignUserToRoleDocument,
                this
        );
    }

    private val assignUserToRoleDocument: String = """
mutation assignUserToRole(${'$'}client: String!, ${'$'}user: String!, ${'$'}group: String!) {
  assignUserToRole(client: ${'$'}client, user: ${'$'}user, group: ${'$'}group) {
    list {
      _id
      createdAt
    }
    totalCount
  }
}
"""
}


data class BindOtherOAuthResponse(

        @SerializedName("bindOtherOAuth")
        val result: UserOAuthBind
)

class BindOtherOAuthParam(@SerializedName("type")
                          var type: String? = null,
                          @SerializedName("unionid")
                          var unionid: String? = null,
                          @SerializedName("userInfo")
                          var userInfo: String? = null,
                          @SerializedName("client")
                          var client: String? = null,
                          @SerializedName("user")
                          var user: String? = null) {

    fun type(type: String): BindOtherOAuthParam {
        this.type = type
        return this
    }

    fun unionid(unionid: String): BindOtherOAuthParam {
        this.unionid = unionid
        return this
    }

    fun userInfo(userInfo: String): BindOtherOAuthParam {
        this.userInfo = userInfo
        return this
    }

    fun client(client: String): BindOtherOAuthParam {
        this.client = client
        return this
    }

    fun user(user: String): BindOtherOAuthParam {
        this.user = user
        return this
    }

    fun build(): BindOtherOAuthParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                bindOtherOAuthDocument,
                this
        );
    }

    private val bindOtherOAuthDocument: String = """
mutation bindOtherOAuth(${'$'}type: String!, ${'$'}unionid: String!, ${'$'}userInfo: String!, ${'$'}client: String, ${'$'}user: String) {
  bindOtherOAuth(type: ${'$'}type, unionid: ${'$'}unionid, userInfo: ${'$'}userInfo, client: ${'$'}client, user: ${'$'}user) {
    _id
    user
    client
    type
    unionid
    userInfo
    createdAt
  }
}
"""
}


data class ChangeMfaResponse(

        @SerializedName("changeMFA")
        val result: Mfa
)

class ChangeMfaParam(@SerializedName("enable")
                     var enable: Boolean? = null,
                     @SerializedName("userId")
                     var userId: String? = null,
                     @SerializedName("userPoolId")
                     var userPoolId: String? = null,
                     @SerializedName("_id")
                     var _id: String? = null,
                     @SerializedName("refreshKey")
                     var refreshKey: Boolean? = null) {

    fun enable(enable: Boolean): ChangeMfaParam {
        this.enable = enable
        return this
    }

    fun userId(userId: String): ChangeMfaParam {
        this.userId = userId
        return this
    }

    fun userPoolId(userPoolId: String): ChangeMfaParam {
        this.userPoolId = userPoolId
        return this
    }

    fun _id(_id: String): ChangeMfaParam {
        this._id = _id
        return this
    }

    fun refreshKey(refreshKey: Boolean): ChangeMfaParam {
        this.refreshKey = refreshKey
        return this
    }

    fun build(): ChangeMfaParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                changeMfaDocument,
                this
        );
    }

    private val changeMfaDocument: String = """
mutation changeMFA(${'$'}enable: Boolean!, ${'$'}userId: String, ${'$'}userPoolId: String, ${'$'}_id: String, ${'$'}refreshKey: Boolean) {
  changeMFA(enable: ${'$'}enable, userId: ${'$'}userId, userPoolId: ${'$'}userPoolId, _id: ${'$'}_id, refreshKey: ${'$'}refreshKey) {
    _id
    userId
    userPoolId
    enable
    shareKey
  }
}
"""
}


data class ChangePasswordResponse(

        @SerializedName("changePassword")
        val result: ExtendUser
)

class ChangePasswordParam(@SerializedName("password")
                          var password: String? = null,
                          @SerializedName("email")
                          var email: String? = null,
                          @SerializedName("client")
                          var client: String? = null,
                          @SerializedName("verifyCode")
                          var verifyCode: String? = null) {

    fun password(password: String): ChangePasswordParam {
        this.password = password
        return this
    }

    fun email(email: String): ChangePasswordParam {
        this.email = email
        return this
    }

    fun client(client: String): ChangePasswordParam {
        this.client = client
        return this
    }

    fun verifyCode(verifyCode: String): ChangePasswordParam {
        this.verifyCode = verifyCode
        return this
    }

    fun build(): ChangePasswordParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                changePasswordDocument,
                this
        );
    }

    private val changePasswordDocument: String = """
mutation changePassword(${'$'}password: String!, ${'$'}email: String!, ${'$'}client: String!, ${'$'}verifyCode: String!) {
  changePassword(password: ${'$'}password, email: ${'$'}email, client: ${'$'}client, verifyCode: ${'$'}verifyCode) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    group {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userLocation {
      _id
      when
      where
    }
    userLoginHistory {
      totalCount
    }
    systemApplicationType {
      _id
      name
      descriptions
      price
    }
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    customData
    metadata
  }
}
"""
}


data class CreateAdConnectorResponse(

        @SerializedName("createAdConnector")
        val result: AdConnector
)

class CreateAdConnectorParam(@SerializedName("name")
                             var name: String? = null,
                             @SerializedName("logo")
                             var logo: String? = null,
                             @SerializedName("userPoolId")
                             var userPoolId: String? = null) {

    fun name(name: String): CreateAdConnectorParam {
        this.name = name
        return this
    }

    fun logo(logo: String): CreateAdConnectorParam {
        this.logo = logo
        return this
    }

    fun userPoolId(userPoolId: String): CreateAdConnectorParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): CreateAdConnectorParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createAdConnectorDocument,
                this
        );
    }

    private val createAdConnectorDocument: String = """
mutation createAdConnector(${'$'}name: String!, ${'$'}logo: String, ${'$'}userPoolId: String!) {
  createAdConnector(name: ${'$'}name, logo: ${'$'}logo, userPoolId: ${'$'}userPoolId) {
    _id
    name
    secret
    salt
    logo
    enabled
    userPoolId
    status
    createdAt
  }
}
"""
}


data class CreateCustomMfaResponse(

        @SerializedName("createCustomMFA")
        val result: CustomMfa
)

class CreateCustomMfaParam(@SerializedName("userIdInMiniLogin")
                           var userIdInMiniLogin: String? = null,
                           @SerializedName("userPoolId")
                           var userPoolId: String? = null,
                           @SerializedName("name")
                           var name: String? = null,
                           @SerializedName("secret")
                           var secret: String? = null,
                           @SerializedName("remark")
                           var remark: String? = null) {

    fun userIdInMiniLogin(userIdInMiniLogin: String): CreateCustomMfaParam {
        this.userIdInMiniLogin = userIdInMiniLogin
        return this
    }

    fun userPoolId(userPoolId: String): CreateCustomMfaParam {
        this.userPoolId = userPoolId
        return this
    }

    fun name(name: String): CreateCustomMfaParam {
        this.name = name
        return this
    }

    fun secret(secret: String): CreateCustomMfaParam {
        this.secret = secret
        return this
    }

    fun remark(remark: String): CreateCustomMfaParam {
        this.remark = remark
        return this
    }

    fun build(): CreateCustomMfaParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createCustomMfaDocument,
                this
        );
    }

    private val createCustomMfaDocument: String = """
mutation createCustomMFA(${'$'}userIdInMiniLogin: String!, ${'$'}userPoolId: String!, ${'$'}name: String!, ${'$'}secret: String!, ${'$'}remark: String) {
  createCustomMFA(userIdInMiniLogin: ${'$'}userIdInMiniLogin, userPoolId: ${'$'}userPoolId, name: ${'$'}name, secret: ${'$'}secret, remark: ${'$'}remark) {
    _id
    userIdInMiniLogin
    userPoolId {
      _id
      usersCount
      logo
      emailVerifiedDefault
      sendWelcomeEmail
      registerDisabled
      showWXMPQRCode
      useMiniLogin
      useSelfWxapp
      allowedOrigins
      name
      secret
      token
      descriptions
      jwtExpired
      createdAt
      isDeleted
      enableEmail
    }
    remark
    name
    secret
  }
}
"""
}


data class CreateInterConnectionResponse(

        @SerializedName("createInterConnection")
        val result: CommonMessage
)

class CreateInterConnectionParam(@SerializedName("sourceUserPoolId")
                                 var sourceUserPoolId: String? = null,
                                 @SerializedName("sourceUserId")
                                 var sourceUserId: String? = null,
                                 @SerializedName("targetUserPoolId")
                                 var targetUserPoolId: String? = null,
                                 @SerializedName("targetUserId")
                                 var targetUserId: String? = null,
                                 @SerializedName("maxAge")
                                 var maxAge: Int? = null) {

    fun sourceUserPoolId(sourceUserPoolId: String): CreateInterConnectionParam {
        this.sourceUserPoolId = sourceUserPoolId
        return this
    }

    fun sourceUserId(sourceUserId: String): CreateInterConnectionParam {
        this.sourceUserId = sourceUserId
        return this
    }

    fun targetUserPoolId(targetUserPoolId: String): CreateInterConnectionParam {
        this.targetUserPoolId = targetUserPoolId
        return this
    }

    fun targetUserId(targetUserId: String): CreateInterConnectionParam {
        this.targetUserId = targetUserId
        return this
    }

    fun maxAge(maxAge: Int): CreateInterConnectionParam {
        this.maxAge = maxAge
        return this
    }

    fun build(): CreateInterConnectionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createInterConnectionDocument,
                this
        );
    }

    private val createInterConnectionDocument: String = """
mutation createInterConnection(${'$'}sourceUserPoolId: String!, ${'$'}sourceUserId: String!, ${'$'}targetUserPoolId: String!, ${'$'}targetUserId: String!, ${'$'}maxAge: Int!) {
  createInterConnection(sourceUserPoolId: ${'$'}sourceUserPoolId, sourceUserId: ${'$'}sourceUserId, targetUserId: ${'$'}targetUserId, targetUserPoolId: ${'$'}targetUserPoolId, maxAge: ${'$'}maxAge) {
    message
    code
    status
  }
}
"""
}


data class CreateOrgResponse(

        @SerializedName("createOrg")
        val result: Org
)

class CreateOrgParam(@SerializedName("input")
                     var input: CreateOrgInput? = null) {

    fun input(input: CreateOrgInput): CreateOrgParam {
        this.input = input
        return this
    }

    fun build(): CreateOrgParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createOrgDocument,
                this
        );
    }

    private val createOrgDocument: String = """
mutation createOrg(${'$'}input: CreateOrgInput!) {
  createOrg(input: ${'$'}input) {
    _id
    nodes {
      _id
      name
      description
      createdAt
      updatedAt
      children
      root
    }
  }
}
"""
}


data class CreateRbacGroupResponse(

        @SerializedName("createRBACGroup")
        val result: RbacGroup
)

class CreateRbacGroupParam(@SerializedName("input")
                           var input: CreateRbacGroupInput? = null) {

    fun input(input: CreateRbacGroupInput): CreateRbacGroupParam {
        this.input = input
        return this
    }

    fun build(): CreateRbacGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createRbacGroupDocument,
                this
        );
    }

    private val createRbacGroupDocument: String = """
mutation createRBACGroup(${'$'}input: CreateRBACGroupInput!) {
  createRBACGroup(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
  }
}
"""
}


data class CreateRbacPermissionResponse(

        @SerializedName("createRBACPermission")
        val result: RbacPermission
)

class CreateRbacPermissionParam(@SerializedName("input")
                                var input: CreateRbacPermissionInput? = null) {

    fun input(input: CreateRbacPermissionInput): CreateRbacPermissionParam {
        this.input = input
        return this
    }

    fun build(): CreateRbacPermissionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createRbacPermissionDocument,
                this
        );
    }

    private val createRbacPermissionDocument: String = """
mutation createRBACPermission(${'$'}input: CreateRBACPermissionInput!) {
  createRBACPermission(input: ${'$'}input) {
    _id
    name
    userPoolId
    createdAt
    updatedAt
    description
  }
}
"""
}


data class CreateRbacRoleResponse(

        @SerializedName("createRBACRole")
        val result: RbacRole
)

class CreateRbacRoleParam(@SerializedName("sortBy")
                          var sortBy: SortByEnum? = null,
                          @SerializedName("page")
                          var page: Int? = null,
                          @SerializedName("count")
                          var count: Int? = null,
                          @SerializedName("input")
                          var input: CreateRbacRoleInput? = null) {

    fun sortBy(sortBy: SortByEnum): CreateRbacRoleParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): CreateRbacRoleParam {
        this.page = page
        return this
    }

    fun count(count: Int): CreateRbacRoleParam {
        this.count = count
        return this
    }

    fun input(input: CreateRbacRoleInput): CreateRbacRoleParam {
        this.input = input
        return this
    }

    fun build(): CreateRbacRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createRbacRoleDocument,
                this
        );
    }

    private val createRbacRoleDocument: String = """
mutation createRBACRole(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: CreateRBACRoleInput!) {
  createRBACRole(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class CreateRoleResponse(

        @SerializedName("createRole")
        val result: Group
)

class CreateRoleParam(@SerializedName("client")
                      var client: String? = null,
                      @SerializedName("name")
                      var name: String? = null,
                      @SerializedName("descriptions")
                      var descriptions: String? = null) {

    fun client(client: String): CreateRoleParam {
        this.client = client
        return this
    }

    fun name(name: String): CreateRoleParam {
        this.name = name
        return this
    }

    fun descriptions(descriptions: String): CreateRoleParam {
        this.descriptions = descriptions
        return this
    }

    fun build(): CreateRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createRoleDocument,
                this
        );
    }

    private val createRoleDocument: String = """
mutation createRole(${'$'}client: String!, ${'$'}name: String!, ${'$'}descriptions: String) {
  createRole(client: ${'$'}client, name: ${'$'}name, descriptions: ${'$'}descriptions) {
    _id
    name
    descriptions
    client
    permissions
    createdAt
  }
}
"""
}


data class CreateRuleResponse(

        @SerializedName("createRule")
        val result: Rule
)

class CreateRuleParam(@SerializedName("input")
                      var input: CreateRuleInput? = null) {

    fun input(input: CreateRuleInput): CreateRuleParam {
        this.input = input
        return this
    }

    fun build(): CreateRuleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createRuleDocument,
                this
        );
    }

    private val createRuleDocument: String = """
mutation createRule(${'$'}input: CreateRuleInput!) {
  createRule(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    type
    enabled
    faasUrl
    code
    order
    async
    createdAt
    updatedAt
  }
}
"""
}


data class CreateUserResponse(

        @SerializedName("createUser")
        val result: ExtendUser
)

class CreateUserParam(@SerializedName("userInfo")
                      var userInfo: UserRegisterInput? = null,
                      @SerializedName("invitationCode")
                      var invitationCode: String? = null,
                      @SerializedName("keepPassword")
                      var keepPassword: Boolean? = null) {

    fun userInfo(userInfo: UserRegisterInput): CreateUserParam {
        this.userInfo = userInfo
        return this
    }

    fun invitationCode(invitationCode: String): CreateUserParam {
        this.invitationCode = invitationCode
        return this
    }

    fun keepPassword(keepPassword: Boolean): CreateUserParam {
        this.keepPassword = keepPassword
        return this
    }

    fun build(): CreateUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createUserDocument,
                this
        );
    }

    private val createUserDocument: String = """
mutation createUser(${'$'}userInfo: UserRegisterInput!, ${'$'}invitationCode: String, ${'$'}keepPassword: Boolean) {
  createUser(userInfo: ${'$'}userInfo, invitationCode: ${'$'}invitationCode, keepPassword: ${'$'}keepPassword) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    group {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userLocation {
      _id
      when
      where
    }
    userLoginHistory {
      totalCount
    }
    systemApplicationType {
      _id
      name
      descriptions
      price
    }
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    customData
    metadata
  }
}
"""
}


data class CreateUserWithoutAuthenticationResponse(

        @SerializedName("createUserWithoutAuthentication")
        val result: User
)

class CreateUserWithoutAuthenticationParam(@SerializedName("userPoolId")
                                           var userPoolId: String? = null,
                                           @SerializedName("userInfo")
                                           var userInfo: UserRegisterInput? = null,
                                           @SerializedName("forceLogin")
                                           var forceLogin: Boolean? = null) {

    fun userPoolId(userPoolId: String): CreateUserWithoutAuthenticationParam {
        this.userPoolId = userPoolId
        return this
    }

    fun userInfo(userInfo: UserRegisterInput): CreateUserWithoutAuthenticationParam {
        this.userInfo = userInfo
        return this
    }

    fun forceLogin(forceLogin: Boolean): CreateUserWithoutAuthenticationParam {
        this.forceLogin = forceLogin
        return this
    }

    fun build(): CreateUserWithoutAuthenticationParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                createUserWithoutAuthenticationDocument,
                this
        );
    }

    private val createUserWithoutAuthenticationDocument: String = """
mutation createUserWithoutAuthentication(${'$'}userPoolId: String!, ${'$'}userInfo: UserRegisterInput!, ${'$'}forceLogin: Boolean) {
  createUserWithoutAuthentication(userPoolId: ${'$'}userPoolId, userInfo: ${'$'}userInfo, forceLogin: ${'$'}forceLogin) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    metadata
  }
}
"""
}


data class DeleteClientWebhookResponse(

        @SerializedName("deleteClientWebhook")
        val result: ClientWebhook
)

class DeleteClientWebhookParam(@SerializedName("id")
                               var id: String? = null) {

    fun id(id: String): DeleteClientWebhookParam {
        this.id = id
        return this
    }

    fun build(): DeleteClientWebhookParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                deleteClientWebhookDocument,
                this
        );
    }

    private val deleteClientWebhookDocument: String = """
mutation deleteClientWebhook(${'$'}id: String!) {
  deleteClientWebhook(id: ${'$'}id) {
    _id
    client
    events {
      name
      label
      description
    }
    url
    isLastTimeSuccess
    contentType
    secret
    enable
  }
}
"""
}


data class DeleteOrgResponse(

        @SerializedName("deleteOrg")
        val result: CommonMessage
)

class DeleteOrgParam(@SerializedName("_id")
                     var _id: String? = null) {

    fun _id(_id: String): DeleteOrgParam {
        this._id = _id
        return this
    }

    fun build(): DeleteOrgParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                deleteOrgDocument,
                this
        );
    }

    private val deleteOrgDocument: String = """
mutation deleteOrg(${'$'}_id: String!) {
  deleteOrg(_id: ${'$'}_id) {
    message
    code
    status
  }
}
"""
}


data class DeleteRbacGroupResponse(

        @SerializedName("deleteRBACGroup")
        val result: CommonMessage
)

class DeleteRbacGroupParam(@SerializedName("_id")
                           var _id: String? = null) {

    fun _id(_id: String): DeleteRbacGroupParam {
        this._id = _id
        return this
    }

    fun build(): DeleteRbacGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                deleteRbacGroupDocument,
                this
        );
    }

    private val deleteRbacGroupDocument: String = """
mutation deleteRBACGroup(${'$'}_id: String!) {
  deleteRBACGroup(_id: ${'$'}_id) {
    message
    code
    status
  }
}
"""
}


data class DeleteRbacGroupBatchResponse(

        @SerializedName("deleteRBACGroupBatch")
        val result: CommonMessage
)

class DeleteRbacGroupBatchParam(@SerializedName("idList")
                                var idList: List<String>? = null) {

    fun idList(idList: List<String>): DeleteRbacGroupBatchParam {
        this.idList = idList
        return this
    }

    fun build(): DeleteRbacGroupBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                deleteRbacGroupBatchDocument,
                this
        );
    }

    private val deleteRbacGroupBatchDocument: String = """
mutation deleteRBACGroupBatch(${'$'}idList: [String!]!) {
  deleteRBACGroupBatch(idList: ${'$'}idList) {
    message
    code
    status
  }
}
"""
}


data class DeleteRbacPermissionResponse(

        @SerializedName("deleteRBACPermission")
        val result: CommonMessage
)

class DeleteRbacPermissionParam(@SerializedName("_id")
                                var _id: String? = null) {

    fun _id(_id: String): DeleteRbacPermissionParam {
        this._id = _id
        return this
    }

    fun build(): DeleteRbacPermissionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                deleteRbacPermissionDocument,
                this
        );
    }

    private val deleteRbacPermissionDocument: String = """
mutation deleteRBACPermission(${'$'}_id: String!) {
  deleteRBACPermission(_id: ${'$'}_id) {
    message
    code
    status
  }
}
"""
}


data class DeleteRbacPermissionBatchResponse(

        @SerializedName("deleteRBACPermissionBatch")
        val result: CommonMessage
)

class DeleteRbacPermissionBatchParam(@SerializedName("idList")
                                     var idList: List<String>? = null) {

    fun idList(idList: List<String>): DeleteRbacPermissionBatchParam {
        this.idList = idList
        return this
    }

    fun build(): DeleteRbacPermissionBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                deleteRbacPermissionBatchDocument,
                this
        );
    }

    private val deleteRbacPermissionBatchDocument: String = """
mutation deleteRBACPermissionBatch(${'$'}idList: [String!]!) {
  deleteRBACPermissionBatch(idList: ${'$'}idList) {
    message
    code
    status
  }
}
"""
}


data class DeleteRbacRoleResponse(

        @SerializedName("deleteRBACRole")
        val result: CommonMessage
)

class DeleteRbacRoleParam(@SerializedName("_id")
                          var _id: String? = null) {

    fun _id(_id: String): DeleteRbacRoleParam {
        this._id = _id
        return this
    }

    fun build(): DeleteRbacRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                deleteRbacRoleDocument,
                this
        );
    }

    private val deleteRbacRoleDocument: String = """
mutation deleteRBACRole(${'$'}_id: String!) {
  deleteRBACRole(_id: ${'$'}_id) {
    message
    code
    status
  }
}
"""
}


data class DeleteRbacRoleBatchResponse(

        @SerializedName("deleteRBACRoleBatch")
        val result: CommonMessage
)

class DeleteRbacRoleBatchParam(@SerializedName("idList")
                               var idList: List<String>? = null) {

    fun idList(idList: List<String>): DeleteRbacRoleBatchParam {
        this.idList = idList
        return this
    }

    fun build(): DeleteRbacRoleBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                deleteRbacRoleBatchDocument,
                this
        );
    }

    private val deleteRbacRoleBatchDocument: String = """
mutation deleteRBACRoleBatch(${'$'}idList: [String!]!) {
  deleteRBACRoleBatch(idList: ${'$'}idList) {
    message
    code
    status
  }
}
"""
}


data class DeleteRuleResponse(

        @SerializedName("deleteRule")
        val result: CommonMessage
)

class DeleteRuleParam(@SerializedName("_id")
                      var _id: String? = null) {

    fun _id(_id: String): DeleteRuleParam {
        this._id = _id
        return this
    }

    fun build(): DeleteRuleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                deleteRuleDocument,
                this
        );
    }

    private val deleteRuleDocument: String = """
mutation deleteRule(${'$'}_id: String!) {
  deleteRule(_id: ${'$'}_id) {
    message
    code
    status
  }
}
"""
}


data class DisableAdConnectorResponse(

        @SerializedName("disableAdConnector")
        val result: Boolean
)

class DisableAdConnectorParam(@SerializedName("_id")
                              var _id: String? = null) {

    fun _id(_id: String): DisableAdConnectorParam {
        this._id = _id
        return this
    }

    fun build(): DisableAdConnectorParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                disableAdConnectorDocument,
                this
        );
    }

    private val disableAdConnectorDocument: String = """
mutation disableAdConnector(${'$'}_id: String!) {
  disableAdConnector(_id: ${'$'}_id)
}
"""
}


data class DisableAdConnectorForProviderResponse(

        @SerializedName("disableAdConnectorForProvider")
        val result: Boolean
)

class DisableAdConnectorForProviderParam(@SerializedName("providerId")
                                         var providerId: String? = null,
                                         @SerializedName("adConnectorId")
                                         var adConnectorId: String? = null) {

    fun providerId(providerId: String): DisableAdConnectorForProviderParam {
        this.providerId = providerId
        return this
    }

    fun adConnectorId(adConnectorId: String): DisableAdConnectorForProviderParam {
        this.adConnectorId = adConnectorId
        return this
    }

    fun build(): DisableAdConnectorForProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                disableAdConnectorForProviderDocument,
                this
        );
    }

    private val disableAdConnectorForProviderDocument: String = """
mutation disableAdConnectorForProvider(${'$'}providerId: String!, ${'$'}adConnectorId: String!) {
  disableAdConnectorForProvider(providerId: ${'$'}providerId, adConnectorId: ${'$'}adConnectorId)
}
"""
}


data class EnableAdConnectorResponse(

        @SerializedName("enableAdConnector")
        val result: Boolean
)

class EnableAdConnectorParam(@SerializedName("_id")
                             var _id: String? = null) {

    fun _id(_id: String): EnableAdConnectorParam {
        this._id = _id
        return this
    }

    fun build(): EnableAdConnectorParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                enableAdConnectorDocument,
                this
        );
    }

    private val enableAdConnectorDocument: String = """
mutation enableAdConnector(${'$'}_id: String!) {
  enableAdConnector(_id: ${'$'}_id)
}
"""
}


data class EnableAdConnectorForProviderResponse(

        @SerializedName("enableAdConnectorForProvider")
        val result: Boolean
)

class EnableAdConnectorForProviderParam(@SerializedName("providerType")
                                        var providerType: ProviderType? = null,
                                        @SerializedName("providerId")
                                        var providerId: String? = null,
                                        @SerializedName("adConnectorId")
                                        var adConnectorId: String? = null) {

    fun providerType(providerType: ProviderType): EnableAdConnectorForProviderParam {
        this.providerType = providerType
        return this
    }

    fun providerId(providerId: String): EnableAdConnectorForProviderParam {
        this.providerId = providerId
        return this
    }

    fun adConnectorId(adConnectorId: String): EnableAdConnectorForProviderParam {
        this.adConnectorId = adConnectorId
        return this
    }

    fun build(): EnableAdConnectorForProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                enableAdConnectorForProviderDocument,
                this
        );
    }

    private val enableAdConnectorForProviderDocument: String = """
mutation enableAdConnectorForProvider(${'$'}providerType: providerType!, ${'$'}providerId: String!, ${'$'}adConnectorId: String!) {
  enableAdConnectorForProvider(providerType: ${'$'}providerType, providerId: ${'$'}providerId, adConnectorId: ${'$'}adConnectorId)
}
"""
}


data class EnablePasswordFaasResponse(

        @SerializedName("enablePasswordFaas")
        val result: PaaswordFaas
)

class EnablePasswordFaasParam(@SerializedName("client")
                              var client: String? = null,
                              @SerializedName("enable")
                              var enable: Boolean? = null) {

    fun client(client: String): EnablePasswordFaasParam {
        this.client = client
        return this
    }

    fun enable(enable: Boolean): EnablePasswordFaasParam {
        this.enable = enable
        return this
    }

    fun build(): EnablePasswordFaasParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                enablePasswordFaasDocument,
                this
        );
    }

    private val enablePasswordFaasDocument: String = """
mutation enablePasswordFaas(${'$'}client: String!, ${'$'}enable: Boolean!) {
  enablePasswordFaas(client: ${'$'}client, enable: ${'$'}enable) {
    encryptUrl
    decryptUrl
    user
    client
    logs
    enable
    createdAt
    updatedAt
  }
}
"""
}


data class EncryptPasswordResponse(

        @SerializedName("encryptPassword")
        val result: EncryptPassword
)

class EncryptPasswordParam(@SerializedName("password")
                           var password: String? = null,
                           @SerializedName("client")
                           var client: String? = null,
                           @SerializedName("isTest")
                           var isTest: Boolean? = null) {

    fun password(password: String): EncryptPasswordParam {
        this.password = password
        return this
    }

    fun client(client: String): EncryptPasswordParam {
        this.client = client
        return this
    }

    fun isTest(isTest: Boolean): EncryptPasswordParam {
        this.isTest = isTest
        return this
    }

    fun build(): EncryptPasswordParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                encryptPasswordDocument,
                this
        );
    }

    private val encryptPasswordDocument: String = """
mutation encryptPassword(${'$'}password: String!, ${'$'}client: String!, ${'$'}isTest: Boolean) {
  encryptPassword(password: ${'$'}password, client: ${'$'}client, isTest: ${'$'}isTest) {
    _id
    encryptUrl
    decryptUrl
    client
    user
    logs
    enable
    createdAt
    updatedAt
    password
  }
}
"""
}


data class GenerateInvitationCodeResponse(

        @SerializedName("generateInvitationCode")
        val result: InvitationCode
)

class GenerateInvitationCodeParam(@SerializedName("user")
                                  var user: String? = null,
                                  @SerializedName("client")
                                  var client: String? = null) {

    fun user(user: String): GenerateInvitationCodeParam {
        this.user = user
        return this
    }

    fun client(client: String): GenerateInvitationCodeParam {
        this.client = client
        return this
    }

    fun build(): GenerateInvitationCodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                generateInvitationCodeDocument,
                this
        );
    }

    private val generateInvitationCodeDocument: String = """
mutation generateInvitationCode(${'$'}user: String!, ${'$'}client: String!) {
  generateInvitationCode(user: ${'$'}user, client: ${'$'}client) {
    _id
    user
    client
    code
    createdAt
  }
}
"""
}


data class LoginResponse(

        @SerializedName("login")
        val result: ExtendUser
)

class LoginParam(@SerializedName("registerInClient")
                 var registerInClient: String? = null,
                 @SerializedName("phone")
                 var phone: String? = null,
                 @SerializedName("phoneCode")
                 var phoneCode: Int? = null,
                 @SerializedName("unionid")
                 var unionid: String? = null,
                 @SerializedName("openid")
                 var openid: String? = null,
                 @SerializedName("username")
                 var username: String? = null,
                 @SerializedName("email")
                 var email: String? = null,
                 @SerializedName("password")
                 var password: String? = null,
                 @SerializedName("lastIP")
                 var lastIP: String? = null,
                 @SerializedName("verifyCode")
                 var verifyCode: String? = null,
                 @SerializedName("MFACode")
                 var MFACode: String? = null,
                 @SerializedName("fromRegister")
                 var fromRegister: Boolean? = null,
                 @SerializedName("device")
                 var device: String? = null,
                 @SerializedName("browser")
                 var browser: String? = null) {

    fun registerInClient(registerInClient: String): LoginParam {
        this.registerInClient = registerInClient
        return this
    }

    fun phone(phone: String): LoginParam {
        this.phone = phone
        return this
    }

    fun phoneCode(phoneCode: Int): LoginParam {
        this.phoneCode = phoneCode
        return this
    }

    fun unionid(unionid: String): LoginParam {
        this.unionid = unionid
        return this
    }

    fun openid(openid: String): LoginParam {
        this.openid = openid
        return this
    }

    fun username(username: String): LoginParam {
        this.username = username
        return this
    }

    fun email(email: String): LoginParam {
        this.email = email
        return this
    }

    fun password(password: String): LoginParam {
        this.password = password
        return this
    }

    fun lastIP(lastIP: String): LoginParam {
        this.lastIP = lastIP
        return this
    }

    fun verifyCode(verifyCode: String): LoginParam {
        this.verifyCode = verifyCode
        return this
    }

    fun MFACode(MFACode: String): LoginParam {
        this.MFACode = MFACode
        return this
    }

    fun fromRegister(fromRegister: Boolean): LoginParam {
        this.fromRegister = fromRegister
        return this
    }

    fun device(device: String): LoginParam {
        this.device = device
        return this
    }

    fun browser(browser: String): LoginParam {
        this.browser = browser
        return this
    }

    fun build(): LoginParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginDocument,
                this
        );
    }

    private val loginDocument: String = """
mutation login(${'$'}registerInClient: String!, ${'$'}phone: String, ${'$'}phoneCode: Int, ${'$'}unionid: String, ${'$'}openid: String, ${'$'}username: String, ${'$'}email: String, ${'$'}password: String, ${'$'}lastIP: String, ${'$'}verifyCode: String, ${'$'}MFACode: String, ${'$'}fromRegister: Boolean, ${'$'}device: String, ${'$'}browser: String) {
  login(registerInClient: ${'$'}registerInClient, phone: ${'$'}phone, phoneCode: ${'$'}phoneCode, unionid: ${'$'}unionid, openid: ${'$'}openid, username: ${'$'}username, email: ${'$'}email, password: ${'$'}password, lastIP: ${'$'}lastIP, verifyCode: ${'$'}verifyCode, MFACode: ${'$'}MFACode, fromRegister: ${'$'}fromRegister, device: ${'$'}device, browser: ${'$'}browser) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    group {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userLocation {
      _id
      when
      where
    }
    userLoginHistory {
      totalCount
    }
    systemApplicationType {
      _id
      name
      descriptions
      price
    }
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    customData
    metadata
  }
}
"""
}


data class LoginByAdResponse(

        @SerializedName("loginByAd")
        val result: User
)

class LoginByAdParam(@SerializedName("adConnectorId")
                     var adConnectorId: String? = null,
                     @SerializedName("username")
                     var username: String? = null,
                     @SerializedName("password")
                     var password: String? = null) {

    fun adConnectorId(adConnectorId: String): LoginByAdParam {
        this.adConnectorId = adConnectorId
        return this
    }

    fun username(username: String): LoginByAdParam {
        this.username = username
        return this
    }

    fun password(password: String): LoginByAdParam {
        this.password = password
        return this
    }

    fun build(): LoginByAdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginByAdDocument,
                this
        );
    }

    private val loginByAdDocument: String = """
mutation loginByAd(${'$'}adConnectorId: String!, ${'$'}username: String!, ${'$'}password: String!) {
  loginByAd(adConnectorId: ${'$'}adConnectorId, username: ${'$'}username, password: ${'$'}password) {
    _id
    username
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    nickname
    company
    photo
    browser
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    device
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    oldPassword
    metadata
  }
}
"""
}


data class LoginByEmailResponse(

        @SerializedName("login")
        val result: ExtendUser
)

class LoginByEmailParam(@SerializedName("clientId")
                        var clientId: String? = null,
                        @SerializedName("email")
                        var email: String? = null,
                        @SerializedName("password")
                        var password: String? = null) {

    fun clientId(clientId: String): LoginByEmailParam {
        this.clientId = clientId
        return this
    }

    fun email(email: String): LoginByEmailParam {
        this.email = email
        return this
    }

    fun password(password: String): LoginByEmailParam {
        this.password = password
        return this
    }

    fun build(): LoginByEmailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginByEmailDocument,
                this
        );
    }

    private val loginByEmailDocument: String = """
mutation loginByEmail(${'$'}clientId: String!, ${'$'}email: String, ${'$'}password: String) {
  login(registerInClient: ${'$'}clientId, email: ${'$'}email, password: ${'$'}password) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    group {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userLocation {
      _id
      when
      where
    }
    userLoginHistory {
      totalCount
    }
    systemApplicationType {
      _id
      name
      descriptions
      price
    }
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    customData
    metadata
  }
}
"""
}


data class LoginByPhoneCodeResponse(

        @SerializedName("login")
        val result: ExtendUser
)

class LoginByPhoneCodeParam(@SerializedName("clientId")
                            var clientId: String? = null,
                            @SerializedName("phone")
                            var phone: String? = null,
                            @SerializedName("phoneCode")
                            var phoneCode: Int? = null) {

    fun clientId(clientId: String): LoginByPhoneCodeParam {
        this.clientId = clientId
        return this
    }

    fun phone(phone: String): LoginByPhoneCodeParam {
        this.phone = phone
        return this
    }

    fun phoneCode(phoneCode: Int): LoginByPhoneCodeParam {
        this.phoneCode = phoneCode
        return this
    }

    fun build(): LoginByPhoneCodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginByPhoneCodeDocument,
                this
        );
    }

    private val loginByPhoneCodeDocument: String = """
mutation loginByPhoneCode(${'$'}clientId: String!, ${'$'}phone: String, ${'$'}phoneCode: Int) {
  login(registerInClient: ${'$'}clientId, phone: ${'$'}phone, phoneCode: ${'$'}phoneCode) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    group {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userLocation {
      _id
      when
      where
    }
    userLoginHistory {
      totalCount
    }
    systemApplicationType {
      _id
      name
      descriptions
      price
    }
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    customData
    metadata
  }
}
"""
}


data class LoginByPhonePasswordResponse(

        @SerializedName("login")
        val result: ExtendUser
)

class LoginByPhonePasswordParam(@SerializedName("clientId")
                                var clientId: String? = null,
                                @SerializedName("phone")
                                var phone: String? = null,
                                @SerializedName("password")
                                var password: String? = null) {

    fun clientId(clientId: String): LoginByPhonePasswordParam {
        this.clientId = clientId
        return this
    }

    fun phone(phone: String): LoginByPhonePasswordParam {
        this.phone = phone
        return this
    }

    fun password(password: String): LoginByPhonePasswordParam {
        this.password = password
        return this
    }

    fun build(): LoginByPhonePasswordParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginByPhonePasswordDocument,
                this
        );
    }

    private val loginByPhonePasswordDocument: String = """
mutation loginByPhonePassword(${'$'}clientId: String!, ${'$'}phone: String, ${'$'}password: String) {
  login(registerInClient: ${'$'}clientId, phone: ${'$'}phone, password: ${'$'}password) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    group {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userLocation {
      _id
      when
      where
    }
    userLoginHistory {
      totalCount
    }
    systemApplicationType {
      _id
      name
      descriptions
      price
    }
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    customData
    metadata
  }
}
"""
}


data class LoginByUsernameResponse(

        @SerializedName("login")
        val result: ExtendUser
)

class LoginByUsernameParam(@SerializedName("clientId")
                           var clientId: String? = null,
                           @SerializedName("username")
                           var username: String? = null,
                           @SerializedName("password")
                           var password: String? = null) {

    fun clientId(clientId: String): LoginByUsernameParam {
        this.clientId = clientId
        return this
    }

    fun username(username: String): LoginByUsernameParam {
        this.username = username
        return this
    }

    fun password(password: String): LoginByUsernameParam {
        this.password = password
        return this
    }

    fun build(): LoginByUsernameParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginByUsernameDocument,
                this
        );
    }

    private val loginByUsernameDocument: String = """
mutation loginByUsername(${'$'}clientId: String!, ${'$'}username: String, ${'$'}password: String) {
  login(registerInClient: ${'$'}clientId, username: ${'$'}username, password: ${'$'}password) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    group {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userLocation {
      _id
      when
      where
    }
    userLoginHistory {
      totalCount
    }
    systemApplicationType {
      _id
      name
      descriptions
      price
    }
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    customData
    metadata
  }
}
"""
}


data class NewClientResponse(

        @SerializedName("newClient")
        val result: UserClient
)

class NewClientParam(@SerializedName("client")
                     var client: NewUserClientInput? = null) {

    fun client(client: NewUserClientInput): NewClientParam {
        this.client = client
        return this
    }

    fun build(): NewClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                newClientDocument,
                this
        );
    }

    private val newClientDocument: String = """
mutation newClient(${'$'}client: NewUserClientInput!) {
  newClient(client: ${'$'}client) {
    _id
    user {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userPoolTypes {
      _id
      name
      description
      image
      example
    }
    usersCount
    logo
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWXMPQRCode
    useMiniLogin
    useSelfWxapp
    allowedOrigins
    name
    secret
    token
    descriptions
    jwtExpired
    createdAt
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enable
    }
    loginFailCheck {
      timeInterval
      limit
      enable
    }
    enableEmail
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
  }
}
"""
}


data class OauthPasswordLoginResponse(

        @SerializedName("oauthPasswordLogin")
        val result: ExtendUser
)

class OauthPasswordLoginParam(@SerializedName("registerInClient")
                              var registerInClient: String? = null,
                              @SerializedName("phone")
                              var phone: String? = null,
                              @SerializedName("unionid")
                              var unionid: String? = null,
                              @SerializedName("email")
                              var email: String? = null,
                              @SerializedName("password")
                              var password: String? = null,
                              @SerializedName("lastIP")
                              var lastIP: String? = null,
                              @SerializedName("verifyCode")
                              var verifyCode: String? = null) {

    fun registerInClient(registerInClient: String): OauthPasswordLoginParam {
        this.registerInClient = registerInClient
        return this
    }

    fun phone(phone: String): OauthPasswordLoginParam {
        this.phone = phone
        return this
    }

    fun unionid(unionid: String): OauthPasswordLoginParam {
        this.unionid = unionid
        return this
    }

    fun email(email: String): OauthPasswordLoginParam {
        this.email = email
        return this
    }

    fun password(password: String): OauthPasswordLoginParam {
        this.password = password
        return this
    }

    fun lastIP(lastIP: String): OauthPasswordLoginParam {
        this.lastIP = lastIP
        return this
    }

    fun verifyCode(verifyCode: String): OauthPasswordLoginParam {
        this.verifyCode = verifyCode
        return this
    }

    fun build(): OauthPasswordLoginParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                oauthPasswordLoginDocument,
                this
        );
    }

    private val oauthPasswordLoginDocument: String = """
mutation oauthPasswordLogin(${'$'}registerInClient: String!, ${'$'}phone: String, ${'$'}unionid: String, ${'$'}email: String, ${'$'}password: String, ${'$'}lastIP: String, ${'$'}verifyCode: String) {
  oauthPasswordLogin(registerInClient: ${'$'}registerInClient, phone: ${'$'}phone, unionid: ${'$'}unionid, email: ${'$'}email, password: ${'$'}password, lastIP: ${'$'}lastIP, verifyCode: ${'$'}verifyCode) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    group {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userLocation {
      _id
      when
      where
    }
    userLoginHistory {
      totalCount
    }
    systemApplicationType {
      _id
      name
      descriptions
      price
    }
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    customData
    metadata
  }
}
"""
}


data class OrderResponse(

        @SerializedName("order")
        val result: OrderSuccess
)

class OrderParam(@SerializedName("options")
                 var options: OrderAddInput? = null) {

    fun options(options: OrderAddInput): OrderParam {
        this.options = options
        return this
    }

    fun build(): OrderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                orderDocument,
                this
        );
    }

    private val orderDocument: String = """
mutation order(${'$'}options: OrderAddInput!) {
  order(options: ${'$'}options) {
    code
    url
    charge
  }
}
"""
}


data class PasswordLessForceLoginResponse(

        @SerializedName("passwordLessForceLogin")
        val result: User
)

class PasswordLessForceLoginParam(@SerializedName("userPoolId")
                                  var userPoolId: String? = null,
                                  @SerializedName("userId")
                                  var userId: String? = null) {

    fun userPoolId(userPoolId: String): PasswordLessForceLoginParam {
        this.userPoolId = userPoolId
        return this
    }

    fun userId(userId: String): PasswordLessForceLoginParam {
        this.userId = userId
        return this
    }

    fun build(): PasswordLessForceLoginParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                passwordLessForceLoginDocument,
                this
        );
    }

    private val passwordLessForceLoginDocument: String = """
mutation passwordLessForceLogin(${'$'}userPoolId: String!, ${'$'}userId: String!) {
  passwordLessForceLogin(userPoolId: ${'$'}userPoolId, userId: ${'$'}userId) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    metadata
  }
}
"""
}


data class RecordAuthAuditResponse(

        @SerializedName("recordAuthAudit")
        val result: CommonMessage
)

class RecordAuthAuditParam(@SerializedName("userPoolId")
                           var userPoolId: String? = null,
                           @SerializedName("appType")
                           var appType: String? = null,
                           @SerializedName("appId")
                           var appId: String? = null,
                           @SerializedName("userId")
                           var userId: String? = null,
                           @SerializedName("event")
                           var event: String? = null,
                           @SerializedName("message")
                           var message: String? = null) {

    fun userPoolId(userPoolId: String): RecordAuthAuditParam {
        this.userPoolId = userPoolId
        return this
    }

    fun appType(appType: String): RecordAuthAuditParam {
        this.appType = appType
        return this
    }

    fun appId(appId: String): RecordAuthAuditParam {
        this.appId = appId
        return this
    }

    fun userId(userId: String): RecordAuthAuditParam {
        this.userId = userId
        return this
    }

    fun event(event: String): RecordAuthAuditParam {
        this.event = event
        return this
    }

    fun message(message: String): RecordAuthAuditParam {
        this.message = message
        return this
    }

    fun build(): RecordAuthAuditParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                recordAuthAuditDocument,
                this
        );
    }

    private val recordAuthAuditDocument: String = """
mutation recordAuthAudit(${'$'}userPoolId: String!, ${'$'}appType: String!, ${'$'}appId: String!, ${'$'}userId: String!, ${'$'}event: String!, ${'$'}message: String) {
  recordAuthAudit(userPoolId: ${'$'}userPoolId, appType: ${'$'}appType, appId: ${'$'}appId, userId: ${'$'}userId, event: ${'$'}event, message: ${'$'}message) {
    message
    code
    status
  }
}
"""
}


data class RecordRequestResponse(

        @SerializedName("recordRequest")
        val result: CommonMessage
)

class RecordRequestParam(@SerializedName("when")
                         var _when: String? = null,
                         @SerializedName("ip")
                         var ip: String? = null,
                         @SerializedName("responseTime")
                         var responseTime: Int? = null,
                         @SerializedName("size")
                         var size: Int? = null,
                         @SerializedName("from")
                         var from: String? = null) {

    fun _when(_when: String): RecordRequestParam {
        this._when = _when
        return this
    }

    fun ip(ip: String): RecordRequestParam {
        this.ip = ip
        return this
    }

    fun responseTime(responseTime: Int): RecordRequestParam {
        this.responseTime = responseTime
        return this
    }

    fun size(size: Int): RecordRequestParam {
        this.size = size
        return this
    }

    fun from(from: String): RecordRequestParam {
        this.from = from
        return this
    }

    fun build(): RecordRequestParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                recordRequestDocument,
                this
        );
    }

    private val recordRequestDocument: String = """
mutation recordRequest(${'$'}when: String!, ${'$'}ip: String!, ${'$'}responseTime: Int!, ${'$'}size: Int!, ${'$'}from: String) {
  recordRequest(when: ${'$'}when, ip: ${'$'}ip, responseTime: ${'$'}responseTime, size: ${'$'}size, from: ${'$'}from) {
    message
    code
    status
  }
}
"""
}


data class RefreshAdConnectorSecretResponse(

        @SerializedName("refreshAdConnectorSecret")
        val result: AdConnector
)

class RefreshAdConnectorSecretParam(@SerializedName("_id")
                                    var _id: String? = null) {

    fun _id(_id: String): RefreshAdConnectorSecretParam {
        this._id = _id
        return this
    }

    fun build(): RefreshAdConnectorSecretParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                refreshAdConnectorSecretDocument,
                this
        );
    }

    private val refreshAdConnectorSecretDocument: String = """
mutation refreshAdConnectorSecret(${'$'}_id: String) {
  refreshAdConnectorSecret(_id: ${'$'}_id) {
    _id
    name
    secret
    salt
    logo
    enabled
    userPoolId
    status
    createdAt
  }
}
"""
}


data class RefreshAppSecretResponse(

        @SerializedName("refreshAppSecret")
        val result: UserClient
)

class RefreshAppSecretParam(@SerializedName("client")
                            var client: UpdateUserClientInput? = null) {

    fun client(client: UpdateUserClientInput): RefreshAppSecretParam {
        this.client = client
        return this
    }

    fun build(): RefreshAppSecretParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                refreshAppSecretDocument,
                this
        );
    }

    private val refreshAppSecretDocument: String = """
mutation refreshAppSecret(${'$'}client: UpdateUserClientInput!) {
  refreshAppSecret(client: ${'$'}client) {
    _id
    user {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userPoolTypes {
      _id
      name
      description
      image
      example
    }
    usersCount
    logo
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWXMPQRCode
    useMiniLogin
    useSelfWxapp
    allowedOrigins
    name
    secret
    token
    descriptions
    jwtExpired
    createdAt
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enable
    }
    loginFailCheck {
      timeInterval
      limit
      enable
    }
    enableEmail
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
  }
}
"""
}


data class RefreshSignInTokenResponse(

        @SerializedName("refreshSignInToken")
        val result: RefreshedSignInToken
)

class RefreshSignInTokenParam(@SerializedName("oidcAppId")
                              var oidcAppId: String? = null,
                              @SerializedName("userPoolId")
                              var userPoolId: String? = null,
                              @SerializedName("refreshToken")
                              var refreshToken: String? = null) {

    fun oidcAppId(oidcAppId: String): RefreshSignInTokenParam {
        this.oidcAppId = oidcAppId
        return this
    }

    fun userPoolId(userPoolId: String): RefreshSignInTokenParam {
        this.userPoolId = userPoolId
        return this
    }

    fun refreshToken(refreshToken: String): RefreshSignInTokenParam {
        this.refreshToken = refreshToken
        return this
    }

    fun build(): RefreshSignInTokenParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                refreshSignInTokenDocument,
                this
        );
    }

    private val refreshSignInTokenDocument: String = """
mutation refreshSignInToken(${'$'}oidcAppId: String, ${'$'}userPoolId: String, ${'$'}refreshToken: String!) {
  refreshSignInToken(oidcAppId: ${'$'}oidcAppId, userPoolId: ${'$'}userPoolId, refreshToken: ${'$'}refreshToken) {
    access_token
    id_token
    refresh_token
    scope
    expires_in
  }
}
"""
}


data class RefreshThirdPartyTokenResponse(

        @SerializedName("refreshThirdPartyToken")
        val result: RefreshThirdPartyIdentityResult
)

class RefreshThirdPartyTokenParam(@SerializedName("userPoolId")
                                  var userPoolId: String? = null,
                                  @SerializedName("userId")
                                  var userId: String? = null) {

    fun userPoolId(userPoolId: String): RefreshThirdPartyTokenParam {
        this.userPoolId = userPoolId
        return this
    }

    fun userId(userId: String): RefreshThirdPartyTokenParam {
        this.userId = userId
        return this
    }

    fun build(): RefreshThirdPartyTokenParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                refreshThirdPartyTokenDocument,
                this
        );
    }

    private val refreshThirdPartyTokenDocument: String = """
mutation refreshThirdPartyToken(${'$'}userPoolId: String!, ${'$'}userId: String!) {
  refreshThirdPartyToken(userPoolId: ${'$'}userPoolId, userId: ${'$'}userId) {
    refreshSuccess
    message
    provider
    refreshToken
    accessToken
    updatedAt
  }
}
"""
}


data class RefreshTokenResponse(

        @SerializedName("refreshToken")
        val result: RefreshToken
)

class RefreshTokenParam(@SerializedName("client")
                        var client: String? = null,
                        @SerializedName("user")
                        var user: String? = null) {

    fun client(client: String): RefreshTokenParam {
        this.client = client
        return this
    }

    fun user(user: String): RefreshTokenParam {
        this.user = user
        return this
    }

    fun build(): RefreshTokenParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                refreshTokenDocument,
                this
        );
    }

    private val refreshTokenDocument: String = """
mutation refreshToken(${'$'}client: String!, ${'$'}user: String!) {
  refreshToken(client: ${'$'}client, user: ${'$'}user) {
    token
    iat
    exp
  }
}
"""
}


data class RegisterResponse(

        @SerializedName("register")
        val result: ExtendUser
)

class RegisterParam(@SerializedName("userInfo")
                    var userInfo: UserRegisterInput? = null,
                    @SerializedName("invitationCode")
                    var invitationCode: String? = null,
                    @SerializedName("keepPassword")
                    var keepPassword: Boolean? = null) {

    fun userInfo(userInfo: UserRegisterInput): RegisterParam {
        this.userInfo = userInfo
        return this
    }

    fun invitationCode(invitationCode: String): RegisterParam {
        this.invitationCode = invitationCode
        return this
    }

    fun keepPassword(keepPassword: Boolean): RegisterParam {
        this.keepPassword = keepPassword
        return this
    }

    fun build(): RegisterParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                registerDocument,
                this
        );
    }

    private val registerDocument: String = """
mutation register(${'$'}userInfo: UserRegisterInput!, ${'$'}invitationCode: String, ${'$'}keepPassword: Boolean) {
  register(userInfo: ${'$'}userInfo, invitationCode: ${'$'}invitationCode, keepPassword: ${'$'}keepPassword) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    metadata
  }
}
"""
}


data class RemoveAdConnectorResponse(

        @SerializedName("removeAdConnector")
        val result: Boolean
)

class RemoveAdConnectorParam(@SerializedName("_id")
                             var _id: String? = null) {

    fun _id(_id: String): RemoveAdConnectorParam {
        this._id = _id
        return this
    }

    fun build(): RemoveAdConnectorParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeAdConnectorDocument,
                this
        );
    }

    private val removeAdConnectorDocument: String = """
mutation removeAdConnector(${'$'}_id: String!) {
  removeAdConnector(_id: ${'$'}_id)
}
"""
}


data class RemoveCollaboratorResponse(

        @SerializedName("removeCollaborator")
        val result: Collaboration
)

class RemoveCollaboratorParam(@SerializedName("collaborationId")
                              var collaborationId: String? = null) {

    fun collaborationId(collaborationId: String): RemoveCollaboratorParam {
        this.collaborationId = collaborationId
        return this
    }

    fun build(): RemoveCollaboratorParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeCollaboratorDocument,
                this
        );
    }

    private val removeCollaboratorDocument: String = """
mutation removeCollaborator(${'$'}collaborationId: String!) {
  removeCollaborator(collaborationId: ${'$'}collaborationId) {
    _id
    createdAt
    owner {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    collaborator {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    userPool {
      _id
      usersCount
      logo
      emailVerifiedDefault
      sendWelcomeEmail
      registerDisabled
      showWXMPQRCode
      useMiniLogin
      useSelfWxapp
      allowedOrigins
      name
      secret
      token
      descriptions
      jwtExpired
      createdAt
      isDeleted
      enableEmail
    }
    permissionDescriptors {
      permissionId
      name
      operationAllow
    }
  }
}
"""
}


data class RemoveCustomMfaResponse(

        @SerializedName("removeCustomMFA")
        val result: CustomMfa
)

class RemoveCustomMfaParam(@SerializedName("_id")
                           var _id: String? = null) {

    fun _id(_id: String): RemoveCustomMfaParam {
        this._id = _id
        return this
    }

    fun build(): RemoveCustomMfaParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeCustomMfaDocument,
                this
        );
    }

    private val removeCustomMfaDocument: String = """
mutation removeCustomMFA(${'$'}_id: String!) {
  removeCustomMFA(_id: ${'$'}_id) {
    _id
    userIdInMiniLogin
    userPoolId {
      _id
      usersCount
      logo
      emailVerifiedDefault
      sendWelcomeEmail
      registerDisabled
      showWXMPQRCode
      useMiniLogin
      useSelfWxapp
      allowedOrigins
      name
      secret
      token
      descriptions
      jwtExpired
      createdAt
      isDeleted
      enableEmail
    }
    remark
    name
    secret
  }
}
"""
}


data class RemoveFromInvitationResponse(

        @SerializedName("removeFromInvitation")
        val result: Invitation
)

class RemoveFromInvitationParam(@SerializedName("client")
                                var client: String? = null,
                                @SerializedName("phone")
                                var phone: String? = null) {

    fun client(client: String): RemoveFromInvitationParam {
        this.client = client
        return this
    }

    fun phone(phone: String): RemoveFromInvitationParam {
        this.phone = phone
        return this
    }

    fun build(): RemoveFromInvitationParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeFromInvitationDocument,
                this
        );
    }

    private val removeFromInvitationDocument: String = """
mutation removeFromInvitation(${'$'}client: String!, ${'$'}phone: String) {
  removeFromInvitation(client: ${'$'}client, phone: ${'$'}phone) {
    client
    phone
    isDeleted
    createdAt
    updatedAt
  }
}
"""
}


data class RemoveOrgNodeResponse(

        @SerializedName("removeOrgNode")
        val result: Org
)

class RemoveOrgNodeParam(@SerializedName("input")
                         var input: RemoveOrgNodeInput? = null) {

    fun input(input: RemoveOrgNodeInput): RemoveOrgNodeParam {
        this.input = input
        return this
    }

    fun build(): RemoveOrgNodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeOrgNodeDocument,
                this
        );
    }

    private val removeOrgNodeDocument: String = """
mutation removeOrgNode(${'$'}input: RemoveOrgNodeInput!) {
  removeOrgNode(input: ${'$'}input) {
    _id
    nodes {
      _id
      name
      description
      createdAt
      updatedAt
      children
      root
    }
  }
}
"""
}


data class RemovePermissionFromRbacRoleResponse(

        @SerializedName("removePermissionFromRBACRole")
        val result: RbacRole
)

class RemovePermissionFromRbacRoleParam(@SerializedName("sortBy")
                                        var sortBy: SortByEnum? = null,
                                        @SerializedName("page")
                                        var page: Int? = null,
                                        @SerializedName("count")
                                        var count: Int? = null,
                                        @SerializedName("input")
                                        var input: RemovePermissionFromRbacRoleInput? = null) {

    fun sortBy(sortBy: SortByEnum): RemovePermissionFromRbacRoleParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RemovePermissionFromRbacRoleParam {
        this.page = page
        return this
    }

    fun count(count: Int): RemovePermissionFromRbacRoleParam {
        this.count = count
        return this
    }

    fun input(input: RemovePermissionFromRbacRoleInput): RemovePermissionFromRbacRoleParam {
        this.input = input
        return this
    }

    fun build(): RemovePermissionFromRbacRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removePermissionFromRbacRoleDocument,
                this
        );
    }

    private val removePermissionFromRbacRoleDocument: String = """
mutation removePermissionFromRBACRole(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: RemovePermissionFromRBACRoleInput!) {
  removePermissionFromRBACRole(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class RemovePermissionFromRbacRoleBatchResponse(

        @SerializedName("removePermissionFromRBACRoleBatch")
        val result: RbacRole
)

class RemovePermissionFromRbacRoleBatchParam(@SerializedName("sortBy")
                                             var sortBy: SortByEnum? = null,
                                             @SerializedName("page")
                                             var page: Int? = null,
                                             @SerializedName("count")
                                             var count: Int? = null,
                                             @SerializedName("input")
                                             var input: RemovePermissionFromRbacRoleBatchInput? = null) {

    fun sortBy(sortBy: SortByEnum): RemovePermissionFromRbacRoleBatchParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RemovePermissionFromRbacRoleBatchParam {
        this.page = page
        return this
    }

    fun count(count: Int): RemovePermissionFromRbacRoleBatchParam {
        this.count = count
        return this
    }

    fun input(input: RemovePermissionFromRbacRoleBatchInput): RemovePermissionFromRbacRoleBatchParam {
        this.input = input
        return this
    }

    fun build(): RemovePermissionFromRbacRoleBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removePermissionFromRbacRoleBatchDocument,
                this
        );
    }

    private val removePermissionFromRbacRoleBatchDocument: String = """
mutation removePermissionFromRBACRoleBatch(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: RemovePermissionFromRBACRoleBatchInput!) {
  removePermissionFromRBACRoleBatch(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class RemoveRoleFromRbacGroupResponse(

        @SerializedName("removeRoleFromRBACGroup")
        val result: RbacGroup
)

class RemoveRoleFromRbacGroupParam(@SerializedName("sortBy")
                                   var sortBy: SortByEnum? = null,
                                   @SerializedName("page")
                                   var page: Int? = null,
                                   @SerializedName("count")
                                   var count: Int? = null,
                                   @SerializedName("input")
                                   var input: RemoveRoleFromRbacGroupInput? = null) {

    fun sortBy(sortBy: SortByEnum): RemoveRoleFromRbacGroupParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RemoveRoleFromRbacGroupParam {
        this.page = page
        return this
    }

    fun count(count: Int): RemoveRoleFromRbacGroupParam {
        this.count = count
        return this
    }

    fun input(input: RemoveRoleFromRbacGroupInput): RemoveRoleFromRbacGroupParam {
        this.input = input
        return this
    }

    fun build(): RemoveRoleFromRbacGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeRoleFromRbacGroupDocument,
                this
        );
    }

    private val removeRoleFromRbacGroupDocument: String = """
mutation removeRoleFromRBACGroup(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: RemoveRoleFromRBACGroupInput!) {
  removeRoleFromRBACGroup(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class RemoveRoleFromRbacGroupBatchResponse(

        @SerializedName("removeRoleFromRBACGroupBatch")
        val result: RbacGroup
)

class RemoveRoleFromRbacGroupBatchParam(@SerializedName("sortBy")
                                        var sortBy: SortByEnum? = null,
                                        @SerializedName("page")
                                        var page: Int? = null,
                                        @SerializedName("count")
                                        var count: Int? = null,
                                        @SerializedName("input")
                                        var input: RemoveRoleFromRbacGroupBatchInput? = null) {

    fun sortBy(sortBy: SortByEnum): RemoveRoleFromRbacGroupBatchParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RemoveRoleFromRbacGroupBatchParam {
        this.page = page
        return this
    }

    fun count(count: Int): RemoveRoleFromRbacGroupBatchParam {
        this.count = count
        return this
    }

    fun input(input: RemoveRoleFromRbacGroupBatchInput): RemoveRoleFromRbacGroupBatchParam {
        this.input = input
        return this
    }

    fun build(): RemoveRoleFromRbacGroupBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeRoleFromRbacGroupBatchDocument,
                this
        );
    }

    private val removeRoleFromRbacGroupBatchDocument: String = """
mutation removeRoleFromRBACGroupBatch(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: RemoveRoleFromRBACGroupBatchInput!) {
  removeRoleFromRBACGroupBatch(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class RemoveRuleEnvResponse(

        @SerializedName("removeRuleEnv")
        val result: PagedRuleEnvVariable
)

class RemoveRuleEnvParam(@SerializedName("input")
                         var input: RemoveRuleEnvInput? = null) {

    fun input(input: RemoveRuleEnvInput): RemoveRuleEnvParam {
        this.input = input
        return this
    }

    fun build(): RemoveRuleEnvParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeRuleEnvDocument,
                this
        );
    }

    private val removeRuleEnvDocument: String = """
mutation removeRuleEnv(${'$'}input: RemoveRuleEnvInput!) {
  removeRuleEnv(input: ${'$'}input) {
    totalCount
    list {
      key
      value
    }
  }
}
"""
}


data class RemoveSuperAdminUserResponse(

        @SerializedName("removeSuperAdminUser")
        val result: UsersInGroupListItem
)

class RemoveSuperAdminUserParam(@SerializedName("_id")
                                var _id: String? = null,
                                @SerializedName("username")
                                var username: String? = null) {

    fun _id(_id: String): RemoveSuperAdminUserParam {
        this._id = _id
        return this
    }

    fun username(username: String): RemoveSuperAdminUserParam {
        this.username = username
        return this
    }

    fun build(): RemoveSuperAdminUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeSuperAdminUserDocument,
                this
        );
    }

    private val removeSuperAdminUserDocument: String = """
mutation removeSuperAdminUser(${'$'}_id: String!, ${'$'}username: String!) {
  removeSuperAdminUser(_id: ${'$'}_id, username: ${'$'}username) {
    email
    username
    _id
    upgrade
  }
}
"""
}


data class RemoveUserClientsResponse(

        @SerializedName("removeUserClients")
        val result: List<UserClient>
)

class RemoveUserClientsParam(@SerializedName("ids")
                             var ids: List<String>? = null) {

    fun ids(ids: List<String>): RemoveUserClientsParam {
        this.ids = ids
        return this
    }

    fun build(): RemoveUserClientsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeUserClientsDocument,
                this
        );
    }

    private val removeUserClientsDocument: String = """
mutation removeUserClients(${'$'}ids: [String]) {
  removeUserClients(ids: ${'$'}ids) {
    _id
    user {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userPoolTypes {
      _id
      name
      description
      image
      example
    }
    usersCount
    logo
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWXMPQRCode
    useMiniLogin
    useSelfWxapp
    allowedOrigins
    name
    secret
    token
    descriptions
    jwtExpired
    createdAt
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enable
    }
    loginFailCheck {
      timeInterval
      limit
      enable
    }
    enableEmail
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
  }
}
"""
}


data class RemoveUserFromGroupResponse(

        @SerializedName("removeUserFromGroup")
        val result: UserGroup
)

class RemoveUserFromGroupParam(@SerializedName("client")
                               var client: String? = null,
                               @SerializedName("user")
                               var user: String? = null,
                               @SerializedName("group")
                               var group: String? = null) {

    fun client(client: String): RemoveUserFromGroupParam {
        this.client = client
        return this
    }

    fun user(user: String): RemoveUserFromGroupParam {
        this.user = user
        return this
    }

    fun group(group: String): RemoveUserFromGroupParam {
        this.group = group
        return this
    }

    fun build(): RemoveUserFromGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeUserFromGroupDocument,
                this
        );
    }

    private val removeUserFromGroupDocument: String = """
mutation removeUserFromGroup(${'$'}client: String!, ${'$'}user: String!, ${'$'}group: String!) {
  removeUserFromGroup(client: ${'$'}client, user: ${'$'}user, group: ${'$'}group) {
    _id
    user {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    client {
      _id
      usersCount
      logo
      emailVerifiedDefault
      sendWelcomeEmail
      registerDisabled
      showWXMPQRCode
      useMiniLogin
      useSelfWxapp
      allowedOrigins
      name
      secret
      token
      descriptions
      jwtExpired
      createdAt
      isDeleted
      enableEmail
    }
    group {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    createdAt
  }
}
"""
}


data class RemoveUserFromRbacGroupResponse(

        @SerializedName("removeUserFromRBACGroup")
        val result: RbacGroup
)

class RemoveUserFromRbacGroupParam(@SerializedName("sortBy")
                                   var sortBy: SortByEnum? = null,
                                   @SerializedName("page")
                                   var page: Int? = null,
                                   @SerializedName("count")
                                   var count: Int? = null,
                                   @SerializedName("input")
                                   var input: RemoveUserFromRbacGroupInput? = null) {

    fun sortBy(sortBy: SortByEnum): RemoveUserFromRbacGroupParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RemoveUserFromRbacGroupParam {
        this.page = page
        return this
    }

    fun count(count: Int): RemoveUserFromRbacGroupParam {
        this.count = count
        return this
    }

    fun input(input: RemoveUserFromRbacGroupInput): RemoveUserFromRbacGroupParam {
        this.input = input
        return this
    }

    fun build(): RemoveUserFromRbacGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeUserFromRbacGroupDocument,
                this
        );
    }

    private val removeUserFromRbacGroupDocument: String = """
mutation removeUserFromRBACGroup(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: RemoveUserFromRBACGroupInput!) {
  removeUserFromRBACGroup(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class RemoveUserFromRbacGroupBatchResponse(

        @SerializedName("removeUserFromRBACGroupBatch")
        val result: RbacGroup
)

class RemoveUserFromRbacGroupBatchParam(@SerializedName("sortBy")
                                        var sortBy: SortByEnum? = null,
                                        @SerializedName("page")
                                        var page: Int? = null,
                                        @SerializedName("count")
                                        var count: Int? = null,
                                        @SerializedName("input")
                                        var input: RemoveUserFromRbacGroupBatchInput? = null) {

    fun sortBy(sortBy: SortByEnum): RemoveUserFromRbacGroupBatchParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RemoveUserFromRbacGroupBatchParam {
        this.page = page
        return this
    }

    fun count(count: Int): RemoveUserFromRbacGroupBatchParam {
        this.count = count
        return this
    }

    fun input(input: RemoveUserFromRbacGroupBatchInput): RemoveUserFromRbacGroupBatchParam {
        this.input = input
        return this
    }

    fun build(): RemoveUserFromRbacGroupBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeUserFromRbacGroupBatchDocument,
                this
        );
    }

    private val removeUserFromRbacGroupBatchDocument: String = """
mutation removeUserFromRBACGroupBatch(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: RemoveUserFromRBACGroupBatchInput!) {
  removeUserFromRBACGroupBatch(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class RemoveUserMetadataResponse(

        @SerializedName("removeUserMetadata")
        val result: UserMetaDataList
)

class RemoveUserMetadataParam(@SerializedName("input")
                              var input: RemoveUserMetadataInput? = null) {

    fun input(input: RemoveUserMetadataInput): RemoveUserMetadataParam {
        this.input = input
        return this
    }

    fun build(): RemoveUserMetadataParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeUserMetadataDocument,
                this
        );
    }

    private val removeUserMetadataDocument: String = """
mutation removeUserMetadata(${'$'}input: RemoveUserMetadataInput!) {
  removeUserMetadata(input: ${'$'}input) {
    totalCount
    list {
      key
      value
    }
  }
}
"""
}


data class RemoveUsersResponse(

        @SerializedName("removeUsers")
        val result: List<User>
)

class RemoveUsersParam(@SerializedName("ids")
                       var ids: List<String>? = null,
                       @SerializedName("registerInClient")
                       var registerInClient: String? = null,
                       @SerializedName("operator")
                       var operator: String? = null) {

    fun ids(ids: List<String>): RemoveUsersParam {
        this.ids = ids
        return this
    }

    fun registerInClient(registerInClient: String): RemoveUsersParam {
        this.registerInClient = registerInClient
        return this
    }

    fun operator(operator: String): RemoveUsersParam {
        this.operator = operator
        return this
    }

    fun build(): RemoveUsersParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                removeUsersDocument,
                this
        );
    }

    private val removeUsersDocument: String = """
mutation removeUsers(${'$'}ids: [String], ${'$'}registerInClient: String, ${'$'}operator: String) {
  removeUsers(ids: ${'$'}ids, registerInClient: ${'$'}registerInClient, operator: ${'$'}operator) {
    _id
  }
}
"""
}


data class ResetPasswordResponse(

        @SerializedName("changePassword")
        val result: ExtendUser
)

class ResetPasswordParam(@SerializedName("email")
                         var email: String? = null,
                         @SerializedName("clientId")
                         var clientId: String? = null,
                         @SerializedName("password")
                         var password: String? = null,
                         @SerializedName("verifyCode")
                         var verifyCode: String? = null) {

    fun email(email: String): ResetPasswordParam {
        this.email = email
        return this
    }

    fun clientId(clientId: String): ResetPasswordParam {
        this.clientId = clientId
        return this
    }

    fun password(password: String): ResetPasswordParam {
        this.password = password
        return this
    }

    fun verifyCode(verifyCode: String): ResetPasswordParam {
        this.verifyCode = verifyCode
        return this
    }

    fun build(): ResetPasswordParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                resetPasswordDocument,
                this
        );
    }

    private val resetPasswordDocument: String = """
mutation resetPassword(${'$'}email: String!, ${'$'}clientId: String!, ${'$'}password: String!, ${'$'}verifyCode: String!) {
  changePassword(email: ${'$'}email, client: ${'$'}clientId, password: ${'$'}password, verifyCode: ${'$'}verifyCode) {
    _id
    email
    emailVerified
    username
    nickname
    company
    photo
    browser
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
  }
}
"""
}


data class ResetUserPoolFromWechatResponse(

        @SerializedName("resetUserPoolFromWechat")
        val result: PagedUsers
)

class ResetUserPoolFromWechatParam(@SerializedName("client")
                                   var client: String? = null,
                                   @SerializedName("registerMethod")
                                   var registerMethod: String? = null,
                                   @SerializedName("limit")
                                   var limit: Int? = null) {

    fun client(client: String): ResetUserPoolFromWechatParam {
        this.client = client
        return this
    }

    fun registerMethod(registerMethod: String): ResetUserPoolFromWechatParam {
        this.registerMethod = registerMethod
        return this
    }

    fun limit(limit: Int): ResetUserPoolFromWechatParam {
        this.limit = limit
        return this
    }

    fun build(): ResetUserPoolFromWechatParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                resetUserPoolFromWechatDocument,
                this
        );
    }

    private val resetUserPoolFromWechatDocument: String = """
mutation resetUserPoolFromWechat(${'$'}client: String!, ${'$'}registerMethod: String!, ${'$'}limit: Int!) {
  resetUserPoolFromWechat(client: ${'$'}client, registerMethod: ${'$'}registerMethod, limit: ${'$'}limit) {
    list {
      _id
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      username
      nickname
      company
      photo
      browser
      device
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      customData
      metadata
    }
    totalCount
  }
}
"""
}


data class RevokeRbacRoleFromUserResponse(

        @SerializedName("revokeRBACRoleFromUser")
        val result: RbacRole
)

class RevokeRbacRoleFromUserParam(@SerializedName("sortBy")
                                  var sortBy: SortByEnum? = null,
                                  @SerializedName("page")
                                  var page: Int? = null,
                                  @SerializedName("count")
                                  var count: Int? = null,
                                  @SerializedName("input")
                                  var input: RevokeRbacRoleFromUserInput? = null) {

    fun sortBy(sortBy: SortByEnum): RevokeRbacRoleFromUserParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RevokeRbacRoleFromUserParam {
        this.page = page
        return this
    }

    fun count(count: Int): RevokeRbacRoleFromUserParam {
        this.count = count
        return this
    }

    fun input(input: RevokeRbacRoleFromUserInput): RevokeRbacRoleFromUserParam {
        this.input = input
        return this
    }

    fun build(): RevokeRbacRoleFromUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                revokeRbacRoleFromUserDocument,
                this
        );
    }

    private val revokeRbacRoleFromUserDocument: String = """
mutation revokeRBACRoleFromUser(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: RevokeRBACRoleFromUserInput!) {
  revokeRBACRoleFromUser(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class RevokeRbacRoleFromUserBatchResponse(

        @SerializedName("revokeRBACRoleFromUserBatch")
        val result: RbacRole
)

class RevokeRbacRoleFromUserBatchParam(@SerializedName("sortBy")
                                       var sortBy: SortByEnum? = null,
                                       @SerializedName("page")
                                       var page: Int? = null,
                                       @SerializedName("count")
                                       var count: Int? = null,
                                       @SerializedName("input")
                                       var input: RevokeRbacRoleFromUserBatchInput? = null) {

    fun sortBy(sortBy: SortByEnum): RevokeRbacRoleFromUserBatchParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RevokeRbacRoleFromUserBatchParam {
        this.page = page
        return this
    }

    fun count(count: Int): RevokeRbacRoleFromUserBatchParam {
        this.count = count
        return this
    }

    fun input(input: RevokeRbacRoleFromUserBatchInput): RevokeRbacRoleFromUserBatchParam {
        this.input = input
        return this
    }

    fun build(): RevokeRbacRoleFromUserBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                revokeRbacRoleFromUserBatchDocument,
                this
        );
    }

    private val revokeRbacRoleFromUserBatchDocument: String = """
mutation revokeRBACRoleFromUserBatch(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: RevokeRBACRoleFromUserBatchInput!) {
  revokeRBACRoleFromUserBatch(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class SendChangeEmailVerifyCodeResponse(

        @SerializedName("sendChangeEmailVerifyCode")
        val result: CommonMessage
)

class SendChangeEmailVerifyCodeParam(@SerializedName("userPoolId")
                                     var userPoolId: String? = null,
                                     @SerializedName("email")
                                     var email: String? = null) {

    fun userPoolId(userPoolId: String): SendChangeEmailVerifyCodeParam {
        this.userPoolId = userPoolId
        return this
    }

    fun email(email: String): SendChangeEmailVerifyCodeParam {
        this.email = email
        return this
    }

    fun build(): SendChangeEmailVerifyCodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                sendChangeEmailVerifyCodeDocument,
                this
        );
    }

    private val sendChangeEmailVerifyCodeDocument: String = """
mutation sendChangeEmailVerifyCode(${'$'}userPoolId: String!, ${'$'}email: String!) {
  sendChangeEmailVerifyCode(userPoolId: ${'$'}userPoolId, email: ${'$'}email) {
    message
    code
    status
  }
}
"""
}


data class SendResetPasswordEmailResponse(

        @SerializedName("sendResetPasswordEmail")
        val result: CommonMessage
)

class SendResetPasswordEmailParam(@SerializedName("client")
                                  var client: String? = null,
                                  @SerializedName("email")
                                  var email: String? = null) {

    fun client(client: String): SendResetPasswordEmailParam {
        this.client = client
        return this
    }

    fun email(email: String): SendResetPasswordEmailParam {
        this.email = email
        return this
    }

    fun build(): SendResetPasswordEmailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                sendResetPasswordEmailDocument,
                this
        );
    }

    private val sendResetPasswordEmailDocument: String = """
mutation sendResetPasswordEmail(${'$'}client: String!, ${'$'}email: String!) {
  sendResetPasswordEmail(client: ${'$'}client, email: ${'$'}email) {
    message
    code
    status
  }
}
"""
}


data class SendVerifyEmailResponse(

        @SerializedName("sendVerifyEmail")
        val result: CommonMessage
)

class SendVerifyEmailParam(@SerializedName("email")
                           var email: String? = null,
                           @SerializedName("client")
                           var client: String? = null,
                           @SerializedName("token")
                           var token: String? = null) {

    fun email(email: String): SendVerifyEmailParam {
        this.email = email
        return this
    }

    fun client(client: String): SendVerifyEmailParam {
        this.client = client
        return this
    }

    fun token(token: String): SendVerifyEmailParam {
        this.token = token
        return this
    }

    fun build(): SendVerifyEmailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                sendVerifyEmailDocument,
                this
        );
    }

    private val sendVerifyEmailDocument: String = """
mutation sendVerifyEmail(${'$'}email: String!, ${'$'}client: String!, ${'$'}token: String) {
  sendVerifyEmail(email: ${'$'}email, client: ${'$'}client, token: ${'$'}token) {
    message
    code
    status
  }
}
"""
}


data class SetInvitationStateResponse(

        @SerializedName("setInvitationState")
        val result: InvitationState
)

class SetInvitationStateParam(@SerializedName("client")
                              var client: String? = null,
                              @SerializedName("enablePhone")
                              var enablePhone: Boolean? = null) {

    fun client(client: String): SetInvitationStateParam {
        this.client = client
        return this
    }

    fun enablePhone(enablePhone: Boolean): SetInvitationStateParam {
        this.enablePhone = enablePhone
        return this
    }

    fun build(): SetInvitationStateParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                setInvitationStateDocument,
                this
        );
    }

    private val setInvitationStateDocument: String = """
mutation setInvitationState(${'$'}client: String!, ${'$'}enablePhone: Boolean) {
  setInvitationState(client: ${'$'}client, enablePhone: ${'$'}enablePhone) {
    client
    enablePhone
    createdAt
    updatedAt
  }
}
"""
}


data class SetRuleEnvResponse(

        @SerializedName("setRuleEnv")
        val result: PagedRuleEnvVariable
)

class SetRuleEnvParam(@SerializedName("input")
                      var input: SetRuleEnvInput? = null) {

    fun input(input: SetRuleEnvInput): SetRuleEnvParam {
        this.input = input
        return this
    }

    fun build(): SetRuleEnvParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                setRuleEnvDocument,
                this
        );
    }

    private val setRuleEnvDocument: String = """
mutation setRuleEnv(${'$'}input: SetRuleEnvInput!) {
  setRuleEnv(input: ${'$'}input) {
    totalCount
    list {
      key
      value
    }
  }
}
"""
}


data class SetUserMetadataResponse(

        @SerializedName("setUserMetadata")
        val result: UserMetaDataList
)

class SetUserMetadataParam(@SerializedName("input")
                           var input: SetUserMetadataInput? = null) {

    fun input(input: SetUserMetadataInput): SetUserMetadataParam {
        this.input = input
        return this
    }

    fun build(): SetUserMetadataParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                setUserMetadataDocument,
                this
        );
    }

    private val setUserMetadataDocument: String = """
mutation setUserMetadata(${'$'}input: SetUserMetadataInput!) {
  setUserMetadata(input: ${'$'}input) {
    totalCount
    list {
      key
      value
    }
  }
}
"""
}


data class SignInResponse(

        @SerializedName("signIn")
        val result: OidcPasswordModeUserInfo
)

class SignInParam(@SerializedName("oidcAppId")
                  var oidcAppId: String? = null,
                  @SerializedName("userPoolId")
                  var userPoolId: String? = null,
                  @SerializedName("email")
                  var email: String? = null,
                  @SerializedName("password")
                  var password: String? = null,
                  @SerializedName("phone")
                  var phone: String? = null,
                  @SerializedName("unionid")
                  var unionid: String? = null,
                  @SerializedName("username")
                  var username: String? = null) {

    fun oidcAppId(oidcAppId: String): SignInParam {
        this.oidcAppId = oidcAppId
        return this
    }

    fun userPoolId(userPoolId: String): SignInParam {
        this.userPoolId = userPoolId
        return this
    }

    fun email(email: String): SignInParam {
        this.email = email
        return this
    }

    fun password(password: String): SignInParam {
        this.password = password
        return this
    }

    fun phone(phone: String): SignInParam {
        this.phone = phone
        return this
    }

    fun unionid(unionid: String): SignInParam {
        this.unionid = unionid
        return this
    }

    fun username(username: String): SignInParam {
        this.username = username
        return this
    }

    fun build(): SignInParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                signInDocument,
                this
        );
    }

    private val signInDocument: String = """
mutation signIn(${'$'}oidcAppId: String, ${'$'}userPoolId: String, ${'$'}email: String, ${'$'}password: String, ${'$'}phone: String, ${'$'}unionid: String, ${'$'}username: String) {
  signIn(oidcAppId: ${'$'}oidcAppId, userPoolId: ${'$'}userPoolId, email: ${'$'}email, password: ${'$'}password, phone: ${'$'}phone, unionid: ${'$'}unionid, username: ${'$'}username) {
    sub
    birthdate
    family_name
    gender
    given_name
    locale
    middle_name
    name
    nickname
    picture
    preferred_username
    profile
    updated_at
    website
    zoneinfo
    username
    _id
    company
    browser
    device
    logins_count
    register_method
    blocked
    last_ip
    register_in_userpool
    last_login
    signed_up
    email
    email_verified
    phone_number
    phone_number_verified
    token
    access_token
    id_token
    refresh_token
    expires_in
    token_type
    scope
  }
}
"""
}


data class UnbindEmailResponse(

        @SerializedName("unbindEmail")
        val result: User
)

class UnbindEmailParam(@SerializedName("user")
                       var user: String? = null,
                       @SerializedName("client")
                       var client: String? = null) {

    fun user(user: String): UnbindEmailParam {
        this.user = user
        return this
    }

    fun client(client: String): UnbindEmailParam {
        this.client = client
        return this
    }

    fun build(): UnbindEmailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                unbindEmailDocument,
                this
        );
    }

    private val unbindEmailDocument: String = """
mutation unbindEmail(${'$'}user: String, ${'$'}client: String) {
  unbindEmail(user: ${'$'}user, client: ${'$'}client) {
    _id
    username
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    nickname
    company
    photo
    browser
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    device
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    oldPassword
    metadata
  }
}
"""
}


data class UnbindOtherOAuthResponse(

        @SerializedName("unbindOtherOAuth")
        val result: UserOAuthBind
)

class UnbindOtherOAuthParam(@SerializedName("type")
                            var type: String? = null,
                            @SerializedName("client")
                            var client: String? = null,
                            @SerializedName("user")
                            var user: String? = null) {

    fun type(type: String): UnbindOtherOAuthParam {
        this.type = type
        return this
    }

    fun client(client: String): UnbindOtherOAuthParam {
        this.client = client
        return this
    }

    fun user(user: String): UnbindOtherOAuthParam {
        this.user = user
        return this
    }

    fun build(): UnbindOtherOAuthParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                unbindOtherOAuthDocument,
                this
        );
    }

    private val unbindOtherOAuthDocument: String = """
mutation unbindOtherOAuth(${'$'}type: String!, ${'$'}client: String, ${'$'}user: String) {
  unbindOtherOAuth(type: ${'$'}type, client: ${'$'}client, user: ${'$'}user) {
    _id
    user
    client
    type
    unionid
    userInfo
    createdAt
  }
}
"""
}


data class UpdateAdConnectorResponse(

        @SerializedName("updateAdConnector")
        val result: AdConnector
)

class UpdateAdConnectorParam(@SerializedName("_id")
                             var _id: String? = null,
                             @SerializedName("name")
                             var name: String? = null,
                             @SerializedName("logo")
                             var logo: String? = null) {

    fun _id(_id: String): UpdateAdConnectorParam {
        this._id = _id
        return this
    }

    fun name(name: String): UpdateAdConnectorParam {
        this.name = name
        return this
    }

    fun logo(logo: String): UpdateAdConnectorParam {
        this.logo = logo
        return this
    }

    fun build(): UpdateAdConnectorParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateAdConnectorDocument,
                this
        );
    }

    private val updateAdConnectorDocument: String = """
mutation updateAdConnector(${'$'}_id: String!, ${'$'}name: String, ${'$'}logo: String) {
  updateAdConnector(_id: ${'$'}_id, name: ${'$'}name, logo: ${'$'}logo) {
    _id
    name
    secret
    salt
    logo
    enabled
    userPoolId
    status
    createdAt
  }
}
"""
}


data class UpdateClientWebhookResponse(

        @SerializedName("updateClientWebhook")
        val result: ClientWebhook
)

class UpdateClientWebhookParam(@SerializedName("id")
                               var id: String? = null,
                               @SerializedName("events")
                               var events: List<String>? = null,
                               @SerializedName("url")
                               var url: String? = null,
                               @SerializedName("contentType")
                               var contentType: String? = null,
                               @SerializedName("enable")
                               var enable: Boolean? = null,
                               @SerializedName("secret")
                               var secret: String? = null,
                               @SerializedName("isLastTimeSuccess")
                               var isLastTimeSuccess: Boolean? = null) {

    fun id(id: String): UpdateClientWebhookParam {
        this.id = id
        return this
    }

    fun events(events: List<String>): UpdateClientWebhookParam {
        this.events = events
        return this
    }

    fun url(url: String): UpdateClientWebhookParam {
        this.url = url
        return this
    }

    fun contentType(contentType: String): UpdateClientWebhookParam {
        this.contentType = contentType
        return this
    }

    fun enable(enable: Boolean): UpdateClientWebhookParam {
        this.enable = enable
        return this
    }

    fun secret(secret: String): UpdateClientWebhookParam {
        this.secret = secret
        return this
    }

    fun isLastTimeSuccess(isLastTimeSuccess: Boolean): UpdateClientWebhookParam {
        this.isLastTimeSuccess = isLastTimeSuccess
        return this
    }

    fun build(): UpdateClientWebhookParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateClientWebhookDocument,
                this
        );
    }

    private val updateClientWebhookDocument: String = """
mutation updateClientWebhook(${'$'}id: String!, ${'$'}events: [String!]!, ${'$'}url: String!, ${'$'}contentType: String!, ${'$'}enable: Boolean!, ${'$'}secret: String, ${'$'}isLastTimeSuccess: Boolean) {
  updateClientWebhook(id: ${'$'}id, events: ${'$'}events, url: ${'$'}url, contentType: ${'$'}contentType, enable: ${'$'}enable, secret: ${'$'}secret, isLastTimeSuccess: ${'$'}isLastTimeSuccess) {
    _id
    client
    events {
      name
      label
      description
    }
    url
    isLastTimeSuccess
    contentType
    secret
    enable
  }
}
"""
}


data class UpdateCollaboratorResponse(

        @SerializedName("updateCollaborator")
        val result: Collaboration
)

class UpdateCollaboratorParam(@SerializedName("collaborationId")
                              var collaborationId: String? = null,
                              @SerializedName("permissionDescriptors")
                              var permissionDescriptors: List<PermissionDescriptorsInputTypeInput>? = null) {

    fun collaborationId(collaborationId: String): UpdateCollaboratorParam {
        this.collaborationId = collaborationId
        return this
    }

    fun permissionDescriptors(permissionDescriptors: List<PermissionDescriptorsInputTypeInput>): UpdateCollaboratorParam {
        this.permissionDescriptors = permissionDescriptors
        return this
    }

    fun build(): UpdateCollaboratorParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateCollaboratorDocument,
                this
        );
    }

    private val updateCollaboratorDocument: String = """
mutation updateCollaborator(${'$'}collaborationId: String!, ${'$'}permissionDescriptors: [PermissionDescriptorsInputType]!) {
  updateCollaborator(collaborationId: ${'$'}collaborationId, permissionDescriptors: ${'$'}permissionDescriptors) {
    _id
    createdAt
    owner {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    collaborator {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    userPool {
      _id
      usersCount
      logo
      emailVerifiedDefault
      sendWelcomeEmail
      registerDisabled
      showWXMPQRCode
      useMiniLogin
      useSelfWxapp
      allowedOrigins
      name
      secret
      token
      descriptions
      jwtExpired
      createdAt
      isDeleted
      enableEmail
    }
    permissionDescriptors {
      permissionId
      name
      operationAllow
    }
  }
}
"""
}


data class UpdateEmailResponse(

        @SerializedName("updateEmail")
        val result: User
)

class UpdateEmailParam(@SerializedName("userPoolId")
                       var userPoolId: String? = null,
                       @SerializedName("email")
                       var email: String? = null,
                       @SerializedName("emailCode")
                       var emailCode: String? = null,
                       @SerializedName("oldEmail")
                       var oldEmail: String? = null,
                       @SerializedName("oldEmailCode")
                       var oldEmailCode: String? = null) {

    fun userPoolId(userPoolId: String): UpdateEmailParam {
        this.userPoolId = userPoolId
        return this
    }

    fun email(email: String): UpdateEmailParam {
        this.email = email
        return this
    }

    fun emailCode(emailCode: String): UpdateEmailParam {
        this.emailCode = emailCode
        return this
    }

    fun oldEmail(oldEmail: String): UpdateEmailParam {
        this.oldEmail = oldEmail
        return this
    }

    fun oldEmailCode(oldEmailCode: String): UpdateEmailParam {
        this.oldEmailCode = oldEmailCode
        return this
    }

    fun build(): UpdateEmailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateEmailDocument,
                this
        );
    }

    private val updateEmailDocument: String = """
mutation updateEmail(${'$'}userPoolId: String!, ${'$'}email: String!, ${'$'}emailCode: String!, ${'$'}oldEmail: String, ${'$'}oldEmailCode: String) {
  updateEmail(userPoolId: ${'$'}userPoolId, email: ${'$'}email, emailCode: ${'$'}emailCode, oldEmail: ${'$'}oldEmail, oldEmailCode: ${'$'}oldEmailCode) {
    _id
    username
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    nickname
    company
    photo
    browser
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    device
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    oldPassword
    metadata
  }
}
"""
}


data class UpdatePasswordStrengthSettingsByUserPoolIdResponse(

        @SerializedName("updatePasswordStrengthSettingsByUserPoolId")
        val result: PasswordStrengthSettings
)

class UpdatePasswordStrengthSettingsByUserPoolIdParam(@SerializedName("userPoolId")
                                                      var userPoolId: String? = null,
                                                      @SerializedName("pwdStrength")
                                                      var pwdStrength: Int? = null) {

    fun userPoolId(userPoolId: String): UpdatePasswordStrengthSettingsByUserPoolIdParam {
        this.userPoolId = userPoolId
        return this
    }

    fun pwdStrength(pwdStrength: Int): UpdatePasswordStrengthSettingsByUserPoolIdParam {
        this.pwdStrength = pwdStrength
        return this
    }

    fun build(): UpdatePasswordStrengthSettingsByUserPoolIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updatePasswordStrengthSettingsByUserPoolIdDocument,
                this
        );
    }

    private val updatePasswordStrengthSettingsByUserPoolIdDocument: String = """
mutation updatePasswordStrengthSettingsByUserPoolId(${'$'}userPoolId: String!, ${'$'}pwdStrength: Int) {
  updatePasswordStrengthSettingsByUserPoolId(userPoolId: ${'$'}userPoolId, pwdStrength: ${'$'}pwdStrength) {
    userPoolId
    pwdStrength
  }
}
"""
}


data class UpdatePermissionsResponse(

        @SerializedName("updatePermissions")
        val result: Group
)

class UpdatePermissionsParam(@SerializedName("role")
                             var role: String? = null,
                             @SerializedName("client")
                             var client: String? = null,
                             @SerializedName("permissions")
                             var permissions: String? = null) {

    fun role(role: String): UpdatePermissionsParam {
        this.role = role
        return this
    }

    fun client(client: String): UpdatePermissionsParam {
        this.client = client
        return this
    }

    fun permissions(permissions: String): UpdatePermissionsParam {
        this.permissions = permissions
        return this
    }

    fun build(): UpdatePermissionsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updatePermissionsDocument,
                this
        );
    }

    private val updatePermissionsDocument: String = """
mutation updatePermissions(${'$'}role: String!, ${'$'}client: String!, ${'$'}permissions: String) {
  updatePermissions(role: ${'$'}role, client: ${'$'}client, permissions: ${'$'}permissions) {
    _id
    name
    descriptions
    client
    permissions
    createdAt
  }
}
"""
}


data class UpdatePhoneResponse(

        @SerializedName("updatePhone")
        val result: User
)

class UpdatePhoneParam(@SerializedName("userPoolId")
                       var userPoolId: String? = null,
                       @SerializedName("phone")
                       var phone: String? = null,
                       @SerializedName("phoneCode")
                       var phoneCode: String? = null,
                       @SerializedName("oldPhone")
                       var oldPhone: String? = null,
                       @SerializedName("oldPhoneCode")
                       var oldPhoneCode: String? = null) {

    fun userPoolId(userPoolId: String): UpdatePhoneParam {
        this.userPoolId = userPoolId
        return this
    }

    fun phone(phone: String): UpdatePhoneParam {
        this.phone = phone
        return this
    }

    fun phoneCode(phoneCode: String): UpdatePhoneParam {
        this.phoneCode = phoneCode
        return this
    }

    fun oldPhone(oldPhone: String): UpdatePhoneParam {
        this.oldPhone = oldPhone
        return this
    }

    fun oldPhoneCode(oldPhoneCode: String): UpdatePhoneParam {
        this.oldPhoneCode = oldPhoneCode
        return this
    }

    fun build(): UpdatePhoneParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updatePhoneDocument,
                this
        );
    }

    private val updatePhoneDocument: String = """
mutation updatePhone(${'$'}userPoolId: String!, ${'$'}phone: String!, ${'$'}phoneCode: String!, ${'$'}oldPhone: String, ${'$'}oldPhoneCode: String) {
  updatePhone(userPoolId: ${'$'}userPoolId, phone: ${'$'}phone, phoneCode: ${'$'}phoneCode, oldPhone: ${'$'}oldPhone, oldPhoneCode: ${'$'}oldPhoneCode) {
    _id
    username
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    nickname
    company
    photo
    browser
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    device
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    oldPassword
    metadata
  }
}
"""
}


data class UpdateRbacGroupResponse(

        @SerializedName("updateRBACGroup")
        val result: RbacGroup
)

class UpdateRbacGroupParam(@SerializedName("sortBy")
                           var sortBy: SortByEnum? = null,
                           @SerializedName("page")
                           var page: Int? = null,
                           @SerializedName("count")
                           var count: Int? = null,
                           @SerializedName("input")
                           var input: UpdateRbacGroupInput? = null) {

    fun sortBy(sortBy: SortByEnum): UpdateRbacGroupParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): UpdateRbacGroupParam {
        this.page = page
        return this
    }

    fun count(count: Int): UpdateRbacGroupParam {
        this.count = count
        return this
    }

    fun input(input: UpdateRbacGroupInput): UpdateRbacGroupParam {
        this.input = input
        return this
    }

    fun build(): UpdateRbacGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateRbacGroupDocument,
                this
        );
    }

    private val updateRbacGroupDocument: String = """
mutation updateRBACGroup(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: UpdateRBACGroupInput!) {
  updateRBACGroup(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class UpdateRbacPermissionResponse(

        @SerializedName("updateRBACPermission")
        val result: RbacPermission
)

class UpdateRbacPermissionParam(@SerializedName("input")
                                var input: UpdateRbacPermissionInput? = null) {

    fun input(input: UpdateRbacPermissionInput): UpdateRbacPermissionParam {
        this.input = input
        return this
    }

    fun build(): UpdateRbacPermissionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateRbacPermissionDocument,
                this
        );
    }

    private val updateRbacPermissionDocument: String = """
mutation updateRBACPermission(${'$'}input: UpdateRBACPermissionInput!) {
  updateRBACPermission(input: ${'$'}input) {
    _id
    name
    userPoolId
    createdAt
    updatedAt
    description
  }
}
"""
}


data class UpdateRbacRoleResponse(

        @SerializedName("updateRBACRole")
        val result: RbacRole
)

class UpdateRbacRoleParam(@SerializedName("sortBy")
                          var sortBy: SortByEnum? = null,
                          @SerializedName("page")
                          var page: Int? = null,
                          @SerializedName("count")
                          var count: Int? = null,
                          @SerializedName("input")
                          var input: UpdateRbacRoleInput? = null) {

    fun sortBy(sortBy: SortByEnum): UpdateRbacRoleParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): UpdateRbacRoleParam {
        this.page = page
        return this
    }

    fun count(count: Int): UpdateRbacRoleParam {
        this.count = count
        return this
    }

    fun input(input: UpdateRbacRoleInput): UpdateRbacRoleParam {
        this.input = input
        return this
    }

    fun build(): UpdateRbacRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateRbacRoleDocument,
                this
        );
    }

    private val updateRbacRoleDocument: String = """
mutation updateRBACRole(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}input: UpdateRBACRoleInput!) {
  updateRBACRole(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class UpdateRoleResponse(

        @SerializedName("updateRole")
        val result: Group
)

class UpdateRoleParam(@SerializedName("_id")
                      var _id: String? = null,
                      @SerializedName("client")
                      var client: String? = null,
                      @SerializedName("name")
                      var name: String? = null,
                      @SerializedName("descriptions")
                      var descriptions: String? = null,
                      @SerializedName("permissions")
                      var permissions: String? = null) {

    fun _id(_id: String): UpdateRoleParam {
        this._id = _id
        return this
    }

    fun client(client: String): UpdateRoleParam {
        this.client = client
        return this
    }

    fun name(name: String): UpdateRoleParam {
        this.name = name
        return this
    }

    fun descriptions(descriptions: String): UpdateRoleParam {
        this.descriptions = descriptions
        return this
    }

    fun permissions(permissions: String): UpdateRoleParam {
        this.permissions = permissions
        return this
    }

    fun build(): UpdateRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateRoleDocument,
                this
        );
    }

    private val updateRoleDocument: String = """
mutation updateRole(${'$'}_id: String!, ${'$'}client: String!, ${'$'}name: String!, ${'$'}descriptions: String, ${'$'}permissions: String) {
  updateRole(_id: ${'$'}_id, client: ${'$'}client, name: ${'$'}name, descriptions: ${'$'}descriptions, permissions: ${'$'}permissions) {
    _id
    name
    descriptions
    client
    permissions
    createdAt
  }
}
"""
}


data class UpdateRuleResponse(

        @SerializedName("updateRule")
        val result: Rule
)

class UpdateRuleParam(@SerializedName("input")
                      var input: UpdateRuleInput? = null) {

    fun input(input: UpdateRuleInput): UpdateRuleParam {
        this.input = input
        return this
    }

    fun build(): UpdateRuleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateRuleDocument,
                this
        );
    }

    private val updateRuleDocument: String = """
mutation updateRule(${'$'}input: UpdateRuleInput!) {
  updateRule(input: ${'$'}input) {
    _id
    userPoolId
    name
    description
    type
    enabled
    faasUrl
    code
    order
    async
    createdAt
    updatedAt
  }
}
"""
}


data class UpdateRuleOrderResponse(

        @SerializedName("updateRuleOrder")
        val result: CommonMessage
)

class UpdateRuleOrderParam(@SerializedName("input")
                           var input: UpdateRuleOrderInput? = null) {

    fun input(input: UpdateRuleOrderInput): UpdateRuleOrderParam {
        this.input = input
        return this
    }

    fun build(): UpdateRuleOrderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateRuleOrderDocument,
                this
        );
    }

    private val updateRuleOrderDocument: String = """
mutation updateRuleOrder(${'$'}input: UpdateRuleOrderInput!) {
  updateRuleOrder(input: ${'$'}input) {
    message
    code
    status
  }
}
"""
}


data class UpdateSuperAdminUserResponse(

        @SerializedName("updateSuperAdminUser")
        val result: UsersInGroupListItem
)

class UpdateSuperAdminUserParam(@SerializedName("options")
                                var options: SuperAdminUpdateInput? = null) {

    fun options(options: SuperAdminUpdateInput): UpdateSuperAdminUserParam {
        this.options = options
        return this
    }

    fun build(): UpdateSuperAdminUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateSuperAdminUserDocument,
                this
        );
    }

    private val updateSuperAdminUserDocument: String = """
mutation updateSuperAdminUser(${'$'}options: SuperAdminUpdateInput!) {
  updateSuperAdminUser(options: ${'$'}options) {
    email
    username
    _id
    upgrade
  }
}
"""
}


data class UpdateUserResponse(

        @SerializedName("updateUser")
        val result: User
)

class UpdateUserParam(@SerializedName("options")
                      var options: UserUpdateInput? = null) {

    fun options(options: UserUpdateInput): UpdateUserParam {
        this.options = options
        return this
    }

    fun build(): UpdateUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateUserDocument,
                this
        );
    }

    private val updateUserDocument: String = """
mutation updateUser(${'$'}options: UserUpdateInput!) {
  updateUser(options: ${'$'}options) {
    _id
    username
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    nickname
    company
    photo
    browser
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    device
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    thirdPartyIdentity {
      provider
      refreshToken
      accessToken
      expiresIn
      updatedAt
    }
    oldPassword
    metadata
  }
}
"""
}


data class UpdateUserClientResponse(

        @SerializedName("updateUserClient")
        val result: UserClient
)

class UpdateUserClientParam(@SerializedName("client")
                            var client: UpdateUserClientInput? = null) {

    fun client(client: UpdateUserClientInput): UpdateUserClientParam {
        this.client = client
        return this
    }

    fun build(): UpdateUserClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                updateUserClientDocument,
                this
        );
    }

    private val updateUserClientDocument: String = """
mutation updateUserClient(${'$'}client: UpdateUserClientInput!) {
  updateUserClient(client: ${'$'}client) {
    _id
    user {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userPoolTypes {
      _id
      name
      description
      image
      example
    }
    usersCount
    logo
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWXMPQRCode
    useMiniLogin
    useSelfWxapp
    allowedOrigins
    name
    secret
    token
    descriptions
    jwtExpired
    createdAt
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enable
    }
    loginFailCheck {
      timeInterval
      limit
      enable
    }
    enableEmail
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
  }
}
"""
}


data class VerifyResetPasswordVerifyCodeResponse(

        @SerializedName("verifyResetPasswordVerifyCode")
        val result: CommonMessage
)

class VerifyResetPasswordVerifyCodeParam(@SerializedName("verifyCode")
                                         var verifyCode: String? = null,
                                         @SerializedName("email")
                                         var email: String? = null,
                                         @SerializedName("client")
                                         var client: String? = null) {

    fun verifyCode(verifyCode: String): VerifyResetPasswordVerifyCodeParam {
        this.verifyCode = verifyCode
        return this
    }

    fun email(email: String): VerifyResetPasswordVerifyCodeParam {
        this.email = email
        return this
    }

    fun client(client: String): VerifyResetPasswordVerifyCodeParam {
        this.client = client
        return this
    }

    fun build(): VerifyResetPasswordVerifyCodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                verifyResetPasswordVerifyCodeDocument,
                this
        );
    }

    private val verifyResetPasswordVerifyCodeDocument: String = """
mutation verifyResetPasswordVerifyCode(${'$'}verifyCode: String!, ${'$'}email: String!, ${'$'}client: String!) {
  verifyResetPasswordVerifyCode(verifyCode: ${'$'}verifyCode, email: ${'$'}email, client: ${'$'}client) {
    message
    code
    status
  }
}
"""
}


data class GetOidcAppInfoResponse(

        @SerializedName("GetOIDCAppInfo")
        val result: OidcProviderClient
)

class GetOidcAppInfoParam(@SerializedName("appId")
                          var appId: String? = null) {

    fun appId(appId: String): GetOidcAppInfoParam {
        this.appId = appId
        return this
    }

    fun build(): GetOidcAppInfoParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getOidcAppInfoDocument,
                this
        );
    }

    private val getOidcAppInfoDocument: String = """
query GetOIDCAppInfo(${'$'}appId: String!) {
  GetOIDCAppInfo(appId: ${'$'}appId) {
    _id
    name
    domain
    image
    redirect_uris
    client_id
    client_secret
    token_endpoint_auth_method
    id_token_signed_response_alg
    id_token_encrypted_response_alg
    id_token_encrypted_response_enc
    userinfo_signed_response_alg
    userinfo_encrypted_response_alg
    userinfo_encrypted_response_enc
    request_object_signing_alg
    request_object_encryption_alg
    request_object_encryption_enc
    jwks_uri
    _jwks_uri
    custom_jwks
    jwks
    _jwks
    clientId
    grant_types
    response_types
    description
    homepageURL
    isDeleted
    isDefault
    when
    css
    authorization_code_expire
    id_token_expire
    access_token_expire
    cas_expire
    loginUrl
    customStyles {
      forceLogin
      hideQRCode
      hideUP
      hideUsername
      hideRegister
      hidePhone
      hideSocial
      hideClose
      hidePhonePassword
      defaultLoginMethod
    }
  }
}
"""
}


data class GetOidcAppListResponse(

        @SerializedName("GetOIDCAppList")
        val result: OidcAppPagedList
)

class GetOidcAppListParam(@SerializedName("clientId")
                          var clientId: String? = null,
                          @SerializedName("page")
                          var page: Int? = null,
                          @SerializedName("count")
                          var count: Int? = null) {

    fun clientId(clientId: String): GetOidcAppListParam {
        this.clientId = clientId
        return this
    }

    fun page(page: Int): GetOidcAppListParam {
        this.page = page
        return this
    }

    fun count(count: Int): GetOidcAppListParam {
        this.count = count
        return this
    }

    fun build(): GetOidcAppListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getOidcAppListDocument,
                this
        );
    }

    private val getOidcAppListDocument: String = """
query GetOIDCAppList(${'$'}clientId: String, ${'$'}page: Int, ${'$'}count: Int) {
  GetOIDCAppList(clientId: ${'$'}clientId, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      _id
      name
      domain
      image
      redirect_uris
      client_id
      client_secret
      token_endpoint_auth_method
      id_token_signed_response_alg
      id_token_encrypted_response_alg
      id_token_encrypted_response_enc
      userinfo_signed_response_alg
      userinfo_encrypted_response_alg
      userinfo_encrypted_response_enc
      request_object_signing_alg
      request_object_encryption_alg
      request_object_encryption_enc
      jwks_uri
      _jwks_uri
      custom_jwks
      jwks
      _jwks
      clientId
      grant_types
      response_types
      description
      homepageURL
      isDeleted
      isDefault
      when
      css
      authorization_code_expire
      id_token_expire
      access_token_expire
      cas_expire
      loginUrl
    }
  }
}
"""
}


data class GetSamlIdentityProviderInfoResponse(

        @SerializedName("GetSAMLIdentityProviderInfo")
        val result: SamlIdentityProviderClient
)

class GetSamlIdentityProviderInfoParam(@SerializedName("appId")
                                       var appId: String? = null) {

    fun appId(appId: String): GetSamlIdentityProviderInfoParam {
        this.appId = appId
        return this
    }

    fun build(): GetSamlIdentityProviderInfoParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getSamlIdentityProviderInfoDocument,
                this
        );
    }

    private val getSamlIdentityProviderInfoDocument: String = """
query GetSAMLIdentityProviderInfo(${'$'}appId: String!) {
  GetSAMLIdentityProviderInfo(appId: ${'$'}appId) {
    _id
    name
    domain
    image
    appSecret
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    attributeNameFormat
    customAttributes
    emailDomainTransformation
    authnContextClassRef
    IdPMetadata
    assertionConsumerUrl
    bindings
    nameIds
    attributes
    enableSignRes
    resSignAlgorithm
    resAbstractAlgorithm
    resSignPublicKey
    resSignPrivateKey
    resSignPrivateKeyPass
    enableSignReq
    reqSignPublicKey
    enableEncryptRes
    resEncryptPublicKey
    css
  }
}
"""
}


data class GetSamlIdentityProviderListResponse(

        @SerializedName("GetSAMLIdentityProviderList")
        val result: SamlIdentityProviderAppPagedList
)

class GetSamlIdentityProviderListParam(@SerializedName("clientId")
                                       var clientId: String? = null,
                                       @SerializedName("page")
                                       var page: Int? = null,
                                       @SerializedName("count")
                                       var count: Int? = null) {

    fun clientId(clientId: String): GetSamlIdentityProviderListParam {
        this.clientId = clientId
        return this
    }

    fun page(page: Int): GetSamlIdentityProviderListParam {
        this.page = page
        return this
    }

    fun count(count: Int): GetSamlIdentityProviderListParam {
        this.count = count
        return this
    }

    fun build(): GetSamlIdentityProviderListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getSamlIdentityProviderListDocument,
                this
        );
    }

    private val getSamlIdentityProviderListDocument: String = """
query GetSAMLIdentityProviderList(${'$'}clientId: String, ${'$'}page: Int, ${'$'}count: Int) {
  GetSAMLIdentityProviderList(clientId: ${'$'}clientId, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      _id
      name
      domain
      image
      appSecret
      appId
      clientId
      description
      isDeleted
      enabled
      when
      SPMetadata
      attributeNameFormat
      customAttributes
      emailDomainTransformation
      authnContextClassRef
      IdPMetadata
      assertionConsumerUrl
      bindings
      nameIds
      attributes
      enableSignRes
      resSignAlgorithm
      resAbstractAlgorithm
      resSignPublicKey
      resSignPrivateKey
      resSignPrivateKeyPass
      enableSignReq
      reqSignPublicKey
      enableEncryptRes
      resEncryptPublicKey
      css
    }
  }
}
"""
}


data class GetSamlServiceProviderInfoResponse(

        @SerializedName("GetSAMLServiceProviderInfo")
        val result: SamlServiceProviderClient
)

class GetSamlServiceProviderInfoParam(@SerializedName("appId")
                                      var appId: String? = null) {

    fun appId(appId: String): GetSamlServiceProviderInfoParam {
        this.appId = appId
        return this
    }

    fun build(): GetSamlServiceProviderInfoParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getSamlServiceProviderInfoDocument,
                this
        );
    }

    private val getSamlServiceProviderInfoDocument: String = """
query GetSAMLServiceProviderInfo(${'$'}appId: String!) {
  GetSAMLServiceProviderInfo(appId: ${'$'}appId) {
    _id
    name
    domain
    image
    appSecret
    defaultIdPMap {
      _id
      name
      image
      description
      isDeleted
    }
    defaultIdPMapId
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    IdPMetadata
    IdPEntityID
    assertionConsumeService {
      binding
      url
      isDefault
    }
    mappings {
      username
      nickname
      photo
      company
      providerName
      email
    }
    redirectUrl
    loginUrl
    logoutUrl
    nameId
    enableSignRes
    resSignPublicKey
    hasResEncrypted
    resEncryptAlgorithm
    resAbstractAlgorithm
    resDecryptPrivateKey
    resDecryptPrivateKeyPass
    resEncryptPublicKey
    enableSignReq
    reqSignAlgorithm
    reqAbstractAlgorithm
    reqSignPrivateKey
    reqSignPrivateKeyPass
    reqSignPublicKey
    SPUrl
  }
}
"""
}


data class GetSamlServiceProviderListResponse(

        @SerializedName("GetSAMLServiceProviderList")
        val result: SamlServiceProviderAppPagedList
)

class GetSamlServiceProviderListParam(@SerializedName("clientId")
                                      var clientId: String? = null,
                                      @SerializedName("page")
                                      var page: Int? = null,
                                      @SerializedName("count")
                                      var count: Int? = null) {

    fun clientId(clientId: String): GetSamlServiceProviderListParam {
        this.clientId = clientId
        return this
    }

    fun page(page: Int): GetSamlServiceProviderListParam {
        this.page = page
        return this
    }

    fun count(count: Int): GetSamlServiceProviderListParam {
        this.count = count
        return this
    }

    fun build(): GetSamlServiceProviderListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getSamlServiceProviderListDocument,
                this
        );
    }

    private val getSamlServiceProviderListDocument: String = """
query GetSAMLServiceProviderList(${'$'}clientId: String, ${'$'}page: Int, ${'$'}count: Int) {
  GetSAMLServiceProviderList(clientId: ${'$'}clientId, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      _id
      name
      domain
      image
      appSecret
      defaultIdPMapId
      appId
      clientId
      description
      isDeleted
      enabled
      when
      SPMetadata
      IdPMetadata
      IdPEntityID
      redirectUrl
      loginUrl
      logoutUrl
      nameId
      enableSignRes
      resSignPublicKey
      hasResEncrypted
      resEncryptAlgorithm
      resAbstractAlgorithm
      resDecryptPrivateKey
      resDecryptPrivateKeyPass
      resEncryptPublicKey
      enableSignReq
      reqSignAlgorithm
      reqAbstractAlgorithm
      reqSignPrivateKey
      reqSignPrivateKeyPass
      reqSignPublicKey
      SPUrl
    }
  }
}
"""
}


data class GetUserAuthorizedAppsResponse(

        @SerializedName("GetUserAuthorizedApps")
        val result: UserAuthorizedAppPagedList
)

class GetUserAuthorizedAppsParam(@SerializedName("clientId")
                                 var clientId: String? = null,
                                 @SerializedName("userId")
                                 var userId: String? = null,
                                 @SerializedName("page")
                                 var page: Int? = null,
                                 @SerializedName("count")
                                 var count: Int? = null) {

    fun clientId(clientId: String): GetUserAuthorizedAppsParam {
        this.clientId = clientId
        return this
    }

    fun userId(userId: String): GetUserAuthorizedAppsParam {
        this.userId = userId
        return this
    }

    fun page(page: Int): GetUserAuthorizedAppsParam {
        this.page = page
        return this
    }

    fun count(count: Int): GetUserAuthorizedAppsParam {
        this.count = count
        return this
    }

    fun build(): GetUserAuthorizedAppsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getUserAuthorizedAppsDocument,
                this
        );
    }

    private val getUserAuthorizedAppsDocument: String = """
query GetUserAuthorizedApps(${'$'}clientId: String, ${'$'}userId: String, ${'$'}page: Int, ${'$'}count: Int) {
  GetUserAuthorizedApps(clientId: ${'$'}clientId, userId: ${'$'}userId, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    OAuthApps {
      _id
      name
      domain
      image
      redirectUris
      appSecret
      client_id
      clientId
      grants
      description
      homepageURL
      isDeleted
      when
      css
      loginUrl
      casExpire
    }
    OIDCApps {
      _id
      name
      domain
      image
      redirect_uris
      client_id
      client_secret
      token_endpoint_auth_method
      id_token_signed_response_alg
      id_token_encrypted_response_alg
      id_token_encrypted_response_enc
      userinfo_signed_response_alg
      userinfo_encrypted_response_alg
      userinfo_encrypted_response_enc
      request_object_signing_alg
      request_object_encryption_alg
      request_object_encryption_enc
      jwks_uri
      _jwks_uri
      custom_jwks
      jwks
      _jwks
      clientId
      grant_types
      response_types
      description
      homepageURL
      isDeleted
      isDefault
      when
      css
      authorization_code_expire
      id_token_expire
      access_token_expire
      cas_expire
      loginUrl
    }
  }
}
"""
}


data class PreviewEmailByTypeResponse(

        @SerializedName("PreviewEmailByType")
        val result: String
)

class PreviewEmailByTypeParam(@SerializedName("type")
                              var type: String? = null,
                              @SerializedName("client")
                              var client: String? = null,
                              @SerializedName("meta_data")
                              var meta_data: String? = null) {

    fun type(type: String): PreviewEmailByTypeParam {
        this.type = type
        return this
    }

    fun client(client: String): PreviewEmailByTypeParam {
        this.client = client
        return this
    }

    fun meta_data(meta_data: String): PreviewEmailByTypeParam {
        this.meta_data = meta_data
        return this
    }

    fun build(): PreviewEmailByTypeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                previewEmailByTypeDocument,
                this
        );
    }

    private val previewEmailByTypeDocument: String = """
query PreviewEmailByType(${'$'}type: String!, ${'$'}client: String!, ${'$'}meta_data: String) {
  PreviewEmailByType(type: ${'$'}type, client: ${'$'}client, meta_data: ${'$'}meta_data)
}
"""
}


data class QueryAppInfoByAppIdResponse(

        @SerializedName("QueryAppInfoByAppID")
        val result: OAuthProviderClient
)

class QueryAppInfoByAppIdParam(@SerializedName("appId")
                               var appId: String? = null,
                               @SerializedName("responseType")
                               var responseType: String? = null,
                               @SerializedName("redirectUrl")
                               var redirectUrl: String? = null) {

    fun appId(appId: String): QueryAppInfoByAppIdParam {
        this.appId = appId
        return this
    }

    fun responseType(responseType: String): QueryAppInfoByAppIdParam {
        this.responseType = responseType
        return this
    }

    fun redirectUrl(redirectUrl: String): QueryAppInfoByAppIdParam {
        this.redirectUrl = redirectUrl
        return this
    }

    fun build(): QueryAppInfoByAppIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryAppInfoByAppIdDocument,
                this
        );
    }

    private val queryAppInfoByAppIdDocument: String = """
query QueryAppInfoByAppID(${'$'}appId: String, ${'$'}responseType: String, ${'$'}redirectUrl: String) {
  QueryAppInfoByAppID(appId: ${'$'}appId, responseType: ${'$'}responseType, redirectUrl: ${'$'}redirectUrl) {
    _id
    name
    domain
    image
    redirectUris
    appSecret
    client_id
    clientId
    grants
    description
    homepageURL
    isDeleted
    when
    css
    loginUrl
    casExpire
  }
}
"""
}


data class QueryAppInfoByDomainResponse(

        @SerializedName("QueryAppInfoByDomain")
        val result: OAuthProviderClient
)

class QueryAppInfoByDomainParam(@SerializedName("domain")
                                var domain: String? = null) {

    fun domain(domain: String): QueryAppInfoByDomainParam {
        this.domain = domain
        return this
    }

    fun build(): QueryAppInfoByDomainParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryAppInfoByDomainDocument,
                this
        );
    }

    private val queryAppInfoByDomainDocument: String = """
query QueryAppInfoByDomain(${'$'}domain: String) {
  QueryAppInfoByDomain(domain: ${'$'}domain) {
    _id
    name
    domain
    image
    redirectUris
    appSecret
    client_id
    clientId
    grants
    description
    homepageURL
    isDeleted
    when
    css
    loginUrl
    casExpire
  }
}
"""
}


data class QueryClientHasLdapConfigsResponse(

        @SerializedName("QueryClientHasLDAPConfigs")
        val result: ClientHasLdapConfigs
)

class QueryClientHasLdapConfigsParam(@SerializedName("clientId")
                                     var clientId: String? = null) {

    fun clientId(clientId: String): QueryClientHasLdapConfigsParam {
        this.clientId = clientId
        return this
    }

    fun build(): QueryClientHasLdapConfigsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryClientHasLdapConfigsDocument,
                this
        );
    }

    private val queryClientHasLdapConfigsDocument: String = """
query QueryClientHasLDAPConfigs(${'$'}clientId: String) {
  QueryClientHasLDAPConfigs(clientId: ${'$'}clientId) {
    result
  }
}
"""
}


data class QueryClientIdByAppIdResponse(

        @SerializedName("QueryClientIdByAppId")
        val result: OAuthProviderClient
)

class QueryClientIdByAppIdParam(@SerializedName("appId")
                                var appId: String? = null) {

    fun appId(appId: String): QueryClientIdByAppIdParam {
        this.appId = appId
        return this
    }

    fun build(): QueryClientIdByAppIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryClientIdByAppIdDocument,
                this
        );
    }

    private val queryClientIdByAppIdDocument: String = """
query QueryClientIdByAppId(${'$'}appId: String) {
  QueryClientIdByAppId(appId: ${'$'}appId) {
    _id
    name
    domain
    image
    redirectUris
    appSecret
    client_id
    clientId
    grants
    description
    homepageURL
    isDeleted
    when
    css
    loginUrl
    casExpire
  }
}
"""
}


data class QueryDefaultSamlIdentityProviderSettingsListResponse(

        @SerializedName("QueryDefaultSAMLIdentityProviderSettingsList")
        val result: SamlDefaultIdentityProviderSettingsList
)

class QueryDefaultSamlIdentityProviderSettingsListParam(@SerializedName("page")
                                                        var page: Int? = null,
                                                        @SerializedName("count")
                                                        var count: Int? = null) {

    fun page(page: Int): QueryDefaultSamlIdentityProviderSettingsListParam {
        this.page = page
        return this
    }

    fun count(count: Int): QueryDefaultSamlIdentityProviderSettingsListParam {
        this.count = count
        return this
    }

    fun build(): QueryDefaultSamlIdentityProviderSettingsListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryDefaultSamlIdentityProviderSettingsListDocument,
                this
        );
    }

    private val queryDefaultSamlIdentityProviderSettingsListDocument: String = """
query QueryDefaultSAMLIdentityProviderSettingsList(${'$'}page: Int, ${'$'}count: Int) {
  QueryDefaultSAMLIdentityProviderSettingsList(page: ${'$'}page, count: ${'$'}count) {
    list {
      _id
      name
      image
      description
      isDeleted
    }
    totalCount
  }
}
"""
}


data class QueryLdapServerListResponse(

        @SerializedName("QueryLDAPServerList")
        val result: LdapServerList
)

class QueryLdapServerListParam(@SerializedName("clientId")
                               var clientId: String? = null,
                               @SerializedName("page")
                               var page: Int? = null,
                               @SerializedName("count")
                               var count: Int? = null) {

    fun clientId(clientId: String): QueryLdapServerListParam {
        this.clientId = clientId
        return this
    }

    fun page(page: Int): QueryLdapServerListParam {
        this.page = page
        return this
    }

    fun count(count: Int): QueryLdapServerListParam {
        this.count = count
        return this
    }

    fun build(): QueryLdapServerListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryLdapServerListDocument,
                this
        );
    }

    private val queryLdapServerListDocument: String = """
query QueryLDAPServerList(${'$'}clientId: String!, ${'$'}page: Int, ${'$'}count: Int) {
  QueryLDAPServerList(clientId: ${'$'}clientId, page: ${'$'}page, count: ${'$'}count) {
    list {
      _id
      name
      clientId
      userId
      ldapLink
      baseDN
      searchStandard
      emailPostfix
      username
      password
      description
      enabled
      isDeleted
      createdAt
      updatedAt
    }
    totalCount
  }
}
"""
}


data class QueryOidcAppInfoByAppIdResponse(

        @SerializedName("QueryOIDCAppInfoByAppID")
        val result: OidcProviderClient
)

class QueryOidcAppInfoByAppIdParam(@SerializedName("appId")
                                   var appId: String? = null,
                                   @SerializedName("responseType")
                                   var responseType: String? = null,
                                   @SerializedName("redirectUrl")
                                   var redirectUrl: String? = null) {

    fun appId(appId: String): QueryOidcAppInfoByAppIdParam {
        this.appId = appId
        return this
    }

    fun responseType(responseType: String): QueryOidcAppInfoByAppIdParam {
        this.responseType = responseType
        return this
    }

    fun redirectUrl(redirectUrl: String): QueryOidcAppInfoByAppIdParam {
        this.redirectUrl = redirectUrl
        return this
    }

    fun build(): QueryOidcAppInfoByAppIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryOidcAppInfoByAppIdDocument,
                this
        );
    }

    private val queryOidcAppInfoByAppIdDocument: String = """
query QueryOIDCAppInfoByAppID(${'$'}appId: String, ${'$'}responseType: String, ${'$'}redirectUrl: String) {
  QueryOIDCAppInfoByAppID(appId: ${'$'}appId, responseType: ${'$'}responseType, redirectUrl: ${'$'}redirectUrl) {
    _id
    name
    domain
    image
    redirect_uris
    client_id
    client_secret
    token_endpoint_auth_method
    id_token_signed_response_alg
    id_token_encrypted_response_alg
    id_token_encrypted_response_enc
    userinfo_signed_response_alg
    userinfo_encrypted_response_alg
    userinfo_encrypted_response_enc
    request_object_signing_alg
    request_object_encryption_alg
    request_object_encryption_enc
    jwks_uri
    _jwks_uri
    custom_jwks
    jwks
    _jwks
    clientId
    grant_types
    response_types
    description
    homepageURL
    isDeleted
    isDefault
    when
    css
    authorization_code_expire
    id_token_expire
    access_token_expire
    cas_expire
    loginUrl
    customStyles {
      forceLogin
      hideQRCode
      hideUP
      hideUsername
      hideRegister
      hidePhone
      hideSocial
      hideClose
      hidePhonePassword
      defaultLoginMethod
    }
  }
}
"""
}


data class QueryOidcAppInfoByDomainResponse(

        @SerializedName("QueryOIDCAppInfoByDomain")
        val result: OidcProviderClient
)

class QueryOidcAppInfoByDomainParam(@SerializedName("domain")
                                    var domain: String? = null) {

    fun domain(domain: String): QueryOidcAppInfoByDomainParam {
        this.domain = domain
        return this
    }

    fun build(): QueryOidcAppInfoByDomainParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryOidcAppInfoByDomainDocument,
                this
        );
    }

    private val queryOidcAppInfoByDomainDocument: String = """
query QueryOIDCAppInfoByDomain(${'$'}domain: String) {
  QueryOIDCAppInfoByDomain(domain: ${'$'}domain) {
    _id
    name
    domain
    image
    redirect_uris
    client_id
    client_secret
    token_endpoint_auth_method
    id_token_signed_response_alg
    id_token_encrypted_response_alg
    id_token_encrypted_response_enc
    userinfo_signed_response_alg
    userinfo_encrypted_response_alg
    userinfo_encrypted_response_enc
    request_object_signing_alg
    request_object_encryption_alg
    request_object_encryption_enc
    jwks_uri
    _jwks_uri
    custom_jwks
    jwks
    _jwks
    clientId
    grant_types
    response_types
    description
    homepageURL
    isDeleted
    isDefault
    when
    css
    authorization_code_expire
    id_token_expire
    access_token_expire
    cas_expire
    loginUrl
    customStyles {
      forceLogin
      hideQRCode
      hideUP
      hideUsername
      hideRegister
      hidePhone
      hideSocial
      hideClose
      hidePhonePassword
      defaultLoginMethod
    }
  }
}
"""
}


data class QuerySamlIdentityProviderInfoByAppIdResponse(

        @SerializedName("QuerySAMLIdentityProviderInfoByAppID")
        val result: SamlIdentityProviderClient
)

class QuerySamlIdentityProviderInfoByAppIdParam(@SerializedName("appId")
                                                var appId: String? = null) {

    fun appId(appId: String): QuerySamlIdentityProviderInfoByAppIdParam {
        this.appId = appId
        return this
    }

    fun build(): QuerySamlIdentityProviderInfoByAppIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                querySamlIdentityProviderInfoByAppIdDocument,
                this
        );
    }

    private val querySamlIdentityProviderInfoByAppIdDocument: String = """
query QuerySAMLIdentityProviderInfoByAppID(${'$'}appId: String) {
  QuerySAMLIdentityProviderInfoByAppID(appId: ${'$'}appId) {
    _id
    name
    domain
    image
    appSecret
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    attributeNameFormat
    customAttributes
    emailDomainTransformation
    authnContextClassRef
    IdPMetadata
    assertionConsumerUrl
    bindings
    nameIds
    attributes
    enableSignRes
    resSignAlgorithm
    resAbstractAlgorithm
    resSignPublicKey
    resSignPrivateKey
    resSignPrivateKeyPass
    enableSignReq
    reqSignPublicKey
    enableEncryptRes
    resEncryptPublicKey
    css
  }
}
"""
}


data class QuerySamlIdentityProviderInfoByDomainResponse(

        @SerializedName("QuerySAMLIdentityProviderInfoByDomain")
        val result: SamlIdentityProviderClient
)

class QuerySamlIdentityProviderInfoByDomainParam(@SerializedName("domain")
                                                 var domain: String? = null) {

    fun domain(domain: String): QuerySamlIdentityProviderInfoByDomainParam {
        this.domain = domain
        return this
    }

    fun build(): QuerySamlIdentityProviderInfoByDomainParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                querySamlIdentityProviderInfoByDomainDocument,
                this
        );
    }

    private val querySamlIdentityProviderInfoByDomainDocument: String = """
query QuerySAMLIdentityProviderInfoByDomain(${'$'}domain: String) {
  QuerySAMLIdentityProviderInfoByDomain(domain: ${'$'}domain) {
    _id
    name
    domain
    image
    appSecret
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    attributeNameFormat
    customAttributes
    emailDomainTransformation
    authnContextClassRef
    IdPMetadata
    assertionConsumerUrl
    bindings
    nameIds
    attributes
    enableSignRes
    resSignAlgorithm
    resAbstractAlgorithm
    resSignPublicKey
    resSignPrivateKey
    resSignPrivateKeyPass
    enableSignReq
    reqSignPublicKey
    enableEncryptRes
    resEncryptPublicKey
    css
  }
}
"""
}


data class QuerySamlServiceProviderInfoByAppIdResponse(

        @SerializedName("QuerySAMLServiceProviderInfoByAppID")
        val result: SamlServiceProviderClient
)

class QuerySamlServiceProviderInfoByAppIdParam(@SerializedName("appId")
                                               var appId: String? = null) {

    fun appId(appId: String): QuerySamlServiceProviderInfoByAppIdParam {
        this.appId = appId
        return this
    }

    fun build(): QuerySamlServiceProviderInfoByAppIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                querySamlServiceProviderInfoByAppIdDocument,
                this
        );
    }

    private val querySamlServiceProviderInfoByAppIdDocument: String = """
query QuerySAMLServiceProviderInfoByAppID(${'$'}appId: String!) {
  QuerySAMLServiceProviderInfoByAppID(appId: ${'$'}appId) {
    _id
    name
    domain
    image
    appSecret
    defaultIdPMap {
      _id
      name
      image
      description
      isDeleted
    }
    defaultIdPMapId
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    IdPMetadata
    IdPEntityID
    assertionConsumeService {
      binding
      url
      isDefault
    }
    mappings {
      username
      nickname
      photo
      company
      providerName
      email
    }
    redirectUrl
    loginUrl
    logoutUrl
    nameId
    enableSignRes
    resSignPublicKey
    hasResEncrypted
    resEncryptAlgorithm
    resAbstractAlgorithm
    resDecryptPrivateKey
    resDecryptPrivateKeyPass
    resEncryptPublicKey
    enableSignReq
    reqSignAlgorithm
    reqAbstractAlgorithm
    reqSignPrivateKey
    reqSignPrivateKeyPass
    reqSignPublicKey
    SPUrl
  }
}
"""
}


data class QuerySamlServiceProviderInfoByDomainResponse(

        @SerializedName("QuerySAMLServiceProviderInfoByDomain")
        val result: SamlServiceProviderClient
)

class QuerySamlServiceProviderInfoByDomainParam(@SerializedName("domain")
                                                var domain: String? = null) {

    fun domain(domain: String): QuerySamlServiceProviderInfoByDomainParam {
        this.domain = domain
        return this
    }

    fun build(): QuerySamlServiceProviderInfoByDomainParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                querySamlServiceProviderInfoByDomainDocument,
                this
        );
    }

    private val querySamlServiceProviderInfoByDomainDocument: String = """
query QuerySAMLServiceProviderInfoByDomain(${'$'}domain: String!) {
  QuerySAMLServiceProviderInfoByDomain(domain: ${'$'}domain) {
    _id
    name
    domain
    image
    appSecret
    defaultIdPMap {
      _id
      name
      image
      description
      isDeleted
    }
    defaultIdPMapId
    appId
    clientId
    description
    isDeleted
    enabled
    when
    SPMetadata
    IdPMetadata
    IdPEntityID
    assertionConsumeService {
      binding
      url
      isDefault
    }
    mappings {
      username
      nickname
      photo
      company
      providerName
      email
    }
    redirectUrl
    loginUrl
    logoutUrl
    nameId
    enableSignRes
    resSignPublicKey
    hasResEncrypted
    resEncryptAlgorithm
    resAbstractAlgorithm
    resDecryptPrivateKey
    resDecryptPrivateKeyPass
    resEncryptPublicKey
    enableSignReq
    reqSignAlgorithm
    reqAbstractAlgorithm
    reqSignPrivateKey
    reqSignPrivateKeyPass
    reqSignPublicKey
    SPUrl
  }
}
"""
}


data class ReadEmailProviderResponse(

        @SerializedName("ReadEmailProvider")
        val result: List<EmailProviderList>
)

class ReadEmailProviderParam(@SerializedName("clientId")
                             var clientId: String? = null) {

    fun clientId(clientId: String): ReadEmailProviderParam {
        this.clientId = clientId
        return this
    }

    fun build(): ReadEmailProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readEmailProviderDocument,
                this
        );
    }

    private val readEmailProviderDocument: String = """
query ReadEmailProvider(${'$'}clientId: String) {
  ReadEmailProvider(clientId: ${'$'}clientId) {
    _id
    name
    image
    description
    fields {
      label
      type
      placeholder
      help
      value
      options
    }
    client
    user
    status
    provider {
      _id
      name
      image
      description
      client
      user
      status
    }
  }
}
"""
}


data class ReadEmailProviderByClientAndNameResponse(

        @SerializedName("ReadEmailProviderByClientAndName")
        val result: List<EmailProviderWithClientList>
)

class ReadEmailProviderByClientAndNameParam(@SerializedName("clientId")
                                            var clientId: String? = null) {

    fun clientId(clientId: String): ReadEmailProviderByClientAndNameParam {
        this.clientId = clientId
        return this
    }

    fun build(): ReadEmailProviderByClientAndNameParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readEmailProviderByClientAndNameDocument,
                this
        );
    }

    private val readEmailProviderByClientAndNameDocument: String = """
query ReadEmailProviderByClientAndName(${'$'}clientId: String) {
  ReadEmailProviderByClientAndName(clientId: ${'$'}clientId) {
    _id
    user
    client
    status
    fields {
      label
      type
      placeholder
      help
      value
      options
    }
    provider {
      _id
      name
      image
      description
    }
  }
}
"""
}


data class ReadEmailProviderWithClientResponse(

        @SerializedName("ReadEmailProviderWithClient")
        val result: List<EmailProviderWithClientList>
)

class ReadEmailProviderWithClientParam {


    fun build(): ReadEmailProviderWithClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readEmailProviderWithClientDocument,
                this
        );
    }

    private val readEmailProviderWithClientDocument: String = """
query ReadEmailProviderWithClient {
  ReadEmailProviderWithClient {
    _id
    user
    client
    status
    fields {
      label
      type
      placeholder
      help
      value
      options
    }
    provider {
      _id
      name
      image
      description
    }
  }
}
"""
}


data class ReadEmailSentListResponse(

        @SerializedName("ReadEmailSentList")
        val result: Email
)

class ReadEmailSentListParam(@SerializedName("page")
                             var page: Int? = null,
                             @SerializedName("count")
                             var count: Int? = null,
                             @SerializedName("sortBy")
                             var sortBy: String? = null) {

    fun page(page: Int): ReadEmailSentListParam {
        this.page = page
        return this
    }

    fun count(count: Int): ReadEmailSentListParam {
        this.count = count
        return this
    }

    fun sortBy(sortBy: String): ReadEmailSentListParam {
        this.sortBy = sortBy
        return this
    }

    fun build(): ReadEmailSentListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readEmailSentListDocument,
                this
        );
    }

    private val readEmailSentListDocument: String = """
query ReadEmailSentList(${'$'}page: Int, ${'$'}count: Int, ${'$'}sortBy: String) {
  ReadEmailSentList(page: ${'$'}page, count: ${'$'}count, sortBy: ${'$'}sortBy) {
    list {
      _id
      subject
      content
      sender
      receivers
      createdAt
    }
    totalCount
  }
}
"""
}


data class ReadEmailSentListByClientResponse(

        @SerializedName("ReadEmailSentListByClient")
        val result: EmailListPaged
)

class ReadEmailSentListByClientParam(@SerializedName("client")
                                     var client: String? = null,
                                     @SerializedName("page")
                                     var page: Int? = null,
                                     @SerializedName("count")
                                     var count: Int? = null) {

    fun client(client: String): ReadEmailSentListByClientParam {
        this.client = client
        return this
    }

    fun page(page: Int): ReadEmailSentListByClientParam {
        this.page = page
        return this
    }

    fun count(count: Int): ReadEmailSentListByClientParam {
        this.count = count
        return this
    }

    fun build(): ReadEmailSentListByClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readEmailSentListByClientDocument,
                this
        );
    }

    private val readEmailSentListByClientDocument: String = """
query ReadEmailSentListByClient(${'$'}client: String!, ${'$'}page: Int, ${'$'}count: Int) {
  ReadEmailSentListByClient(client: ${'$'}client, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      _id
      user
      subject
      content
      sender
      receivers
      post
      createdAt
      rejected
      isDeleted
      client
    }
  }
}
"""
}


data class ReadEmailTemplateByClientAndTypeResponse(

        @SerializedName("ReadEmailTemplateByClientAndType")
        val result: EmailTemplate
)

class ReadEmailTemplateByClientAndTypeParam(@SerializedName("type")
                                            var type: String? = null,
                                            @SerializedName("client")
                                            var client: String? = null) {

    fun type(type: String): ReadEmailTemplateByClientAndTypeParam {
        this.type = type
        return this
    }

    fun client(client: String): ReadEmailTemplateByClientAndTypeParam {
        this.client = client
        return this
    }

    fun build(): ReadEmailTemplateByClientAndTypeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readEmailTemplateByClientAndTypeDocument,
                this
        );
    }

    private val readEmailTemplateByClientAndTypeDocument: String = """
query ReadEmailTemplateByClientAndType(${'$'}type: String!, ${'$'}client: String!) {
  ReadEmailTemplateByClientAndType(type: ${'$'}type, client: ${'$'}client) {
    _id
    type
    sender
    object
    hasURL
    URLExpireTime
    status
    redirectTo
    content
  }
}
"""
}


data class ReadEmailTemplatesByClientResponse(

        @SerializedName("ReadEmailTemplatesByClient")
        val result: List<EmailTemplateWithClient>
)

class ReadEmailTemplatesByClientParam(@SerializedName("clientId")
                                      var clientId: String? = null) {

    fun clientId(clientId: String): ReadEmailTemplatesByClientParam {
        this.clientId = clientId
        return this
    }

    fun build(): ReadEmailTemplatesByClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readEmailTemplatesByClientDocument,
                this
        );
    }

    private val readEmailTemplatesByClientDocument: String = """
query ReadEmailTemplatesByClient(${'$'}clientId: String!) {
  ReadEmailTemplatesByClient(clientId: ${'$'}clientId) {
    _id
    user
    client
    template {
      _id
      type
      sender
      object
      hasURL
      URLExpireTime
      status
      redirectTo
      content
    }
    type
    sender
    object
    hasURL
    URLExpireTime
    redirectTo
    status
    content
  }
}
"""
}


data class ReadEmailTemplatesBySystemResponse(

        @SerializedName("ReadEmailTemplatesBySystem")
        val result: List<EmailTemplateWithClient>
)

class ReadEmailTemplatesBySystemParam {


    fun build(): ReadEmailTemplatesBySystemParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readEmailTemplatesBySystemDocument,
                this
        );
    }

    private val readEmailTemplatesBySystemDocument: String = """
query ReadEmailTemplatesBySystem {
  ReadEmailTemplatesBySystem {
    _id
    user
    client
    template {
      _id
      type
      sender
      object
      hasURL
      URLExpireTime
      status
      redirectTo
      content
    }
    type
    sender
    object
    hasURL
    URLExpireTime
    redirectTo
    status
    content
  }
}
"""
}


data class ReadOauthListResponse(

        @SerializedName("ReadOauthList")
        val result: List<OAuthList>
)

class ReadOauthListParam(@SerializedName("clientId")
                         var clientId: String? = null,
                         @SerializedName("dontGetURL")
                         var dontGetURL: Boolean? = null,
                         @SerializedName("useGuard")
                         var useGuard: Boolean? = null) {

    fun clientId(clientId: String): ReadOauthListParam {
        this.clientId = clientId
        return this
    }

    fun dontGetURL(dontGetURL: Boolean): ReadOauthListParam {
        this.dontGetURL = dontGetURL
        return this
    }

    fun useGuard(useGuard: Boolean): ReadOauthListParam {
        this.useGuard = useGuard
        return this
    }

    fun build(): ReadOauthListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readOauthListDocument,
                this
        );
    }

    private val readOauthListDocument: String = """
query ReadOauthList(${'$'}clientId: String, ${'$'}dontGetURL: Boolean, ${'$'}useGuard: Boolean) {
  ReadOauthList(clientId: ${'$'}clientId, dontGetURL: ${'$'}dontGetURL, useGuard: ${'$'}useGuard) {
    _id
    name
    alias
    image
    description
    enabled
    url
    client
    user
    oAuthUrl
    wxappLogo
    fields {
      label
      type
      placeholder
      value
      checked
    }
    oauth {
      _id
      name
      alias
      image
      description
      enabled
      url
      client
      user
      oAuthUrl
      wxappLogo
    }
  }
}
"""
}


data class ReadOrdersResponse(

        @SerializedName("ReadOrders")
        val result: PagedOrders
)

class ReadOrdersParam(@SerializedName("user")
                      var user: String? = null,
                      @SerializedName("page")
                      var page: Int? = null,
                      @SerializedName("count")
                      var count: Int? = null) {

    fun user(user: String): ReadOrdersParam {
        this.user = user
        return this
    }

    fun page(page: Int): ReadOrdersParam {
        this.page = page
        return this
    }

    fun count(count: Int): ReadOrdersParam {
        this.count = count
        return this
    }

    fun build(): ReadOrdersParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readOrdersDocument,
                this
        );
    }

    private val readOrdersDocument: String = """
query ReadOrders(${'$'}user: String, ${'$'}page: Int, ${'$'}count: Int) {
  ReadOrders(user: ${'$'}user, page: ${'$'}page, count: ${'$'}count) {
    list {
      _id
      client
      user
      timeOfPurchase
      flowNumber
      price
      createdAt
      completed
      payMethod
      endAt
    }
    totalCount
  }
}
"""
}


data class ReadSamlspListResponse(

        @SerializedName("ReadSAMLSPList")
        val result: List<SamlspListItem>
)

class ReadSamlspListParam(@SerializedName("clientId")
                          var clientId: String? = null) {

    fun clientId(clientId: String): ReadSamlspListParam {
        this.clientId = clientId
        return this
    }

    fun build(): ReadSamlspListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readSamlspListDocument,
                this
        );
    }

    private val readSamlspListDocument: String = """
query ReadSAMLSPList(${'$'}clientId: String!) {
  ReadSAMLSPList(clientId: ${'$'}clientId) {
    providerName
    url
    logo
  }
}
"""
}


data class ReadSystemPricingResponse(

        @SerializedName("ReadSystemPricing")
        val result: List<PricingList>
)

class ReadSystemPricingParam {


    fun build(): ReadSystemPricingParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readSystemPricingDocument,
                this
        );
    }

    private val readSystemPricingDocument: String = """
query ReadSystemPricing {
  ReadSystemPricing {
    _id
    type
    startNumber
    freeNumber
    startPrice
    maxNumber
    d
    features
  }
}
"""
}


data class ReadUserPricingResponse(

        @SerializedName("ReadUserPricing")
        val result: UserPricingType
)

class ReadUserPricingParam(@SerializedName("userId")
                           var userId: String? = null,
                           @SerializedName("clientId")
                           var clientId: String? = null) {

    fun userId(userId: String): ReadUserPricingParam {
        this.userId = userId
        return this
    }

    fun clientId(clientId: String): ReadUserPricingParam {
        this.clientId = clientId
        return this
    }

    fun build(): ReadUserPricingParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                readUserPricingDocument,
                this
        );
    }

    private val readUserPricingDocument: String = """
query ReadUserPricing(${'$'}userId: String, ${'$'}clientId: String) {
  ReadUserPricing(userId: ${'$'}userId, clientId: ${'$'}clientId) {
    user
    client
    isFree
    pricing {
      number
    }
    freeNumber
  }
}
"""
}


data class TestLdapServerResponse(

        @SerializedName("TestLDAPServer")
        val result: LdapServerTesterType
)

class TestLdapServerParam(@SerializedName("name")
                          var name: String? = null,
                          @SerializedName("clientId")
                          var clientId: String? = null,
                          @SerializedName("userId")
                          var userId: String? = null,
                          @SerializedName("ldapLink")
                          var ldapLink: String? = null,
                          @SerializedName("baseDN")
                          var baseDN: String? = null,
                          @SerializedName("searchStandard")
                          var searchStandard: String? = null,
                          @SerializedName("username")
                          var username: String? = null,
                          @SerializedName("password")
                          var password: String? = null,
                          @SerializedName("emailPostfix")
                          var emailPostfix: String? = null,
                          @SerializedName("description")
                          var description: String? = null,
                          @SerializedName("enabled")
                          var enabled: Boolean? = null) {

    fun name(name: String): TestLdapServerParam {
        this.name = name
        return this
    }

    fun clientId(clientId: String): TestLdapServerParam {
        this.clientId = clientId
        return this
    }

    fun userId(userId: String): TestLdapServerParam {
        this.userId = userId
        return this
    }

    fun ldapLink(ldapLink: String): TestLdapServerParam {
        this.ldapLink = ldapLink
        return this
    }

    fun baseDN(baseDN: String): TestLdapServerParam {
        this.baseDN = baseDN
        return this
    }

    fun searchStandard(searchStandard: String): TestLdapServerParam {
        this.searchStandard = searchStandard
        return this
    }

    fun username(username: String): TestLdapServerParam {
        this.username = username
        return this
    }

    fun password(password: String): TestLdapServerParam {
        this.password = password
        return this
    }

    fun emailPostfix(emailPostfix: String): TestLdapServerParam {
        this.emailPostfix = emailPostfix
        return this
    }

    fun description(description: String): TestLdapServerParam {
        this.description = description
        return this
    }

    fun enabled(enabled: Boolean): TestLdapServerParam {
        this.enabled = enabled
        return this
    }

    fun build(): TestLdapServerParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                testLdapServerDocument,
                this
        );
    }

    private val testLdapServerDocument: String = """
query TestLDAPServer(${'$'}name: String!, ${'$'}clientId: String!, ${'$'}userId: String!, ${'$'}ldapLink: String!, ${'$'}baseDN: String!, ${'$'}searchStandard: String!, ${'$'}username: String!, ${'$'}password: String!, ${'$'}emailPostfix: String, ${'$'}description: String, ${'$'}enabled: Boolean) {
  TestLDAPServer(name: ${'$'}name, clientId: ${'$'}clientId, userId: ${'$'}userId, ldapLink: ${'$'}ldapLink, baseDN: ${'$'}baseDN, searchStandard: ${'$'}searchStandard, username: ${'$'}username, password: ${'$'}password, emailPostfix: ${'$'}emailPostfix, description: ${'$'}description, enabled: ${'$'}enabled) {
    result
  }
}
"""
}


data class TestLdapUserResponse(

        @SerializedName("TestLDAPUser")
        val result: LdapUserTesterType
)

class TestLdapUserParam(@SerializedName("testUsername")
                        var testUsername: String? = null,
                        @SerializedName("testPassword")
                        var testPassword: String? = null,
                        @SerializedName("name")
                        var name: String? = null,
                        @SerializedName("clientId")
                        var clientId: String? = null,
                        @SerializedName("userId")
                        var userId: String? = null,
                        @SerializedName("ldapLink")
                        var ldapLink: String? = null,
                        @SerializedName("baseDN")
                        var baseDN: String? = null,
                        @SerializedName("searchStandard")
                        var searchStandard: String? = null,
                        @SerializedName("username")
                        var username: String? = null,
                        @SerializedName("password")
                        var password: String? = null,
                        @SerializedName("emailPostfix")
                        var emailPostfix: String? = null,
                        @SerializedName("description")
                        var description: String? = null,
                        @SerializedName("enabled")
                        var enabled: Boolean? = null) {

    fun testUsername(testUsername: String): TestLdapUserParam {
        this.testUsername = testUsername
        return this
    }

    fun testPassword(testPassword: String): TestLdapUserParam {
        this.testPassword = testPassword
        return this
    }

    fun name(name: String): TestLdapUserParam {
        this.name = name
        return this
    }

    fun clientId(clientId: String): TestLdapUserParam {
        this.clientId = clientId
        return this
    }

    fun userId(userId: String): TestLdapUserParam {
        this.userId = userId
        return this
    }

    fun ldapLink(ldapLink: String): TestLdapUserParam {
        this.ldapLink = ldapLink
        return this
    }

    fun baseDN(baseDN: String): TestLdapUserParam {
        this.baseDN = baseDN
        return this
    }

    fun searchStandard(searchStandard: String): TestLdapUserParam {
        this.searchStandard = searchStandard
        return this
    }

    fun username(username: String): TestLdapUserParam {
        this.username = username
        return this
    }

    fun password(password: String): TestLdapUserParam {
        this.password = password
        return this
    }

    fun emailPostfix(emailPostfix: String): TestLdapUserParam {
        this.emailPostfix = emailPostfix
        return this
    }

    fun description(description: String): TestLdapUserParam {
        this.description = description
        return this
    }

    fun enabled(enabled: Boolean): TestLdapUserParam {
        this.enabled = enabled
        return this
    }

    fun build(): TestLdapUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                testLdapUserDocument,
                this
        );
    }

    private val testLdapUserDocument: String = """
query TestLDAPUser(${'$'}testUsername: String!, ${'$'}testPassword: String!, ${'$'}name: String!, ${'$'}clientId: String!, ${'$'}userId: String!, ${'$'}ldapLink: String!, ${'$'}baseDN: String!, ${'$'}searchStandard: String!, ${'$'}username: String!, ${'$'}password: String!, ${'$'}emailPostfix: String, ${'$'}description: String, ${'$'}enabled: Boolean) {
  TestLDAPUser(testUsername: ${'$'}testUsername, testPassword: ${'$'}testPassword, name: ${'$'}name, clientId: ${'$'}clientId, userId: ${'$'}userId, ldapLink: ${'$'}ldapLink, baseDN: ${'$'}baseDN, searchStandard: ${'$'}searchStandard, username: ${'$'}username, password: ${'$'}password, emailPostfix: ${'$'}emailPostfix, description: ${'$'}description, enabled: ${'$'}enabled) {
    result
  }
}
"""
}


data class AdConnectorByProviderResponse(

        @SerializedName("adConnectorByProvider")
        val result: AdConnctorCommonInfo
)

class AdConnectorByProviderParam(@SerializedName("providerId")
                                 var providerId: String? = null,
                                 @SerializedName("providerType")
                                 var providerType: ProviderType? = null) {

    fun providerId(providerId: String): AdConnectorByProviderParam {
        this.providerId = providerId
        return this
    }

    fun providerType(providerType: ProviderType): AdConnectorByProviderParam {
        this.providerType = providerType
        return this
    }

    fun build(): AdConnectorByProviderParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                adConnectorByProviderDocument,
                this
        );
    }

    private val adConnectorByProviderDocument: String = """
query adConnectorByProvider(${'$'}providerId: String!, ${'$'}providerType: providerType!) {
  adConnectorByProvider(providerId: ${'$'}providerId, providerType: ${'$'}providerType) {
    _id
    name
    logo
    status
  }
}
"""
}


data class AdConnectorListResponse(

        @SerializedName("adConnectorList")
        val result: List<AdConnector>
)

class AdConnectorListParam(@SerializedName("userPoolId")
                           var userPoolId: String? = null,
                           @SerializedName("providerType")
                           var providerType: ProviderType? = null) {

    fun userPoolId(userPoolId: String): AdConnectorListParam {
        this.userPoolId = userPoolId
        return this
    }

    fun providerType(providerType: ProviderType): AdConnectorListParam {
        this.providerType = providerType
        return this
    }

    fun build(): AdConnectorListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                adConnectorListDocument,
                this
        );
    }

    private val adConnectorListDocument: String = """
query adConnectorList(${'$'}userPoolId: String!, ${'$'}providerType: providerType) {
  adConnectorList(userPoolId: ${'$'}userPoolId, providerType: ${'$'}providerType) {
    _id
    name
    secret
    salt
    logo
    enabled
    userPoolId
    status
    createdAt
  }
}
"""
}


data class BindedOAuthListResponse(

        @SerializedName("bindedOAuthList")
        val result: List<UserOAuthBind>
)

class BindedOAuthListParam(@SerializedName("client")
                           var client: String? = null,
                           @SerializedName("user")
                           var user: String? = null) {

    fun client(client: String): BindedOAuthListParam {
        this.client = client
        return this
    }

    fun user(user: String): BindedOAuthListParam {
        this.user = user
        return this
    }

    fun build(): BindedOAuthListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                bindedOAuthListDocument,
                this
        );
    }

    private val bindedOAuthListDocument: String = """
query bindedOAuthList(${'$'}client: String!, ${'$'}user: String) {
  bindedOAuthList(client: ${'$'}client, user: ${'$'}user) {
    _id
    user
    client
    type
    unionid
    userInfo
    createdAt
  }
}
"""
}


data class CheckAdConnectorStatusResponse(

        @SerializedName("checkAdConnectorStatus")
        val result: Boolean
)

class CheckAdConnectorStatusParam(@SerializedName("adConnectorId")
                                  var adConnectorId: String? = null) {

    fun adConnectorId(adConnectorId: String): CheckAdConnectorStatusParam {
        this.adConnectorId = adConnectorId
        return this
    }

    fun build(): CheckAdConnectorStatusParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                checkAdConnectorStatusDocument,
                this
        );
    }

    private val checkAdConnectorStatusDocument: String = """
query checkAdConnectorStatus(${'$'}adConnectorId: String!) {
  checkAdConnectorStatus(adConnectorId: ${'$'}adConnectorId)
}
"""
}


data class CheckIsReservedDomainResponse(

        @SerializedName("checkIsReservedDomain")
        val result: IsReservedDomain
)

class CheckIsReservedDomainParam(@SerializedName("domainValue")
                                 var domainValue: String? = null) {

    fun domainValue(domainValue: String): CheckIsReservedDomainParam {
        this.domainValue = domainValue
        return this
    }

    fun build(): CheckIsReservedDomainParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                checkIsReservedDomainDocument,
                this
        );
    }

    private val checkIsReservedDomainDocument: String = """
query checkIsReservedDomain(${'$'}domainValue: String!) {
  checkIsReservedDomain(domainValue: ${'$'}domainValue) {
    domainValue
    isReserved
  }
}
"""
}


data class CheckLoginStatusResponse(

        @SerializedName("checkLoginStatus")
        val result: JwtDecodedDataCheckLogin
)

class CheckLoginStatusParam(@SerializedName("token")
                            var token: String? = null) {

    fun token(token: String): CheckLoginStatusParam {
        this.token = token
        return this
    }

    fun build(): CheckLoginStatusParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                checkLoginStatusDocument,
                this
        );
    }

    private val checkLoginStatusDocument: String = """
query checkLoginStatus(${'$'}token: String) {
  checkLoginStatus(token: ${'$'}token) {
    message
    code
    status
    token {
      iat
      exp
    }
  }
}
"""
}


data class CheckPhoneCodeResponse(

        @SerializedName("checkPhoneCode")
        val result: CommonMessage
)

class CheckPhoneCodeParam(@SerializedName("userPoolId")
                          var userPoolId: String? = null,
                          @SerializedName("phone")
                          var phone: String? = null,
                          @SerializedName("phoneCode")
                          var phoneCode: String? = null) {

    fun userPoolId(userPoolId: String): CheckPhoneCodeParam {
        this.userPoolId = userPoolId
        return this
    }

    fun phone(phone: String): CheckPhoneCodeParam {
        this.phone = phone
        return this
    }

    fun phoneCode(phoneCode: String): CheckPhoneCodeParam {
        this.phoneCode = phoneCode
        return this
    }

    fun build(): CheckPhoneCodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                checkPhoneCodeDocument,
                this
        );
    }

    private val checkPhoneCodeDocument: String = """
query checkPhoneCode(${'$'}userPoolId: String!, ${'$'}phone: String!, ${'$'}phoneCode: String!) {
  checkPhoneCode(userPoolId: ${'$'}userPoolId, phone: ${'$'}phone, phoneCode: ${'$'}phoneCode) {
    message
    code
    status
  }
}
"""
}


data class ClientResponse(

        @SerializedName("client")
        val result: UserClient
)

class ClientParam(@SerializedName("id")
                  var id: String? = null,
                  @SerializedName("userId")
                  var userId: String? = null,
                  @SerializedName("fromAdmin")
                  var fromAdmin: Boolean? = null) {

    fun id(id: String): ClientParam {
        this.id = id
        return this
    }

    fun userId(userId: String): ClientParam {
        this.userId = userId
        return this
    }

    fun fromAdmin(fromAdmin: Boolean): ClientParam {
        this.fromAdmin = fromAdmin
        return this
    }

    fun build(): ClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                clientDocument,
                this
        );
    }

    private val clientDocument: String = """
query client(${'$'}id: String!, ${'$'}userId: String, ${'$'}fromAdmin: Boolean) {
  client(id: ${'$'}id, userId: ${'$'}userId, fromAdmin: ${'$'}fromAdmin) {
    _id
    user {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userPoolTypes {
      _id
      name
      description
      image
      example
    }
    usersCount
    logo
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWXMPQRCode
    useMiniLogin
    useSelfWxapp
    allowedOrigins
    name
    secret
    token
    descriptions
    jwtExpired
    createdAt
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enable
    }
    loginFailCheck {
      timeInterval
      limit
      enable
    }
    enableEmail
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
  }
}
"""
}


data class ClientRolesResponse(

        @SerializedName("clientRoles")
        val result: PagedRoles
)

class ClientRolesParam(@SerializedName("client")
                       var client: String? = null,
                       @SerializedName("page")
                       var page: Int? = null,
                       @SerializedName("count")
                       var count: Int? = null) {

    fun client(client: String): ClientRolesParam {
        this.client = client
        return this
    }

    fun page(page: Int): ClientRolesParam {
        this.page = page
        return this
    }

    fun count(count: Int): ClientRolesParam {
        this.count = count
        return this
    }

    fun build(): ClientRolesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                clientRolesDocument,
                this
        );
    }

    private val clientRolesDocument: String = """
query clientRoles(${'$'}client: String!, ${'$'}page: Int, ${'$'}count: Int) {
  clientRoles(client: ${'$'}client, page: ${'$'}page, count: ${'$'}count) {
    list {
      _id
      name
      descriptions
      client
      permissions
      createdAt
    }
    totalCount
  }
}
"""
}


data class DecodeJwtTokenResponse(

        @SerializedName("decodeJwtToken")
        val result: JwtDecodedData
)

class DecodeJwtTokenParam(@SerializedName("token")
                          var token: String? = null) {

    fun token(token: String): DecodeJwtTokenParam {
        this.token = token
        return this
    }

    fun build(): DecodeJwtTokenParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                decodeJwtTokenDocument,
                this
        );
    }

    private val decodeJwtTokenDocument: String = """
query decodeJwtToken(${'$'}token: String) {
  decodeJwtToken(token: ${'$'}token) {
    data {
      email
      id
      clientId
      unionid
    }
    status {
      message
      code
      status
    }
    iat
    exp
  }
}
"""
}


data class EmailDomainTopNListResponse(

        @SerializedName("emailDomainTopNList")
        val result: List<LoginTopEmailList>
)

class EmailDomainTopNListParam(@SerializedName("userPoolId")
                               var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): EmailDomainTopNListParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): EmailDomainTopNListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                emailDomainTopNListDocument,
                this
        );
    }

    private val emailDomainTopNListDocument: String = """
query emailDomainTopNList(${'$'}userPoolId: String!) {
  emailDomainTopNList(userPoolId: ${'$'}userPoolId) {
    domain
    count
  }
}
"""
}


data class FindClientsByIdArrayResponse(

        @SerializedName("findClientsByIdArray")
        val result: PagedUserClientList
)

class FindClientsByIdArrayParam(@SerializedName("clientsId")
                                var clientsId: List<String>? = null) {

    fun clientsId(clientsId: List<String>): FindClientsByIdArrayParam {
        this.clientsId = clientsId
        return this
    }

    fun build(): FindClientsByIdArrayParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                findClientsByIdArrayDocument,
                this
        );
    }

    private val findClientsByIdArrayDocument: String = """
query findClientsByIdArray(${'$'}clientsId: [String]) {
  findClientsByIdArray(clientsId: ${'$'}clientsId) {
    list {
      _id
      name
      createdAt
      usersCount
    }
    totalCount
  }
}
"""
}


data class GetAccessTokenByAppSecretResponse(

        @SerializedName("getAccessTokenByAppSecret")
        val result: String
)

class GetAccessTokenByAppSecretParam(@SerializedName("secret")
                                     var secret: String? = null,
                                     @SerializedName("clientId")
                                     var clientId: String? = null,
                                     @SerializedName("retUserId")
                                     var retUserId: Boolean? = null,
                                     @SerializedName("timestamp")
                                     var timestamp: String? = null,
                                     @SerializedName("signature")
                                     var signature: String? = null,
                                     @SerializedName("nonce")
                                     var nonce: Int? = null) {

    fun secret(secret: String): GetAccessTokenByAppSecretParam {
        this.secret = secret
        return this
    }

    fun clientId(clientId: String): GetAccessTokenByAppSecretParam {
        this.clientId = clientId
        return this
    }

    fun retUserId(retUserId: Boolean): GetAccessTokenByAppSecretParam {
        this.retUserId = retUserId
        return this
    }

    fun timestamp(timestamp: String): GetAccessTokenByAppSecretParam {
        this.timestamp = timestamp
        return this
    }

    fun signature(signature: String): GetAccessTokenByAppSecretParam {
        this.signature = signature
        return this
    }

    fun nonce(nonce: Int): GetAccessTokenByAppSecretParam {
        this.nonce = nonce
        return this
    }

    fun build(): GetAccessTokenByAppSecretParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getAccessTokenByAppSecretDocument,
                this
        );
    }

    private val getAccessTokenByAppSecretDocument: String = """
query getAccessTokenByAppSecret(${'$'}secret: String, ${'$'}clientId: String, ${'$'}retUserId: Boolean, ${'$'}timestamp: String, ${'$'}signature: String, ${'$'}nonce: Int) {
  getAccessTokenByAppSecret(secret: ${'$'}secret, clientId: ${'$'}clientId, retUserId: ${'$'}retUserId, timestamp: ${'$'}timestamp, signature: ${'$'}signature, nonce: ${'$'}nonce)
}
"""
}


data class GetAllWebhooksResponse(

        @SerializedName("getAllWebhooks")
        val result: List<ClientWebhook>
)

class GetAllWebhooksParam(@SerializedName("client")
                          var client: String? = null) {

    fun client(client: String): GetAllWebhooksParam {
        this.client = client
        return this
    }

    fun build(): GetAllWebhooksParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getAllWebhooksDocument,
                this
        );
    }

    private val getAllWebhooksDocument: String = """
query getAllWebhooks(${'$'}client: String!) {
  getAllWebhooks(client: ${'$'}client) {
    _id
    client
    events {
      name
      label
      description
    }
    url
    isLastTimeSuccess
    contentType
    secret
    enable
  }
}
"""
}


data class GetAppSecretByClientIdResponse(

        @SerializedName("getAppSecretByClientId")
        val result: AppSecretByClientId
)

class GetAppSecretByClientIdParam(@SerializedName("token")
                                  var token: String? = null,
                                  @SerializedName("clientId")
                                  var clientId: String? = null) {

    fun token(token: String): GetAppSecretByClientIdParam {
        this.token = token
        return this
    }

    fun clientId(clientId: String): GetAppSecretByClientIdParam {
        this.clientId = clientId
        return this
    }

    fun build(): GetAppSecretByClientIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getAppSecretByClientIdDocument,
                this
        );
    }

    private val getAppSecretByClientIdDocument: String = """
query getAppSecretByClientId(${'$'}token: String, ${'$'}clientId: String) {
  getAppSecretByClientId(token: ${'$'}token, clientId: ${'$'}clientId) {
    secret
    clientId
  }
}
"""
}


data class GetClientWhenSdkInitResponse(

        @SerializedName("getClientWhenSdkInit")
        val result: ClientInfoAndAccessToken
)

class GetClientWhenSdkInitParam(@SerializedName("secret")
                                var secret: String? = null,
                                @SerializedName("clientId")
                                var clientId: String? = null,
                                @SerializedName("retUserId")
                                var retUserId: Boolean? = null,
                                @SerializedName("timestamp")
                                var timestamp: String? = null,
                                @SerializedName("signature")
                                var signature: String? = null,
                                @SerializedName("nonce")
                                var nonce: Int? = null) {

    fun secret(secret: String): GetClientWhenSdkInitParam {
        this.secret = secret
        return this
    }

    fun clientId(clientId: String): GetClientWhenSdkInitParam {
        this.clientId = clientId
        return this
    }

    fun retUserId(retUserId: Boolean): GetClientWhenSdkInitParam {
        this.retUserId = retUserId
        return this
    }

    fun timestamp(timestamp: String): GetClientWhenSdkInitParam {
        this.timestamp = timestamp
        return this
    }

    fun signature(signature: String): GetClientWhenSdkInitParam {
        this.signature = signature
        return this
    }

    fun nonce(nonce: Int): GetClientWhenSdkInitParam {
        this.nonce = nonce
        return this
    }

    fun build(): GetClientWhenSdkInitParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getClientWhenSdkInitDocument,
                this
        );
    }

    private val getClientWhenSdkInitDocument: String = """
query getClientWhenSdkInit(${'$'}secret: String, ${'$'}clientId: String, ${'$'}retUserId: Boolean, ${'$'}timestamp: String, ${'$'}signature: String, ${'$'}nonce: Int) {
  getClientWhenSdkInit(secret: ${'$'}secret, clientId: ${'$'}clientId, retUserId: ${'$'}retUserId, timestamp: ${'$'}timestamp, signature: ${'$'}signature, nonce: ${'$'}nonce) {
    clientInfo {
      _id
      usersCount
      logo
      emailVerifiedDefault
      sendWelcomeEmail
      registerDisabled
      showWXMPQRCode
      useMiniLogin
      useSelfWxapp
      allowedOrigins
      name
      secret
      token
      descriptions
      jwtExpired
      createdAt
      isDeleted
      enableEmail
    }
    accessToken
  }
}
"""
}


data class GetCustomMfaResponse(

        @SerializedName("getCustomMFA")
        val result: PagedCustomMfaList
)

class GetCustomMfaParam(@SerializedName("userIdInMiniLogin")
                        var userIdInMiniLogin: String? = null,
                        @SerializedName("page")
                        var page: Int? = null,
                        @SerializedName("count")
                        var count: Int? = null) {

    fun userIdInMiniLogin(userIdInMiniLogin: String): GetCustomMfaParam {
        this.userIdInMiniLogin = userIdInMiniLogin
        return this
    }

    fun page(page: Int): GetCustomMfaParam {
        this.page = page
        return this
    }

    fun count(count: Int): GetCustomMfaParam {
        this.count = count
        return this
    }

    fun build(): GetCustomMfaParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getCustomMfaDocument,
                this
        );
    }

    private val getCustomMfaDocument: String = """
query getCustomMFA(${'$'}userIdInMiniLogin: String!, ${'$'}page: Int, ${'$'}count: Int) {
  getCustomMFA(userIdInMiniLogin: ${'$'}userIdInMiniLogin, page: ${'$'}page, count: ${'$'}count) {
    list {
      _id
      userIdInMiniLogin
      remark
      name
      secret
    }
    total
  }
}
"""
}


data class GetOAuthedAppInfoResponse(

        @SerializedName("getOAuthedAppInfo")
        val result: OAuthProviderClient
)

class GetOAuthedAppInfoParam(@SerializedName("appId")
                             var appId: String? = null) {

    fun appId(appId: String): GetOAuthedAppInfoParam {
        this.appId = appId
        return this
    }

    fun build(): GetOAuthedAppInfoParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getOAuthedAppInfoDocument,
                this
        );
    }

    private val getOAuthedAppInfoDocument: String = """
query getOAuthedAppInfo(${'$'}appId: String!) {
  getOAuthedAppInfo(appId: ${'$'}appId) {
    _id
    name
    domain
    image
    redirectUris
    appSecret
    client_id
    clientId
    grants
    description
    homepageURL
    isDeleted
    when
    css
    loginUrl
    casExpire
  }
}
"""
}


data class GetOAuthedAppListResponse(

        @SerializedName("getOAuthedAppList")
        val result: OAuthAppPagedList
)

class GetOAuthedAppListParam(@SerializedName("clientId")
                             var clientId: String? = null,
                             @SerializedName("page")
                             var page: Int? = null,
                             @SerializedName("count")
                             var count: Int? = null) {

    fun clientId(clientId: String): GetOAuthedAppListParam {
        this.clientId = clientId
        return this
    }

    fun page(page: Int): GetOAuthedAppListParam {
        this.page = page
        return this
    }

    fun count(count: Int): GetOAuthedAppListParam {
        this.count = count
        return this
    }

    fun build(): GetOAuthedAppListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getOAuthedAppListDocument,
                this
        );
    }

    private val getOAuthedAppListDocument: String = """
query getOAuthedAppList(${'$'}clientId: String, ${'$'}page: Int, ${'$'}count: Int) {
  getOAuthedAppList(clientId: ${'$'}clientId, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      _id
      name
      domain
      image
      redirectUris
      appSecret
      client_id
      clientId
      grants
      description
      homepageURL
      isDeleted
      when
      css
      loginUrl
      casExpire
    }
  }
}
"""
}


data class GetUserLoginAreaStatisticOfClientResponse(

        @SerializedName("getUserLoginAreaStatisticOfClient")
        val result: String
)

class GetUserLoginAreaStatisticOfClientParam(@SerializedName("userPool")
                                             var userPool: String? = null,
                                             @SerializedName("start")
                                             var start: String? = null,
                                             @SerializedName("end")
                                             var end: String? = null) {

    fun userPool(userPool: String): GetUserLoginAreaStatisticOfClientParam {
        this.userPool = userPool
        return this
    }

    fun start(start: String): GetUserLoginAreaStatisticOfClientParam {
        this.start = start
        return this
    }

    fun end(end: String): GetUserLoginAreaStatisticOfClientParam {
        this.end = end
        return this
    }

    fun build(): GetUserLoginAreaStatisticOfClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getUserLoginAreaStatisticOfClientDocument,
                this
        );
    }

    private val getUserLoginAreaStatisticOfClientDocument: String = """
query getUserLoginAreaStatisticOfClient(${'$'}userPool: String!, ${'$'}start: String, ${'$'}end: String) {
  getUserLoginAreaStatisticOfClient(userPool: ${'$'}userPool, start: ${'$'}start, end: ${'$'}end)
}
"""
}


data class GetUserPoolSettingsResponse(

        @SerializedName("getUserPoolSettings")
        val result: UserClient
)

class GetUserPoolSettingsParam(@SerializedName("userPoolId")
                               var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): GetUserPoolSettingsParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): GetUserPoolSettingsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getUserPoolSettingsDocument,
                this
        );
    }

    private val getUserPoolSettingsDocument: String = """
query getUserPoolSettings(${'$'}userPoolId: String!) {
  getUserPoolSettings(userPoolId: ${'$'}userPoolId) {
    _id
    user {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userPoolTypes {
      _id
      name
      description
      image
      example
    }
    usersCount
    logo
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWXMPQRCode
    useMiniLogin
    useSelfWxapp
    allowedOrigins
    name
    secret
    token
    descriptions
    jwtExpired
    createdAt
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enable
    }
    loginFailCheck {
      timeInterval
      limit
      enable
    }
    enableEmail
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
  }
}
"""
}


data class GetWebhookDetailResponse(

        @SerializedName("getWebhookDetail")
        val result: ClientWebhook
)

class GetWebhookDetailParam(@SerializedName("client")
                            var client: String? = null) {

    fun client(client: String): GetWebhookDetailParam {
        this.client = client
        return this
    }

    fun build(): GetWebhookDetailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getWebhookDetailDocument,
                this
        );
    }

    private val getWebhookDetailDocument: String = """
query getWebhookDetail(${'$'}client: String!) {
  getWebhookDetail(client: ${'$'}client) {
    _id
    client
    events {
      name
      label
      description
    }
    url
    isLastTimeSuccess
    contentType
    secret
    enable
  }
}
"""
}


data class GetWebhookLogDetailResponse(

        @SerializedName("getWebhookLogDetail")
        val result: WebhookLog
)

class GetWebhookLogDetailParam(@SerializedName("id")
                               var id: String? = null) {

    fun id(id: String): GetWebhookLogDetailParam {
        this.id = id
        return this
    }

    fun build(): GetWebhookLogDetailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getWebhookLogDetailDocument,
                this
        );
    }

    private val getWebhookLogDetailDocument: String = """
query getWebhookLogDetail(${'$'}id: String!) {
  getWebhookLogDetail(id: ${'$'}id) {
    _id
    webhook
    client
    event
    request {
      headers
      payload
    }
    response {
      headers
      body
      statusCode
    }
    errorMessage
    when
  }
}
"""
}


data class GetWebhookLogsResponse(

        @SerializedName("getWebhookLogs")
        val result: List<WebhookLog>
)

class GetWebhookLogsParam(@SerializedName("webhook")
                          var webhook: String? = null) {

    fun webhook(webhook: String): GetWebhookLogsParam {
        this.webhook = webhook
        return this
    }

    fun build(): GetWebhookLogsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getWebhookLogsDocument,
                this
        );
    }

    private val getWebhookLogsDocument: String = """
query getWebhookLogs(${'$'}webhook: String!) {
  getWebhookLogs(webhook: ${'$'}webhook) {
    _id
    webhook
    client
    event
    request {
      headers
      payload
    }
    response {
      headers
      body
      statusCode
    }
    errorMessage
    when
  }
}
"""
}


data class GetWebhookSettingOptionsResponse(

        @SerializedName("getWebhookSettingOptions")
        val result: WebhookSettingOptions
)

class GetWebhookSettingOptionsParam {


    fun build(): GetWebhookSettingOptionsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                getWebhookSettingOptionsDocument,
                this
        );
    }

    private val getWebhookSettingOptionsDocument: String = """
query getWebhookSettingOptions {
  getWebhookSettingOptions {
    webhookEvents {
      name
      label
      description
    }
    contentTypes {
      name
      label
    }
  }
}
"""
}


data class InterConnectionsResponse(

        @SerializedName("interConnections")
        val result: List<InterConnection>
)

class InterConnectionsParam(@SerializedName("userPoolId")
                            var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): InterConnectionsParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): InterConnectionsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                interConnectionsDocument,
                this
        );
    }

    private val interConnectionsDocument: String = """
query interConnections(${'$'}userPoolId: String!) {
  interConnections(userPoolId: ${'$'}userPoolId) {
    sourceUserId
    sourceUserPoolId
    targetUserId
    targetUserPoolId
    enabled
    expiresdAt
  }
}
"""
}


data class IsAdConnectorAliveResponse(

        @SerializedName("isAdConnectorAlive")
        val result: IsAdConenctorAlive
)

class IsAdConnectorAliveParam(@SerializedName("adConnectorId")
                              var adConnectorId: String? = null) {

    fun adConnectorId(adConnectorId: String): IsAdConnectorAliveParam {
        this.adConnectorId = adConnectorId
        return this
    }

    fun build(): IsAdConnectorAliveParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                isAdConnectorAliveDocument,
                this
        );
    }

    private val isAdConnectorAliveDocument: String = """
query isAdConnectorAlive(${'$'}adConnectorId: String) {
  isAdConnectorAlive(adConnectorId: ${'$'}adConnectorId) {
    isAlive
  }
}
"""
}


data class IsAppAuthorizedByUserResponse(

        @SerializedName("isAppAuthorizedByUser")
        val result: IsAppAuthorizedByUser
)

class IsAppAuthorizedByUserParam(@SerializedName("userId")
                                 var userId: String? = null,
                                 @SerializedName("appId")
                                 var appId: String? = null) {

    fun userId(userId: String): IsAppAuthorizedByUserParam {
        this.userId = userId
        return this
    }

    fun appId(appId: String): IsAppAuthorizedByUserParam {
        this.appId = appId
        return this
    }

    fun build(): IsAppAuthorizedByUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                isAppAuthorizedByUserDocument,
                this
        );
    }

    private val isAppAuthorizedByUserDocument: String = """
query isAppAuthorizedByUser(${'$'}userId: String, ${'$'}appId: String) {
  isAppAuthorizedByUser(userId: ${'$'}userId, appId: ${'$'}appId) {
    authorized
  }
}
"""
}


data class IsClientBelongToUserResponse(

        @SerializedName("isClientBelongToUser")
        val result: Boolean
)

class IsClientBelongToUserParam(@SerializedName("userId")
                                var userId: String? = null,
                                @SerializedName("clientId")
                                var clientId: String? = null,
                                @SerializedName("permissionDescriptors")
                                var permissionDescriptors: List<PermissionDescriptorsListInputTypeInput>? = null) {

    fun userId(userId: String): IsClientBelongToUserParam {
        this.userId = userId
        return this
    }

    fun clientId(clientId: String): IsClientBelongToUserParam {
        this.clientId = clientId
        return this
    }

    fun permissionDescriptors(permissionDescriptors: List<PermissionDescriptorsListInputTypeInput>): IsClientBelongToUserParam {
        this.permissionDescriptors = permissionDescriptors
        return this
    }

    fun build(): IsClientBelongToUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                isClientBelongToUserDocument,
                this
        );
    }

    private val isClientBelongToUserDocument: String = """
query isClientBelongToUser(${'$'}userId: String, ${'$'}clientId: String, ${'$'}permissionDescriptors: [PermissionDescriptorsListInputType]) {
  isClientBelongToUser(userId: ${'$'}userId, clientId: ${'$'}clientId, permissionDescriptors: ${'$'}permissionDescriptors)
}
"""
}


data class IsClientOfUserResponse(

        @SerializedName("isClientOfUser")
        val result: Boolean
)

class IsClientOfUserParam(@SerializedName("email")
                          var email: String? = null,
                          @SerializedName("password")
                          var password: String? = null,
                          @SerializedName("clientId")
                          var clientId: String? = null) {

    fun email(email: String): IsClientOfUserParam {
        this.email = email
        return this
    }

    fun password(password: String): IsClientOfUserParam {
        this.password = password
        return this
    }

    fun clientId(clientId: String): IsClientOfUserParam {
        this.clientId = clientId
        return this
    }

    fun build(): IsClientOfUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                isClientOfUserDocument,
                this
        );
    }

    private val isClientOfUserDocument: String = """
query isClientOfUser(${'$'}email: String, ${'$'}password: String, ${'$'}clientId: String) {
  isClientOfUser(email: ${'$'}email, password: ${'$'}password, clientId: ${'$'}clientId)
}
"""
}


data class IsDomainAvaliableResponse(

        @SerializedName("isDomainAvaliable")
        val result: Boolean
)

class IsDomainAvaliableParam(@SerializedName("domain")
                             var domain: String? = null) {

    fun domain(domain: String): IsDomainAvaliableParam {
        this.domain = domain
        return this
    }

    fun build(): IsDomainAvaliableParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                isDomainAvaliableDocument,
                this
        );
    }

    private val isDomainAvaliableDocument: String = """
query isDomainAvaliable(${'$'}domain: String!) {
  isDomainAvaliable(domain: ${'$'}domain)
}
"""
}


data class IsLoginExpiredResponse(

        @SerializedName("isLoginExpired")
        val result: Boolean
)

class IsLoginExpiredParam(@SerializedName("id")
                          var id: String? = null) {

    fun id(id: String): IsLoginExpiredParam {
        this.id = id
        return this
    }

    fun build(): IsLoginExpiredParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                isLoginExpiredDocument,
                this
        );
    }

    private val isLoginExpiredDocument: String = """
query isLoginExpired(${'$'}id: String!) {
  isLoginExpired(id: ${'$'}id)
}
"""
}


data class IsRootNodeOfOrgResponse(

        @SerializedName("isRootNodeOfOrg")
        val result: Boolean
)

class IsRootNodeOfOrgParam(@SerializedName("input")
                           var input: IsRootNodeOfOrgInput? = null) {

    fun input(input: IsRootNodeOfOrgInput): IsRootNodeOfOrgParam {
        this.input = input
        return this
    }

    fun build(): IsRootNodeOfOrgParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                isRootNodeOfOrgDocument,
                this
        );
    }

    private val isRootNodeOfOrgDocument: String = """
query isRootNodeOfOrg(${'$'}input: IsRootNodeOfOrgInput!) {
  isRootNodeOfOrg(input: ${'$'}input)
}
"""
}


data class IsUserInGroupResponse(

        @SerializedName("isUserInGroup")
        val result: Boolean
)

class IsUserInGroupParam(@SerializedName("groupId")
                         var groupId: String? = null,
                         @SerializedName("userId")
                         var userId: String? = null) {

    fun groupId(groupId: String): IsUserInGroupParam {
        this.groupId = groupId
        return this
    }

    fun userId(userId: String): IsUserInGroupParam {
        this.userId = userId
        return this
    }

    fun build(): IsUserInGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                isUserInGroupDocument,
                this
        );
    }

    private val isUserInGroupDocument: String = """
query isUserInGroup(${'$'}groupId: String!, ${'$'}userId: String!) {
  isUserInGroup(groupId: ${'$'}groupId, userId: ${'$'}userId)
}
"""
}


data class LoginBySecretResponse(

        @SerializedName("getAccessTokenByAppSecret")
        val result: String
)

class LoginBySecretParam(@SerializedName("clientId")
                         var clientId: String? = null,
                         @SerializedName("secret")
                         var secret: String? = null) {

    fun clientId(clientId: String): LoginBySecretParam {
        this.clientId = clientId
        return this
    }

    fun secret(secret: String): LoginBySecretParam {
        this.secret = secret
        return this
    }

    fun build(): LoginBySecretParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginBySecretDocument,
                this
        );
    }

    private val loginBySecretDocument: String = """
query loginBySecret(${'$'}clientId: String, ${'$'}secret: String) {
  getAccessTokenByAppSecret(clientId: ${'$'}clientId, secret: ${'$'}secret)
}
"""
}


data class LoginCountResponse(

        @SerializedName("loginCount")
        val result: UserLoginCount
)

class LoginCountParam(@SerializedName("userId")
                      var userId: String? = null,
                      @SerializedName("clientId")
                      var clientId: String? = null,
                      @SerializedName("month")
                      var month: String? = null) {

    fun userId(userId: String): LoginCountParam {
        this.userId = userId
        return this
    }

    fun clientId(clientId: String): LoginCountParam {
        this.clientId = clientId
        return this
    }

    fun month(month: String): LoginCountParam {
        this.month = month
        return this
    }

    fun build(): LoginCountParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginCountDocument,
                this
        );
    }

    private val loginCountDocument: String = """
query loginCount(${'$'}userId: String, ${'$'}clientId: String, ${'$'}month: String) {
  loginCount(userId: ${'$'}userId, clientId: ${'$'}clientId, month: ${'$'}month) {
    _id
    client
    count
    month
    isError
    totalNumber
  }
}
"""
}


data class LoginHotDotPicDataResponse(

        @SerializedName("loginHotDotPicData")
        val result: LoginHotDotPicData
)

class LoginHotDotPicDataParam(@SerializedName("client")
                              var client: String? = null) {

    fun client(client: String): LoginHotDotPicDataParam {
        this.client = client
        return this
    }

    fun build(): LoginHotDotPicDataParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                loginHotDotPicDataDocument,
                this
        );
    }

    private val loginHotDotPicDataDocument: String = """
query loginHotDotPicData(${'$'}client: String) {
  loginHotDotPicData(client: ${'$'}client) {
    list
  }
}
"""
}


data class NotBindOAuthListResponse(

        @SerializedName("notBindOAuthList")
        val result: List<NotBindOAuth>
)

class NotBindOAuthListParam(@SerializedName("client")
                            var client: String? = null,
                            @SerializedName("user")
                            var user: String? = null) {

    fun client(client: String): NotBindOAuthListParam {
        this.client = client
        return this
    }

    fun user(user: String): NotBindOAuthListParam {
        this.user = user
        return this
    }

    fun build(): NotBindOAuthListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                notBindOAuthListDocument,
                this
        );
    }

    private val notBindOAuthListDocument: String = """
query notBindOAuthList(${'$'}client: String, ${'$'}user: String) {
  notBindOAuthList(client: ${'$'}client, user: ${'$'}user) {
    type
    oAuthUrl
    image
    name
    binded
  }
}
"""
}


data class OrgResponse(

        @SerializedName("org")
        val result: Org
)

class OrgParam(@SerializedName("_id")
               var _id: String? = null) {

    fun _id(_id: String): OrgParam {
        this._id = _id
        return this
    }

    fun build(): OrgParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                orgDocument,
                this
        );
    }

    private val orgDocument: String = """
query org(${'$'}_id: String!) {
  org(_id: ${'$'}_id) {
    _id
    nodes {
      _id
      name
      description
      createdAt
      updatedAt
      children
      root
    }
  }
}
"""
}


data class OrgChildrenNodesResponse(

        @SerializedName("orgChildrenNodes")
        val result: List<OrgChildNode>
)

class OrgChildrenNodesParam(@SerializedName("input")
                            var input: OrgChildrenNodesInput? = null) {

    fun input(input: OrgChildrenNodesInput): OrgChildrenNodesParam {
        this.input = input
        return this
    }

    fun build(): OrgChildrenNodesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                orgChildrenNodesDocument,
                this
        );
    }

    private val orgChildrenNodesDocument: String = """
query orgChildrenNodes(${'$'}input: OrgChildrenNodesInput!) {
  orgChildrenNodes(input: ${'$'}input) {
    group {
      _id
      userPoolId
      name
      description
      createdAt
      updatedAt
    }
    depth
  }
}
"""
}


data class OrgNodeUserListResponse(

        @SerializedName("orgNodeUserList")
        val result: PagedUsers
)

class OrgNodeUserListParam(@SerializedName("orgId")
                           var orgId: String? = null,
                           @SerializedName("nodeId")
                           var nodeId: String? = null,
                           @SerializedName("page")
                           var page: Int? = null,
                           @SerializedName("count")
                           var count: Int? = null,
                           @SerializedName("includeChildrenNodes")
                           var includeChildrenNodes: Boolean? = null) {

    fun orgId(orgId: String): OrgNodeUserListParam {
        this.orgId = orgId
        return this
    }

    fun nodeId(nodeId: String): OrgNodeUserListParam {
        this.nodeId = nodeId
        return this
    }

    fun page(page: Int): OrgNodeUserListParam {
        this.page = page
        return this
    }

    fun count(count: Int): OrgNodeUserListParam {
        this.count = count
        return this
    }

    fun includeChildrenNodes(includeChildrenNodes: Boolean): OrgNodeUserListParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun build(): OrgNodeUserListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                orgNodeUserListDocument,
                this
        );
    }

    private val orgNodeUserListDocument: String = """
query orgNodeUserList(${'$'}orgId: String!, ${'$'}nodeId: String!, ${'$'}page: Int, ${'$'}count: Int, ${'$'}includeChildrenNodes: Boolean) {
  orgNodeUserList(orgId: ${'$'}orgId, nodeId: ${'$'}nodeId, page: ${'$'}page, count: ${'$'}count, includeChildrenNodes: ${'$'}includeChildrenNodes) {
    list {
      _id
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      username
      nickname
      company
      photo
      browser
      device
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      customData
      metadata
    }
    totalCount
  }
}
"""
}


data class OrgRootNodeResponse(

        @SerializedName("orgRootNode")
        val result: RbacGroup
)

class OrgRootNodeParam(@SerializedName("sortBy")
                       var sortBy: SortByEnum? = null,
                       @SerializedName("page")
                       var page: Int? = null,
                       @SerializedName("count")
                       var count: Int? = null,
                       @SerializedName("_id")
                       var _id: String? = null) {

    fun sortBy(sortBy: SortByEnum): OrgRootNodeParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): OrgRootNodeParam {
        this.page = page
        return this
    }

    fun count(count: Int): OrgRootNodeParam {
        this.count = count
        return this
    }

    fun _id(_id: String): OrgRootNodeParam {
        this._id = _id
        return this
    }

    fun build(): OrgRootNodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                orgRootNodeDocument,
                this
        );
    }

    private val orgRootNodeDocument: String = """
query orgRootNode(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}_id: String!) {
  orgRootNode(_id: ${'$'}_id) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    roles {
      totalCount
    }
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class OrgsResponse(

        @SerializedName("orgs")
        val result: PagedOrg
)

class OrgsParam(@SerializedName("userPoolId")
                var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): OrgsParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): OrgsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                orgsDocument,
                this
        );
    }

    private val orgsDocument: String = """
query orgs(${'$'}userPoolId: String!) {
  orgs(userPoolId: ${'$'}userPoolId) {
    totalCount
    list {
      _id
      logo
      nodes {
        _id
        name
        description
        createdAt
        updatedAt
        children
        root
      }
    }
  }
}
"""
}


data class PlatformUserGrowthTrendResponse(

        @SerializedName("platformUserGrowthTrend")
        val result: List<DayUserGrowth>
)

class PlatformUserGrowthTrendParam(@SerializedName("today")
                                   var today: String? = null) {

    fun today(today: String): PlatformUserGrowthTrendParam {
        this.today = today
        return this
    }

    fun build(): PlatformUserGrowthTrendParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                platformUserGrowthTrendDocument,
                this
        );
    }

    private val platformUserGrowthTrendDocument: String = """
query platformUserGrowthTrend(${'$'}today: String) {
  platformUserGrowthTrend(today: ${'$'}today) {
    day
    count
  }
}
"""
}


data class PreviewEmailTemplateResponse(

        @SerializedName("previewEmailTemplate")
        val result: CommonMessage
)

class PreviewEmailTemplateParam(@SerializedName("type")
                                var type: String? = null,
                                @SerializedName("client")
                                var client: String? = null) {

    fun type(type: String): PreviewEmailTemplateParam {
        this.type = type
        return this
    }

    fun client(client: String): PreviewEmailTemplateParam {
        this.client = client
        return this
    }

    fun build(): PreviewEmailTemplateParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                previewEmailTemplateDocument,
                this
        );
    }

    private val previewEmailTemplateDocument: String = """
query previewEmailTemplate(${'$'}type: String, ${'$'}client: String) {
  previewEmailTemplate(type: ${'$'}type, client: ${'$'}client) {
    message
    code
    status
  }
}
"""
}


data class ProviderListByAdConnectorResponse(

        @SerializedName("providerListByADConnector")
        val result: List<AdConnectorEnabledProvider>
)

class ProviderListByAdConnectorParam(@SerializedName("_id")
                                     var _id: String? = null) {

    fun _id(_id: String): ProviderListByAdConnectorParam {
        this._id = _id
        return this
    }

    fun build(): ProviderListByAdConnectorParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                providerListByAdConnectorDocument,
                this
        );
    }

    private val providerListByAdConnectorDocument: String = """
query providerListByADConnector(${'$'}_id: String!) {
  providerListByADConnector(_id: ${'$'}_id) {
    providerType
    providerId
    userPoolId
    adConnectorId
  }
}
"""
}


data class QiNiuUploadTokenResponse(

        @SerializedName("qiNiuUploadToken")
        val result: String
)

class QiNiuUploadTokenParam(@SerializedName("type")
                            var type: String? = null) {

    fun type(type: String): QiNiuUploadTokenParam {
        this.type = type
        return this
    }

    fun build(): QiNiuUploadTokenParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                qiNiuUploadTokenDocument,
                this
        );
    }

    private val qiNiuUploadTokenDocument: String = """
query qiNiuUploadToken(${'$'}type: String) {
  qiNiuUploadToken(type: ${'$'}type)
}
"""
}


data class QpsByTimeResponse(

        @SerializedName("qpsByTime")
        val result: List<QpsByTime>
)

class QpsByTimeParam(@SerializedName("startTime")
                     var startTime: String? = null,
                     @SerializedName("endTime")
                     var endTime: String? = null,
                     @SerializedName("currentTime")
                     var currentTime: String? = null) {

    fun startTime(startTime: String): QpsByTimeParam {
        this.startTime = startTime
        return this
    }

    fun endTime(endTime: String): QpsByTimeParam {
        this.endTime = endTime
        return this
    }

    fun currentTime(currentTime: String): QpsByTimeParam {
        this.currentTime = currentTime
        return this
    }

    fun build(): QpsByTimeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                qpsByTimeDocument,
                this
        );
    }

    private val qpsByTimeDocument: String = """
query qpsByTime(${'$'}startTime: String, ${'$'}endTime: String, ${'$'}currentTime: String) {
  qpsByTime(startTime: ${'$'}startTime, endTime: ${'$'}endTime, currentTime: ${'$'}currentTime) {
    qps
    time
  }
}
"""
}


data class QueryAuthAuditRecordsResponse(

        @SerializedName("queryAuthAuditRecords")
        val result: AuthAuditRecordsList
)

class QueryAuthAuditRecordsParam(@SerializedName("userPoolId")
                                 var userPoolId: String? = null,
                                 @SerializedName("sortBy")
                                 var sortBy: String? = null,
                                 @SerializedName("page")
                                 var page: Int? = null,
                                 @SerializedName("count")
                                 var count: Int? = null) {

    fun userPoolId(userPoolId: String): QueryAuthAuditRecordsParam {
        this.userPoolId = userPoolId
        return this
    }

    fun sortBy(sortBy: String): QueryAuthAuditRecordsParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): QueryAuthAuditRecordsParam {
        this.page = page
        return this
    }

    fun count(count: Int): QueryAuthAuditRecordsParam {
        this.count = count
        return this
    }

    fun build(): QueryAuthAuditRecordsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryAuthAuditRecordsDocument,
                this
        );
    }

    private val queryAuthAuditRecordsDocument: String = """
query queryAuthAuditRecords(${'$'}userPoolId: String!, ${'$'}sortBy: String, ${'$'}page: Int, ${'$'}count: Int) {
  queryAuthAuditRecords(userPoolId: ${'$'}userPoolId, sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
    list {
      userPoolId
      appType
      appId
      event
      userId
      createdAt
    }
    totalCount
  }
}
"""
}


data class QueryAuthorizedUserPoolResponse(

        @SerializedName("queryAuthorizedUserPool")
        val result: PagedUserPoolWithMfa
)

class QueryAuthorizedUserPoolParam(@SerializedName("unionid")
                                   var unionid: String? = null,
                                   @SerializedName("phone")
                                   var phone: String? = null,
                                   @SerializedName("openid")
                                   var openid: String? = null,
                                   @SerializedName("page")
                                   var page: Int? = null,
                                   @SerializedName("count")
                                   var count: Int? = null) {

    fun unionid(unionid: String): QueryAuthorizedUserPoolParam {
        this.unionid = unionid
        return this
    }

    fun phone(phone: String): QueryAuthorizedUserPoolParam {
        this.phone = phone
        return this
    }

    fun openid(openid: String): QueryAuthorizedUserPoolParam {
        this.openid = openid
        return this
    }

    fun page(page: Int): QueryAuthorizedUserPoolParam {
        this.page = page
        return this
    }

    fun count(count: Int): QueryAuthorizedUserPoolParam {
        this.count = count
        return this
    }

    fun build(): QueryAuthorizedUserPoolParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryAuthorizedUserPoolDocument,
                this
        );
    }

    private val queryAuthorizedUserPoolDocument: String = """
query queryAuthorizedUserPool(${'$'}unionid: String, ${'$'}phone: String, ${'$'}openid: String, ${'$'}page: Int, ${'$'}count: Int) {
  queryAuthorizedUserPool(unionid: ${'$'}unionid, phone: ${'$'}phone, openid: ${'$'}openid, page: ${'$'}page, count: ${'$'}count) {
    list {
      userId
    }
    total
  }
}
"""
}


data class QueryClientResponse(

        @SerializedName("queryClient")
        val result: UserClient
)

class QueryClientParam(@SerializedName("id")
                       var id: String? = null) {

    fun id(id: String): QueryClientParam {
        this.id = id
        return this
    }

    fun build(): QueryClientParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryClientDocument,
                this
        );
    }

    private val queryClientDocument: String = """
query queryClient(${'$'}id: String!) {
  queryClient(id: ${'$'}id) {
    _id
    user {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    clientType {
      _id
      name
      description
      image
      example
    }
    userPoolTypes {
      _id
      name
      description
      image
      example
    }
    usersCount
    logo
    emailVerifiedDefault
    sendWelcomeEmail
    registerDisabled
    showWXMPQRCode
    useMiniLogin
    useSelfWxapp
    allowedOrigins
    name
    secret
    token
    descriptions
    jwtExpired
    createdAt
    isDeleted
    frequentRegisterCheck {
      timeInterval
      limit
      enable
    }
    loginFailCheck {
      timeInterval
      limit
      enable
    }
    enableEmail
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
  }
}
"""
}


data class QueryCollaborationByUserPoolIdAndUserIdResponse(

        @SerializedName("queryCollaborationByUserPoolIdAndUserId")
        val result: Collaboration
)

class QueryCollaborationByUserPoolIdAndUserIdParam(@SerializedName("userId")
                                                   var userId: String? = null,
                                                   @SerializedName("userPoolId")
                                                   var userPoolId: String? = null) {

    fun userId(userId: String): QueryCollaborationByUserPoolIdAndUserIdParam {
        this.userId = userId
        return this
    }

    fun userPoolId(userPoolId: String): QueryCollaborationByUserPoolIdAndUserIdParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): QueryCollaborationByUserPoolIdAndUserIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryCollaborationByUserPoolIdAndUserIdDocument,
                this
        );
    }

    private val queryCollaborationByUserPoolIdAndUserIdDocument: String = """
query queryCollaborationByUserPoolIdAndUserId(${'$'}userId: String!, ${'$'}userPoolId: String!) {
  queryCollaborationByUserPoolIdAndUserId(userId: ${'$'}userId, userPoolId: ${'$'}userPoolId) {
    _id
    createdAt
    owner {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    collaborator {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    userPool {
      _id
      usersCount
      logo
      emailVerifiedDefault
      sendWelcomeEmail
      registerDisabled
      showWXMPQRCode
      useMiniLogin
      useSelfWxapp
      allowedOrigins
      name
      secret
      token
      descriptions
      jwtExpired
      createdAt
      isDeleted
      enableEmail
    }
    permissionDescriptors {
      permissionId
      name
      operationAllow
    }
  }
}
"""
}


data class QueryCollaborativeUserPoolByUserIdResponse(

        @SerializedName("queryCollaborativeUserPoolByUserId")
        val result: CollaborativeUserPoolList
)

class QueryCollaborativeUserPoolByUserIdParam(@SerializedName("userId")
                                              var userId: String? = null,
                                              @SerializedName("page")
                                              var page: Int? = null,
                                              @SerializedName("count")
                                              var count: Int? = null) {

    fun userId(userId: String): QueryCollaborativeUserPoolByUserIdParam {
        this.userId = userId
        return this
    }

    fun page(page: Int): QueryCollaborativeUserPoolByUserIdParam {
        this.page = page
        return this
    }

    fun count(count: Int): QueryCollaborativeUserPoolByUserIdParam {
        this.count = count
        return this
    }

    fun build(): QueryCollaborativeUserPoolByUserIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryCollaborativeUserPoolByUserIdDocument,
                this
        );
    }

    private val queryCollaborativeUserPoolByUserIdDocument: String = """
query queryCollaborativeUserPoolByUserId(${'$'}userId: String!, ${'$'}page: Int, ${'$'}count: Int) {
  queryCollaborativeUserPoolByUserId(userId: ${'$'}userId, page: ${'$'}page, count: ${'$'}count) {
    list {
      _id
      createdAt
    }
    totalCount
  }
}
"""
}


data class QueryCollaboratorPermissionsResponse(

        @SerializedName("queryCollaboratorPermissions")
        val result: CollaboratorPermissions
)

class QueryCollaboratorPermissionsParam(@SerializedName("userId")
                                        var userId: String? = null,
                                        @SerializedName("collaborationId")
                                        var collaborationId: String? = null) {

    fun userId(userId: String): QueryCollaboratorPermissionsParam {
        this.userId = userId
        return this
    }

    fun collaborationId(collaborationId: String): QueryCollaboratorPermissionsParam {
        this.collaborationId = collaborationId
        return this
    }

    fun build(): QueryCollaboratorPermissionsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryCollaboratorPermissionsDocument,
                this
        );
    }

    private val queryCollaboratorPermissionsDocument: String = """
query queryCollaboratorPermissions(${'$'}userId: String, ${'$'}collaborationId: String) {
  queryCollaboratorPermissions(userId: ${'$'}userId, collaborationId: ${'$'}collaborationId) {
    collaborator {
      _id
      username
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      nickname
      company
      photo
      browser
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      device
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      oldPassword
      metadata
    }
    list {
      permissionId
      name
      operationAllow
    }
  }
}
"""
}


data class QueryCollaboratorsByUserPoolIdResponse(

        @SerializedName("queryCollaboratorsByUserPoolId")
        val result: Collaborators
)

class QueryCollaboratorsByUserPoolIdParam(@SerializedName("userPoolId")
                                          var userPoolId: String? = null,
                                          @SerializedName("count")
                                          var count: Int? = null,
                                          @SerializedName("page")
                                          var page: Int? = null) {

    fun userPoolId(userPoolId: String): QueryCollaboratorsByUserPoolIdParam {
        this.userPoolId = userPoolId
        return this
    }

    fun count(count: Int): QueryCollaboratorsByUserPoolIdParam {
        this.count = count
        return this
    }

    fun page(page: Int): QueryCollaboratorsByUserPoolIdParam {
        this.page = page
        return this
    }

    fun build(): QueryCollaboratorsByUserPoolIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryCollaboratorsByUserPoolIdDocument,
                this
        );
    }

    private val queryCollaboratorsByUserPoolIdDocument: String = """
query queryCollaboratorsByUserPoolId(${'$'}userPoolId: String!, ${'$'}count: Int, ${'$'}page: Int) {
  queryCollaboratorsByUserPoolId(userPoolId: ${'$'}userPoolId, count: ${'$'}count, page: ${'$'}page) {
    collaborationId
    list {
      _id
      createdAt
    }
  }
}
"""
}


data class QueryInvitationResponse(

        @SerializedName("queryInvitation")
        val result: List<Invitation>
)

class QueryInvitationParam(@SerializedName("client")
                           var client: String? = null) {

    fun client(client: String): QueryInvitationParam {
        this.client = client
        return this
    }

    fun build(): QueryInvitationParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryInvitationDocument,
                this
        );
    }

    private val queryInvitationDocument: String = """
query queryInvitation(${'$'}client: String!) {
  queryInvitation(client: ${'$'}client) {
    client
    phone
    isDeleted
    createdAt
    updatedAt
  }
}
"""
}


data class QueryInvitationStateResponse(

        @SerializedName("queryInvitationState")
        val result: InvitationState
)

class QueryInvitationStateParam(@SerializedName("client")
                                var client: String? = null) {

    fun client(client: String): QueryInvitationStateParam {
        this.client = client
        return this
    }

    fun build(): QueryInvitationStateParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryInvitationStateDocument,
                this
        );
    }

    private val queryInvitationStateDocument: String = """
query queryInvitationState(${'$'}client: String!) {
  queryInvitationState(client: ${'$'}client) {
    client
    enablePhone
    createdAt
    updatedAt
  }
}
"""
}


data class QueryMfaResponse(

        @SerializedName("queryMFA")
        val result: Mfa
)

class QueryMfaParam(@SerializedName("_id")
                    var _id: String? = null,
                    @SerializedName("userId")
                    var userId: String? = null,
                    @SerializedName("userPoolId")
                    var userPoolId: String? = null) {

    fun _id(_id: String): QueryMfaParam {
        this._id = _id
        return this
    }

    fun userId(userId: String): QueryMfaParam {
        this.userId = userId
        return this
    }

    fun userPoolId(userPoolId: String): QueryMfaParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): QueryMfaParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryMfaDocument,
                this
        );
    }

    private val queryMfaDocument: String = """
query queryMFA(${'$'}_id: String, ${'$'}userId: String, ${'$'}userPoolId: String) {
  queryMFA(_id: ${'$'}_id, userId: ${'$'}userId, userPoolId: ${'$'}userPoolId) {
    _id
    userId
    userPoolId
    enable
    shareKey
  }
}
"""
}


data class QueryOperationLogsResponse(

        @SerializedName("queryOperationLogs")
        val result: OperationLogsList
)

class QueryOperationLogsParam(@SerializedName("userPoolId")
                              var userPoolId: String? = null,
                              @SerializedName("coll")
                              var coll: String? = null,
                              @SerializedName("page")
                              var page: Int? = null,
                              @SerializedName("count")
                              var count: Int? = null) {

    fun userPoolId(userPoolId: String): QueryOperationLogsParam {
        this.userPoolId = userPoolId
        return this
    }

    fun coll(coll: String): QueryOperationLogsParam {
        this.coll = coll
        return this
    }

    fun page(page: Int): QueryOperationLogsParam {
        this.page = page
        return this
    }

    fun count(count: Int): QueryOperationLogsParam {
        this.count = count
        return this
    }

    fun build(): QueryOperationLogsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryOperationLogsDocument,
                this
        );
    }

    private val queryOperationLogsDocument: String = """
query queryOperationLogs(${'$'}userPoolId: String!, ${'$'}coll: String!, ${'$'}page: Int, ${'$'}count: Int) {
  queryOperationLogs(userPoolId: ${'$'}userPoolId, coll: ${'$'}coll, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      operatorId
      operatorName
      operatorAvatar
      isAdmin
      isCollaborator
      isOwner
      operationType
      updatedFields
      removedFields
      operateAt
      fullDocument
      coll
    }
  }
}
"""
}


data class QueryPasswordFaasEnabledResponse(

        @SerializedName("queryPasswordFaasEnabled")
        val result: PaaswordFaas
)

class QueryPasswordFaasEnabledParam(@SerializedName("client")
                                    var client: String? = null) {

    fun client(client: String): QueryPasswordFaasEnabledParam {
        this.client = client
        return this
    }

    fun build(): QueryPasswordFaasEnabledParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryPasswordFaasEnabledDocument,
                this
        );
    }

    private val queryPasswordFaasEnabledDocument: String = """
query queryPasswordFaasEnabled(${'$'}client: String!) {
  queryPasswordFaasEnabled(client: ${'$'}client) {
    encryptUrl
    decryptUrl
    user
    client
    logs
    enable
    createdAt
    updatedAt
  }
}
"""
}


data class QueryPasswordStrengthSettingsByUserPoolIdResponse(

        @SerializedName("queryPasswordStrengthSettingsByUserPoolId")
        val result: PasswordStrengthSettings
)

class QueryPasswordStrengthSettingsByUserPoolIdParam(@SerializedName("userPoolId")
                                                     var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): QueryPasswordStrengthSettingsByUserPoolIdParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): QueryPasswordStrengthSettingsByUserPoolIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryPasswordStrengthSettingsByUserPoolIdDocument,
                this
        );
    }

    private val queryPasswordStrengthSettingsByUserPoolIdDocument: String = """
query queryPasswordStrengthSettingsByUserPoolId(${'$'}userPoolId: String!) {
  queryPasswordStrengthSettingsByUserPoolId(userPoolId: ${'$'}userPoolId) {
    userPoolId
    pwdStrength
  }
}
"""
}


data class QueryPermissionListResponse(

        @SerializedName("queryPermissionList")
        val result: PermissionList
)

class QueryPermissionListParam {


    fun build(): QueryPermissionListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryPermissionListDocument,
                this
        );
    }

    private val queryPermissionListDocument: String = """
query queryPermissionList {
  queryPermissionList {
    list {
      _id
      name
      affect
      description
    }
    totalCount
  }
}
"""
}


data class QueryProviderInfoByAppIdResponse(

        @SerializedName("queryProviderInfoByAppId")
        val result: ProviderGeneralInfo
)

class QueryProviderInfoByAppIdParam(@SerializedName("appId")
                                    var appId: String? = null) {

    fun appId(appId: String): QueryProviderInfoByAppIdParam {
        this.appId = appId
        return this
    }

    fun build(): QueryProviderInfoByAppIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryProviderInfoByAppIdDocument,
                this
        );
    }

    private val queryProviderInfoByAppIdDocument: String = """
query queryProviderInfoByAppId(${'$'}appId: String) {
  queryProviderInfoByAppId(appId: ${'$'}appId) {
    _id
    type
    name
    image
    domain
    clientId
    client_id
    css
    redirect_uris
  }
}
"""
}


data class QueryProviderInfoByDomainResponse(

        @SerializedName("queryProviderInfoByDomain")
        val result: ProviderGeneralInfo
)

class QueryProviderInfoByDomainParam(@SerializedName("domain")
                                     var domain: String? = null) {

    fun domain(domain: String): QueryProviderInfoByDomainParam {
        this.domain = domain
        return this
    }

    fun build(): QueryProviderInfoByDomainParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryProviderInfoByDomainDocument,
                this
        );
    }

    private val queryProviderInfoByDomainDocument: String = """
query queryProviderInfoByDomain(${'$'}domain: String) {
  queryProviderInfoByDomain(domain: ${'$'}domain) {
    _id
    type
    name
    image
    domain
    clientId
    client_id
    css
    redirect_uris
  }
}
"""
}


data class QueryRbacGroupUserListResponse(

        @SerializedName("rbacGroup")
        val result: RbacGroup
)

class QueryRbacGroupUserListParam(@SerializedName("_id")
                                  var _id: String? = null,
                                  @SerializedName("sortBy")
                                  var sortBy: SortByEnum? = null,
                                  @SerializedName("page")
                                  var page: Int? = null,
                                  @SerializedName("count")
                                  var count: Int? = null) {

    fun _id(_id: String): QueryRbacGroupUserListParam {
        this._id = _id
        return this
    }

    fun sortBy(sortBy: SortByEnum): QueryRbacGroupUserListParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): QueryRbacGroupUserListParam {
        this.page = page
        return this
    }

    fun count(count: Int): QueryRbacGroupUserListParam {
        this.count = count
        return this
    }

    fun build(): QueryRbacGroupUserListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryRbacGroupUserListDocument,
                this
        );
    }

    private val queryRbacGroupUserListDocument: String = """
query QueryRBACGroupUserList(${'$'}_id: String!, ${'$'}sortBy: SortByEnum = CREATEDAT_DESC, ${'$'}page: Int = 0, ${'$'}count: Int = 10) {
  rbacGroup(_id: ${'$'}_id) {
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
      list {
        _id
        unionid
        email
        emailVerified
        username
        nickname
        company
        photo
        phone
        browser
        registerInClient
        registerMethod
        oauth
        token
        tokenExpiredAt
        loginsCount
        lastLogin
        lastIP
        signedUp
        blocked
        isDeleted
        metadata
      }
    }
  }
}
"""
}


data class QueryRoleByUserIdResponse(

        @SerializedName("queryRoleByUserId")
        val result: PagedUserGroup
)

class QueryRoleByUserIdParam(@SerializedName("user")
                             var user: String? = null,
                             @SerializedName("client")
                             var client: String? = null) {

    fun user(user: String): QueryRoleByUserIdParam {
        this.user = user
        return this
    }

    fun client(client: String): QueryRoleByUserIdParam {
        this.client = client
        return this
    }

    fun build(): QueryRoleByUserIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryRoleByUserIdDocument,
                this
        );
    }

    private val queryRoleByUserIdDocument: String = """
query queryRoleByUserId(${'$'}user: String!, ${'$'}client: String!) {
  queryRoleByUserId(user: ${'$'}user, client: ${'$'}client) {
    list {
      _id
      createdAt
    }
    totalCount
  }
}
"""
}


data class QuerySmsSendCountResponse(

        @SerializedName("querySMSSendCount")
        val result: SmsCountInfo
)

class QuerySmsSendCountParam(@SerializedName("userPoolId")
                             var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): QuerySmsSendCountParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): QuerySmsSendCountParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                querySmsSendCountDocument,
                this
        );
    }

    private val querySmsSendCountDocument: String = """
query querySMSSendCount(${'$'}userPoolId: String!) {
  querySMSSendCount(userPoolId: ${'$'}userPoolId) {
    count
    limitCount
  }
}
"""
}


data class QuerySystemOAuthSettingResponse(

        @SerializedName("querySystemOAuthSetting")
        val result: List<OAuthList>
)

class QuerySystemOAuthSettingParam {


    fun build(): QuerySystemOAuthSettingParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                querySystemOAuthSettingDocument,
                this
        );
    }

    private val querySystemOAuthSettingDocument: String = """
query querySystemOAuthSetting {
  querySystemOAuthSetting {
    _id
    name
    alias
    image
    description
    enabled
    url
    client
    user
    oAuthUrl
    wxappLogo
    fields {
      label
      type
      placeholder
      value
      checked
    }
    oauth {
      _id
      name
      alias
      image
      description
      enabled
      url
      client
      user
      oAuthUrl
      wxappLogo
    }
  }
}
"""
}


data class QueryUserPoolCommonInfoResponse(

        @SerializedName("queryUserPoolCommonInfo")
        val result: UserPoolCommonInfo
)

class QueryUserPoolCommonInfoParam(@SerializedName("userPoolId")
                                   var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): QueryUserPoolCommonInfoParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): QueryUserPoolCommonInfoParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                queryUserPoolCommonInfoDocument,
                this
        );
    }

    private val queryUserPoolCommonInfoDocument: String = """
query queryUserPoolCommonInfo(${'$'}userPoolId: String!) {
  queryUserPoolCommonInfo(userPoolId: ${'$'}userPoolId) {
    _id
    changePhoneStrategy {
      verifyOldPhone
    }
    changeEmailStrategy {
      verifyOldEmail
    }
  }
}
"""
}


data class RbacGroupListResponse(

        @SerializedName("rbacGroupList")
        val result: PagedRbacGroup
)

class RbacGroupListParam(@SerializedName("userPoolId")
                         var userPoolId: String? = null,
                         @SerializedName("sortBy")
                         var sortBy: SortByEnum? = null,
                         @SerializedName("page")
                         var page: Int? = null,
                         @SerializedName("count")
                         var count: Int? = null) {

    fun userPoolId(userPoolId: String): RbacGroupListParam {
        this.userPoolId = userPoolId
        return this
    }

    fun sortBy(sortBy: SortByEnum): RbacGroupListParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RbacGroupListParam {
        this.page = page
        return this
    }

    fun count(count: Int): RbacGroupListParam {
        this.count = count
        return this
    }

    fun build(): RbacGroupListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                rbacGroupListDocument,
                this
        );
    }

    private val rbacGroupListDocument: String = """
query rbacGroupList(${'$'}userPoolId: String!, ${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int) {
  rbacGroupList(userPoolId: ${'$'}userPoolId, sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      _id
      userPoolId
      name
      description
      createdAt
      updatedAt
    }
  }
}
"""
}


data class RbacPermissionResponse(

        @SerializedName("rbacPermission")
        val result: RbacPermission
)

class RbacPermissionParam(@SerializedName("_id")
                          var _id: String? = null) {

    fun _id(_id: String): RbacPermissionParam {
        this._id = _id
        return this
    }

    fun build(): RbacPermissionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                rbacPermissionDocument,
                this
        );
    }

    private val rbacPermissionDocument: String = """
query rbacPermission(${'$'}_id: String!) {
  rbacPermission(_id: ${'$'}_id) {
    _id
    name
    userPoolId
    createdAt
    updatedAt
    description
  }
}
"""
}


data class RbacPermissionListResponse(

        @SerializedName("rbacPermissionList")
        val result: PagedRbacPermission
)

class RbacPermissionListParam(@SerializedName("userPoolId")
                              var userPoolId: String? = null,
                              @SerializedName("sortBy")
                              var sortBy: SortByEnum? = null,
                              @SerializedName("page")
                              var page: Int? = null,
                              @SerializedName("count")
                              var count: Int? = null) {

    fun userPoolId(userPoolId: String): RbacPermissionListParam {
        this.userPoolId = userPoolId
        return this
    }

    fun sortBy(sortBy: SortByEnum): RbacPermissionListParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RbacPermissionListParam {
        this.page = page
        return this
    }

    fun count(count: Int): RbacPermissionListParam {
        this.count = count
        return this
    }

    fun build(): RbacPermissionListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                rbacPermissionListDocument,
                this
        );
    }

    private val rbacPermissionListDocument: String = """
query rbacPermissionList(${'$'}userPoolId: String!, ${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int) {
  rbacPermissionList(userPoolId: ${'$'}userPoolId, sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      _id
      name
      userPoolId
      createdAt
      updatedAt
      description
    }
  }
}
"""
}


data class RbacRoleResponse(

        @SerializedName("rbacRole")
        val result: RbacRole
)

class RbacRoleParam(@SerializedName("sortBy")
                    var sortBy: SortByEnum? = null,
                    @SerializedName("page")
                    var page: Int? = null,
                    @SerializedName("count")
                    var count: Int? = null,
                    @SerializedName("_id")
                    var _id: String? = null) {

    fun sortBy(sortBy: SortByEnum): RbacRoleParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RbacRoleParam {
        this.page = page
        return this
    }

    fun count(count: Int): RbacRoleParam {
        this.count = count
        return this
    }

    fun _id(_id: String): RbacRoleParam {
        this._id = _id
        return this
    }

    fun build(): RbacRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                rbacRoleDocument,
                this
        );
    }

    private val rbacRoleDocument: String = """
query rbacRole(${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int, ${'$'}_id: String!) {
  rbacRole(_id: ${'$'}_id) {
    _id
    userPoolId
    name
    description
    createdAt
    updatedAt
    permissions {
      totalCount
    }
    users(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
      totalCount
    }
  }
}
"""
}


data class RbacRoleListResponse(

        @SerializedName("rbacRoleList")
        val result: PagedRbacRole
)

class RbacRoleListParam(@SerializedName("userPoolId")
                        var userPoolId: String? = null,
                        @SerializedName("sortBy")
                        var sortBy: SortByEnum? = null,
                        @SerializedName("page")
                        var page: Int? = null,
                        @SerializedName("count")
                        var count: Int? = null) {

    fun userPoolId(userPoolId: String): RbacRoleListParam {
        this.userPoolId = userPoolId
        return this
    }

    fun sortBy(sortBy: SortByEnum): RbacRoleListParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): RbacRoleListParam {
        this.page = page
        return this
    }

    fun count(count: Int): RbacRoleListParam {
        this.count = count
        return this
    }

    fun build(): RbacRoleListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                rbacRoleListDocument,
                this
        );
    }

    private val rbacRoleListDocument: String = """
query rbacRoleList(${'$'}userPoolId: String!, ${'$'}sortBy: SortByEnum, ${'$'}page: Int, ${'$'}count: Int) {
  rbacRoleList(userPoolId: ${'$'}userPoolId, sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      _id
      userPoolId
      name
      description
      createdAt
      updatedAt
    }
  }
}
"""
}


data class RecentServiceCallResponse(

        @SerializedName("recentServiceCall")
        val result: DayServiceCallListOfAllServices
)

class RecentServiceCallParam(@SerializedName("today")
                             var today: String? = null) {

    fun today(today: String): RecentServiceCallParam {
        this.today = today
        return this
    }

    fun build(): RecentServiceCallParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                recentServiceCallDocument,
                this
        );
    }

    private val recentServiceCallDocument: String = """
query recentServiceCall(${'$'}today: String) {
  recentServiceCall(today: ${'$'}today) {
    userService {
      day
      count
    }
    emailService {
      day
      count
    }
    oAuthService {
      day
      count
    }
    payService {
      day
      count
    }
  }
}
"""
}


data class RegisterEveryDayCountResponse(

        @SerializedName("registerEveryDayCount")
        val result: RegisterEveryDayCount
)

class RegisterEveryDayCountParam(@SerializedName("client")
                                 var client: String? = null) {

    fun client(client: String): RegisterEveryDayCountParam {
        this.client = client
        return this
    }

    fun build(): RegisterEveryDayCountParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                registerEveryDayCountDocument,
                this
        );
    }

    private val registerEveryDayCountDocument: String = """
query registerEveryDayCount(${'$'}client: String) {
  registerEveryDayCount(client: ${'$'}client) {
    list
  }
}
"""
}


data class RegisterMethodTopListResponse(

        @SerializedName("registerMethodTopList")
        val result: List<RegisterMethodList>
)

class RegisterMethodTopListParam(@SerializedName("userPoolId")
                                 var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): RegisterMethodTopListParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): RegisterMethodTopListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                registerMethodTopListDocument,
                this
        );
    }

    private val registerMethodTopListDocument: String = """
query registerMethodTopList(${'$'}userPoolId: String!) {
  registerMethodTopList(userPoolId: ${'$'}userPoolId) {
    method
    count
  }
}
"""
}


data class RequestListResponse(

        @SerializedName("requestList")
        val result: PagedRequestList
)

class RequestListParam(@SerializedName("page")
                       var page: Int? = null,
                       @SerializedName("count")
                       var count: Int? = null) {

    fun page(page: Int): RequestListParam {
        this.page = page
        return this
    }

    fun count(count: Int): RequestListParam {
        this.count = count
        return this
    }

    fun build(): RequestListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                requestListDocument,
                this
        );
    }

    private val requestListDocument: String = """
query requestList(${'$'}page: Int, ${'$'}count: Int) {
  requestList(page: ${'$'}page, count: ${'$'}count) {
    totalCount
    list {
      _id
      when
      where
      ip
      size
      responseTime
      service
    }
  }
}
"""
}


data class RuleByIdResponse(

        @SerializedName("ruleById")
        val result: Rule
)

class RuleByIdParam(@SerializedName("_id")
                    var _id: String? = null) {

    fun _id(_id: String): RuleByIdParam {
        this._id = _id
        return this
    }

    fun build(): RuleByIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                ruleByIdDocument,
                this
        );
    }

    private val ruleByIdDocument: String = """
query ruleById(${'$'}_id: String!) {
  ruleById(_id: ${'$'}_id) {
    _id
    userPoolId
    name
    description
    type
    enabled
    faasUrl
    code
    order
    async
    createdAt
    updatedAt
  }
}
"""
}


data class RuleEnvResponse(

        @SerializedName("ruleEnv")
        val result: PagedRuleEnvVariable
)

class RuleEnvParam(@SerializedName("userPoolId")
                   var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): RuleEnvParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): RuleEnvParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                ruleEnvDocument,
                this
        );
    }

    private val ruleEnvDocument: String = """
query ruleEnv(${'$'}userPoolId: String!) {
  ruleEnv(userPoolId: ${'$'}userPoolId) {
    totalCount
    list {
      key
      value
    }
  }
}
"""
}


data class RulesResponse(

        @SerializedName("rules")
        val result: PagedRules
)

class RulesParam(@SerializedName("userPoolId")
                 var userPoolId: String? = null) {

    fun userPoolId(userPoolId: String): RulesParam {
        this.userPoolId = userPoolId
        return this
    }

    fun build(): RulesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                rulesDocument,
                this
        );
    }

    private val rulesDocument: String = """
query rules(${'$'}userPoolId: String!) {
  rules(userPoolId: ${'$'}userPoolId) {
    totalCount
    list {
      _id
      userPoolId
      name
      description
      type
      enabled
      faasUrl
      code
      order
      async
      createdAt
      updatedAt
    }
  }
}
"""
}


data class SearchOrgNodesResponse(

        @SerializedName("searchOrgNodes")
        val result: List<RbacGroup>
)

class SearchOrgNodesParam(@SerializedName("orgId")
                          var orgId: String? = null,
                          @SerializedName("name")
                          var name: String? = null,
                          @SerializedName("metadata")
                          var metadata: List<KeyValuePairInput>? = null) {

    fun orgId(orgId: String): SearchOrgNodesParam {
        this.orgId = orgId
        return this
    }

    fun name(name: String): SearchOrgNodesParam {
        this.name = name
        return this
    }

    fun metadata(metadata: List<KeyValuePairInput>): SearchOrgNodesParam {
        this.metadata = metadata
        return this
    }

    fun build(): SearchOrgNodesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                searchOrgNodesDocument,
                this
        );
    }

    private val searchOrgNodesDocument: String = """
query searchOrgNodes(${'$'}orgId: String!, ${'$'}name: String, ${'$'}metadata: [KeyValuePair!]) {
  searchOrgNodes(orgId: ${'$'}orgId, name: ${'$'}name, metadata: ${'$'}metadata) {
    _id
    name
    description
    createdAt
    updatedAt
  }
}
"""
}


data class SearchUserResponse(

        @SerializedName("searchUser")
        val result: PagedUsers
)

class SearchUserParam(@SerializedName("type")
                      var type: String? = null,
                      @SerializedName("value")
                      var value: String? = null,
                      @SerializedName("registerInClient")
                      var registerInClient: String? = null,
                      @SerializedName("page")
                      var page: Int? = null,
                      @SerializedName("count")
                      var count: Int? = null) {

    fun type(type: String): SearchUserParam {
        this.type = type
        return this
    }

    fun value(value: String): SearchUserParam {
        this.value = value
        return this
    }

    fun registerInClient(registerInClient: String): SearchUserParam {
        this.registerInClient = registerInClient
        return this
    }

    fun page(page: Int): SearchUserParam {
        this.page = page
        return this
    }

    fun count(count: Int): SearchUserParam {
        this.count = count
        return this
    }

    fun build(): SearchUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                searchUserDocument,
                this
        );
    }

    private val searchUserDocument: String = """
query searchUser(${'$'}type: String!, ${'$'}value: String!, ${'$'}registerInClient: String!, ${'$'}page: Int, ${'$'}count: Int) {
  searchUser(type: ${'$'}type, value: ${'$'}value, registerInClient: ${'$'}registerInClient, page: ${'$'}page, count: ${'$'}count) {
    list {
      _id
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      username
      nickname
      company
      photo
      browser
      device
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      customData
      metadata
    }
    totalCount
  }
}
"""
}


data class SearchUserBasicInfoByIdResponse(

        @SerializedName("searchUserBasicInfoById")
        val result: BasicUserInfo
)

class SearchUserBasicInfoByIdParam(@SerializedName("userId")
                                   var userId: String? = null) {

    fun userId(userId: String): SearchUserBasicInfoByIdParam {
        this.userId = userId
        return this
    }

    fun build(): SearchUserBasicInfoByIdParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                searchUserBasicInfoByIdDocument,
                this
        );
    }

    private val searchUserBasicInfoByIdDocument: String = """
query searchUserBasicInfoById(${'$'}userId: String) {
  searchUserBasicInfoById(userId: ${'$'}userId) {
    _id
    username
    photo
    email
  }
}
"""
}


data class StatisticResponse(

        @SerializedName("statistic")
        val result: Statistic
)

class StatisticParam(@SerializedName("sortBy")
                     var sortBy: String? = null,
                     @SerializedName("page")
                     var page: Int? = null,
                     @SerializedName("count")
                     var count: Int? = null) {

    fun sortBy(sortBy: String): StatisticParam {
        this.sortBy = sortBy
        return this
    }

    fun page(page: Int): StatisticParam {
        this.page = page
        return this
    }

    fun count(count: Int): StatisticParam {
        this.count = count
        return this
    }

    fun build(): StatisticParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                statisticDocument,
                this
        );
    }

    private val statisticDocument: String = """
query statistic(${'$'}sortBy: String, ${'$'}page: Int, ${'$'}count: Int) {
  statistic(sortBy: ${'$'}sortBy, page: ${'$'}page, count: ${'$'}count) {
    list {
      _id
      username
      email
      loginsCount
      appsCount
      OAuthCount
    }
    totalCount
  }
}
"""
}


data class TodayGeoDistributionResponse(

        @SerializedName("todayGeoDistribution")
        val result: List<GeographicalDistributionList>
)

class TodayGeoDistributionParam(@SerializedName("today")
                                var today: String? = null) {

    fun today(today: String): TodayGeoDistributionParam {
        this.today = today
        return this
    }

    fun build(): TodayGeoDistributionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                todayGeoDistributionDocument,
                this
        );
    }

    private val todayGeoDistributionDocument: String = """
query todayGeoDistribution(${'$'}today: String) {
  todayGeoDistribution(today: ${'$'}today) {
    city
    size
    point
  }
}
"""
}


data class UserResponse(

        @SerializedName("user")
        val result: ExtendUser
)

class UserParam(@SerializedName("id")
                var id: String? = null,
                @SerializedName("registerInClient")
                var registerInClient: String? = null,
                @SerializedName("token")
                var token: String? = null,
                @SerializedName("auth")
                var auth: Boolean? = null,
                @SerializedName("userLoginHistoryPage")
                var userLoginHistoryPage: Int? = null,
                @SerializedName("userLoginHistoryCount")
                var userLoginHistoryCount: Int? = null) {

    fun id(id: String): UserParam {
        this.id = id
        return this
    }

    fun registerInClient(registerInClient: String): UserParam {
        this.registerInClient = registerInClient
        return this
    }

    fun token(token: String): UserParam {
        this.token = token
        return this
    }

    fun auth(auth: Boolean): UserParam {
        this.auth = auth
        return this
    }

    fun userLoginHistoryPage(userLoginHistoryPage: Int): UserParam {
        this.userLoginHistoryPage = userLoginHistoryPage
        return this
    }

    fun userLoginHistoryCount(userLoginHistoryCount: Int): UserParam {
        this.userLoginHistoryCount = userLoginHistoryCount
        return this
    }

    fun build(): UserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userDocument,
                this
        );
    }

    private val userDocument: String = """
query user(${'$'}id: String, ${'$'}registerInClient: String, ${'$'}token: String, ${'$'}auth: Boolean, ${'$'}userLoginHistoryPage: Int, ${'$'}userLoginHistoryCount: Int) {
  user(id: ${'$'}id, registerInClient: ${'$'}registerInClient, token: ${'$'}token, auth: ${'$'}auth, userLoginHistoryPage: ${'$'}userLoginHistoryPage, userLoginHistoryCount: ${'$'}userLoginHistoryCount) {
    _id
    email
    unionid
    openid
    emailVerified
    phone
    phoneVerified
    username
    nickname
    company
    photo
    browser
    device
    password
    registerInClient
    registerMethod
    oauth
    token
    tokenExpiredAt
    loginsCount
    lastLogin
    lastIP
    signedUp
    blocked
    isDeleted
    name
    givenName
    familyName
    middleName
    profile
    preferredUsername
    website
    gender
    birthdate
    zoneinfo
    locale
    address
    formatted
    streetAddress
    locality
    region
    postalCode
    country
    updatedAt
    metadata
  }
}
"""
}


data class UserAnalyticsResponse(

        @SerializedName("userAnalytics")
        val result: UserAnalytics
)

class UserAnalyticsParam(@SerializedName("clientId")
                         var clientId: String? = null) {

    fun clientId(clientId: String): UserAnalyticsParam {
        this.clientId = clientId
        return this
    }

    fun build(): UserAnalyticsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userAnalyticsDocument,
                this
        );
    }

    private val userAnalyticsDocument: String = """
query userAnalytics(${'$'}clientId: String) {
  userAnalytics(clientId: ${'$'}clientId) {
    usersAddedToday {
      length
    }
    usersAddedLastWeek {
      length
    }
    usersLoginLastWeek {
      length
    }
    totalUsers {
      length
    }
    allUsers
    totalApps
  }
}
"""
}


data class UserClientListResponse(

        @SerializedName("userClientList")
        val result: PagedUserClientList
)

class UserClientListParam(@SerializedName("page")
                          var page: Int? = null,
                          @SerializedName("count")
                          var count: Int? = null,
                          @SerializedName("sortBy")
                          var sortBy: String? = null) {

    fun page(page: Int): UserClientListParam {
        this.page = page
        return this
    }

    fun count(count: Int): UserClientListParam {
        this.count = count
        return this
    }

    fun sortBy(sortBy: String): UserClientListParam {
        this.sortBy = sortBy
        return this
    }

    fun build(): UserClientListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userClientListDocument,
                this
        );
    }

    private val userClientListDocument: String = """
query userClientList(${'$'}page: Int, ${'$'}count: Int, ${'$'}sortBy: String) {
  userClientList(page: ${'$'}page, count: ${'$'}count, sortBy: ${'$'}sortBy) {
    list {
      _id
      name
      createdAt
      usersCount
    }
    totalCount
  }
}
"""
}


data class UserClientTypesResponse(

        @SerializedName("userClientTypes")
        val result: List<UserClientType>
)

class UserClientTypesParam {


    fun build(): UserClientTypesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userClientTypesDocument,
                this
        );
    }

    private val userClientTypesDocument: String = """
query userClientTypes {
  userClientTypes {
    _id
    name
    description
    image
    example
  }
}
"""
}


data class UserClientsResponse(

        @SerializedName("userClients")
        val result: PagedUserClients
)

class UserClientsParam(@SerializedName("userId")
                       var userId: String? = null,
                       @SerializedName("page")
                       var page: Int? = null,
                       @SerializedName("count")
                       var count: Int? = null,
                       @SerializedName("computeUsersCount")
                       var computeUsersCount: Boolean? = null) {

    fun userId(userId: String): UserClientsParam {
        this.userId = userId
        return this
    }

    fun page(page: Int): UserClientsParam {
        this.page = page
        return this
    }

    fun count(count: Int): UserClientsParam {
        this.count = count
        return this
    }

    fun computeUsersCount(computeUsersCount: Boolean): UserClientsParam {
        this.computeUsersCount = computeUsersCount
        return this
    }

    fun build(): UserClientsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userClientsDocument,
                this
        );
    }

    private val userClientsDocument: String = """
query userClients(${'$'}userId: String!, ${'$'}page: Int, ${'$'}count: Int, ${'$'}computeUsersCount: Boolean) {
  userClients(userId: ${'$'}userId, page: ${'$'}page, count: ${'$'}count, computeUsersCount: ${'$'}computeUsersCount) {
    list {
      _id
      usersCount
      logo
      emailVerifiedDefault
      sendWelcomeEmail
      registerDisabled
      showWXMPQRCode
      useMiniLogin
      useSelfWxapp
      allowedOrigins
      name
      secret
      token
      descriptions
      jwtExpired
      createdAt
      isDeleted
      enableEmail
    }
    totalCount
  }
}
"""
}


data class UserExistResponse(

        @SerializedName("userExist")
        val result: Boolean
)

class UserExistParam(@SerializedName("userPoolId")
                     var userPoolId: String? = null,
                     @SerializedName("email")
                     var email: String? = null,
                     @SerializedName("phone")
                     var phone: String? = null,
                     @SerializedName("username")
                     var username: String? = null) {

    fun userPoolId(userPoolId: String): UserExistParam {
        this.userPoolId = userPoolId
        return this
    }

    fun email(email: String): UserExistParam {
        this.email = email
        return this
    }

    fun phone(phone: String): UserExistParam {
        this.phone = phone
        return this
    }

    fun username(username: String): UserExistParam {
        this.username = username
        return this
    }

    fun build(): UserExistParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userExistDocument,
                this
        );
    }

    private val userExistDocument: String = """
query userExist(${'$'}userPoolId: String!, ${'$'}email: String, ${'$'}phone: String, ${'$'}username: String) {
  userExist(userPoolId: ${'$'}userPoolId, email: ${'$'}email, phone: ${'$'}phone, username: ${'$'}username)
}
"""
}


data class UserGroupResponse(

        @SerializedName("userGroup")
        val result: PagedUserGroup
)

class UserGroupParam(@SerializedName("group")
                     var group: String? = null,
                     @SerializedName("client")
                     var client: String? = null,
                     @SerializedName("page")
                     var page: Int? = null,
                     @SerializedName("count")
                     var count: Int? = null) {

    fun group(group: String): UserGroupParam {
        this.group = group
        return this
    }

    fun client(client: String): UserGroupParam {
        this.client = client
        return this
    }

    fun page(page: Int): UserGroupParam {
        this.page = page
        return this
    }

    fun count(count: Int): UserGroupParam {
        this.count = count
        return this
    }

    fun build(): UserGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userGroupDocument,
                this
        );
    }

    private val userGroupDocument: String = """
query userGroup(${'$'}group: String!, ${'$'}client: String!, ${'$'}page: Int, ${'$'}count: Int) {
  userGroup(group: ${'$'}group, client: ${'$'}client, page: ${'$'}page, count: ${'$'}count) {
    list {
      _id
      createdAt
    }
    totalCount
  }
}
"""
}


data class UserGroupListResponse(

        @SerializedName("userGroupList")
        val result: UserGroupList
)

class UserGroupListParam(@SerializedName("_id")
                         var _id: String? = null) {

    fun _id(_id: String): UserGroupListParam {
        this._id = _id
        return this
    }

    fun build(): UserGroupListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userGroupListDocument,
                this
        );
    }

    private val userGroupListDocument: String = """
query userGroupList(${'$'}_id: String!) {
  userGroupList(_id: ${'$'}_id) {
    totalCount
    list {
      _id
      userPoolId
      name
      description
      createdAt
      updatedAt
    }
    rawList
  }
}
"""
}


data class UserMetadataResponse(

        @SerializedName("userMetadata")
        val result: UserMetaDataList
)

class UserMetadataParam(@SerializedName("_id")
                        var _id: String? = null) {

    fun _id(_id: String): UserMetadataParam {
        this._id = _id
        return this
    }

    fun build(): UserMetadataParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userMetadataDocument,
                this
        );
    }

    private val userMetadataDocument: String = """
query userMetadata(${'$'}_id: String!) {
  userMetadata(_id: ${'$'}_id) {
    totalCount
    list {
      key
      value
    }
  }
}
"""
}


data class UserOAuthCountResponse(

        @SerializedName("userOAuthCount")
        val result: List<Int>
)

class UserOAuthCountParam(@SerializedName("userIds")
                          var userIds: List<String>? = null) {

    fun userIds(userIds: List<String>): UserOAuthCountParam {
        this.userIds = userIds
        return this
    }

    fun build(): UserOAuthCountParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userOAuthCountDocument,
                this
        );
    }

    private val userOAuthCountDocument: String = """
query userOAuthCount(${'$'}userIds: [String]) {
  userOAuthCount(userIds: ${'$'}userIds)
}
"""
}


data class UserPatchResponse(

        @SerializedName("userPatch")
        val result: PatchExtendUser
)

class UserPatchParam(@SerializedName("ids")
                     var ids: String? = null) {

    fun ids(ids: String): UserPatchParam {
        this.ids = ids
        return this
    }

    fun build(): UserPatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userPatchDocument,
                this
        );
    }

    private val userPatchDocument: String = """
query userPatch(${'$'}ids: String) {
  userPatch(ids: ${'$'}ids) {
    list {
      _id
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      username
      nickname
      company
      photo
      browser
      device
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      customData
      metadata
    }
    totalCount
  }
}
"""
}


data class UserPermissionListResponse(

        @SerializedName("userPermissionList")
        val result: UserPermissionList
)

class UserPermissionListParam(@SerializedName("_id")
                              var _id: String? = null) {

    fun _id(_id: String): UserPermissionListParam {
        this._id = _id
        return this
    }

    fun build(): UserPermissionListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userPermissionListDocument,
                this
        );
    }

    private val userPermissionListDocument: String = """
query userPermissionList(${'$'}_id: String!) {
  userPermissionList(_id: ${'$'}_id) {
    totalCount
    list {
      _id
      name
      userPoolId
      createdAt
      updatedAt
      description
    }
    rawList
  }
}
"""
}


data class UserRoleListResponse(

        @SerializedName("userRoleList")
        val result: UserRoleList
)

class UserRoleListParam(@SerializedName("_id")
                        var _id: String? = null) {

    fun _id(_id: String): UserRoleListParam {
        this._id = _id
        return this
    }

    fun build(): UserRoleListParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                userRoleListDocument,
                this
        );
    }

    private val userRoleListDocument: String = """
query userRoleList(${'$'}_id: String!) {
  userRoleList(_id: ${'$'}_id) {
    totalCount
    list {
      _id
      userPoolId
      name
      description
      createdAt
      updatedAt
    }
    rawList
  }
}
"""
}


data class UsersResponse(

        @SerializedName("users")
        val result: PagedUsers
)

class UsersParam(@SerializedName("registerInClient")
                 var registerInClient: String? = null,
                 @SerializedName("page")
                 var page: Int? = null,
                 @SerializedName("count")
                 var count: Int? = null,
                 @SerializedName("populate")
                 var populate: Boolean? = null) {

    fun registerInClient(registerInClient: String): UsersParam {
        this.registerInClient = registerInClient
        return this
    }

    fun page(page: Int): UsersParam {
        this.page = page
        return this
    }

    fun count(count: Int): UsersParam {
        this.count = count
        return this
    }

    fun populate(populate: Boolean): UsersParam {
        this.populate = populate
        return this
    }

    fun build(): UsersParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                usersDocument,
                this
        );
    }

    private val usersDocument: String = """
query users(${'$'}registerInClient: String, ${'$'}page: Int, ${'$'}count: Int, ${'$'}populate: Boolean) {
  users(registerInClient: ${'$'}registerInClient, page: ${'$'}page, count: ${'$'}count, populate: ${'$'}populate) {
    list {
      _id
      email
      unionid
      openid
      emailVerified
      phone
      phoneVerified
      username
      nickname
      company
      photo
      browser
      device
      password
      registerInClient
      registerMethod
      oauth
      token
      tokenExpiredAt
      loginsCount
      lastLogin
      lastIP
      signedUp
      blocked
      isDeleted
      name
      givenName
      familyName
      middleName
      profile
      preferredUsername
      website
      gender
      birthdate
      zoneinfo
      locale
      address
      formatted
      streetAddress
      locality
      region
      postalCode
      country
      updatedAt
      customData
      metadata
    }
    totalCount
  }
}
"""
}


data class UsersByOidcAppResponse(

        @SerializedName("usersByOidcApp")
        val result: UserIds
)

class UsersByOidcAppParam(@SerializedName("userPoolId")
                          var userPoolId: String? = null,
                          @SerializedName("page")
                          var page: Int? = null,
                          @SerializedName("count")
                          var count: Int? = null,
                          @SerializedName("appId")
                          var appId: String? = null) {

    fun userPoolId(userPoolId: String): UsersByOidcAppParam {
        this.userPoolId = userPoolId
        return this
    }

    fun page(page: Int): UsersByOidcAppParam {
        this.page = page
        return this
    }

    fun count(count: Int): UsersByOidcAppParam {
        this.count = count
        return this
    }

    fun appId(appId: String): UsersByOidcAppParam {
        this.appId = appId
        return this
    }

    fun build(): UsersByOidcAppParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                usersByOidcAppDocument,
                this
        );
    }

    private val usersByOidcAppDocument: String = """
query usersByOidcApp(${'$'}userPoolId: String, ${'$'}page: Int, ${'$'}count: Int, ${'$'}appId: String) {
  usersByOidcApp(userPoolId: ${'$'}userPoolId, page: ${'$'}page, count: ${'$'}count, appId: ${'$'}appId) {
    list
    totalCount
  }
}
"""
}


data class UsersInGroupResponse(

        @SerializedName("usersInGroup")
        val result: UsersInGroup
)

class UsersInGroupParam(@SerializedName("group")
                        var group: String? = null,
                        @SerializedName("page")
                        var page: Int? = null,
                        @SerializedName("count")
                        var count: Int? = null) {

    fun group(group: String): UsersInGroupParam {
        this.group = group
        return this
    }

    fun page(page: Int): UsersInGroupParam {
        this.page = page
        return this
    }

    fun count(count: Int): UsersInGroupParam {
        this.count = count
        return this
    }

    fun build(): UsersInGroupParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                usersInGroupDocument,
                this
        );
    }

    private val usersInGroupDocument: String = """
query usersInGroup(${'$'}group: String, ${'$'}page: Int, ${'$'}count: Int) {
  usersInGroup(group: ${'$'}group, page: ${'$'}page, count: ${'$'}count) {
    list {
      email
      username
      _id
      upgrade
    }
    totalCount
  }
}
"""
}


data class ValidatePasswordResponse(

        @SerializedName("validatePassword")
        val result: ValidateResult
)

class ValidatePasswordParam(@SerializedName("userPool")
                            var userPool: String? = null,
                            @SerializedName("password")
                            var password: String? = null,
                            @SerializedName("encryptedPassword")
                            var encryptedPassword: String? = null) {

    fun userPool(userPool: String): ValidatePasswordParam {
        this.userPool = userPool
        return this
    }

    fun password(password: String): ValidatePasswordParam {
        this.password = password
        return this
    }

    fun encryptedPassword(encryptedPassword: String): ValidatePasswordParam {
        this.encryptedPassword = encryptedPassword
        return this
    }

    fun build(): ValidatePasswordParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                validatePasswordDocument,
                this
        );
    }

    private val validatePasswordDocument: String = """
query validatePassword(${'$'}userPool: String!, ${'$'}password: String!, ${'$'}encryptedPassword: String!) {
  validatePassword(userPool: ${'$'}userPool, password: ${'$'}password, encryptedPassword: ${'$'}encryptedPassword) {
    isValid
  }
}
"""
}


data class WxQrCodeLogResponse(

        @SerializedName("wxQRCodeLog")
        val result: WxQrCodeLog
)

class WxQrCodeLogParam(@SerializedName("page")
                       var page: Int? = null,
                       @SerializedName("count")
                       var count: Int? = null,
                       @SerializedName("clientId")
                       var clientId: String? = null,
                       @SerializedName("sortBy")
                       var sortBy: String? = null) {

    fun page(page: Int): WxQrCodeLogParam {
        this.page = page
        return this
    }

    fun count(count: Int): WxQrCodeLogParam {
        this.count = count
        return this
    }

    fun clientId(clientId: String): WxQrCodeLogParam {
        this.clientId = clientId
        return this
    }

    fun sortBy(sortBy: String): WxQrCodeLogParam {
        this.sortBy = sortBy
        return this
    }

    fun build(): WxQrCodeLogParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
                wxQrCodeLogDocument,
                this
        );
    }

    private val wxQrCodeLogDocument: String = """
query wxQRCodeLog(${'$'}page: Int, ${'$'}count: Int, ${'$'}clientId: String, ${'$'}sortBy: String) {
  wxQRCodeLog(page: ${'$'}page, count: ${'$'}count, clientId: ${'$'}clientId, sortBy: ${'$'}sortBy) {
    list {
      random
      expiredAt
      createdAt
      success
      qrcode
      used
      accessToken
      openid
      userInfo
      redirect
    }
    totalCount
  }
}
"""
}
