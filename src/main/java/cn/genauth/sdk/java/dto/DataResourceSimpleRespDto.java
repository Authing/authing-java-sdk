package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DataResourceSimpleRespDto {
    /**
     * 数据权限所属的数据资源 ID
     */
    @JsonProperty("resourceId")
    private String resourceId;
    /**
     * 数据权限所属的数据资源名称
     */
    @JsonProperty("resourceName")
    private String resourceName;

    public String getResourceId() {
        return resourceId;
    }
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }



}