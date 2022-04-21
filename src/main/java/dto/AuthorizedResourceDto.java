package dto;


public class AuthorizedResourceDto {
    /**
     * 资源标识符
     */
    private String resourceCode
    /**
     * 资源类型
     */
    private AuthorizedResourceDto.resourceType resourceType
    /**
     * 被授权的资源的操作列表
     */
    private Array<string> actions
    /**
     * 资源对应的 API Identifier
     */
    private String apiIdentifier

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public AuthorizedResourceDto.resourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(AuthorizedResourceDto.resourceType resourceType) {
        this.resourceType = resourceType;
    }

    public Array<string> getActions() {
        return actions;
    }
    public void setActions(Array<string> actions) {
        this.actions = actions;
    }

    public String getApiIdentifier() {
        return apiIdentifier;
    }
    public void setApiIdentifier(String apiIdentifier) {
        this.apiIdentifier = apiIdentifier;
    }

};