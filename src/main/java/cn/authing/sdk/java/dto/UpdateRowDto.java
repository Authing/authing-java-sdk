package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateRowDto {
    /**
     * 数据内容
     */
    @JsonProperty("data")
    private Object data;
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
    /**
     * 响应中键是否为 FieldId
     */
    @JsonProperty("showFieldId")
    private Boolean showFieldId;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
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

    public Boolean getShowFieldId() {
        return showFieldId;
    }
    public void setShowFieldId(Boolean showFieldId) {
        this.showFieldId = showFieldId;
    }



}