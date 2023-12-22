package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ResourceAction;

public class CommonResourceDto {
    /**
     * 资源唯一标志符
     */
    @JsonProperty("code")
    private String code;
    /**
     * 资源描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 资源名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 资源定义的操作类型
     */
    @JsonProperty("actions")
    private List<ResourceAction> actions;
    /**
     * API 资源的 URL 标识
     */
    @JsonProperty("apiIdentifier")
    private String apiIdentifier;
    /**
     * 所属权限分组(权限空间)的 Code，不传获取默认权限分组。
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 租户应用是否关联自建应用资源
     */
    @JsonProperty("linkedToTenant")
    private Boolean linkedToTenant;
    /**
     * 资源id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 权限应用id
     */
    @JsonProperty("namespaceId")
    private Integer namespaceId;
    /**
     * 权限应用名称
     */
    @JsonProperty("namespaceName")
    private String namespaceName;
    /**
     * UserPool ID
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;

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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public List<ResourceAction> getActions() {
        return actions;
    }
    public void setActions(List<ResourceAction> actions) {
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

    public Boolean getLinkedToTenant() {
        return linkedToTenant;
    }
    public void setLinkedToTenant(Boolean linkedToTenant) {
        this.linkedToTenant = linkedToTenant;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Integer getNamespaceId() {
        return namespaceId;
    }
    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public String getNamespaceName() {
        return namespaceName;
    }
    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * 资源类型，如数据、API、按钮、菜单
     */
    public static enum Type {

        @JsonProperty("DATA")
        DATA("DATA"),

        @JsonProperty("API")
        API("API"),

        @JsonProperty("MENU")
        MENU("MENU"),

        @JsonProperty("BUTTON")
        BUTTON("BUTTON"),

        @JsonProperty("UI")
        UI("UI"),
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