package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateOrganizationStatusReqDto {
    /**
     * 组织 id
     */
    @JsonProperty("rootNodeId")
    private String rootNodeId;
    /**
     * 状态
     */
    @JsonProperty("status")
    private String status;

    public String getRootNodeId() {
        return rootNodeId;
    }
    public void setRootNodeId(String rootNodeId) {
        this.rootNodeId = rootNodeId;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }



}