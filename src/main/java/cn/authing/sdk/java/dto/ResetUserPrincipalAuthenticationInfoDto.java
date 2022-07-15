package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ResetUserPrincipalAuthenticationInfoOptionsDto;

public class ResetUserPrincipalAuthenticationInfoDto {
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private ResetUserPrincipalAuthenticationInfoOptionsDto options;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ResetUserPrincipalAuthenticationInfoOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ResetUserPrincipalAuthenticationInfoOptionsDto options) {
        this.options = options;
    }



}