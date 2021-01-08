package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
import com.google.gson.annotations.SerializedName


data class Query(
    /** @param [qiniuUptoken] qiniuUptoken */
    @SerializedName("qiniuUptoken")
    var qiniuUptoken: String? = null,
    /** @param [isDomainAvaliable] isDomainAvaliable */
    @SerializedName("isDomainAvaliable")
    var isDomainAvaliable: Boolean? = null,
    /** @param [socialConnection] 获取社会化登录定义 */
    @SerializedName("socialConnection")
    var socialConnection: SocialConnection? = null,
    /** @param [socialConnections] 获取所有社会化登录定义 */
    @SerializedName("socialConnections")
    var socialConnections: List<SocialConnection>,
    /** @param [socialConnectionInstance] 获取当前用户池的社会化登录配置 */
    @SerializedName("socialConnectionInstance")
    var socialConnectionInstance: SocialConnectionInstance,
    /** @param [socialConnectionInstances] 获取当前用户池的所有社会化登录配置 */
    @SerializedName("socialConnectionInstances")
    var socialConnectionInstances: List<SocialConnectionInstance>,
    /** @param [emailTemplates] emailTemplates */
    @SerializedName("emailTemplates")
    var emailTemplates: List<EmailTemplate>,
    /** @param [previewEmail] previewEmail */
    @SerializedName("previewEmail")
    var previewEmail: String,
    /** @param [templateCode] 获取函数模版 */
    @SerializedName("templateCode")
    var templateCode: String,
    /** @param [function] function */
    @SerializedName("function")
    var function: Function? = null,
    /** @param [functions] functions */
    @SerializedName("functions")
    var functions: PaginatedFunctions,
    /** @param [group] group */
    @SerializedName("group")
    var group: Group? = null,
    /** @param [groups] groups */
    @SerializedName("groups")
    var groups: PaginatedGroups,
    /** @param [queryMfa] 查询 MFA 信息 */
    @SerializedName("queryMfa")
    var queryMfa: Mfa? = null,
    /** @param [nodeById] nodeById */
    @SerializedName("nodeById")
    var nodeById: Node? = null,
    /** @param [nodeByCode] 通过 code 查询节点 */
    @SerializedName("nodeByCode")
    var nodeByCode: Node? = null,
    /** @param [org] 查询组织机构详情 */
    @SerializedName("org")
    var org: Org,
    /** @param [orgs] 查询用户池组织机构列表 */
    @SerializedName("orgs")
    var orgs: PaginatedOrgs,
    /** @param [childrenNodes] 查询子节点列表 */
    @SerializedName("childrenNodes")
    var childrenNodes: List<Node>,
    /** @param [rootNode] rootNode */
    @SerializedName("rootNode")
    var rootNode: Node,
    /** @param [isRootNode] isRootNode */
    @SerializedName("isRootNode")
    var isRootNode: Boolean? = null,
    /** @param [checkPasswordStrength] checkPasswordStrength */
    @SerializedName("checkPasswordStrength")
    var checkPasswordStrength: CheckPasswordStrengthResult,
    /** @param [isActionAllowed] isActionAllowed */
    @SerializedName("isActionAllowed")
    var isActionAllowed: Boolean,
    /** @param [isActionDenied] isActionDenied */
    @SerializedName("isActionDenied")
    var isActionDenied: Boolean,
    /** @param [policy] policy */
    @SerializedName("policy")
    var policy: Policy? = null,
    /** @param [policies] policies */
    @SerializedName("policies")
    var policies: PaginatedPolicies,
    /** @param [policyAssignments] policyAssignments */
    @SerializedName("policyAssignments")
    var policyAssignments: PaginatedPolicyAssignments,
    /** @param [role] 通过 **code** 查询角色详情 */
    @SerializedName("role")
    var role: Role? = null,
    /** @param [roles] 获取角色列表 */
    @SerializedName("roles")
    var roles: PaginatedRoles,
    /** @param [udv] 查询某个实体定义的自定义数据 */
    @SerializedName("udv")
    var udv: List<UserDefinedData>,
    /** @param [udf] 查询用户池定义的自定义字段 */
    @SerializedName("udf")
    var udf: List<UserDefinedField>,
    /** @param [user] user */
    @SerializedName("user")
    var user: User? = null,
    /** @param [userBatch] userBatch */
    @SerializedName("userBatch")
    var userBatch: List<User>,
    /** @param [users] users */
    @SerializedName("users")
    var users: PaginatedUsers,
    /** @param [searchUser] searchUser */
    @SerializedName("searchUser")
    var searchUser: PaginatedUsers,
    /** @param [checkLoginStatus] checkLoginStatus */
    @SerializedName("checkLoginStatus")
    var checkLoginStatus: JwtTokenStatus? = null,
    /** @param [isUserExists] isUserExists */
    @SerializedName("isUserExists")
    var isUserExists: Boolean? = null,
    /** @param [findUser] findUser */
    @SerializedName("findUser")
    var findUser: User? = null,
    /** @param [userpool] 查询用户池详情 */
    @SerializedName("userpool")
    var userpool: UserPool,
    /** @param [userpools] 查询用户池列表 */
    @SerializedName("userpools")
    var userpools: PaginatedUserpool,
    /** @param [userpoolTypes] userpoolTypes */
    @SerializedName("userpoolTypes")
    var userpoolTypes: List<UserPoolType>,
    /** @param [accessToken] 获取 accessToken ，如 SDK 初始化 */
    @SerializedName("accessToken")
    var accessToken: AccessTokenRes,
    /** @param [whitelist] 用户池注册白名单列表 */
    @SerializedName("whitelist")
    var whitelist: List<WhiteList>
)


data class SocialConnection(
    /** @param [provider] 社会化登录服务商唯一标志 */
    @SerializedName("provider")
    var provider: String,
    /** @param [name] 名称 */
    @SerializedName("name")
    var name: String,
    /** @param [logo] logo */
    @SerializedName("logo")
    var logo: String,
    /** @param [description] 描述信息 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [fields] 表单字段 */
    @SerializedName("fields")
    var fields: List<SocialConnectionField>? = null
)


data class SocialConnectionField(
    /** @param [key] key */
    @SerializedName("key")
    var key: String? = null,
    /** @param [label] label */
    @SerializedName("label")
    var label: String? = null,
    /** @param [type] type */
    @SerializedName("type")
    var type: String? = null,
    /** @param [placeholder] placeholder */
    @SerializedName("placeholder")
    var placeholder: String? = null,
    /** @param [children] children */
    @SerializedName("children")
    var children: List<SocialConnectionField>? = null
)


data class SocialConnectionInstance(
    /** @param [provider] provider */
    @SerializedName("provider")
    var provider: String,
    /** @param [enabled] enabled */
    @SerializedName("enabled")
    var enabled: Boolean,
    /** @param [fields] fields */
    @SerializedName("fields")
    var fields: List<SocialConnectionInstanceField>? = null
)


data class SocialConnectionInstanceField(
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [value] value */
    @SerializedName("value")
    var value: String
)


data class EmailTemplate(
    /** @param [type] 邮件模版类型 */
    @SerializedName("type")
    var type: EmailTemplateType,
    /** @param [name] 模版名称 */
    @SerializedName("name")
    var name: String,
    /** @param [subject] 邮件主题 */
    @SerializedName("subject")
    var subject: String,
    /** @param [sender] 显示的邮件发送人 */
    @SerializedName("sender")
    var sender: String,
    /** @param [content] 邮件模版内容 */
    @SerializedName("content")
    var content: String,
    /** @param [redirectTo] 重定向链接，操作成功后，用户将被重定向到此 URL。 */
    @SerializedName("redirectTo")
    var redirectTo: String? = null,
    /** @param [hasURL] hasURL */
    @SerializedName("hasURL")
    var hasURL: Boolean? = null,
    /** @param [expiresIn] 验证码过期时间（单位为秒） */
    @SerializedName("expiresIn")
    var expiresIn: Int? = null,
    /** @param [enabled] 是否开启（自定义模版） */
    @SerializedName("enabled")
    var enabled: Boolean? = null,
    /** @param [isSystem] 是否是系统默认模版 */
    @SerializedName("isSystem")
    var isSystem: Boolean? = null
)

enum class EmailTemplateType(val label: String) {
    RESET_PASSWORD("RESET_PASSWORD"),
    PASSWORD_RESETED_NOTIFICATION("PASSWORD_RESETED_NOTIFICATION"),
    CHANGE_PASSWORD("CHANGE_PASSWORD"),
    WELCOME("WELCOME"),
    VERIFY_EMAIL("VERIFY_EMAIL"),
    CHANGE_EMAIL("CHANGE_EMAIL");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): EmailTemplateType? {
            return values().find { it.label == label }
        }
    }
}


/**
 * 函数
 */
data class Function(
    /** @param [id] ID */
    @SerializedName("id")
    var id: String,
    /** @param [name] 函数名称 */
    @SerializedName("name")
    var name: String,
    /** @param [sourceCode] 源代码 */
    @SerializedName("sourceCode")
    var sourceCode: String,
    /** @param [description] 描述信息 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [url] 云函数链接 */
    @SerializedName("url")
    var url: String? = null
)

enum class SortByEnum(val label: String) {
    CREATEDAT_DESC("CREATEDAT_DESC"),
    CREATEDAT_ASC("CREATEDAT_ASC"),
    UPDATEDAT_DESC("UPDATEDAT_DESC"),
    UPDATEDAT_ASC("UPDATEDAT_ASC");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): SortByEnum? {
            return values().find { it.label == label }
        }
    }
}


data class PaginatedFunctions(
    /** @param [list] list */
    @SerializedName("list")
    var list: List<Function>,
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int
)

data class PaginatedUsers(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<User>
)


data class User(
    /** @param [id] 用户 ID */
    @SerializedName("id")
    var id: String,
    /** @param [arn] arn */
    @SerializedName("arn")
    var arn: String,
    /** @param [userPoolId] 用户池 ID */
    @SerializedName("userPoolId")
    var userPoolId: String,
    /** @param [username] 用户名，用户池内唯一 */
    @SerializedName("username")
    var username: String? = null,
    /** @param [email] 邮箱，用户池内唯一 */
    @SerializedName("email")
    var email: String? = null,
    /** @param [emailVerified] 邮箱是否已验证 */
    @SerializedName("emailVerified")
    var emailVerified: Boolean? = null,
    /** @param [phone] 手机号，用户池内唯一 */
    @SerializedName("phone")
    var phone: String? = null,
    /** @param [phoneVerified] 手机号是否已验证 */
    @SerializedName("phoneVerified")
    var phoneVerified: Boolean? = null,
    /** @param [unionid] unionid */
    @SerializedName("unionid")
    var unionid: String? = null,
    /** @param [openid] openid */
    @SerializedName("openid")
    var openid: String? = null,
    /** @param [identities] 用户的身份信息 */
    @SerializedName("identities")
    var identities: List<Identity>? = null,
    /** @param [nickname] 昵称，该字段不唯一。 */
    @SerializedName("nickname")
    var nickname: String? = null,
    /** @param [registerSource] 注册方式 */
    @SerializedName("registerSource")
    var registerSource: List<String>,
    /** @param [photo] 头像链接，默认为 https://usercontents.authing.cn/authing-avatar.png */
    @SerializedName("photo")
    var photo: String? = null,
    /** @param [password] 用户密码，数据库使用密钥加 salt 进行加密，非原文密码。 */
    @SerializedName("password")
    var password: String? = null,
    /** @param [oauth] 用户社会化登录第三方身份提供商返回的原始用户信息，非社会化登录方式注册的用户此字段为空。 */
    @SerializedName("oauth")
    var oauth: String? = null,
    /** @param [token] 用户登录凭证，开发者可以在后端检验该 token 的合法性，从而验证用户身份。详细文档请见：[验证 Token](https://docs.authing.co/advanced/verify-jwt-token.html) */
    @SerializedName("token")
    var token: String? = null,
    /** @param [tokenExpiredAt] token 过期时间 */
    @SerializedName("tokenExpiredAt")
    var tokenExpiredAt: String? = null,
    /** @param [loginsCount] 用户登录总次数 */
    @SerializedName("loginsCount")
    var loginsCount: Int? = null,
    /** @param [lastLogin] 用户最近一次登录时间 */
    @SerializedName("lastLogin")
    var lastLogin: String? = null,
    /** @param [lastIP] 用户上一次登录时使用的 IP */
    @SerializedName("lastIP")
    var lastIP: String? = null,
    /** @param [signedUp] 用户注册时间 */
    @SerializedName("signedUp")
    var signedUp: String? = null,
    /** @param [blocked] 该账号是否被禁用 */
    @SerializedName("blocked")
    var blocked: Boolean? = null,
    /** @param [isDeleted] 账号是否被软删除 */
    @SerializedName("isDeleted")
    var isDeleted: Boolean? = null,
    /** @param [device] device */
    @SerializedName("device")
    var device: String? = null,
    /** @param [browser] browser */
    @SerializedName("browser")
    var browser: String? = null,
    /** @param [company] company */
    @SerializedName("company")
    var company: String? = null,
    /** @param [name] name */
    @SerializedName("name")
    var name: String? = null,
    /** @param [givenName] givenName */
    @SerializedName("givenName")
    var givenName: String? = null,
    /** @param [familyName] familyName */
    @SerializedName("familyName")
    var familyName: String? = null,
    /** @param [middleName] middleName */
    @SerializedName("middleName")
    var middleName: String? = null,
    /** @param [profile] profile */
    @SerializedName("profile")
    var profile: String? = null,
    /** @param [preferredUsername] preferredUsername */
    @SerializedName("preferredUsername")
    var preferredUsername: String? = null,
    /** @param [website] website */
    @SerializedName("website")
    var website: String? = null,
    /** @param [gender] gender */
    @SerializedName("gender")
    var gender: String? = null,
    /** @param [birthdate] birthdate */
    @SerializedName("birthdate")
    var birthdate: String? = null,
    /** @param [zoneinfo] zoneinfo */
    @SerializedName("zoneinfo")
    var zoneinfo: String? = null,
    /** @param [locale] locale */
    @SerializedName("locale")
    var locale: String? = null,
    /** @param [address] address */
    @SerializedName("address")
    var address: String? = null,
    /** @param [formatted] formatted */
    @SerializedName("formatted")
    var formatted: String? = null,
    /** @param [streetAddress] streetAddress */
    @SerializedName("streetAddress")
    var streetAddress: String? = null,
    /** @param [locality] locality */
    @SerializedName("locality")
    var locality: String? = null,
    /** @param [region] region */
    @SerializedName("region")
    var region: String? = null,
    /** @param [postalCode] postalCode */
    @SerializedName("postalCode")
    var postalCode: String? = null,
    /** @param [city] city */
    @SerializedName("city")
    var city: String? = null,
    /** @param [province] province */
    @SerializedName("province")
    var province: String? = null,
    /** @param [country] country */
    @SerializedName("country")
    var country: String? = null,
    /** @param [createdAt] createdAt */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] updatedAt */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [roles] roles */
    @SerializedName("roles")
    var roles: PaginatedRoles? = null,
    /** @param [groups] groups */
    @SerializedName("groups")
    var groups: PaginatedGroups? = null,
    /** @param [externalId] 用户外部 ID */
    @SerializedName("externalId")
    var externalId: String? = null
)


data class Identity(
    /** @param [openid] openid */
    @SerializedName("openid")
    var openid: String? = null,
    /** @param [userIdInIdp] userIdInIdp */
    @SerializedName("userIdInIdp")
    var userIdInIdp: String? = null,
    /** @param [userId] userId */
    @SerializedName("userId")
    var userId: String? = null,
    /** @param [connectionId] connectionId */
    @SerializedName("connectionId")
    var connectionId: String? = null,
    /** @param [isSocial] isSocial */
    @SerializedName("isSocial")
    var isSocial: Boolean? = null,
    /** @param [provider] provider */
    @SerializedName("provider")
    var provider: String? = null,
    /** @param [userPoolId] userPoolId */
    @SerializedName("userPoolId")
    var userPoolId: String? = null
)

data class Mfa(
    /** @param [id] MFA ID */
    @SerializedName("id")
    var id: String,
    /** @param [userId] 用户 ID */
    @SerializedName("userId")
    var userId: String,
    /** @param [userPoolId] 用户池 ID */
    @SerializedName("userPoolId")
    var userPoolId: String,
    /** @param [enable] 是否开启 MFA */
    @SerializedName("enable")
    var enable: Boolean,
    /** @param [secret] 密钥 */
    @SerializedName("secret")
    var secret: String? = null
)

data class CheckPasswordStrengthResult(
    /** @param [valid] valid */
    @SerializedName("valid")
    var valid: Boolean,
    /** @param [message] message */
    @SerializedName("message")
    var message: String? = null
)


data class Policy(
    /** @param [code] code */
    @SerializedName("code")
    var code: String,
    /** @param [isDefault] isDefault */
    @SerializedName("isDefault")
    var isDefault: Boolean,
    /** @param [description] description */
    @SerializedName("description")
    var description: String? = null,
    /** @param [statements] statements */
    @SerializedName("statements")
    var statements: List<PolicyStatement>,
    /** @param [createdAt] createdAt */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] updatedAt */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [assignmentsCount] 被授权次数 */
    @SerializedName("assignmentsCount")
    var assignmentsCount: Int,
    /** @param [assignments] 授权记录 */
    @SerializedName("assignments")
    var assignments: List<PolicyAssignment>
)


data class PolicyStatement(
    /** @param [resource] resource */
    @SerializedName("resource")
    var resource: String,
    /** @param [actions] actions */
    @SerializedName("actions")
    var actions: List<String>,
    /** @param [effect] effect */
    @SerializedName("effect")
    var effect: PolicyEffect? = null
)

enum class PolicyEffect(val label: String) {
    ALLOW("ALLOW"),
    DENY("DENY");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): PolicyEffect? {
            return values().find { it.label == label }
        }
    }
}


data class PolicyAssignment(
    /** @param [code] code */
    @SerializedName("code")
    var code: String,
    /** @param [targetType] targetType */
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    /** @param [targetIdentifier] targetIdentifier */
    @SerializedName("targetIdentifier")
    var targetIdentifier: String
)

enum class PolicyAssignmentTargetType(val label: String) {
    USER("USER"),
    ROLE("ROLE");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): PolicyAssignmentTargetType? {
            return values().find { it.label == label }
        }
    }
}


data class PaginatedPolicies(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<Policy>
)


data class PaginatedPolicyAssignments(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<PolicyAssignment>
)

