package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateUEBADto {
    /**
     * 数据内容
     */
    @JsonProperty("data")
    private Object data;
    /**
     * 功能 id，如果不存在则会使用数据库中查到的第一个 type 为 ueba 的功能
     */
    @JsonProperty("modelId")
    private String modelId;

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



}