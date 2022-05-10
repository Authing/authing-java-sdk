package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class HasAnyRoleDto {
    /**
     * 是否拥有其中某一个角色
     */
    @JsonProperty("getHasAnyRole")
    private Boolean hasAnyRole;

    public Boolean getHasAnyRole() {
        return hasAnyRole;
    }
    public void setHasAnyRole(Boolean hasAnyRole) {
        this.hasAnyRole = hasAnyRole;
    }



}