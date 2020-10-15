package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
import com.google.gson.annotations.SerializedName

data class Query(
    @SerializedName("qiniuUptoken")
    var qiniuUptoken: String? = null,
    @SerializedName("isDomainAvaliable")
    var isDomainAvaliable: Boolean? = null,
    @SerializedName("socialConnection")
    var socialConnection: SocialConnection? = null,
    @SerializedName("socialConnections")
    var socialConnections: Iterable<SocialConnection>,
    @SerializedName("socialConnectionInstance")
    var socialConnectionInstance: SocialConnectionInstance,
    @SerializedName("socialConnectionInstances")
    var socialConnectionInstances: Iterable<SocialConnectionInstance>,
    @SerializedName("emailTemplates")
    var emailTemplates: Iterable<EmailTemplate>,
    @SerializedName("previewEmail")
    var previewEmail: String,
    @SerializedName("templateCode")
    var templateCode: String,
    @SerializedName("function")
    var function: Function? = null,
    @SerializedName("functions")
    var functions: PaginatedFunctions,
    @SerializedName("group")
    var group: Group? = null,
    @SerializedName("groups")
    var groups: PaginatedGroups,
    @SerializedName("queryMfa")
    var queryMfa: Mfa? = null,
    @SerializedName("nodeById")
    var nodeById: Node? = null,
    @SerializedName("nodeByCode")
    var nodeByCode: Node? = null,
    @SerializedName("org")
    var org: Org,
    @SerializedName("orgs")
    var orgs: PaginatedOrgs,
    @SerializedName("childrenNodes")
    var childrenNodes: Iterable<Node>,
    @SerializedName("rootNode")
    var rootNode: Node,
    @SerializedName("isRootNode")
    var isRootNode: Boolean? = null,
    @SerializedName("checkPasswordStrength")
    var checkPasswordStrength: CheckPasswordStrengthResult,
    @SerializedName("isActionAllowed")
    var isActionAllowed: Boolean,
    @SerializedName("isActionDenied")
    var isActionDenied: Boolean,
    @SerializedName("policy")
    var policy: Policy? = null,
    @SerializedName("policies")
    var policies: PaginatedPolicies,
    @SerializedName("policyAssignments")
    var policyAssignments: PaginatedPolicyAssignment,
    @SerializedName("role")
    var role: Role? = null,
    @SerializedName("roles")
    var roles: PaginatedRoles,
    @SerializedName("udv")
    var udv: Iterable<UserDefinedData>,
    @SerializedName("udf")
    var udf: Iterable<UserDefinedField>,
    @SerializedName("user")
    var user: User? = null,
    @SerializedName("userBatch")
    var userBatch: Iterable<User>,
    @SerializedName("users")
    var users: PaginatedUsers,
    @SerializedName("searchUser")
    var searchUser: PaginatedUsers,
    @SerializedName("checkLoginStatus")
    var checkLoginStatus: JwtTokenStatus? = null,
    @SerializedName("isUserExists")
    var isUserExists: Boolean? = null,
    @SerializedName("userpool")
    var userpool: UserPool,
    @SerializedName("userpools")
    var userpools: PaginatedUserpool,
    @SerializedName("userpoolTypes")
    var userpoolTypes: Iterable<UserPoolType>,
    @SerializedName("accessToken")
    var accessToken: AccessTokenRes,
    @SerializedName("whitelist")
    var whitelist: Iterable<WhiteList>
)

data class SocialConnection(
    @SerializedName("provider")
    var provider: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("logo")
    var logo: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("fields")
    var fields: Iterable<SocialConnectionField>? = null
)

data class SocialConnectionField(
    @SerializedName("key")
    var key: String? = null,
    @SerializedName("label")
    var label: String? = null,
    @SerializedName("type")
    var type: String? = null,
    @SerializedName("placeholder")
    var placeholder: String? = null,
    @SerializedName("children")
    var children: Iterable<SocialConnectionField>? = null
)

data class SocialConnectionInstance(
    @SerializedName("provider")
    var provider: String,
    @SerializedName("enabled")
    var enabled: Boolean,
    @SerializedName("fields")
    var fields: Iterable<SocialConnectionInstanceField>? = null
)

data class SocialConnectionInstanceField(
    @SerializedName("key")
    var key: String,
    @SerializedName("value")
    var value: String
)

data class EmailTemplate(
    @SerializedName("type")
    var type: EmailTemplateType,
    @SerializedName("name")
    var name: String,
    @SerializedName("subject")
    var subject: String,
    @SerializedName("sender")
    var sender: String,
    @SerializedName("content")
    var content: String,
    @SerializedName("redirectTo")
    var redirectTo: String? = null,
    @SerializedName("hasURL")
    var hasURL: Boolean? = null,
    @SerializedName("expiresIn")
    var expiresIn: Int? = null,
    @SerializedName("enabled")
    var enabled: Boolean? = null,
    @SerializedName("isSystem")
    var isSystem: Boolean? = null
)

enum class EmailTemplateType(val label: String) {
    ResetPassword("RESET_PASSWORD"),
    PasswordResetedNotification("PASSWORD_RESETED_NOTIFICATION"),
    ChangePassword("CHANGE_PASSWORD"),
    Welcome("WELCOME"),
    VerifyEmail("VERIFY_EMAIL"),
    ChangeEmail("CHANGE_EMAIL");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): EmailTemplateType? {
            return values().find { it.label == label }
        }
    }
}

data class Function(
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("sourceCode")
    var sourceCode: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("url")
    var url: String? = null
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

data class PaginatedFunctions(
    @SerializedName("list")
    var list: Iterable<Function>,
    @SerializedName("totalCount")
    var totalCount: Int
)

data class Group(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("createdAt")
    var createdAt: String? = null,
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    @SerializedName("users")
    var users: PaginatedUsers
)

data class PaginatedUsers(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: Iterable<User>
)

data class User(
    @SerializedName("id")
    var id: String,
    @SerializedName("arn")
    var arn: String,
    @SerializedName("userPoolId")
    var userPoolId: String,
    @SerializedName("username")
    var username: String? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("emailVerified")
    var emailVerified: Boolean? = null,
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("phoneVerified")
    var phoneVerified: Boolean? = null,
    @SerializedName("unionid")
    var unionid: String? = null,
    @SerializedName("openid")
    var openid: String? = null,
    @SerializedName("identities")
    var identities: Iterable<Identity>? = null,
    @SerializedName("nickname")
    var nickname: String? = null,
    @SerializedName("registerSource")
    var registerSource: Iterable<String>,
    @SerializedName("photo")
    var photo: String? = null,
    @SerializedName("password")
    var password: String? = null,
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
    @SerializedName("browser")
    var browser: String? = null,
    @SerializedName("company")
    var company: String? = null,
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
    @SerializedName("city")
    var city: String? = null,
    @SerializedName("province")
    var province: String? = null,
    @SerializedName("country")
    var country: String? = null,
    @SerializedName("createdAt")
    var createdAt: String? = null,
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    @SerializedName("customData")
    var customData: String? = null,
    @SerializedName("roles")
    var roles: PaginatedRoles? = null,
    @SerializedName("groups")
    var groups: PaginatedGroups? = null
)

data class Identity(
    @SerializedName("openid")
    var openid: String? = null,
    @SerializedName("userIdInIdp")
    var userIdInIdp: String? = null,
    @SerializedName("userId")
    var userId: String? = null,
    @SerializedName("connectionId")
    var connectionId: String? = null,
    @SerializedName("isSocial")
    var isSocial: Boolean? = null,
    @SerializedName("provider")
    var provider: String? = null,
    @SerializedName("userPoolId")
    var userPoolId: String? = null
)

data class PaginatedRoles(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: Iterable<Role>
)

data class Role(
    @SerializedName("code")
    var code: String,
    @SerializedName("arn")
    var arn: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("isSystem")
    var isSystem: Boolean? = null,
    @SerializedName("createdAt")
    var createdAt: String? = null,
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    @SerializedName("users")
    var users: PaginatedUsers,
    @SerializedName("parent")
    var parent: Role? = null
)

data class PaginatedGroups(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: Iterable<Group>
)

data class Mfa(
    @SerializedName("id")
    var id: String,
    @SerializedName("userId")
    var userId: String,
    @SerializedName("userPoolId")
    var userPoolId: String,
    @SerializedName("enable")
    var enable: Boolean,
    @SerializedName("secret")
    var secret: String? = null
)

data class Node(
    @SerializedName("id")
    var id: String,
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
    var code: String? = null,
    @SerializedName("root")
    var root: Boolean? = null,
    @SerializedName("depth")
    var depth: Int? = null,
    @SerializedName("path")
    var path: Iterable<String>,
    @SerializedName("createdAt")
    var createdAt: String? = null,
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    @SerializedName("children")
    var children: Iterable<String>? = null,
    @SerializedName("users")
    var users: PaginatedUsers
)

data class Org(
    @SerializedName("id")
    var id: String,
    @SerializedName("rootNode")
    var rootNode: Node,
    @SerializedName("nodes")
    var nodes: Iterable<Node>
)

data class PaginatedOrgs(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: Iterable<Org>
)

data class CheckPasswordStrengthResult(
    @SerializedName("valid")
    var valid: Boolean,
    @SerializedName("message")
    var message: String? = null
)

data class Policy(
    @SerializedName("code")
    var code: String,
    @SerializedName("isDefault")
    var isDefault: Boolean,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("statements")
    var statements: Iterable<PolicyStatement>,
    @SerializedName("createdAt")
    var createdAt: String? = null,
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    @SerializedName("assignmentsCount")
    var assignmentsCount: Int,
    @SerializedName("assignments")
    var assignments: Iterable<PolicyAssignment>
)

data class PolicyStatement(
    @SerializedName("resource")
    var resource: String,
    @SerializedName("actions")
    var actions: Iterable<String>,
    @SerializedName("effect")
    var effect: PolicyEffect? = null
)

enum class PolicyEffect(val label: String) {
    Allow("ALLOW"),
    Deny("DENY");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): PolicyEffect? {
            return values().find { it.label == label }
        }
    }
}

data class PolicyAssignment(
    @SerializedName("code")
    var code: String,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    @SerializedName("targetIdentifier")
    var targetIdentifier: String
)

