package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ArrayAuthorize {
    /**
     * 数组资源 Value 列表
     */
    @JsonProperty("values")
    private List<String> values;
    /**
     * 数组资源操作列表
     */
    @JsonProperty("actions")
    private List<String> actions;

    public List<String> getValues() {
        return values;
    }
    public void setValues(List<String> values) {
        this.values = values;
    }

    public List<String> getActions() {
        return actions;
    }
    public void setActions(List<String> actions) {
        this.actions = actions;
    }



}