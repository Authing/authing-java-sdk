package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateRelationValueDto {
    /**
     * 关联数据
     */
    @JsonProperty("valueList")
    private List<String> valueList;
    /**
     * 行 id
     */
    @JsonProperty("rowId")
    private String rowId;
    /**
     * 字段 id
     */
    @JsonProperty("fieldId")
    private String fieldId;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;

    public List<String> getValueList() {
        return valueList;
    }
    public void setValueList(List<String> valueList) {
        this.valueList = valueList;
    }

    public String getRowId() {
        return rowId;
    }
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getFieldId() {
        return fieldId;
    }
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }



}