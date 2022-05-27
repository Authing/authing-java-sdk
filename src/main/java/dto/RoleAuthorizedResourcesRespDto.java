package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class RoleAuthorizedResourcesRespDto {
    /**
     * 资源描述符
     */
    @JsonProperty("getResourceCode")
    private String resourceCode;
    /**
     * 资源类型
     */
    @JsonProperty("getResourceType")
    private ResourceType resourceType;
    /**
     * 被授权的操作列表
     */
    @JsonProperty("getActions")
    private List<String> actions;
    /**
     * 资源对应的 API Identifier
     */
    @JsonProperty("getApiIdentifier")
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
        DATA("DATA"),
        API("API"),
        MENU("MENU"),
        BUTTON("BUTTON"),
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