package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetDataResourceDto {
    /**
     * 数据资源所属的权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 数据资源 Code, 权限空间内唯一
     */
    @JsonProperty("resourceCode")
    private String resourceCode;

    public String getNamespaceCode() {
        return namespaceCode;
    }
    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }



}