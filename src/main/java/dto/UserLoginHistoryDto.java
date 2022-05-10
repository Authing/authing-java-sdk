package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UserLoginHistoryDto {
    /**
     * App ID
     */
    @JsonProperty("getAppId")
    private String appId;
    /**
     * App 名称
     */
    @JsonProperty("getAppName")
    private String appName;
    /**
     * App Logo
     */
    @JsonProperty("getAppLogo")
    private String appLogo;
    /**
     * App 登录地址
     */
    @JsonProperty("getAppLoginUrl")
    private String appLoginUrl;
    /**
     * 客户端 IP
     */
    @JsonProperty("getClientIp")
    private String clientIp;
    /**
     * 登录时使用的 user agent
     */
    @JsonProperty("getUserAgent")
    private String userAgent;
    /**
     * 登录时间
     */
    @JsonProperty("getTime")
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