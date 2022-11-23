package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckUserSameLevelPermissionDto {
    /**
     * 资源路径
     */
    @JsonProperty("resource")
    private String resource;
    /**
     * 数据资源权限操作
     */
    @JsonProperty("action")
    private String action;
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
    /**
     * 当前树资源路径子节点code
     */
    @JsonProperty("resourceNodeCodes")
    private List<String> resourceNodeCodes;

    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
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

    public List<String> getResourceNodeCodes() {
        return resourceNodeCodes;
    }
    public void setResourceNodeCodes(List<String> resourceNodeCodes) {
        this.resourceNodeCodes = resourceNodeCodes;
    }



}