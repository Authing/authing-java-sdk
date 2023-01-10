package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TenantApplicationDto {
    /**
     * UserPool ID
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * App ID
     */
    @JsonProperty("tenantAppId")
    private String tenantAppId;
    /**
     * App 名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 应用描述信息
     */
    @JsonProperty("description")
    private String description;
    /**
     * App Logo
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 应用类型
     */
    @JsonProperty("applicationType")
    private String applicationType;
    /**
     * 是否开启 SSO 单点登录
     */
    @JsonProperty("ssoEnabled")
    private Boolean ssoEnabled;
    /**
     * App ID
     */
    @JsonProperty("appId")
    private String appId;

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getTenantAppId() {
        return tenantAppId;
    }
    public void setTenantAppId(String tenantAppId) {
        this.tenantAppId = tenantAppId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getApplicationType() {
        return applicationType;
    }
    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public Boolean getSsoEnabled() {
        return ssoEnabled;
    }
    public void setSsoEnabled(Boolean ssoEnabled) {
        this.ssoEnabled = ssoEnabled;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}