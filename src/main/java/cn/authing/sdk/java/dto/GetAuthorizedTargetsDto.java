package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.GetAuthorizedResourceActionDto;

public class GetAuthorizedTargetsDto {
    /**
     * 资源
     */
    @JsonProperty("resource")
    private String resource;
    /**
     * 权限分组
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 资源类型
     */
    @JsonProperty("resourceType")
    private ResourceType resourceType;
    /**
     * 主体类型
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * Action 列表
     */
    @JsonProperty("actions")
    private GetAuthorizedResourceActionDto actions;

    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public GetAuthorizedResourceActionDto getActions() {
        return actions;
    }
    public void setActions(GetAuthorizedResourceActionDto actions) {
        this.actions = actions;
    }


    /**
     * 资源类型
     */
    public static enum ResourceType {

        @JsonProperty("DATA")
        DATA("DATA"),

        @JsonProperty("API")
        API("API"),

        @JsonProperty("MENU")
        MENU("MENU"),

        @JsonProperty("BUTTON")
        BUTTON("BUTTON"),

        @JsonProperty("UI")
        UI("UI"),
        ;

        private String value;

        ResourceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 主体类型
     */
    public static enum TargetType {

        @JsonProperty("USER")
        USER("USER"),

        @JsonProperty("ROLE")
        ROLE("ROLE"),

        @JsonProperty("GROUP")
        GROUP("GROUP"),

        @JsonProperty("DEPARTMENT")
        DEPARTMENT("DEPARTMENT"),
        ;

        private String value;

        TargetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}