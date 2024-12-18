package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRowDto {
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 行 id
     */
    @JsonProperty("rowId")
    private String rowId;
    /**
     * 返回结果中是否使用字段 id 作为 key
     */
    @JsonProperty("showFieldId")
    private String showFieldId;

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getRowId() {
        return rowId;
    }
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getShowFieldId() {
        return showFieldId;
    }
    public void setShowFieldId(String showFieldId) {
        this.showFieldId = showFieldId;
    }



}