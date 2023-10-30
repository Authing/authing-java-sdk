package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ScopeDto {
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 行 id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 字段 id
     */
    @JsonProperty("fieldId")
    private String fieldId;

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getFieldId() {
        return fieldId;
    }
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }



}