enum class UdfTargetType(val label: String) {
    NODE("NODE"),
    ORG("ORG"),
    USER("USER"),
    USERPOOL("USERPOOL"),
    ROLE("ROLE"),
    PERMISSION("PERMISSION"),
    APPLICATION("APPLICATION");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): UdfTargetType? {
            return values().find { it.label == label }
        }
    }
}


data class UserDefinedData(
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [dataType] dataType */
    @SerializedName("dataType")
    var dataType: UdfDataType,
    /** @param [value] value */
    @SerializedName("value")
    var value: String
)

enum class UdfDataType(val label: String) {
    STRING("STRING"),
    NUMBER("NUMBER"),
    DATETIME("DATETIME"),
    BOOLEAN("BOOLEAN"),
    OBJECT("OBJECT");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): UdfDataType? {
            return values().find { it.label == label }
        }
    }
}


data class UserDefinedField(
    /** @param [targetType] targetType */
    @SerializedName("targetType")
    var targetType: UdfTargetType,
    /** @param [dataType] dataType */
    @SerializedName("dataType")
    var dataType: UdfDataType,
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [label] label */
    @SerializedName("label")
    var label: String,
    /** @param [options] options */
    @SerializedName("options")
    var options: String? = null
)


data class JwtTokenStatus(
    /** @param [code] code */
    @SerializedName("code")
    var code: Int? = null,
    /** @param [message] message */
    @SerializedName("message")
    var message: String? = null,
    /** @param [status] status */
    @SerializedName("status")
    var status: Boolean? = null,
    /** @param [exp] exp */
    @SerializedName("exp")
    var exp: Int? = null,
    /** @param [iat] iat */
    @SerializedName("iat")
    var iat: Int? = null,
    /** @param [data] data */
    @SerializedName("data")
    var data: JwtTokenStatusDetail? = null
)


data class JwtTokenStatusDetail(
    /** @param [id] id */
    @SerializedName("id")
    var id: String? = null,
    /** @param [userPoolId] userPoolId */
    @SerializedName("userPoolId")
    var userPoolId: String? = null,
    /** @param [arn] arn */
    @SerializedName("arn")
    var arn: String? = null
)


data class UserPool(
    /** @param [id] id */
    @SerializedName("id")
    var id: String,
    /** @param [name] name */
    @SerializedName("name")
    var name: String,
    /** @param [domain] domain */
    @SerializedName("domain")
    var domain: String,
    /** @param [description] description */
    @SerializedName("description")
    var description: String? = null,
    /** @param [secret] secret */
    @SerializedName("secret")
    var secret: String,
    /** @param [jwtSecret] jwtSecret */
    @SerializedName("jwtSecret")
    var jwtSecret: String,
    /** @param [userpoolTypes] userpoolTypes */
    @SerializedName("userpoolTypes")
    var userpoolTypes: List<UserPoolType>? = null,
    /** @param [logo] logo */
    @SerializedName("logo")
    var logo: String,
    /** @param [createdAt] createdAt */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] updatedAt */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [emailVerifiedDefault] 用户邮箱是否验证（用户的 emailVerified 字段）默认值，默认为 false */
    @SerializedName("emailVerifiedDefault")
    var emailVerifiedDefault: Boolean,
    /** @param [sendWelcomeEmail] 用户注册之后是否发送欢迎邮件 */
    @SerializedName("sendWelcomeEmail")
    var sendWelcomeEmail: Boolean,
    /** @param [registerDisabled] 是否关闭注册 */
    @SerializedName("registerDisabled")
    var registerDisabled: Boolean,
    /** @param [showWxQRCodeWhenRegisterDisabled] 用户池禁止注册后，是否还显示微信小程序扫码登录。当 **showWXMPQRCode** 为 **true** 时，
    前端显示小程序码，此时只有以前允许注册时，扫码登录过的用户可以继续登录；新用户扫码无法登录。 */
    @SerializedName("showWxQRCodeWhenRegisterDisabled")
    var showWxQRCodeWhenRegisterDisabled: Boolean? = null,
    /** @param [allowedOrigins] 前端跨域请求白名单 */
    @SerializedName("allowedOrigins")
    var allowedOrigins: String? = null,
    /** @param [tokenExpiresAfter] 用户 **token** 有效时间，单位为秒，默认为 15 天。 */
    @SerializedName("tokenExpiresAfter")
    var tokenExpiresAfter: Int? = null,
    /** @param [isDeleted] 是否已删除 */
    @SerializedName("isDeleted")
    var isDeleted: Boolean? = null,
    /** @param [frequentRegisterCheck] 注册频繁检测 */
    @SerializedName("frequentRegisterCheck")
    var frequentRegisterCheck: FrequentRegisterCheckConfig? = null,
    /** @param [loginFailCheck] 登录失败检测 */
    @SerializedName("loginFailCheck")
    var loginFailCheck: LoginFailCheckConfig? = null,
    /** @param [changePhoneStrategy] 手机号修改策略 */
    @SerializedName("changePhoneStrategy")
    var changePhoneStrategy: ChangePhoneStrategy? = null,
    /** @param [changeEmailStrategy] 邮箱修改策略 */
    @SerializedName("changeEmailStrategy")
    var changeEmailStrategy: ChangeEmailStrategy? = null,
    /** @param [qrcodeLoginStrategy] APP 扫码登录配置 */
    @SerializedName("qrcodeLoginStrategy")
    var qrcodeLoginStrategy: QrcodeLoginStrategy? = null,
    /** @param [app2WxappLoginStrategy] APP 拉起小程序登录配置 */
    @SerializedName("app2WxappLoginStrategy")
    var app2WxappLoginStrategy: App2WxappLoginStrategy? = null,
    /** @param [whitelist] 注册白名单配置 */
    @SerializedName("whitelist")
    var whitelist: RegisterWhiteListConfig? = null,
    /** @param [customSMSProvider] 自定义短信服务商配置 */
    @SerializedName("customSMSProvider")
    var customSMSProvider: CustomSmsProvider? = null
)


data class UserPoolType(
    /** @param [code] code */
    @SerializedName("code")
    var code: String? = null,
    /** @param [name] name */
    @SerializedName("name")
    var name: String? = null,
    /** @param [description] description */
    @SerializedName("description")
    var description: String? = null,
    /** @param [image] image */
    @SerializedName("image")
    var image: String? = null,
    /** @param [sdks] sdks */
    @SerializedName("sdks")
    var sdks: List<String>? = null
)


data class FrequentRegisterCheckConfig(
    /** @param [timeInterval] timeInterval */
    @SerializedName("timeInterval")
    var timeInterval: Int? = null,
    /** @param [limit] limit */
    @SerializedName("limit")
    var limit: Int? = null,
    /** @param [enabled] enabled */
    @SerializedName("enabled")
    var enabled: Boolean? = null
)


data class LoginFailCheckConfig(
    /** @param [timeInterval] timeInterval */
    @SerializedName("timeInterval")
    var timeInterval: Int? = null,
    /** @param [limit] limit */
    @SerializedName("limit")
    var limit: Int? = null,
    /** @param [enabled] enabled */
    @SerializedName("enabled")
    var enabled: Boolean? = null
)


data class ChangePhoneStrategy(
    /** @param [verifyOldPhone] verifyOldPhone */
    @SerializedName("verifyOldPhone")
    var verifyOldPhone: Boolean? = null
)


data class ChangeEmailStrategy(
    /** @param [verifyOldEmail] verifyOldEmail */
    @SerializedName("verifyOldEmail")
    var verifyOldEmail: Boolean? = null
)


data class QrcodeLoginStrategy(
    /** @param [qrcodeExpiresAfter] qrcodeExpiresAfter */
    @SerializedName("qrcodeExpiresAfter")
    var qrcodeExpiresAfter: Int? = null,
    /** @param [returnFullUserInfo] returnFullUserInfo */
    @SerializedName("returnFullUserInfo")
    var returnFullUserInfo: Boolean? = null,
    /** @param [allowExchangeUserInfoFromBrowser] allowExchangeUserInfoFromBrowser */
    @SerializedName("allowExchangeUserInfoFromBrowser")
    var allowExchangeUserInfoFromBrowser: Boolean? = null,
    /** @param [ticketExpiresAfter] ticketExpiresAfter */
    @SerializedName("ticketExpiresAfter")
    var ticketExpiresAfter: Int? = null
)


data class App2WxappLoginStrategy(
    /** @param [ticketExpriresAfter] ticketExpriresAfter */
    @SerializedName("ticketExpriresAfter")
    var ticketExpriresAfter: Int? = null,
    /** @param [ticketExchangeUserInfoNeedSecret] ticketExchangeUserInfoNeedSecret */
    @SerializedName("ticketExchangeUserInfoNeedSecret")
    var ticketExchangeUserInfoNeedSecret: Boolean? = null
)


data class RegisterWhiteListConfig(
    /** @param [phoneEnabled] 是否开启手机号注册白名单 */
    @SerializedName("phoneEnabled")
    var phoneEnabled: Boolean? = null,
    /** @param [emailEnabled] 是否开启邮箱注册白名单 */
    @SerializedName("emailEnabled")
    var emailEnabled: Boolean? = null,
    /** @param [usernameEnabled] 是否开用户名注册白名单 */
    @SerializedName("usernameEnabled")
    var usernameEnabled: Boolean? = null
)


data class CustomSmsProvider(
    /** @param [enabled] enabled */
    @SerializedName("enabled")
    var enabled: Boolean? = null,
    /** @param [provider] provider */
    @SerializedName("provider")
    var provider: String? = null,
    /** @param [config253] config253 */
    @SerializedName("config253")
    var config253: SmsConfig253? = null
)


data class SmsConfig253(
    /** @param [sendSmsApi] sendSmsApi */
    @SerializedName("sendSmsApi")
    var sendSmsApi: String,
    /** @param [appId] appId */
    @SerializedName("appId")
    var appId: String,
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [template] template */
    @SerializedName("template")
    var template: String,
    /** @param [ttl] ttl */
    @SerializedName("ttl")
    var ttl: Int
)


data class PaginatedUserpool(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<UserPool>
)


data class AccessTokenRes(
    /** @param [accessToken] accessToken */
    @SerializedName("accessToken")
    var accessToken: String? = null,
    /** @param [exp] exp */
    @SerializedName("exp")
    var exp: Int? = null,
    /** @param [iat] iat */
    @SerializedName("iat")
    var iat: Int? = null
)

data class Mutation(
    /** @param [createSocialConnection] 创建社会化登录服务商 */
    @SerializedName("createSocialConnection")
    var createSocialConnection: SocialConnection,
    /** @param [createSocialConnectionInstance] 配置社会化登录 */
    @SerializedName("createSocialConnectionInstance")
    var createSocialConnectionInstance: SocialConnectionInstance,
    /** @param [enableSocialConnectionInstance] 开启社会化登录 */
    @SerializedName("enableSocialConnectionInstance")
    var enableSocialConnectionInstance: SocialConnectionInstance,
    /** @param [disableSocialConnectionInstance] 关闭社会化登录 */
    @SerializedName("disableSocialConnectionInstance")
    var disableSocialConnectionInstance: SocialConnectionInstance,
    /** @param [configEmailTemplate] 配置自定义邮件模版 */
    @SerializedName("configEmailTemplate")
    var configEmailTemplate: EmailTemplate,
    /** @param [enableEmailTemplate] 启用自定义邮件模版 */
    @SerializedName("enableEmailTemplate")
    var enableEmailTemplate: EmailTemplate,
    /** @param [disableEmailTemplate] 停用自定义邮件模版（将会使用系统默认邮件模版） */
    @SerializedName("disableEmailTemplate")
    var disableEmailTemplate: EmailTemplate,
    /** @param [sendEmail] 发送邮件 */
    @SerializedName("sendEmail")
    var sendEmail: CommonMessage,
    /** @param [createFunction] 创建函数 */
    @SerializedName("createFunction")
    var createFunction: Function? = null,
    /** @param [updateFunction] 修改函数 */
    @SerializedName("updateFunction")
    var updateFunction: Function,
    /** @param [deleteFunction] deleteFunction */
    @SerializedName("deleteFunction")
    var deleteFunction: CommonMessage,
    /** @param [addUserToGroup] addUserToGroup */
    @SerializedName("addUserToGroup")
    var addUserToGroup: CommonMessage,
    /** @param [removeUserFromGroup] removeUserFromGroup */
    @SerializedName("removeUserFromGroup")
    var removeUserFromGroup: CommonMessage,
    /** @param [createGroup] 创建角色 */
    @SerializedName("createGroup")
    var createGroup: Group,
    /** @param [updateGroup] 修改角色 */
    @SerializedName("updateGroup")
    var updateGroup: Group,
    /** @param [deleteGroups] 批量删除角色 */
    @SerializedName("deleteGroups")
    var deleteGroups: CommonMessage,
    /** @param [loginByEmail] loginByEmail */
    @SerializedName("loginByEmail")
    var loginByEmail: User? = null,
    /** @param [loginByUsername] loginByUsername */
    @SerializedName("loginByUsername")
    var loginByUsername: User? = null,
    /** @param [loginByPhoneCode] loginByPhoneCode */
    @SerializedName("loginByPhoneCode")
    var loginByPhoneCode: User? = null,
    /** @param [loginByPhonePassword] loginByPhonePassword */
    @SerializedName("loginByPhonePassword")
    var loginByPhonePassword: User? = null,
    /** @param [changeMfa] 修改 MFA 信息 */
    @SerializedName("changeMfa")
    var changeMfa: Mfa? = null,
    /** @param [createOrg] 创建组织机构 */
    @SerializedName("createOrg")
    var createOrg: Org,
    /** @param [deleteOrg] 删除组织机构 */
    @SerializedName("deleteOrg")
    var deleteOrg: CommonMessage,
    /** @param [addNode] 添加子节点 */
    @SerializedName("addNode")
    var addNode: Org,
    /** @param [updateNode] 修改节点 */
    @SerializedName("updateNode")
    var updateNode: Node,
    /** @param [deleteNode] 删除节点（会一并删掉子节点） */
    @SerializedName("deleteNode")
    var deleteNode: CommonMessage,
    /** @param [addMember] （批量）将成员添加到节点中 */
    @SerializedName("addMember")
    var addMember: Node,
    /** @param [removeMember] （批量）将成员从节点中移除 */
    @SerializedName("removeMember")
    var removeMember: Node,
    /** @param [moveNode] moveNode */
    @SerializedName("moveNode")
    var moveNode: Org,
    /** @param [resetPassword] resetPassword */
    @SerializedName("resetPassword")
    var resetPassword: CommonMessage? = null,
    /** @param [createPolicy] createPolicy */
    @SerializedName("createPolicy")
    var createPolicy: Policy,
    /** @param [updatePolicy] updatePolicy */
    @SerializedName("updatePolicy")
    var updatePolicy: Policy,
    /** @param [deletePolicy] deletePolicy */
    @SerializedName("deletePolicy")
    var deletePolicy: CommonMessage,
    /** @param [deletePolicies] deletePolicies */
    @SerializedName("deletePolicies")
    var deletePolicies: CommonMessage,
    /** @param [addPolicyAssignments] addPolicyAssignments */
    @SerializedName("addPolicyAssignments")
    var addPolicyAssignments: CommonMessage,
    /** @param [removePolicyAssignments] removePolicyAssignments */
    @SerializedName("removePolicyAssignments")
    var removePolicyAssignments: CommonMessage,
    /** @param [allow] 允许操作某个资源 */
    @SerializedName("allow")
    var allow: CommonMessage,
    /** @param [registerByUsername] registerByUsername */
    @SerializedName("registerByUsername")
    var registerByUsername: User? = null,
    /** @param [registerByEmail] registerByEmail */
    @SerializedName("registerByEmail")
    var registerByEmail: User? = null,
    /** @param [registerByPhoneCode] registerByPhoneCode */
    @SerializedName("registerByPhoneCode")
    var registerByPhoneCode: User? = null,
    /** @param [createRole] 创建角色 */
    @SerializedName("createRole")
    var createRole: Role,
    /** @param [updateRole] 修改角色 */
    @SerializedName("updateRole")
    var updateRole: Role,
    /** @param [deleteRole] 删除角色 */
    @SerializedName("deleteRole")
    var deleteRole: CommonMessage,
    /** @param [deleteRoles] 批量删除角色 */
    @SerializedName("deleteRoles")
    var deleteRoles: CommonMessage,
    /** @param [assignRole] 给用户授权角色 */
    @SerializedName("assignRole")
    var assignRole: CommonMessage? = null,
    /** @param [revokeRole] 撤销角色 */
    @SerializedName("revokeRole")
    var revokeRole: CommonMessage? = null,
    /** @param [setUdf] setUdf */
    @SerializedName("setUdf")
    var setUdf: UserDefinedField,
    /** @param [removeUdf] removeUdf */
    @SerializedName("removeUdf")
    var removeUdf: CommonMessage? = null,
    /** @param [setUdv] setUdv */
    @SerializedName("setUdv")
    var setUdv: List<UserDefinedData>? = null,
    /** @param [removeUdv] removeUdv */
    @SerializedName("removeUdv")
    var removeUdv: List<UserDefinedData>? = null,
    /** @param [refreshToken] refreshToken */
    @SerializedName("refreshToken")
    var refreshToken: RefreshToken? = null,
    /** @param [createUser] 创建用户。此接口需要管理员权限，普通用户注册请使用 **register** 接口。 */
    @SerializedName("createUser")
    var createUser: User,
    /** @param [updateUser] 更新用户信息。 */
    @SerializedName("updateUser")
    var updateUser: User,
    /** @param [updatePassword] 修改用户密码，此接口需要验证原始密码，管理员直接修改请使用 **updateUser** 接口。 */
    @SerializedName("updatePassword")
    var updatePassword: User,
    /** @param [bindPhone] 绑定手机号，调用此接口需要当前用户未绑定手机号 */
    @SerializedName("bindPhone")
    var bindPhone: User,
    /** @param [unbindPhone] 解绑定手机号，调用此接口需要当前用户已绑定手机号并且绑定了其他登录方式 */
    @SerializedName("unbindPhone")
    var unbindPhone: User,
    /** @param [updatePhone] 修改手机号。此接口需要验证手机号验证码，管理员直接修改请使用 **updateUser** 接口。 */
    @SerializedName("updatePhone")
    var updatePhone: User,
    /** @param [updateEmail] 修改邮箱。此接口需要验证邮箱验证码，管理员直接修改请使用 updateUser 接口。 */
    @SerializedName("updateEmail")
    var updateEmail: User,
    /** @param [unbindEmail] 解绑定邮箱 */
    @SerializedName("unbindEmail")
    var unbindEmail: User,
    /** @param [deleteUser] 删除用户 */
    @SerializedName("deleteUser")
    var deleteUser: CommonMessage? = null,
    /** @param [deleteUsers] 批量删除用户 */
    @SerializedName("deleteUsers")
    var deleteUsers: CommonMessage? = null,
    /** @param [createUserpool] 创建用户池 */
    @SerializedName("createUserpool")
    var createUserpool: UserPool,
    /** @param [updateUserpool] updateUserpool */
    @SerializedName("updateUserpool")
    var updateUserpool: UserPool,
    /** @param [refreshUserpoolSecret] refreshUserpoolSecret */
    @SerializedName("refreshUserpoolSecret")
    var refreshUserpoolSecret: String,
    /** @param [deleteUserpool] deleteUserpool */
    @SerializedName("deleteUserpool")
    var deleteUserpool: CommonMessage,
    /** @param [refreshAccessToken] refreshAccessToken */
    @SerializedName("refreshAccessToken")
    var refreshAccessToken: RefreshAccessTokenRes,
    /** @param [addWhitelist] addWhitelist */
    @SerializedName("addWhitelist")
    var addWhitelist: List<WhiteList>,
    /** @param [removeWhitelist] removeWhitelist */
    @SerializedName("removeWhitelist")
    var removeWhitelist: List<WhiteList>
)


