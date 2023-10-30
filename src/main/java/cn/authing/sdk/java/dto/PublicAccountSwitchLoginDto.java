package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SignInBySwitchOptionsDto;

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