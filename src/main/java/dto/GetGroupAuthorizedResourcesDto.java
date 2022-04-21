package dto;


public class GetGroupAuthorizedResourcesDto {
    /**
     * 分组 code
     */
    private String code
    /**
     * 所属权限分组的 code
     */
    private String namespace
    /**
     * 资源类型
     */
    private GetGroupAuthorizedResourcesDto.resourceType resourceType

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public GetGroupAuthorizedResourcesDto.resourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(GetGroupAuthorizedResourcesDto.resourceType resourceType) {
        this.resourceType = resourceType;
    }

};