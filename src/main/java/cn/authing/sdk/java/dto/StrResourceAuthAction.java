package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StrResourceAuthAction {
    /**
     * 字符串数据资源的 Value
     */
    @JsonProperty("value")
    private String value;
    /**
     * 字符串数据资源的 actions
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