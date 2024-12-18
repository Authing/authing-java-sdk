package cn.genauth.sdk.java.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateDataResourceDto {
    /**
     * 数据资源 Code, 权限空间内唯一
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源所属的权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 数据资源名称, 权限空间内唯一
     */
    @JsonProperty("resourceName")
    private String resourceName;
    /**
     * 数据资源描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 数据资源结构，支持字符串（STRING）、树结构（TREE）和数组结构（ARRAY）。
     */
    @JsonProperty("struct")
    private Object struct;
    /**
     * 数据资源权限操作列表
     */
    @JsonProperty("actions")
    private List<String> actions;

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }

    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getStruct() {
        return struct;
    }

    public void setStruct(Object struct) {
        this.struct = struct;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }


}