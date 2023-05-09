package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRelationInfoDto {
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 关联 id 列表
     */
    @JsonProperty("idList")
    private List<String> idList;

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public List<String> getIdList() {
        return idList;
    }
    public void setIdList(List<String> idList) {
        this.idList = idList;
    }



}