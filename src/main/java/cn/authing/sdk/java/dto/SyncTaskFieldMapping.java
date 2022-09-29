package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskFieldMapping {
    /**
     * 源字段
     */
    @JsonProperty("expression")
    private String expression;
    /**
     * 转换后的字段
     */
    @JsonProperty("targetKey")
    private String targetKey;

    public String getExpression() {
        return expression;
    }
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getTargetKey() {
        return targetKey;
    }
    public void setTargetKey(String targetKey) {
        this.targetKey = targetKey;
    }



}