enum class PolicyAssignmentTargetType(val label: String) {
    User("USER"),
    Role("ROLE");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): PolicyAssignmentTargetType? {
            return values().find { it.label == label }
        }
    }
}

data class PaginatedPolicies(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: Iterable<Policy>
)

data class PaginatedPolicyAssignment(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: Iterable<PolicyAssignment>
)

enum class UdfTargetType(val label: String) {
    Node("NODE"),
    Org("ORG"),
    User("USER"),
    Userpool("USERPOOL"),
    Role("ROLE"),
    Permission("PERMISSION"),
    Application("APPLICATION");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): UdfTargetType? {
            return values().find { it.label == label }
        }
    }
}

data class UserDefinedData(
    @SerializedName("key")
    var key: String,
    @SerializedName("dataType")
    var dataType: UdfDataType,
    @SerializedName("value")
    var value: String
)

enum class UdfDataType(val label: String) {
    EString("STRING"),
    ENumber("NUMBER"),
    EDatetime("DATETIME"),
    EBoolean("BOOLEAN"),
    EObject("OBJECT");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): UdfDataType? {
            return values().find { it.label == label }
        }
    }
}

data class UserDefinedField(
    @SerializedName("targetType")
    var targetType: UdfTargetType,
    @SerializedName("dataType")
    var dataType: UdfDataType,
    @SerializedName("key")
    var key: String,
    @SerializedName("label")
    var label: String,
    @SerializedName("options")
    var options: String? = null
)

data class JwtTokenStatus(
    @SerializedName("code")
    var code: Int? = null,
    @SerializedName("message")
    var message: String? = null,
    @SerializedName("status")
    var status: Boolean? = null,
    @SerializedName("exp")
    var exp: Int? = null,
    @SerializedName("iat")
    var iat: Int? = null,
    @SerializedName("data")
    var data: JwtTokenStatusDetail? = null
)

data class JwtTokenStatusDetail(
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("userPoolId")
    var userPoolId: String? = null,
    @SerializedName("arn")
    var arn: String? = null
)

data class UserPool(
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("domain")
    var domain: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("secret")
    var secret: String,
    @SerializedName("jwtSecret")
    var jwtSecret: String,
    @SerializedName("userpoolTypes")
    var userpoolTypes: Iterable<UserPoolType>? = null,
    @SerializedName("logo")
    var logo: String,
    @SerializedName("createdAt")
    var createdAt: String? = null,
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    @SerializedName("emailVerifiedDefault")
    var emailVerifiedDefault: Boolean,
    @SerializedName("sendWelcomeEmail")
    var sendWelcomeEmail: Boolean,
    @SerializedName("registerDisabled")
    var registerDisabled: Boolean,
    @SerializedName("showWxQRCodeWhenRegisterDisabled")
    var showWxQRCodeWhenRegisterDisabled: Boolean? = null,
    @SerializedName("allowedOrigins")
    var allowedOrigins: String? = null,
    @SerializedName("tokenExpiresAfter")
    var tokenExpiresAfter: Int? = null,
    @SerializedName("isDeleted")
    var isDeleted: Boolean? = null,
    @SerializedName("frequentRegisterCheck")
    var frequentRegisterCheck: FrequentRegisterCheckConfig? = null,
    @SerializedName("loginFailCheck")
    var loginFailCheck: LoginFailCheckConfig? = null,
    @SerializedName("changePhoneStrategy")
    var changePhoneStrategy: ChangePhoneStrategy? = null,
    @SerializedName("changeEmailStrategy")
    var changeEmailStrategy: ChangeEmailStrategy? = null,
    @SerializedName("qrcodeLoginStrategy")
    var qrcodeLoginStrategy: QrcodeLoginStrategy? = null,
    @SerializedName("app2WxappLoginStrategy")
    var app2WxappLoginStrategy: App2WxappLoginStrategy? = null,
    @SerializedName("whitelist")
    var whitelist: RegisterWhiteListConfig? = null,
    @SerializedName("customSMSProvider")
    var customSMSProvider: CustomSmsProvider? = null
)

data class UserPoolType(
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("image")
    var image: String? = null,
    @SerializedName("sdks")
    var sdks: Iterable<String>? = null
)

data class FrequentRegisterCheckConfig(
    @SerializedName("timeInterval")
    var timeInterval: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("enabled")
    var enabled: Boolean? = null
)

data class LoginFailCheckConfig(
    @SerializedName("timeInterval")
    var timeInterval: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("enabled")
    var enabled: Boolean? = null
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

data class RegisterWhiteListConfig(
    @SerializedName("phoneEnabled")
    var phoneEnabled: Boolean? = null,
    @SerializedName("emailEnabled")
    var emailEnabled: Boolean? = null,
    @SerializedName("usernameEnabled")
    var usernameEnabled: Boolean? = null
)

data class CustomSmsProvider(
    @SerializedName("enabled")
    var enabled: Boolean? = null,
    @SerializedName("provider")
    var provider: String? = null,
    @SerializedName("config253")
    var config253: SmsConfig253? = null
)

data class SmsConfig253(
    @SerializedName("sendSmsApi")
    var sendSmsApi: String,
    @SerializedName("appId")
    var appId: String,
    @SerializedName("key")
    var key: String,
    @SerializedName("template")
    var template: String,
    @SerializedName("ttl")
    var ttl: Int
)

data class PaginatedUserpool(
    @SerializedName("totalCount")
    var totalCount: Int,
    @SerializedName("list")
    var list: Iterable<UserPool>
)

data class AccessTokenRes(
    @SerializedName("accessToken")
    var accessToken: String? = null,
    @SerializedName("exp")
    var exp: Int? = null,
    @SerializedName("iat")
    var iat: Int? = null
)

enum class WhitelistType(val label: String) {
    Username("USERNAME"),
    Email("EMAIL"),
    Phone("PHONE");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): WhitelistType? {
            return values().find { it.label == label }
        }
    }
}

data class WhiteList(
    @SerializedName("createdAt")
    var createdAt: String? = null,
    @SerializedName("updatedAt")
    var updatedAt: String? = null,
    @SerializedName("value")
    var value: String
)

data class Mutation(
    @SerializedName("createSocialConnection")
    var createSocialConnection: SocialConnection,
    @SerializedName("createSocialConnectionInstance")
    var createSocialConnectionInstance: SocialConnectionInstance,
    @SerializedName("enableSocialConnectionInstance")
    var enableSocialConnectionInstance: SocialConnectionInstance,
    @SerializedName("disableSocialConnectionInstance")
    var disableSocialConnectionInstance: SocialConnectionInstance,
    @SerializedName("configEmailTemplate")
    var configEmailTemplate: EmailTemplate,
    @SerializedName("enableEmailTemplate")
    var enableEmailTemplate: EmailTemplate,
    @SerializedName("disableEmailTemplate")
    var disableEmailTemplate: EmailTemplate,
    @SerializedName("sendEmail")
    var sendEmail: CommonMessage,
    @SerializedName("createFunction")
    var createFunction: Function? = null,
    @SerializedName("updateFunction")
    var updateFunction: Function,
    @SerializedName("deleteFunction")
    var deleteFunction: CommonMessage,
    @SerializedName("addUserToGroup")
    var addUserToGroup: CommonMessage,
    @SerializedName("removeUserFromGroup")
    var removeUserFromGroup: CommonMessage,
    @SerializedName("createGroup")
    var createGroup: Group,
    @SerializedName("updateGroup")
    var updateGroup: Group,
    @SerializedName("deleteGroups")
    var deleteGroups: CommonMessage,
    @SerializedName("loginByEmail")
    var loginByEmail: User? = null,
    @SerializedName("loginByUsername")
    var loginByUsername: User? = null,
    @SerializedName("loginByPhoneCode")
    var loginByPhoneCode: User? = null,
    @SerializedName("loginByPhonePassword")
    var loginByPhonePassword: User? = null,
    @SerializedName("changeMfa")
    var changeMfa: Mfa? = null,
    @SerializedName("createOrg")
    var createOrg: Org,
    @SerializedName("deleteOrg")
    var deleteOrg: CommonMessage,
    @SerializedName("addNode")
    var addNode: Org,
    @SerializedName("updateNode")
    var updateNode: Node,
    @SerializedName("deleteNode")
    var deleteNode: CommonMessage,
    @SerializedName("addMember")
    var addMember: Node,
    @SerializedName("removeMember")
    var removeMember: Node,
    @SerializedName("moveNode")
    var moveNode: Org,
    @SerializedName("resetPassword")
    var resetPassword: CommonMessage? = null,
    @SerializedName("createPolicy")
    var createPolicy: Policy,
    @SerializedName("updatePolicy")
    var updatePolicy: Policy,
    @SerializedName("deletePolicy")
    var deletePolicy: CommonMessage,
    @SerializedName("deletePolicies")
    var deletePolicies: CommonMessage,
    @SerializedName("addPolicyAssignments")
    var addPolicyAssignments: CommonMessage,
    @SerializedName("removePolicyAssignments")
    var removePolicyAssignments: CommonMessage,
    @SerializedName("allow")
    var allow: CommonMessage,
    @SerializedName("registerByUsername")
    var registerByUsername: User? = null,
    @SerializedName("registerByEmail")
    var registerByEmail: User? = null,
    @SerializedName("registerByPhoneCode")
    var registerByPhoneCode: User? = null,
    @SerializedName("createRole")
    var createRole: Role,
    @SerializedName("updateRole")
    var updateRole: Role,
    @SerializedName("deleteRole")
    var deleteRole: CommonMessage,
    @SerializedName("deleteRoles")
    var deleteRoles: BatchOperationResult,
    @SerializedName("assignRole")
    var assignRole: CommonMessage? = null,
    @SerializedName("revokeRole")
    var revokeRole: CommonMessage? = null,
    @SerializedName("addUdf")
    var addUdf: Iterable<UserDefinedField>,
    @SerializedName("removeUdf")
    var removeUdf: Iterable<UserDefinedField>,
    @SerializedName("setUdv")
    var setUdv: Iterable<UserDefinedData>? = null,
    @SerializedName("removeUdv")
    var removeUdv: Iterable<UserDefinedData>? = null,
    @SerializedName("refreshToken")
    var refreshToken: RefreshToken? = null,
    @SerializedName("createUser")
    var createUser: User,
    @SerializedName("updateUser")
    var updateUser: User,
    @SerializedName("updatePassword")
    var updatePassword: User,
    @SerializedName("bindPhone")
    var bindPhone: User,
    @SerializedName("unbindPhone")
    var unbindPhone: User,
    @SerializedName("updatePhone")
    var updatePhone: User,
    @SerializedName("updateEmail")
    var updateEmail: User,
    @SerializedName("unbindEmail")
    var unbindEmail: User,
    @SerializedName("deleteUser")
    var deleteUser: CommonMessage? = null,
    @SerializedName("deleteUsers")
    var deleteUsers: CommonMessage? = null,
    @SerializedName("createUserpool")
    var createUserpool: UserPool,
    @SerializedName("updateUserpool")
    var updateUserpool: UserPool,
    @SerializedName("refreshUserpoolSecret")
    var refreshUserpoolSecret: String,
    @SerializedName("deleteUserpool")
    var deleteUserpool: CommonMessage,
    @SerializedName("refreshAccessToken")
    var refreshAccessToken: RefreshAccessTokenRes,
    @SerializedName("addWhitelist")
    var addWhitelist: Iterable<WhiteList>,
    @SerializedName("removeWhitelist")
    var removeWhitelist: Iterable<WhiteList>
)

