package dto;

import java.util.List;


public class AuthorizedResourceDto {
    /**
     * 资源标识符
     */
    private String resourceCode;
    /**
     * 资源类型
     */
    private ResourceType resourceType;
    /**
     * 被授权的资源的操作列表
     */
    private List<string> actions;
    /**
     * 资源对应的 API Identifier
     */
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

    public List<string> getActions() {
        return actions;
    }
    public void setActions(List<string> actions) {
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


};