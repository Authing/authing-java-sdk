package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
import com.google.gson.annotations.SerializedName



data class Query(
    /** @param [isActionAllowed] isActionAllowed */
    @SerializedName("isActionAllowed")
    var isActionAllowed: Boolean,
    /** @param [isActionDenied] isActionDenied */
    @SerializedName("isActionDenied")
    var isActionDenied: Boolean,
    /** @param [authorizedTargets] authorizedTargets */
    @SerializedName("authorizedTargets")
    var authorizedTargets: PaginatedAuthorizedTargets? = null,
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
    /** @param [searchNodes] searchNodes */
    @SerializedName("searchNodes")
    var searchNodes: List<Node>,
    /** @param [checkPasswordStrength] checkPasswordStrength */
    @SerializedName("checkPasswordStrength")
    var checkPasswordStrength: CheckPasswordStrengthResult,
    /** @param [policy] policy */
    @SerializedName("policy")
    var policy: Policy? = null,
    /** @param [policies] policies */
    @SerializedName("policies")
    var policies: PaginatedPolicies,
    /** @param [policyAssignments] policyAssignments */
    @SerializedName("policyAssignments")
    var policyAssignments: PaginatedPolicyAssignments,
    /** @param [authorizedResources] 获取一个对象被授权的资源列表 */
    @SerializedName("authorizedResources")
    var authorizedResources: PaginatedAuthorizedResources? = null,
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
    /** @param [udfValueBatch] 批量查询多个对象的自定义数据 */
    @SerializedName("udfValueBatch")
    var udfValueBatch: List<UserDefinedDataMap>,
    /** @param [user] user */
    @SerializedName("user")
    var user: User? = null,
    /** @param [userBatch] userBatch */
    @SerializedName("userBatch")
    var userBatch: List<User>,
    /** @param [users] users */
    @SerializedName("users")
    var users: PaginatedUsers,
    /** @param [archivedUsers] 已归档的用户列表 */
    @SerializedName("archivedUsers")
    var archivedUsers: PaginatedUsers,
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

enum class ResourceType(val label: String) {
      DATA("DATA"),
      API("API"),
      MENU("MENU"),
      UI("UI"),
      BUTTON("BUTTON");

  companion object {
    @JvmStatic
    fun valueOfLabel(label: String): ResourceType? {
      return values().find { it.label == label }
    }
  }
}

enum class ExtIdpListTypeEnum (val label: String){
    SOCIAL("social"),
    ENTERPRISE("enterprise");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): PolicyAssignmentTargetType? {
            return PolicyAssignmentTargetType.values().find { it.label == label }
        }
    }
}

enum class PolicyAssignmentTargetType(val label: String) {
      USER("USER"),
      ROLE("ROLE"),
      GROUP("GROUP"),
      ORG("ORG"),
      AK_SK("AK_SK");

  companion object {
    @JvmStatic
    fun valueOfLabel(label: String): PolicyAssignmentTargetType? {
      return values().find { it.label == label }
    }
  }
}



data class AuthorizedTargetsActionsInput @JvmOverloads constructor (
    /** @param [op] op */
    @SerializedName("op")
    var op: Operator,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<String>
) {


  fun build(): AuthorizedTargetsActionsInput {
    return this
  }
}

enum class Operator(val label: String) {
      AND("AND"),
      OR("OR");

  companion object {
    @JvmStatic
    fun valueOfLabel(label: String): Operator? {
      return values().find { it.label == label }
    }
  }
}



data class PaginatedAuthorizedTargets(
    /** @param [list] list */
    @SerializedName("list")
    var list: List<ResourcePermissionAssignment>? = null,
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int? = null
)



data class ResourcePermissionAssignment(
    /** @param [targetType] targetType */
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType? = null,
    /** @param [targetIdentifier] targetIdentifier */
    @SerializedName("targetIdentifier")
    var targetIdentifier: String? = null,
    /** @param [actions] actions */
    @SerializedName("actions")
    var actions: List<String>? = null
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



data class Group(
    /** @param [code] 唯一标志 code */
    @SerializedName("code")
    var code: String,
    /** @param [name] 名称 */
    @SerializedName("name")
    var name: String,
    /** @param [description] 描述 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [createdAt] 创建时间 */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] 修改时间 */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [users] 包含的用户列表 */
    @SerializedName("users")
    var users: PaginatedUsers,
    /** @param [authorizedResources] 被授权访问的所有资源 */
    @SerializedName("authorizedResources")
    var authorizedResources: PaginatedAuthorizedResources? = null
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
    /** @param [status] 用户在组织机构中的状态 */
    @SerializedName("status")
    var status: UserStatus? = null,
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
    var registerSource: List<String>? = null,
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
    /** @param [roles] 用户所在的角色列表 */
    @SerializedName("roles")
    var roles: PaginatedRoles? = null,
    /** @param [groups] 用户所在的分组列表 */
    @SerializedName("groups")
    var groups: PaginatedGroups? = null,
    /** @param [departments] 用户所在的部门列表 */
    @SerializedName("departments")
    var departments: PaginatedDepartments? = null,
    /** @param [authorizedResources] 被授权访问的所有资源 */
    @SerializedName("authorizedResources")
    var authorizedResources: PaginatedAuthorizedResources? = null,
    /** @param [externalId] 用户外部 ID */
    @SerializedName("externalId")
    var externalId: String? = null,

    @SerializedName("secondaryUserIds")
    var secondaryUserIds: List<String>? = null,
    /** @param [customData] 用户自定义数据 */
    @SerializedName("customData")
    var customData: List<UserCustomData>? = null
)

enum class UserStatus(val label: String) {
      Suspended("Suspended"),
      Resigned("Resigned"),
      Activated("Activated"),
      Archived("Archived");

  companion object {
    @JvmStatic
    fun valueOfLabel(label: String): UserStatus? {
      return values().find { it.label == label }
    }
  }
}



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
    var userPoolId: String? = null,
    /** @param [refreshToken] refreshToken */
    @SerializedName("refreshToken")
    var refreshToken: String? = null,
    /** @param [accessToken] accessToken */
    @SerializedName("accessToken")
    var accessToken: String? = null,
    @SerializedName("extIdpId")
    var extIdpId: String? = null,
    @SerializedName("type")
    var type: String? = null,
    @SerializedName("userInfoInIdp")
    var userInfoInIdp: User? = null,
    @SerializedName("syncIdentityProviderId")
    var syncIdentityProviderId: Number? = null

)



data class PaginatedRoles(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<Role>
)



data class Role(
    /** @param [id] id */
    @SerializedName("id")
    var id: String,
    /** @param [namespace] 权限组 code */
    @SerializedName("namespace")
    var namespace: String,
    /** @param [code] 唯一标志 code */
    @SerializedName("code")
    var code: String,
    /** @param [arn] 资源描述符 arn */
    @SerializedName("arn")
    var arn: String,
    /** @param [description] 角色描述 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [isSystem] 是否为系统内建，系统内建的角色不能删除 */
    @SerializedName("isSystem")
    var isSystem: Boolean? = null,
    /** @param [createdAt] 创建时间 */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] 修改时间 */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [users] 被授予此角色的用户列表 */
    @SerializedName("users")
    var users: PaginatedUsers,
    /** @param [authorizedResources] 被授权访问的所有资源 */
    @SerializedName("authorizedResources")
    var authorizedResources: PaginatedAuthorizedResources? = null,
    /** @param [parent] 父角色 */
    @SerializedName("parent")
    var parent: Role? = null
)



data class PaginatedAuthorizedResources(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<AuthorizedResource>
)



data class AuthorizedResource(
    /** @param [code] code */
    @SerializedName("code")
    var code: String,
    /** @param [type] type */
    @SerializedName("type")
    var type: ResourceType? = null,
    /** @param [actions] actions */
    @SerializedName("actions")
    var actions: List<String>? = null,
    /** @param [apiIdentifier] apiIdentifier */
    @SerializedName("apiIdentifier")
    var apiIdentifier: String
)



data class PaginatedGroups(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<Group>
)



data class PaginatedDepartments(
    /** @param [list] list */
    @SerializedName("list")
    var list: List<UserDepartment>,
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int
)



data class UserDepartment(
    /** @param [department] department */
    @SerializedName("department")
    var department: Node,
    /** @param [isMainDepartment] 是否为主部门 */
    @SerializedName("isMainDepartment")
    var isMainDepartment: Boolean,
    /** @param [joinedAt] 加入该部门的时间 */
    @SerializedName("joinedAt")
    var joinedAt: String? = null
)




data class Node(
    /** @param [id] id */
    @SerializedName("id")
    var id: String,
    /** @param [orgId] 组织机构 ID */
    @SerializedName("orgId")
    var orgId: String? = null,
    /** @param [name] 节点名称 */
    @SerializedName("name")
    var name: String,
    /** @param [nameI18n] 多语言名称，**key** 为标准 **i18n** 语言编码，**value** 为对应语言的名称。 */
    /** @param [description] 描述信息 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [descriptionI18n] 多语言描述信息 */
    @SerializedName("descriptionI18n")
    var descriptionI18n: String? = null,
    /** @param [order] 在父节点中的次序值。**order** 值大的排序靠前。有效的值范围是[0, 2^32) */
    @SerializedName("order")
    var order: Int? = null,
    /** @param [code] 节点唯一标志码，可以通过 code 进行搜索 */
    @SerializedName("code")
    var code: String? = null,
    /** @param [root] 是否为根节点 */
    @SerializedName("root")
    var root: Boolean? = null,
    /** @param [depth] 距离父节点的深度（如果是查询整棵树，返回的 **depth** 为距离根节点的深度，如果是查询某个节点的子节点，返回的 **depth** 指的是距离该节点的深度。） */
    @SerializedName("depth")
    var depth: Int? = null,
    /** @param [leaderUserId] 部门管理者 ID */
    @SerializedName("leaderUserId")
    var leaderUserId: String? = null,
    /** @param [path] path */
    @SerializedName("path")
    var path: List<String>,
    /** @param [codePath] codePath */
    @SerializedName("codePath")
    var codePath: List<String>,
    /** @param [namePath] namePath */
    @SerializedName("namePath")
    var namePath: List<String>,
    /** @param [createdAt] createdAt */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] updatedAt */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [children] 该节点的子节点 **ID** 列表 */
    @SerializedName("children")
    var children: List<String>? = null,
    /** @param [users] 节点的用户列表 */
    @SerializedName("users")
    var users: PaginatedUsers,
    /** @param [authorizedResources] 被授权访问的所有资源 */
    @SerializedName("authorizedResources")
    var authorizedResources: PaginatedAuthorizedResources? = null
)



data class UserCustomData(
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [value] value */
    @SerializedName("value")
    var value: String? = null,
    /** @param [label] label */
    @SerializedName("label")
    var label: String? = null,
    /** @param [dataType] dataType */
    @SerializedName("dataType")
    var dataType: UdfDataType
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



data class Org(
    /** @param [id] 组织机构 ID */
    @SerializedName("id")
    var id: String,
    /** @param [rootNode] 根节点 */
    @SerializedName("rootNode")
    var rootNode: Node,
    /** @param [nodes] 组织机构节点列表 */
    @SerializedName("nodes")
    var nodes: List<Node>
)



data class PaginatedOrgs(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<Org>
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
    /** @param [namespace] 权限组 code */
    @SerializedName("namespace")
    var namespace: String,
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
    var effect: PolicyEffect? = null,
    /** @param [condition] condition */
    @SerializedName("condition")
    var condition: List<PolicyStatementCondition>? = null
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



data class PolicyStatementCondition(
    /** @param [param] param */
    @SerializedName("param")
    var param: String,
    /** @param [operator] operator */
    @SerializedName("operator")
    var operator: String,
    /** @param [value] value */
    @SerializedName("value")
    var value: Any
)



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
    var value: String,
    /** @param [label] label */
    @SerializedName("label")
    var label: String? = null
)



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
    var label: String? = null,
    /** @param [options] options */
    @SerializedName("options")
    var options: String? = null
)



data class UserDefinedDataMap(
    /** @param [targetId] targetId */
    @SerializedName("targetId")
    var targetId: String,
    /** @param [data] data */
    @SerializedName("data")
    var data: List<UserDefinedData>
)



data class SearchUserDepartmentOptInput @JvmOverloads constructor (
    /** @param [departmentId] departmentId */
    @SerializedName("departmentId")
    var departmentId: String? = null,
    /** @param [includeChildrenDepartments] includeChildrenDepartments */
    @SerializedName("includeChildrenDepartments")
    var includeChildrenDepartments: Boolean? = null
) {

              /** @param [departmentId] departmentId */
    fun withDepartmentId(departmentId: String): SearchUserDepartmentOptInput {
      this.departmentId = departmentId
      return this
    }

              /** @param [includeChildrenDepartments] includeChildrenDepartments */
    fun withIncludeChildrenDepartments(includeChildrenDepartments: Boolean): SearchUserDepartmentOptInput {
      this.includeChildrenDepartments = includeChildrenDepartments
      return this
    }

  fun build(): SearchUserDepartmentOptInput {
    return this
  }
}



data class SearchUserGroupOptInput @JvmOverloads constructor (
    /** @param [code] code */
    @SerializedName("code")
    var code: String? = null
) {

              /** @param [code] code */
    fun withCode(code: String): SearchUserGroupOptInput {
      this.code = code
      return this
    }

  fun build(): SearchUserGroupOptInput {
    return this
  }
}



data class SearchUserRoleOptInput @JvmOverloads constructor (
    /** @param [namespace] namespace */
    @SerializedName("namespace")
    var namespace: String? = null,
    /** @param [code] code */
    @SerializedName("code")
    var code: String
) {

              /** @param [namespace] namespace */
    fun withNamespace(namespace: String): SearchUserRoleOptInput {
      this.namespace = namespace
      return this
    }

  fun build(): SearchUserRoleOptInput {
    return this
  }
}



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
    /** @param [ownerId] ownerId */
    @SerializedName("ownerId")
    var ownerId: String? = null,
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
    /** @param [appSsoEnabled] 是否开启用户池下应用间单点登录 */
    @SerializedName("appSsoEnabled")
    var appSsoEnabled: Boolean,
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
    var customSMSProvider: CustomSmsProvider? = null,
    /** @param [packageType] 用户池套餐类型 */
    @SerializedName("packageType")
    var packageType: Int? = null,
    /** @param [useCustomUserStore] 是否使用自定义数据库 CUSTOM_USER_STORE 模式 */
    @SerializedName("useCustomUserStore")
    var useCustomUserStore: Boolean? = null,
    /** @param [loginRequireEmailVerified] 是否要求邮箱必须验证才能登录（如果是通过邮箱登录的话） */
    @SerializedName("loginRequireEmailVerified")
    var loginRequireEmailVerified: Boolean? = null,
    /** @param [verifyCodeLength] 短信验证码长度 */
    @SerializedName("verifyCodeLength")
    var verifyCodeLength: Int? = null
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
    /** @param [config] config */
    @SerializedName("config")
    var config: String? = null
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

enum class WhitelistType(val label: String) {
      USERNAME("USERNAME"),
      EMAIL("EMAIL"),
      PHONE("PHONE");

  companion object {
    @JvmStatic
    fun valueOfLabel(label: String): WhitelistType? {
      return values().find { it.label == label }
    }
  }
}



data class WhiteList(
    /** @param [createdAt] createdAt */
    @SerializedName("createdAt")
    var createdAt: String? = null,
    /** @param [updatedAt] updatedAt */
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    /** @param [value] value */
    @SerializedName("value")
    var value: String
)



