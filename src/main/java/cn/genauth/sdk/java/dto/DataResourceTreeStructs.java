package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;


public class DataResourceTreeStructs {
    /**
     * 数据资源节点 Code, 同层级唯一
     */
    @JsonProperty("code")
    private String code;
    /**
     * 数据资源节点名称 ，同层级唯一
     */
    @JsonProperty("name")
    private String name;
    /**
     * 数据资源节点 Value
     */
    @JsonProperty("value")
    private String value;
    /**
     * 数据资源节点的子节点,子节点层级最多支持五个层级
     */
    @JsonProperty("children")
    private List<Object> children;

    /**
     * 设置节点扩展字段与对应的值
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

    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public Map<String, Object> getExtendFieldValue() {
        return extendFieldValue;
    }

    public void setExtendFieldValue(Map<String, Object> extendFieldValue) {
        this.extendFieldValue = extendFieldValue;
    }
}