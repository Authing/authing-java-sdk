package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.GroupBo;
import cn.authing.sdk.java.dto.NodeBo;
import cn.authing.sdk.java.dto.PolicyBo;
import cn.authing.sdk.java.dto.RoleBo;

public class ListPermissionViewRespDto {
    /**
     * 用户的唯一标志，可以是用户 ID、用户名、邮箱、手机号、externalId、在外部身份源的 ID，详情见 userIdType 字段的说明。默认为用户 id 。
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 用户真实名称，不具备唯一性
     */
    @JsonProperty("username")
    private String username;
    /**
     * 权限空间 id
     */
    @JsonProperty("namespaceId")
    private String namespaceId;
    /**
     * 权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 权限空间名称
     */
    @JsonProperty("namespaceName")
    private String namespaceName;
    /**
     * 数据资源 id
     */
    @JsonProperty("dataResourceId")
    private String dataResourceId;
    /**
     * 数据资源 Code
     */
    @JsonProperty("dataResourceCode")
    private String dataResourceCode;
    /**
     * 数据资源 名称
     */
    @JsonProperty("dataResourceName")
    private String dataResourceName;
    /**
     * 数据策略列表
     */
    @JsonProperty("dataPolicyList")
    private List<PolicyBo> dataPolicyList;
    /**
     * 角色列表
     */
    @JsonProperty("roleList")
    private List<RoleBo> roleList;
    /**
     * 用户组列表
     */
    @JsonProperty("groupList")
    private List<GroupBo> groupList;
    /**
     * 组织机构列表
     */
    @JsonProperty("nodeList")
    private List<NodeBo> nodeList;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getNamespaceId() {
        return namespaceId;
    }
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }
    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }

    public String getNamespaceName() {
        return namespaceName;
    }
    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public String getDataResourceId() {
        return dataResourceId;
    }
    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public String getDataResourceCode() {
        return dataResourceCode;
    }
    public void setDataResourceCode(String dataResourceCode) {
        this.dataResourceCode = dataResourceCode;
    }

    public String getDataResourceName() {
        return dataResourceName;
    }
    public void setDataResourceName(String dataResourceName) {
        this.dataResourceName = dataResourceName;
    }

    public List<PolicyBo> getDataPolicyList() {
        return dataPolicyList;
    }
    public void setDataPolicyList(List<PolicyBo> dataPolicyList) {
        this.dataPolicyList = dataPolicyList;
    }

    public List<RoleBo> getRoleList() {
        return roleList;
    }
    public void setRoleList(List<RoleBo> roleList) {
        this.roleList = roleList;
    }

    public List<GroupBo> getGroupList() {
        return groupList;
    }
    public void setGroupList(List<GroupBo> groupList) {
        this.groupList = groupList;
    }

    public List<NodeBo> getNodeList() {
        return nodeList;
    }
    public void setNodeList(List<NodeBo> nodeList) {
        this.nodeList = nodeList;
    }



}