package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DataResourcePolicyTreeStructs {
    /**
     * 数据资源策略节点 Code, 同层级唯一
     */
    @JsonProperty("code")
    private String code;
    /**
     * 数据资源策略节点 Value
     */
    @JsonProperty("value")
    private String value;
    /**
     * 数据资源节点名称 ，同层级唯一
     */
    @JsonProperty("name")
    private String name;
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
    /**
     * 子节点数据,子节点数据最多五个层级
     */
    @JsonProperty("children")
    private List<String> children;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

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

    public List<String> getChildren() {
        return children;
    }
    public void setChildren(List<String> children) {
        this.children = children;
    }



}