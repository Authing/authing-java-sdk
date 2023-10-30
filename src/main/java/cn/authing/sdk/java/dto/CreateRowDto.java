package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateRowDto {
    /**
     * 数据内容
     */
    @JsonProperty("data")
    private Object data;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 自定义行 id，默认自动生成。最长只允许 32 位。
     */
    @JsonProperty("rowId")
    private String rowId;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

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



}