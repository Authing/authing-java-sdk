package dto;


public class AppDto {
    /**
     * App ID
     */
    private String appId
    /**
     * App 名称
     */
    private String appName
    /**
     * App Logo
     */
    private String appLogo
    /**
     * App 登录地址
     */
    private String appLoginUrl
    /**
     * App 默认的登录策略
     */
    private AppDto.appDefaultLoginStrategy appDefaultLoginStrategy

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

    public AppDto.appDefaultLoginStrategy getAppDefaultLoginStrategy() {
        return appDefaultLoginStrategy;
    }
    public void setAppDefaultLoginStrategy(AppDto.appDefaultLoginStrategy appDefaultLoginStrategy) {
        this.appDefaultLoginStrategy = appDefaultLoginStrategy;
    }

};