package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ApplicationDefaultLoginMethodInput;
import cn.authing.sdk.java.dto.ApplicationEnabledExtIdpConnInputDto;

public class ApplicationLoginConfigInputDto {
    /**
     * 是否开启登录注册合并
     */
    @JsonProperty("mergeLoginAndRegisterPage")
    private Boolean mergeLoginAndRegisterPage;
    /**
     * 开启的基础登录方式
     */
    @JsonProperty("enabledBasicLoginMethods")
    private List<String> enabledBasicLoginMethods;
    /**
     * 应用默认登录方式（不包含社会化登录和企业身份源登录）
     */
    @JsonProperty("defaultLoginMethod")
    private ApplicationDefaultLoginMethodInput defaultLoginMethod;
    /**
     * 开启的外部身份源连接
     */
    @JsonProperty("enabledExtIdpConnIds")
    private List<ApplicationEnabledExtIdpConnInputDto> enabledExtIdpConnIds;
    /**
     * 开启所有的外部身份源连接
     */
    @JsonProperty("enabledAllExtIdpConns")
    private Boolean enabledAllExtIdpConns;
    /**
     * 是否展示用户授权页面
     */
    @JsonProperty("showAuthorizationPage")
    private Boolean showAuthorizationPage;

    public Boolean getMergeLoginAndRegisterPage() {
        return mergeLoginAndRegisterPage;
    }
    public void setMergeLoginAndRegisterPage(Boolean mergeLoginAndRegisterPage) {
        this.mergeLoginAndRegisterPage = mergeLoginAndRegisterPage;
    }

    public List<String> getEnabledBasicLoginMethods() {
        return enabledBasicLoginMethods;
    }
    public void setEnabledBasicLoginMethods(List<String> enabledBasicLoginMethods) {
        this.enabledBasicLoginMethods = enabledBasicLoginMethods;
    }

    public ApplicationDefaultLoginMethodInput getDefaultLoginMethod() {
        return defaultLoginMethod;
    }
    public void setDefaultLoginMethod(ApplicationDefaultLoginMethodInput defaultLoginMethod) {
        this.defaultLoginMethod = defaultLoginMethod;
    }

    public List<ApplicationEnabledExtIdpConnInputDto> getEnabledExtIdpConnIds() {
        return enabledExtIdpConnIds;
    }
    public void setEnabledExtIdpConnIds(List<ApplicationEnabledExtIdpConnInputDto> enabledExtIdpConnIds) {
        this.enabledExtIdpConnIds = enabledExtIdpConnIds;
    }

    public Boolean getEnabledAllExtIdpConns() {
        return enabledAllExtIdpConns;
    }
    public void setEnabledAllExtIdpConns(Boolean enabledAllExtIdpConns) {
        this.enabledAllExtIdpConns = enabledAllExtIdpConns;
    }

    public Boolean getShowAuthorizationPage() {
        return showAuthorizationPage;
    }
    public void setShowAuthorizationPage(Boolean showAuthorizationPage) {
        this.showAuthorizationPage = showAuthorizationPage;
    }



}