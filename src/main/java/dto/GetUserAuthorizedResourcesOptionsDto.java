package dto;


public class GetUserAuthorizedResourcesOptionsDto {
    /**
     * 所属权限分组的 code
     */
    private String namespace
    /**
     * 资源类型
     */
    private GetUserAuthorizedResourcesOptionsDto.resourceType resourceType

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public GetUserAuthorizedResourcesOptionsDto.resourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(GetUserAuthorizedResourcesOptionsDto.resourceType resourceType) {
        this.resourceType = resourceType;
    }

};