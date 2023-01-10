package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserResourceStructDto {
    /**
     * 数据资源 Code
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }
    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }



}