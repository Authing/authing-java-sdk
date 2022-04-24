package dto;

import java.util.List;

import dto.ResourceAction;

public class UpdateResourceDto {
    /**
     * 资源定义的操作类型
     */
    private List<ResourceAction> actions;
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    private Type type;
    /**
     * 资源唯一标志符
     */
    private String code;
    /**
     * 资源描述
     */
    private String description;
    /**
     * API 资源的 URL 标识
     */
    private String apiIdentifier;
    /**
     * 所属权限分组的 code
     */
    private String namespace;

    public List<ResourceAction> getActions() {
        return actions;
    }
    public void setActions(List<ResourceAction> actions) {
        this.actions = actions;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getApiIdentifier() {
        return apiIdentifier;
    }
    public void setApiIdentifier(String apiIdentifier) {
        this.apiIdentifier = apiIdentifier;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }


    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    public static enum Type {
        DATA("DATA"),
        API("API"),
        MENU("MENU"),
        BUTTON("BUTTON"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


};