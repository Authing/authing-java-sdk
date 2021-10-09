package cn.authing.core.types

import java.util.*

data class IResourceQueryFilter
@JvmOverloads
constructor(
    var page: Int? = 1,
    var limit: Int? = 10,
    var type: ResourceType? = null,
    var namespaceCode: String
)

enum class TargetTypeEnum(var label: String) {
    USER("USER"),
    ROLE("ROLE"),
    GROUP("GROUP"),
    ORG("ORG");
}

enum class DefaultStrategy(var label: String) {
    ALLOW_ALL("ALLOW_ALL"),
    DENY_ALL("DENY_ALL");
}

class IAction
@JvmOverloads
constructor(
    var name: String,
    var description: String? = null
)

data class IResourceResponse(
    var userPoolId: String,
    var code: String,
    var actions: List<IAction>,
    var type: String,
    var description: String,
    var namespaceId: Int,
    var createdAt: Date,
    var updatedAt: Date,
    var id: String,
    var apiIdentifier: String
)

data class IResourceDto
@JvmOverloads
constructor(
    var code: String,
    var type: ResourceType,
    var description: String? = null,
    var actions: List<IAction>,
    var namespace: String,
    var apiIdentifier: String? = null
)

class IAppAccessPolicyQueryFilter
@JvmOverloads
constructor(
    var appId: String,
    var page: Int? = 1,
    var limit: Int? = 10
)


data class Statement(
    var resource: String,
    var actions: List<String>,
    var effect: String,
    var condition: List<Any>,
    var resourceType: ResourceType?
)

data class IPolicy(
    var id: String,
    var createdAt: Date,
    var updatedAt: Date,
    var userPoolId: String,
    var isDefault: Boolean,
    var isAuto: Boolean,
    var hidden: Boolean,
    var code: String,
    var description: String,
    var statements: List<Statement>,
    var namespaceId: Int
)

data class IApplicationAccessPolicies(
    var assignedAt: Date,
    var inheritByChildren: Boolean,
    var enabled: Boolean,
    var policyId: String,
    var code: String,
    var policy: IPolicy
)

class IAppAccessPolicy
@JvmOverloads
constructor(
    var appId: String,
    var targetType: TargetTypeEnum,
    var targetIdentifiers: List<String>,
    var namespace: String? = null,
    var inheritByChildren: String? = null
)

data class IDefaultAppAccessPolicy(
    var appId: String,
    var defaultStrategy: DefaultStrategy
)

data class ProgrammaticAccessAccount(
    var id: String,
    var createdAt: String,
    var updatedAt: String,
    var appId: String,
    var secret: String,
    var remarks: String,
    var tokenLifetime: Int,
    var enabled: Boolean,
    var userId: String
)

class IProgrammaticAccessAccountProps
@JvmOverloads
constructor(
    var id: String,
    var secret: String? = null
)


class IProgrammaticAccessAccountListProps
@JvmOverloads
constructor(
    var appId: String,
    var page: Int? = 1,
    var limit: Int? = 10
)

class ICreateProgrammaticAccessAccountProps
@JvmOverloads
constructor(
    var appId: String,
    var tokenLifetime: Int? = 600,
    var remarks: String? = ""
)

data class IEnableProgrammaticAccessAccount(
    val id: String,
    val enabled: Boolean
)

data class CreateNamespaceBody
@JvmOverloads
constructor(
    var code: String,
    var name: String,
    var description: String? = null
)

data class ResourceNamespace(
    var id: Int,
    var code: String,
    var name: String,
    var description: String,
    var status: Int,
    var applicationId: String,
    var appName: String
)

data class PaginatedResourceNamespace(
    val totalCount: Int,
    var list: List<ResourceNamespace>,
    var id: String,
    var enabled: Boolean
)

data class ListAuthorizedResourcesParams
@JvmOverloads
constructor(
    var targetType: PolicyAssignmentTargetType,
    var targetIdentifier: String,
    var namespace: String,
    var resourceType: ResourceType? = null
)

data class AclListResourcesParams
@JvmOverloads
constructor(
    var namespaceCode: String? = null,
    var type: ResourceType? = null,
    var limit: Number = 10,
    var page: Number = 1,
    var fetchAll: Boolean = false
)

data class UpdateNamespaceParams
@JvmOverloads
constructor(
    var name: String? = null,
    var code: String? = null,
    var description: String? = null
)

data class UpdateDefaultApplicationParams
@JvmOverloads
constructor(
    var permissionStrategy: IDefaultAppAccessPolicy? = null

)