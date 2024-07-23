package cn.authing.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;


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

    /**
     * 节点扩展字段与对应的值
     * key: 扩展字段 key
     * value: 扩展字段值
     */
    private Map<String, Object> extendFieldValue;

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

    public Map<String, Object> getExtendFieldValue() {
        return extendFieldValue;
    }

    public void setExtendFieldValue(Map<String, Object> extendFieldValue) {
        this.extendFieldValue = extendFieldValue;
    }
}