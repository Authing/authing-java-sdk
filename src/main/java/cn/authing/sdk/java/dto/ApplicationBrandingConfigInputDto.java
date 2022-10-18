package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationBrandingConfigInputDto {
    /**
     * 是否开启自定义 CSS
     */
    @JsonProperty("customCSSEnabled")
    private Boolean customCSSEnabled;
    /**
     * 自定义 CSS 内容
     */
    @JsonProperty("customCSS")
    private String customCSS;
    /**
     * Guard 版本：
     * - `Advanced`: 高级版
     * - `Classical`: 经典版
     *
     */
    @JsonProperty("guardVersion")
    private GuardVersion guardVersion;
    /**
     * 自定义加载图标，当登录框加载时会展示
     */
    @JsonProperty("customLoadingImage")
    private String customLoadingImage;
    /**
     * 自定义登录页背景，示例：
     * - 图片背景：`url(https://files.authing.co/user-contents/photos/6c6b3726-4a04-4ba7-b686-1a275f81a47a.png) center/cover`
     * - 纯色背景：`rgba(37,49,122,1)`
     *
     */
    @JsonProperty("customBackground")
    private String customBackground;
    /**
     * 是否显示切换语言按钮
     */
    @JsonProperty("showChangeLanguageButton")
    private Boolean showChangeLanguageButton;
    /**
     * 展示的默认语言：
     * - `zh-CN`: 简体中文
     * - `zh-TW`: 繁体中文
     * - `en-US`: 英文
     * - `ja-JP`: 日语
     *
     * 默认情况下，Authing 登录页会根据用户浏览器语言自动渲染。
     *
     */
    @JsonProperty("defaultLanguage")
    private DefaultLanguage defaultLanguage;
    /**
     * 是否显示忘记密码按钮
     */
    @JsonProperty("showForgetPasswordButton")
    private Boolean showForgetPasswordButton;
    /**
     * 是否显示企业身份源登录方式
     */
    @JsonProperty("showEnterpriseConnections")
    private Boolean showEnterpriseConnections;
    /**
     * 是否显示社会化登录方式
     */
    @JsonProperty("showSocialConnections")
    private Boolean showSocialConnections;

    public Boolean getCustomCSSEnabled() {
        return customCSSEnabled;
    }
    public void setCustomCSSEnabled(Boolean customCSSEnabled) {
        this.customCSSEnabled = customCSSEnabled;
    }

    public String getCustomCSS() {
        return customCSS;
    }
    public void setCustomCSS(String customCSS) {
        this.customCSS = customCSS;
    }

    public GuardVersion getGuardVersion() {
        return guardVersion;
    }
    public void setGuardVersion(GuardVersion guardVersion) {
        this.guardVersion = guardVersion;
    }

    public String getCustomLoadingImage() {
        return customLoadingImage;
    }
    public void setCustomLoadingImage(String customLoadingImage) {
        this.customLoadingImage = customLoadingImage;
    }

    public String getCustomBackground() {
        return customBackground;
    }
    public void setCustomBackground(String customBackground) {
        this.customBackground = customBackground;
    }

    public Boolean getShowChangeLanguageButton() {
        return showChangeLanguageButton;
    }
    public void setShowChangeLanguageButton(Boolean showChangeLanguageButton) {
        this.showChangeLanguageButton = showChangeLanguageButton;
    }

    public DefaultLanguage getDefaultLanguage() {
        return defaultLanguage;
    }
    public void setDefaultLanguage(DefaultLanguage defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    public Boolean getShowForgetPasswordButton() {
        return showForgetPasswordButton;
    }
    public void setShowForgetPasswordButton(Boolean showForgetPasswordButton) {
        this.showForgetPasswordButton = showForgetPasswordButton;
    }

    public Boolean getShowEnterpriseConnections() {
        return showEnterpriseConnections;
    }
    public void setShowEnterpriseConnections(Boolean showEnterpriseConnections) {
        this.showEnterpriseConnections = showEnterpriseConnections;
    }

    public Boolean getShowSocialConnections() {
        return showSocialConnections;
    }
    public void setShowSocialConnections(Boolean showSocialConnections) {
        this.showSocialConnections = showSocialConnections;
    }


    /**
     * Guard 版本：
     * - `Advanced`: 高级版
     * - `Classical`: 经典版
     *
     */
    public static enum GuardVersion {


        @JsonProperty("Advanced")
        ADVANCED("Advanced"),


        @JsonProperty("Classical")
        CLASSICAL("Classical"),
        ;

        private String value;

        GuardVersion(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 展示的默认语言：
     * - `zh-CN`: 简体中文
     * - `zh-TW`: 繁体中文
     * - `en-US`: 英文
     * - `ja-JP`: 日语
     *
     * 默认情况下，Authing 登录页会根据用户浏览器语言自动渲染。
     *
     */
    public static enum DefaultLanguage {


        @JsonProperty("zh-CN")
        ZH_CN("zh-CN"),


        @JsonProperty("en-US")
        EN_US("en-US"),


        @JsonProperty("zh-TW")
        ZH_TW("zh-TW"),


        @JsonProperty("ja-JP")
        JA_JP("ja-JP"),
        ;

        private String value;

        DefaultLanguage(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}