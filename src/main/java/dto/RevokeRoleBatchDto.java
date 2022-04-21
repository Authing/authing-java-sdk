package dto;

import dto.RoleCodeDto;
import dto.TargetDto;

public class RevokeRoleBatchDto {
    /**
     * 目标信息
     */
    private Array<TargetDto> targets
    /**
     * 角色信息
     */
    private Array<RoleCodeDto> roles

    public Array<TargetDto> getTargets() {
        return targets;
    }
    public void setTargets(Array<TargetDto> targets) {
        this.targets = targets;
    }

    public Array<RoleCodeDto> getRoles() {
        return roles;
    }
    public void setRoles(Array<RoleCodeDto> roles) {
        this.roles = roles;
    }

};