data class CreateSocialConnectionInput @JvmOverloads constructor(
    @SerializedName("provider")
    var provider: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("logo")
    var logo: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("fields")
    var fields: Iterable<SocialConnectionFieldInput>? = null
) {

    fun withDescription(description: String): CreateSocialConnectionInput {
        this.description = description
        return this
    }

    fun withFields(fields: Iterable<SocialConnectionFieldInput>): CreateSocialConnectionInput {
        this.fields = fields
        return this
    }

    fun build(): CreateSocialConnectionInput {
        return this
    }
}

data class SocialConnectionFieldInput @JvmOverloads constructor(
    @SerializedName("key")
    var key: String? = null,
    @SerializedName("label")
    var label: String? = null,
    @SerializedName("type")
    var type: String? = null,
    @SerializedName("placeholder")
    var placeholder: String? = null,
    @SerializedName("children")
    var children: Iterable<SocialConnectionFieldInput>? = null
) {

    fun withKey(key: String): SocialConnectionFieldInput {
        this.key = key
        return this
    }

    fun withLabel(label: String): SocialConnectionFieldInput {
        this.label = label
        return this
    }

    fun withType(type: String): SocialConnectionFieldInput {
        this.type = type
        return this
    }

    fun withPlaceholder(placeholder: String): SocialConnectionFieldInput {
        this.placeholder = placeholder
        return this
    }

    fun withChildren(children: Iterable<SocialConnectionFieldInput>): SocialConnectionFieldInput {
        this.children = children
        return this
    }

    fun build(): SocialConnectionFieldInput {
        return this
    }
}

data class CreateSocialConnectionInstanceInput @JvmOverloads constructor(
    @SerializedName("provider")
    var provider: String,
    @SerializedName("fields")
    var fields: Iterable<CreateSocialConnectionInstanceFieldInput>? = null
) {

    fun withFields(fields: Iterable<CreateSocialConnectionInstanceFieldInput>): CreateSocialConnectionInstanceInput {
        this.fields = fields
        return this
    }

    fun build(): CreateSocialConnectionInstanceInput {
        return this
    }
}

data class CreateSocialConnectionInstanceFieldInput @JvmOverloads constructor(
    @SerializedName("key")
    var key: String,
    @SerializedName("value")
    var value: String
) {


    fun build(): CreateSocialConnectionInstanceFieldInput {
        return this
    }
}

data class ConfigEmailTemplateInput @JvmOverloads constructor(
    @SerializedName("type")
    var type: EmailTemplateType,
    @SerializedName("name")
    var name: String,
    @SerializedName("subject")
    var subject: String,
    @SerializedName("sender")
    var sender: String,
    @SerializedName("content")
    var content: String,
    @SerializedName("redirectTo")
    var redirectTo: String? = null,
    @SerializedName("hasURL")
    var hasURL: Boolean? = null,
    @SerializedName("expiresIn")
    var expiresIn: Int? = null
) {

    fun withRedirectTo(redirectTo: String): ConfigEmailTemplateInput {
        this.redirectTo = redirectTo
        return this
    }

    fun withHasUrl(hasURL: Boolean): ConfigEmailTemplateInput {
        this.hasURL = hasURL
        return this
    }

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
    ResetPassword("RESET_PASSWORD"),
    VerifyEmail("VERIFY_EMAIL"),
    ChangeEmail("CHANGE_EMAIL");

    companion object {
        @JvmStatic
        fun valueOfLabel(label: String): EmailScene? {
            return values().find { it.label == label }
        }
    }
}

data class CommonMessage(
    @SerializedName("message")
    var message: String? = null,
    @SerializedName("code")
    var code: Int? = null
)

data class CreateFunctionInput @JvmOverloads constructor(
    @SerializedName("name")
    var name: String,
    @SerializedName("sourceCode")
    var sourceCode: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("url")
    var url: String? = null
) {

    fun withDescription(description: String): CreateFunctionInput {
        this.description = description
        return this
    }

    fun withUrl(url: String): CreateFunctionInput {
        this.url = url
        return this
    }

    fun build(): CreateFunctionInput {
        return this
    }
}

data class UpdateFunctionInput @JvmOverloads constructor(
    @SerializedName("id")
    var id: String,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("sourceCode")
    var sourceCode: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("url")
    var url: String? = null
) {

    fun withName(name: String): UpdateFunctionInput {
        this.name = name
        return this
    }

    fun withSourceCode(sourceCode: String): UpdateFunctionInput {
        this.sourceCode = sourceCode
        return this
    }

    fun withDescription(description: String): UpdateFunctionInput {
        this.description = description
        return this
    }

    fun withUrl(url: String): UpdateFunctionInput {
        this.url = url
        return this
    }

    fun build(): UpdateFunctionInput {
        return this
    }
}

data class LoginByEmailInput @JvmOverloads constructor(
    @SerializedName("email")
    var email: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("captchaCode")
    var captchaCode: String? = null,
    @SerializedName("autoRegister")
    var autoRegister: Boolean? = null
) {

    fun withCaptchaCode(captchaCode: String): LoginByEmailInput {
        this.captchaCode = captchaCode
        return this
    }

    fun withAutoRegister(autoRegister: Boolean): LoginByEmailInput {
        this.autoRegister = autoRegister
        return this
    }

    fun build(): LoginByEmailInput {
        return this
    }
}

data class LoginByUsernameInput @JvmOverloads constructor(
    @SerializedName("username")
    var username: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("captchaCode")
    var captchaCode: String? = null,
    @SerializedName("autoRegister")
    var autoRegister: Boolean? = null
) {

    fun withCaptchaCode(captchaCode: String): LoginByUsernameInput {
        this.captchaCode = captchaCode
        return this
    }

    fun withAutoRegister(autoRegister: Boolean): LoginByUsernameInput {
        this.autoRegister = autoRegister
        return this
    }

    fun build(): LoginByUsernameInput {
        return this
    }
}

data class LoginByPhoneCodeInput @JvmOverloads constructor(
    @SerializedName("phone")
    var phone: String,
    @SerializedName("code")
    var code: String,
    @SerializedName("autoRegister")
    var autoRegister: Boolean? = null
) {

    fun withAutoRegister(autoRegister: Boolean): LoginByPhoneCodeInput {
        this.autoRegister = autoRegister
        return this
    }

    fun build(): LoginByPhoneCodeInput {
        return this
    }
}

data class LoginByPhonePasswordInput @JvmOverloads constructor(
    @SerializedName("phone")
    var phone: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("captchaCode")
    var captchaCode: String? = null,
    @SerializedName("autoRegister")
    var autoRegister: Boolean? = null
) {

    fun withCaptchaCode(captchaCode: String): LoginByPhonePasswordInput {
        this.captchaCode = captchaCode
        return this
    }

    fun withAutoRegister(autoRegister: Boolean): LoginByPhonePasswordInput {
        this.autoRegister = autoRegister
        return this
    }

    fun build(): LoginByPhonePasswordInput {
        return this
    }
}

data class PolicyStatementInput @JvmOverloads constructor(
    @SerializedName("resource")
    var resource: String,
    @SerializedName("actions")
    var actions: Iterable<String>,
    @SerializedName("effect")
    var effect: PolicyEffect? = null
) {

    fun withEffect(effect: PolicyEffect): PolicyStatementInput {
        this.effect = effect
        return this
    }

    fun build(): PolicyStatementInput {
        return this
    }
}

data class RegisterByUsernameInput @JvmOverloads constructor(
    @SerializedName("username")
    var username: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("profile")
    var profile: RegisterProfileInput? = null,
    @SerializedName("forceLogin")
    var forceLogin: Boolean? = null,
    @SerializedName("generateToken")
    var generateToken: Boolean? = null
) {

    fun withProfile(profile: RegisterProfileInput): RegisterByUsernameInput {
        this.profile = profile
        return this
    }

    fun withForceLogin(forceLogin: Boolean): RegisterByUsernameInput {
        this.forceLogin = forceLogin
        return this
    }

    fun withGenerateToken(generateToken: Boolean): RegisterByUsernameInput {
        this.generateToken = generateToken
        return this
    }

    fun build(): RegisterByUsernameInput {
        return this
    }
}

