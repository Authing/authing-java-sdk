package cn.authing.sdk.java.dto;

/**
 * 数据资源扩展字段
 */
public class Dnef {

    /**
     * 扩展字段 Key
     */
    private String key;

    /**
     * 扩展字段值类型
     */
    private ValueType valueType;

    /**
     * 扩展字段描述
     */
    private String description;

    /**
     * 扩展字段标签
     */
    private String label;

    /**
     * 扩展字段配置
     */
    private DnefConfig config;

    /**
     * 扩展字段值类型
     */
    public enum ValueType {
        /**
         * 字符串
         */
        STRING,

        /**
         * 单选
         */
        SELECT
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ValueType getValueType() {
        return valueType;
    }

    public void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public DnefConfig getConfig() {
        return config;
    }

    public void setConfig(DnefConfig config) {
        this.config = config;
    }
}
