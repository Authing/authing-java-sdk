package dto;

import java.util.List;


public class UserLoggedInAppsDto {
    /**
     * App ID
     */
    private String appId;
    /**
     * App 名称
     */
    private String appName;
    /**
     * App Logo
     */
    private String appLogo;
    /**
     * App 登录地址
     */
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