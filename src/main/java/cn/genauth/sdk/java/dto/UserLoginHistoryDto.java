package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserLoginHistoryDto {
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
    /**
     * 客户端 IP
     */
    @JsonProperty("clientIp")
    private String clientIp;
    /**
     * 登录时使用的 user agent
     */
    @JsonProperty("userAgent")
    private String userAgent;
    /**
     * 登录时间
     */
    @JsonProperty("time")
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



}