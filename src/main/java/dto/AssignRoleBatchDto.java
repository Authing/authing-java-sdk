package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.RoleCodeDto;
import dto.TargetDto;

public class AssignRoleBatchDto {
    /**
     * 分配角色的目标列表
     */
    @JsonProperty("getTargets")
    private List<TargetDto> nase targets;
    /**
     * 角色信息列表
     */
    @JsonProperty("getRoles")
    private List<RoleCodeDto> nase roles;

    public List<TargetDto> nase getTargets() {
        return targets;
    }
    public void setTargets(List<TargetDto> nase targets) {
        this.targets = targets;
    }

    public List<RoleCodeDto> nase getRoles() {
        return roles;
    }
    public void setRoles(List<RoleCodeDto> nase roles) {
        this.roles = roles;
    }



}