data class RegisterProfileInput @JvmOverloads constructor(
    @SerializedName("ip")
    var ip: String? = null,
    @SerializedName("oauth")
    var oauth: String? = null,
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
    @SerializedName("udf")
    var udf: Iterable<UserDdfInput>? = null
) {

    fun withIp(ip: String): RegisterProfileInput {
        this.ip = ip
        return this
    }

    fun withOauth(oauth: String): RegisterProfileInput {
        this.oauth = oauth
        return this
    }

    fun withNickname(nickname: String): RegisterProfileInput {
        this.nickname = nickname
        return this
    }

    fun withCompany(company: String): RegisterProfileInput {
        this.company = company
        return this
    }

    fun withPhoto(photo: String): RegisterProfileInput {
        this.photo = photo
        return this
    }

    fun withDevice(device: String): RegisterProfileInput {
        this.device = device
        return this
    }

    fun withBrowser(browser: String): RegisterProfileInput {
        this.browser = browser
        return this
    }

    fun withName(name: String): RegisterProfileInput {
        this.name = name
        return this
    }

    fun withGivenName(givenName: String): RegisterProfileInput {
        this.givenName = givenName
        return this
    }

    fun withFamilyName(familyName: String): RegisterProfileInput {
        this.familyName = familyName
        return this
    }

    fun withMiddleName(middleName: String): RegisterProfileInput {
        this.middleName = middleName
        return this
    }

    fun withProfile(profile: String): RegisterProfileInput {
        this.profile = profile
        return this
    }

    fun withPreferredUsername(preferredUsername: String): RegisterProfileInput {
        this.preferredUsername = preferredUsername
        return this
    }

    fun withWebsite(website: String): RegisterProfileInput {
        this.website = website
        return this
    }

    fun withGender(gender: String): RegisterProfileInput {
        this.gender = gender
        return this
    }

    fun withBirthdate(birthdate: String): RegisterProfileInput {
        this.birthdate = birthdate
        return this
    }

    fun withZoneinfo(zoneinfo: String): RegisterProfileInput {
        this.zoneinfo = zoneinfo
        return this
    }

    fun withLocale(locale: String): RegisterProfileInput {
        this.locale = locale
        return this
    }

    fun withAddress(address: String): RegisterProfileInput {
        this.address = address
        return this
    }

    fun withFormatted(formatted: String): RegisterProfileInput {
        this.formatted = formatted
        return this
    }

    fun withStreetAddress(streetAddress: String): RegisterProfileInput {
        this.streetAddress = streetAddress
        return this
    }

    fun withLocality(locality: String): RegisterProfileInput {
        this.locality = locality
        return this
    }

    fun withRegion(region: String): RegisterProfileInput {
        this.region = region
        return this
    }

    fun withPostalCode(postalCode: String): RegisterProfileInput {
        this.postalCode = postalCode
        return this
    }

    fun withCountry(country: String): RegisterProfileInput {
        this.country = country
        return this
    }

    fun withUdf(udf: Iterable<UserDdfInput>): RegisterProfileInput {
        this.udf = udf
        return this
    }

    fun build(): RegisterProfileInput {
        return this
    }
}

data class UserDdfInput @JvmOverloads constructor(
    @SerializedName("key")
    var key: String,
    @SerializedName("value")
    var value: String
) {


    fun build(): UserDdfInput {
        return this
    }
}

data class RegisterByEmailInput @JvmOverloads constructor(
    @SerializedName("email")
    var email: String,
    @SerializedName("password")
    var password: String,
    @SerializedName("profile")
    var profile: RegisterProfileInput? = null,
    @SerializedName("forceLogin")
    var forceLogin: Boolean? = null,
    @SerializedName("generateToken")
    var generateToken: Boolean? = null
) {

    fun withProfile(profile: RegisterProfileInput): RegisterByEmailInput {
        this.profile = profile
        return this
    }

    fun withForceLogin(forceLogin: Boolean): RegisterByEmailInput {
        this.forceLogin = forceLogin
        return this
    }

    fun withGenerateToken(generateToken: Boolean): RegisterByEmailInput {
        this.generateToken = generateToken
        return this
    }

    fun build(): RegisterByEmailInput {
        return this
    }
}

data class RegisterByPhoneCodeInput @JvmOverloads constructor(
    @SerializedName("phone")
    var phone: String,
    @SerializedName("code")
    var code: String,
    @SerializedName("password")
    var password: String? = null,
    @SerializedName("profile")
    var profile: RegisterProfileInput? = null,
    @SerializedName("forceLogin")
    var forceLogin: Boolean? = null,
    @SerializedName("generateToken")
    var generateToken: Boolean? = null
) {

    fun withPassword(password: String): RegisterByPhoneCodeInput {
        this.password = password
        return this
    }

    fun withProfile(profile: RegisterProfileInput): RegisterByPhoneCodeInput {
        this.profile = profile
        return this
    }

    fun withForceLogin(forceLogin: Boolean): RegisterByPhoneCodeInput {
        this.forceLogin = forceLogin
        return this
    }

    fun withGenerateToken(generateToken: Boolean): RegisterByPhoneCodeInput {
        this.generateToken = generateToken
        return this
    }

    fun build(): RegisterByPhoneCodeInput {
        return this
    }
}

data class BatchOperationResult(
    @SerializedName("succeedCount")
    var succeedCount: Int,
    @SerializedName("failedCount")
    var failedCount: Int,
    @SerializedName("message")
    var message: String? = null,
    @SerializedName("errors")
    var errors: Iterable<String>? = null
)

data class RefreshToken(
    @SerializedName("token")
    var token: String? = null,
    @SerializedName("iat")
    var iat: Int? = null,
    @SerializedName("exp")
    var exp: Int? = null
)

data class CreateUserInput @JvmOverloads constructor(
    @SerializedName("username")
    var username: String? = null,
    @SerializedName("email")
    var email: String? = null,
    @SerializedName("emailVerified")
    var emailVerified: Boolean? = null,
    @SerializedName("phone")
    var phone: String? = null,
    @SerializedName("phoneVerified")
    var phoneVerified: Boolean? = null,
    @SerializedName("unionid")
    var unionid: String? = null,
    @SerializedName("openid")
    var openid: String? = null,
    @SerializedName("nickname")
    var nickname: String? = null,
    @SerializedName("photo")
    var photo: String? = null,
    @SerializedName("password")
    var password: String? = null,
    @SerializedName("registerSource")
    var registerSource: Iterable<String>? = null,
    @SerializedName("browser")
    var browser: String? = null,
    @SerializedName("oauth")
    var oauth: String? = null,
    @SerializedName("loginsCount")
    var loginsCount: Int? = null,
    @SerializedName("lastLogin")
    var lastLogin: String? = null,
    @SerializedName("company")
    var company: String? = null,
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
    var country: String? = null
) {

    fun withUsername(username: String): CreateUserInput {
        this.username = username
        return this
    }

    fun withEmail(email: String): CreateUserInput {
        this.email = email
        return this
    }

    fun withEmailVerified(emailVerified: Boolean): CreateUserInput {
        this.emailVerified = emailVerified
        return this
    }

    fun withPhone(phone: String): CreateUserInput {
        this.phone = phone
        return this
    }

    fun withPhoneVerified(phoneVerified: Boolean): CreateUserInput {
        this.phoneVerified = phoneVerified
        return this
    }

    fun withUnionid(unionid: String): CreateUserInput {
        this.unionid = unionid
        return this
    }

    fun withOpenid(openid: String): CreateUserInput {
        this.openid = openid
        return this
    }

    fun withNickname(nickname: String): CreateUserInput {
        this.nickname = nickname
        return this
    }

    fun withPhoto(photo: String): CreateUserInput {
        this.photo = photo
        return this
    }

    fun withPassword(password: String): CreateUserInput {
        this.password = password
        return this
    }

    fun withRegisterSource(registerSource: Iterable<String>): CreateUserInput {
        this.registerSource = registerSource
        return this
    }

    fun withBrowser(browser: String): CreateUserInput {
        this.browser = browser
        return this
    }

    fun withOauth(oauth: String): CreateUserInput {
        this.oauth = oauth
        return this
    }

    fun withLoginsCount(loginsCount: Int): CreateUserInput {
        this.loginsCount = loginsCount
        return this
    }

    fun withLastLogin(lastLogin: String): CreateUserInput {
        this.lastLogin = lastLogin
        return this
    }

    fun withCompany(company: String): CreateUserInput {
        this.company = company
        return this
    }

    fun withLastIp(lastIP: String): CreateUserInput {
        this.lastIP = lastIP
        return this
    }

    fun withSignedUp(signedUp: String): CreateUserInput {
        this.signedUp = signedUp
        return this
    }

    fun withBlocked(blocked: Boolean): CreateUserInput {
        this.blocked = blocked
        return this
    }

    fun withIsDeleted(isDeleted: Boolean): CreateUserInput {
        this.isDeleted = isDeleted
        return this
    }

    fun withDevice(device: String): CreateUserInput {
        this.device = device
        return this
    }

    fun withName(name: String): CreateUserInput {
        this.name = name
        return this
    }

    fun withGivenName(givenName: String): CreateUserInput {
        this.givenName = givenName
        return this
    }

    fun withFamilyName(familyName: String): CreateUserInput {
        this.familyName = familyName
        return this
    }

    fun withMiddleName(middleName: String): CreateUserInput {
        this.middleName = middleName
        return this
    }

    fun withProfile(profile: String): CreateUserInput {
        this.profile = profile
        return this
    }

    fun withPreferredUsername(preferredUsername: String): CreateUserInput {
        this.preferredUsername = preferredUsername
        return this
    }

    fun withWebsite(website: String): CreateUserInput {
        this.website = website
        return this
    }

    fun withGender(gender: String): CreateUserInput {
        this.gender = gender
        return this
    }

    fun withBirthdate(birthdate: String): CreateUserInput {
        this.birthdate = birthdate
        return this
    }

    fun withZoneinfo(zoneinfo: String): CreateUserInput {
        this.zoneinfo = zoneinfo
        return this
    }

    fun withLocale(locale: String): CreateUserInput {
        this.locale = locale
        return this
    }

    fun withAddress(address: String): CreateUserInput {
        this.address = address
        return this
    }

    fun withFormatted(formatted: String): CreateUserInput {
        this.formatted = formatted
        return this
    }

    fun withStreetAddress(streetAddress: String): CreateUserInput {
        this.streetAddress = streetAddress
        return this
    }

    fun withLocality(locality: String): CreateUserInput {
        this.locality = locality
        return this
    }

    fun withRegion(region: String): CreateUserInput {
        this.region = region
        return this
    }

    fun withPostalCode(postalCode: String): CreateUserInput {
        this.postalCode = postalCode
        return this
    }

    fun withCountry(country: String): CreateUserInput {
        this.country = country
        return this
    }

    fun build(): CreateUserInput {
        return this
    }
}

