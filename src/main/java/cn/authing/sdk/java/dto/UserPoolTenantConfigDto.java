package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ApplicationLoginConfigDto;
import cn.authing.sdk.java.dto.ISsoPageCustomizationSettingsDto;

public class UserPoolTenantConfigDto {
    /**
     * UserPool ID
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * 用户池是否作为租户
     */
    @JsonProperty("isUserPoolAsTenant")
    private Boolean isUserPoolAsTenant;
    /**
     * 允许切换的类型
     */
    @JsonProperty("enableSwitchType")
    private EnableSwitchType enableSwitchType;
    /**
     * 自定义 CSS
     */
    @JsonProperty("css")
    private String css;
    /**
     * 是否启用自定义 CSS
     */
    @JsonProperty("cssEnabled")
    private Boolean cssEnabled;
    /**
     * 自定义 Loading
     */
    @JsonProperty("customLoading")
    private String customLoading;
    /**
     * 是否开启 Guard 切换
     */
    @JsonProperty("enableGuardVersionSwitch")
    private Boolean enableGuardVersionSwitch;
    /**
     * 使用 Guard 的版本
     */
    @JsonProperty("guardVersion")
    private String guardVersion;
    /**
     * 自定义 Loading 背景
     */
    @JsonProperty("loadingBackground")
    private String loadingBackground;
    /**
     * 是否允许创建租户
     */
    @JsonProperty("enableCreateTenant")
    private Boolean enableCreateTenant;
    /**
     * 允许创建租户的场景
     */
    @JsonProperty("createTenantScenes")
    private List<String> createTenantScenes;
    /**
     * 是否允许加入租户
     */
    @JsonProperty("enableJoinTenant")
    private Boolean enableJoinTenant;
    /**
     * 允许创建加入的场景
     */
    @JsonProperty("joinTenantScenes")
    private List<String> joinTenantScenes;
    /**
     * 是否校验企业域名
     */
    @JsonProperty("enableVerifyDomain")
    private Boolean enableVerifyDomain;
    /**
     * 校验企业域名的场景
     */
    @JsonProperty("verifyDomainScenes")
    private List<String> verifyDomainScenes;
    /**
     * 页面自定义配置
     */
    @JsonProperty("ssoPageCustomizationSettings")
    private ISsoPageCustomizationSettingsDto ssoPageCustomizationSettings;
    /**
     * 是否允许选择门户登录
     */
    @JsonProperty("enableMultipleTenantPortal")
    private Boolean enableMultipleTenantPortal;
    /**
     * 登录配置
     */
    @JsonProperty("loginConfig")
    private ApplicationLoginConfigDto loginConfig;

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public Boolean getIsUserPoolAsTenant() {
        return isUserPoolAsTenant;
    }
    public void setIsUserPoolAsTenant(Boolean isUserPoolAsTenant) {
        this.isUserPoolAsTenant = isUserPoolAsTenant;
    }

    public EnableSwitchType getEnableSwitchType() {
        return enableSwitchType;
    }
    public void setEnableSwitchType(EnableSwitchType enableSwitchType) {
        this.enableSwitchType = enableSwitchType;
    }

    public String getCss() {
        return css;
    }
    public void setCss(String css) {
        this.css = css;
    }

    public Boolean getCssEnabled() {
        return cssEnabled;
    }
    public void setCssEnabled(Boolean cssEnabled) {
        this.cssEnabled = cssEnabled;
    }

    public String getCustomLoading() {
        return customLoading;
    }
    public void setCustomLoading(String customLoading) {
        this.customLoading = customLoading;
    }

    public Boolean getEnableGuardVersionSwitch() {
        return enableGuardVersionSwitch;
    }
    public void setEnableGuardVersionSwitch(Boolean enableGuardVersionSwitch) {
        this.enableGuardVersionSwitch = enableGuardVersionSwitch;
    }

    public String getGuardVersion() {
        return guardVersion;
    }
    public void setGuardVersion(String guardVersion) {
        this.guardVersion = guardVersion;
    }

    public String getLoadingBackground() {
        return loadingBackground;
    }
    public void setLoadingBackground(String loadingBackground) {
        this.loadingBackground = loadingBackground;
    }

    public Boolean getEnableCreateTenant() {
        return enableCreateTenant;
    }
    public void setEnableCreateTenant(Boolean enableCreateTenant) {
        this.enableCreateTenant = enableCreateTenant;
    }

    public List<String> getCreateTenantScenes() {
        return createTenantScenes;
    }
    public void setCreateTenantScenes(List<String> createTenantScenes) {
        this.createTenantScenes = createTenantScenes;
    }

    public Boolean getEnableJoinTenant() {
        return enableJoinTenant;
    }
    public void setEnableJoinTenant(Boolean enableJoinTenant) {
        this.enableJoinTenant = enableJoinTenant;
    }

    public List<String> getJoinTenantScenes() {
        return joinTenantScenes;
    }
    public void setJoinTenantScenes(List<String> joinTenantScenes) {
        this.joinTenantScenes = joinTenantScenes;
    }

    public Boolean getEnableVerifyDomain() {
        return enableVerifyDomain;
    }
    public void setEnableVerifyDomain(Boolean enableVerifyDomain) {
        this.enableVerifyDomain = enableVerifyDomain;
    }

    public List<String> getVerifyDomainScenes() {
        return verifyDomainScenes;
    }
    public void setVerifyDomainScenes(List<String> verifyDomainScenes) {
        this.verifyDomainScenes = verifyDomainScenes;
    }

    public ISsoPageCustomizationSettingsDto getSsoPageCustomizationSettings() {
        return ssoPageCustomizationSettings;
    }
    public void setSsoPageCustomizationSettings(ISsoPageCustomizationSettingsDto ssoPageCustomizationSettings) {
        this.ssoPageCustomizationSettings = ssoPageCustomizationSettings;
    }

    public Boolean getEnableMultipleTenantPortal() {
        return enableMultipleTenantPortal;
    }
    public void setEnableMultipleTenantPortal(Boolean enableMultipleTenantPortal) {
        this.enableMultipleTenantPortal = enableMultipleTenantPortal;
    }

    public ApplicationLoginConfigDto getLoginConfig() {
        return loginConfig;
    }
    public void setLoginConfig(ApplicationLoginConfigDto loginConfig) {
        this.loginConfig = loginConfig;
    }


    /**
     * 允许切换的类型
     */
    public static enum EnableSwitchType {

        @JsonProperty("tenant-console")
        TENANT_CONSOLE("tenant-console"),

        @JsonProperty("tenant-app")
        TENANT_APP("tenant-app"),

        @JsonProperty("tenant-launpad")
        TENANT_LAUNPAD("tenant-launpad"),
        ;

        private String value;

        EnableSwitchType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}