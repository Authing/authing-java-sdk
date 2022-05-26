package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.RoleCodeDto;
import cn.authing.sdk.java.dto.TargetDto;

public class RevokeRoleBatchDto {
    /**
     * 移除角色的目标列表
     */
    @JsonProperty("targets")
    private List<TargetDto> targets;
    /**
     * 角色信息列表
     */
    @JsonProperty("roles")
    private List<RoleCodeDto> roles;

    public List<TargetDto> getTargets() {
        return targets;
    }
    public void setTargets(List<TargetDto> targets) {
        this.targets = targets;
    }

    public List<RoleCodeDto> getRoles() {
        return roles;
    }
    public void setRoles(List<RoleCodeDto> roles) {
        this.roles = roles;
    }



}