package dto;

import java.util.List;

import dto.CustomFieldSelectOption;

public class CustomFieldDto {
    /**
     * 主体类型，目前支持用户和角色
     */
    private CustomFieldDto.targetType targetType;
    /**
     * 创建时间
     */
    private String createdAt;
    /**
     * 数据类型
     */
    private CustomFieldDto.dataType dataType;
    /**
     * 字段 key，不能和用户内置字段的 key 冲突
     */
    private String key;
    /**
     * 前端表单展示名称
     */
    private String label;
    /**
     * 详细描述信息
     */
    private String description;
    /**
     * 是否加密存储
     */
    private Boolean encrypted;
    /**
     * 枚举值类型选择项
     */
    private List<CustomFieldSelectOption> options;

    public CustomFieldDto.targetType getTargetType() {
        return targetType;
    }
    public void setTargetType(CustomFieldDto.targetType targetType) {
        this.targetType = targetType;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CustomFieldDto.dataType getDataType() {
        return dataType;
    }
    public void setDataType(CustomFieldDto.dataType dataType) {
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
     * 主体类型，目前支持用户和角色
     */
    public static enum TargetType {
        USER('USER'),
        ROLE('ROLE'),
        ;

        private String value;
        targetType(String value) {
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
        STRING('STRING'),
        NUMBER('NUMBER'),
        DATETIME('DATETIME'),
        BOOLEAN('BOOLEAN'),
        SELECT('SELECT'),
        ;

        private String value;
        dataType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


};