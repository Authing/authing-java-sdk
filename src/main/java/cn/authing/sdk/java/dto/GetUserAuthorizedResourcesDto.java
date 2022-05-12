package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserAuthorizedResourcesDto {
    /**
     * 用户 ID
     */
    @JsonProperty("user_id")
    private String userId;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 资源类型
     */
    @JsonProperty("resource_type")
    private String resourceType;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
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



}