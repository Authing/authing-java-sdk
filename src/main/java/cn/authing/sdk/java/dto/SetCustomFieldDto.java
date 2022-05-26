package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CustomFieldSelectOption;

public class SetCustomFieldDto {
    /**
     * 主体类型，目前支持用户、角色、分组和部门
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 数据类型
     */
    @JsonProperty("dataType")
    private DataType dataType;
    /**
     * 字段 key，不能和内置字段的 key 冲突
     */
    @JsonProperty("key")
    private String key;
    /**
     * 前端表单展示名称
     */
    @JsonProperty("label")
    private String label;
    /**
     * 详细描述信息
     */
    @JsonProperty("description")
    private String description;
    /**
     * 是否加密存储
     */
    @JsonProperty("encrypted")
    private Boolean encrypted;
    /**
     * 枚举值类型选择项
     */
    @JsonProperty("options")
    private List<CustomFieldSelectOption> options;

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public DataType getDataType() {
        return dataType;
    }
    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    public List<CustomFieldSelectOption> getOptions() {
        return options;
    }
    public void setOptions(List<CustomFieldSelectOption> options) {
        this.options = options;
    }


    /**
     * 主体类型，目前支持用户、角色、分组和部门
     */
    public static enum TargetType {

        @JsonProperty("USER")
        USER("USER"),

        @JsonProperty("ROLE")
        ROLE("ROLE"),

        @JsonProperty("GROUP")
        GROUP("GROUP"),

        @JsonProperty("DEPARTMENT")
        DEPARTMENT("DEPARTMENT"),
        ;

        private String value;

        TargetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 数据类型
     */
    public static enum DataType {

        @JsonProperty("STRING")
        STRING("STRING"),

        @JsonProperty("NUMBER")
        NUMBER("NUMBER"),

        @JsonProperty("DATETIME")
        DATETIME("DATETIME"),

        @JsonProperty("BOOLEAN")
        BOOLEAN("BOOLEAN"),

        @JsonProperty("SELECT")
        SELECT("SELECT"),
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