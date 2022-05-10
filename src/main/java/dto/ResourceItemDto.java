package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ResourceItemDto {
    /**
     * 资源唯一标志符
     */
    @JsonProperty("getCode")
    private String code;
    /**
     * 资源定义的操作类型
     */
    @JsonProperty("getActions")
    private List<String> actions;
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    @JsonProperty("getResourceType")
    private ResourceType resourceType;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getActions() {
        return actions;
    }
    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }


    /**
     * 资源类型，如数据、API、按钮、菜单
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