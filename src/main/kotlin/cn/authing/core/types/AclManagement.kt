package cn.authing.core.types

import java.util.*

data class IResourceQueryFilter(
    val page: Number,
    val limit: Number,
    val namespaceCode: String,
    val type: ResourceType
)

data class IAction(
    val name: String,
    val description: String?
)

data class IResourceResponse(
    val userPoolId: String,
    val code: String,
    val actions: IAction,
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
    val actions: IAction,
    val namespace: String
)