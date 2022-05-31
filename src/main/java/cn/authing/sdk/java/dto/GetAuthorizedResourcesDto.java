package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAuthorizedResourcesDto {
    /**
     * 目标对象类型
     */
    @JsonProperty("targetType")
    private String targetType;
    /**
     * 目标对象唯一标志符
     */
    @JsonProperty("targetIdentifier")
    private String targetIdentifier;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    @JsonProperty("resourceType")
    private String resourceType;

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

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }



}