data class Mutation(
    /** @param [allow] 允许操作某个资源 */
    @SerializedName("allow")
    var allow: CommonMessage,
    /** @param [authorizeResource] 将一个（类）资源授权给用户、角色、分组、组织机构，且可以分别指定不同的操作权限。 */
    @SerializedName("authorizeResource")
    var authorizeResource: CommonMessage,
    /** @param [createSocialConnectionInstance] 配置社会化登录 */
    @SerializedName("createSocialConnectionInstance")
    var createSocialConnectionInstance: SocialConnectionInstance,
    /** @param [enableSocialConnectionInstance] 开启社会化登录 */
    @SerializedName("enableSocialConnectionInstance")
    var enableSocialConnectionInstance: SocialConnectionInstance,
    /** @param [disableSocialConnectionInstance] 关闭社会化登录 */
    @SerializedName("disableSocialConnectionInstance")
    var disableSocialConnectionInstance: SocialConnectionInstance,
    /** @param [setMainDepartment] 设置用户在某个组织机构内所在的主部门 */
    @SerializedName("setMainDepartment")
    var setMainDepartment: CommonMessage,
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
    /** @param [addNodeV2] 添加子节点 */
    @SerializedName("addNodeV2")
    var addNodeV2: Node,
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
    /** @param [enablePolicyAssignment] 开启授权 */
    @SerializedName("enablePolicyAssignment")
    var enablePolicyAssignment: CommonMessage,
    /** @param [disbalePolicyAssignment] 开启授权 */
    @SerializedName("disbalePolicyAssignment")
    var disbalePolicyAssignment: CommonMessage,
    /** @param [removePolicyAssignments] removePolicyAssignments */
    @SerializedName("removePolicyAssignments")
    var removePolicyAssignments: CommonMessage,
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
    /** @param [loginBySubAccount] 使用子账号登录 */
    @SerializedName("loginBySubAccount")
    var loginBySubAccount: User,
    /** @param [setUdf] setUdf */
    @SerializedName("setUdf")
    var setUdf: UserDefinedField,
    /** @param [removeUdf] removeUdf */
    @SerializedName("removeUdf")
    var removeUdf: CommonMessage? = null,
    /** @param [setUdv] setUdv */
    @SerializedName("setUdv")
    var setUdv: List<UserDefinedData>? = null,
    /** @param [setUdfValueBatch] setUdfValueBatch */
    @SerializedName("setUdfValueBatch")
    var setUdfValueBatch: CommonMessage? = null,
    /** @param [removeUdv] removeUdv */
    @SerializedName("removeUdv")
    var removeUdv: List<UserDefinedData>? = null,
    /** @param [setUdvBatch] setUdvBatch */
    @SerializedName("setUdvBatch")
    var setUdvBatch: List<UserDefinedData>? = null,
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
    /** @param [bindEmail] 绑定邮箱 */
    @SerializedName("bindEmail")
    var bindEmail: User,
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



data class CommonMessage(
    /** @param [message] 可读的接口响应说明，请以业务状态码 code 作为判断业务是否成功的标志 */
    @SerializedName("message")
    var message: String? = null,
    /** @param [code] 业务状态码（与 HTTP 响应码不同），但且仅当为 200 的时候表示操作成功表示，详细说明请见：
    [Authing 错误代码列表](https://docs.authing.co/advanced/error-code.html) */
    @SerializedName("code")
    var code: Int? = null
)



data class AuthorizeResourceOptInput @JvmOverloads constructor (
    /** @param [targetType] targetType */
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    /** @param [targetIdentifier] targetIdentifier */
    @SerializedName("targetIdentifier")
    var targetIdentifier: String,
    /** @param [actions] actions */
    @SerializedName("actions")
    var actions: List<String>? = null
) {

              /** @param [actions] actions */
    fun withActions(actions: List<String>): AuthorizeResourceOptInput {
      this.actions = actions
      return this
    }

  fun build(): AuthorizeResourceOptInput {
    return this
  }
}



data class CreateSocialConnectionInstanceInput @JvmOverloads constructor (
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



data class CreateSocialConnectionInstanceFieldInput @JvmOverloads constructor (
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



data class ConfigEmailTemplateInput @JvmOverloads constructor (
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
      CHANGE_EMAIL("CHANGE_EMAIL"),
      MFA_VERIFY("MFA_VERIFY");

  companion object {
    @JvmStatic
    fun valueOfLabel(label: String): EmailScene? {
      return values().find { it.label == label }
    }
  }
}



data class CreateFunctionInput @JvmOverloads constructor (
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



data class UpdateFunctionInput @JvmOverloads constructor (
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



data class LoginByEmailInput @JvmOverloads constructor (
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
    var clientIp: String? = null,
    /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    @SerializedName("params")
    var params: String? = null,
    /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    @SerializedName("context")
    var context: String? = null
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

              /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    fun withParams(params: String): LoginByEmailInput {
      this.params = params
      return this
    }

              /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    fun withContext(context: String): LoginByEmailInput {
      this.context = context
      return this
    }

  fun build(): LoginByEmailInput {
    return this
  }
}



data class LoginByUsernameInput @JvmOverloads constructor (
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
    var clientIp: String? = null,
    /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    @SerializedName("params")
    var params: String? = null,
    /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    @SerializedName("context")
    var context: String? = null
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

              /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    fun withParams(params: String): LoginByUsernameInput {
      this.params = params
      return this
    }

              /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    fun withContext(context: String): LoginByUsernameInput {
      this.context = context
      return this
    }

  fun build(): LoginByUsernameInput {
    return this
  }
}



data class LoginByPhoneCodeInput @JvmOverloads constructor (
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
    var clientIp: String? = null,
    /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    @SerializedName("params")
    var params: String? = null,
    /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    @SerializedName("context")
    var context: String? = null
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

              /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    fun withParams(params: String): LoginByPhoneCodeInput {
      this.params = params
      return this
    }

              /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    fun withContext(context: String): LoginByPhoneCodeInput {
      this.context = context
      return this
    }

  fun build(): LoginByPhoneCodeInput {
    return this
  }
}



data class LoginByPhonePasswordInput @JvmOverloads constructor (
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
    var clientIp: String? = null,
    /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    @SerializedName("params")
    var params: String? = null,
    /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    @SerializedName("context")
    var context: String? = null
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

              /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    fun withParams(params: String): LoginByPhonePasswordInput {
      this.params = params
      return this
    }

              /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    fun withContext(context: String): LoginByPhonePasswordInput {
      this.context = context
      return this
    }

  fun build(): LoginByPhonePasswordInput {
    return this
  }
}



data class PolicyStatementInput @JvmOverloads constructor (
    /** @param [resource] resource */
    @SerializedName("resource")
    var resource: String,
    /** @param [actions] actions */
    @SerializedName("actions")
    var actions: List<String>,
    /** @param [effect] effect */
    @SerializedName("effect")
    var effect: PolicyEffect? = null,
    /** @param [condition] condition */
    @SerializedName("condition")
    var condition: List<PolicyStatementConditionInput>? = null
) {

              /** @param [effect] effect */
    fun withEffect(effect: PolicyEffect): PolicyStatementInput {
      this.effect = effect
      return this
    }

              /** @param [condition] condition */
    fun withCondition(condition: List<PolicyStatementConditionInput>): PolicyStatementInput {
      this.condition = condition
      return this
    }

  fun build(): PolicyStatementInput {
    return this
  }
}



data class PolicyStatementConditionInput @JvmOverloads constructor (
    /** @param [param] param */
    @SerializedName("param")
    var param: String,
    /** @param [operator] operator */
    @SerializedName("operator")
    var operator: String,
    /** @param [value] value */
    @SerializedName("value")
    var value: Any
) {


  fun build(): PolicyStatementConditionInput {
    return this
  }
}



data class RegisterByUsernameInput @JvmOverloads constructor (
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
    var clientIp: String? = null,
    /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    @SerializedName("params")
    var params: String? = null,
    /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    @SerializedName("context")
    var context: String? = null
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

              /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    fun withParams(params: String): RegisterByUsernameInput {
      this.params = params
      return this
    }

              /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    fun withContext(context: String): RegisterByUsernameInput {
      this.context = context
      return this
    }

  fun build(): RegisterByUsernameInput {
    return this
  }
}



data class RegisterProfileInput @JvmOverloads constructor (
    /** @param [ip] ip */
    @SerializedName("ip")
    var ip: String? = null,
    /** @param [oauth] oauth */
    @SerializedName("oauth")
    var oauth: String? = null,
    /** @param [username] username */
    @SerializedName("username")
    var username: String? = null,
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

              /** @param [username] username */
    fun withUsername(username: String): RegisterProfileInput {
      this.username = username
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



data class UserDdfInput @JvmOverloads constructor (
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



data class RegisterByEmailInput @JvmOverloads constructor (
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
    var clientIp: String? = null,
    /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    @SerializedName("params")
    var params: String? = null,
    /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    @SerializedName("context")
    var context: String? = null
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

              /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    fun withParams(params: String): RegisterByEmailInput {
      this.params = params
      return this
    }

              /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    fun withContext(context: String): RegisterByEmailInput {
      this.context = context
      return this
    }

  fun build(): RegisterByEmailInput {
    return this
  }
}



data class RegisterByPhoneCodeInput @JvmOverloads constructor (
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
    var clientIp: String? = null,
    /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    @SerializedName("params")
    var params: String? = null,
    /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    @SerializedName("context")
    var context: String? = null
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

              /** @param [params] 设置用户自定义字段，要求符合 Array<{ key: string; value: string }> 格式 */
    fun withParams(params: String): RegisterByPhoneCodeInput {
      this.params = params
      return this
    }

              /** @param [context] 请求上下文信息，将会传递到 pipeline 中 */
    fun withContext(context: String): RegisterByPhoneCodeInput {
      this.context = context
      return this
    }

  fun build(): RegisterByPhoneCodeInput {
    return this
  }
}



data class SetUdfValueBatchInput @JvmOverloads constructor (
    /** @param [targetId] targetId */
    @SerializedName("targetId")
    var targetId: String,
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [value] value */
    @SerializedName("value")
    var value: String
) {


  fun build(): SetUdfValueBatchInput {
    return this
  }
}



data class UserDefinedDataInput @JvmOverloads constructor (
    /** @param [key] key */
    @SerializedName("key")
    var key: String,
    /** @param [value] value */
    @SerializedName("value")
    var value: String? = null
) {

              /** @param [value] value */
    fun withValue(value: String): UserDefinedDataInput {
      this.value = value
      return this
    }

  fun build(): UserDefinedDataInput {
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



data class CreateUserInput @JvmOverloads constructor (
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
    var country: String? = null,
    /** @param [externalId] externalId */
    @SerializedName("externalId")
    var externalId: String? = null
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

              /** @param [externalId] externalId */
    fun withExternalId(externalId: String): CreateUserInput {
      this.externalId = externalId
      return this
    }

  fun build(): CreateUserInput {
    return this
  }
}



data class UpdateUserInput @JvmOverloads constructor (
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
    var country: String? = null,
    /** @param [externalId] externalId */
    @SerializedName("externalId")
    var externalId: String? = null
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

              /** @param [externalId] externalId */
    fun withExternalId(externalId: String): UpdateUserInput {
      this.externalId = externalId
      return this
    }

  fun build(): UpdateUserInput {
    return this
  }
}



data class UpdateUserpoolInput @JvmOverloads constructor (
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
    /** @param [appSsoEnabled] appSsoEnabled */
    @SerializedName("appSsoEnabled")
    var appSsoEnabled: Boolean? = null,
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
    var customSMSProvider: CustomSmsProviderInput? = null,
    /** @param [loginRequireEmailVerified] 是否要求邮箱必须验证才能登录（如果是通过邮箱登录的话） */
    @SerializedName("loginRequireEmailVerified")
    var loginRequireEmailVerified: Boolean? = null,
    /** @param [verifyCodeLength] verifyCodeLength */
    @SerializedName("verifyCodeLength")
    var verifyCodeLength: Int? = null
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

              /** @param [appSsoEnabled] appSsoEnabled */
    fun withAppSsoEnabled(appSsoEnabled: Boolean): UpdateUserpoolInput {
      this.appSsoEnabled = appSsoEnabled
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

              /** @param [loginRequireEmailVerified] 是否要求邮箱必须验证才能登录（如果是通过邮箱登录的话） */
    fun withLoginRequireEmailVerified(loginRequireEmailVerified: Boolean): UpdateUserpoolInput {
      this.loginRequireEmailVerified = loginRequireEmailVerified
      return this
    }

              /** @param [verifyCodeLength] verifyCodeLength */
    fun withVerifyCodeLength(verifyCodeLength: Int): UpdateUserpoolInput {
      this.verifyCodeLength = verifyCodeLength
      return this
    }

  fun build(): UpdateUserpoolInput {
    return this
  }
}



data class FrequentRegisterCheckConfigInput @JvmOverloads constructor (
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



data class LoginFailCheckConfigInput @JvmOverloads constructor (
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



data class ChangePhoneStrategyInput @JvmOverloads constructor (
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



data class ChangeEmailStrategyInput @JvmOverloads constructor (
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



data class QrcodeLoginStrategyInput @JvmOverloads constructor (
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



data class App2WxappLoginStrategyInput @JvmOverloads constructor (
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



data class RegisterWhiteListConfigInput @JvmOverloads constructor (
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



data class CustomSmsProviderInput @JvmOverloads constructor (
    /** @param [enabled] enabled */
    @SerializedName("enabled")
    var enabled: Boolean? = null,
    /** @param [provider] provider */
    @SerializedName("provider")
    var provider: String? = null,
    /** @param [config] config */
    @SerializedName("config")
    var config: String? = null
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

              /** @param [config] config */
    fun withConfig(config: String): CustomSmsProviderInput {
      this.config = config
      return this
    }

  fun build(): CustomSmsProviderInput {
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



data class SocialConnectionFieldInput @JvmOverloads constructor (
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



data class CreateSocialConnectionInput @JvmOverloads constructor (
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


    data class AddMemberResponse (

        @SerializedName("addMember")
        val result: Node
    )

    class AddMemberParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("nodeId")
    var nodeId: String? = null,
    @SerializedName("orgId")
    var orgId: String? = null,
    @SerializedName("nodeCode")
    var nodeCode: String? = null,
    @SerializedName("userIds")
    var userIds: List<String>,
    @SerializedName("isLeader")
    var isLeader: Boolean? = null)  {

    fun withPage(page: Int?): AddMemberParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): AddMemberParam {
      this.limit = limit
      return this
    }

    fun withSortBy(sortBy: SortByEnum?): AddMemberParam {
      this.sortBy = sortBy
      return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): AddMemberParam {
      this.includeChildrenNodes = includeChildrenNodes
      return this
    }

    fun withNodeId(nodeId: String?): AddMemberParam {
      this.nodeId = nodeId
      return this
    }

    fun withOrgId(orgId: String?): AddMemberParam {
      this.orgId = orgId
      return this
    }

    fun withNodeCode(nodeCode: String?): AddMemberParam {
      this.nodeCode = nodeCode
      return this
    }

    fun withIsLeader(isLeader: Boolean?): AddMemberParam {
      this.isLeader = isLeader
      return this
    }

      fun build(): AddMemberParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          addMemberDocument,
          this
        );
      }

      private val addMemberDocument: String = """
mutation addMember(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}nodeId: String, ${'$'}orgId: String, ${'$'}nodeCode: String, ${'$'}userIds: [String!]!, ${'$'}isLeader: Boolean) {
  addMember(nodeId: ${'$'}nodeId, orgId: ${'$'}orgId, nodeCode: ${'$'}nodeCode, userIds: ${'$'}userIds, isLeader: ${'$'}isLeader) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
      list {
        id
        arn
        userPoolId
        username
        status
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



    data class AddNodeResponse (

        @SerializedName("addNode")
        val result: Org
    )

    class AddNodeParam @JvmOverloads constructor (    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("parentNodeId")
    var parentNodeId: String? = null,
    @SerializedName("name")
    var name: String,
    @SerializedName("nameI18n")
    var nameI18n: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("descriptionI18n")
    var descriptionI18n: String? = null,
    @SerializedName("order")
    var order: Int? = null,
    @SerializedName("code")
    var code: String? = null)  {

    fun withParentNodeId(parentNodeId: String?): AddNodeParam {
      this.parentNodeId = parentNodeId
      return this
    }

    fun withNameI18n(nameI18n: String?): AddNodeParam {
      this.nameI18n = nameI18n
      return this
    }

    fun withDescription(description: String?): AddNodeParam {
      this.description = description
      return this
    }

    fun withDescriptionI18n(descriptionI18n: String?): AddNodeParam {
      this.descriptionI18n = descriptionI18n
      return this
    }

    fun withOrder(order: Int?): AddNodeParam {
      this.order = order
      return this
    }

    fun withCode(code: String?): AddNodeParam {
      this.code = code
      return this
    }

      fun build(): AddNodeParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          addNodeDocument,
          this
        );
      }

      private val addNodeDocument: String = """
mutation addNode(${'$'}orgId: String!, ${'$'}parentNodeId: String, ${'$'}name: String!, ${'$'}nameI18n: String, ${'$'}description: String, ${'$'}descriptionI18n: String, ${'$'}order: Int, ${'$'}code: String) {
  addNode(orgId: ${'$'}orgId, parentNodeId: ${'$'}parentNodeId, name: ${'$'}name, nameI18n: ${'$'}nameI18n, description: ${'$'}description, descriptionI18n: ${'$'}descriptionI18n, order: ${'$'}order, code: ${'$'}code) {
    id
    rootNode {
      id
      orgId
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
    nodes {
      id
      orgId
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
  }
}
"""
    }



    data class AddNodeV2Response (

        @SerializedName("addNodeV2")
        val result: Node
    )

    class AddNodeV2Param @JvmOverloads constructor (    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("parentNodeId")
    var parentNodeId: String? = null,
    @SerializedName("name")
    var name: String,
    @SerializedName("nameI18n")
    var nameI18n: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("descriptionI18n")
    var descriptionI18n: String? = null,
    @SerializedName("order")
    var order: Int? = null,
    @SerializedName("code")
    var code: String? = null)  {

    fun withParentNodeId(parentNodeId: String?): AddNodeV2Param {
      this.parentNodeId = parentNodeId
      return this
    }

    fun withNameI18n(nameI18n: String?): AddNodeV2Param {
      this.nameI18n = nameI18n
      return this
    }

    fun withDescription(description: String?): AddNodeV2Param {
      this.description = description
      return this
    }

    fun withDescriptionI18n(descriptionI18n: String?): AddNodeV2Param {
      this.descriptionI18n = descriptionI18n
      return this
    }

    fun withOrder(order: Int?): AddNodeV2Param {
      this.order = order
      return this
    }

    fun withCode(code: String?): AddNodeV2Param {
      this.code = code
      return this
    }

      fun build(): AddNodeV2Param {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          addNodeV2Document,
          this
        );
      }

      private val addNodeV2Document: String = """
mutation addNodeV2(${'$'}orgId: String!, ${'$'}parentNodeId: String, ${'$'}name: String!, ${'$'}nameI18n: String, ${'$'}description: String, ${'$'}descriptionI18n: String, ${'$'}order: Int, ${'$'}code: String) {
  addNodeV2(orgId: ${'$'}orgId, parentNodeId: ${'$'}parentNodeId, name: ${'$'}name, nameI18n: ${'$'}nameI18n, description: ${'$'}description, descriptionI18n: ${'$'}descriptionI18n, order: ${'$'}order, code: ${'$'}code) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
  }
}
"""
    }



    data class AddPolicyAssignmentsResponse (

        @SerializedName("addPolicyAssignments")
        val result: CommonMessage
    )

    class AddPolicyAssignmentsParam @JvmOverloads constructor (    @SerializedName("policies")
    var policies: List<String>,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    @SerializedName("targetIdentifiers")
    var targetIdentifiers: List<String>? = null,
    @SerializedName("inheritByChildren")
    var inheritByChildren: Boolean? = null,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withTargetIdentifiers(targetIdentifiers: List<String>?): AddPolicyAssignmentsParam {
      this.targetIdentifiers = targetIdentifiers
      return this
    }

    fun withInheritByChildren(inheritByChildren: Boolean?): AddPolicyAssignmentsParam {
      this.inheritByChildren = inheritByChildren
      return this
    }

    fun withNamespace(namespace: String?): AddPolicyAssignmentsParam {
      this.namespace = namespace
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
mutation addPolicyAssignments(${'$'}policies: [String!]!, ${'$'}targetType: PolicyAssignmentTargetType!, ${'$'}targetIdentifiers: [String!], ${'$'}inheritByChildren: Boolean, ${'$'}namespace: String) {
  addPolicyAssignments(policies: ${'$'}policies, targetType: ${'$'}targetType, targetIdentifiers: ${'$'}targetIdentifiers, inheritByChildren: ${'$'}inheritByChildren, namespace: ${'$'}namespace) {
    message
    code
  }
}
"""
    }



    data class AddUserToGroupResponse (

        @SerializedName("addUserToGroup")
        val result: CommonMessage
    )

    class AddUserToGroupParam @JvmOverloads constructor (    @SerializedName("userIds")
    var userIds: List<String>,
    @SerializedName("code")
    var code: String? = null)  {

    fun withCode(code: String?): AddUserToGroupParam {
      this.code = code
      return this
    }

      fun build(): AddUserToGroupParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          addUserToGroupDocument,
          this
        );
      }

      private val addUserToGroupDocument: String = """
mutation addUserToGroup(${'$'}userIds: [String!]!, ${'$'}code: String) {
  addUserToGroup(userIds: ${'$'}userIds, code: ${'$'}code) {
    message
    code
  }
}
"""
    }



    data class AddWhitelistResponse (

        @SerializedName("addWhitelist")
        val result: List<WhiteList>
    )

    class AddWhitelistParam @JvmOverloads constructor (    @SerializedName("type")
    var type: WhitelistType,
    @SerializedName("list")
    var list: List<String>)  {


      fun build(): AddWhitelistParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          addWhitelistDocument,
          this
        );
      }

      private val addWhitelistDocument: String = """
mutation addWhitelist(${'$'}type: WhitelistType!, ${'$'}list: [String!]!) {
  addWhitelist(type: ${'$'}type, list: ${'$'}list) {
    createdAt
    updatedAt
    value
  }
}
"""
    }



    data class AllowResponse (

        @SerializedName("allow")
        val result: CommonMessage
    )

    class AllowParam @JvmOverloads constructor (    @SerializedName("resource")
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
    var roleCodes: List<String>? = null,
    @SerializedName("namespace")
    var namespace: String? = null)  {

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

    fun withNamespace(namespace: String?): AllowParam {
      this.namespace = namespace
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
mutation allow(${'$'}resource: String!, ${'$'}action: String!, ${'$'}userId: String, ${'$'}userIds: [String!], ${'$'}roleCode: String, ${'$'}roleCodes: [String!], ${'$'}namespace: String) {
  allow(resource: ${'$'}resource, action: ${'$'}action, userId: ${'$'}userId, userIds: ${'$'}userIds, roleCode: ${'$'}roleCode, roleCodes: ${'$'}roleCodes, namespace: ${'$'}namespace) {
    message
    code
  }
}
"""
    }



    data class AssignRoleResponse (

        @SerializedName("assignRole")
        val result: CommonMessage
    )

    class AssignRoleParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("roleCode")
    var roleCode: String? = null,
    @SerializedName("roleCodes")
    var roleCodes: List<String>? = null,
    @SerializedName("userIds")
    var userIds: List<String>? = null,
    @SerializedName("groupCodes")
    var groupCodes: List<String>? = null,
    @SerializedName("nodeCodes")
    var nodeCodes: List<String>? = null)  {

    fun withNamespace(namespace: String?): AssignRoleParam {
      this.namespace = namespace
      return this
    }

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
mutation assignRole(${'$'}namespace: String, ${'$'}roleCode: String, ${'$'}roleCodes: [String], ${'$'}userIds: [String!], ${'$'}groupCodes: [String!], ${'$'}nodeCodes: [String!]) {
  assignRole(namespace: ${'$'}namespace, roleCode: ${'$'}roleCode, roleCodes: ${'$'}roleCodes, userIds: ${'$'}userIds, groupCodes: ${'$'}groupCodes, nodeCodes: ${'$'}nodeCodes) {
    message
    code
  }
}
"""
    }



    data class AuthorizeResourceResponse (

        @SerializedName("authorizeResource")
        val result: CommonMessage
    )

    class AuthorizeResourceParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("resource")
    var resource: String? = null,
    @SerializedName("resourceType")
    var resourceType: ResourceType? = null,
    @SerializedName("opts")
    var opts: List<AuthorizeResourceOptInput>? = null)  {

    fun withNamespace(namespace: String?): AuthorizeResourceParam {
      this.namespace = namespace
      return this
    }

    fun withResource(resource: String?): AuthorizeResourceParam {
      this.resource = resource
      return this
    }

    fun withResourceType(resourceType: ResourceType?): AuthorizeResourceParam {
      this.resourceType = resourceType
      return this
    }

    fun withOpts(opts: List<AuthorizeResourceOptInput>?): AuthorizeResourceParam {
      this.opts = opts
      return this
    }

      fun build(): AuthorizeResourceParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          authorizeResourceDocument,
          this
        );
      }

      private val authorizeResourceDocument: String = """
mutation authorizeResource(${'$'}namespace: String, ${'$'}resource: String, ${'$'}resourceType: ResourceType, ${'$'}opts: [AuthorizeResourceOpt]) {
  authorizeResource(namespace: ${'$'}namespace, resource: ${'$'}resource, resourceType: ${'$'}resourceType, opts: ${'$'}opts) {
    code
    message
  }
}
"""
    }



    data class BindEmailResponse (

        @SerializedName("bindEmail")
        val result: User
    )

    class BindEmailParam @JvmOverloads constructor (    @SerializedName("email")
    var email: String,
    @SerializedName("emailCode")
    var emailCode: String)  {


      fun build(): BindEmailParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          bindEmailDocument,
          this
        );
      }

      private val bindEmailDocument: String = """
mutation bindEmail(${'$'}email: String!, ${'$'}emailCode: String!) {
  bindEmail(email: ${'$'}email, emailCode: ${'$'}emailCode) {
    id
    arn
    userPoolId
    status
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



    data class BindPhoneResponse (

        @SerializedName("bindPhone")
        val result: User
    )

    class BindPhoneParam @JvmOverloads constructor (    @SerializedName("phone")
    var phone: String,
    @SerializedName("phoneCode")
    var phoneCode: String)  {


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
    status
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



    data class ChangeMfaResponse (

        @SerializedName("changeMfa")
        val result: Mfa
    )

    class ChangeMfaParam @JvmOverloads constructor (    @SerializedName("enable")
    var enable: Boolean? = null,
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("userId")
    var userId: String? = null,
    @SerializedName("userPoolId")
    var userPoolId: String? = null,
    @SerializedName("refresh")
    var refresh: Boolean? = null)  {

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



    data class ConfigEmailTemplateResponse (

        @SerializedName("configEmailTemplate")
        val result: EmailTemplate
    )

    class ConfigEmailTemplateParam @JvmOverloads constructor (    @SerializedName("input")
    var input: ConfigEmailTemplateInput)  {


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



    data class CreateFunctionResponse (

        @SerializedName("createFunction")
        val result: Function
    )

    class CreateFunctionParam @JvmOverloads constructor (    @SerializedName("input")
    var input: CreateFunctionInput)  {


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



    data class CreateGroupResponse (

        @SerializedName("createGroup")
        val result: Group
    )

    class CreateGroupParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("description")
    var description: String? = null)  {

    fun withDescription(description: String?): CreateGroupParam {
      this.description = description
      return this
    }

      fun build(): CreateGroupParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          createGroupDocument,
          this
        );
      }

      private val createGroupDocument: String = """
mutation createGroup(${'$'}code: String!, ${'$'}name: String!, ${'$'}description: String) {
  createGroup(code: ${'$'}code, name: ${'$'}name, description: ${'$'}description) {
    code
    name
    description
    createdAt
    updatedAt
  }
}
"""
    }



    data class CreateOrgResponse (

        @SerializedName("createOrg")
        val result: Org
    )

    class CreateOrgParam @JvmOverloads constructor (    @SerializedName("name")
    var name: String,
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("tenantId")
    var tenantId: String? = null
    )  {

    fun withCode(code: String?): CreateOrgParam {
      this.code = code
      return this
    }

    fun withDescription(description: String?): CreateOrgParam {
      this.description = description
      return this
    }

    fun withTenantId(tenantId: String?): CreateOrgParam {
        this.tenantId = tenantId
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
  mutation createOrg(${'$'}name: String!, ${'$'}code: String, ${'$'}description: String, ${'$'}tenantId: String) {
  createOrg(name: ${'$'}name, code: ${'$'}code, description: ${'$'}description, tenantId: ${'$'}tenantId) {
    id
    rootNode {
      id
      orgId
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
    nodes {
      id
      orgId
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
  }
}
"""
    }



    data class CreatePolicyResponse (

        @SerializedName("createPolicy")
        val result: Policy
    )

    class CreatePolicyParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("code")
    var code: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("statements")
    var statements: List<PolicyStatementInput>)  {

    fun withNamespace(namespace: String?): CreatePolicyParam {
      this.namespace = namespace
      return this
    }

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
mutation createPolicy(${'$'}namespace: String, ${'$'}code: String!, ${'$'}description: String, ${'$'}statements: [PolicyStatementInput!]!) {
  createPolicy(namespace: ${'$'}namespace, code: ${'$'}code, description: ${'$'}description, statements: ${'$'}statements) {
    namespace
    code
    isDefault
    description
    statements {
      resource
      actions
      effect
      condition {
        param
        operator
        value
      }
    }
    createdAt
    updatedAt
    assignmentsCount
  }
}
"""
    }



    data class CreateRoleResponse (

        @SerializedName("createRole")
        val result: Role
    )

    class CreateRoleParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("code")
    var code: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("parent")
    var parent: String? = null)  {

    fun withNamespace(namespace: String?): CreateRoleParam {
      this.namespace = namespace
      return this
    }

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
mutation createRole(${'$'}namespace: String, ${'$'}code: String!, ${'$'}description: String, ${'$'}parent: String) {
  createRole(namespace: ${'$'}namespace, code: ${'$'}code, description: ${'$'}description, parent: ${'$'}parent) {
    id
    namespace
    code
    arn
    description
    createdAt
    updatedAt
    parent {
      namespace
      code
      arn
      description
      createdAt
      updatedAt
    }
  }
}
"""
    }



    data class CreateSocialConnectionInstanceResponse (

        @SerializedName("createSocialConnectionInstance")
        val result: SocialConnectionInstance
    )

    class CreateSocialConnectionInstanceParam @JvmOverloads constructor (    @SerializedName("input")
    var input: CreateSocialConnectionInstanceInput)  {


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



    data class CreateUserResponse (

        @SerializedName("createUser")
        val result: User
    )

    class CreateUserParam @JvmOverloads constructor (    @SerializedName("userInfo")
    var userInfo: CreateUserInput,
    @SerializedName("keepPassword")
    var keepPassword: Boolean? = null)  {

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
    status
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



    data class CreateUserWithCustomDataResponse (

        @SerializedName("createUser")
        val result: User
    )

    class CreateUserWithCustomDataParam @JvmOverloads constructor (    @SerializedName("userInfo")
    var userInfo: CreateUserInput,
    @SerializedName("keepPassword")
    var keepPassword: Boolean? = null,
    @SerializedName("params")
    var params: String? = null)  {

    fun withKeepPassword(keepPassword: Boolean?): CreateUserWithCustomDataParam {
      this.keepPassword = keepPassword
      return this
    }

    fun withParams(params: String?): CreateUserWithCustomDataParam {
      this.params = params
      return this
    }

      fun build(): CreateUserWithCustomDataParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          createUserWithCustomDataDocument,
          this
        );
      }

      private val createUserWithCustomDataDocument: String = """
mutation createUserWithCustomData(${'$'}userInfo: CreateUserInput!, ${'$'}keepPassword: Boolean, ${'$'}params: String) {
  createUser(userInfo: ${'$'}userInfo, keepPassword: ${'$'}keepPassword, params: ${'$'}params) {
    id
    arn
    userPoolId
    status
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
    customData {
      key
      value
      dataType
      label
    }
  }
}
"""
    }



    data class CreateUserpoolResponse (

        @SerializedName("createUserpool")
        val result: UserPool
    )

    class CreateUserpoolParam @JvmOverloads constructor (    @SerializedName("name")
    var name: String,
    @SerializedName("domain")
    var domain: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("logo")
    var logo: String? = null,
    @SerializedName("userpoolTypes")
    var userpoolTypes: List<String>? = null)  {

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
    appSsoEnabled
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
    packageType
  }
}
"""
    }



    data class DeleteFunctionResponse (

        @SerializedName("deleteFunction")
        val result: CommonMessage
    )

    class DeleteFunctionParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String)  {


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



    data class DeleteGroupsResponse (

        @SerializedName("deleteGroups")
        val result: CommonMessage
    )

    class DeleteGroupsParam @JvmOverloads constructor (    @SerializedName("codeList")
    var codeList: List<String>)  {


      fun build(): DeleteGroupsParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          deleteGroupsDocument,
          this
        );
      }

      private val deleteGroupsDocument: String = """
mutation deleteGroups(${'$'}codeList: [String!]!) {
  deleteGroups(codeList: ${'$'}codeList) {
    message
    code
  }
}
"""
    }



    data class DeleteNodeResponse (

        @SerializedName("deleteNode")
        val result: CommonMessage
    )

    class DeleteNodeParam @JvmOverloads constructor (    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("nodeId")
    var nodeId: String)  {


      fun build(): DeleteNodeParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          deleteNodeDocument,
          this
        );
      }

      private val deleteNodeDocument: String = """
mutation deleteNode(${'$'}orgId: String!, ${'$'}nodeId: String!) {
  deleteNode(orgId: ${'$'}orgId, nodeId: ${'$'}nodeId) {
    message
    code
  }
}
"""
    }



    data class DeleteOrgResponse (

        @SerializedName("deleteOrg")
        val result: CommonMessage
    )

    class DeleteOrgParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String)  {


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
mutation deleteOrg(${'$'}id: String!) {
  deleteOrg(id: ${'$'}id) {
    message
    code
  }
}
"""
    }



    data class DeletePoliciesResponse (

        @SerializedName("deletePolicies")
        val result: CommonMessage
    )

    class DeletePoliciesParam @JvmOverloads constructor (    @SerializedName("codeList")
    var codeList: List<String>,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withNamespace(namespace: String?): DeletePoliciesParam {
      this.namespace = namespace
      return this
    }

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
mutation deletePolicies(${'$'}codeList: [String!]!, ${'$'}namespace: String) {
  deletePolicies(codeList: ${'$'}codeList, namespace: ${'$'}namespace) {
    message
    code
  }
}
"""
    }



    data class DeletePolicyResponse (

        @SerializedName("deletePolicy")
        val result: CommonMessage
    )

    class DeletePolicyParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withNamespace(namespace: String?): DeletePolicyParam {
      this.namespace = namespace
      return this
    }

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
mutation deletePolicy(${'$'}code: String!, ${'$'}namespace: String) {
  deletePolicy(code: ${'$'}code, namespace: ${'$'}namespace) {
    message
    code
  }
}
"""
    }



    data class DeleteRoleResponse (

        @SerializedName("deleteRole")
        val result: CommonMessage
    )

    class DeleteRoleParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withNamespace(namespace: String?): DeleteRoleParam {
      this.namespace = namespace
      return this
    }

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
mutation deleteRole(${'$'}code: String!, ${'$'}namespace: String) {
  deleteRole(code: ${'$'}code, namespace: ${'$'}namespace) {
    message
    code
  }
}
"""
    }



    data class DeleteRolesResponse (

        @SerializedName("deleteRoles")
        val result: CommonMessage
    )

    class DeleteRolesParam @JvmOverloads constructor (    @SerializedName("codeList")
    var codeList: List<String>,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withNamespace(namespace: String?): DeleteRolesParam {
      this.namespace = namespace
      return this
    }

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
mutation deleteRoles(${'$'}codeList: [String!]!, ${'$'}namespace: String) {
  deleteRoles(codeList: ${'$'}codeList, namespace: ${'$'}namespace) {
    message
    code
  }
}
"""
    }



    data class DeleteUserResponse (

        @SerializedName("deleteUser")
        val result: CommonMessage
    )

    class DeleteUserParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String)  {


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



    data class DeleteUserpoolResponse (

        @SerializedName("deleteUserpool")
        val result: CommonMessage
    )

    class DeleteUserpoolParam   {


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



    data class DeleteUsersResponse (

        @SerializedName("deleteUsers")
        val result: CommonMessage
    )

    class DeleteUsersParam @JvmOverloads constructor (    @SerializedName("ids")
    var ids: List<String>)  {


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



    data class DisableEmailTemplateResponse (

        @SerializedName("disableEmailTemplate")
        val result: EmailTemplate
    )

    class DisableEmailTemplateParam @JvmOverloads constructor (    @SerializedName("type")
    var type: EmailTemplateType)  {


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



    data class DisableSocialConnectionInstanceResponse (

        @SerializedName("disableSocialConnectionInstance")
        val result: SocialConnectionInstance
    )

    class DisableSocialConnectionInstanceParam @JvmOverloads constructor (    @SerializedName("provider")
    var provider: String)  {


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



    data class DisbalePolicyAssignmentResponse (

        @SerializedName("disbalePolicyAssignment")
        val result: CommonMessage
    )

    class DisbalePolicyAssignmentParam @JvmOverloads constructor (    @SerializedName("policy")
    var policy: String,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    @SerializedName("targetIdentifier")
    var targetIdentifier: String,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withNamespace(namespace: String?): DisbalePolicyAssignmentParam {
      this.namespace = namespace
      return this
    }

      fun build(): DisbalePolicyAssignmentParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          disbalePolicyAssignmentDocument,
          this
        );
      }

      private val disbalePolicyAssignmentDocument: String = """
mutation disbalePolicyAssignment(${'$'}policy: String!, ${'$'}targetType: PolicyAssignmentTargetType!, ${'$'}targetIdentifier: String!, ${'$'}namespace: String) {
  disbalePolicyAssignment(policy: ${'$'}policy, targetType: ${'$'}targetType, targetIdentifier: ${'$'}targetIdentifier, namespace: ${'$'}namespace) {
    message
    code
  }
}
"""
    }



    data class EnableEmailTemplateResponse (

        @SerializedName("enableEmailTemplate")
        val result: EmailTemplate
    )

    class EnableEmailTemplateParam @JvmOverloads constructor (    @SerializedName("type")
    var type: EmailTemplateType)  {


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



    data class EnablePolicyAssignmentResponse (

        @SerializedName("enablePolicyAssignment")
        val result: CommonMessage
    )

    class EnablePolicyAssignmentParam @JvmOverloads constructor (    @SerializedName("policy")
    var policy: String,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    @SerializedName("targetIdentifier")
    var targetIdentifier: String,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withNamespace(namespace: String?): EnablePolicyAssignmentParam {
      this.namespace = namespace
      return this
    }

      fun build(): EnablePolicyAssignmentParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          enablePolicyAssignmentDocument,
          this
        );
      }

      private val enablePolicyAssignmentDocument: String = """
mutation enablePolicyAssignment(${'$'}policy: String!, ${'$'}targetType: PolicyAssignmentTargetType!, ${'$'}targetIdentifier: String!, ${'$'}namespace: String) {
  enablePolicyAssignment(policy: ${'$'}policy, targetType: ${'$'}targetType, targetIdentifier: ${'$'}targetIdentifier, namespace: ${'$'}namespace) {
    message
    code
  }
}
"""
    }



    data class EnableSocialConnectionInstanceResponse (

        @SerializedName("enableSocialConnectionInstance")
        val result: SocialConnectionInstance
    )

    class EnableSocialConnectionInstanceParam @JvmOverloads constructor (    @SerializedName("provider")
    var provider: String)  {


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



    data class LoginByEmailResponse (

        @SerializedName("loginByEmail")
        val result: User
    )

    class LoginByEmailParam @JvmOverloads constructor (    @SerializedName("input")
    var input: LoginByEmailInput)  {


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
    status
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



    data class LoginByPhoneCodeResponse (

        @SerializedName("loginByPhoneCode")
        val result: User
    )

    class LoginByPhoneCodeParam @JvmOverloads constructor (    @SerializedName("input")
    var input: LoginByPhoneCodeInput)  {


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
    status
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



    data class LoginByPhonePasswordResponse (

        @SerializedName("loginByPhonePassword")
        val result: User
    )

    class LoginByPhonePasswordParam @JvmOverloads constructor (    @SerializedName("input")
    var input: LoginByPhonePasswordInput)  {


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
    status
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



    data class LoginBySubAccountResponse (

        @SerializedName("loginBySubAccount")
        val result: User
    )

    class LoginBySubAccountParam @JvmOverloads constructor (    @SerializedName("account")
    var account: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("captchaCode")
    var captchaCode: String? = null,
    @SerializedName("clientIp")
    var clientIp: String? = null)  {

    fun withCaptchaCode(captchaCode: String?): LoginBySubAccountParam {
      this.captchaCode = captchaCode
      return this
    }

    fun withClientIp(clientIp: String?): LoginBySubAccountParam {
      this.clientIp = clientIp
      return this
    }

      fun build(): LoginBySubAccountParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          loginBySubAccountDocument,
          this
        );
      }

      private val loginBySubAccountDocument: String = """
mutation loginBySubAccount(${'$'}account: String!, ${'$'}password: String!, ${'$'}captchaCode: String, ${'$'}clientIp: String) {
  loginBySubAccount(account: ${'$'}account, password: ${'$'}password, captchaCode: ${'$'}captchaCode, clientIp: ${'$'}clientIp) {
    id
    arn
    status
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



    data class LoginByUsernameResponse (

        @SerializedName("loginByUsername")
        val result: User
    )

    class LoginByUsernameParam @JvmOverloads constructor (    @SerializedName("input")
    var input: LoginByUsernameInput)  {


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
    status
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



    data class MoveNodeResponse (

        @SerializedName("moveNode")
        val result: Org
    )

    class MoveNodeParam @JvmOverloads constructor (    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("nodeId")
    var nodeId: String,
    @SerializedName("targetParentId")
    var targetParentId: String)  {


      fun build(): MoveNodeParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          moveNodeDocument,
          this
        );
      }

      private val moveNodeDocument: String = """
mutation moveNode(${'$'}orgId: String!, ${'$'}nodeId: String!, ${'$'}targetParentId: String!) {
  moveNode(orgId: ${'$'}orgId, nodeId: ${'$'}nodeId, targetParentId: ${'$'}targetParentId) {
    id
    rootNode {
      id
      orgId
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
    nodes {
      id
      orgId
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
  }
}
"""
    }



    data class RefreshAccessTokenResponse (

        @SerializedName("refreshAccessToken")
        val result: RefreshAccessTokenRes
    )

    class RefreshAccessTokenParam @JvmOverloads constructor (    @SerializedName("accessToken")
    var accessToken: String? = null)  {

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



    data class RefreshTokenResponse (

        @SerializedName("refreshToken")
        val result: RefreshToken
    )

    class RefreshTokenParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String? = null)  {

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



    data class RefreshUserpoolSecretResponse (

        @SerializedName("refreshUserpoolSecret")
        val result: String
    )

    class RefreshUserpoolSecretParam   {


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



    data class RegisterByEmailResponse (

        @SerializedName("registerByEmail")
        val result: User
    )

    class RegisterByEmailParam @JvmOverloads constructor (    @SerializedName("input")
    var input: RegisterByEmailInput)  {


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
    status
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



    data class RegisterByPhoneCodeResponse (

        @SerializedName("registerByPhoneCode")
        val result: User
    )

    class RegisterByPhoneCodeParam @JvmOverloads constructor (    @SerializedName("input")
    var input: RegisterByPhoneCodeInput)  {


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
    status
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



    data class RegisterByUsernameResponse (

        @SerializedName("registerByUsername")
        val result: User
    )

    class RegisterByUsernameParam @JvmOverloads constructor (    @SerializedName("input")
    var input: RegisterByUsernameInput)  {


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
    status
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



    data class RemoveMemberResponse (

        @SerializedName("removeMember")
        val result: Node
    )

    class RemoveMemberParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("nodeId")
    var nodeId: String? = null,
    @SerializedName("orgId")
    var orgId: String? = null,
    @SerializedName("nodeCode")
    var nodeCode: String? = null,
    @SerializedName("userIds")
    var userIds: List<String>)  {

    fun withPage(page: Int?): RemoveMemberParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): RemoveMemberParam {
      this.limit = limit
      return this
    }

    fun withSortBy(sortBy: SortByEnum?): RemoveMemberParam {
      this.sortBy = sortBy
      return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): RemoveMemberParam {
      this.includeChildrenNodes = includeChildrenNodes
      return this
    }

    fun withNodeId(nodeId: String?): RemoveMemberParam {
      this.nodeId = nodeId
      return this
    }

    fun withOrgId(orgId: String?): RemoveMemberParam {
      this.orgId = orgId
      return this
    }

    fun withNodeCode(nodeCode: String?): RemoveMemberParam {
      this.nodeCode = nodeCode
      return this
    }

      fun build(): RemoveMemberParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          removeMemberDocument,
          this
        );
      }

      private val removeMemberDocument: String = """
mutation removeMember(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}nodeId: String, ${'$'}orgId: String, ${'$'}nodeCode: String, ${'$'}userIds: [String!]!) {
  removeMember(nodeId: ${'$'}nodeId, orgId: ${'$'}orgId, nodeCode: ${'$'}nodeCode, userIds: ${'$'}userIds) {
    id
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
      list {
        id
        arn
        userPoolId
        status
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
  }
}
"""
    }



    data class RemovePolicyAssignmentsResponse (

        @SerializedName("removePolicyAssignments")
        val result: CommonMessage
    )

    class RemovePolicyAssignmentsParam @JvmOverloads constructor (    @SerializedName("policies")
    var policies: List<String>,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    @SerializedName("targetIdentifiers")
    var targetIdentifiers: List<String>? = null,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withTargetIdentifiers(targetIdentifiers: List<String>?): RemovePolicyAssignmentsParam {
      this.targetIdentifiers = targetIdentifiers
      return this
    }

    fun withNamespace(namespace: String?): RemovePolicyAssignmentsParam {
      this.namespace = namespace
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
mutation removePolicyAssignments(${'$'}policies: [String!]!, ${'$'}targetType: PolicyAssignmentTargetType!, ${'$'}targetIdentifiers: [String!], ${'$'}namespace: String) {
  removePolicyAssignments(policies: ${'$'}policies, targetType: ${'$'}targetType, targetIdentifiers: ${'$'}targetIdentifiers, namespace: ${'$'}namespace) {
    message
    code
  }
}
"""
    }



    data class RemoveUdfResponse (

        @SerializedName("removeUdf")
        val result: CommonMessage
    )

    class RemoveUdfParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("key")
    var key: String)  {


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



    data class RemoveUdvResponse (

        @SerializedName("removeUdv")
        val result: List<UserDefinedData>
    )

    class RemoveUdvParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("targetId")
    var targetId: String,
    @SerializedName("key")
    var key: String)  {


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
    label
  }
}
"""
    }



    data class RemoveUserFromGroupResponse (

        @SerializedName("removeUserFromGroup")
        val result: CommonMessage
    )

    class RemoveUserFromGroupParam @JvmOverloads constructor (    @SerializedName("userIds")
    var userIds: List<String>,
    @SerializedName("code")
    var code: String? = null)  {

    fun withCode(code: String?): RemoveUserFromGroupParam {
      this.code = code
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
mutation removeUserFromGroup(${'$'}userIds: [String!]!, ${'$'}code: String) {
  removeUserFromGroup(userIds: ${'$'}userIds, code: ${'$'}code) {
    message
    code
  }
}
"""
    }



    data class RemoveWhitelistResponse (

        @SerializedName("removeWhitelist")
        val result: List<WhiteList>
    )

    class RemoveWhitelistParam @JvmOverloads constructor (    @SerializedName("type")
    var type: WhitelistType,
    @SerializedName("list")
    var list: List<String>)  {


      fun build(): RemoveWhitelistParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          removeWhitelistDocument,
          this
        );
      }

      private val removeWhitelistDocument: String = """
mutation removeWhitelist(${'$'}type: WhitelistType!, ${'$'}list: [String!]!) {
  removeWhitelist(type: ${'$'}type, list: ${'$'}list) {
    createdAt
    updatedAt
    value
  }
}
"""
    }



    data class ResetPasswordResponse (

        @SerializedName("resetPassword")
        val result: CommonMessage
    )

    class ResetPasswordParam @JvmOverloads constructor (    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("code")
    var code: String,
    @SerializedName("newPassword")
    var newPassword: String)  {

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



    data class RevokeRoleResponse (

        @SerializedName("revokeRole")
        val result: CommonMessage
    )

    class RevokeRoleParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("roleCode")
    var roleCode: String? = null,
    @SerializedName("roleCodes")
    var roleCodes: List<String>? = null,
    @SerializedName("userIds")
    var userIds: List<String>? = null,
    @SerializedName("groupCodes")
    var groupCodes: List<String>? = null,
    @SerializedName("nodeCodes")
    var nodeCodes: List<String>? = null)  {

    fun withNamespace(namespace: String?): RevokeRoleParam {
      this.namespace = namespace
      return this
    }

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
mutation revokeRole(${'$'}namespace: String, ${'$'}roleCode: String, ${'$'}roleCodes: [String], ${'$'}userIds: [String!], ${'$'}groupCodes: [String!], ${'$'}nodeCodes: [String!]) {
  revokeRole(namespace: ${'$'}namespace, roleCode: ${'$'}roleCode, roleCodes: ${'$'}roleCodes, userIds: ${'$'}userIds, groupCodes: ${'$'}groupCodes, nodeCodes: ${'$'}nodeCodes) {
    message
    code
  }
}
"""
    }



    data class SendEmailResponse (

        @SerializedName("sendEmail")
        val result: CommonMessage
    )

    class SendEmailParam @JvmOverloads constructor (    @SerializedName("email")
    var email: String,
    @SerializedName("scene")
    var scene: EmailScene)  {


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



    data class SetMainDepartmentResponse (

        @SerializedName("setMainDepartment")
        val result: CommonMessage
    )

    class SetMainDepartmentParam @JvmOverloads constructor (    @SerializedName("userId")
    var userId: String,
    @SerializedName("departmentId")
    var departmentId: String? = null)  {

    fun withDepartmentId(departmentId: String?): SetMainDepartmentParam {
      this.departmentId = departmentId
      return this
    }

      fun build(): SetMainDepartmentParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          setMainDepartmentDocument,
          this
        );
      }

      private val setMainDepartmentDocument: String = """
mutation setMainDepartment(${'$'}userId: String!, ${'$'}departmentId: String) {
  setMainDepartment(userId: ${'$'}userId, departmentId: ${'$'}departmentId) {
    message
    code
  }
}
"""
    }



    data class SetUdfResponse (

        @SerializedName("setUdf")
        val result: UserDefinedField
    )

    class SetUdfParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("key")
    var key: String,
    @SerializedName("dataType")
    var dataType: UdfDataType,
    @SerializedName("label")
    var label: String,
    @SerializedName("options")
    var options: String? = null)  {

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



    data class SetUdfValueBatchResponse (

        @SerializedName("setUdfValueBatch")
        val result: CommonMessage
    )

    class SetUdfValueBatchParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("input")
    var input: List<SetUdfValueBatchInput>)  {


      fun build(): SetUdfValueBatchParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          setUdfValueBatchDocument,
          this
        );
      }

      private val setUdfValueBatchDocument: String = """
mutation setUdfValueBatch(${'$'}targetType: UDFTargetType!, ${'$'}input: [SetUdfValueBatchInput!]!) {
  setUdfValueBatch(targetType: ${'$'}targetType, input: ${'$'}input) {
    code
    message
  }
}
"""
    }



    data class SetUdvResponse (

        @SerializedName("setUdv")
        val result: List<UserDefinedData>
    )

    class SetUdvParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("targetId")
    var targetId: String,
    @SerializedName("key")
    var key: String,
    @SerializedName("value")
    var value: String)  {


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
    label
  }
}
"""
    }



    data class SetUdvBatchResponse (

        @SerializedName("setUdvBatch")
        val result: List<UserDefinedData>
    )

    class SetUdvBatchParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("targetId")
    var targetId: String,
    @SerializedName("udvList")
    var udvList: List<UserDefinedDataInput>? = null)  {

    fun withUdvList(udvList: List<UserDefinedDataInput>?): SetUdvBatchParam {
      this.udvList = udvList
      return this
    }

      fun build(): SetUdvBatchParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          setUdvBatchDocument,
          this
        );
      }

      private val setUdvBatchDocument: String = """
mutation setUdvBatch(${'$'}targetType: UDFTargetType!, ${'$'}targetId: String!, ${'$'}udvList: [UserDefinedDataInput!]) {
  setUdvBatch(targetType: ${'$'}targetType, targetId: ${'$'}targetId, udvList: ${'$'}udvList) {
    key
    dataType
    value
    label
  }
}
"""
    }



    data class UnbindEmailResponse (

        @SerializedName("unbindEmail")
        val result: User
    )

    class UnbindEmailParam   {


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
    status
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



    data class UnbindPhoneResponse (

        @SerializedName("unbindPhone")
        val result: User
    )

    class UnbindPhoneParam   {


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
    status
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



    data class UpdateEmailResponse (

        @SerializedName("updateEmail")
        val result: User
    )

    class UpdateEmailParam @JvmOverloads constructor (    @SerializedName("email")
    var email: String,
    @SerializedName("emailCode")
    var emailCode: String,
    @SerializedName("oldEmail")
    var oldEmail: String? = null,
    @SerializedName("oldEmailCode")
    var oldEmailCode: String? = null)  {

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
    status
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



    data class UpdateFunctionResponse (

        @SerializedName("updateFunction")
        val result: Function
    )

    class UpdateFunctionParam @JvmOverloads constructor (    @SerializedName("input")
    var input: UpdateFunctionInput)  {


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



    data class UpdateGroupResponse (

        @SerializedName("updateGroup")
        val result: Group
    )

    class UpdateGroupParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("newCode")
    var newCode: String? = null)  {

    fun withName(name: String?): UpdateGroupParam {
      this.name = name
      return this
    }

    fun withDescription(description: String?): UpdateGroupParam {
      this.description = description
      return this
    }

    fun withNewCode(newCode: String?): UpdateGroupParam {
      this.newCode = newCode
      return this
    }

      fun build(): UpdateGroupParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          updateGroupDocument,
          this
        );
      }

      private val updateGroupDocument: String = """
mutation updateGroup(${'$'}code: String!, ${'$'}name: String, ${'$'}description: String, ${'$'}newCode: String) {
  updateGroup(code: ${'$'}code, name: ${'$'}name, description: ${'$'}description, newCode: ${'$'}newCode) {
    code
    name
    description
    createdAt
    updatedAt
  }
}
"""
    }



    data class UpdateNodeResponse (

        @SerializedName("updateNode")
        val result: Node
    )

    class UpdateNodeParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("description")
    var description: String? = null)  {

    fun withPage(page: Int?): UpdateNodeParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): UpdateNodeParam {
      this.limit = limit
      return this
    }

    fun withSortBy(sortBy: SortByEnum?): UpdateNodeParam {
      this.sortBy = sortBy
      return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): UpdateNodeParam {
      this.includeChildrenNodes = includeChildrenNodes
      return this
    }

    fun withName(name: String?): UpdateNodeParam {
      this.name = name
      return this
    }

    fun withCode(code: String?): UpdateNodeParam {
      this.code = code
      return this
    }

    fun withDescription(description: String?): UpdateNodeParam {
      this.description = description
      return this
    }

      fun build(): UpdateNodeParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          updateNodeDocument,
          this
        );
      }

      private val updateNodeDocument: String = """
mutation updateNode(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}id: String!, ${'$'}name: String, ${'$'}code: String, ${'$'}description: String) {
  updateNode(id: ${'$'}id, name: ${'$'}name, code: ${'$'}code, description: ${'$'}description) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
    }
  }
}
"""
    }



    data class UpdatePasswordResponse (

        @SerializedName("updatePassword")
        val result: User
    )

    class UpdatePasswordParam @JvmOverloads constructor (    @SerializedName("newPassword")
    var newPassword: String,
    @SerializedName("oldPassword")
    var oldPassword: String? = null)  {

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
    status
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



    data class UpdatePhoneResponse (

        @SerializedName("updatePhone")
        val result: User
    )

    class UpdatePhoneParam @JvmOverloads constructor (    @SerializedName("phone")
    var phone: String,
    @SerializedName("phoneCode")
    var phoneCode: String,
    @SerializedName("oldPhone")
    var oldPhone: String? = null,
    @SerializedName("oldPhoneCode")
    var oldPhoneCode: String? = null)  {

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
    status
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



    data class UpdatePolicyResponse (

        @SerializedName("updatePolicy")
        val result: Policy
    )

    class UpdatePolicyParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("code")
    var code: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("statements")
    var statements: List<PolicyStatementInput>? = null,
    @SerializedName("newCode")
    var newCode: String? = null)  {

    fun withNamespace(namespace: String?): UpdatePolicyParam {
      this.namespace = namespace
      return this
    }

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
mutation updatePolicy(${'$'}namespace: String, ${'$'}code: String!, ${'$'}description: String, ${'$'}statements: [PolicyStatementInput!], ${'$'}newCode: String) {
  updatePolicy(namespace: ${'$'}namespace, code: ${'$'}code, description: ${'$'}description, statements: ${'$'}statements, newCode: ${'$'}newCode) {
    namespace
    code
    description
    statements {
      resource
      actions
      effect
      condition {
        param
        operator
        value
      }
    }
    createdAt
    updatedAt
  }
}
"""
    }



    data class UpdateRoleResponse (

        @SerializedName("updateRole")
        val result: Role
    )

    class UpdateRoleParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("newCode")
    var newCode: String? = null,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withDescription(description: String?): UpdateRoleParam {
      this.description = description
      return this
    }

    fun withNewCode(newCode: String?): UpdateRoleParam {
      this.newCode = newCode
      return this
    }

    fun withNamespace(namespace: String?): UpdateRoleParam {
      this.namespace = namespace
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
mutation updateRole(${'$'}code: String!, ${'$'}description: String, ${'$'}newCode: String, ${'$'}namespace: String) {
  updateRole(code: ${'$'}code, description: ${'$'}description, newCode: ${'$'}newCode, namespace: ${'$'}namespace) {
    id
    namespace
    code
    arn
    description
    createdAt
    updatedAt
    parent {
      namespace
      code
      arn
      description
      createdAt
      updatedAt
    }
  }
}
"""
    }



    data class UpdateUserResponse (

        @SerializedName("updateUser")
        val result: User
    )

    class UpdateUserParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String? = null,
    @SerializedName("input")
    var input: UpdateUserInput)  {

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
    status
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



    data class UpdateUserpoolResponse (

        @SerializedName("updateUserpool")
        val result: UserPool
    )

    class UpdateUserpoolParam @JvmOverloads constructor (    @SerializedName("input")
    var input: UpdateUserpoolInput)  {


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
    appSsoEnabled
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
      config
    }
    packageType
    useCustomUserStore
    loginRequireEmailVerified
    verifyCodeLength
  }
}
"""
    }



    data class AccessTokenResponse (

        @SerializedName("accessToken")
        val result: AccessTokenRes
    )

    class AccessTokenParam @JvmOverloads constructor (    @SerializedName("userPoolId")
    var userPoolId: String,
    @SerializedName("secret")
    var secret: String)  {


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



    data class ArchivedUsersResponse (

        @SerializedName("archivedUsers")
        val result: PaginatedUsers
    )

    class ArchivedUsersParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null)  {

    fun withPage(page: Int?): ArchivedUsersParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): ArchivedUsersParam {
      this.limit = limit
      return this
    }

      fun build(): ArchivedUsersParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          archivedUsersDocument,
          this
        );
      }

      private val archivedUsersDocument: String = """