data class UpdateUserInput @JvmOverloads constructor(
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
    @SerializedName("password")
    var password: String? = null,
    @SerializedName("photo")
    var photo: String? = null,
    @SerializedName("company")
    var company: String? = null,
    @SerializedName("browser")
    var browser: String? = null,
    @SerializedName("device")
    var device: String? = null,
    @SerializedName("oauth")
    var oauth: String? = null,
    @SerializedName("tokenExpiredAt")
    var tokenExpiredAt: String? = null,
    @SerializedName("loginsCount")
    var loginsCount: Int? = null,
    @SerializedName("lastLogin")
    var lastLogin: String? = null,
    @SerializedName("lastIP")
    var lastIP: String? = null,
    @SerializedName("blocked")
    var blocked: Boolean? = null,
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
    @SerializedName("city")
    var city: String? = null,
    @SerializedName("province")
    var province: String? = null,
    @SerializedName("country")
    var country: String? = null
) {

    fun withEmail(email: String): UpdateUserInput {
        this.email = email
        return this
    }

    fun withUnionid(unionid: String): UpdateUserInput {
        this.unionid = unionid
        return this
    }

    fun withOpenid(openid: String): UpdateUserInput {
        this.openid = openid
        return this
    }

    fun withEmailVerified(emailVerified: Boolean): UpdateUserInput {
        this.emailVerified = emailVerified
        return this
    }

    fun withPhone(phone: String): UpdateUserInput {
        this.phone = phone
        return this
    }

    fun withPhoneVerified(phoneVerified: Boolean): UpdateUserInput {
        this.phoneVerified = phoneVerified
        return this
    }

    fun withUsername(username: String): UpdateUserInput {
        this.username = username
        return this
    }

    fun withNickname(nickname: String): UpdateUserInput {
        this.nickname = nickname
        return this
    }

    fun withPassword(password: String): UpdateUserInput {
        this.password = password
        return this
    }

    fun withPhoto(photo: String): UpdateUserInput {
        this.photo = photo
        return this
    }

    fun withCompany(company: String): UpdateUserInput {
        this.company = company
        return this
    }

    fun withBrowser(browser: String): UpdateUserInput {
        this.browser = browser
        return this
    }

    fun withDevice(device: String): UpdateUserInput {
        this.device = device
        return this
    }

    fun withOauth(oauth: String): UpdateUserInput {
        this.oauth = oauth
        return this
    }

    fun withTokenExpiredAt(tokenExpiredAt: String): UpdateUserInput {
        this.tokenExpiredAt = tokenExpiredAt
        return this
    }

    fun withLoginsCount(loginsCount: Int): UpdateUserInput {
        this.loginsCount = loginsCount
        return this
    }

    fun withLastLogin(lastLogin: String): UpdateUserInput {
        this.lastLogin = lastLogin
        return this
    }

    fun withLastIp(lastIP: String): UpdateUserInput {
        this.lastIP = lastIP
        return this
    }

    fun withBlocked(blocked: Boolean): UpdateUserInput {
        this.blocked = blocked
        return this
    }

    fun withName(name: String): UpdateUserInput {
        this.name = name
        return this
    }

    fun withGivenName(givenName: String): UpdateUserInput {
        this.givenName = givenName
        return this
    }

    fun withFamilyName(familyName: String): UpdateUserInput {
        this.familyName = familyName
        return this
    }

    fun withMiddleName(middleName: String): UpdateUserInput {
        this.middleName = middleName
        return this
    }

    fun withProfile(profile: String): UpdateUserInput {
        this.profile = profile
        return this
    }

    fun withPreferredUsername(preferredUsername: String): UpdateUserInput {
        this.preferredUsername = preferredUsername
        return this
    }

    fun withWebsite(website: String): UpdateUserInput {
        this.website = website
        return this
    }

    fun withGender(gender: String): UpdateUserInput {
        this.gender = gender
        return this
    }

    fun withBirthdate(birthdate: String): UpdateUserInput {
        this.birthdate = birthdate
        return this
    }

    fun withZoneinfo(zoneinfo: String): UpdateUserInput {
        this.zoneinfo = zoneinfo
        return this
    }

    fun withLocale(locale: String): UpdateUserInput {
        this.locale = locale
        return this
    }

    fun withAddress(address: String): UpdateUserInput {
        this.address = address
        return this
    }

    fun withFormatted(formatted: String): UpdateUserInput {
        this.formatted = formatted
        return this
    }

    fun withStreetAddress(streetAddress: String): UpdateUserInput {
        this.streetAddress = streetAddress
        return this
    }

    fun withLocality(locality: String): UpdateUserInput {
        this.locality = locality
        return this
    }

    fun withRegion(region: String): UpdateUserInput {
        this.region = region
        return this
    }

    fun withPostalCode(postalCode: String): UpdateUserInput {
        this.postalCode = postalCode
        return this
    }

    fun withCity(city: String): UpdateUserInput {
        this.city = city
        return this
    }

    fun withProvince(province: String): UpdateUserInput {
        this.province = province
        return this
    }

    fun withCountry(country: String): UpdateUserInput {
        this.country = country
        return this
    }

    fun build(): UpdateUserInput {
        return this
    }
}

data class UpdateUserpoolInput @JvmOverloads constructor(
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("logo")
    var logo: String? = null,
    @SerializedName("domain")
    var domain: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("userpoolTypes")
    var userpoolTypes: Iterable<String>? = null,
    @SerializedName("emailVerifiedDefault")
    var emailVerifiedDefault: Boolean? = null,
    @SerializedName("sendWelcomeEmail")
    var sendWelcomeEmail: Boolean? = null,
    @SerializedName("registerDisabled")
    var registerDisabled: Boolean? = null,
    @SerializedName("allowedOrigins")
    var allowedOrigins: String? = null,
    @SerializedName("tokenExpiresAfter")
    var tokenExpiresAfter: Int? = null,
    @SerializedName("emailWhitelistEnabled")
    var emailWhitelistEnabled: Boolean? = null,
    @SerializedName("phoneWhitelistEnabled")
    var phoneWhitelistEnabled: Boolean? = null,
    @SerializedName("frequentRegisterCheck")
    var frequentRegisterCheck: FrequentRegisterCheckConfigInput? = null,
    @SerializedName("loginFailCheck")
    var loginFailCheck: LoginFailCheckConfigInput? = null,
    @SerializedName("changePhoneStrategy")
    var changePhoneStrategy: ChangePhoneStrategyInput? = null,
    @SerializedName("changeEmailStrategy")
    var changeEmailStrategy: ChangeEmailStrategyInput? = null,
    @SerializedName("qrcodeLoginStrategy")
    var qrcodeLoginStrategy: QrcodeLoginStrategyInput? = null,
    @SerializedName("app2WxappLoginStrategy")
    var app2WxappLoginStrategy: App2WxappLoginStrategyInput? = null,
    @SerializedName("whitelist")
    var whitelist: RegisterWhiteListConfigInput? = null,
    @SerializedName("customSMSProvider")
    var customSMSProvider: CustomSmsProviderInput? = null
) {

    fun withName(name: String): UpdateUserpoolInput {
        this.name = name
        return this
    }

    fun withLogo(logo: String): UpdateUserpoolInput {
        this.logo = logo
        return this
    }

    fun withDomain(domain: String): UpdateUserpoolInput {
        this.domain = domain
        return this
    }

    fun withDescription(description: String): UpdateUserpoolInput {
        this.description = description
        return this
    }

    fun withUserpoolTypes(userpoolTypes: Iterable<String>): UpdateUserpoolInput {
        this.userpoolTypes = userpoolTypes
        return this
    }

    fun withEmailVerifiedDefault(emailVerifiedDefault: Boolean): UpdateUserpoolInput {
        this.emailVerifiedDefault = emailVerifiedDefault
        return this
    }

    fun withSendWelcomeEmail(sendWelcomeEmail: Boolean): UpdateUserpoolInput {
        this.sendWelcomeEmail = sendWelcomeEmail
        return this
    }

    fun withRegisterDisabled(registerDisabled: Boolean): UpdateUserpoolInput {
        this.registerDisabled = registerDisabled
        return this
    }

    fun withAllowedOrigins(allowedOrigins: String): UpdateUserpoolInput {
        this.allowedOrigins = allowedOrigins
        return this
    }

    fun withTokenExpiresAfter(tokenExpiresAfter: Int): UpdateUserpoolInput {
        this.tokenExpiresAfter = tokenExpiresAfter
        return this
    }

    fun withEmailWhitelistEnabled(emailWhitelistEnabled: Boolean): UpdateUserpoolInput {
        this.emailWhitelistEnabled = emailWhitelistEnabled
        return this
    }

    fun withPhoneWhitelistEnabled(phoneWhitelistEnabled: Boolean): UpdateUserpoolInput {
        this.phoneWhitelistEnabled = phoneWhitelistEnabled
        return this
    }

    fun withFrequentRegisterCheck(frequentRegisterCheck: FrequentRegisterCheckConfigInput): UpdateUserpoolInput {
        this.frequentRegisterCheck = frequentRegisterCheck
        return this
    }

    fun withLoginFailCheck(loginFailCheck: LoginFailCheckConfigInput): UpdateUserpoolInput {
        this.loginFailCheck = loginFailCheck
        return this
    }

    fun withChangePhoneStrategy(changePhoneStrategy: ChangePhoneStrategyInput): UpdateUserpoolInput {
        this.changePhoneStrategy = changePhoneStrategy
        return this
    }

    fun withChangeEmailStrategy(changeEmailStrategy: ChangeEmailStrategyInput): UpdateUserpoolInput {
        this.changeEmailStrategy = changeEmailStrategy
        return this
    }

    fun withQrcodeLoginStrategy(qrcodeLoginStrategy: QrcodeLoginStrategyInput): UpdateUserpoolInput {
        this.qrcodeLoginStrategy = qrcodeLoginStrategy
        return this
    }

    fun withApp2WxappLoginStrategy(app2WxappLoginStrategy: App2WxappLoginStrategyInput): UpdateUserpoolInput {
        this.app2WxappLoginStrategy = app2WxappLoginStrategy
        return this
    }

    fun withWhitelist(whitelist: RegisterWhiteListConfigInput): UpdateUserpoolInput {
        this.whitelist = whitelist
        return this
    }

    fun withCustomSmsProvider(customSMSProvider: CustomSmsProviderInput): UpdateUserpoolInput {
        this.customSMSProvider = customSMSProvider
        return this
    }

    fun build(): UpdateUserpoolInput {
        return this
    }
}

