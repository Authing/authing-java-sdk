package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserLoggedInAppsDto {
    /**
     * App ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * App 名称
     */
    @JsonProperty("appName")
    private String appName;
    /**
     * App Logo
     */
    @JsonProperty("appLogo")
    private String appLogo;
    /**
     * App 登录地址
     */
    @JsonProperty("appLoginUrl")
    private String appLoginUrl;

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

    public String getAppLogo() {
        return appLogo;
    }
    public void setAppLogo(String appLogo) {
        this.appLogo = appLogo;
    }

    public String getAppLoginUrl() {
        return appLoginUrl;
    }
    public void setAppLoginUrl(String appLoginUrl) {
        this.appLoginUrl = appLoginUrl;
    }



}