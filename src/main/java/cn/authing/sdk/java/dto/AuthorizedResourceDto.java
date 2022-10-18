package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.PolicyCondition;

public class AuthorizedResourceDto {
    /**
     * 资源描述符
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 资源描述信息
     */
    @JsonProperty("description")
    private String description;
    /**
     * 策略 Condition
     */
    @JsonProperty("condition")
    private List<PolicyCondition> condition;
    /**
     * 资源类型
     */
    @JsonProperty("resourceType")
    private ResourceType resourceType;
    /**
     * API URL
     */
    @JsonProperty("apiIdentifier")
    private String apiIdentifier;
    /**
     * 授权的操作列表
     */
    @JsonProperty("actions")
    private List<String> actions;
    /**
     * 允许还是拒绝
     */
    @JsonProperty("effect")
    private Effect effect;

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<PolicyCondition> getCondition() {
        return condition;
    }
    public void setCondition(List<PolicyCondition> condition) {
        this.condition = condition;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public String getApiIdentifier() {
        return apiIdentifier;
    }
    public void setApiIdentifier(String apiIdentifier) {
        this.apiIdentifier = apiIdentifier;
    }

    public List<String> getActions() {
        return actions;
    }
    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public Effect getEffect() {
        return effect;
    }
    public void setEffect(Effect effect) {
        this.effect = effect;
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
     * 允许还是拒绝
     */
    public static enum Effect {


        @JsonProperty("ALLOW")
        ALLOW("ALLOW"),


        @JsonProperty("DENY")
        DENY("DENY"),
        ;

        private String value;

        Effect(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}