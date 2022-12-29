package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RolePermissionListDto {
    /**
     * 角色 ID
     */
    @JsonProperty("roleId")
    private String roleId;
    /**
     * 主体状态，DISABLE-未加入角色，ENABLE-已经加入了角色
     */
    @JsonProperty("status")
    private String status;
    /**
     * 主体加入时间毫秒值
     */
    @JsonProperty("enableTime")
    private Integer enableTime;
    /**
     * 主体失效时间毫秒值，为 null 表示用不失效
     */
    @JsonProperty("endTime")
    private Integer endTime;
    /**
     * 所属用户池 ID
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * 角色名称，最多 50 字符
     */
    @JsonProperty("roleName")
    private String roleName;
    /**
     * 角色 code,只能使用字母、数字和 -_，最多 50 字符
     */
    @JsonProperty("roleCode")
    private String roleCode;
    /**
     * 角色描述信息,最多两百字符
     */
    @JsonProperty("description")
    private String description;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;

    public String getRoleId() {
        return roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getEnableTime() {
        return enableTime;
    }
    public void setEnableTime(Integer enableTime) {
        this.enableTime = enableTime;
    }

    public Integer getEndTime() {
        return endTime;
    }
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
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



}