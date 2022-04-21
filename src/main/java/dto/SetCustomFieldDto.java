package dto;

import dto.CustomFieldSelectOption;

public class SetCustomFieldDto {
    /**
     * 主体类型，目前支持用户和角色
     */
    private SetCustomFieldDto.targetType targetType
    /**
     * 数据类型
     */
    private SetCustomFieldDto.dataType dataType
    /**
     * 字段 key，不能和用户内置字段的 key 冲突
     */
    private String key
    /**
     * 前端表单展示名称
     */
    private String label
    /**
     * 详细描述信息
     */
    private String description
    /**
     * 是否加密存储
     */
    private Boolean encrypted
    /**
     * 枚举值类型选择项
     */
    private Array<CustomFieldSelectOption> options

    public SetCustomFieldDto.targetType getTargetType() {
        return targetType;
    }
    public void setTargetType(SetCustomFieldDto.targetType targetType) {
        this.targetType = targetType;
    }

    public SetCustomFieldDto.dataType getDataType() {
        return dataType;
    }
    public void setDataType(SetCustomFieldDto.dataType dataType) {
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

    public Array<CustomFieldSelectOption> getOptions() {
        return options;
    }
    public void setOptions(Array<CustomFieldSelectOption> options) {
        this.options = options;
    }

};