package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Condition {
    /**
     * 搜索字段的 key
     */
    @JsonProperty("key")
    private String key;
    /**
     * 搜索值
     */
    @JsonProperty("value")
    private Object value;
    /**
     * 操作类型：
     * - eq: 等于
     * - ne: 不等于
     * - co: 包含
     * - gt: 大于
     * - lt: 小于
     * - lte: 小于等于
     * - gte: 大于等于
     * - in: 数组包含
     *
     */
    @JsonProperty("operator")
    private String operator;

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }

    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }



}