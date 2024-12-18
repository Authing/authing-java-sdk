package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FunctionModelDto {
    /**
     * 功能 id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 用户池 id
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * 功能名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 功能描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 数据类型：
     * - list: 列表类型数据。
     * - tree: 树状结构数据。
     *
     */
    @JsonProperty("dataType")
    private DataType dataType;
    /**
     * 功能是否启用:
     * - true: 启用
     * - false: 不启用
     *
     */
    @JsonProperty("enable")
    private Boolean enable;
    /**
     * 父级菜单
     */
    @JsonProperty("parentKey")
    private String parentKey;
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
    /**
     * 功能类型：
     * - user: 用户
     * - post: 岗位
     * - group: 用户组
     * - ueba: ueba
     * - department: 树状结构数据
     * - organization: 组织
     * - device: 设备
     * - device_rely: 设备
     * - custom: 自定义
     *
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 字段排序
     */
    @JsonProperty("fieldOrder")
    private String fieldOrder;
    /**
     * 详情页配置
     */
    @JsonProperty("config")
    private Object config;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public DataType getDataType() {
        return dataType;
    }
    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public Boolean getEnable() {
        return enable;
    }
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getParentKey() {
        return parentKey;
    }
    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
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

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getFieldOrder() {
        return fieldOrder;
    }
    public void setFieldOrder(String fieldOrder) {
        this.fieldOrder = fieldOrder;
    }

    public Object getConfig() {
        return config;
    }
    public void setConfig(Object config) {
        this.config = config;
    }


    /**
     * 数据类型：
     * - list: 列表类型数据。
     * - tree: 树状结构数据。
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

    /**
     * 功能类型：
     * - user: 用户
     * - post: 岗位
     * - group: 用户组
     * - ueba: ueba
     * - department: 树状结构数据
     * - organization: 组织
     * - device: 设备
     * - device_rely: 设备
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


}