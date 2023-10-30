package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RemoveRelationValueDto {
    /**
     * 关联数据
     */
    @JsonProperty("value")
    private String value;
    /**
     * 字段 id
     */
    @JsonProperty("fieldIds")
    private List<String> fieldIds;
    /**
     * 行 id
     */
    @JsonProperty("rowId")
    private String rowId;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getFieldIds() {
        return fieldIds;
    }
    public void setFieldIds(List<String> fieldIds) {
        this.fieldIds = fieldIds;
    }

    public String getRowId() {
        return rowId;
    }
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }



}