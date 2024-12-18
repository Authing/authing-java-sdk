package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticationOptionsDto {
    /**
     * 认证器认证参数
     */
    @JsonProperty("authenticationOptions")
    private PublicKeyCredentialRequestOptionsDto authenticationOptions;
    /**
     * ticket 需回传，用作向服务器发起验证从认证器获得的认证结果
     */
    @JsonProperty("ticket")
    private String ticket;

    public PublicKeyCredentialRequestOptionsDto getAuthenticationOptions() {
        return authenticationOptions;
    }
    public void setAuthenticationOptions(PublicKeyCredentialRequestOptionsDto authenticationOptions) {
        this.authenticationOptions = authenticationOptions;
    }

    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }



}