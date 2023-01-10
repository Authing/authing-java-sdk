package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ArrResourceAuthAction {
    /**
     * 数组数据资源的 values
     */
    @JsonProperty("values")
    private List<String> values;
    /**
     * 数组数据资源的 actions
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