package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.TargetDto;

public class RevokeRoleDto {
    /**
     * 移除角色的目标
     */
    @JsonProperty("targets")
    private List<TargetDto> targets;
    /**
     * 权限分组内角色的唯一标识符
     */
    @JsonProperty("code")
    private String code;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("namespace")
    private String namespace;

    public List<TargetDto> getTargets() {
        return targets;
    }
    public void setTargets(List<TargetDto> targets) {
        this.targets = targets;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}