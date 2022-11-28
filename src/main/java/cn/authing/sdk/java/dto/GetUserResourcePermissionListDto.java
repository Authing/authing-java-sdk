package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserResourcePermissionListDto {
    /**
     * 资源路径列表
     */
    @JsonProperty("resources")
    private List<String> resources;
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

    public List<String> getResources() {
        return resources;
    }
    public void setResources(List<String> resources) {
        this.resources = resources;
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