package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateApplicationMfaSettingsDto {
    /**
     * 所属应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 开启的 MFA 认证因素列表
     */
    @JsonProperty("enabledFactors")
    private List<String> enabledFactors;
    /**
     * 关闭的 MFA 认证因素列表
     */
    @JsonProperty("disabledFactors")
    private List<String> disabledFactors;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public List<String> getEnabledFactors() {
        return enabledFactors;
    }
    public void setEnabledFactors(List<String> enabledFactors) {
        this.enabledFactors = enabledFactors;
    }

    public List<String> getDisabledFactors() {
        return disabledFactors;
    }
    public void setDisabledFactors(List<String> disabledFactors) {
        this.disabledFactors = disabledFactors;
    }



}