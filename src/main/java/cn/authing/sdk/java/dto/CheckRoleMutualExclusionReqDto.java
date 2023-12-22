package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.RoleCodeDto;

public class CheckRoleMutualExclusionReqDto {
    /**
     * 角色信息列表
     */
    @JsonProperty("roles")
    private List<RoleCodeDto> roles;

    public List<RoleCodeDto> getRoles() {
        return roles;
    }
    public void setRoles(List<RoleCodeDto> roles) {
        this.roles = roles;
    }



}