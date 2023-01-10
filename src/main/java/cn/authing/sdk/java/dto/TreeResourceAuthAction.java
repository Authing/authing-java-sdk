package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.TreeStructs;

public class TreeResourceAuthAction {
    /**
     * 树结构节点列表
     */
    @JsonProperty("nodeAuthActionList")
    private List<TreeStructs> nodeAuthActionList;

    public List<TreeStructs> getNodeAuthActionList() {
        return nodeAuthActionList;
    }
    public void setNodeAuthActionList(List<TreeStructs> nodeAuthActionList) {
        this.nodeAuthActionList = nodeAuthActionList;
    }



}