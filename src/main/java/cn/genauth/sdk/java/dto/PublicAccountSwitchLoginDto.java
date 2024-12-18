package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PublicAccountSwitchLoginDto {
    /**
     * 切换登录目标用户 ID
     */
    @JsonProperty("targetUserId")
    private String targetUserId;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SignInBySwitchOptionsDto options;

    public String getTargetUserId() {
        return targetUserId;
    }
    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
    }

    public SignInBySwitchOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignInBySwitchOptionsDto options) {
        this.options = options;
    }



}