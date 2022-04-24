package dto;

import java.util.List;

import dto.RoleCodeDto;
import dto.TargetDto;

public class AssignRoleBatchDto {
    /**
     * 部门信息
     */
    private List<TargetDto> targets;
    /**
     * 角色信息
     */
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



};