data class FrequentRegisterCheckConfigInput @JvmOverloads constructor(
    @SerializedName("timeInterval")
    var timeInterval: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("enabled")
    var enabled: Boolean? = null
) {

    fun withTimeInterval(timeInterval: Int): FrequentRegisterCheckConfigInput {
        this.timeInterval = timeInterval
        return this
    }

    fun withLimit(limit: Int): FrequentRegisterCheckConfigInput {
        this.limit = limit
        return this
    }

    fun withEnabled(enabled: Boolean): FrequentRegisterCheckConfigInput {
        this.enabled = enabled
        return this
    }

    fun build(): FrequentRegisterCheckConfigInput {
        return this
    }
}

data class LoginFailCheckConfigInput @JvmOverloads constructor(
    @SerializedName("timeInterval")
    var timeInterval: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("enabled")
    var enabled: Boolean? = null
) {

    fun withTimeInterval(timeInterval: Int): LoginFailCheckConfigInput {
        this.timeInterval = timeInterval
        return this
    }

    fun withLimit(limit: Int): LoginFailCheckConfigInput {
        this.limit = limit
        return this
    }

    fun withEnabled(enabled: Boolean): LoginFailCheckConfigInput {
        this.enabled = enabled
        return this
    }

    fun build(): LoginFailCheckConfigInput {
        return this
    }
}

data class ChangePhoneStrategyInput @JvmOverloads constructor(
    @SerializedName("verifyOldPhone")
    var verifyOldPhone: Boolean? = null
) {

    fun withVerifyOldPhone(verifyOldPhone: Boolean): ChangePhoneStrategyInput {
        this.verifyOldPhone = verifyOldPhone
        return this
    }

    fun build(): ChangePhoneStrategyInput {
        return this
    }
}

data class ChangeEmailStrategyInput @JvmOverloads constructor(
    @SerializedName("verifyOldEmail")
    var verifyOldEmail: Boolean? = null
) {

    fun withVerifyOldEmail(verifyOldEmail: Boolean): ChangeEmailStrategyInput {
        this.verifyOldEmail = verifyOldEmail
        return this
    }

    fun build(): ChangeEmailStrategyInput {
        return this
    }
}

data class QrcodeLoginStrategyInput @JvmOverloads constructor(
    @SerializedName("qrcodeExpiresAfter")
    var qrcodeExpiresAfter: Int? = null,
    @SerializedName("returnFullUserInfo")
    var returnFullUserInfo: Boolean? = null,
    @SerializedName("allowExchangeUserInfoFromBrowser")
    var allowExchangeUserInfoFromBrowser: Boolean? = null,
    @SerializedName("ticketExpiresAfter")
    var ticketExpiresAfter: Int? = null
) {

    fun withQrcodeExpiresAfter(qrcodeExpiresAfter: Int): QrcodeLoginStrategyInput {
        this.qrcodeExpiresAfter = qrcodeExpiresAfter
        return this
    }

    fun withReturnFullUserInfo(returnFullUserInfo: Boolean): QrcodeLoginStrategyInput {
        this.returnFullUserInfo = returnFullUserInfo
        return this
    }

    fun withAllowExchangeUserInfoFromBrowser(allowExchangeUserInfoFromBrowser: Boolean): QrcodeLoginStrategyInput {
        this.allowExchangeUserInfoFromBrowser = allowExchangeUserInfoFromBrowser
        return this
    }

    fun withTicketExpiresAfter(ticketExpiresAfter: Int): QrcodeLoginStrategyInput {
        this.ticketExpiresAfter = ticketExpiresAfter
        return this
    }

    fun build(): QrcodeLoginStrategyInput {
        return this
    }
}

data class App2WxappLoginStrategyInput @JvmOverloads constructor(
    @SerializedName("ticketExpriresAfter")
    var ticketExpriresAfter: Int? = null,
    @SerializedName("ticketExchangeUserInfoNeedSecret")
    var ticketExchangeUserInfoNeedSecret: Boolean? = null
) {

    fun withTicketExpriresAfter(ticketExpriresAfter: Int): App2WxappLoginStrategyInput {
        this.ticketExpriresAfter = ticketExpriresAfter
        return this
    }

    fun withTicketExchangeUserInfoNeedSecret(ticketExchangeUserInfoNeedSecret: Boolean): App2WxappLoginStrategyInput {
        this.ticketExchangeUserInfoNeedSecret = ticketExchangeUserInfoNeedSecret
        return this
    }

    fun build(): App2WxappLoginStrategyInput {
        return this
    }
}

data class RegisterWhiteListConfigInput @JvmOverloads constructor(
    @SerializedName("phoneEnabled")
    var phoneEnabled: Boolean? = null,
    @SerializedName("emailEnabled")
    var emailEnabled: Boolean? = null,
    @SerializedName("usernameEnabled")
    var usernameEnabled: Boolean? = null
) {

    fun withPhoneEnabled(phoneEnabled: Boolean): RegisterWhiteListConfigInput {
        this.phoneEnabled = phoneEnabled
        return this
    }

    fun withEmailEnabled(emailEnabled: Boolean): RegisterWhiteListConfigInput {
        this.emailEnabled = emailEnabled
        return this
    }

    fun withUsernameEnabled(usernameEnabled: Boolean): RegisterWhiteListConfigInput {
        this.usernameEnabled = usernameEnabled
        return this
    }

    fun build(): RegisterWhiteListConfigInput {
        return this
    }
}

data class CustomSmsProviderInput @JvmOverloads constructor(
    @SerializedName("enabled")
    var enabled: Boolean? = null,
    @SerializedName("provider")
    var provider: String? = null,
    @SerializedName("config253")
    var config253: SmsConfig253Input? = null
) {

    fun withEnabled(enabled: Boolean): CustomSmsProviderInput {
        this.enabled = enabled
        return this
    }

    fun withProvider(provider: String): CustomSmsProviderInput {
        this.provider = provider
        return this
    }

    fun withConfig253(config253: SmsConfig253Input): CustomSmsProviderInput {
        this.config253 = config253
        return this
    }

    fun build(): CustomSmsProviderInput {
        return this
    }
}

data class SmsConfig253Input @JvmOverloads constructor(
    @SerializedName("appId")
    var appId: String,
    @SerializedName("key")
    var key: String,
    @SerializedName("template")
    var template: String,
    @SerializedName("ttl")
    var ttl: Int,
    @SerializedName("sendSmsApi")
    var sendSmsApi: String
) {


    fun build(): SmsConfig253Input {
        return this
    }
}

data class RefreshAccessTokenRes(
    @SerializedName("accessToken")
    var accessToken: String? = null,
    @SerializedName("exp")
    var exp: Int? = null,
    @SerializedName("iat")
    var iat: Int? = null
)

data class KeyValuePair(
    @SerializedName("key")
    var key: String,
    @SerializedName("value")
    var value: String
)


data class AddMemberResponse(

    @SerializedName("addMember")
    val result: Node
)

class AddMemberParam @JvmOverloads constructor(
    @SerializedName("page")
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
    var userIds: Iterable<String>,
    @SerializedName("isLeader")
    var isLeader: Boolean? = null
) {

    fun withPage(page: Int): AddMemberParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): AddMemberParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): AddMemberParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean): AddMemberParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun withNodeId(nodeId: String): AddMemberParam {
        this.nodeId = nodeId
        return this
    }

    fun withOrgId(orgId: String): AddMemberParam {
        this.orgId = orgId
        return this
    }

    fun withNodeCode(nodeCode: String): AddMemberParam {
        this.nodeCode = nodeCode
        return this
    }

    fun withIsLeader(isLeader: Boolean): AddMemberParam {
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
        country
        updatedAt
        customData
      }
    }
  }
}
"""
}


data class AddNodeResponse(

    @SerializedName("addNode")
    val result: Org
)

class AddNodeParam @JvmOverloads constructor(
    @SerializedName("orgId")
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
    var code: String? = null
) {

    fun withParentNodeId(parentNodeId: String): AddNodeParam {
        this.parentNodeId = parentNodeId
        return this
    }

    fun withNameI18n(nameI18n: String): AddNodeParam {
        this.nameI18n = nameI18n
        return this
    }

    fun withDescription(description: String): AddNodeParam {
        this.description = description
        return this
    }

    fun withDescriptionI18n(descriptionI18n: String): AddNodeParam {
        this.descriptionI18n = descriptionI18n
        return this
    }

    fun withOrder(order: Int): AddNodeParam {
        this.order = order
        return this
    }

    fun withCode(code: String): AddNodeParam {
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


data class AddPolicyAssignmentsResponse(

    @SerializedName("addPolicyAssignments")
    val result: CommonMessage
)

class AddPolicyAssignmentsParam @JvmOverloads constructor(
    @SerializedName("policies")
    var policies: Iterable<String>,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    @SerializedName("targetIdentifiers")
    var targetIdentifiers: Iterable<String>? = null
) {

    fun withTargetIdentifiers(targetIdentifiers: Iterable<String>): AddPolicyAssignmentsParam {
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


data class AddUdfResponse(

    @SerializedName("addUdf")
    val result: Iterable<UserDefinedField>
)

class AddUdfParam @JvmOverloads constructor(
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

    fun withOptions(options: String): AddUdfParam {
        this.options = options
        return this
    }

    fun build(): AddUdfParam {
        return this
    }

    fun createRequest(): GraphQLRequest {
        return GraphQLRequest(
            addUdfDocument,
            this
        );
    }

    private val addUdfDocument: String = """
