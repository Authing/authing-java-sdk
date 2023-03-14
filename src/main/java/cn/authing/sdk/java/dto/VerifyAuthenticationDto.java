package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.AuthenticationCredentialDto;
import cn.authing.sdk.java.dto.SignInByWebAuthnOptionsDto;

public class VerifyAuthenticationDto {
    /**
     * 从 获取 WebAuthn 认证请求初始化参数接口 获得的 ticket
     */
    @JsonProperty("ticket")
    private String ticket;
    /**
     * 认证器凭证信息
     */
    @JsonProperty("authenticationCredential")
    private AuthenticationCredentialDto authenticationCredential;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SignInByWebAuthnOptionsDto options;

    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public AuthenticationCredentialDto getAuthenticationCredential() {
        return authenticationCredential;
    }
    public void setAuthenticationCredential(AuthenticationCredentialDto authenticationCredential) {
        this.authenticationCredential = authenticationCredential;
    }

    public SignInByWebAuthnOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignInByWebAuthnOptionsDto options) {
        this.options = options;
    }



}