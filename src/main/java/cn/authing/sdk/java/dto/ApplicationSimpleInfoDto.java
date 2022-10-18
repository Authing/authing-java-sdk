package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationSimpleInfoDto {
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 应用唯一标志
     */
    @JsonProperty("appIdentifier")
    private String appIdentifier;
    /**
     * 应用名称
     */
    @JsonProperty("appName")
    private String appName;
    /**
     * 应用 Logo 链接
     */
    @JsonProperty("appLogo")
    private String appLogo;
    /**
     * 应用描述信息
     */
    @JsonProperty("appDescription")
    private String appDescription;
    /**
     * 应用类型
     */
    @JsonProperty("appType")
    private AppType appType;
    /**
     * 是否为集成应用
     */
    @JsonProperty("isIntegrateApp")
    private Boolean isIntegrateApp;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppIdentifier() {
        return appIdentifier;
    }
    public void setAppIdentifier(String appIdentifier) {
        this.appIdentifier = appIdentifier;
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

    public String getAppDescription() {
        return appDescription;
    }
    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public AppType getAppType() {
        return appType;
    }
    public void setAppType(AppType appType) {
        this.appType = appType;
    }

    public Boolean getIsIntegrateApp() {
        return isIntegrateApp;
    }
    public void setIsIntegrateApp(Boolean isIntegrateApp) {
        this.isIntegrateApp = isIntegrateApp;
    }


    /**
     * 应用类型
     */
    public static enum AppType {


        @JsonProperty("web")
        WEB("web"),


        @JsonProperty("spa")
        SPA("spa"),


        @JsonProperty("native")
        NATIVE("native"),


        @JsonProperty("api")
        API("api"),
        ;

        private String value;

        AppType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}