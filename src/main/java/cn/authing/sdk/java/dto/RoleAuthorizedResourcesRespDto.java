package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoleAuthorizedResourcesRespDto {
    /**
     * 资源描述符
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 资源类型
     */
    @JsonProperty("resourceType")
    private ResourceType resourceType;
    /**
     * 被授权的操作列表
     */
    @JsonProperty("actions")
    private List<String> actions;
    /**
     * 资源对应的 API Identifier
     */
    @JsonProperty("apiIdentifier")
    private String apiIdentifier;

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public List<String> getActions() {
        return actions;
    }
    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getApiIdentifier() {
        return apiIdentifier;
    }
    public void setApiIdentifier(String apiIdentifier) {
        this.apiIdentifier = apiIdentifier;
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


}