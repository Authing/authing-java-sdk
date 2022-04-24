package dto;

import java.util.List;


public class GetAuthorizedResourcesDto {
    /**
     * 目标对象唯一标志符
     */
    private String targetIdentifier;
    /**
     * 目标对象类型
     */
    private TargetType targetType;
    /**
     * 所属权限分组的 code
     */
    private String namespace;
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    private ResourceType resourceType;

    public String getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
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
     * 目标对象类型
     */
    public static enum TargetType {
        USER("USER"),
        ROLE("ROLE"),
        GROUP("GROUP"),
        DEPARTMENT("DEPARTMENT"),
        ;

        private String value;

        TargetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
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