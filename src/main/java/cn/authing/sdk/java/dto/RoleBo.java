package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoleBo {
    /**
     * 角色 id
     */
    @JsonProperty("roleId")
    private String roleId;
    /**
     * 角色名称
     */
    @JsonProperty("roleName")
    private String roleName;
    /**
     * 角色 Code
     */
    @JsonProperty("roleCode")
    private String roleCode;

    public String getRoleId() {
        return roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
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



}