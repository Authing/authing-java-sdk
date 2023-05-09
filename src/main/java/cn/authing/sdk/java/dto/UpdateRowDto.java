package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateRowDto {
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
     * 数据内容
     */
    @JsonProperty("data")
    private Object data;

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

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }



}