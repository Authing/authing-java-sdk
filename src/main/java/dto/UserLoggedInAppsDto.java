package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UserLoggedInAppsDto {
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