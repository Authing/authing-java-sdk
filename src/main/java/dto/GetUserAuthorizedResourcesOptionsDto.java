package dto;

import java.util.List;


public class GetUserAuthorizedResourcesOptionsDto {
    /**
     * 所属权限分组的 code
     */
    private String namespace;
    /**
     * 资源类型
     */
    private GetUserAuthorizedResourcesOptionsDto.resourceType resourceType;

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


    /**
     * 资源类型
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