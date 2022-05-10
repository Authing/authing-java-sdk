package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.ResourceAction;

public class ResourceDto {
    /**
     * 资源唯一标志符
     */
    @JsonProperty("getCode")
    private String code;
    /**
     * 资源描述
     */
    @JsonProperty("getDescription")
    private String description;
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    @JsonProperty("getType")
    private Type type;
    /**
     * 资源定义的操作类型
     */
    @JsonProperty("getActions")
    private List<ResourceAction> nase actions;
    /**
     * API 资源的 URL 标识
     */
    @JsonProperty("getApiIdentifier")
    private String apiIdentifier;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("getNamespace")
    private String namespace;

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

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public List<ResourceAction> nase getActions() {
        return actions;
    }
    public void setActions(List<ResourceAction> nase actions) {
        this.actions = actions;
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


}