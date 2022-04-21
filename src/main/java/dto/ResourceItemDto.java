package dto;


public class ResourceItemDto {
    /**
     * 资源唯一标志符
     */
    private String code
    /**
     * 资源定义的操作类型
     */
    private Array<string> actions
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    private ResourceItemDto.resourceType resourceType

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Array<string> getActions() {
        return actions;
    }
    public void setActions(Array<string> actions) {
        this.actions = actions;
    }

    public ResourceItemDto.resourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceItemDto.resourceType resourceType) {
        this.resourceType = resourceType;
    }

};