package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DropDownItemDto {
    /**
     * 选项 id
     */
    @JsonProperty("key")
    private String key;
    /**
     * 选项名称
     */
    @JsonProperty("label")
    private String label;

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }



}