query archivedUsers(${'$'}page: Int, ${'$'}limit: Int) {
  archivedUsers(page: ${'$'}page, limit: ${'$'}limit) {
    totalCount
    list {
      id
      arn
      status
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



    data class AuthorizedTargetsResponse (

        @SerializedName("authorizedTargets")
        val result: PaginatedAuthorizedTargets
    )

    class AuthorizedTargetsParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String,
    @SerializedName("resourceType")
    var resourceType: ResourceType,
    @SerializedName("resource")
    var resource: String,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType? = null,
    @SerializedName("actions")
    var actions: AuthorizedTargetsActionsInput? = null)  {

    fun withTargetType(targetType: PolicyAssignmentTargetType?): AuthorizedTargetsParam {
      this.targetType = targetType
      return this
    }

    fun withActions(actions: AuthorizedTargetsActionsInput?): AuthorizedTargetsParam {
      this.actions = actions
      return this
    }

      fun build(): AuthorizedTargetsParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          authorizedTargetsDocument,
          this
        );
      }

      private val authorizedTargetsDocument: String = """
query authorizedTargets(${'$'}namespace: String!, ${'$'}resourceType: ResourceType!, ${'$'}resource: String!, ${'$'}targetType: PolicyAssignmentTargetType, ${'$'}actions: AuthorizedTargetsActionsInput) {
  authorizedTargets(namespace: ${'$'}namespace, resource: ${'$'}resource, resourceType: ${'$'}resourceType, targetType: ${'$'}targetType, actions: ${'$'}actions) {
    totalCount
    list {
      targetType
      targetIdentifier
      actions
    }
  }
}
"""
    }



    data class CheckLoginStatusResponse (

        @SerializedName("checkLoginStatus")
        val result: JwtTokenStatus
    )

    class CheckLoginStatusParam @JvmOverloads constructor (    @SerializedName("token")
    var token: String? = null)  {

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



    data class CheckPasswordStrengthResponse (

        @SerializedName("checkPasswordStrength")
        val result: CheckPasswordStrengthResult
    )

    class CheckPasswordStrengthParam @JvmOverloads constructor (    @SerializedName("password")
    var password: String)  {


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



    data class ChildrenNodesResponse (

        @SerializedName("childrenNodes")
        val result: List<Node>
    )

    class ChildrenNodesParam @JvmOverloads constructor (    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("nodeId")
    var nodeId: String)  {


      fun build(): ChildrenNodesParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          childrenNodesDocument,
          this
        );
      }

      private val childrenNodesDocument: String = """
query childrenNodes(${'$'}orgId: String!, ${'$'}nodeId: String!) {
  childrenNodes(orgId: ${'$'}orgId, nodeId: ${'$'}nodeId) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
  }
}
"""
    }



    data class EmailTemplatesResponse (

        @SerializedName("emailTemplates")
        val result: List<EmailTemplate>
    )

    class EmailTemplatesParam   {


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



    data class FindUserResponse (

        @SerializedName("findUser")
        val result: User
    )

    class FindUserParam @JvmOverloads constructor (    @SerializedName("email")
    var email: String? = null,
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("username")
    var username: String? = null,
    @SerializedName("externalId")
    var externalId: String? = null)  {

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

    fun withExternalId(externalId: String?): FindUserParam {
      this.externalId = externalId
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
query findUser(${'$'}email: String, ${'$'}phone: String, ${'$'}username: String, ${'$'}externalId: String) {
  findUser(email: ${'$'}email, phone: ${'$'}phone, username: ${'$'}username, externalId: ${'$'}externalId) {
    id
    arn
    userPoolId
    status
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



    data class FindUserWithCustomDataResponse (

        @SerializedName("findUser")
        val result: User
    )

    class FindUserWithCustomDataParam @JvmOverloads constructor (    @SerializedName("email")
    var email: String? = null,
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("username")
    var username: String? = null,
    @SerializedName("externalId")
    var externalId: String? = null)  {

    fun withEmail(email: String?): FindUserWithCustomDataParam {
      this.email = email
      return this
    }

    fun withPhone(phone: String?): FindUserWithCustomDataParam {
      this.phone = phone
      return this
    }

    fun withUsername(username: String?): FindUserWithCustomDataParam {
      this.username = username
      return this
    }

    fun withExternalId(externalId: String?): FindUserWithCustomDataParam {
      this.externalId = externalId
      return this
    }

      fun build(): FindUserWithCustomDataParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          findUserWithCustomDataDocument,
          this
        );
      }

      private val findUserWithCustomDataDocument: String = """
query findUserWithCustomData(${'$'}email: String, ${'$'}phone: String, ${'$'}username: String, ${'$'}externalId: String) {
  findUser(email: ${'$'}email, phone: ${'$'}phone, username: ${'$'}username, externalId: ${'$'}externalId) {
    id
    arn
    userPoolId
    status
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
    customData {
      key
      value
      dataType
      label
    }
  }
}
"""
    }



    data class FunctionResponse (

        @SerializedName("function")
        val result: Function
    )

    class FunctionParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String? = null)  {

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



    data class FunctionsResponse (

        @SerializedName("functions")
        val result: PaginatedFunctions
    )

    class FunctionsParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null)  {

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



    data class GetUserDepartmentsResponse (

        @SerializedName("user")
        val result: User
    )

    class GetUserDepartmentsParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String,
    @SerializedName("orgId")
    var orgId: String? = null)  {

    fun withOrgId(orgId: String?): GetUserDepartmentsParam {
      this.orgId = orgId
      return this
    }

      fun build(): GetUserDepartmentsParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          getUserDepartmentsDocument,
          this
        );
      }

      private val getUserDepartmentsDocument: String = """
query getUserDepartments(${'$'}id: String!, ${'$'}orgId: String) {
  user(id: ${'$'}id) {
    departments(orgId: ${'$'}orgId) {
      totalCount
      list {
        department {
          id
          orgId
          name
          nameI18n
          description
          descriptionI18n
          order
          code
          root
          depth
          path
          codePath
          namePath
          createdAt
          updatedAt
          children
        }
        isMainDepartment
        joinedAt
      }
    }
  }
}
"""
    }



    data class GetUserGroupsResponse (

        @SerializedName("user")
        val result: User
    )

    class GetUserGroupsParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String)  {


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


    data class GetUserRolesResponse (

        @SerializedName("user")
        val result: User
    )

    class GetUserRolesParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withNamespace(namespace: String?): GetUserRolesParam {
      this.namespace = namespace
      return this
    }

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
query getUserRoles(${'$'}id: String!, ${'$'}namespace: String) {
  user(id: ${'$'}id) {
    roles(namespace: ${'$'}namespace) {
      totalCount
      list {
        code
        namespace
        arn
        description
        createdAt
        updatedAt
        parent {
          code
          namespace
          arn
          description
          createdAt
          updatedAt
        }
      }
    }
  }
}
"""
    }



    data class GroupResponse (

        @SerializedName("group")
        val result: Group
    )

    class GroupParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String)  {


      fun build(): GroupParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          groupDocument,
          this
        );
      }

      private val groupDocument: String = """
query group(${'$'}code: String!) {
  group(code: ${'$'}code) {
    code
    name
    description
    createdAt
    updatedAt
  }
}
"""
    }



    data class GroupWithUsersResponse (

        @SerializedName("group")
        val result: Group
    )

    class GroupWithUsersParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null)  {

    fun withPage(page: Int?): GroupWithUsersParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): GroupWithUsersParam {
      this.limit = limit
      return this
    }

      fun build(): GroupWithUsersParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          groupWithUsersDocument,
          this
        );
      }

      private val groupWithUsersDocument: String = """
query groupWithUsers(${'$'}code: String!, ${'$'}page: Int, ${'$'}limit: Int) {
  group(code: ${'$'}code) {
    users(page: ${'$'}page, limit: ${'$'}limit) {
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



    data class GroupWithUsersWithCustomDataResponse (

        @SerializedName("group")
        val result: Group
    )

    class GroupWithUsersWithCustomDataParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null)  {

    fun withPage(page: Int?): GroupWithUsersWithCustomDataParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): GroupWithUsersWithCustomDataParam {
      this.limit = limit
      return this
    }

      fun build(): GroupWithUsersWithCustomDataParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          groupWithUsersWithCustomDataDocument,
          this
        );
      }

      private val groupWithUsersWithCustomDataDocument: String = """
query groupWithUsersWithCustomData(${'$'}code: String!, ${'$'}page: Int, ${'$'}limit: Int) {
  group(code: ${'$'}code) {
    users(page: ${'$'}page, limit: ${'$'}limit) {
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
        customData {
          key
          value
          dataType
          label
        }
      }
    }
  }
}
"""
    }



    data class GroupsResponse (

        @SerializedName("groups")
        val result: PaginatedGroups
    )

    class GroupsParam @JvmOverloads constructor (    @SerializedName("userId")
    var userId: String? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null)  {

    fun withUserId(userId: String?): GroupsParam {
      this.userId = userId
      return this
    }

    fun withPage(page: Int?): GroupsParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): GroupsParam {
      this.limit = limit
      return this
    }

    fun withSortBy(sortBy: SortByEnum?): GroupsParam {
      this.sortBy = sortBy
      return this
    }

      fun build(): GroupsParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          groupsDocument,
          this
        );
      }

      private val groupsDocument: String = """
query groups(${'$'}userId: String, ${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  groups(userId: ${'$'}userId, page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
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
"""
    }



    data class IsActionAllowedResponse (

        @SerializedName("isActionAllowed")
        val result: Boolean
    )

    class IsActionAllowedParam @JvmOverloads constructor (    @SerializedName("resource")
    var resource: String,
    @SerializedName("action")
    var action: String,
    @SerializedName("userId")
    var userId: String,
    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("tenantId")
    var tenantId: String? = null
    )  {

    fun withNamespace(namespace: String?): IsActionAllowedParam {
      this.namespace = namespace
      return this
    }

    fun withTenantId(tenantId: String?): IsActionAllowedParam {
        this.tenantId = tenantId
        return this
    }

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
query isActionAllowed(${'$'}resource: String!, ${'$'}action: String!, ${'$'}userId: String!, ${'$'}namespace: String, ${'$'}tenantId: String) {
  isActionAllowed(resource: ${'$'}resource, action: ${'$'}action, userId: ${'$'}userId, namespace: ${'$'}namespace, tenantId: ${'$'}tenantId)
}
"""
    }



    data class IsActionDeniedResponse (

        @SerializedName("isActionDenied")
        val result: Boolean
    )

    class IsActionDeniedParam @JvmOverloads constructor (    @SerializedName("resource")
    var resource: String,
    @SerializedName("action")
    var action: String,
    @SerializedName("userId")
    var userId: String)  {


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



    data class IsDomainAvaliableResponse (

        @SerializedName("isDomainAvaliable")
        val result: Boolean
    )

    class IsDomainAvaliableParam @JvmOverloads constructor (    @SerializedName("domain")
    var domain: String)  {


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



    data class IsRootNodeResponse (

        @SerializedName("isRootNode")
        val result: Boolean
    )

    class IsRootNodeParam @JvmOverloads constructor (    @SerializedName("nodeId")
    var nodeId: String,
    @SerializedName("orgId")
    var orgId: String)  {


      fun build(): IsRootNodeParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          isRootNodeDocument,
          this
        );
      }

      private val isRootNodeDocument: String = """
query isRootNode(${'$'}nodeId: String!, ${'$'}orgId: String!) {
  isRootNode(nodeId: ${'$'}nodeId, orgId: ${'$'}orgId)
}
"""
    }



    data class IsUserExistsResponse (

        @SerializedName("isUserExists")
        val result: Boolean
    )

    class IsUserExistsParam @JvmOverloads constructor (    @SerializedName("email")
    var email: String? = null,
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("username")
    var username: String? = null,
    @SerializedName("externalId")
    var externalId: String? = null)  {

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

    fun withExternalId(externalId: String?): IsUserExistsParam {
      this.externalId = externalId
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
query isUserExists(${'$'}email: String, ${'$'}phone: String, ${'$'}username: String, ${'$'}externalId: String) {
  isUserExists(email: ${'$'}email, phone: ${'$'}phone, username: ${'$'}username, externalId: ${'$'}externalId)
}
"""
    }



    data class AuthorizedResourcesResponse (

        @SerializedName("authorizedResources")
        val result: PaginatedAuthorizedResources
    )

    class AuthorizedResourcesParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType? = null,
    @SerializedName("targetIdentifier")
    var targetIdentifier: String? = null,
    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("resourceType")
    var resourceType: String? = null)  {

    fun withTargetType(targetType: PolicyAssignmentTargetType?): AuthorizedResourcesParam {
      this.targetType = targetType
      return this
    }

    fun withTargetIdentifier(targetIdentifier: String?): AuthorizedResourcesParam {
      this.targetIdentifier = targetIdentifier
      return this
    }

    fun withNamespace(namespace: String?): AuthorizedResourcesParam {
      this.namespace = namespace
      return this
    }

    fun withResourceType(resourceType: String?): AuthorizedResourcesParam {
      this.resourceType = resourceType
      return this
    }

      fun build(): AuthorizedResourcesParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          authorizedResourcesDocument,
          this
        );
      }

      private val authorizedResourcesDocument: String = """
query authorizedResources(${'$'}targetType: PolicyAssignmentTargetType, ${'$'}targetIdentifier: String, ${'$'}namespace: String, ${'$'}resourceType: String) {
  authorizedResources(targetType: ${'$'}targetType, targetIdentifier: ${'$'}targetIdentifier, namespace: ${'$'}namespace, resourceType: ${'$'}resourceType) {
    totalCount
    list {
      code
      type
      actions
    }
  }
}
"""
    }



    data class ListGroupAuthorizedResourcesResponse (

        @SerializedName("group")
        val result: Group
    )

    class ListGroupAuthorizedResourcesParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("resourceType")
    var resourceType: String? = null)  {

    fun withNamespace(namespace: String?): ListGroupAuthorizedResourcesParam {
      this.namespace = namespace
      return this
    }

    fun withResourceType(resourceType: String?): ListGroupAuthorizedResourcesParam {
      this.resourceType = resourceType
      return this
    }

      fun build(): ListGroupAuthorizedResourcesParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          listGroupAuthorizedResourcesDocument,
          this
        );
      }

      private val listGroupAuthorizedResourcesDocument: String = """
query listGroupAuthorizedResources(${'$'}code: String!, ${'$'}namespace: String, ${'$'}resourceType: String) {
  group(code: ${'$'}code) {
    authorizedResources(namespace: ${'$'}namespace, resourceType: ${'$'}resourceType) {
      totalCount
      list {
        code
        type
        actions
      }
    }
  }
}
"""
    }



    data class ListNodeByCodeAuthorizedResourcesResponse (

        @SerializedName("nodeByCode")
        val result: Node
    )

    class ListNodeByCodeAuthorizedResourcesParam @JvmOverloads constructor (    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("code")
    var code: String,
    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("resourceType")
    var resourceType: ResourceType? = null)  {

    fun withNamespace(namespace: String?): ListNodeByCodeAuthorizedResourcesParam {
      this.namespace = namespace
      return this
    }

    fun withResourceType(resourceType: ResourceType?): ListNodeByCodeAuthorizedResourcesParam {
      this.resourceType = resourceType
      return this
    }

      fun build(): ListNodeByCodeAuthorizedResourcesParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          listNodeByCodeAuthorizedResourcesDocument,
          this
        );
      }

      private val listNodeByCodeAuthorizedResourcesDocument: String = """
query listNodeByCodeAuthorizedResources(${'$'}orgId: String!, ${'$'}code: String!, ${'$'}namespace: String, ${'$'}resourceType: String) {
  nodeByCode(orgId: ${'$'}orgId, code: ${'$'}code) {
    authorizedResources(namespace: ${'$'}namespace, resourceType: ${'$'}resourceType) {
      totalCount
      list {
        code
        type
        actions
      }
    }
  }
}
"""
    }



    data class ListNodeByIdAuthorizedResourcesResponse (

        @SerializedName("nodeById")
        val result: Node
    )

    class ListNodeByIdAuthorizedResourcesParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String,
    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("resourceType")
    var resourceType: String? = null)  {

    fun withNamespace(namespace: String?): ListNodeByIdAuthorizedResourcesParam {
      this.namespace = namespace
      return this
    }

    fun withResourceType(resourceType: String?): ListNodeByIdAuthorizedResourcesParam {
      this.resourceType = resourceType
      return this
    }

      fun build(): ListNodeByIdAuthorizedResourcesParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          listNodeByIdAuthorizedResourcesDocument,
          this
        );
      }

      private val listNodeByIdAuthorizedResourcesDocument: String = """
query listNodeByIdAuthorizedResources(${'$'}id: String!, ${'$'}namespace: String, ${'$'}resourceType: String) {
  nodeById(id: ${'$'}id) {
    authorizedResources(namespace: ${'$'}namespace, resourceType: ${'$'}resourceType) {
      totalCount
      list {
        code
        type
        actions
      }
    }
  }
}
"""
    }



    data class ListRoleAuthorizedResourcesResponse (

        @SerializedName("role")
        val result: Role
    )

    class ListRoleAuthorizedResourcesParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("resourceType")
    var resourceType: String? = null)  {

    fun withNamespace(namespace: String?): ListRoleAuthorizedResourcesParam {
      this.namespace = namespace
      return this
    }

    fun withResourceType(resourceType: String?): ListRoleAuthorizedResourcesParam {
      this.resourceType = resourceType
      return this
    }

      fun build(): ListRoleAuthorizedResourcesParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          listRoleAuthorizedResourcesDocument,
          this
        );
      }

      private val listRoleAuthorizedResourcesDocument: String = """
query listRoleAuthorizedResources(${'$'}code: String!, ${'$'}namespace: String, ${'$'}resourceType: String) {
  role(code: ${'$'}code, namespace: ${'$'}namespace) {
    authorizedResources(resourceType: ${'$'}resourceType) {
      totalCount
      list {
        code
        type
        actions
      }
    }
  }
}
"""
    }



    data class ListUserAuthorizedResourcesResponse (

        @SerializedName("user")
        val result: User
    )

    class ListUserAuthorizedResourcesParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String,
    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("resourceType")
    var resourceType: String? = null)  {

    fun withNamespace(namespace: String?): ListUserAuthorizedResourcesParam {
      this.namespace = namespace
      return this
    }

    fun withResourceType(resourceType: String?): ListUserAuthorizedResourcesParam {
      this.resourceType = resourceType
      return this
    }

      fun build(): ListUserAuthorizedResourcesParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          listUserAuthorizedResourcesDocument,
          this
        );
      }

      private val listUserAuthorizedResourcesDocument: String = """
query listUserAuthorizedResources(${'$'}id: String!, ${'$'}namespace: String, ${'$'}resourceType: String) {
  user(id: ${'$'}id) {
    authorizedResources(namespace: ${'$'}namespace, resourceType: ${'$'}resourceType) {
      totalCount
      list {
        code
        type
        actions
        apiIdentifier
      }
    }
  }
}
"""
    }



    data class NodeByCodeResponse (

        @SerializedName("nodeByCode")
        val result: Node
    )

    class NodeByCodeParam @JvmOverloads constructor (    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("code")
    var code: String)  {


      fun build(): NodeByCodeParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          nodeByCodeDocument,
          this
        );
      }

      private val nodeByCodeDocument: String = """
query nodeByCode(${'$'}orgId: String!, ${'$'}code: String!) {
  nodeByCode(orgId: ${'$'}orgId, code: ${'$'}code) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
  }
}
"""
    }



    data class NodeByCodeWithMembersResponse (

        @SerializedName("nodeByCode")
        val result: Node
    )

    class NodeByCodeWithMembersParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("code")
    var code: String)  {

    fun withPage(page: Int?): NodeByCodeWithMembersParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): NodeByCodeWithMembersParam {
      this.limit = limit
      return this
    }

    fun withSortBy(sortBy: SortByEnum?): NodeByCodeWithMembersParam {
      this.sortBy = sortBy
      return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): NodeByCodeWithMembersParam {
      this.includeChildrenNodes = includeChildrenNodes
      return this
    }

      fun build(): NodeByCodeWithMembersParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          nodeByCodeWithMembersDocument,
          this
        );
      }

      private val nodeByCodeWithMembersDocument: String = """
query nodeByCodeWithMembers(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}orgId: String!, ${'$'}code: String!) {
  nodeByCode(orgId: ${'$'}orgId, code: ${'$'}code) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
      list {
        id
        arn
        userPoolId
        status
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



    data class NodeByIdResponse (

        @SerializedName("nodeById")
        val result: Node
    )

    class NodeByIdParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String)  {


      fun build(): NodeByIdParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          nodeByIdDocument,
          this
        );
      }

      private val nodeByIdDocument: String = """
