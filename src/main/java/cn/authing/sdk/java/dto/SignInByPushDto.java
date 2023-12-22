package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SignInByPushOptionsDto;

public class SignInByPushDto {
    /**
     * 用户账号（用户名/手机号/邮箱）
     */
    @JsonProperty("account")
    private String account;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SignInByPushOptionsDto options;

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public SignInByPushOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignInByPushOptionsDto options) {
        this.options = options;
    }



}