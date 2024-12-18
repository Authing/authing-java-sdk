package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RemoveRowDto {
    /**
     * 行 id
     */
    @JsonProperty("rowIdList")
    private List<String> rowIdList;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 如果当前行有子节点，是否递归删除，默认为 false。当为 false 时，如果有子节点，会提示错误。
     */
    @JsonProperty("recursive")
    private Boolean recursive;

    public List<String> getRowIdList() {
        return rowIdList;
    }
    public void setRowIdList(List<String> rowIdList) {
        this.rowIdList = rowIdList;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public Boolean getRecursive() {
        return recursive;
    }
    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }



}