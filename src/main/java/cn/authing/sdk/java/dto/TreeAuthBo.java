package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


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



}