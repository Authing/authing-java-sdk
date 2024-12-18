package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;


public class TreeAuthBo {
    /**
     * 树资源节点路径
     */
    @JsonProperty("nodePath")
    private String nodePath;
    /**
     * 树资源节点名称
     */
    @JsonProperty("nodeName")
    private String nodeName;
    /**
     * 树资源节点操作权限列表
     */
    @JsonProperty("nodeActions")
    private List<String> nodeActions;
    /**
     * 树资源节点 Value
     */
    @JsonProperty("nodeValue")
    private String nodeValue;

    /**
     * 节点扩展字段与对应的值
     * key: 扩展字段 key
     * value: 扩展字段值
     */
    private Map<String, Object> nodeExtendFieldValue;

    public String getNodePath() {
        return nodePath;
    }
    public void setNodePath(String nodePath) {
        this.nodePath = nodePath;
    }

    public String getNodeName() {
        return nodeName;
    }
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public List<String> getNodeActions() {
        return nodeActions;
    }
    public void setNodeActions(List<String> nodeActions) {
        this.nodeActions = nodeActions;
    }

    public String getNodeValue() {
        return nodeValue;
    }
    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public Map<String, Object> getNodeExtendFieldValue() {
        return nodeExtendFieldValue;
    }

    public void setNodeExtendFieldValue(Map<String, Object> nodeExtendFieldValue) {
        this.nodeExtendFieldValue = nodeExtendFieldValue;
    }
}