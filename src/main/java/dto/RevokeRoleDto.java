package dto;

import java.util.List;

import dto.TargetDto;

public class RevokeRoleDto {
    /**
     * 部门信息
     */
    private List<TargetDto> targets;
    /**
     * 分组 code，识别码
     */
    private String code;
    /**
     * 权限分组
     */
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