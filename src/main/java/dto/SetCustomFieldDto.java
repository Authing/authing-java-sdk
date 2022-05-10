package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.CustomFieldSelectOption;

public class SetCustomFieldDto {
    /**
     * 主体类型，目前支持用户和角色
     */
    @JsonProperty("getTargetType")
    private TargetType targetType;
    /**
     * 数据类型
     */
    @JsonProperty("getDataType")
    private DataType dataType;
    /**
     * 字段 key，不能和用户内置字段的 key 冲突
     */
    @JsonProperty("getKey")
    private String key;
    /**
     * 前端表单展示名称
     */
    @JsonProperty("getLabel")
    private String label;
    /**
     * 详细描述信息
     */
    @JsonProperty("getDescription")
    private String description;
    /**
     * 是否加密存储
     */
    @JsonProperty("getEncrypted")
    private Boolean encrypted;
    /**
     * 枚举值类型选择项
     */
    @JsonProperty("getOptions")
    private List<CustomFieldSelectOption> nase options;

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

    public List<CustomFieldSelectOption> nase getOptions() {
        return options;
    }
    public void setOptions(List<CustomFieldSelectOption> nase options) {
        this.options = options;
    }


    /**
     * 主体类型，目前支持用户和角色
     */
    public static enum TargetType {
        USER("USER"),
        ROLE("ROLE"),
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
        STRING("STRING"),
        NUMBER("NUMBER"),
        DATETIME("DATETIME"),
        BOOLEAN("BOOLEAN"),
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