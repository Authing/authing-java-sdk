package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DepartmentDto {
    /**
     * 部门系统 ID（为 Authing 系统自动生成，不可修改）
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 自定义部门 ID，用于存储自定义的 ID
     */
    @JsonProperty("openDepartmentId")
    private String openDepartmentId;
    /**
     * 父部门 id
     */
    @JsonProperty("parentDepartmentId")
    private String parentDepartmentId;
    /**
     * 父部门自定义的 ID
     */
    @JsonProperty("parentOpenDepartmentId")
    private String parentOpenDepartmentId;
    /**
     * 部门名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 部门描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 部门识别码
     */
    @JsonProperty("code")
    private String code;
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
    /**
     * 是否包含子部门
     */
    @JsonProperty("hasChildren")
    private Boolean hasChildren;

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

    public String getParentDepartmentId() {
        return parentDepartmentId;
    }
    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getParentOpenDepartmentId() {
        return parentOpenDepartmentId;
    }
    public void setParentOpenDepartmentId(String parentOpenDepartmentId) {
        this.parentOpenDepartmentId = parentOpenDepartmentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
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

    public Boolean getHasChildren() {
        return hasChildren;
    }
    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }



}