data class CreateSocialConnectionInput @JvmOverloads constructor(
    /** @param [provider] provider */
    @SerializedName("provider")
    var provider: String,
    /** @param [name] name */
    @SerializedName("name")
    var name: String,
    /** @param [logo] logo */
    @SerializedName("logo")
    var logo: String,
    /** @param [description] description */
    @SerializedName("description")
    var description: String? = null,
    /** @param [fields] fields */
    @SerializedName("fields")
    var fields: List<SocialConnectionFieldInput>? = null
) {

    /** @param [description] description */
    fun withDescription(description: String): CreateSocialConnectionInput {
        this.description = description
        return this
    }

    /** @param [fields] fields */
    fun withFields(fields: List<SocialConnectionFieldInput>): CreateSocialConnectionInput {
        this.fields = fields
        return this
    }

    fun build(): CreateSocialConnectionInput {
        return this
    }
}


data class SocialConnectionFieldInput @JvmOverloads constructor(
    /** @param [key] key */
    @SerializedName("key")
    var key: String? = null,
    /** @param [label] label */
    @SerializedName("label")
    var label: String? = null,
    /** @param [type] type */
    @SerializedName("type")
    var type: String? = null,
    /** @param [placeholder] placeholder */
    @SerializedName("placeholder")
    var placeholder: String? = null,
    /** @param [children] children */
    @SerializedName("children")
    var children: List<SocialConnectionFieldInput>? = null
) {

    /** @param [key] key */
    fun withKey(key: String): SocialConnectionFieldInput {
        this.key = key
        return this
    }

    /** @param [label] label */
    fun withLabel(label: String): SocialConnectionFieldInput {
        this.label = label
        return this
    }

    /** @param [type] type */
    fun withType(type: String): SocialConnectionFieldInput {
        this.type = type
        return this
    }

    /** @param [placeholder] placeholder */
    fun withPlaceholder(placeholder: String): SocialConnectionFieldInput {
        this.placeholder = placeholder
        return this
    }

    /** @param [children] children */
    fun withChildren(children: List<SocialConnectionFieldInput>): SocialConnectionFieldInput {
        this.children = children
        return this
    }

    fun build(): SocialConnectionFieldInput {
        return this
    }
}


data class CreateSocialConnectionInstanceInput @JvmOverloads constructor(
    /** @param [provider] 社会化登录 provider */
    @SerializedName("provider")
    var provider: String,
    /** @param [fields] fields */
    @SerializedName("fields")
    var fields: List<CreateSocialConnectionInstanceFieldInput>? = null
) {

    /** @param [fields] fields */
    fun withFields(fields: List<CreateSocialConnectionInstanceFieldInput>): CreateSocialConnectionInstanceInput {
        this.fields = fields
        return this
    }

    fun build(): CreateSocialConnectionInstanceInput {
        return this
    }
}


data class CreateSocialConnectionInstanceFieldInput @JvmOverloads constructor(
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [value] value */
    @SerializedName("value")
    var value: String
) {


    fun build(): CreateSocialConnectionInstanceFieldInput {
        return this
    }
}


data class ConfigEmailTemplateInput @JvmOverloads constructor(
    /** @param [type] 邮件模版类型 */
    @SerializedName("type")
    var type: EmailTemplateType,
    /** @param [name] 模版名称 */
    @SerializedName("name")
    var name: String,
    /** @param [subject] 邮件主题 */
    @SerializedName("subject")
    var subject: String,
    /** @param [sender] 显示的邮件发送人 */
    @SerializedName("sender")
    var sender: String,
    /** @param [content] 邮件模版内容 */
    @SerializedName("content")
    var content: String,
    /** @param [redirectTo] 重定向链接，操作成功后，用户将被重定向到此 URL。 */
    @SerializedName("redirectTo")
    var redirectTo: String? = null,
    /** @param [hasURL] hasURL */
    @SerializedName("hasURL")
    var hasURL: Boolean? = null,
    /** @param [expiresIn] 验证码过期时间（单位为秒） */
    @SerializedName("expiresIn")
    var expiresIn: Int? = null
) {

    /** @param [redirectTo] 重定向链接，操作成功后，用户将被重定向到此 URL。 */
    fun withRedirectTo(redirectTo: String): ConfigEmailTemplateInput {
        this.redirectTo = redirectTo
        return this
    }

    /** @param [hasURL] hasURL */
    fun withHasUrl(hasURL: Boolean): ConfigEmailTemplateInput {
        this.hasURL = hasURL
        return this
    }

    /** @param [expiresIn] 验证码过期时间（单位为秒） */
    fun withExpiresIn(expiresIn: Int): ConfigEmailTemplateInput {
        this.expiresIn = expiresIn
        return this
    }

    fun build(): ConfigEmailTemplateInput {
        return this
    }
}

/** 邮件使用场景 */
enum class EmailScene(val label: String) {
    RESET_PASSWORD("RESET_PASSWORD"),
    VERIFY_EMAIL("VERIFY_EMAIL"),
    CHANGE_EMAIL("CHANGE_EMAIL");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): EmailScene? {
            return values().find { it.label == label }
        }
    }
}


data class CommonMessage(
    /** @param [message] 可读的接口响应说明，请以业务状态码 code 作为判断业务是否成功的标志 */
    @SerializedName("message")
    var message: String? = null,
    /** @param [code] 业务状态码（与 HTTP 响应码不同），但且仅当为 200 的时候表示操作成功表示，详细说明请见：
    [Authing 错误代码列表](https://docs.authing.co/advanced/error-code.html) */
    @SerializedName("code")
    var code: Int? = null
)


data class CreateFunctionInput @JvmOverloads constructor(
    /** @param [name] 函数名称 */
    @SerializedName("name")
    var name: String,
    /** @param [sourceCode] 源代码 */
    @SerializedName("sourceCode")
    var sourceCode: String,
    /** @param [description] 描述信息 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [url] 云函数链接 */
    @SerializedName("url")
    var url: String? = null
) {

    /** @param [description] 描述信息 */
    fun withDescription(description: String): CreateFunctionInput {
        this.description = description
        return this
    }

    /** @param [url] 云函数链接 */
    fun withUrl(url: String): CreateFunctionInput {
        this.url = url
        return this
    }

    fun build(): CreateFunctionInput {
        return this
    }
}


data class UpdateFunctionInput @JvmOverloads constructor(
    /** @param [id] ID */
    @SerializedName("id")
    var id: String,
    /** @param [name] 函数名称 */
    @SerializedName("name")
    var name: String? = null,
    /** @param [sourceCode] 源代码 */
    @SerializedName("sourceCode")
    var sourceCode: String? = null,
    /** @param [description] 描述信息 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [url] 云函数链接 */
    @SerializedName("url")
    var url: String? = null
) {

    /** @param [name] 函数名称 */
    fun withName(name: String): UpdateFunctionInput {
        this.name = name
        return this
    }

    /** @param [sourceCode] 源代码 */
    fun withSourceCode(sourceCode: String): UpdateFunctionInput {
        this.sourceCode = sourceCode
        return this
    }

    /** @param [description] 描述信息 */
    fun withDescription(description: String): UpdateFunctionInput {
        this.description = description
        return this
    }

    /** @param [url] 云函数链接 */
    fun withUrl(url: String): UpdateFunctionInput {
        this.url = url
        return this
    }

    fun build(): UpdateFunctionInput {
        return this
    }
}


data class LoginByEmailInput @JvmOverloads constructor(
    /** @param [email] email */
    @SerializedName("email")
    var email: String,
    /** @param [password] password */
    @SerializedName("password")
    var password: String,
    /** @param [captchaCode] 图形验证码 */
    @SerializedName("captchaCode")
    var captchaCode: String? = null,
    /** @param [autoRegister] 如果用户不存在，是否自动创建一个账号 */
    @SerializedName("autoRegister")
    var autoRegister: Boolean? = null,
    /** @param [clientIp] clientIp */
    @SerializedName("clientIp")
    var clientIp: String? = null
) {

    /** @param [captchaCode] 图形验证码 */
    fun withCaptchaCode(captchaCode: String): LoginByEmailInput {
        this.captchaCode = captchaCode
        return this
    }

    /** @param [autoRegister] 如果用户不存在，是否自动创建一个账号 */
    fun withAutoRegister(autoRegister: Boolean): LoginByEmailInput {
        this.autoRegister = autoRegister
        return this
    }

    /** @param [clientIp] clientIp */
    fun withClientIp(clientIp: String): LoginByEmailInput {
        this.clientIp = clientIp
        return this
    }

    fun build(): LoginByEmailInput {
        return this
    }
}


data class LoginByUsernameInput @JvmOverloads constructor(
    /** @param [username] username */
    @SerializedName("username")
    var username: String,
    /** @param [password] password */
    @SerializedName("password")
    var password: String,
    /** @param [captchaCode] 图形验证码 */
    @SerializedName("captchaCode")
    var captchaCode: String? = null,
    /** @param [autoRegister] 如果用户不存在，是否自动创建一个账号 */
    @SerializedName("autoRegister")
    var autoRegister: Boolean? = null,
    /** @param [clientIp] clientIp */
    @SerializedName("clientIp")
    var clientIp: String? = null
) {

    /** @param [captchaCode] 图形验证码 */
    fun withCaptchaCode(captchaCode: String): LoginByUsernameInput {
        this.captchaCode = captchaCode
        return this
    }

    /** @param [autoRegister] 如果用户不存在，是否自动创建一个账号 */
    fun withAutoRegister(autoRegister: Boolean): LoginByUsernameInput {
        this.autoRegister = autoRegister
        return this
    }

    /** @param [clientIp] clientIp */
    fun withClientIp(clientIp: String): LoginByUsernameInput {
        this.clientIp = clientIp
        return this
    }

    fun build(): LoginByUsernameInput {
        return this
    }
}


data class LoginByPhoneCodeInput @JvmOverloads constructor(
    /** @param [phone] phone */
    @SerializedName("phone")
    var phone: String,
    /** @param [code] code */
    @SerializedName("code")
    var code: String,
    /** @param [autoRegister] 如果用户不存在，是否自动创建一个账号 */
    @SerializedName("autoRegister")
    var autoRegister: Boolean? = null,
    /** @param [clientIp] clientIp */
    @SerializedName("clientIp")
    var clientIp: String? = null
) {

    /** @param [autoRegister] 如果用户不存在，是否自动创建一个账号 */
    fun withAutoRegister(autoRegister: Boolean): LoginByPhoneCodeInput {
        this.autoRegister = autoRegister
        return this
    }

    /** @param [clientIp] clientIp */
    fun withClientIp(clientIp: String): LoginByPhoneCodeInput {
        this.clientIp = clientIp
        return this
    }

    fun build(): LoginByPhoneCodeInput {
        return this
    }
}


data class LoginByPhonePasswordInput @JvmOverloads constructor(
    /** @param [phone] phone */
    @SerializedName("phone")
    var phone: String,
    /** @param [password] password */
    @SerializedName("password")
    var password: String,
    /** @param [captchaCode] 图形验证码 */
    @SerializedName("captchaCode")
    var captchaCode: String? = null,
    /** @param [autoRegister] 如果用户不存在，是否自动创建一个账号 */
    @SerializedName("autoRegister")
    var autoRegister: Boolean? = null,
    /** @param [clientIp] clientIp */
    @SerializedName("clientIp")
    var clientIp: String? = null
) {

    /** @param [captchaCode] 图形验证码 */
    fun withCaptchaCode(captchaCode: String): LoginByPhonePasswordInput {
        this.captchaCode = captchaCode
        return this
    }

    /** @param [autoRegister] 如果用户不存在，是否自动创建一个账号 */
    fun withAutoRegister(autoRegister: Boolean): LoginByPhonePasswordInput {
        this.autoRegister = autoRegister
        return this
    }

    /** @param [clientIp] clientIp */
    fun withClientIp(clientIp: String): LoginByPhonePasswordInput {
        this.clientIp = clientIp
        return this
    }

    fun build(): LoginByPhonePasswordInput {
        return this
    }
}


data class PolicyStatementInput @JvmOverloads constructor(
    /** @param [resource] resource */
    @SerializedName("resource")
    var resource: String,
    /** @param [actions] actions */
    @SerializedName("actions")
    var actions: List<String>,
    /** @param [effect] effect */
    @SerializedName("effect")
    var effect: PolicyEffect? = null
) {

    /** @param [effect] effect */
    fun withEffect(effect: PolicyEffect): PolicyStatementInput {
        this.effect = effect
        return this
    }

    fun build(): PolicyStatementInput {
        return this
    }
}


data class RegisterByUsernameInput @JvmOverloads constructor(
    /** @param [username] username */
    @SerializedName("username")
    var username: String,
    /** @param [password] password */
    @SerializedName("password")
    var password: String,
    /** @param [profile] profile */
    @SerializedName("profile")
    var profile: RegisterProfileInput? = null,
    /** @param [forceLogin] forceLogin */
    @SerializedName("forceLogin")
    var forceLogin: Boolean? = null,
    /** @param [generateToken] generateToken */
    @SerializedName("generateToken")
    var generateToken: Boolean? = null,
    /** @param [clientIp] clientIp */
    @SerializedName("clientIp")
    var clientIp: String? = null
) {

    /** @param [profile] profile */
    fun withProfile(profile: RegisterProfileInput): RegisterByUsernameInput {
        this.profile = profile
        return this
    }

    /** @param [forceLogin] forceLogin */
    fun withForceLogin(forceLogin: Boolean): RegisterByUsernameInput {
        this.forceLogin = forceLogin
        return this
    }

    /** @param [generateToken] generateToken */
    fun withGenerateToken(generateToken: Boolean): RegisterByUsernameInput {
        this.generateToken = generateToken
        return this
    }

    /** @param [clientIp] clientIp */
    fun withClientIp(clientIp: String): RegisterByUsernameInput {
        this.clientIp = clientIp
        return this
    }

    fun build(): RegisterByUsernameInput {
        return this
    }
}


data class RegisterProfileInput @JvmOverloads constructor(
    /** @param [ip] ip */
    @SerializedName("ip")
    var ip: String? = null,
    /** @param [oauth] oauth */
    @SerializedName("oauth")
    var oauth: String? = null,
    /** @param [nickname] nickname */
    @SerializedName("nickname")
    var nickname: String? = null,
    /** @param [company] company */
    @SerializedName("company")
    var company: String? = null,
    /** @param [photo] photo */
    @SerializedName("photo")
    var photo: String? = null,
    /** @param [device] device */
    @SerializedName("device")
    var device: String? = null,
    /** @param [browser] browser */
    @SerializedName("browser")
    var browser: String? = null,
    /** @param [name] name */
    @SerializedName("name")
    var name: String? = null,
    /** @param [givenName] givenName */
    @SerializedName("givenName")
    var givenName: String? = null,
    /** @param [familyName] familyName */
    @SerializedName("familyName")
    var familyName: String? = null,
    /** @param [middleName] middleName */
    @SerializedName("middleName")
    var middleName: String? = null,
    /** @param [profile] profile */
    @SerializedName("profile")
    var profile: String? = null,
    /** @param [preferredUsername] preferredUsername */
    @SerializedName("preferredUsername")
    var preferredUsername: String? = null,
    /** @param [website] website */
    @SerializedName("website")
    var website: String? = null,
    /** @param [gender] gender */
    @SerializedName("gender")
    var gender: String? = null,
    /** @param [birthdate] birthdate */
    @SerializedName("birthdate")
    var birthdate: String? = null,
    /** @param [zoneinfo] zoneinfo */
    @SerializedName("zoneinfo")
    var zoneinfo: String? = null,
    /** @param [locale] locale */
    @SerializedName("locale")
    var locale: String? = null,
    /** @param [address] address */
    @SerializedName("address")
    var address: String? = null,
    /** @param [formatted] formatted */
    @SerializedName("formatted")
    var formatted: String? = null,
    /** @param [streetAddress] streetAddress */
    @SerializedName("streetAddress")
    var streetAddress: String? = null,
    /** @param [locality] locality */
    @SerializedName("locality")
    var locality: String? = null,
    /** @param [region] region */
    @SerializedName("region")
    var region: String? = null,
    /** @param [postalCode] postalCode */
    @SerializedName("postalCode")
    var postalCode: String? = null,
    /** @param [country] country */
    @SerializedName("country")
    var country: String? = null,
    /** @param [udf] udf */
    @SerializedName("udf")
    var udf: List<UserDdfInput>? = null
) {

    /** @param [ip] ip */
    fun withIp(ip: String): RegisterProfileInput {
        this.ip = ip
        return this
    }

    /** @param [oauth] oauth */
    fun withOauth(oauth: String): RegisterProfileInput {
        this.oauth = oauth
        return this
    }

    /** @param [nickname] nickname */
    fun withNickname(nickname: String): RegisterProfileInput {
        this.nickname = nickname
        return this
    }

    /** @param [company] company */
    fun withCompany(company: String): RegisterProfileInput {
        this.company = company
        return this
    }

    /** @param [photo] photo */
    fun withPhoto(photo: String): RegisterProfileInput {
        this.photo = photo
        return this
    }

    /** @param [device] device */
    fun withDevice(device: String): RegisterProfileInput {
        this.device = device
        return this
    }

    /** @param [browser] browser */
    fun withBrowser(browser: String): RegisterProfileInput {
        this.browser = browser
        return this
    }

    /** @param [name] name */
    fun withName(name: String): RegisterProfileInput {
        this.name = name
        return this
    }

    /** @param [givenName] givenName */
    fun withGivenName(givenName: String): RegisterProfileInput {
        this.givenName = givenName
        return this
    }

    /** @param [familyName] familyName */
    fun withFamilyName(familyName: String): RegisterProfileInput {
        this.familyName = familyName
        return this
    }

    /** @param [middleName] middleName */
    fun withMiddleName(middleName: String): RegisterProfileInput {
        this.middleName = middleName
        return this
    }

    /** @param [profile] profile */
    fun withProfile(profile: String): RegisterProfileInput {
        this.profile = profile
        return this
    }

    /** @param [preferredUsername] preferredUsername */
    fun withPreferredUsername(preferredUsername: String): RegisterProfileInput {
        this.preferredUsername = preferredUsername
        return this
    }

    /** @param [website] website */
    fun withWebsite(website: String): RegisterProfileInput {
        this.website = website
        return this
    }

    /** @param [gender] gender */
    fun withGender(gender: String): RegisterProfileInput {
        this.gender = gender
        return this
    }

    /** @param [birthdate] birthdate */
    fun withBirthdate(birthdate: String): RegisterProfileInput {
        this.birthdate = birthdate
        return this
    }

    /** @param [zoneinfo] zoneinfo */
    fun withZoneinfo(zoneinfo: String): RegisterProfileInput {
        this.zoneinfo = zoneinfo
        return this
    }

    /** @param [locale] locale */
    fun withLocale(locale: String): RegisterProfileInput {
        this.locale = locale
        return this
    }

    /** @param [address] address */
    fun withAddress(address: String): RegisterProfileInput {
        this.address = address
        return this
    }

    /** @param [formatted] formatted */
    fun withFormatted(formatted: String): RegisterProfileInput {
        this.formatted = formatted
        return this
    }

    /** @param [streetAddress] streetAddress */
    fun withStreetAddress(streetAddress: String): RegisterProfileInput {
        this.streetAddress = streetAddress
        return this
    }

    /** @param [locality] locality */
    fun withLocality(locality: String): RegisterProfileInput {
        this.locality = locality
        return this
    }

    /** @param [region] region */
    fun withRegion(region: String): RegisterProfileInput {
        this.region = region
        return this
    }

    /** @param [postalCode] postalCode */
    fun withPostalCode(postalCode: String): RegisterProfileInput {
        this.postalCode = postalCode
        return this
    }

    /** @param [country] country */
    fun withCountry(country: String): RegisterProfileInput {
        this.country = country
        return this
    }

    /** @param [udf] udf */
    fun withUdf(udf: List<UserDdfInput>): RegisterProfileInput {
        this.udf = udf
        return this
    }

    fun build(): RegisterProfileInput {
        return this
    }
}


