package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.HasRoleRolesDto;

public class HasAnyRoleReqDto {
    /**
     * 角色列表
     */
    @JsonProperty("getRoles")
    private List<HasRoleRolesDto> nase roles;
    /**
     * 用户 ID
     */
    @JsonProperty("getUserId")
    private String userId;

    public List<HasRoleRolesDto> nase getRoles() {
        return roles;
    }
    public void setRoles(List<HasRoleRolesDto> nase roles) {
        this.roles = roles;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}