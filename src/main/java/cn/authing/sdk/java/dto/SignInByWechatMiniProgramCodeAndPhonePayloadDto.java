package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SignInByWechatMiniProgramCodePayloadDto;
import cn.authing.sdk.java.dto.SignInByWechatMiniProgramPhoneInfoPayloadDto;


public class SignInByWechatMiniProgramCodeAndPhonePayloadDto {
    /**
     * 微信小程序使用 code 登录相关数据，必填
     */
    @JsonProperty("wxLoginInfo")
    private SignInByWechatMiniProgramCodePayloadDto wxLoginInfo;
    /**
     * 必填，微信小程序用户授权使用手机号登录相关数据。如果是新用户注册到用户池，手机号将会同步更新到用户信息；如果用户池用户已存在，若用户没有绑定过手机号且从小程序授权的手机号未被绑定过，将会把手机号更新到用户信息上。
     */
    @JsonProperty("wxPhoneInfo")
    private SignInByWechatMiniProgramPhoneInfoPayloadDto wxPhoneInfo;

    public SignInByWechatMiniProgramCodePayloadDto getWxLoginInfo() {
        return wxLoginInfo;
    }
    public void setWxLoginInfo(SignInByWechatMiniProgramCodePayloadDto wxLoginInfo) {
        this.wxLoginInfo = wxLoginInfo;
    }

    public SignInByWechatMiniProgramPhoneInfoPayloadDto getWxPhoneInfo() {
        return wxPhoneInfo;
    }
    public void setWxPhoneInfo(SignInByWechatMiniProgramPhoneInfoPayloadDto wxPhoneInfo) {
        this.wxPhoneInfo = wxPhoneInfo;
    }



}