data class UserDdfInput @JvmOverloads constructor(
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [value] value */
    @SerializedName("value")
    var value: String
) {


    fun build(): UserDdfInput {
        return this
    }
}


data class RegisterByEmailInput @JvmOverloads constructor(
    /** @param [email] email */
    @SerializedName("email")
    var email: String,
    /** @param [password] password */
    @SerializedName("password")
    var password: String,
    /** @param [profile] profile */
    @SerializedName("profile")
    var profile: RegisterProfileInput? = null,
    /** @param [forceLogin] forceLogin */
    @SerializedName("forceLogin")
    var forceLogin: Boolean? = null,
    /** @param [generateToken] generateToken */
    @SerializedName("generateToken")
    var generateToken: Boolean? = null,
    /** @param [clientIp] clientIp */
    @SerializedName("clientIp")
    var clientIp: String? = null
) {

    /** @param [profile] profile */
    fun withProfile(profile: RegisterProfileInput): RegisterByEmailInput {
        this.profile = profile
        return this
    }

    /** @param [forceLogin] forceLogin */
    fun withForceLogin(forceLogin: Boolean): RegisterByEmailInput {
        this.forceLogin = forceLogin
        return this
    }

    /** @param [generateToken] generateToken */
    fun withGenerateToken(generateToken: Boolean): RegisterByEmailInput {
        this.generateToken = generateToken
        return this
    }

    /** @param [clientIp] clientIp */
    fun withClientIp(clientIp: String): RegisterByEmailInput {
        this.clientIp = clientIp
        return this
    }

    fun build(): RegisterByEmailInput {
        return this
    }
}


data class RegisterByPhoneCodeInput @JvmOverloads constructor(
    /** @param [phone] phone */
    @SerializedName("phone")
    var phone: String,
    /** @param [code] code */
    @SerializedName("code")
    var code: String,
    /** @param [password] password */
    @SerializedName("password")
    var password: String? = null,
    /** @param [profile] profile */
    @SerializedName("profile")
    var profile: RegisterProfileInput? = null,
    /** @param [forceLogin] forceLogin */
    @SerializedName("forceLogin")
    var forceLogin: Boolean? = null,
    /** @param [generateToken] generateToken */
    @SerializedName("generateToken")
    var generateToken: Boolean? = null,
    /** @param [clientIp] clientIp */
    @SerializedName("clientIp")
    var clientIp: String? = null
) {

    /** @param [password] password */
    fun withPassword(password: String): RegisterByPhoneCodeInput {
        this.password = password
        return this
    }

    /** @param [profile] profile */
    fun withProfile(profile: RegisterProfileInput): RegisterByPhoneCodeInput {
        this.profile = profile
        return this
    }

    /** @param [forceLogin] forceLogin */
    fun withForceLogin(forceLogin: Boolean): RegisterByPhoneCodeInput {
        this.forceLogin = forceLogin
        return this
    }

    /** @param [generateToken] generateToken */
    fun withGenerateToken(generateToken: Boolean): RegisterByPhoneCodeInput {
        this.generateToken = generateToken
        return this
    }

    /** @param [clientIp] clientIp */
    fun withClientIp(clientIp: String): RegisterByPhoneCodeInput {
        this.clientIp = clientIp
        return this
    }

    fun build(): RegisterByPhoneCodeInput {
        return this
    }
}


data class RefreshToken(
    /** @param [token] token */
    @SerializedName("token")
    var token: String? = null,
    /** @param [iat] iat */
    @SerializedName("iat")
    var iat: Int? = null,
    /** @param [exp] exp */
    @SerializedName("exp")
    var exp: Int? = null
)


data class CreateUserInput @JvmOverloads constructor(
    /** @param [username] 用户名，用户池内唯一 */
    @SerializedName("username")
    var username: String? = null,
    /** @param [email] 邮箱，不区分大小写，如 Bob@example.com 和 bob@example.com 会识别为同一个邮箱。用户池内唯一。 */
    @SerializedName("email")
    var email: String? = null,
    /** @param [emailVerified] 邮箱是否已验证 */
    @SerializedName("emailVerified")
    var emailVerified: Boolean? = null,
    /** @param [phone] 手机号，用户池内唯一 */
    @SerializedName("phone")
    var phone: String? = null,
    /** @param [phoneVerified] 手机号是否已验证 */
    @SerializedName("phoneVerified")
    var phoneVerified: Boolean? = null,
    /** @param [unionid] unionid */
    @SerializedName("unionid")
    var unionid: String? = null,
    /** @param [openid] openid */
    @SerializedName("openid")
    var openid: String? = null,
    /** @param [nickname] 昵称，该字段不唯一。 */
    @SerializedName("nickname")
    var nickname: String? = null,
    /** @param [photo] 头像链接，默认为 https://usercontents.authing.cn/authing-avatar.png */
    @SerializedName("photo")
    var photo: String? = null,
    /** @param [password] password */
    @SerializedName("password")
    var password: String? = null,
    /** @param [registerSource] 注册方式 */
    @SerializedName("registerSource")
    var registerSource: List<String>? = null,
    /** @param [browser] browser */
    @SerializedName("browser")
    var browser: String? = null,
    /** @param [oauth] 用户社会化登录第三方身份提供商返回的原始用户信息，非社会化登录方式注册的用户此字段为空。 */
    @SerializedName("oauth")
    var oauth: String? = null,
    /** @param [loginsCount] 用户累计登录次数，当你从你原有用户系统向 Authing 迁移的时候可以设置此字段。 */
    @SerializedName("loginsCount")
    var loginsCount: Int? = null,
    /** @param [lastLogin] lastLogin */
    @SerializedName("lastLogin")
    var lastLogin: String? = null,
    /** @param [company] company */
    @SerializedName("company")
    var company: String? = null,
    /** @param [lastIP] lastIP */
    @SerializedName("lastIP")
    var lastIP: String? = null,
    /** @param [signedUp] 用户注册时间，当你从你原有用户系统向 Authing 迁移的时候可以设置此字段。 */
    @SerializedName("signedUp")
    var signedUp: String? = null,
    /** @param [blocked] blocked */
    @SerializedName("blocked")
    var blocked: Boolean? = null,
    /** @param [isDeleted] isDeleted */
    @SerializedName("isDeleted")
    var isDeleted: Boolean? = null,
    /** @param [device] device */
    @SerializedName("device")
    var device: String? = null,
    /** @param [name] name */
    @SerializedName("name")
    var name: String? = null,
    /** @param [givenName] givenName */
    @SerializedName("givenName")
    var givenName: String? = null,
    /** @param [familyName] familyName */
    @SerializedName("familyName")
    var familyName: String? = null,
    /** @param [middleName] middleName */
    @SerializedName("middleName")
    var middleName: String? = null,
    /** @param [profile] profile */
    @SerializedName("profile")
    var profile: String? = null,
    /** @param [preferredUsername] preferredUsername */
    @SerializedName("preferredUsername")
    var preferredUsername: String? = null,
    /** @param [website] website */
    @SerializedName("website")
    var website: String? = null,
    /** @param [gender] gender */
    @SerializedName("gender")
    var gender: String? = null,
    /** @param [birthdate] birthdate */
    @SerializedName("birthdate")
    var birthdate: String? = null,
    /** @param [zoneinfo] zoneinfo */
    @SerializedName("zoneinfo")
    var zoneinfo: String? = null,
    /** @param [locale] locale */
    @SerializedName("locale")
    var locale: String? = null,
    /** @param [address] address */
    @SerializedName("address")
    var address: String? = null,
    /** @param [formatted] formatted */
    @SerializedName("formatted")
    var formatted: String? = null,
    /** @param [streetAddress] streetAddress */
    @SerializedName("streetAddress")
    var streetAddress: String? = null,
    /** @param [locality] locality */
    @SerializedName("locality")
    var locality: String? = null,
    /** @param [region] region */
    @SerializedName("region")
    var region: String? = null,
    /** @param [postalCode] postalCode */
    @SerializedName("postalCode")
    var postalCode: String? = null,
    /** @param [country] country */
    @SerializedName("country")
    var country: String? = null
) {

    /** @param [username] 用户名，用户池内唯一 */
    fun withUsername(username: String): CreateUserInput {
        this.username = username
        return this
    }

    /** @param [email] 邮箱，不区分大小写，如 Bob@example.com 和 bob@example.com 会识别为同一个邮箱。用户池内唯一。 */
    fun withEmail(email: String): CreateUserInput {
        this.email = email
        return this
    }

    /** @param [emailVerified] 邮箱是否已验证 */
    fun withEmailVerified(emailVerified: Boolean): CreateUserInput {
        this.emailVerified = emailVerified
        return this
    }

    /** @param [phone] 手机号，用户池内唯一 */
    fun withPhone(phone: String): CreateUserInput {
        this.phone = phone
        return this
    }

    /** @param [phoneVerified] 手机号是否已验证 */
    fun withPhoneVerified(phoneVerified: Boolean): CreateUserInput {
        this.phoneVerified = phoneVerified
        return this
    }

    /** @param [unionid] unionid */
    fun withUnionid(unionid: String): CreateUserInput {
        this.unionid = unionid
        return this
    }

    /** @param [openid] openid */
    fun withOpenid(openid: String): CreateUserInput {
        this.openid = openid
        return this
    }

    /** @param [nickname] 昵称，该字段不唯一。 */
    fun withNickname(nickname: String): CreateUserInput {
        this.nickname = nickname
        return this
    }

    /** @param [photo] 头像链接，默认为 https://usercontents.authing.cn/authing-avatar.png */
    fun withPhoto(photo: String): CreateUserInput {
        this.photo = photo
        return this
    }

    /** @param [password] password */
    fun withPassword(password: String): CreateUserInput {
        this.password = password
        return this
    }

    /** @param [registerSource] 注册方式 */
    fun withRegisterSource(registerSource: List<String>): CreateUserInput {
        this.registerSource = registerSource
        return this
    }

    /** @param [browser] browser */
    fun withBrowser(browser: String): CreateUserInput {
        this.browser = browser
        return this
    }

    /** @param [oauth] 用户社会化登录第三方身份提供商返回的原始用户信息，非社会化登录方式注册的用户此字段为空。 */
    fun withOauth(oauth: String): CreateUserInput {
        this.oauth = oauth
        return this
    }

    /** @param [loginsCount] 用户累计登录次数，当你从你原有用户系统向 Authing 迁移的时候可以设置此字段。 */
    fun withLoginsCount(loginsCount: Int): CreateUserInput {
        this.loginsCount = loginsCount
        return this
    }

    /** @param [lastLogin] lastLogin */
    fun withLastLogin(lastLogin: String): CreateUserInput {
        this.lastLogin = lastLogin
        return this
    }

    /** @param [company] company */
    fun withCompany(company: String): CreateUserInput {
        this.company = company
        return this
    }

    /** @param [lastIP] lastIP */
    fun withLastIp(lastIP: String): CreateUserInput {
        this.lastIP = lastIP
        return this
    }

    /** @param [signedUp] 用户注册时间，当你从你原有用户系统向 Authing 迁移的时候可以设置此字段。 */
    fun withSignedUp(signedUp: String): CreateUserInput {
        this.signedUp = signedUp
        return this
    }

    /** @param [blocked] blocked */
    fun withBlocked(blocked: Boolean): CreateUserInput {
        this.blocked = blocked
        return this
    }

    /** @param [isDeleted] isDeleted */
    fun withIsDeleted(isDeleted: Boolean): CreateUserInput {
        this.isDeleted = isDeleted
        return this
    }

    /** @param [device] device */
    fun withDevice(device: String): CreateUserInput {
        this.device = device
        return this
    }

    /** @param [name] name */
    fun withName(name: String): CreateUserInput {
        this.name = name
        return this
    }

    /** @param [givenName] givenName */
    fun withGivenName(givenName: String): CreateUserInput {
        this.givenName = givenName
        return this
    }

    /** @param [familyName] familyName */
    fun withFamilyName(familyName: String): CreateUserInput {
        this.familyName = familyName
        return this
    }

    /** @param [middleName] middleName */
    fun withMiddleName(middleName: String): CreateUserInput {
        this.middleName = middleName
        return this
    }

    /** @param [profile] profile */
    fun withProfile(profile: String): CreateUserInput {
        this.profile = profile
        return this
    }

    /** @param [preferredUsername] preferredUsername */
    fun withPreferredUsername(preferredUsername: String): CreateUserInput {
        this.preferredUsername = preferredUsername
        return this
    }

    /** @param [website] website */
    fun withWebsite(website: String): CreateUserInput {
        this.website = website
        return this
    }

    /** @param [gender] gender */
    fun withGender(gender: String): CreateUserInput {
        this.gender = gender
        return this
    }

    /** @param [birthdate] birthdate */
    fun withBirthdate(birthdate: String): CreateUserInput {
        this.birthdate = birthdate
        return this
    }

    /** @param [zoneinfo] zoneinfo */
    fun withZoneinfo(zoneinfo: String): CreateUserInput {
        this.zoneinfo = zoneinfo
        return this
    }

    /** @param [locale] locale */
    fun withLocale(locale: String): CreateUserInput {
        this.locale = locale
        return this
    }

    /** @param [address] address */
    fun withAddress(address: String): CreateUserInput {
        this.address = address
        return this
    }

    /** @param [formatted] formatted */
    fun withFormatted(formatted: String): CreateUserInput {
        this.formatted = formatted
        return this
    }

    /** @param [streetAddress] streetAddress */
    fun withStreetAddress(streetAddress: String): CreateUserInput {
        this.streetAddress = streetAddress
        return this
    }

    /** @param [locality] locality */
    fun withLocality(locality: String): CreateUserInput {
        this.locality = locality
        return this
    }

    /** @param [region] region */
    fun withRegion(region: String): CreateUserInput {
        this.region = region
        return this
    }

    /** @param [postalCode] postalCode */
    fun withPostalCode(postalCode: String): CreateUserInput {
        this.postalCode = postalCode
        return this
    }

    /** @param [country] country */
    fun withCountry(country: String): CreateUserInput {
        this.country = country
        return this
    }

    fun build(): CreateUserInput {
        return this
    }
}