mutation addUdf(${'$'}targetType: UDFTargetType!, ${'$'}key: String!, ${'$'}dataType: UDFDataType!, ${'$'}label: String!, ${'$'}options: String) {
  addUdf(targetType: ${'$'}targetType, key: ${'$'}key, dataType: ${'$'}dataType, label: ${'$'}label, options: ${'$'}options) {
    targetType
    dataType
    key
    label
    options
  }
}
"""
}


data class AddUserToGroupResponse(

    @SerializedName("addUserToGroup")
    val result: CommonMessage
)

class AddUserToGroupParam @JvmOverloads constructor(
    @SerializedName("userIds")
    var userIds: Iterable<String>,
    @SerializedName("code")
    var code: String? = null
) {

    fun withCode(code: String): AddUserToGroupParam {
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


data class AddWhitelistResponse(

    @SerializedName("addWhitelist")
    val result: Iterable<WhiteList>
)

class AddWhitelistParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: WhitelistType,
    @SerializedName("list")
    var list: Iterable<String>
) {


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
    var userIds: Iterable<String>? = null,
    @SerializedName("roleCode")
    var roleCode: String? = null,
    @SerializedName("roleCodes")
    var roleCodes: Iterable<String>? = null
) {

    fun withUserId(userId: String): AllowParam {
        this.userId = userId
        return this
    }

    fun withUserIds(userIds: Iterable<String>): AllowParam {
        this.userIds = userIds
        return this
    }

    fun withRoleCode(roleCode: String): AllowParam {
        this.roleCode = roleCode
        return this
    }

    fun withRoleCodes(roleCodes: Iterable<String>): AllowParam {
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
    var roleCodes: Iterable<String>? = null,
    @SerializedName("userIds")
    var userIds: Iterable<String>? = null,
    @SerializedName("groupCodes")
    var groupCodes: Iterable<String>? = null,
    @SerializedName("nodeCodes")
    var nodeCodes: Iterable<String>? = null
) {

    fun withRoleCode(roleCode: String): AssignRoleParam {
        this.roleCode = roleCode
        return this
    }

    fun withRoleCodes(roleCodes: Iterable<String>): AssignRoleParam {
        this.roleCodes = roleCodes
        return this
    }

    fun withUserIds(userIds: Iterable<String>): AssignRoleParam {
        this.userIds = userIds
        return this
    }

    fun withGroupCodes(groupCodes: Iterable<String>): AssignRoleParam {
        this.groupCodes = groupCodes
        return this
    }

    fun withNodeCodes(nodeCodes: Iterable<String>): AssignRoleParam {
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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

    fun withEnable(enable: Boolean): ChangeMfaParam {
        this.enable = enable
        return this
    }

    fun withId(id: String): ChangeMfaParam {
        this.id = id
        return this
    }

    fun withUserId(userId: String): ChangeMfaParam {
        this.userId = userId
        return this
    }

    fun withUserPoolId(userPoolId: String): ChangeMfaParam {
        this.userPoolId = userPoolId
        return this
    }

    fun withRefresh(refresh: Boolean): ChangeMfaParam {
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


data class CreateGroupResponse(

    @SerializedName("createGroup")
    val result: Group
)

class CreateGroupParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("description")
    var description: String? = null
) {

    fun withDescription(description: String): CreateGroupParam {
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


data class CreateOrgResponse(

    @SerializedName("createOrg")
    val result: Org
)

class CreateOrgParam @JvmOverloads constructor(
    @SerializedName("name")
    var name: String,
    @SerializedName("code")
    var code: String? = null,
    @SerializedName("description")
    var description: String? = null
) {

    fun withCode(code: String): CreateOrgParam {
        this.code = code
        return this
    }

    fun withDescription(description: String): CreateOrgParam {
        this.description = description
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
mutation createOrg(${'$'}name: String!, ${'$'}code: String, ${'$'}description: String) {
  createOrg(name: ${'$'}name, code: ${'$'}code, description: ${'$'}description) {
    id
    rootNode {
      id
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
    var statements: Iterable<PolicyStatementInput>
) {

    fun withDescription(description: String): CreatePolicyParam {
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

    fun withDescription(description: String): CreateRoleParam {
        this.description = description
        return this
    }

    fun withParent(parent: String): CreateRoleParam {
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
    users {
      totalCount
    }
    parent {
      code
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

    fun withKeepPassword(keepPassword: Boolean): CreateUserParam {
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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
    var userpoolTypes: Iterable<String>? = null
) {

    fun withDescription(description: String): CreateUserpoolParam {
        this.description = description
        return this
    }

    fun withLogo(logo: String): CreateUserpoolParam {
        this.logo = logo
        return this
    }

    fun withUserpoolTypes(userpoolTypes: Iterable<String>): CreateUserpoolParam {
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


data class DeleteGroupsResponse(

    @SerializedName("deleteGroups")
    val result: CommonMessage
)

class DeleteGroupsParam @JvmOverloads constructor(
    @SerializedName("codeList")
    var codeList: Iterable<String>
) {


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


data class DeleteNodeResponse(

    @SerializedName("deleteNode")
    val result: CommonMessage
)

class DeleteNodeParam @JvmOverloads constructor(
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("nodeId")
    var nodeId: String
) {


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


data class DeleteOrgResponse(

    @SerializedName("deleteOrg")
    val result: CommonMessage
)

class DeleteOrgParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


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


data class DeletePoliciesResponse(

    @SerializedName("deletePolicies")
    val result: CommonMessage
)

class DeletePoliciesParam @JvmOverloads constructor(
    @SerializedName("codes")
    var codes: Iterable<String>
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
mutation deletePolicies(${'$'}codes: [String!]!) {
  deletePolicies(codes: ${'$'}codes) {
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
    val result: BatchOperationResult
)

class DeleteRolesParam @JvmOverloads constructor(
    @SerializedName("codes")
    var codes: Iterable<String>
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
mutation deleteRoles(${'$'}codes: [String!]!) {
  deleteRoles(codes: ${'$'}codes) {
    succeedCount
    failedCount
    message
    errors
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


data class DeleteUsersResponse(

    @SerializedName("deleteUsers")
    val result: CommonMessage
)

class DeleteUsersParam @JvmOverloads constructor(
    @SerializedName("ids")
    var ids: Iterable<String>
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
  }
}
"""
}


data class MoveNodeResponse(

    @SerializedName("moveNode")
    val result: Org
)

