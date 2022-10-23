package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ApplicationDefaultLoginMethod;
import cn.authing.sdk.java.dto.ApplicationEnabledExtIdpConnDto;

public class ApplicationLoginConfigDto {
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
    private ApplicationDefaultLoginMethod defaultLoginMethod;
    /**
     * 开启的外部身份源连接
     */
    @JsonProperty("enabledExtIdpConns")
    private List<ApplicationEnabledExtIdpConnDto> enabledExtIdpConns;
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

    public ApplicationDefaultLoginMethod getDefaultLoginMethod() {
        return defaultLoginMethod;
    }
    public void setDefaultLoginMethod(ApplicationDefaultLoginMethod defaultLoginMethod) {
        this.defaultLoginMethod = defaultLoginMethod;
    }

    public List<ApplicationEnabledExtIdpConnDto> getEnabledExtIdpConns() {
        return enabledExtIdpConns;
    }
    public void setEnabledExtIdpConns(List<ApplicationEnabledExtIdpConnDto> enabledExtIdpConns) {
        this.enabledExtIdpConns = enabledExtIdpConns;
    }

    public Boolean getShowAuthorizationPage() {
        return showAuthorizationPage;
    }
    public void setShowAuthorizationPage(Boolean showAuthorizationPage) {
        this.showAuthorizationPage = showAuthorizationPage;
    }



}