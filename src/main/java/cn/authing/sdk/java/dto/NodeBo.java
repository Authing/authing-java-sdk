package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NodeBo {
    /**
     * 组织机构 id
     */
    @JsonProperty("nodeId")
    private String nodeId;
    /**
     * 组织机构名称
     */
    @JsonProperty("nodeName")
    private String nodeName;
    /**
     * 组织机构 Code
     */
    @JsonProperty("nodeCode")
    private String nodeCode;

    public String getNodeId() {
        return nodeId;
    }
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeCode() {
        return nodeCode;
    }
    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }



}