package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.HasRoleRolesDto;

public class HasAnyRoleReqDto {
    /**
     * 角色列表
     */
    @JsonProperty("roles")
    private List<HasRoleRolesDto> roles;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;

    public List<HasRoleRolesDto> getRoles() {
        return roles;
    }
    public void setRoles(List<HasRoleRolesDto> roles) {
        this.roles = roles;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}