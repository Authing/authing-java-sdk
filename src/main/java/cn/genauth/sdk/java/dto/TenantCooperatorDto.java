package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TenantCooperatorDto {
    /**
     * 用户唯一 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * 是否external
     */
    @JsonProperty("external")
    private Boolean external;
    /**
     * 用户
     */
    @JsonProperty("user")
    private UserDto user;
    /**
     * 租户用户
     */
    @JsonProperty("tenantUser")
    private TenantUserDto tenantUser;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Boolean getExternal() {
        return external;
    }
    public void setExternal(Boolean external) {
        this.external = external;
    }

    public UserDto getUser() {
        return user;
    }
    public void setUser(UserDto user) {
        this.user = user;
    }

    public TenantUserDto getTenantUser() {
        return tenantUser;
    }
    public void setTenantUser(TenantUserDto tenantUser) {
        this.tenantUser = tenantUser;
    }



}