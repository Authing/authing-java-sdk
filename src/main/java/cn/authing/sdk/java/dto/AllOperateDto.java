package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AllOperateDto {
    /**
     * model Id
     */
    @JsonProperty("modelId")
    private String modelId;

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }



}