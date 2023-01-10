package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ISsoPageCustomizationSettingsDto;
import cn.authing.sdk.java.dto.LanguageCoinfigDto;
import cn.authing.sdk.java.dto.TabConfigDto;

public class UpdateLoginConfig {
    @JsonProperty("ssoPageCustomizationSettings")
    private ISsoPageCustomizationSettingsDto ssoPageCustomizationSettings;
    @JsonProperty("passwordTabConfig")
    private TabConfigDto passwordTabConfig;
    @JsonProperty("verifyCodeTabConfig")
    private TabConfigDto verifyCodeTabConfig;
    @JsonProperty("config")
    private LanguageCoinfigDto config;

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



}