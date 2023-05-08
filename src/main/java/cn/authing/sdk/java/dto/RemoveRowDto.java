package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RemoveRowDto {
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 行 id
     */
    @JsonProperty("rowIdList")
    private List<String> rowIdList;

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public List<String> getRowIdList() {
        return rowIdList;
    }
    public void setRowIdList(List<String> rowIdList) {
        this.rowIdList = rowIdList;
    }



}