data class UpdateUserInput @JvmOverloads constructor(
    /** @param [email] 邮箱。直接修改用户邮箱需要管理员权限，普通用户修改邮箱请使用 **updateEmail** 接口。 */
    @SerializedName("email")
    var email: String? = null,
    /** @param [unionid] unionid */
    @SerializedName("unionid")
    var unionid: String? = null,
    /** @param [openid] openid */
    @SerializedName("openid")
    var openid: String? = null,
    /** @param [emailVerified] 邮箱是否已验证。直接修改 emailVerified 需要管理员权限。 */
    @SerializedName("emailVerified")
    var emailVerified: Boolean? = null,
    /** @param [phone] 手机号。直接修改用户手机号需要管理员权限，普通用户修改邮箱请使用 **updatePhone** 接口。 */
    @SerializedName("phone")
    var phone: String? = null,
    /** @param [phoneVerified] 手机号是否已验证。直接修改 **phoneVerified** 需要管理员权限。 */
    @SerializedName("phoneVerified")
    var phoneVerified: Boolean? = null,
    /** @param [username] 用户名，用户池内唯一 */
    @SerializedName("username")
    var username: String? = null,
    /** @param [nickname] 昵称，该字段不唯一。 */
    @SerializedName("nickname")
    var nickname: String? = null,
    /** @param [password] 密码。直接修改用户密码需要管理员权限，普通用户修改邮箱请使用 **updatePassword** 接口。 */
    @SerializedName("password")
    var password: String? = null,
    /** @param [photo] 头像链接，默认为 https://usercontents.authing.cn/authing-avatar.png */
    @SerializedName("photo")
    var photo: String? = null,
    /** @param [company] 注册方式 */
    @SerializedName("company")
    var company: String? = null,
    /** @param [browser] browser */
    @SerializedName("browser")
    var browser: String? = null,
    /** @param [device] device */
    @SerializedName("device")
    var device: String? = null,
    /** @param [oauth] oauth */
    @SerializedName("oauth")
    var oauth: String? = null,
    /** @param [tokenExpiredAt] tokenExpiredAt */
    @SerializedName("tokenExpiredAt")
    var tokenExpiredAt: String? = null,
    /** @param [loginsCount] 用户累计登录次数，当你从你原有用户系统向 Authing 迁移的时候可以设置此字段。 */
    @SerializedName("loginsCount")
    var loginsCount: Int? = null,
    /** @param [lastLogin] lastLogin */
    @SerializedName("lastLogin")
    var lastLogin: String? = null,
    /** @param [lastIP] lastIP */
    @SerializedName("lastIP")
    var lastIP: String? = null,
    /** @param [blocked] 用户注册时间，当你从你原有用户系统向 Authing 迁移的时候可以设置此字段。 */
    @SerializedName("blocked")
    var blocked: Boolean? = null,
    /** @param [name] name */
    @SerializedName("name")
    var name: String? = null,
    /** @param [givenName] givenName */
    @SerializedName("givenName")
    var givenName: String? = null,
    /** @param [familyName] familyName */
    @SerializedName("familyName")
    var familyName: String? = null,
    /** @param [middleName] middleName */
    @SerializedName("middleName")
    var middleName: String? = null,
    /** @param [profile] profile */
    @SerializedName("profile")
    var profile: String? = null,
    /** @param [preferredUsername] preferredUsername */
    @SerializedName("preferredUsername")
    var preferredUsername: String? = null,
    /** @param [website] website */
    @SerializedName("website")
    var website: String? = null,
    /** @param [gender] gender */
    @SerializedName("gender")
    var gender: String? = null,
    /** @param [birthdate] birthdate */
    @SerializedName("birthdate")
    var birthdate: String? = null,
    /** @param [zoneinfo] zoneinfo */
    @SerializedName("zoneinfo")
    var zoneinfo: String? = null,
    /** @param [locale] locale */
    @SerializedName("locale")
    var locale: String? = null,
    /** @param [address] address */
    @SerializedName("address")
    var address: String? = null,
    /** @param [formatted] formatted */
    @SerializedName("formatted")
    var formatted: String? = null,
    /** @param [streetAddress] streetAddress */
    @SerializedName("streetAddress")
    var streetAddress: String? = null,
    /** @param [locality] locality */
    @SerializedName("locality")
    var locality: String? = null,
    /** @param [region] region */
    @SerializedName("region")
    var region: String? = null,
    /** @param [postalCode] postalCode */
    @SerializedName("postalCode")
    var postalCode: String? = null,
    /** @param [city] city */
    @SerializedName("city")
    var city: String? = null,
    /** @param [province] province */
    @SerializedName("province")
    var province: String? = null,
    /** @param [country] country */
    @SerializedName("country")
    var country: String? = null
) {

    /** @param [email] 邮箱。直接修改用户邮箱需要管理员权限，普通用户修改邮箱请使用 **updateEmail** 接口。 */
    fun withEmail(email: String): UpdateUserInput {
        this.email = email
        return this
    }

    /** @param [unionid] unionid */
    fun withUnionid(unionid: String): UpdateUserInput {
        this.unionid = unionid
        return this
    }

    /** @param [openid] openid */
    fun withOpenid(openid: String): UpdateUserInput {
        this.openid = openid
        return this
    }

    /** @param [emailVerified] 邮箱是否已验证。直接修改 emailVerified 需要管理员权限。 */
    fun withEmailVerified(emailVerified: Boolean): UpdateUserInput {
        this.emailVerified = emailVerified
        return this
    }

    /** @param [phone] 手机号。直接修改用户手机号需要管理员权限，普通用户修改邮箱请使用 **updatePhone** 接口。 */
    fun withPhone(phone: String): UpdateUserInput {
        this.phone = phone
        return this
    }

    /** @param [phoneVerified] 手机号是否已验证。直接修改 **phoneVerified** 需要管理员权限。 */
    fun withPhoneVerified(phoneVerified: Boolean): UpdateUserInput {
        this.phoneVerified = phoneVerified
        return this
    }

    /** @param [username] 用户名，用户池内唯一 */
    fun withUsername(username: String): UpdateUserInput {
        this.username = username
        return this
    }

    /** @param [nickname] 昵称，该字段不唯一。 */
    fun withNickname(nickname: String): UpdateUserInput {
        this.nickname = nickname
        return this
    }

    /** @param [password] 密码。直接修改用户密码需要管理员权限，普通用户修改邮箱请使用 **updatePassword** 接口。 */
    fun withPassword(password: String): UpdateUserInput {
        this.password = password
        return this
    }

    /** @param [photo] 头像链接，默认为 https://usercontents.authing.cn/authing-avatar.png */
    fun withPhoto(photo: String): UpdateUserInput {
        this.photo = photo
        return this
    }

    /** @param [company] 注册方式 */
    fun withCompany(company: String): UpdateUserInput {
        this.company = company
        return this
    }

    /** @param [browser] browser */
    fun withBrowser(browser: String): UpdateUserInput {
        this.browser = browser
        return this
    }

    /** @param [device] device */
    fun withDevice(device: String): UpdateUserInput {
        this.device = device
        return this
    }

    /** @param [oauth] oauth */
    fun withOauth(oauth: String): UpdateUserInput {
        this.oauth = oauth
        return this
    }

    /** @param [tokenExpiredAt] tokenExpiredAt */
    fun withTokenExpiredAt(tokenExpiredAt: String): UpdateUserInput {
        this.tokenExpiredAt = tokenExpiredAt
        return this
    }

    /** @param [loginsCount] 用户累计登录次数，当你从你原有用户系统向 Authing 迁移的时候可以设置此字段。 */
    fun withLoginsCount(loginsCount: Int): UpdateUserInput {
        this.loginsCount = loginsCount
        return this
    }

    /** @param [lastLogin] lastLogin */
    fun withLastLogin(lastLogin: String): UpdateUserInput {
        this.lastLogin = lastLogin
        return this
    }

    /** @param [lastIP] lastIP */
    fun withLastIp(lastIP: String): UpdateUserInput {
        this.lastIP = lastIP
        return this
    }

    /** @param [blocked] 用户注册时间，当你从你原有用户系统向 Authing 迁移的时候可以设置此字段。 */
    fun withBlocked(blocked: Boolean): UpdateUserInput {
        this.blocked = blocked
        return this
    }

    /** @param [name] name */
    fun withName(name: String): UpdateUserInput {
        this.name = name
        return this
    }

    /** @param [givenName] givenName */
    fun withGivenName(givenName: String): UpdateUserInput {
        this.givenName = givenName
        return this
    }

    /** @param [familyName] familyName */
    fun withFamilyName(familyName: String): UpdateUserInput {
        this.familyName = familyName
        return this
    }

    /** @param [middleName] middleName */
    fun withMiddleName(middleName: String): UpdateUserInput {
        this.middleName = middleName
        return this
    }

    /** @param [profile] profile */
    fun withProfile(profile: String): UpdateUserInput {
        this.profile = profile
        return this
    }

    /** @param [preferredUsername] preferredUsername */
    fun withPreferredUsername(preferredUsername: String): UpdateUserInput {
        this.preferredUsername = preferredUsername
        return this
    }

    /** @param [website] website */
    fun withWebsite(website: String): UpdateUserInput {
        this.website = website
        return this
    }

    /** @param [gender] gender */
    fun withGender(gender: String): UpdateUserInput {
        this.gender = gender
        return this
    }

    /** @param [birthdate] birthdate */
    fun withBirthdate(birthdate: String): UpdateUserInput {
        this.birthdate = birthdate
        return this
    }

    /** @param [zoneinfo] zoneinfo */
    fun withZoneinfo(zoneinfo: String): UpdateUserInput {
        this.zoneinfo = zoneinfo
        return this
    }

    /** @param [locale] locale */
    fun withLocale(locale: String): UpdateUserInput {
        this.locale = locale
        return this
    }

    /** @param [address] address */
    fun withAddress(address: String): UpdateUserInput {
        this.address = address
        return this
    }

    /** @param [formatted] formatted */
    fun withFormatted(formatted: String): UpdateUserInput {
        this.formatted = formatted
        return this
    }

    /** @param [streetAddress] streetAddress */
    fun withStreetAddress(streetAddress: String): UpdateUserInput {
        this.streetAddress = streetAddress
        return this
    }

    /** @param [locality] locality */
    fun withLocality(locality: String): UpdateUserInput {
        this.locality = locality
        return this
    }

    /** @param [region] region */
    fun withRegion(region: String): UpdateUserInput {
        this.region = region
        return this
    }

    /** @param [postalCode] postalCode */
    fun withPostalCode(postalCode: String): UpdateUserInput {
        this.postalCode = postalCode
        return this
    }

    /** @param [city] city */
    fun withCity(city: String): UpdateUserInput {
        this.city = city
        return this
    }

    /** @param [province] province */
    fun withProvince(province: String): UpdateUserInput {
        this.province = province
        return this
    }

    /** @param [country] country */
    fun withCountry(country: String): UpdateUserInput {
        this.country = country
        return this
    }

    fun build(): UpdateUserInput {
        return this
    }
}



data class FrequentRegisterCheckConfigInput @JvmOverloads constructor(
    /** @param [timeInterval] timeInterval */
    @SerializedName("timeInterval")
    var timeInterval: Int? = null,
    /** @param [limit] limit */
    @SerializedName("limit")
    var limit: Int? = null,
    /** @param [enabled] enabled */
    @SerializedName("enabled")
    var enabled: Boolean? = null
) {

    /** @param [timeInterval] timeInterval */
    fun withTimeInterval(timeInterval: Int): FrequentRegisterCheckConfigInput {
        this.timeInterval = timeInterval
        return this
    }

    /** @param [limit] limit */
    fun withLimit(limit: Int): FrequentRegisterCheckConfigInput {
        this.limit = limit
        return this
    }

    /** @param [enabled] enabled */
    fun withEnabled(enabled: Boolean): FrequentRegisterCheckConfigInput {
        this.enabled = enabled
        return this
    }

    fun build(): FrequentRegisterCheckConfigInput {
        return this
    }
}


data class LoginFailCheckConfigInput @JvmOverloads constructor(
    /** @param [timeInterval] timeInterval */
    @SerializedName("timeInterval")
    var timeInterval: Int? = null,
    /** @param [limit] limit */
    @SerializedName("limit")
    var limit: Int? = null,
    /** @param [enabled] enabled */
    @SerializedName("enabled")
    var enabled: Boolean? = null
) {

    /** @param [timeInterval] timeInterval */
    fun withTimeInterval(timeInterval: Int): LoginFailCheckConfigInput {
        this.timeInterval = timeInterval
        return this
    }

    /** @param [limit] limit */
    fun withLimit(limit: Int): LoginFailCheckConfigInput {
        this.limit = limit
        return this
    }

    /** @param [enabled] enabled */
    fun withEnabled(enabled: Boolean): LoginFailCheckConfigInput {
        this.enabled = enabled
        return this
    }

    fun build(): LoginFailCheckConfigInput {
        return this
    }
}


data class ChangePhoneStrategyInput @JvmOverloads constructor(
    /** @param [verifyOldPhone] verifyOldPhone */
    @SerializedName("verifyOldPhone")
    var verifyOldPhone: Boolean? = null
) {

    /** @param [verifyOldPhone] verifyOldPhone */
    fun withVerifyOldPhone(verifyOldPhone: Boolean): ChangePhoneStrategyInput {
        this.verifyOldPhone = verifyOldPhone
        return this
    }

    fun build(): ChangePhoneStrategyInput {
        return this
    }
}


data class ChangeEmailStrategyInput @JvmOverloads constructor(
    /** @param [verifyOldEmail] verifyOldEmail */
    @SerializedName("verifyOldEmail")
    var verifyOldEmail: Boolean? = null
) {

    /** @param [verifyOldEmail] verifyOldEmail */
    fun withVerifyOldEmail(verifyOldEmail: Boolean): ChangeEmailStrategyInput {
        this.verifyOldEmail = verifyOldEmail
        return this
    }

    fun build(): ChangeEmailStrategyInput {
        return this
    }
}


data class QrcodeLoginStrategyInput @JvmOverloads constructor(
    /** @param [qrcodeExpiresAfter] qrcodeExpiresAfter */
    @SerializedName("qrcodeExpiresAfter")
    var qrcodeExpiresAfter: Int? = null,
    /** @param [returnFullUserInfo] returnFullUserInfo */
    @SerializedName("returnFullUserInfo")
    var returnFullUserInfo: Boolean? = null,
    /** @param [allowExchangeUserInfoFromBrowser] allowExchangeUserInfoFromBrowser */
    @SerializedName("allowExchangeUserInfoFromBrowser")
    var allowExchangeUserInfoFromBrowser: Boolean? = null,
    /** @param [ticketExpiresAfter] ticketExpiresAfter */
    @SerializedName("ticketExpiresAfter")
    var ticketExpiresAfter: Int? = null
) {

    /** @param [qrcodeExpiresAfter] qrcodeExpiresAfter */
    fun withQrcodeExpiresAfter(qrcodeExpiresAfter: Int): QrcodeLoginStrategyInput {
        this.qrcodeExpiresAfter = qrcodeExpiresAfter
        return this
    }

    /** @param [returnFullUserInfo] returnFullUserInfo */
    fun withReturnFullUserInfo(returnFullUserInfo: Boolean): QrcodeLoginStrategyInput {
        this.returnFullUserInfo = returnFullUserInfo
        return this
    }

    /** @param [allowExchangeUserInfoFromBrowser] allowExchangeUserInfoFromBrowser */
    fun withAllowExchangeUserInfoFromBrowser(allowExchangeUserInfoFromBrowser: Boolean): QrcodeLoginStrategyInput {
        this.allowExchangeUserInfoFromBrowser = allowExchangeUserInfoFromBrowser
        return this
    }

    /** @param [ticketExpiresAfter] ticketExpiresAfter */
    fun withTicketExpiresAfter(ticketExpiresAfter: Int): QrcodeLoginStrategyInput {
        this.ticketExpiresAfter = ticketExpiresAfter
        return this
    }

    fun build(): QrcodeLoginStrategyInput {
        return this
    }
}


data class App2WxappLoginStrategyInput @JvmOverloads constructor(
    /** @param [ticketExpriresAfter] ticketExpriresAfter */
    @SerializedName("ticketExpriresAfter")
    var ticketExpriresAfter: Int? = null,
    /** @param [ticketExchangeUserInfoNeedSecret] ticketExchangeUserInfoNeedSecret */
    @SerializedName("ticketExchangeUserInfoNeedSecret")
    var ticketExchangeUserInfoNeedSecret: Boolean? = null
) {

    /** @param [ticketExpriresAfter] ticketExpriresAfter */
    fun withTicketExpriresAfter(ticketExpriresAfter: Int): App2WxappLoginStrategyInput {
        this.ticketExpriresAfter = ticketExpriresAfter
        return this
    }

    /** @param [ticketExchangeUserInfoNeedSecret] ticketExchangeUserInfoNeedSecret */
    fun withTicketExchangeUserInfoNeedSecret(ticketExchangeUserInfoNeedSecret: Boolean): App2WxappLoginStrategyInput {
        this.ticketExchangeUserInfoNeedSecret = ticketExchangeUserInfoNeedSecret
        return this
    }

    fun build(): App2WxappLoginStrategyInput {
        return this
    }
}


data class RegisterWhiteListConfigInput @JvmOverloads constructor(
    /** @param [phoneEnabled] phoneEnabled */
    @SerializedName("phoneEnabled")
    var phoneEnabled: Boolean? = null,
    /** @param [emailEnabled] emailEnabled */
    @SerializedName("emailEnabled")
    var emailEnabled: Boolean? = null,
    /** @param [usernameEnabled] usernameEnabled */
    @SerializedName("usernameEnabled")
    var usernameEnabled: Boolean? = null
) {

    /** @param [phoneEnabled] phoneEnabled */
    fun withPhoneEnabled(phoneEnabled: Boolean): RegisterWhiteListConfigInput {
        this.phoneEnabled = phoneEnabled
        return this
    }

    /** @param [emailEnabled] emailEnabled */
    fun withEmailEnabled(emailEnabled: Boolean): RegisterWhiteListConfigInput {
        this.emailEnabled = emailEnabled
        return this
    }

    /** @param [usernameEnabled] usernameEnabled */
    fun withUsernameEnabled(usernameEnabled: Boolean): RegisterWhiteListConfigInput {
        this.usernameEnabled = usernameEnabled
        return this
    }

    fun build(): RegisterWhiteListConfigInput {
        return this
    }
}


data class CustomSmsProviderInput @JvmOverloads constructor(
    /** @param [enabled] enabled */
    @SerializedName("enabled")
    var enabled: Boolean? = null,
    /** @param [provider] provider */
    @SerializedName("provider")
    var provider: String? = null,
    /** @param [config253] config253 */
    @SerializedName("config253")
    var config253: SmsConfig253Input? = null
) {

    /** @param [enabled] enabled */
    fun withEnabled(enabled: Boolean): CustomSmsProviderInput {
        this.enabled = enabled
        return this
    }

    /** @param [provider] provider */
    fun withProvider(provider: String): CustomSmsProviderInput {
        this.provider = provider
        return this
    }

    /** @param [config253] config253 */
    fun withConfig253(config253: SmsConfig253Input): CustomSmsProviderInput {
        this.config253 = config253
        return this
    }

    fun build(): CustomSmsProviderInput {
        return this
    }
}


data class SmsConfig253Input @JvmOverloads constructor(
    /** @param [appId] appId */
    @SerializedName("appId")
    var appId: String,
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [template] template */
    @SerializedName("template")
    var template: String,
    /** @param [ttl] ttl */
    @SerializedName("ttl")
    var ttl: Int,
    /** @param [sendSmsApi] sendSmsApi */
    @SerializedName("sendSmsApi")
    var sendSmsApi: String
) {


    fun build(): SmsConfig253Input {
        return this
    }
}


data class RefreshAccessTokenRes(
    /** @param [accessToken] accessToken */
    @SerializedName("accessToken")
    var accessToken: String? = null,
    /** @param [exp] exp */
    @SerializedName("exp")
    var exp: Int? = null,
    /** @param [iat] iat */
    @SerializedName("iat")
    var iat: Int? = null
)


/**
 * 批量删除返回结果
 */
