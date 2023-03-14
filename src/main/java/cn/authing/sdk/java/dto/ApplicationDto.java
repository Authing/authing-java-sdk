package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ApplicationBrandingConfig;
import cn.authing.sdk.java.dto.ApplicationLoginConfigDto;
import cn.authing.sdk.java.dto.ApplicationRegisterConfig;
import cn.authing.sdk.java.dto.CasIdPConfig;
import cn.authing.sdk.java.dto.OauthIdpConfig;
import cn.authing.sdk.java.dto.OIDCConfig;
import cn.authing.sdk.java.dto.SamlIdpConfig;

public class ApplicationDto {
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
     * 用户池 ID
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * 是否为集成应用
     */
    @JsonProperty("isIntegrateApp")
    private Boolean isIntegrateApp;
    /**
     * 默认应用协议类型
     */
    @JsonProperty("defaultProtocol")
    private DefaultProtocol defaultProtocol;
    /**
     * 应用登录回调地址
     */
    @JsonProperty("redirectUris")
    private List<String> redirectUris;
    /**
     * 应用退出登录回调地址
     */
    @JsonProperty("logoutRedirectUris")
    private List<String> logoutRedirectUris;
    /**
     * 发起登录地址：在 Authing 应用详情点击「体验登录」或在应用面板点击该应用图标时，会跳转到此 URL，默认为 Authing 登录页。
     */
    @JsonProperty("initLoginUri")
    private String initLoginUri;
    /**
     * 是否开启 SSO 单点登录
     */
    @JsonProperty("ssoEnabled")
    private Boolean ssoEnabled;
    /**
     * 开启 SSO 单点登录的时间
     */
    @JsonProperty("ssoEnabledAt")
    private String ssoEnabledAt;
    /**
     * 登录配置
     */
    @JsonProperty("loginConfig")
    private ApplicationLoginConfigDto loginConfig;
    /**
     * 注册配置
     */
    @JsonProperty("registerConfig")
    private ApplicationRegisterConfig registerConfig;
    /**
     * 品牌化配置
     */
    @JsonProperty("brandingConfig")
    private ApplicationBrandingConfig brandingConfig;
    /**
     * OIDC 协议配置
     */
    @JsonProperty("oidcConfig")
    private OIDCConfig oidcConfig;
    /**
     * 是否开启 SAML 身份提供商
     */
    @JsonProperty("samlProviderEnabled")
    private Boolean samlProviderEnabled;
    /**
     * SAML 协议配置
     */
    @JsonProperty("samlConfig")
    private SamlIdpConfig samlConfig;
    /**
     * 是否开启 OAuth 身份提供商
     */
    @JsonProperty("oauthProviderEnabled")
    private Boolean oauthProviderEnabled;
    /**
     * OAuth2.0 协议配置
     */
    @JsonProperty("oauthConfig")
    private OauthIdpConfig oauthConfig;
    /**
     * 是否开启 CAS 身份提供商
     */
    @JsonProperty("casProviderEnabled")
    private Boolean casProviderEnabled;
    /**
     * CAS 协议配置
     */
    @JsonProperty("casConfig")
    private CasIdPConfig casConfig;
    /**
     * 是否自定义本应用的登录框，默认走全局的登录框配置。
     */
    @JsonProperty("customBrandingEnabled")
    private Boolean customBrandingEnabled;
    /**
     * 是否自定义本应用的安全规则，默认走全局的安全配置。
     */
    @JsonProperty("customSecurityEnabled")
    private Boolean customSecurityEnabled;
    /**
     * 集成应用的模版类型
     */
    @JsonProperty("template")
    private String template;

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

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public Boolean getIsIntegrateApp() {
        return isIntegrateApp;
    }
    public void setIsIntegrateApp(Boolean isIntegrateApp) {
        this.isIntegrateApp = isIntegrateApp;
    }

    public DefaultProtocol getDefaultProtocol() {
        return defaultProtocol;
    }
    public void setDefaultProtocol(DefaultProtocol defaultProtocol) {
        this.defaultProtocol = defaultProtocol;
    }

