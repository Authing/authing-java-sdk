package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateLoginConfig {
    @JsonProperty("tabMethodsSortConfig")
    private ApplicationTabMethodsSortConfigDto tabMethodsSortConfig;
    @JsonProperty("qrCodeSortConfig")
    private ApplicationTabMethodsSortConfigDto qrCodeSortConfig;
    @JsonProperty("ssoPageCustomizationSettings")
    private ISsoPageCustomizationSettingsDto ssoPageCustomizationSettings;
    @JsonProperty("passwordTabConfig")
    private TabConfigDto passwordTabConfig;
    @JsonProperty("verifyCodeTabConfig")
    private TabConfigDto verifyCodeTabConfig;
    @JsonProperty("config")
    private LanguageCoinfigDto config;
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

    public ApplicationTabMethodsSortConfigDto getTabMethodsSortConfig() {
        return tabMethodsSortConfig;
    }
    public void setTabMethodsSortConfig(ApplicationTabMethodsSortConfigDto tabMethodsSortConfig) {
        this.tabMethodsSortConfig = tabMethodsSortConfig;
    }

    public ApplicationTabMethodsSortConfigDto getQrCodeSortConfig() {
        return qrCodeSortConfig;
    }
    public void setQrCodeSortConfig(ApplicationTabMethodsSortConfigDto qrCodeSortConfig) {
        this.qrCodeSortConfig = qrCodeSortConfig;
    }

    public ISsoPageCustomizationSettingsDto getSsoPageCustomizationSettings() {
        return ssoPageCustomizationSettings;
    }
    public void setSsoPageCustomizationSettings(ISsoPageCustomizationSettingsDto ssoPageCustomizationSettings) {
        this.ssoPageCustomizationSettings = ssoPageCustomizationSettings;
    }

    public TabConfigDto getPasswordTabConfig() {
        return passwordTabConfig;
    }
    public void setPasswordTabConfig(TabConfigDto passwordTabConfig) {
        this.passwordTabConfig = passwordTabConfig;
    }

    public TabConfigDto getVerifyCodeTabConfig() {
        return verifyCodeTabConfig;
    }
    public void setVerifyCodeTabConfig(TabConfigDto verifyCodeTabConfig) {
        this.verifyCodeTabConfig = verifyCodeTabConfig;
    }

    public LanguageCoinfigDto getConfig() {
        return config;
    }
    public void setConfig(LanguageCoinfigDto config) {
        this.config = config;
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



}