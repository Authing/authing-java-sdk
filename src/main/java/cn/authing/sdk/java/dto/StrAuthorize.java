package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StrAuthorize {
    /**
     * 字符串资源 Value
     */
    @JsonProperty("value")
    private String value;
    /**
     * 字符串资源操作列表
     */
    @JsonProperty("actions")
    private List<String> actions;

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getActions() {
        return actions;
    }
    public void setActions(List<String> actions) {
        this.actions = actions;
    }



}