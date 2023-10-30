package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRowBatchDto {
    /**
     * 行 id 列表
     */
    @JsonProperty("rowIds")
    private List<String> rowIds;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;

    public List<String> getRowIds() {
        return rowIds;
    }
    public void setRowIds(List<String> rowIds) {
        this.rowIds = rowIds;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }



}