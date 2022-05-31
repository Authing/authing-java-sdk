package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserRolesDto {
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("namespace")
    private String namespace;

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



}