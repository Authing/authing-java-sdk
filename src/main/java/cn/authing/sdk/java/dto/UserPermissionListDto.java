package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.resourceDto;
import cn.authing.sdk.java.dto.resourceOtherDto;

public class UserPermissionListDto {
    /**
     * 数据策略授权的用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 数据策略授权的权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 用户在权限空间下所有的数据策略资源列表
     */
    @JsonProperty("resourceList")
    private (resourceDto | resourceOtherDto) resourceList;

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

    public (resourceDto | resourceOtherDto) getResourceList() {
        return resourceList;
    }
    public void setResourceList((resourceDto | resourceOtherDto) resourceList) {
        this.resourceList = resourceList;
    }



}