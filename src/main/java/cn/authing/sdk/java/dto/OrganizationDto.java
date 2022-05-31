package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


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
    @JsonProperty("leaderUserId")
    private String leaderUserId;
    /**
     * 部门人数
     */
    @JsonProperty("membersCount")
    private Integer membersCount;

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

    public String getLeaderUserId() {
        return leaderUserId;
    }
    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

    public Integer getMembersCount() {
        return membersCount;
    }
    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }



}