package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateFunctionModelDto {
    /**
     * 父级菜单
     */
    @JsonProperty("parentKey")
    private String parentKey;
    /**
     * 功能是否启用:
     * - true: 启用
     * - false: 不启用
     *
     */
    @JsonProperty("enable")
    private Boolean enable;
    /**
     * 功能类型：
     * - user: 用户
     * - post: 岗位
     * - group: 用户组
     * - ueba: ueba
     * - department: 树状结构数据
     * - organization: 组织
     * - device: 设备
     * - custom: 自定义
     *
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 功能描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 功能名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 数据类型：
     * - list: 列表类型数据
     * - tree: 树状结构数据
     *
     */
    @JsonProperty("dataType")
    private DataType dataType;

    public String getParentKey() {
        return parentKey;
    }
    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public Boolean getEnable() {
        return enable;
    }
    public void setEnable(Boolean enable) {
        this.enable = enable;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public DataType getDataType() {
        return dataType;
    }
    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }


    /**
     * 功能类型：
     * - user: 用户
     * - post: 岗位
     * - group: 用户组
     * - ueba: ueba
     * - department: 树状结构数据
     * - organization: 组织
     * - device: 设备
     * - custom: 自定义
     *
     */
    public static enum Type {

        @JsonProperty("ueba")
        UEBA("ueba"),

        @JsonProperty("user")
        USER("user"),

        @JsonProperty("post")
        POST("post"),

        @JsonProperty("group")
        GROUP("group"),

        @JsonProperty("department")
        DEPARTMENT("department"),

        @JsonProperty("organization")
        ORGANIZATION("organization"),

        @JsonProperty("device")
        DEVICE("device"),

        @JsonProperty("device_rely")
        DEVICE_RELY("device_rely"),

        @JsonProperty("custom")
        CUSTOM("custom"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 数据类型：
     * - list: 列表类型数据
     * - tree: 树状结构数据
     *
     */
    public static enum DataType {

        @JsonProperty("list")
        LIST("list"),

        @JsonProperty("tree")
        TREE("tree"),
        ;

        private String value;

        DataType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}