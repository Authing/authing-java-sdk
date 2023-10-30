package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FunctionModelOperateIdDto {
    /**
     * 执行时自定义参数
     */
    @JsonProperty("customConfig")
    private Object customConfig;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 自定义操作 id
     */
    @JsonProperty("id")
    private String id;

    public Object getCustomConfig() {
        return customConfig;
    }
    public void setCustomConfig(Object customConfig) {
        this.customConfig = customConfig;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}