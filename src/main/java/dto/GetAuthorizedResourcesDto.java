package dto;


public class GetAuthorizedResourcesDto {
    /**
     * 目标对象唯一标志符
     */
    private String targetIdentifier
    /**
     * 目标对象类型
     */
    private GetAuthorizedResourcesDto.targetType targetType
    /**
     * 所属权限分组的 code
     */
    private String namespace
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    private GetAuthorizedResourcesDto.resourceType resourceType

    public String getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public GetAuthorizedResourcesDto.targetType getTargetType() {
        return targetType;
    }
    public void setTargetType(GetAuthorizedResourcesDto.targetType targetType) {
        this.targetType = targetType;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public GetAuthorizedResourcesDto.resourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(GetAuthorizedResourcesDto.resourceType resourceType) {
        this.resourceType = resourceType;
    }

};