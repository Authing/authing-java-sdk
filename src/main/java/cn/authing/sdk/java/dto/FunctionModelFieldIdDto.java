package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FunctionModelFieldIdDto {
    /**
     * 功能字段 id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }



}