    public List<String> getRedirectUris() {
        return redirectUris;
    }
    public void setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
    }

    public List<String> getLogoutRedirectUris() {
        return logoutRedirectUris;
    }
    public void setLogoutRedirectUris(List<String> logoutRedirectUris) {
        this.logoutRedirectUris = logoutRedirectUris;
    }

    public String getInitLoginUri() {
        return initLoginUri;
    }
    public void setInitLoginUri(String initLoginUri) {
        this.initLoginUri = initLoginUri;
    }

    public Boolean getSsoEnabled() {
        return ssoEnabled;
    }
    public void setSsoEnabled(Boolean ssoEnabled) {
        this.ssoEnabled = ssoEnabled;
    }

    public String getSsoEnabledAt() {
        return ssoEnabledAt;
    }
    public void setSsoEnabledAt(String ssoEnabledAt) {
        this.ssoEnabledAt = ssoEnabledAt;
    }

    public ApplicationLoginConfigDto getLoginConfig() {
        return loginConfig;
    }
    public void setLoginConfig(ApplicationLoginConfigDto loginConfig) {
        this.loginConfig = loginConfig;
    }

    public ApplicationRegisterConfig getRegisterConfig() {
        return registerConfig;
    }
    public void setRegisterConfig(ApplicationRegisterConfig registerConfig) {
        this.registerConfig = registerConfig;
    }

    public ApplicationBrandingConfig getBrandingConfig() {
        return brandingConfig;
    }
    public void setBrandingConfig(ApplicationBrandingConfig brandingConfig) {
        this.brandingConfig = brandingConfig;
    }

    public OIDCConfig getOidcConfig() {
        return oidcConfig;
    }
    public void setOidcConfig(OIDCConfig oidcConfig) {
        this.oidcConfig = oidcConfig;
    }

    public Boolean getSamlProviderEnabled() {
        return samlProviderEnabled;
    }
    public void setSamlProviderEnabled(Boolean samlProviderEnabled) {
        this.samlProviderEnabled = samlProviderEnabled;
    }

    public SamlIdpConfig getSamlConfig() {
        return samlConfig;
    }
    public void setSamlConfig(SamlIdpConfig samlConfig) {
        this.samlConfig = samlConfig;
    }

    public Boolean getOauthProviderEnabled() {
        return oauthProviderEnabled;
    }
    public void setOauthProviderEnabled(Boolean oauthProviderEnabled) {
        this.oauthProviderEnabled = oauthProviderEnabled;
    }

    public OauthIdpConfig getOauthConfig() {
        return oauthConfig;
    }
    public void setOauthConfig(OauthIdpConfig oauthConfig) {
        this.oauthConfig = oauthConfig;
    }

    public Boolean getCasProviderEnabled() {
        return casProviderEnabled;
    }
    public void setCasProviderEnabled(Boolean casProviderEnabled) {
        this.casProviderEnabled = casProviderEnabled;
    }

    public CasIdPConfig getCasConfig() {
        return casConfig;
    }
    public void setCasConfig(CasIdPConfig casConfig) {
        this.casConfig = casConfig;
    }

    public Boolean getCustomBrandingEnabled() {
        return customBrandingEnabled;
    }
    public void setCustomBrandingEnabled(Boolean customBrandingEnabled) {
        this.customBrandingEnabled = customBrandingEnabled;
    }

    public Boolean getCustomSecurityEnabled() {
        return customSecurityEnabled;
    }
    public void setCustomSecurityEnabled(Boolean customSecurityEnabled) {
        this.customSecurityEnabled = customSecurityEnabled;
    }

    public String getTemplate() {
        return template;
    }
    public void setTemplate(String template) {
        this.template = template;
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

        @JsonProperty("mini-program")
        MINI_PROGRAM("mini-program"),
        ;

        private String value;

        AppType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 默认应用协议类型
     */
    public static enum DefaultProtocol {

        @JsonProperty("oidc")
        OIDC("oidc"),

        @JsonProperty("oauth")
        OAUTH("oauth"),

        @JsonProperty("saml")
        SAML("saml"),

        @JsonProperty("cas")
        CAS("cas"),

        @JsonProperty("asa")
        ASA("asa"),
        ;

        private String value;

        DefaultProtocol(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}