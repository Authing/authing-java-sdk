package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRowByValueDto {
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 字段 key
     */
    @JsonProperty("key")
    private String key;
    /**
     * 字段值
     */
    @JsonProperty("value")
    private String value;
    /**
     * 返回结果中是否使用字段 id 作为 key
     */
    @JsonProperty("showFieldId")
    private String showFieldId;

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getShowFieldId() {
        return showFieldId;
    }
    public void setShowFieldId(String showFieldId) {
        this.showFieldId = showFieldId;
    }



}