data class BatchOperationResult(
    /** @param [succeedCount] 删除成功的个数 */
    @SerializedName("succeedCount")
    var succeedCount: Int,
    /** @param [failedCount] 删除失败的个数 */
    @SerializedName("failedCount")
    var failedCount: Int,
    /** @param [message] message */
    @SerializedName("message")
    var message: String? = null,
    /** @param [errors] errors */
    @SerializedName("errors")
    var errors: List<String>? = null
)


data class KeyValuePair(
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [value] value */
    @SerializedName("value")
    var value: String
)

data class AddPolicyAssignmentsResponse(

    @SerializedName("addPolicyAssignments")
    val result: CommonMessage
)

class AddPolicyAssignmentsParam @JvmOverloads constructor(
    @SerializedName("policies")
    var policies: List<String>,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    @SerializedName("targetIdentifiers")
    var targetIdentifiers: List<String>? = null
) {

    fun withTargetIdentifiers(targetIdentifiers: List<String>?): AddPolicyAssignmentsParam {
        this.targetIdentifiers = targetIdentifiers
        return this
    }

    fun build(): AddPolicyAssignmentsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            addPolicyAssignmentsDocument,
            this
        );
    }

    private val addPolicyAssignmentsDocument: String = """
mutation addPolicyAssignments(${'$'}policies: [String!]!, ${'$'}targetType: PolicyAssignmentTargetType!, ${'$'}targetIdentifiers: [String!]) {
  addPolicyAssignments(policies: ${'$'}policies, targetType: ${'$'}targetType, targetIdentifiers: ${'$'}targetIdentifiers) {
    message
    code
  }
}
"""
}

data class AllowResponse(

    @SerializedName("allow")
    val result: CommonMessage
)

class AllowParam @JvmOverloads constructor(
    @SerializedName("resource")
    var resource: String,
    @SerializedName("action")
    var action: String,
    @SerializedName("userId")
    var userId: String? = null,
    @SerializedName("userIds")
    var userIds: List<String>? = null,
    @SerializedName("roleCode")
    var roleCode: String? = null,
    @SerializedName("roleCodes")
    var roleCodes: List<String>? = null
) {

    fun withUserId(userId: String?): AllowParam {
        this.userId = userId
        return this
    }

    fun withUserIds(userIds: List<String>?): AllowParam {
        this.userIds = userIds
        return this
    }

    fun withRoleCode(roleCode: String?): AllowParam {
        this.roleCode = roleCode
        return this
    }

    fun withRoleCodes(roleCodes: List<String>?): AllowParam {
        this.roleCodes = roleCodes
        return this
    }

    fun build(): AllowParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            allowDocument,
            this
        );
    }

    private val allowDocument: String = """
mutation allow(${'$'}resource: String!, ${'$'}action: String!, ${'$'}userId: String, ${'$'}userIds: [String!], ${'$'}roleCode: String, ${'$'}roleCodes: [String!]) {
  allow(resource: ${'$'}resource, action: ${'$'}action, userId: ${'$'}userId, userIds: ${'$'}userIds, roleCode: ${'$'}roleCode, roleCodes: ${'$'}roleCodes) {
    message
    code
  }
}
"""
}


data class AssignRoleResponse(

    @SerializedName("assignRole")
    val result: CommonMessage
)

class AssignRoleParam @JvmOverloads constructor(
    @SerializedName("roleCode")
    var roleCode: String? = null,
    @SerializedName("roleCodes")
    var roleCodes: List<String>? = null,
    @SerializedName("userIds")
    var userIds: List<String>? = null,
    @SerializedName("groupCodes")
    var groupCodes: List<String>? = null,
    @SerializedName("nodeCodes")
    var nodeCodes: List<String>? = null
) {

    fun withRoleCode(roleCode: String?): AssignRoleParam {
        this.roleCode = roleCode
        return this
    }

    fun withRoleCodes(roleCodes: List<String>?): AssignRoleParam {
        this.roleCodes = roleCodes
        return this
    }

    fun withUserIds(userIds: List<String>?): AssignRoleParam {
        this.userIds = userIds
        return this
    }

    fun withGroupCodes(groupCodes: List<String>?): AssignRoleParam {
        this.groupCodes = groupCodes
        return this
    }

    fun withNodeCodes(nodeCodes: List<String>?): AssignRoleParam {
        this.nodeCodes = nodeCodes
        return this
    }

    fun build(): AssignRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            assignRoleDocument,
            this
        );
    }

    private val assignRoleDocument: String = """
mutation assignRole(${'$'}roleCode: String, ${'$'}roleCodes: [String], ${'$'}userIds: [String!], ${'$'}groupCodes: [String!], ${'$'}nodeCodes: [String!]) {
  assignRole(roleCode: ${'$'}roleCode, roleCodes: ${'$'}roleCodes, userIds: ${'$'}userIds, groupCodes: ${'$'}groupCodes, nodeCodes: ${'$'}nodeCodes) {
    message
    code
  }
}
"""
}


data class BindPhoneResponse(

    @SerializedName("bindPhone")
    val result: User
)

class BindPhoneParam @JvmOverloads constructor(
    @SerializedName("phone")
    var phone: String,
    @SerializedName("phoneCode")
    var phoneCode: String
) {


    fun build(): BindPhoneParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            bindPhoneDocument,
            this
        );
    }

    private val bindPhoneDocument: String = """
mutation bindPhone(${'$'}phone: String!, ${'$'}phoneCode: String!) {
  bindPhone(phone: ${'$'}phone, phoneCode: ${'$'}phoneCode) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
  }
}
"""
}


data class ChangeMfaResponse(

    @SerializedName("changeMfa")
    val result: Mfa
)

class ChangeMfaParam @JvmOverloads constructor(
    @SerializedName("enable")
    var enable: Boolean? = null,
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("userId")
    var userId: String? = null,
    @SerializedName("userPoolId")
    var userPoolId: String? = null,
    @SerializedName("refresh")
    var refresh: Boolean? = null
) {

    fun withEnable(enable: Boolean?): ChangeMfaParam {
        this.enable = enable
        return this
    }

    fun withId(id: String?): ChangeMfaParam {
        this.id = id
        return this
    }

    fun withUserId(userId: String?): ChangeMfaParam {
        this.userId = userId
        return this
    }

    fun withUserPoolId(userPoolId: String?): ChangeMfaParam {
        this.userPoolId = userPoolId
        return this
    }

    fun withRefresh(refresh: Boolean?): ChangeMfaParam {
        this.refresh = refresh
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
mutation changeMfa(${'$'}enable: Boolean, ${'$'}id: String, ${'$'}userId: String, ${'$'}userPoolId: String, ${'$'}refresh: Boolean) {
  changeMfa(enable: ${'$'}enable, id: ${'$'}id, userId: ${'$'}userId, userPoolId: ${'$'}userPoolId, refresh: ${'$'}refresh) {
    id
    userId
    userPoolId
    enable
    secret
  }
}
"""
}


data class ConfigEmailTemplateResponse(

    @SerializedName("configEmailTemplate")
    val result: EmailTemplate
)

class ConfigEmailTemplateParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: ConfigEmailTemplateInput
) {


    fun build(): ConfigEmailTemplateParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            configEmailTemplateDocument,
            this
        );
    }

    private val configEmailTemplateDocument: String = """
mutation configEmailTemplate(${'$'}input: ConfigEmailTemplateInput!) {
  configEmailTemplate(input: ${'$'}input) {
    type
    name
    subject
    sender
    content
    redirectTo
    hasURL
    expiresIn
    enabled
    isSystem
  }
}
"""
}


data class CreateFunctionResponse(

    @SerializedName("createFunction")
    val result: Function
)

class CreateFunctionParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: CreateFunctionInput
) {


    fun build(): CreateFunctionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            createFunctionDocument,
            this
        );
    }

    private val createFunctionDocument: String = """
mutation createFunction(${'$'}input: CreateFunctionInput!) {
  createFunction(input: ${'$'}input) {
    id
    name
    sourceCode
    description
    url
  }
}
"""
}

data class CreatePolicyResponse(

    @SerializedName("createPolicy")
    val result: Policy
)

class CreatePolicyParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("statements")
    var statements: List<PolicyStatementInput>
) {

    fun withDescription(description: String?): CreatePolicyParam {
        this.description = description
        return this
    }

    fun build(): CreatePolicyParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            createPolicyDocument,
            this
        );
    }

    private val createPolicyDocument: String = """
mutation createPolicy(${'$'}code: String!, ${'$'}description: String, ${'$'}statements: [PolicyStatementInput!]!) {
  createPolicy(code: ${'$'}code, description: ${'$'}description, statements: ${'$'}statements) {
    code
    assignmentsCount
    isDefault
    description
    statements {
      resource
      actions
      effect
    }
    createdAt
    updatedAt
  }
}
"""
}


data class CreateRoleResponse(

    @SerializedName("createRole")
    val result: Role
)

class CreateRoleParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("parent")
    var parent: String? = null
) {

    fun withDescription(description: String?): CreateRoleParam {
        this.description = description
        return this
    }

    fun withParent(parent: String?): CreateRoleParam {
        this.parent = parent
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
mutation createRole(${'$'}code: String!, ${'$'}description: String, ${'$'}parent: String) {
  createRole(code: ${'$'}code, description: ${'$'}description, parent: ${'$'}parent) {
    code
    arn
    description
    isSystem
    createdAt
    updatedAt
    parent {
      code
      arn
      description
      isSystem
      createdAt
      updatedAt
    }
  }
}
"""
}


data class CreateSocialConnectionResponse(

    @SerializedName("createSocialConnection")
    val result: SocialConnection
)

class CreateSocialConnectionParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: CreateSocialConnectionInput
) {


    fun build(): CreateSocialConnectionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            createSocialConnectionDocument,
            this
        );
    }

    private val createSocialConnectionDocument: String = """
mutation createSocialConnection(${'$'}input: CreateSocialConnectionInput!) {
  createSocialConnection(input: ${'$'}input) {
    provider
    name
    logo
    description
    fields {
      key
      label
      type
      placeholder
    }
  }
}
"""
}


data class CreateSocialConnectionInstanceResponse(

    @SerializedName("createSocialConnectionInstance")
    val result: SocialConnectionInstance
)

class CreateSocialConnectionInstanceParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: CreateSocialConnectionInstanceInput
) {


    fun build(): CreateSocialConnectionInstanceParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            createSocialConnectionInstanceDocument,
            this
        );
    }

    private val createSocialConnectionInstanceDocument: String = """
mutation createSocialConnectionInstance(${'$'}input: CreateSocialConnectionInstanceInput!) {
  createSocialConnectionInstance(input: ${'$'}input) {
    provider
    enabled
    fields {
      key
      value
    }
  }
}
"""
}


data class CreateUserResponse(

    @SerializedName("createUser")
    val result: User
)

class CreateUserParam @JvmOverloads constructor(
    @SerializedName("userInfo")
    var userInfo: CreateUserInput,
    @SerializedName("keepPassword")
    var keepPassword: Boolean? = null
) {

    fun withKeepPassword(keepPassword: Boolean?): CreateUserParam {
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
mutation createUser(${'$'}userInfo: CreateUserInput!, ${'$'}keepPassword: Boolean) {
  createUser(userInfo: ${'$'}userInfo, keepPassword: ${'$'}keepPassword) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}

data class DeleteFunctionResponse(

    @SerializedName("deleteFunction")
    val result: CommonMessage
)

class DeleteFunctionParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


    fun build(): DeleteFunctionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deleteFunctionDocument,
            this
        );
    }

    private val deleteFunctionDocument: String = """
mutation deleteFunction(${'$'}id: String!) {
  deleteFunction(id: ${'$'}id) {
    message
    code
  }
}
"""
}

data class DeletePoliciesResponse(

    @SerializedName("deletePolicies")
    val result: CommonMessage
)

class DeletePoliciesParam @JvmOverloads constructor(
    @SerializedName("codeList")
    var codeList: List<String>
) {


    fun build(): DeletePoliciesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deletePoliciesDocument,
            this
        );
    }

    private val deletePoliciesDocument: String = """
mutation deletePolicies(${'$'}codeList: [String!]!) {
  deletePolicies(codeList: ${'$'}codeList) {
    message
    code
  }
}
"""
}


data class DeletePolicyResponse(

    @SerializedName("deletePolicy")
    val result: CommonMessage
)

class DeletePolicyParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String
) {


    fun build(): DeletePolicyParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deletePolicyDocument,
            this
        );
    }

    private val deletePolicyDocument: String = """
mutation deletePolicy(${'$'}code: String!) {
  deletePolicy(code: ${'$'}code) {
    message
    code
  }
}
"""
}


data class DeleteRoleResponse(

    @SerializedName("deleteRole")
    val result: CommonMessage
)

class DeleteRoleParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String
) {


    fun build(): DeleteRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deleteRoleDocument,
            this
        );
    }

    private val deleteRoleDocument: String = """
mutation deleteRole(${'$'}code: String!) {
  deleteRole(code: ${'$'}code) {
    message
    code
  }
}
"""
}


data class DeleteRolesResponse(

    @SerializedName("deleteRoles")
    val result: CommonMessage
)

class DeleteRolesParam @JvmOverloads constructor(
    @SerializedName("codeList")
    var codeList: List<String>
) {


    fun build(): DeleteRolesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deleteRolesDocument,
            this
        );
    }

    private val deleteRolesDocument: String = """
mutation deleteRoles(${'$'}codeList: [String!]!) {
  deleteRoles(codeList: ${'$'}codeList) {
    message
    code
  }
}
"""
}


data class DeleteUserResponse(

    @SerializedName("deleteUser")
    val result: CommonMessage
)

class DeleteUserParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


    fun build(): DeleteUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deleteUserDocument,
            this
        );
    }

    private val deleteUserDocument: String = """
mutation deleteUser(${'$'}id: String!) {
  deleteUser(id: ${'$'}id) {
    message
    code
  }
}
"""
}



data class DeleteUsersResponse(

    @SerializedName("deleteUsers")
    val result: CommonMessage
)

class DeleteUsersParam @JvmOverloads constructor(
    @SerializedName("ids")
    var ids: List<String>
) {


    fun build(): DeleteUsersParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            deleteUsersDocument,
            this
        );
    }

    private val deleteUsersDocument: String = """
mutation deleteUsers(${'$'}ids: [String!]!) {
  deleteUsers(ids: ${'$'}ids) {
    message
    code
  }
}
"""
}


data class DisableEmailTemplateResponse(

    @SerializedName("disableEmailTemplate")
    val result: EmailTemplate
)

class DisableEmailTemplateParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: EmailTemplateType
) {


    fun build(): DisableEmailTemplateParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            disableEmailTemplateDocument,
            this
        );
    }

    private val disableEmailTemplateDocument: String = """
mutation disableEmailTemplate(${'$'}type: EmailTemplateType!) {
  disableEmailTemplate(type: ${'$'}type) {
    type
    name
    subject
    sender
    content
    redirectTo
    hasURL
    expiresIn
    enabled
    isSystem
  }
}
"""
}


data class DisableSocialConnectionInstanceResponse(

    @SerializedName("disableSocialConnectionInstance")
    val result: SocialConnectionInstance
)

class DisableSocialConnectionInstanceParam @JvmOverloads constructor(
    @SerializedName("provider")
    var provider: String
) {


    fun build(): DisableSocialConnectionInstanceParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            disableSocialConnectionInstanceDocument,
            this
        );
    }

    private val disableSocialConnectionInstanceDocument: String = """
mutation disableSocialConnectionInstance(${'$'}provider: String!) {
  disableSocialConnectionInstance(provider: ${'$'}provider) {
    provider
    enabled
    fields {
      key
      value
    }
  }
}
"""
}


data class EnableEmailTemplateResponse(

    @SerializedName("enableEmailTemplate")
    val result: EmailTemplate
)

class EnableEmailTemplateParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: EmailTemplateType
) {


    fun build(): EnableEmailTemplateParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            enableEmailTemplateDocument,
            this
        );
    }

    private val enableEmailTemplateDocument: String = """
mutation enableEmailTemplate(${'$'}type: EmailTemplateType!) {
  enableEmailTemplate(type: ${'$'}type) {
    type
    name
    subject
    sender
    content
    redirectTo
    hasURL
    expiresIn
    enabled
    isSystem
  }
}
"""
}


data class EnableSocialConnectionInstanceResponse(

    @SerializedName("enableSocialConnectionInstance")
    val result: SocialConnectionInstance
)

class EnableSocialConnectionInstanceParam @JvmOverloads constructor(
    @SerializedName("provider")
    var provider: String
) {


    fun build(): EnableSocialConnectionInstanceParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            enableSocialConnectionInstanceDocument,
            this
        );
    }

    private val enableSocialConnectionInstanceDocument: String = """
mutation enableSocialConnectionInstance(${'$'}provider: String!) {
  enableSocialConnectionInstance(provider: ${'$'}provider) {
    provider
    enabled
    fields {
      key
      value
    }
  }
}
"""
}


data class LoginByEmailResponse(

    @SerializedName("loginByEmail")
    val result: User
)

class LoginByEmailParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: LoginByEmailInput
) {


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
mutation loginByEmail(${'$'}input: LoginByEmailInput!) {
  loginByEmail(input: ${'$'}input) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}


data class LoginByPhoneCodeResponse(

    @SerializedName("loginByPhoneCode")
    val result: User
)

class LoginByPhoneCodeParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: LoginByPhoneCodeInput
) {


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
mutation loginByPhoneCode(${'$'}input: LoginByPhoneCodeInput!) {
  loginByPhoneCode(input: ${'$'}input) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}


data class LoginByPhonePasswordResponse(

    @SerializedName("loginByPhonePassword")
    val result: User
)

class LoginByPhonePasswordParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: LoginByPhonePasswordInput
) {


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
mutation loginByPhonePassword(${'$'}input: LoginByPhonePasswordInput!) {
  loginByPhonePassword(input: ${'$'}input) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}


data class LoginByUsernameResponse(

    @SerializedName("loginByUsername")
    val result: User
)

class LoginByUsernameParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: LoginByUsernameInput
) {


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
mutation loginByUsername(${'$'}input: LoginByUsernameInput!) {
  loginByUsername(input: ${'$'}input) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}

data class RefreshAccessTokenResponse(

    @SerializedName("refreshAccessToken")
    val result: RefreshAccessTokenRes
)

class RefreshAccessTokenParam @JvmOverloads constructor(
    @SerializedName("accessToken")
    var accessToken: String? = null
) {

    fun withAccessToken(accessToken: String?): RefreshAccessTokenParam {
        this.accessToken = accessToken
        return this
    }

    fun build(): RefreshAccessTokenParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            refreshAccessTokenDocument,
            this
        );
    }

    private val refreshAccessTokenDocument: String = """
mutation refreshAccessToken(${'$'}accessToken: String) {
  refreshAccessToken(accessToken: ${'$'}accessToken) {
    accessToken
    exp
    iat
  }
}
"""
}


