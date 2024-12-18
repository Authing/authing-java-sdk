package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateFunctionModelDto {
    /**
     * 详情页配置
     */
    @JsonProperty("config")
    private Object config;
    /**
     * 字段序
     */
    @JsonProperty("fieldOrder")
    private String fieldOrder;
    /**
     * 功能类型
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 父级菜单
     */
    @JsonProperty("parentKey")
    private String parentKey;
    /**
     * 功能是否启用
     */
    @JsonProperty("enable")
    private Boolean enable;
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
     * 功能 id
     */
    @JsonProperty("id")
    private String id;

    public Object getConfig() {
        return config;
    }
    public void setConfig(Object config) {
        this.config = config;
    }

    public String getFieldOrder() {
        return fieldOrder;
    }
    public void setFieldOrder(String fieldOrder) {
        this.fieldOrder = fieldOrder;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    /**
     * 功能类型
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