package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPublicAccountsOfRoleDto {
    /**
     * 角色 ID
     */
    @JsonProperty("roleId")
    private String roleId;

    public String getRoleId() {
        return roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }



}