data class RefreshTokenResponse(

    @SerializedName("refreshToken")
    val result: RefreshToken
)

class RefreshTokenParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String? = null
) {

    fun withId(id: String?): RefreshTokenParam {
        this.id = id
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
mutation refreshToken(${'$'}id: String) {
  refreshToken(id: ${'$'}id) {
    token
    iat
    exp
  }
}
"""
}


data class RefreshUserpoolSecretResponse(

    @SerializedName("refreshUserpoolSecret")
    val result: String
)

class RefreshUserpoolSecretParam {


    fun build(): RefreshUserpoolSecretParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            refreshUserpoolSecretDocument,
            this
        );
    }

    private val refreshUserpoolSecretDocument: String = """
mutation refreshUserpoolSecret {
  refreshUserpoolSecret
}
"""
}


data class RegisterByEmailResponse(

    @SerializedName("registerByEmail")
    val result: User
)

class RegisterByEmailParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: RegisterByEmailInput
) {


    fun build(): RegisterByEmailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            registerByEmailDocument,
            this
        );
    }

    private val registerByEmailDocument: String = """
mutation registerByEmail(${'$'}input: RegisterByEmailInput!) {
  registerByEmail(input: ${'$'}input) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}


data class RegisterByPhoneCodeResponse(

    @SerializedName("registerByPhoneCode")
    val result: User
)

class RegisterByPhoneCodeParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: RegisterByPhoneCodeInput
) {


    fun build(): RegisterByPhoneCodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            registerByPhoneCodeDocument,
            this
        );
    }

    private val registerByPhoneCodeDocument: String = """
mutation registerByPhoneCode(${'$'}input: RegisterByPhoneCodeInput!) {
  registerByPhoneCode(input: ${'$'}input) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}


data class RegisterByUsernameResponse(

    @SerializedName("registerByUsername")
    val result: User
)

class RegisterByUsernameParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: RegisterByUsernameInput
) {


    fun build(): RegisterByUsernameParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            registerByUsernameDocument,
            this
        );
    }

    private val registerByUsernameDocument: String = """
mutation registerByUsername(${'$'}input: RegisterByUsernameInput!) {
  registerByUsername(input: ${'$'}input) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}

data class RemovePolicyAssignmentsResponse(

    @SerializedName("removePolicyAssignments")
    val result: CommonMessage
)

class RemovePolicyAssignmentsParam @JvmOverloads constructor(
    @SerializedName("policies")
    var policies: List<String>,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    @SerializedName("targetIdentifiers")
    var targetIdentifiers: List<String>? = null
) {

    fun withTargetIdentifiers(targetIdentifiers: List<String>?): RemovePolicyAssignmentsParam {
        this.targetIdentifiers = targetIdentifiers
        return this
    }

    fun build(): RemovePolicyAssignmentsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            removePolicyAssignmentsDocument,
            this
        );
    }

    private val removePolicyAssignmentsDocument: String = """
mutation removePolicyAssignments(${'$'}policies: [String!]!, ${'$'}targetType: PolicyAssignmentTargetType!, ${'$'}targetIdentifiers: [String!]) {
  removePolicyAssignments(policies: ${'$'}policies, targetType: ${'$'}targetType, targetIdentifiers: ${'$'}targetIdentifiers) {
    message
    code
  }
}
"""
}


data class RemoveUdfResponse(

    @SerializedName("removeUdf")
    val result: CommonMessage
)

class RemoveUdfParam @JvmOverloads constructor(
    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("key")
    var key: String
) {


    fun build(): RemoveUdfParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            removeUdfDocument,
            this
        );
    }

    private val removeUdfDocument: String = """
mutation removeUdf(${'$'}targetType: UDFTargetType!, ${'$'}key: String!) {
  removeUdf(targetType: ${'$'}targetType, key: ${'$'}key) {
    message
    code
  }
}
"""
}


data class RemoveUdvResponse(

    @SerializedName("removeUdv")
    val result: List<UserDefinedData>
)

class RemoveUdvParam @JvmOverloads constructor(
    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("targetId")
    var targetId: String,
    @SerializedName("key")
    var key: String
) {


    fun build(): RemoveUdvParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            removeUdvDocument,
            this
        );
    }

    private val removeUdvDocument: String = """
mutation removeUdv(${'$'}targetType: UDFTargetType!, ${'$'}targetId: String!, ${'$'}key: String!) {
  removeUdv(targetType: ${'$'}targetType, targetId: ${'$'}targetId, key: ${'$'}key) {
    key
    dataType
    value
  }
}
"""
}

data class ResetPasswordResponse(

    @SerializedName("resetPassword")
    val result: CommonMessage
)

class ResetPasswordParam @JvmOverloads constructor(
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("code")
    var code: String,
    @SerializedName("newPassword")
    var newPassword: String
) {

    fun withPhone(phone: String?): ResetPasswordParam {
        this.phone = phone
        return this
    }

    fun withEmail(email: String?): ResetPasswordParam {
        this.email = email
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
mutation resetPassword(${'$'}phone: String, ${'$'}email: String, ${'$'}code: String!, ${'$'}newPassword: String!) {
  resetPassword(phone: ${'$'}phone, email: ${'$'}email, code: ${'$'}code, newPassword: ${'$'}newPassword) {
    message
    code
  }
}
"""
}


data class RevokeRoleResponse(

    @SerializedName("revokeRole")
    val result: CommonMessage
)

class RevokeRoleParam @JvmOverloads constructor(
    @SerializedName("roleCode")
    var roleCode: String? = null,
    @SerializedName("roleCodes")
    var roleCodes: List<String>? = null,
    @SerializedName("userIds")
    var userIds: List<String>? = null,
    @SerializedName("groupCodes")
    var groupCodes: List<String>? = null,
    @SerializedName("nodeCodes")
    var nodeCodes: List<String>? = null
) {

    fun withRoleCode(roleCode: String?): RevokeRoleParam {
        this.roleCode = roleCode
        return this
    }

    fun withRoleCodes(roleCodes: List<String>?): RevokeRoleParam {
        this.roleCodes = roleCodes
        return this
    }

    fun withUserIds(userIds: List<String>?): RevokeRoleParam {
        this.userIds = userIds
        return this
    }

    fun withGroupCodes(groupCodes: List<String>?): RevokeRoleParam {
        this.groupCodes = groupCodes
        return this
    }

    fun withNodeCodes(nodeCodes: List<String>?): RevokeRoleParam {
        this.nodeCodes = nodeCodes
        return this
    }

    fun build(): RevokeRoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            revokeRoleDocument,
            this
        );
    }

    private val revokeRoleDocument: String = """
mutation revokeRole(${'$'}roleCode: String, ${'$'}roleCodes: [String], ${'$'}userIds: [String!], ${'$'}groupCodes: [String!], ${'$'}nodeCodes: [String!]) {
  revokeRole(roleCode: ${'$'}roleCode, roleCodes: ${'$'}roleCodes, userIds: ${'$'}userIds, groupCodes: ${'$'}groupCodes, nodeCodes: ${'$'}nodeCodes) {
    message
    code
  }
}
"""
}


data class SendEmailResponse(

    @SerializedName("sendEmail")
    val result: CommonMessage
)

class SendEmailParam @JvmOverloads constructor(
    @SerializedName("email")
    var email: String,
    @SerializedName("scene")
    var scene: EmailScene
) {


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
mutation sendEmail(${'$'}email: String!, ${'$'}scene: EmailScene!) {
  sendEmail(email: ${'$'}email, scene: ${'$'}scene) {
    message
    code
  }
}
"""
}


data class SetUdfResponse(

    @SerializedName("setUdf")
    val result: UserDefinedField
)

class SetUdfParam @JvmOverloads constructor(
    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("key")
    var key: String,
    @SerializedName("dataType")
    var dataType: UdfDataType,
    @SerializedName("label")
    var label: String,
    @SerializedName("options")
    var options: String? = null
) {

    fun withOptions(options: String?): SetUdfParam {
        this.options = options
        return this
    }

    fun build(): SetUdfParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            setUdfDocument,
            this
        );
    }

    private val setUdfDocument: String = """
mutation setUdf(${'$'}targetType: UDFTargetType!, ${'$'}key: String!, ${'$'}dataType: UDFDataType!, ${'$'}label: String!, ${'$'}options: String) {
  setUdf(targetType: ${'$'}targetType, key: ${'$'}key, dataType: ${'$'}dataType, label: ${'$'}label, options: ${'$'}options) {
    targetType
    dataType
    key
    label
    options
  }
}
"""
}


data class SetUdvResponse(

    @SerializedName("setUdv")
    val result: List<UserDefinedData>
)

class SetUdvParam @JvmOverloads constructor(
    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("targetId")
    var targetId: String,
    @SerializedName("key")
    var key: String,
    @SerializedName("value")
    var value: String
) {


    fun build(): SetUdvParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            setUdvDocument,
            this
        );
    }

    private val setUdvDocument: String = """
mutation setUdv(${'$'}targetType: UDFTargetType!, ${'$'}targetId: String!, ${'$'}key: String!, ${'$'}value: String!) {
  setUdv(targetType: ${'$'}targetType, targetId: ${'$'}targetId, key: ${'$'}key, value: ${'$'}value) {
    key
    dataType
    value
  }
}
"""
}


data class UnbindEmailResponse(

    @SerializedName("unbindEmail")
    val result: User
)

class UnbindEmailParam {


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
mutation unbindEmail {
  unbindEmail {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
  }
}
"""
}


data class UnbindPhoneResponse(

    @SerializedName("unbindPhone")
    val result: User
)

class UnbindPhoneParam {


    fun build(): UnbindPhoneParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            unbindPhoneDocument,
            this
        );
    }

    private val unbindPhoneDocument: String = """
mutation unbindPhone {
  unbindPhone {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
  }
}
"""
}


data class UpdateEmailResponse(

    @SerializedName("updateEmail")
    val result: User
)

class UpdateEmailParam @JvmOverloads constructor(
    @SerializedName("email")
    var email: String,
    @SerializedName("emailCode")
    var emailCode: String,
    @SerializedName("oldEmail")
    var oldEmail: String? = null,
    @SerializedName("oldEmailCode")
    var oldEmailCode: String? = null
) {

    fun withOldEmail(oldEmail: String?): UpdateEmailParam {
        this.oldEmail = oldEmail
        return this
    }

    fun withOldEmailCode(oldEmailCode: String?): UpdateEmailParam {
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
mutation updateEmail(${'$'}email: String!, ${'$'}emailCode: String!, ${'$'}oldEmail: String, ${'$'}oldEmailCode: String) {
  updateEmail(email: ${'$'}email, emailCode: ${'$'}emailCode, oldEmail: ${'$'}oldEmail, oldEmailCode: ${'$'}oldEmailCode) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
  }
}
"""
}


data class UpdateFunctionResponse(

    @SerializedName("updateFunction")
    val result: Function
)

class UpdateFunctionParam @JvmOverloads constructor(
    @SerializedName("input")
    var input: UpdateFunctionInput
) {


    fun build(): UpdateFunctionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            updateFunctionDocument,
            this
        );
    }

    private val updateFunctionDocument: String = """
mutation updateFunction(${'$'}input: UpdateFunctionInput!) {
  updateFunction(input: ${'$'}input) {
    id
    name
    sourceCode
    description
    url
  }
}
"""
}

data class UpdatePasswordResponse(

    @SerializedName("updatePassword")
    val result: User
)

class UpdatePasswordParam @JvmOverloads constructor(
    @SerializedName("newPassword")
    var newPassword: String,
    @SerializedName("oldPassword")
    var oldPassword: String? = null
) {

    fun withOldPassword(oldPassword: String?): UpdatePasswordParam {
        this.oldPassword = oldPassword
        return this
    }

    fun build(): UpdatePasswordParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            updatePasswordDocument,
            this
        );
    }

    private val updatePasswordDocument: String = """
mutation updatePassword(${'$'}newPassword: String!, ${'$'}oldPassword: String) {
  updatePassword(newPassword: ${'$'}newPassword, oldPassword: ${'$'}oldPassword) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
  }
}
"""
}


data class UpdatePhoneResponse(

    @SerializedName("updatePhone")
    val result: User
)

class UpdatePhoneParam @JvmOverloads constructor(
    @SerializedName("phone")
    var phone: String,
    @SerializedName("phoneCode")
    var phoneCode: String,
    @SerializedName("oldPhone")
    var oldPhone: String? = null,
    @SerializedName("oldPhoneCode")
    var oldPhoneCode: String? = null
) {

    fun withOldPhone(oldPhone: String?): UpdatePhoneParam {
        this.oldPhone = oldPhone
        return this
    }

    fun withOldPhoneCode(oldPhoneCode: String?): UpdatePhoneParam {
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
mutation updatePhone(${'$'}phone: String!, ${'$'}phoneCode: String!, ${'$'}oldPhone: String, ${'$'}oldPhoneCode: String) {
  updatePhone(phone: ${'$'}phone, phoneCode: ${'$'}phoneCode, oldPhone: ${'$'}oldPhone, oldPhoneCode: ${'$'}oldPhoneCode) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
  }
}
"""
}


data class UpdatePolicyResponse(

    @SerializedName("updatePolicy")
    val result: Policy
)

class UpdatePolicyParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("statements")
    var statements: List<PolicyStatementInput>? = null,
    @SerializedName("newCode")
    var newCode: String? = null
) {

    fun withDescription(description: String?): UpdatePolicyParam {
        this.description = description
        return this
    }

    fun withStatements(statements: List<PolicyStatementInput>?): UpdatePolicyParam {
        this.statements = statements
        return this
    }

    fun withNewCode(newCode: String?): UpdatePolicyParam {
        this.newCode = newCode
        return this
    }

    fun build(): UpdatePolicyParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            updatePolicyDocument,
            this
        );
    }

    private val updatePolicyDocument: String = """
mutation updatePolicy(${'$'}code: String!, ${'$'}description: String, ${'$'}statements: [PolicyStatementInput!], ${'$'}newCode: String) {
  updatePolicy(code: ${'$'}code, description: ${'$'}description, statements: ${'$'}statements, newCode: ${'$'}newCode) {
    code
    isDefault
    description
    statements {
      resource
      actions
      effect
    }
    createdAt
    updatedAt
    assignmentsCount
  }
}
"""
}


data class UpdateRoleResponse(

    @SerializedName("updateRole")
    val result: Role
)

class UpdateRoleParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("newCode")
    var newCode: String? = null
) {

    fun withDescription(description: String?): UpdateRoleParam {
        this.description = description
        return this
    }

    fun withNewCode(newCode: String?): UpdateRoleParam {
        this.newCode = newCode
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
mutation updateRole(${'$'}code: String!, ${'$'}description: String, ${'$'}newCode: String) {
  updateRole(code: ${'$'}code, description: ${'$'}description, newCode: ${'$'}newCode) {
    code
    arn
    description
    isSystem
    createdAt
    updatedAt
    users {
      totalCount
    }
    parent {
      code
      arn
      description
      isSystem
      createdAt
      updatedAt
    }
  }
}
"""
}


data class UpdateUserResponse(

    @SerializedName("updateUser")
    val result: User
)

class UpdateUserParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("input")
    var input: UpdateUserInput
) {

    fun withId(id: String?): UpdateUserParam {
        this.id = id
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
mutation updateUser(${'$'}id: String, ${'$'}input: UpdateUserInput!) {
  updateUser(id: ${'$'}id, input: ${'$'}input) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}


data class AccessTokenResponse(

    @SerializedName("accessToken")
    val result: AccessTokenRes
)

class AccessTokenParam @JvmOverloads constructor(
    @SerializedName("userPoolId")
    var userPoolId: String,
    @SerializedName("secret")
    var secret: String
) {


    fun build(): AccessTokenParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            accessTokenDocument,
            this
        );
    }

    private val accessTokenDocument: String = """
query accessToken(${'$'}userPoolId: String!, ${'$'}secret: String!) {
  accessToken(userPoolId: ${'$'}userPoolId, secret: ${'$'}secret) {
    accessToken
    exp
    iat
  }
}
"""
}


data class CheckLoginStatusResponse(

    @SerializedName("checkLoginStatus")
    val result: JwtTokenStatus
)

class CheckLoginStatusParam @JvmOverloads constructor(
    @SerializedName("token")
    var token: String? = null
) {

    fun withToken(token: String?): CheckLoginStatusParam {
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
    code
    message
    status
    exp
    iat
    data {
      id
      userPoolId
      arn
    }
  }
}
"""
}


data class CheckPasswordStrengthResponse(

    @SerializedName("checkPasswordStrength")
    val result: CheckPasswordStrengthResult
)

class CheckPasswordStrengthParam @JvmOverloads constructor(
    @SerializedName("password")
    var password: String
) {


    fun build(): CheckPasswordStrengthParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            checkPasswordStrengthDocument,
            this
        );
    }

    private val checkPasswordStrengthDocument: String = """
query checkPasswordStrength(${'$'}password: String!) {
  checkPasswordStrength(password: ${'$'}password) {
    valid
    message
  }
}
"""
}


data class EmailTemplatesResponse(

    @SerializedName("emailTemplates")
    val result: List<EmailTemplate>
)

class EmailTemplatesParam {


    fun build(): EmailTemplatesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            emailTemplatesDocument,
            this
        );
    }

    private val emailTemplatesDocument: String = """
query emailTemplates {
  emailTemplates {
    type
    name
    subject
    sender
    content
    redirectTo
    hasURL
    expiresIn
    enabled
    isSystem
  }
}
"""
}


data class FindUserResponse(

    @SerializedName("findUser")
    val result: User
)

class FindUserParam @JvmOverloads constructor(
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("username")
    var username: String? = null
) {

    fun withEmail(email: String?): FindUserParam {
        this.email = email
        return this
    }

    fun withPhone(phone: String?): FindUserParam {
        this.phone = phone
        return this
    }

    fun withUsername(username: String?): FindUserParam {
        this.username = username
        return this
    }

    fun build(): FindUserParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            findUserDocument,
            this
        );
    }

    private val findUserDocument: String = """