class MoveNodeParam @JvmOverloads constructor(
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("nodeId")
    var nodeId: String,
    @SerializedName("targetParentId")
    var targetParentId: String
) {


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


data class RefreshAccessTokenResponse(

    @SerializedName("refreshAccessToken")
    val result: RefreshAccessTokenRes
)

class RefreshAccessTokenParam @JvmOverloads constructor(
    @SerializedName("accessToken")
    var accessToken: String? = null
) {

    fun withAccessToken(accessToken: String): RefreshAccessTokenParam {
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

    fun withId(id: String): RefreshTokenParam {
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
  }
}
"""
}


data class RemoveMemberResponse(

    @SerializedName("removeMember")
    val result: Node
)

class RemoveMemberParam @JvmOverloads constructor(
    @SerializedName("page")
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
    var userIds: Iterable<String>
) {

    fun withPage(page: Int): RemoveMemberParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): RemoveMemberParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): RemoveMemberParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean): RemoveMemberParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun withNodeId(nodeId: String): RemoveMemberParam {
        this.nodeId = nodeId
        return this
    }

    fun withOrgId(orgId: String): RemoveMemberParam {
        this.orgId = orgId
        return this
    }

    fun withNodeCode(nodeCode: String): RemoveMemberParam {
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
        country
        updatedAt
        customData
      }
    }
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
    var policies: Iterable<String>,
    @SerializedName("targetType")
    var targetType: PolicyAssignmentTargetType,
    @SerializedName("targetIdentifiers")
    var targetIdentifiers: Iterable<String>? = null
) {

    fun withTargetIdentifiers(targetIdentifiers: Iterable<String>): RemovePolicyAssignmentsParam {
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
    val result: Iterable<UserDefinedField>
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
    targetType
    dataType
    key
    label
    options
  }
}
"""
}


data class RemoveUdvResponse(

    @SerializedName("removeUdv")
    val result: Iterable<UserDefinedData>
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


data class RemoveUserFromGroupResponse(

    @SerializedName("removeUserFromGroup")
    val result: CommonMessage
)

class RemoveUserFromGroupParam @JvmOverloads constructor(
    @SerializedName("userIds")
    var userIds: Iterable<String>,
    @SerializedName("code")
    var code: String? = null
) {

    fun withCode(code: String): RemoveUserFromGroupParam {
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


data class RemoveWhitelistResponse(

    @SerializedName("removeWhitelist")
    val result: Iterable<WhiteList>
)

class RemoveWhitelistParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: WhitelistType,
    @SerializedName("list")
    var list: Iterable<String>
) {


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

    fun withPhone(phone: String): ResetPasswordParam {
        this.phone = phone
        return this
    }

    fun withEmail(email: String): ResetPasswordParam {
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
    var roleCodes: Iterable<String>? = null,
    @SerializedName("userIds")
    var userIds: Iterable<String>? = null,
    @SerializedName("groupCodes")
    var groupCodes: Iterable<String>? = null,
    @SerializedName("nodeCodes")
    var nodeCodes: Iterable<String>? = null
) {

    fun withRoleCode(roleCode: String): RevokeRoleParam {
        this.roleCode = roleCode
        return this
    }

    fun withRoleCodes(roleCodes: Iterable<String>): RevokeRoleParam {
        this.roleCodes = roleCodes
        return this
    }

    fun withUserIds(userIds: Iterable<String>): RevokeRoleParam {
        this.userIds = userIds
        return this
    }

    fun withGroupCodes(groupCodes: Iterable<String>): RevokeRoleParam {
        this.groupCodes = groupCodes
        return this
    }

    fun withNodeCodes(nodeCodes: Iterable<String>): RevokeRoleParam {
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


data class SetUdvResponse(

    @SerializedName("setUdv")
    val result: Iterable<UserDefinedData>
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    customData
    roles {
      totalCount
    }
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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

    fun withOldEmail(oldEmail: String): UpdateEmailParam {
        this.oldEmail = oldEmail
        return this
    }

    fun withOldEmailCode(oldEmailCode: String): UpdateEmailParam {
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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


data class UpdateGroupResponse(

    @SerializedName("updateGroup")
    val result: Group
)

class UpdateGroupParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("newCode")
    var newCode: String? = null
) {

    fun withName(name: String): UpdateGroupParam {
        this.name = name
        return this
    }

    fun withDescription(description: String): UpdateGroupParam {
        this.description = description
        return this
    }

    fun withNewCode(newCode: String): UpdateGroupParam {
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


data class UpdateNodeResponse(

    @SerializedName("updateNode")
    val result: Node
)

class UpdateNodeParam @JvmOverloads constructor(
    @SerializedName("page")
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
    var description: String? = null
) {

    fun withPage(page: Int): UpdateNodeParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): UpdateNodeParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): UpdateNodeParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean): UpdateNodeParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

    fun withName(name: String): UpdateNodeParam {
        this.name = name
        return this
    }

    fun withCode(code: String): UpdateNodeParam {
        this.code = code
        return this
    }

    fun withDescription(description: String): UpdateNodeParam {
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

    fun withOldPassword(oldPassword: String): UpdatePasswordParam {
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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

    fun withOldPhone(oldPhone: String): UpdatePhoneParam {
        this.oldPhone = oldPhone
        return this
    }

    fun withOldPhoneCode(oldPhoneCode: String): UpdatePhoneParam {
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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
    var statements: Iterable<PolicyStatementInput>
) {

    fun withDescription(description: String): UpdatePolicyParam {
        this.description = description
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
mutation updatePolicy(${'$'}code: String!, ${'$'}description: String, ${'$'}statements: [PolicyStatementInput!]!) {
  updatePolicy(code: ${'$'}code, description: ${'$'}description, statements: ${'$'}statements) {
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

    fun withDescription(description: String): UpdateRoleParam {
        this.description = description
        return this
    }

    fun withNewCode(newCode: String): UpdateRoleParam {
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
    description
    isSystem
    createdAt
    updatedAt
    users {
      totalCount
    }
    parent {
      code
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

    fun withId(id: String): UpdateUserParam {
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
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

    fun withToken(token: String): CheckLoginStatusParam {
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


data class ChildrenNodesResponse(

    @SerializedName("childrenNodes")
    val result: Iterable<Node>
)

class ChildrenNodesParam @JvmOverloads constructor(
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("nodeId")
    var nodeId: String
) {


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


data class EmailTemplatesResponse(

    @SerializedName("emailTemplates")
    val result: Iterable<EmailTemplate>
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


data class FunctionResponse(

    @SerializedName("function")
    val result: Function
)

class FunctionParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String? = null
) {

    fun withId(id: String): FunctionParam {
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

    fun withPage(page: Int): FunctionsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): FunctionsParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): FunctionsParam {
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


data class GroupResponse(

    @SerializedName("group")
    val result: Group
)

class GroupParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String
) {


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
    users {
      totalCount
    }
  }
}
"""
}


data class GroupWithUsersResponse(

    @SerializedName("group")
    val result: Group
)

class GroupWithUsersParam @JvmOverloads constructor(
    @SerializedName("code")
    var code: String,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null
) {

    fun withPage(page: Int): GroupWithUsersParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): GroupWithUsersParam {
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
        country
        updatedAt
        customData
      }
    }
  }
}
"""
}


data class GroupsResponse(

    @SerializedName("groups")
    val result: PaginatedGroups
)

class GroupsParam @JvmOverloads constructor(
    @SerializedName("userId")
    var userId: String? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null
) {

    fun withUserId(userId: String): GroupsParam {
        this.userId = userId
        return this
    }

    fun withPage(page: Int): GroupsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): GroupsParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): GroupsParam {
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


data class IsRootNodeResponse(

    @SerializedName("isRootNode")
    val result: Boolean
)

class IsRootNodeParam @JvmOverloads constructor(
    @SerializedName("nodeId")
    var nodeId: String,
    @SerializedName("orgId")
    var orgId: String
) {


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

    fun withEmail(email: String): IsUserExistsParam {
        this.email = email
        return this
    }

    fun withPhone(phone: String): IsUserExistsParam {
        this.phone = phone
        return this
    }

    fun withUsername(username: String): IsUserExistsParam {
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


data class NodeByCodeResponse(

    @SerializedName("nodeByCode")
    val result: Node
)

class NodeByCodeParam @JvmOverloads constructor(
    @SerializedName("orgId")
    var orgId: String,
    @SerializedName("code")
    var code: String
) {


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


data class NodeByCodeWithMembersResponse(

    @SerializedName("nodeByCode")
    val result: Node
)

class NodeByCodeWithMembersParam @JvmOverloads constructor(
    @SerializedName("page")
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
    var code: String
) {

    fun withPage(page: Int): NodeByCodeWithMembersParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): NodeByCodeWithMembersParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): NodeByCodeWithMembersParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean): NodeByCodeWithMembersParam {
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
        country
        updatedAt
        customData
      }
    }
  }
}
"""
}


data class NodeByIdResponse(

    @SerializedName("nodeById")
    val result: Node
)

class NodeByIdParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


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


data class NodeByIdWithMembersResponse(

    @SerializedName("nodeById")
    val result: Node
)

class NodeByIdWithMembersParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("id")
    var id: String
) {

    fun withPage(page: Int): NodeByIdWithMembersParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): NodeByIdWithMembersParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): NodeByIdWithMembersParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean): NodeByIdWithMembersParam {
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
        country
        updatedAt
        customData
      }
    }
  }
}
"""
}


data class OrgResponse(

    @SerializedName("org")
    val result: Org
)

class OrgParam @JvmOverloads constructor(
    @SerializedName("id")
    var id: String
) {


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


data class OrgsResponse(

    @SerializedName("orgs")
    val result: PaginatedOrgs
)

class OrgsParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null
) {

    fun withPage(page: Int): OrgsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): OrgsParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): OrgsParam {
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


data class PoliciesResponse(

    @SerializedName("policies")
    val result: PaginatedPolicies
)

class PoliciesParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null
) {

    fun withPage(page: Int): PoliciesParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): PoliciesParam {
        this.limit = limit
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
query policies(${'$'}page: Int, ${'$'}limit: Int) {
  policies(page: ${'$'}page, limit: ${'$'}limit) {
    totalCount
    list {
      code
      assignmentsCount
      isDefault
      description
      createdAt
      updatedAt
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
    val result: PaginatedPolicyAssignment
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

    fun withCode(code: String): PolicyAssignmentsParam {
        this.code = code
        return this
    }

    fun withTargetType(targetType: PolicyAssignmentTargetType): PolicyAssignmentsParam {
        this.targetType = targetType
        return this
    }

    fun withTargetIdentifier(targetIdentifier: String): PolicyAssignmentsParam {
        this.targetIdentifier = targetIdentifier
        return this
    }

    fun withPage(page: Int): PolicyAssignmentsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): PolicyAssignmentsParam {
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

    fun withPage(page: Int): PolicyWithAssignmentsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): PolicyWithAssignmentsParam {
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

    fun withType(type: String): QiniuUptokenParam {
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

    fun withId(id: String): QueryMfaParam {
        this.id = id
        return this
    }

    fun withUserId(userId: String): QueryMfaParam {
        this.userId = userId
        return this
    }

    fun withUserPoolId(userPoolId: String): QueryMfaParam {
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
        country
        updatedAt
        customData
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

    fun withPage(page: Int): RolesParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): RolesParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): RolesParam {
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


data class RootNodeResponse(

    @SerializedName("rootNode")
    val result: Node
)

class RootNodeParam @JvmOverloads constructor(
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("sortBy")
    var sortBy: SortByEnum? = null,
    @SerializedName("includeChildrenNodes")
    var includeChildrenNodes: Boolean? = null,
    @SerializedName("orgId")
    var orgId: String
) {

    fun withPage(page: Int): RootNodeParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): RootNodeParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): RootNodeParam {
        this.sortBy = sortBy
        return this
    }

    fun withIncludeChildrenNodes(includeChildrenNodes: Boolean): RootNodeParam {
        this.includeChildrenNodes = includeChildrenNodes
        return this
    }

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
query rootNode(${'$'}page: Int, ${'$'}limit: Int, ${'$'}sortBy: SortByEnum, ${'$'}includeChildrenNodes: Boolean, ${'$'}orgId: String!) {
  rootNode(orgId: ${'$'}orgId) {
    id
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


data class SearchUserResponse(

    @SerializedName("searchUser")
    val result: PaginatedUsers
)

class SearchUserParam @JvmOverloads constructor(
    @SerializedName("query")
    var query: String,
    @SerializedName("fields")
    var fields: Iterable<String>? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("limit")
    var limit: Int? = null
) {

    fun withFields(fields: Iterable<String>): SearchUserParam {
        this.fields = fields
        return this
    }

    fun withPage(page: Int): SearchUserParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): SearchUserParam {
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
      country
      createdAt
      updatedAt
      customData
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
    val result: Iterable<SocialConnectionInstance>
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
    val result: Iterable<SocialConnection>
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
    val result: Iterable<UserDefinedField>
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
    val result: Iterable<UserDefinedData>
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

    fun withId(id: String): UserParam {
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
  }
}
"""
}


data class UserBatchResponse(

    @SerializedName("userBatch")
    val result: Iterable<User>
)

class UserBatchParam @JvmOverloads constructor(
    @SerializedName("ids")
    var ids: Iterable<String>
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
    identities {
      openid
      userIdInIdp
      userId
      connectionId
      isSocial
      provider
      userPoolId
    }
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
    country
    createdAt
    updatedAt
    customData
  }
}
"""
}


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
  }
}
"""
}


data class UserpoolTypesResponse(

    @SerializedName("userpoolTypes")
    val result: Iterable<UserPoolType>
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

    fun withPage(page: Int): UserpoolsParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): UserpoolsParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): UserpoolsParam {
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

    fun withPage(page: Int): UsersParam {
        this.page = page
        return this
    }

    fun withLimit(limit: Int): UsersParam {
        this.limit = limit
        return this
    }

    fun withSortBy(sortBy: SortByEnum): UsersParam {
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
      country
      createdAt
      updatedAt
      customData
    }
  }
}
"""
}


data class WhitelistResponse(

    @SerializedName("whitelist")
    val result: Iterable<WhiteList>
)

class WhitelistParam @JvmOverloads constructor(
    @SerializedName("type")
    var type: WhitelistType
) {


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
