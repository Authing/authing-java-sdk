package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SendTenantEmailDto {
    /**
     * 管理员名字
     */
    @JsonProperty("adminName")
    private String adminName;
    /**
     * 用户名
     */
    @JsonProperty("userName")
    private String userName;
    /**
     * 管理员邮箱
     */
    @JsonProperty("email")
    private String email;
    /**
     * 租户域名
     */
    @JsonProperty("identifier")
    private String identifier;
    /**
     * 租户 id
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 租户名
     */
    @JsonProperty("tenantName")
    private String tenantName;

    public String getAdminName() {
        return adminName;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantName() {
        return tenantName;
    }
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }



}