query findUser(${'$'}email: String, ${'$'}phone: String, ${'$'}username: String) {
  findUser(email: ${'$'}email, phone: ${'$'}phone, username: ${'$'}username) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}


data class FunctionResponse(

    @SerializedName("function")
    val result: Function
)

class FunctionParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String? = null
) {

    fun withId(id: String?): FunctionParam {
        this.id = id
        return this
    }

    fun build(): FunctionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            functionDocument,
            this
        );
    }

    private val functionDocument: String = """
query function(${'$'}id: String) {
  function(id: ${'$'}id) {
    id
    name
    sourceCode
    description
    url
  }
}
"""
}


data class FunctionsResponse(

    @SerializedName("functions")
    val result: PaginatedFunctions
)

class FunctionsParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null
) {

    fun withPage(page: Int?): FunctionsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): FunctionsParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): FunctionsParam {
        this.sortBy = sortBy
        return this
    }

    fun build(): FunctionsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            functionsDocument,
            this
        );
    }

    private val functionsDocument: String = """
query functions(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  functions(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
    list {
      id
      name
      sourceCode
      description
      url
    }
    totalCount
  }
}
"""
}


data class GetUserGroupsResponse(

    @SerializedName("user")
    val result: User
)

class GetUserGroupsParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


    fun build(): GetUserGroupsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            getUserGroupsDocument,
            this
        );
    }

    private val getUserGroupsDocument: String = """
query getUserGroups(${'$'}id: String!) {
  user(id: ${'$'}id) {
    groups {
      totalCount
      list {
        code
        name
        description
        createdAt
        updatedAt
      }
    }
  }
}
"""
}


data class GetUserRolesResponse(

    @SerializedName("user")
    val result: User
)

class GetUserRolesParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


    fun build(): GetUserRolesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            getUserRolesDocument,
            this
        );
    }

    private val getUserRolesDocument: String = """
query getUserRoles(${'$'}id: String!) {
  user(id: ${'$'}id) {
    roles {
      totalCount
      list {
        code
        arn
        description
        isSystem
        createdAt
        updatedAt
        parent {
          code
          description
          isSystem
          createdAt
          updatedAt
        }
      }
    }
  }
}
"""
}

data class IsActionAllowedResponse(

    @SerializedName("isActionAllowed")
    val result: Boolean
)

class IsActionAllowedParam @JvmOverloads constructor(
    @SerializedName("resource")
    var resource: String,
    @SerializedName("action")
    var action: String,
    @SerializedName("userId")
    var userId: String
) {


    fun build(): IsActionAllowedParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            isActionAllowedDocument,
            this
        );
    }

    private val isActionAllowedDocument: String = """
query isActionAllowed(${'$'}resource: String!, ${'$'}action: String!, ${'$'}userId: String!) {
  isActionAllowed(resource: ${'$'}resource, action: ${'$'}action, userId: ${'$'}userId)
}
"""
}


data class IsActionDeniedResponse(

    @SerializedName("isActionDenied")
    val result: Boolean
)

class IsActionDeniedParam @JvmOverloads constructor(
    @SerializedName("resource")
    var resource: String,
    @SerializedName("action")
    var action: String,
    @SerializedName("userId")
    var userId: String
) {


    fun build(): IsActionDeniedParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            isActionDeniedDocument,
            this
        );
    }

    private val isActionDeniedDocument: String = """
query isActionDenied(${'$'}resource: String!, ${'$'}action: String!, ${'$'}userId: String!) {
  isActionDenied(resource: ${'$'}resource, action: ${'$'}action, userId: ${'$'}userId)
}
"""
}


data class IsDomainAvaliableResponse(

    @SerializedName("isDomainAvaliable")
    val result: Boolean
)

class IsDomainAvaliableParam @JvmOverloads constructor(
    @SerializedName("domain")
    var domain: String
) {


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

data class IsUserExistsResponse(

    @SerializedName("isUserExists")
    val result: Boolean
)

class IsUserExistsParam @JvmOverloads constructor(
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("username")
    var username: String? = null
) {

    fun withEmail(email: String?): IsUserExistsParam {
        this.email = email
        return this
    }

    fun withPhone(phone: String?): IsUserExistsParam {
        this.phone = phone
        return this
    }

    fun withUsername(username: String?): IsUserExistsParam {
        this.username = username
        return this
    }

    fun build(): IsUserExistsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            isUserExistsDocument,
            this
        );
    }

    private val isUserExistsDocument: String = """
query isUserExists(${'$'}email: String, ${'$'}phone: String, ${'$'}username: String) {
  isUserExists(email: ${'$'}email, phone: ${'$'}phone, username: ${'$'}username)
}
"""
}

data class PoliciesResponse(

    @SerializedName("policies")
    val result: PaginatedPolicies
)

class PoliciesParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("excludeDefault")
    var excludeDefault: Boolean? = null
) {

    fun withPage(page: Int?): PoliciesParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): PoliciesParam {
        this.limit = limit
        return this
    }

    fun withExcludeDefault(excludeDefault: Boolean?): PoliciesParam {
        this.excludeDefault = excludeDefault
        return this
    }

    fun build(): PoliciesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            policiesDocument,
            this
        );
    }

    private val policiesDocument: String = """
query policies(${'$'}page: Int, ${'$'}limit: Int, ${'$'}excludeDefault: Boolean) {
  policies(page: ${'$'}page, limit: ${'$'}limit, excludeDefault: ${'$'}excludeDefault) {
    totalCount
    list {
      code
      isDefault
      description
      createdAt
      updatedAt
      assignmentsCount
      statements {
        resource
        actions
        effect
      }
    }
  }
}
"""
}


data class PolicyResponse(

    @SerializedName("policy")
    val result: Policy
)

class PolicyParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String
) {


    fun build(): PolicyParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            policyDocument,
            this
        );
    }

    private val policyDocument: String = """
query policy(${'$'}code: String!) {
  policy(code: ${'$'}code) {
    code
    assignmentsCount
    isDefault
    description
    statements {
      resource
      actions
      effect
    }
    createdAt
    updatedAt
  }
}
"""
}


data class PolicyAssignmentsResponse(

    @SerializedName("policyAssignments")
    val result: PaginatedPolicyAssignments
)

class PolicyAssignmentsParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType? = null,
    @SerializedName("targetIdentifier")
    var targetIdentifier: String? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null
) {

    fun withCode(code: String?): PolicyAssignmentsParam {
        this.code = code
        return this
    }

    fun withTargetType(targetType: PolicyAssignmentTargetType?): PolicyAssignmentsParam {
        this.targetType = targetType
        return this
    }

    fun withTargetIdentifier(targetIdentifier: String?): PolicyAssignmentsParam {
        this.targetIdentifier = targetIdentifier
        return this
    }

    fun withPage(page: Int?): PolicyAssignmentsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): PolicyAssignmentsParam {
        this.limit = limit
        return this
    }

    fun build(): PolicyAssignmentsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            policyAssignmentsDocument,
            this
        );
    }

    private val policyAssignmentsDocument: String = """
query policyAssignments(${'$'}code: String, ${'$'}targetType: PolicyAssignmentTargetType, ${'$'}targetIdentifier: String, ${'$'}page: Int, ${'$'}limit: Int) {
  policyAssignments(code: ${'$'}code, targetType: ${'$'}targetType, targetIdentifier: ${'$'}targetIdentifier, page: ${'$'}page, limit: ${'$'}limit) {
    totalCount
    list {
      code
      targetType
      targetIdentifier
    }
  }
}
"""
}


data class PolicyWithAssignmentsResponse(

    @SerializedName("policy")
    val result: Policy
)

class PolicyWithAssignmentsParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("code")
    var code: String
) {

    fun withPage(page: Int?): PolicyWithAssignmentsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): PolicyWithAssignmentsParam {
        this.limit = limit
        return this
    }

    fun build(): PolicyWithAssignmentsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            policyWithAssignmentsDocument,
            this
        );
    }

    private val policyWithAssignmentsDocument: String = """
query policyWithAssignments(${'$'}page: Int, ${'$'}limit: Int, ${'$'}code: String!) {
  policy(code: ${'$'}code) {
    code
    isDefault
    description
    statements {
      resource
      actions
      effect
    }
    createdAt
    updatedAt
    assignmentsCount
    assignments(page: ${'$'}page, limit: ${'$'}limit) {
      code
      targetType
      targetIdentifier
    }
  }
}
"""
}


data class PreviewEmailResponse(

    @SerializedName("previewEmail")
    val result: String
)

class PreviewEmailParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: EmailTemplateType
) {


    fun build(): PreviewEmailParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            previewEmailDocument,
            this
        );
    }

    private val previewEmailDocument: String = """
query previewEmail(${'$'}type: EmailTemplateType!) {
  previewEmail(type: ${'$'}type)
}
"""
}


data class QiniuUptokenResponse(

    @SerializedName("qiniuUptoken")
    val result: String
)

class QiniuUptokenParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: String? = null
) {

    fun withType(type: String?): QiniuUptokenParam {
        this.type = type
        return this
    }

    fun build(): QiniuUptokenParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            qiniuUptokenDocument,
            this
        );
    }

    private val qiniuUptokenDocument: String = """
query qiniuUptoken(${'$'}type: String) {
  qiniuUptoken(type: ${'$'}type)
}
"""
}


data class QueryMfaResponse(

    @SerializedName("queryMfa")
    val result: Mfa
)

class QueryMfaParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("userId")
    var userId: String? = null,
    @SerializedName("userPoolId")
    var userPoolId: String? = null
) {

    fun withId(id: String?): QueryMfaParam {
        this.id = id
        return this
    }

    fun withUserId(userId: String?): QueryMfaParam {
        this.userId = userId
        return this
    }

    fun withUserPoolId(userPoolId: String?): QueryMfaParam {
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
query queryMfa(${'$'}id: String, ${'$'}userId: String, ${'$'}userPoolId: String) {
  queryMfa(id: ${'$'}id, userId: ${'$'}userId, userPoolId: ${'$'}userPoolId) {
    id
    userId
    userPoolId
    enable
    secret
  }
}
"""
}


data class RoleResponse(

    @SerializedName("role")
    val result: Role
)

class RoleParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String
) {


    fun build(): RoleParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            roleDocument,
            this
        );
    }

    private val roleDocument: String = """
query role(${'$'}code: String!) {
  role(code: ${'$'}code) {
    code
    arn
    description
    isSystem
    createdAt
    updatedAt
    users {
      totalCount
    }
    parent {
      code
      arn
      description
      isSystem
      createdAt
      updatedAt
    }
  }
}
"""
}


data class RoleWithUsersResponse(

    @SerializedName("role")
    val result: Role
)

class RoleWithUsersParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String
) {


    fun build(): RoleWithUsersParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            roleWithUsersDocument,
            this
        );
    }

    private val roleWithUsersDocument: String = """
query roleWithUsers(${'$'}code: String!) {
  role(code: ${'$'}code) {
    users {
      totalCount
      list {
        id
        arn
        userPoolId
        username
        email
        emailVerified
        phone
        phoneVerified
        unionid
        openid
        nickname
        registerSource
        photo
        password
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
        browser
        company
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
        city
        province
        country
        createdAt
        updatedAt
        externalId
      }
    }
  }
}
"""
}


data class RolesResponse(

    @SerializedName("roles")
    val result: PaginatedRoles
)

class RolesParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null
) {

    fun withPage(page: Int?): RolesParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): RolesParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): RolesParam {
        this.sortBy = sortBy
        return this
    }

    fun build(): RolesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            rolesDocument,
            this
        );
    }

    private val rolesDocument: String = """
query roles(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  roles(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
    totalCount
    list {
      code
      arn
      description
      isSystem
      createdAt
      updatedAt
      parent {
        code
        description
        isSystem
        createdAt
        updatedAt
      }
    }
  }
}
"""
}

data class SearchUserResponse(

    @SerializedName("searchUser")
    val result: PaginatedUsers
)

class SearchUserParam @JvmOverloads constructor(
    @SerializedName("query")
    var query: String,
    @SerializedName("fields")
    var fields: List<String>? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null
) {

    fun withFields(fields: List<String>?): SearchUserParam {
        this.fields = fields
        return this
    }

    fun withPage(page: Int?): SearchUserParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): SearchUserParam {
        this.limit = limit
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
query searchUser(${'$'}query: String!, ${'$'}fields: [String], ${'$'}page: Int, ${'$'}limit: Int) {
  searchUser(query: ${'$'}query, fields: ${'$'}fields, page: ${'$'}page, limit: ${'$'}limit) {
    totalCount
    list {
      id
      arn
      userPoolId
      username
      email
      emailVerified
      phone
      phoneVerified
      unionid
      openid
      nickname
      registerSource
      photo
      password
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
      browser
      company
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
      city
      province
      country
      createdAt
      updatedAt
      externalId
    }
  }
}
"""
}


data class SocialConnectionResponse(

    @SerializedName("socialConnection")
    val result: SocialConnection
)

class SocialConnectionParam @JvmOverloads constructor(
    @SerializedName("provider")
    var provider: String
) {


    fun build(): SocialConnectionParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            socialConnectionDocument,
            this
        );
    }

    private val socialConnectionDocument: String = """
query socialConnection(${'$'}provider: String!) {
  socialConnection(provider: ${'$'}provider) {
    provider
    name
    logo
    description
    fields {
      key
      label
      type
      placeholder
    }
  }
}
"""
}


data class SocialConnectionInstanceResponse(

    @SerializedName("socialConnectionInstance")
    val result: SocialConnectionInstance
)

class SocialConnectionInstanceParam @JvmOverloads constructor(
    @SerializedName("provider")
    var provider: String
) {


    fun build(): SocialConnectionInstanceParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            socialConnectionInstanceDocument,
            this
        );
    }

    private val socialConnectionInstanceDocument: String = """
query socialConnectionInstance(${'$'}provider: String!) {
  socialConnectionInstance(provider: ${'$'}provider) {
    provider
    enabled
    fields {
      key
      value
    }
  }
}
"""
}


data class SocialConnectionInstancesResponse(

    @SerializedName("socialConnectionInstances")
    val result: List<SocialConnectionInstance>
)

class SocialConnectionInstancesParam {


    fun build(): SocialConnectionInstancesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            socialConnectionInstancesDocument,
            this
        );
    }

    private val socialConnectionInstancesDocument: String = """
query socialConnectionInstances {
  socialConnectionInstances {
    provider
    enabled
    fields {
      key
      value
    }
  }
}
"""
}


data class SocialConnectionsResponse(

    @SerializedName("socialConnections")
    val result: List<SocialConnection>
)

class SocialConnectionsParam {


    fun build(): SocialConnectionsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            socialConnectionsDocument,
            this
        );
    }

    private val socialConnectionsDocument: String = """
query socialConnections {
  socialConnections {
    provider
    name
    logo
    description
    fields {
      key
      label
      type
      placeholder
    }
  }
}
"""
}


data class TemplateCodeResponse(

    @SerializedName("templateCode")
    val result: String
)

class TemplateCodeParam {


    fun build(): TemplateCodeParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            templateCodeDocument,
            this
        );
    }

    private val templateCodeDocument: String = """
query templateCode {
  templateCode
}
"""
}


data class UdfResponse(

    @SerializedName("udf")
    val result: List<UserDefinedField>
)

class UdfParam @JvmOverloads constructor(
    @SerializedName("targetType")
    var targetType: UdfTargetType
) {


    fun build(): UdfParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            udfDocument,
            this
        );
    }

    private val udfDocument: String = """
query udf(${'$'}targetType: UDFTargetType!) {
  udf(targetType: ${'$'}targetType) {
    targetType
    dataType
    key
    label
    options
  }
}
"""
}


data class UdvResponse(

    @SerializedName("udv")
    val result: List<UserDefinedData>
)

class UdvParam @JvmOverloads constructor(
    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("targetId")
    var targetId: String
) {


    fun build(): UdvParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            udvDocument,
            this
        );
    }

    private val udvDocument: String = """
query udv(${'$'}targetType: UDFTargetType!, ${'$'}targetId: String!) {
  udv(targetType: ${'$'}targetType, targetId: ${'$'}targetId) {
    key
    dataType
    value
  }
}
"""
}


data class UserResponse(

    @SerializedName("user")
    val result: User
)

class UserParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String? = null
) {

    fun withId(id: String?): UserParam {
        this.id = id
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
query user(${'$'}id: String) {
  user(id: ${'$'}id) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}


data class UserBatchResponse(

    @SerializedName("userBatch")
    val result: List<User>
)

class UserBatchParam @JvmOverloads constructor(
    @SerializedName("ids")
    var ids: List<String>
) {


    fun build(): UserBatchParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            userBatchDocument,
            this
        );
    }

    private val userBatchDocument: String = """
query userBatch(${'$'}ids: [String!]!) {
  userBatch(ids: ${'$'}ids) {
    id
    arn
    userPoolId
    username
    email
    emailVerified
    phone
    phoneVerified
    unionid
    openid
    nickname
    registerSource
    photo
    password
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
    browser
    company
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
    city
    province
    country
    createdAt
    updatedAt
    externalId
  }
}
"""
}

data class UserpoolTypesResponse(

    @SerializedName("userpoolTypes")
    val result: List<UserPoolType>
)

class UserpoolTypesParam {


    fun build(): UserpoolTypesParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            userpoolTypesDocument,
            this
        );
    }

    private val userpoolTypesDocument: String = """
query userpoolTypes {
  userpoolTypes {
    code
    name
    description
    image
    sdks
  }
}
"""
}


data class UserpoolsResponse(

    @SerializedName("userpools")
    val result: PaginatedUserpool
)

class UserpoolsParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null
) {

    fun withPage(page: Int?): UserpoolsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): UserpoolsParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): UserpoolsParam {
        this.sortBy = sortBy
        return this
    }

    fun build(): UserpoolsParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            userpoolsDocument,
            this
        );
    }

    private val userpoolsDocument: String = """
query userpools(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  userpools(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
    totalCount
    list {
      id
      name
      domain
      description
      secret
      jwtSecret
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
    }
  }
}
"""
}


data class UsersResponse(

    @SerializedName("users")
    val result: PaginatedUsers
)

class UsersParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null
) {

    fun withPage(page: Int?): UsersParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int?): UsersParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum?): UsersParam {
        this.sortBy = sortBy
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
query users(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
    totalCount
    list {
      id
      arn
      userPoolId
      username
      email
      emailVerified
      phone
      phoneVerified
      unionid
      openid
      nickname
      registerSource
      photo
      password
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
      browser
      company
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
      city
      province
      country
      createdAt
      updatedAt
      externalId
    }
  }
}
"""
}