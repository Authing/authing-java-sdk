package cn.authing.core.types

import cn.authing.core.graphql.GraphQLRequest
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.*

data class OrgNode(
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
    @SerializedName("nameI18n")
    var nameI18n: Any? = null,
    /** @param [description] 描述信息 */
    @SerializedName("description")
    var description: String? = null,
    /** @param [descriptionI18n] 多语言描述信息 */
    @SerializedName("descriptionI18n")
    var descriptionI18n: Any? = null,
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
    var children: List<OrgNode>? = null,
    /** @param [users] 节点的用户列表 */
    @SerializedName("members")
    var users: List<User>,
    /** @param [authorizedResources] 被授权访问的所有资源 */
    @SerializedName("authorizedResources")
    var authorizedResources: PaginatedAuthorizedResources? = null
)

data class RestAddMembersParams
constructor(
    val nodeId: String,
    @Expose
    val userIds: List<String>
)

data class ListAuthorizedResourcesOptions
constructor(
    var resourceType: ResourceType?
)
