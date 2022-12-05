package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ArrayAuthorize;
import cn.authing.sdk.java.dto.StrAuthorize;
import cn.authing.sdk.java.dto.TreeAuthorize;

public class OpenResource {
    /**
     * 数据策略下所授权的数据资源 Code
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 用户在权限空间下所有的数据策略的资源列表
     */
    @JsonProperty("authorize")
    private (TreeAuthorize | ArrayAuthorize | StrAuthorize) authorize;

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public (TreeAuthorize | ArrayAuthorize | StrAuthorize) getAuthorize() {
        return authorize;
    }
    public void setAuthorize((TreeAuthorize | ArrayAuthorize | StrAuthorize) authorize) {
        this.authorize = authorize;
    }



}