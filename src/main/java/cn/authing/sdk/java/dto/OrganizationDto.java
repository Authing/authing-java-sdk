package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.OrganizationNameI18nDto;

public class OrganizationDto {
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 组织名称
     */
    @JsonProperty("organizationName")
    private String organizationName;
    /**
     * 组织描述信息
     */
    @JsonProperty("description")
    private String description;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 修改时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * 根节点 ID
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 根节点自定义 ID
     */
    @JsonProperty("openDepartmentId")
    private String openDepartmentId;
    /**
     * 是否包含子节点
     */
    @JsonProperty("hasChildren")
    private Boolean hasChildren;
    /**
     * 部门负责人 ID
     */
    @JsonProperty("leaderUserIds")
    private List<String> leaderUserIds;
    /**
     * 部门人数
     */
    @JsonProperty("membersCount")
    private Integer membersCount;
    /**
     * 是否是虚拟部门
     */
    @JsonProperty("isVirtualNode")
    private Boolean isVirtualNode;
    /**
     * 多语言设置
     */
    @JsonProperty("i18n")
    private OrganizationNameI18nDto i18n;
    /**
     * 部门的扩展字段数据
     */
    @JsonProperty("customData")
    private Object customData;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 岗位 id 列表
     */
    @JsonProperty("postIdList")
    private List<String> postIdList;
    /**
     * 状态
     */
    @JsonProperty("status")
    private String status;
    /**
     * 访问限制
     */
    @JsonProperty("allow")
    private String allow;

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOpenDepartmentId() {
        return openDepartmentId;
    }
    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }
    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public List<String> getLeaderUserIds() {
        return leaderUserIds;
    }
    public void setLeaderUserIds(List<String> leaderUserIds) {
        this.leaderUserIds = leaderUserIds;
    }

    public Integer getMembersCount() {
        return membersCount;
    }
    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    public Boolean getIsVirtualNode() {
        return isVirtualNode;
    }
    public void setIsVirtualNode(Boolean isVirtualNode) {
        this.isVirtualNode = isVirtualNode;
    }

    public OrganizationNameI18nDto getI18n() {
        return i18n;
    }
    public void setI18n(OrganizationNameI18nDto i18n) {
        this.i18n = i18n;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public List<String> getPostIdList() {
        return postIdList;
    }
    public void setPostIdList(List<String> postIdList) {
        this.postIdList = postIdList;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getAllow() {
        return allow;
    }
    public void setAllow(String allow) {
        this.allow = allow;
    }



}