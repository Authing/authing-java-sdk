package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MFASettingsDto {
    /**
     * 开启的 MFA 认证因素列表
     */
    @JsonProperty("enabledFactors")
    private List<String> enabledFactors;

    public List<String> getEnabledFactors() {
        return enabledFactors;
    }
    public void setEnabledFactors(List<String> enabledFactors) {
        this.enabledFactors = enabledFactors;
    }



}