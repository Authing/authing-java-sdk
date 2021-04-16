package cn.authing.core.types

import java.util.*

data class IResourceQueryFilter
@JvmOverloads
constructor(
    val page: Int? = 1,
    val limit: Int? = 10,
    val type: ResourceType? = null,
    val namespaceCode: String
)

enum class TargetTypeEnum(val label: String) {
    USER("USER"),
    ROLE("ROLE"),
    GROUP("GROUP"),
    ORG("ORG");
}

enum class DefaultStrategy(val label: String) {
    ALLOW_ALL("ALLOW_ALL"),
    DENY_ALL("DENY_ALL");
}

class IAction
@JvmOverloads
constructor(
    val name: String,
    val description: String? = null
)

data class IResourceResponse(
    val userPoolId: String,
    val code: String,
    val actions: List<IAction>,
    val type: String,
    val description: String,
    val namespaceId: Int,
    val createdAt: Date,
    val updatedAt: Date,
    val id: String,
    val apiIdentifier: String
)

data class IResourceDto
@JvmOverloads
constructor(
    val code: String,
    val type: ResourceType,
    val description: String? = null,
    val actions: List<IAction>,
    val namespace: String
)

class IAppAccessPolicyQueryFilter
@JvmOverloads
constructor(
    val appId: String,
    val page: Int? = 1,
    val limit: Int? = 10
)


data class Statement(
    val resource: String,
    val actions: List<String>,
    val effect: String,
    val condition: List<Any>,
    val resourceType: ResourceType?
)

data class IPolicy(
    val id: String,
    val createdAt: Date,
    val updatedAt: Date,
    val userPoolId: String,
    val isDefault: Boolean,
    val isAuto: Boolean,
    val hidden: Boolean,
    val code: String,
    val description: String,
    val statements: List<Statement>,
    val namespaceId: Int
)

data class IApplicationAccessPolicies(
    val assignedAt: Date,
    val inheritByChildren: Boolean,
    val enabled: Boolean,
    val policyId: String,
    val code: String,
    val policy: IPolicy
)

class IAppAccessPolicy
@JvmOverloads
constructor(
    val appId: String,
    val targetType: TargetTypeEnum,
    val targetIdentifiers: List<String>,
    val namespace: String? = null,
    val inheritByChildren: String? = null
)

data class IDefaultAppAccessPolicy(
    val appId: String,
    val defaultStrategy: DefaultStrategy
)

data class ProgrammaticAccessAccount(
    val id: String,
    val createdAt: String,
    val updatedAt: String,
    val appId: String,
    val secret: String,
    val remarks: String,
    val tokenLifetime: Int,
    val enabled: Boolean,
    val userId: String
)

class IProgrammaticAccessAccountProps
@JvmOverloads
constructor(
    val id: String,
    var secret: String? = null
)


class IProgrammaticAccessAccountListProps
@JvmOverloads
constructor(
    val appId: String,
    val page: Int? = 1,
    val limit: Int? = 10
)

class ICreateProgrammaticAccessAccountProps
@JvmOverloads
constructor(
    val appId: String,
    val tokenLifetime: Int? = 600,
    val remarks: String? = ""
)

data class IEnableProgrammaticAccessAccount(
    val id: String,
    val enabled: Boolean
)

data class ListAuthorizedResourcesParams
@JvmOverloads
constructor(
    val targetType: PolicyAssignmentTargetType,
    val targetIdentifier: String,
    val namespace: String,
    val resourceType: ResourceType? = null
)