package dto;

import dto.TargetDto;

public class AssignRoleDto {
    /**
     * 目标对象
     */
    private Array<TargetDto> targets
    /**
     * 分组 code，识别码
     */
    private String code
    /**
     * 权限分组
     */
    private String namespace

    public Array<TargetDto> getTargets() {
        return targets;
    }
    public void setTargets(Array<TargetDto> targets) {
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

};