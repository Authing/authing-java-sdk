package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetMyAuthorizedResourcesDto {
    /**
     * 所属权限分组(权限空间)的 Code，不传获取默认权限分组。
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 资源类型，如 数据、API、菜单、按钮
     */
    @JsonProperty("resourceType")
    private String resourceType;

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }



}