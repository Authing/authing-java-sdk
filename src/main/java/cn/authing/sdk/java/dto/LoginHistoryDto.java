package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.GeoIp;
import cn.authing.sdk.java.dto.ParsedUserAgent;

public class LoginHistoryDto {
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
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
     * 登录时间
     */
    @JsonProperty("loginAt")
    private String loginAt;
    /**
     * 登录时使用的客户端 IP
     */
    @JsonProperty("clientIp")
    private String clientIp;
    /**
     * 是否登录成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 登录失败时的具体错误信息
     */
    @JsonProperty("errorMessage")
    private String errorMessage;
    /**
     * User Agent
     */
    @JsonProperty("userAgent")
    private String userAgent;
    /**
     * 解析过后的 User Agent
     */
    @JsonProperty("parsedUserAgent")
    private ParsedUserAgent parsedUserAgent;
    /**
     * 使用的登录方式
     */
    @JsonProperty("loginMethod")
    private String loginMethod;
    /**
     * 地理位置
     */
    @JsonProperty("geoip")
    private GeoIp geoip;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public String getLoginAt() {
        return loginAt;
    }
    public void setLoginAt(String loginAt) {
        this.loginAt = loginAt;
    }

    public String getClientIp() {
        return clientIp;
    }
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getUserAgent() {
        return userAgent;
    }
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public ParsedUserAgent getParsedUserAgent() {
        return parsedUserAgent;
    }
    public void setParsedUserAgent(ParsedUserAgent parsedUserAgent) {
        this.parsedUserAgent = parsedUserAgent;
    }

    public String getLoginMethod() {
        return loginMethod;
    }
    public void setLoginMethod(String loginMethod) {
        this.loginMethod = loginMethod;
    }

    public GeoIp getGeoip() {
        return geoip;
    }
    public void setGeoip(GeoIp geoip) {
        this.geoip = geoip;
    }



}