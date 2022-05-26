package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class HasAnyRoleDto {
    /**
     * 是否拥有其中某一个角色
     */
    @JsonProperty("hasAnyRole")
    private Boolean hasAnyRole;

    public Boolean getHasAnyRole() {
        return hasAnyRole;
    }
    public void setHasAnyRole(Boolean hasAnyRole) {
        this.hasAnyRole = hasAnyRole;
    }



}