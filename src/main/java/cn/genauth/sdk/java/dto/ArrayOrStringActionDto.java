package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ArrayOrStringActionDto {
    /**
     * 数据资源策略节点 action 动作
     */
    @JsonProperty("action")
    private String action;
    /**
     * 数据资源策略节点是否开启动作
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }



}