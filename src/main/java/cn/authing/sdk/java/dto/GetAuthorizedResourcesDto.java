package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAuthorizedResourcesDto {
    /**
     * 目标对象类型
     */
    @JsonProperty("targetType")
    private String targetType;
    /**
     * 目标对象唯一标志符
     */
    @JsonProperty("targetIdentifier")
    private String targetIdentifier;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 限定资源类型，如数据、API、按钮、菜单
     */
    @JsonProperty("resourceType")
    private String resourceType;
    /**
     * 限定查询的资源列表，如果指定，只会返回所指定的资源列表。
     */
    @JsonProperty("resourceList")
    private String resourceList;
    /**
     * 是否获取被拒绝的资源
     */
    @JsonProperty("withDenied")
    private Boolean withDenied;

    public String getTargetType() {
        return targetType;
    }
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceList() {
        return resourceList;
    }
    public void setResourceList(String resourceList) {
        this.resourceList = resourceList;
    }

    public Boolean getWithDenied() {
        return withDenied;
    }
    public void setWithDenied(Boolean withDenied) {
        this.withDenied = withDenied;
    }



}