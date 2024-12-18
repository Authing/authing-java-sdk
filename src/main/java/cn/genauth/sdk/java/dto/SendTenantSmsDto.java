package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SendTenantSmsDto {
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
     * 用户唯一标识
     */
    @JsonProperty("identifier")
    private String identifier;
    /**
     * 管理员手机
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 管理员手机地区号
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;
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

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }
    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
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