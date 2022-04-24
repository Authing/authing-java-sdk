package dto;

import java.util.List;


public class GetGroupAuthorizedResourcesDto {
    /**
     * 分组 code
     */
    private String code;
    /**
     * 所属权限分组的 code
     */
    private String namespace;
    /**
     * 资源类型
     */
    private ResourceType resourceType;

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

    public ResourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
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