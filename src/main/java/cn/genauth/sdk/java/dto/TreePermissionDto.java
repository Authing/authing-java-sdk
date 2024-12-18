package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TreePermissionDto {
    /**
     * 资源id
     */
    @JsonProperty("resourceId")
    private String resourceId;
    /**
     * 资源类型，STRING/ARRAY/TREE
     */
    @JsonProperty("resourceType")
    private String resourceType;
    /**
     * 树结构节点列表
     */
    @JsonProperty("nodeAuthActionList")
    private List<DataResourcePolicyTreeStructs> nodeAuthActionList;

    public String getResourceId() {
        return resourceId;
    }
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public List<DataResourcePolicyTreeStructs> getNodeAuthActionList() {
        return nodeAuthActionList;
    }
    public void setNodeAuthActionList(List<DataResourcePolicyTreeStructs> nodeAuthActionList) {
        this.nodeAuthActionList = nodeAuthActionList;
    }



}