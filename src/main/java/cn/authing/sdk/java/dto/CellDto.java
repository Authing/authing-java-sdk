package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CellDto {
    /**
     * 字段 id
     */
    @JsonProperty("fieldId")
    private String fieldId;
    /**
     * 数据内容
     */
    @JsonProperty("value")
    private Object value;

    public String getFieldId() {
        return fieldId;
    }
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }



}