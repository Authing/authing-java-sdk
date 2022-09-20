package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserAuthorizedResourcesDto {
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 用户 ID 类型，可以指定为用户 ID、手机号、邮箱、用户名和 externalId。
     */
    @JsonProperty("userIdType")
    private String userIdType;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 资源类型，如 数据、API、菜单、按钮
     */
    @JsonProperty("resourceType")
    private String resourceType;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserIdType() {
        return userIdType;
    }
    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
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