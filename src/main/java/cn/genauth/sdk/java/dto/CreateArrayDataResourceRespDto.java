package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateArrayDataResourceRespDto {
    /**
     * 数据资源名称, 权限空间内唯一
     */
    @JsonProperty("resourceName")
    private String resourceName;
    /**
     * 数据资源 Code, 权限空间内唯一
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 数据资源描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 数组数据资源节点
     */
    @JsonProperty("struct")
    private List<String> struct;
    /**
     * 数据资源权限操作列表
     */
    @JsonProperty("actions")
    private List<String> actions;

    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getStruct() {
        return struct;
    }
    public void setStruct(List<String> struct) {
        this.struct = struct;
    }

    public List<String> getActions() {
        return actions;
    }
    public void setActions(List<String> actions) {
        this.actions = actions;
    }


    /**
     * 数据资源类型，目前支持树结构（TREE）、字符串（STRING）、数组（ARRAY）
     */
    public static enum Type {

        @JsonProperty("TREE")
        TREE("TREE"),

        @JsonProperty("STRING")
        STRING("STRING"),

        @JsonProperty("ARRAY")
        ARRAY("ARRAY"),
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