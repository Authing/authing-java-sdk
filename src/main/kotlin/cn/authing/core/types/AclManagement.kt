package cn.authing.core.types

import java.util.*

data class IResourceQueryFilter(
    val page: Number,
    val limit: Number,
    val namespaceCode: String,
    val type: ResourceType
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

data class IAction(
    val name: String,
    val description: String?
)

data class IResourceResponse(
    val userPoolId: String,
    val code: String,
    val actions: List<IAction>,
    val type: String,
    val description: String,
    val namespaceId: Number,
    val createdAt: Date,
    val updatedAt: Date,
    val id: String,
    val apiIdentifier: String
)

data class IResourceDto(
    val code: String,
    val type: ResourceType,
    val description: String?,
    val actions: List<IAction>,
    val namespace: String
)

data class IAppAccessPolicyQueryFilter(
    val appId: String
) : PaginationQuery()

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
    val namespaceId: Number
)

data class IApplicationAccessPolicies(
    val assignedAt: Date,
    val inheritByChildren: Boolean,
    val enabled: Boolean,
    val policyId: String,
    val code: String,
    val policy: IPolicy
)

data class IAppAccessPolicy(
    val appId: String,
    val targetType: TargetTypeEnum,
    val targetIdentifiers: List<String>,
    val namespace: String?,
    val inheritByChildren: String?
)

data class IDefaultAppAccessPolicy(
    val appId: String,
    val defaultStrategy: DefaultStrategy
)