query nodeById(${'$'}id: String!) {
  nodeById(id: ${'$'}id) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    createdAt
    updatedAt
    children
  }
}
"""
    }



    data class NodeByIdWithMembersResponse (

        @SerializedName("nodeById")
        val result: Node
    )

    class NodeByIdWithMembersParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("id")
    var id: String)  {

    fun withPage(page: Int?): NodeByIdWithMembersParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): NodeByIdWithMembersParam {
      this.limit = limit
      return this
    }

    fun withSortBy(sortBy: SortByEnum?): NodeByIdWithMembersParam {
      this.sortBy = sortBy
      return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean?): NodeByIdWithMembersParam {
      this.includeChildrenNodes = includeChildrenNodes
      return this
    }

      fun build(): NodeByIdWithMembersParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          nodeByIdWithMembersDocument,
          this
        );
      }

      private val nodeByIdWithMembersDocument: String = """
query nodeByIdWithMembers(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}id: String!) {
  nodeById(id: ${'$'}id) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    createdAt
    updatedAt
    children
    users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy, includeChildrenNodes: ${'$'}includeChildrenNodes) {
      totalCount
      list {
        id
        arn
        userPoolId
        status
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



    data class OrgResponse (

        @SerializedName("org")
        val result: Org
    )

    class OrgParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String)  {


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
query org(${'$'}id: String!) {
  org(id: ${'$'}id) {
    id
    rootNode {
      id
      orgId
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
    nodes {
      id
      orgId
      name
      nameI18n
      description
      descriptionI18n
      order
      code
      root
      depth
      path
      createdAt
      updatedAt
      children
    }
  }
}
"""
    }



    data class OrgsResponse (

        @SerializedName("orgs")
        val result: PaginatedOrgs
    )

    class OrgsParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null)  {

    fun withPage(page: Int?): OrgsParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): OrgsParam {
      this.limit = limit
      return this
    }

    fun withSortBy(sortBy: SortByEnum?): OrgsParam {
      this.sortBy = sortBy
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
query orgs(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  orgs(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
    totalCount
    list {
      id
      rootNode {
        id
        name
        nameI18n
        path
        description
        descriptionI18n
        order
        code
        root
        depth
        createdAt
        updatedAt
        children
      }
      nodes {
        id
        name
        path
        nameI18n
        description
        descriptionI18n
        order
        code
        root
        depth
        createdAt
        updatedAt
        children
      }
    }
  }
}
"""
    }



    data class PoliciesResponse (

        @SerializedName("policies")
        val result: PaginatedPolicies
    )

    class PoliciesParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withPage(page: Int?): PoliciesParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): PoliciesParam {
      this.limit = limit
      return this
    }

    fun withNamespace(namespace: String?): PoliciesParam {
      this.namespace = namespace
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
query policies(${'$'}page: Int, ${'$'}limit: Int, ${'$'}namespace: String) {
  policies(page: ${'$'}page, limit: ${'$'}limit, namespace: ${'$'}namespace) {
    totalCount
    list {
      namespace
      code
      description
      createdAt
      updatedAt
      statements {
        resource
        actions
        effect
        condition {
          param
          operator
          value
        }
      }
    }
  }
}
"""
    }



    data class PolicyResponse (

        @SerializedName("policy")
        val result: Policy
    )

    class PolicyParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("code")
    var code: String)  {

    fun withNamespace(namespace: String?): PolicyParam {
      this.namespace = namespace
      return this
    }

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
query policy(${'$'}namespace: String, ${'$'}code: String!) {
  policy(code: ${'$'}code, namespace: ${'$'}namespace) {
    namespace
    code
    isDefault
    description
    statements {
      resource
      actions
      effect
      condition {
        param
        operator
        value
      }
    }
    createdAt
    updatedAt
  }
}
"""
    }



    data class PolicyAssignmentsResponse (

        @SerializedName("policyAssignments")
        val result: PaginatedPolicyAssignments
    )

    class PolicyAssignmentsParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType? = null,
    @SerializedName("targetIdentifier")
    var targetIdentifier: String? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null)  {

    fun withNamespace(namespace: String?): PolicyAssignmentsParam {
      this.namespace = namespace
      return this
    }

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
query policyAssignments(${'$'}namespace: String, ${'$'}code: String, ${'$'}targetType: PolicyAssignmentTargetType, ${'$'}targetIdentifier: String, ${'$'}page: Int, ${'$'}limit: Int) {
  policyAssignments(namespace: ${'$'}namespace, code: ${'$'}code, targetType: ${'$'}targetType, targetIdentifier: ${'$'}targetIdentifier, page: ${'$'}page, limit: ${'$'}limit) {
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



    data class PolicyWithAssignmentsResponse (

        @SerializedName("policy")
        val result: Policy
    )

    class PolicyWithAssignmentsParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("code")
    var code: String)  {

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



    data class PreviewEmailResponse (

        @SerializedName("previewEmail")
        val result: String
    )

    class PreviewEmailParam @JvmOverloads constructor (    @SerializedName("type")
    var type: EmailTemplateType)  {


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



    data class QiniuUptokenResponse (

        @SerializedName("qiniuUptoken")
        val result: String
    )

    class QiniuUptokenParam @JvmOverloads constructor (    @SerializedName("type")
    var type: String? = null)  {

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



    data class QueryMfaResponse (

        @SerializedName("queryMfa")
        val result: Mfa
    )

    class QueryMfaParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String? = null,
    @SerializedName("userId")
    var userId: String? = null,
    @SerializedName("userPoolId")
    var userPoolId: String? = null)  {

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



    data class RoleResponse (

        @SerializedName("role")
        val result: Role
    )

    class RoleParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("namespace")
    var namespace: String? = null)  {

    fun withNamespace(namespace: String?): RoleParam {
      this.namespace = namespace
      return this
    }

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
query role(${'$'}code: String!, ${'$'}namespace: String) {
  role(code: ${'$'}code, namespace: ${'$'}namespace) {
    id
    namespace
    code
    arn
    description
    createdAt
    updatedAt
    parent {
      namespace
      code
      arn
      description
      createdAt
      updatedAt
    }
  }
}
"""
    }



    data class RoleWithUsersResponse (

        @SerializedName("role")
        val result: Role
    )

    class RoleWithUsersParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null)  {

    fun withNamespace(namespace: String?): RoleWithUsersParam {
      this.namespace = namespace
      return this
    }

    fun withPage(page: Int?): RoleWithUsersParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): RoleWithUsersParam {
      this.limit = limit
      return this
    }

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
query roleWithUsers(${'$'}code: String!, ${'$'}namespace: String, ${'$'}page: Int, ${'$'}limit: Int) {
  role(code: ${'$'}code, namespace: ${'$'}namespace) {
    users(page: ${'$'}page, limit: ${'$'}limit) {
      totalCount
      list {
        id
        arn
        status
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



    data class RoleWithUsersWithCustomDataResponse (

        @SerializedName("role")
        val result: Role
    )

    class RoleWithUsersWithCustomDataParam @JvmOverloads constructor (    @SerializedName("code")
    var code: String,
    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null)  {

    fun withNamespace(namespace: String?): RoleWithUsersWithCustomDataParam {
      this.namespace = namespace
      return this
    }

    fun withPage(page: Int?): RoleWithUsersWithCustomDataParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): RoleWithUsersWithCustomDataParam {
      this.limit = limit
      return this
    }

      fun build(): RoleWithUsersWithCustomDataParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          roleWithUsersWithCustomDataDocument,
          this
        );
      }

      private val roleWithUsersWithCustomDataDocument: String = """
query roleWithUsersWithCustomData(${'$'}code: String!, ${'$'}namespace: String, ${'$'}page: Int, ${'$'}limit: Int) {
  role(code: ${'$'}code, namespace: ${'$'}namespace) {
    users(page: ${'$'}page, limit: ${'$'}limit) {
      totalCount
      list {
        id
        arn
        status
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
        customData {
          key
          value
          dataType
          label
        }
      }
    }
  }
}
"""
    }



    data class RolesResponse (

        @SerializedName("roles")
        val result: PaginatedRoles
    )

    class RolesParam @JvmOverloads constructor (    @SerializedName("namespace")
    var namespace: String? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null)  {

    fun withNamespace(namespace: String?): RolesParam {
      this.namespace = namespace
      return this
    }

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
query roles(${'$'}namespace: String, ${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  roles(namespace: ${'$'}namespace, page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
    totalCount
    list {
      id
      namespace
      code
      arn
      description
      createdAt
      updatedAt
    }
  }
}
"""
    }



    data class RootNodeResponse (

        @SerializedName("rootNode")
        val result: Node
    )

    class RootNodeParam @JvmOverloads constructor (    @SerializedName("orgId")
    var orgId: String)  {


      fun build(): RootNodeParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          rootNodeDocument,
          this
        );
      }

      private val rootNodeDocument: String = """
query rootNode(${'$'}orgId: String!) {
  rootNode(orgId: ${'$'}orgId) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    codePath
    namePath
    createdAt
    updatedAt
    children
  }
}
"""
    }



    data class SearchNodesResponse (

        @SerializedName("searchNodes")
        val result: List<Node>
    )

    class SearchNodesParam @JvmOverloads constructor (    @SerializedName("keyword")
    var keyword: String)  {


      fun build(): SearchNodesParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          searchNodesDocument,
          this
        );
      }

      private val searchNodesDocument: String = """
query searchNodes(${'$'}keyword: String!) {
  searchNodes(keyword: ${'$'}keyword) {
    id
    orgId
    name
    nameI18n
    description
    descriptionI18n
    order
    code
    root
    depth
    path
    codePath
    namePath
    createdAt
    updatedAt
    children
  }
}
"""
    }



    data class SearchUserResponse (

        @SerializedName("searchUser")
        val result: PaginatedUsers
    )

    class SearchUserParam @JvmOverloads constructor (    @SerializedName("query")
    var query: String,
    @SerializedName("fields")
    var fields: List<String>? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("departmentOpts")
    var departmentOpts: List<SearchUserDepartmentOptInput>? = null,
    @SerializedName("groupOpts")
    var groupOpts: List<SearchUserGroupOptInput>? = null,
    @SerializedName("roleOpts")
    var roleOpts: List<SearchUserRoleOptInput>? = null)  {

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

    fun withDepartmentOpts(departmentOpts: List<SearchUserDepartmentOptInput>?): SearchUserParam {
      this.departmentOpts = departmentOpts
      return this
    }

    fun withGroupOpts(groupOpts: List<SearchUserGroupOptInput>?): SearchUserParam {
      this.groupOpts = groupOpts
      return this
    }

    fun withRoleOpts(roleOpts: List<SearchUserRoleOptInput>?): SearchUserParam {
      this.roleOpts = roleOpts
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
query searchUser(${'$'}query: String!, ${'$'}fields: [String], ${'$'}page: Int, ${'$'}limit: Int, ${'$'}departmentOpts: [SearchUserDepartmentOpt], ${'$'}groupOpts: [SearchUserGroupOpt], ${'$'}roleOpts: [SearchUserRoleOpt]) {
  searchUser(query: ${'$'}query, fields: ${'$'}fields, page: ${'$'}page, limit: ${'$'}limit, departmentOpts: ${'$'}departmentOpts, groupOpts: ${'$'}groupOpts, roleOpts: ${'$'}roleOpts) {
    totalCount
    list {
      id
      arn
      userPoolId
      status
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



    data class SearchUserWithCustomDataResponse (

        @SerializedName("searchUser")
        val result: PaginatedUsers
    )

    class SearchUserWithCustomDataParam @JvmOverloads constructor (    @SerializedName("query")
    var query: String,
    @SerializedName("fields")
    var fields: List<String>? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("departmentOpts")
    var departmentOpts: List<SearchUserDepartmentOptInput>? = null,
    @SerializedName("groupOpts")
    var groupOpts: List<SearchUserGroupOptInput>? = null,
    @SerializedName("roleOpts")
    var roleOpts: List<SearchUserRoleOptInput>? = null)  {

    fun withFields(fields: List<String>?): SearchUserWithCustomDataParam {
      this.fields = fields
      return this
    }

    fun withPage(page: Int?): SearchUserWithCustomDataParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): SearchUserWithCustomDataParam {
      this.limit = limit
      return this
    }

    fun withDepartmentOpts(departmentOpts: List<SearchUserDepartmentOptInput>?): SearchUserWithCustomDataParam {
      this.departmentOpts = departmentOpts
      return this
    }

    fun withGroupOpts(groupOpts: List<SearchUserGroupOptInput>?): SearchUserWithCustomDataParam {
      this.groupOpts = groupOpts
      return this
    }

    fun withRoleOpts(roleOpts: List<SearchUserRoleOptInput>?): SearchUserWithCustomDataParam {
      this.roleOpts = roleOpts
      return this
    }

      fun build(): SearchUserWithCustomDataParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          searchUserWithCustomDataDocument,
          this
        );
      }

      private val searchUserWithCustomDataDocument: String = """
query searchUserWithCustomData(${'$'}query: String!, ${'$'}fields: [String], ${'$'}page: Int, ${'$'}limit: Int, ${'$'}departmentOpts: [SearchUserDepartmentOpt], ${'$'}groupOpts: [SearchUserGroupOpt], ${'$'}roleOpts: [SearchUserRoleOpt]) {
  searchUser(query: ${'$'}query, fields: ${'$'}fields, page: ${'$'}page, limit: ${'$'}limit, departmentOpts: ${'$'}departmentOpts, groupOpts: ${'$'}groupOpts, roleOpts: ${'$'}roleOpts) {
    totalCount
    list {
      id
      arn
      userPoolId
      status
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
      customData {
        key
        value
        dataType
        label
      }
    }
  }
}
"""
    }



    data class SocialConnectionResponse (

        @SerializedName("socialConnection")
        val result: SocialConnection
    )

    class SocialConnectionParam @JvmOverloads constructor (    @SerializedName("provider")
    var provider: String)  {


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



    data class SocialConnectionInstanceResponse (

        @SerializedName("socialConnectionInstance")
        val result: SocialConnectionInstance
    )

    class SocialConnectionInstanceParam @JvmOverloads constructor (    @SerializedName("provider")
    var provider: String)  {


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



    data class SocialConnectionInstancesResponse (

        @SerializedName("socialConnectionInstances")
        val result: List<SocialConnectionInstance>
    )

    class SocialConnectionInstancesParam   {


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



    data class SocialConnectionsResponse (

        @SerializedName("socialConnections")
        val result: List<SocialConnection>
    )

    class SocialConnectionsParam   {


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



    data class TemplateCodeResponse (

        @SerializedName("templateCode")
        val result: String
    )

    class TemplateCodeParam   {


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



    data class UdfResponse (

        @SerializedName("udf")
        val result: List<UserDefinedField>
    )

    class UdfParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: UdfTargetType)  {


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



    data class UdfValueBatchResponse (

        @SerializedName("udfValueBatch")
        val result: List<UserDefinedDataMap>
    )

    class UdfValueBatchParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("targetIds")
    var targetIds: List<String>)  {


      fun build(): UdfValueBatchParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          udfValueBatchDocument,
          this
        );
      }

      private val udfValueBatchDocument: String = """
query udfValueBatch(${'$'}targetType: UDFTargetType!, ${'$'}targetIds: [String!]!) {
  udfValueBatch(targetType: ${'$'}targetType, targetIds: ${'$'}targetIds) {
    targetId
    data {
      key
      dataType
      value
      label
    }
  }
}
"""
    }



    data class UdvResponse (

        @SerializedName("udv")
        val result: List<UserDefinedData>
    )

    class UdvParam @JvmOverloads constructor (    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("targetId")
    var targetId: String)  {


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
    label
  }
}
"""
    }



    data class UserResponse (

        @SerializedName("user")
        val result: User
    )

    class UserParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String? = null)  {

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

        fun createGjsRequest(): GraphQLRequest {
            return GraphQLRequest(
                    gjsUserDocument,
                    this
            );
        }

      private val userDocument: String = """
query user(${'$'}id: String) {
  user(id: ${'$'}id) {
    id
    arn
    userPoolId
    status
    username
    email
    emailVerified
    phone
    phoneVerified
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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

        private val gjsUserDocument: String = """
query user(${'$'}id: String) {
  user(id: ${'$'}id) {
    id
    arn
    userPoolId
    status
    username
    email
    emailVerified
    phone
    phoneVerified
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    secondaryUserIds
  }
}
"""

    }



    data class UserBatchResponse (

        @SerializedName("userBatch")
        val result: List<User>
    )

    class UserBatchParam @JvmOverloads constructor (    @SerializedName("ids")
    var ids: List<String>,
    @SerializedName("type")
    var type: String? = null)  {

    fun withType(type: String?): UserBatchParam {
      this.type = type
      return this
    }

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
query userBatch(${'$'}ids: [String!]!, ${'$'}type: String) {
  userBatch(ids: ${'$'}ids, type: ${'$'}type) {
    id
    arn
    userPoolId
    status
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



    data class UserBatchWithCustomDataResponse (

        @SerializedName("userBatch")
        val result: List<User>
    )

    class UserBatchWithCustomDataParam @JvmOverloads constructor (    @SerializedName("ids")
    var ids: List<String>,
    @SerializedName("type")
    var type: String? = null)  {

    fun withType(type: String?): UserBatchWithCustomDataParam {
      this.type = type
      return this
    }

      fun build(): UserBatchWithCustomDataParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          userBatchWithCustomDataDocument,
          this
        );
      }

      private val userBatchWithCustomDataDocument: String = """
query userBatchWithCustomData(${'$'}ids: [String!]!, ${'$'}type: String) {
  userBatch(ids: ${'$'}ids, type: ${'$'}type) {
    id
    arn
    userPoolId
    status
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
    customData {
      key
      value
      dataType
      label
    }
  }
}
"""
    }



    data class UserWithCustomDataResponse (

        @SerializedName("user")
        val result: User
    )

    class UserWithCustomDataParam @JvmOverloads constructor (    @SerializedName("id")
    var id: String? = null)  {

    fun withId(id: String?): UserWithCustomDataParam {
      this.id = id
      return this
    }

      fun build(): UserWithCustomDataParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          userWithCustomDataDocument,
          this
        );
      }

      private val userWithCustomDataDocument: String = """
query userWithCustomData(${'$'}id: String) {
  user(id: ${'$'}id) {
    id
    arn
    userPoolId
    status
    username
    email
    emailVerified
    phone
    phoneVerified
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    customData {
      key
      value
      dataType
      label
    }
  }
}
"""
    }



    data class UserpoolResponse (

        @SerializedName("userpool")
        val result: UserPool
    )

    class UserpoolParam   {


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
    ownerId
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
    appSsoEnabled
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
      config
    }
    packageType
    useCustomUserStore
    loginRequireEmailVerified
    verifyCodeLength
  }
}
"""
    }



    data class UserpoolTypesResponse (

        @SerializedName("userpoolTypes")
        val result: List<UserPoolType>
    )

    class UserpoolTypesParam   {


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



    data class UserpoolsResponse (

        @SerializedName("userpools")
        val result: PaginatedUserpool
    )

    class UserpoolsParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null)  {

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
      ownerId
      description
      secret
      jwtSecret
      logo
      createdAt
      updatedAt
      emailVerifiedDefault
      sendWelcomeEmail
      registerDisabled
      appSsoEnabled
      showWxQRCodeWhenRegisterDisabled
      allowedOrigins
      tokenExpiresAfter
      isDeleted
      packageType
      useCustomUserStore
      loginRequireEmailVerified
      verifyCodeLength
    }
  }
}
"""
    }



    data class UsersResponse (

        @SerializedName("users")
        val result: PaginatedUsers
    )

    class UsersParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("withCustomData")
    var withCustomData: Boolean? = null)
    {
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
      status
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



    data class UsersWithCustomDataResponse (

        @SerializedName("users")
        val result: PaginatedUsers
    )

    class UsersWithCustomDataParam @JvmOverloads constructor (    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null)  {

    fun withPage(page: Int?): UsersWithCustomDataParam {
      this.page = page
      return this
    }

    fun withLimit(limit: Int?): UsersWithCustomDataParam {
      this.limit = limit
      return this
    }

    fun withSortBy(sortBy: SortByEnum?): UsersWithCustomDataParam {
      this.sortBy = sortBy
      return this
    }

      fun build(): UsersWithCustomDataParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          usersWithCustomDataDocument,
          this
        );
      }

      private val usersWithCustomDataDocument: String = """
query usersWithCustomData(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum) {
  users(page: ${'$'}page, limit: ${'$'}limit, sortBy: ${'$'}sortBy) {
    totalCount
    list {
      id
      arn
      userPoolId
      status
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
      customData {
        key
        value
        dataType
        label
      }
    }
  }
}
"""
    }



    data class WhitelistResponse (

        @SerializedName("whitelist")
        val result: List<WhiteList>
    )

    class WhitelistParam @JvmOverloads constructor (    @SerializedName("type")
    var type: WhitelistType)  {


      fun build(): WhitelistParam {
        return this
      }

      fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
          whitelistDocument,
          this
        );
      }

      private val whitelistDocument: String = """
query whitelist(${'$'}type: WhitelistType!) {
  whitelist(type: ${'$'}type) {
    createdAt
    updatedAt
    value
  }
}
"""
    }

    data class SendFirstLoginVerifyEmailResponse (
        @SerializedName("sendFirstLoginVerifyEmail")
        var sendFirstLoginVerifyEmail: CommonMessage
    )


    class SendFirstLoginVerifyEmailParam @JvmOverloads constructor (
        @SerializedName("appId")
        var appId: String,
        @SerializedName("userId")
        var userId: String) {

        fun createRequest(): GraphQLRequest {
            return GraphQLRequest(
                sendFirstLoginVerifyEmailDocument,
                this
            );
        }

        private val sendFirstLoginVerifyEmailDocument: String = """
    mutation sendFirstLoginVerifyEmail(${'$'}userId: String!, ${'$'}appId: String!) {
  sendFirstLoginVerifyEmail(userId: ${'$'}userId, appId: ${'$'}appId) {
    message
    code
  }
}
"""
    }


    data class DisableAssignmentResponse (

        @SerializedName("disbalePolicyAssignment")
        var disbalePolicyAssignment: CommonMessage

    )


    class DisableAssignmentParam @JvmOverloads constructor (

        @SerializedName("policy")
        var policy: String,
        @SerializedName("targetType")
        var targetType: PolicyAssignmentTargetType,
        @SerializedName("targetIdentifier")
        var targetIdentifier: String,
        @SerializedName("namespace")
        var namespace: String?) {

        fun createRequest(): GraphQLRequest {
            return GraphQLRequest(
                disableAssignmentDocument,
                this
            );
        }

        private val disableAssignmentDocument: String = """
    mutation disbalePolicyAssignment(${'$'}policy: String!, ${'$'}targetType: PolicyAssignmentTargetType!, ${'$'}targetIdentifier: String!, ${'$'}namespace: String) {
  disbalePolicyAssignment(policy: ${'$'}policy, targetType: ${'$'}targetType, targetIdentifier: ${'$'}targetIdentifier, namespace: ${'$'}namespace) {
    message
    code
  }
}
    """
    }


    data class EnableAssignmentResponse (

        @SerializedName("enablePolicyAssignment")
        var enablePolicyAssignment: CommonMessage

    )


    class EnableAssignmentParam @JvmOverloads constructor (

        @SerializedName("policy")
        var policy: String,
        @SerializedName("targetType")
        var targetType: PolicyAssignmentTargetType,
        @SerializedName("targetIdentifier")
        var targetIdentifier: String,
        @SerializedName("namespace")
        var namespace: String?) {

        fun createRequest(): GraphQLRequest {
            return GraphQLRequest(
                enableAssignmentDocument,
                this
            );
        }

        private val enableAssignmentDocument: String = """
        mutation enablePolicyAssignment(${'$'}policy: String!, ${'$'}targetType: PolicyAssignmentTargetType!, ${'$'}targetIdentifier: String!, ${'$'}namespace: String) {
      enablePolicyAssignment(policy: ${'$'}policy, targetType: ${'$'}targetType, targetIdentifier: ${'$'}targetIdentifier, namespace: ${'$'}namespace) {
        message
        code
      }
    }
        """
    }


    data class MoveMembersResponse (
        @SerializedName("moveMembers")
        var moveMembers: CommonMessage
    )


    class MoveMembersParam @JvmOverloads constructor (

        @SerializedName("userIds")
        var userIds: List<String>,
        @SerializedName("targetNodeId")
        var targetNodeId: String,
        @SerializedName("sourceNodeId")
        var sourceNodeId: String) {

        fun createRequest(): GraphQLRequest {
            return GraphQLRequest(
                moveMembersDocument,
                this
            );
        }

        private val moveMembersDocument: String = """
            mutation moveMembers(${'$'}userIds: [String!]!, ${'$'}sourceNodeId: String!, ${'$'}targetNodeId: String!) {
          moveMembers(userIds: ${'$'}userIds, sourceNodeId: ${'$'}sourceNodeId, targetNodeId: ${'$'}targetNodeId) {
            code
            message
          }
        }
            """
    }


    data class ListAuthorizedResourcesResponse (
        @SerializedName("authorizedResources")
        var authorizedResources: PaginatedAuthorizedResources
    )


    class ListAuthorizedResourcesParam @JvmOverloads constructor (

        @SerializedName("targetType")
        var targetType: PolicyAssignmentTargetType,
        @SerializedName("targetIdentifier")
        var targetIdentifier: String,
        @SerializedName("namespace")
        var namespace: String,
        @SerializedName("resourceType")
        var resourceType: ResourceType?) {

        fun createRequest(): GraphQLRequest {
            return GraphQLRequest(
                authorizedResourcesDocument,
                this
            );
        }

        private val authorizedResourcesDocument: String = """
        query authorizedResources(${'$'}targetType: PolicyAssignmentTargetType, ${'$'}targetIdentifier: String, ${'$'}namespace: String, ${'$'}resourceType: String) {
      authorizedResources(targetType: ${'$'}targetType, targetIdentifier: ${'$'}targetIdentifier, namespace: ${'$'}namespace, resourceType: ${'$'}resourceType) {
        totalCount
        list {
          code
          type
          actions
          apiIdentifier
        }
      }
    }
                """
    }


    data class ResetPasswordByFirstLoginTokenResponse (
        @SerializedName("resetPasswordByFirstLoginToken")
        var resetPasswordByFirstLoginToken: CommonMessage
    )


    class ResetPasswordByFirstLoginTokenParam @JvmOverloads constructor (

        @SerializedName("token")
        var token: String,
        @SerializedName("password")
        var password: String
    ) {

        fun createRequest(): GraphQLRequest {
            return GraphQLRequest(
                resetPasswordByFirstLoginTokenDocument,
                this
            );
        }

        private val resetPasswordByFirstLoginTokenDocument: String = """
            mutation resetPasswordByFirstLoginToken(${'$'}token: String!, ${'$'}password: String!) {
          resetPasswordByFirstLoginToken(token: ${'$'}token, password: ${'$'}password) {
            message
            code
          }
        }
                    """
    }


    data class ResetPasswordByForceResetTokenResponse (
        @SerializedName("resetPasswordByFirstLoginToken")
        var resetPasswordByFirstLoginToken: CommonMessage
    )


    class ResetPasswordByForceResetTokenParam @JvmOverloads constructor (

        @SerializedName("token")
        var token: String,
        @SerializedName("oldPassword")
        var oldPassword: String,
        @SerializedName("newPassword")
        var newPassword: String
    ) {

        fun createRequest(): GraphQLRequest {
            return GraphQLRequest(
                resetPasswordByForceResetTokenDocument,
                this
            );
        }

        private val resetPasswordByForceResetTokenDocument: String = """
            mutation resetPasswordByForceResetToken(${'$'}token: String!, ${'$'}oldPassword: String!, ${'$'}newPassword: String!) {
          resetPasswordByForceResetToken(token: ${'$'}token, oldPassword: ${'$'}oldPassword, newPassword: ${'$'}newPassword) {
            message
            code
          }
        }
                        """
    }


     class OrgStartSyncParam @JvmOverloads constructor (

        @SerializedName("connectionId")
        var adConnectorId: String? = null

    )

    class CodeChallengeDigestParam constructor(
        var codeChallenge: String,
        var method: String
    )

    class ValidateTicketV1Response constructor(
        var valid: Boolean? = false,
        var message: String? = null
    )


    data class Tenant (

        @SerializedName("resetPasswordByFirstLoginToken")
        var apps: List<App>?,
        var userPoolId: String?,
        var name: String?,
        var logo: String?,
        var description: String?,
        var ssoPageCustomizationSettings: ISsoPageCustomizationSettings?,
        var defaultLoginTab: String?,
        var defaultRegisterTab: String?,
        var passwordTabConfig: ApplicationPasswordTabConfig?,
        var verifyCodeTabConfig: ApplicationVerifyCodeTabConfig?,
        var loginTabs: List<String>?,
        var registerTabs: List<String>?,
        var extendsFields: List<ExtendsField>?,
        var autoJoin: Boolean?,
        var rejectHint: String?
    )

    data class ApplicationPasswordTabConfig(
        var enabledLoginMethods: List<String>?
    )

    data class ApplicationVerifyCodeTabConfig(
        var enabledLoginMethods: List<String>?
    )


    data class UserTenantResponse(
        var id: String?,
        var arn: String?,
        var userPoolId: String?,
        var photo: String?,
        var email: String?,
        var emailVerified: Boolean?,
        var phone: String?,
        var phoneVerified: Boolean?,
        var unionid: String?,
        var openid: String?,
        var username: String?,
        var nickname: String?,
        var country: String?,
        var province: String?,
        var company: String?,
        var loginsCount: String?,
        var lastIp: String?,
        var name: String?,
        var givenName: String?,
        var familyName: String?,
        var middleName: String?,
        var profile: String?,
        var preferredUsername: String?,
        var website: String?,
        var gender: String?,
        var birthdate: String?,
        var zoneinfo: String?,
        var address: String?,
        var formatted: String?,
        var streetAddress: String?,
        var region: String?,
        var postalCode: String?,
        var city: String?,
        var blocked: Boolean?,
        var apps: List<Application>?,
        var tenants: List<Tenant>?
    )
