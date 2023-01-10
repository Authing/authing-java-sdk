package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TreeStructs {
    /**
     * 树资源节点 Code, 同层级唯一
     */
    @JsonProperty("code")
    private String code;
    /**
     * 树资源节点名称 ，同层级唯一
     */
    @JsonProperty("name")
    private String name;
    /**
     * 树资源节点 Value
     */
    @JsonProperty("value")
    private String value;
    /**
     * 树数据资源策略节点 actions
     */
    @JsonProperty("actions")
    private List<String> actions;
    /**
     * 子节点数据,子节点数据最多五个层级
     */
    @JsonProperty("children")
    private List<TreeStructs> children;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

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

    public List<TreeStructs> getChildren() {
        return children;
    }
    public void setChildren(List<TreeStructs> children) {
        this.children = children;
    }



}