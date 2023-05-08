package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Condition {
    /**
     * 搜索 key
     */
    @JsonProperty("key")
    private String key;
    /**
     * 搜索值
     */
    @JsonProperty("value")
    private Object value;
    /**
     * 操作类型
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