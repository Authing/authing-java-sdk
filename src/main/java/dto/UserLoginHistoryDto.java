package dto;

import java.util.List;


public class UserLoginHistoryDto {
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
    /**
     * 客户端 IP
     */
    private String clientIp;
    /**
     * 登录时使用的 user agent
     */
    private String userAgent;
    /**
     * 登录时间
     */
    private String time;

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

    public String getClientIp() {
        return clientIp;
    }
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getUserAgent() {
        return userAgent;
    }
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }



};