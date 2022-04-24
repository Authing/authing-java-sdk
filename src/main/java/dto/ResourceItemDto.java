package dto;

import java.util.List;


public class ResourceItemDto {
    /**
     * 资源唯一标志符
     */
    private String code;
    /**
     * 资源定义的操作类型
     */
    private List<string> actions;
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    private ResourceItemDto.resourceType resourceType;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public List<string> getActions() {
        return actions;
    }
    public void setActions(List<string> actions) {
        this.actions = actions;
    }

    public ResourceItemDto.resourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceItemDto.resourceType resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    public static enum ResourceType {
        DATA('DATA'),
        API('API'),
        MENU('MENU'),
        BUTTON('BUTTON'),
        ;

        private String value;
        resourceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


};