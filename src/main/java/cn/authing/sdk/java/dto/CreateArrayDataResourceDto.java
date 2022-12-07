package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateArrayDataResourceDto {
    /**
     * 数据资源权限操作列表
     */
    @JsonProperty("actions")
    private List<String> actions;
    /**
     * 数组数据资源节点
     */
    @JsonProperty("struct")
    private List<String> struct;
    /**
     * 数据资源 Code,权限空间内唯一
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源名称,权限空间内唯一
     */
    @JsonProperty("resourceName")
    private String resourceName;
    /**
     * 数据策略所在的权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 数据资源描述
     */
    @JsonProperty("description")
    private String description;

    public List<String> getActions() {
        return actions;
    }
    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public List<String> getStruct() {
        return struct;
    }
    public void setStruct(List<String> struct) {
        this.struct = struct;
    }

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }
    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}