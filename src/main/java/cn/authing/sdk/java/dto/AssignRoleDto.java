package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.TargetDto;

public class AssignRoleDto {
    /**
     * 目标对象
     */
    @JsonProperty("targets")
    private List<TargetDto> targets;
    /**
     * 权限分组内角色的唯一标识符
     */
    @JsonProperty("code")
    private String code;
    /**
     * 主体过期时间毫秒值, 为 null 时永久有效
     */
    @JsonProperty("endTime")
    private Integer endTime;
    /**
     * 主体加入时间毫秒值, 为 null 时立即加入
     */
    @JsonProperty("enableTime")
    private Integer enableTime;
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

    public Integer getEndTime() {
        return endTime;
    }
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getEnableTime() {
        return enableTime;
    }
    public void setEnableTime(Integer enableTime) {
        this.enableTime = enableTime;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}