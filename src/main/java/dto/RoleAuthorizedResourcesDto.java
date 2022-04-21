package dto;


public class RoleAuthorizedResourcesDto {
    /**
     * 分组 code，识别码
     */
    private String code
    /**
     * 权限分组
     */
    private String namespace
    /**
     * 资源类型
     */
    private RoleAuthorizedResourcesDto.resourceType resourceType

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

    public RoleAuthorizedResourcesDto.resourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(RoleAuthorizedResourcesDto.resourceType resourceType) {
        this.resourceType = resourceType;
    }

};