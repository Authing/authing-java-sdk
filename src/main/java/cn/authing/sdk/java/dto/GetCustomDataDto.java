package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetCustomDataDto {
    /**
     * 主体类型，目前支持用户、角色、分组和部门
     */
    @JsonProperty("targetType")
    private String targetType;
    /**
     * 目标对象唯一标志符
     */
    @JsonProperty("targetIdentifier")
    private String targetIdentifier;
    /**
     * 所属权限分组的 code，当 targetType 为角色的时候需要填写，否则可以忽略。
     */
    @JsonProperty("namespace")
    private String namespace;

    public String getTargetType() {
        return targetType;
    }
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}