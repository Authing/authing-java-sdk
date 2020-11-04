package cn.authing.core.types

import com.google.gson.annotations.SerializedName

data class PaginatedRoles(
    /** @param [totalCount] totalCount */
    @SerializedName("totalCount")
    var totalCount: Int,
    /** @param [list] list */
    @SerializedName("list")
    var list: List<Role>
)


data class Role(
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
    /** @param [parent] 父角色 */
    @SerializedName("parent")
    var parent: Role? = null
)
