package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ResourceActionListDto {
    /**
     * 节点路径
     */
    @JsonProperty("nodePath")
    private String nodePath;
    /**
     * 数据资源的节点权限列表
     */
    @JsonProperty("nodeActions")
    private List<String> nodeActions;

    public String getNodePath() {
        return nodePath;
    }
    public void setNodePath(String nodePath) {
        this.nodePath = nodePath;
    }

    public List<String> getNodeActions() {
        return nodeActions;
    }
    public void setNodeActions(List<String> nodeActions) {
        this.nodeActions = nodeActions;
    }



}