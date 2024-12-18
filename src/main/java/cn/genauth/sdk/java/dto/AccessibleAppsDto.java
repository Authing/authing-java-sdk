package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccessibleAppsDto {
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 应用名称
     */
    @JsonProperty("appName")
    private String appName;
    /**
     * 应用登录地址
     */
    @JsonProperty("appLoginUrl")
    private String appLoginUrl;
    /**
     * 应用 Logo
     */
    @JsonProperty("appLogo")
    private String appLogo;
    /**
     * 当前是否处于登录态
     */
    @JsonProperty("active")
    private Boolean active;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppLoginUrl() {
        return appLoginUrl;
    }
    public void setAppLoginUrl(String appLoginUrl) {
        this.appLoginUrl = appLoginUrl;
    }

    public String getAppLogo() {
        return appLogo;
    }
    public void setAppLogo(String appLogo) {
        this.appLogo = appLogo;
    }

    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }



}