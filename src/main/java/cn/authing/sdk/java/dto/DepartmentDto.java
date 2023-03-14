package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DepartmentI18nDto;

public class DepartmentDto {
    /**
     * 组织 Code（organizationCode）
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 部门系统 ID（为 Authing 系统自动生成，不可修改）
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 部门创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 修改时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * 自定义部门 ID，用于存储自定义的 ID
     */
    @JsonProperty("openDepartmentId")
    private String openDepartmentId;
    /**
     * 部门名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 部门负责人 ID
     */
    @JsonProperty("leaderUserIds")
    private List<String> leaderUserIds;
    /**
     * 部门描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 父部门 id
     */
    @JsonProperty("parentDepartmentId")
    private String parentDepartmentId;
    /**
     * 部门识别码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 部门人数（仅包含直属成员）
     */
    @JsonProperty("membersCount")
    private Integer membersCount;
    /**
     * 是否包含子部门
     */
    @JsonProperty("hasChildren")
    private Boolean hasChildren;
    /**
     * 是否是虚拟部门
     */
    @JsonProperty("isVirtualNode")
    private Boolean isVirtualNode;
    /**
     * 多语言设置
     */
    @JsonProperty("i18n")
    private DepartmentI18nDto i18n;
    /**
     * 部门的扩展字段数据
     */
    @JsonProperty("customData")
    private Object customData;
    /**
     * 岗位 id 列表
     */
    @JsonProperty("postIdList")
    private String postIdList;

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
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

    public String getOpenDepartmentId() {
        return openDepartmentId;
    }
    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLeaderUserIds() {
        return leaderUserIds;
    }
    public void setLeaderUserIds(List<String> leaderUserIds) {
        this.leaderUserIds = leaderUserIds;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Integer getMembersCount() {
        return membersCount;
    }
    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }
    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public Boolean getIsVirtualNode() {
        return isVirtualNode;
    }
    public void setIsVirtualNode(Boolean isVirtualNode) {
        this.isVirtualNode = isVirtualNode;
    }

    public DepartmentI18nDto getI18n() {
        return i18n;
    }
    public void setI18n(DepartmentI18nDto i18n) {
        this.i18n = i18n;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
    }

    public String getPostIdList() {
        return postIdList;
    }
    public void setPostIdList(String postIdList) {
        this.postIdList = postIdList;
    }



}