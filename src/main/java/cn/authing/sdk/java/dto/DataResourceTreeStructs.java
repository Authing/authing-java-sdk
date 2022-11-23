package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


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
    private List<String> children;

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

    public List<String> getChildren() {
        return children;
    }
    public void setChildren(List<String> children) {
        this.children = children;
    }



}