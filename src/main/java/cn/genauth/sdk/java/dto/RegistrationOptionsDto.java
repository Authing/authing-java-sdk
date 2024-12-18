package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrationOptionsDto {
    /**
     * 认证器生成公钥凭证的参数
     */
    @JsonProperty("registrationOptions")
    private PublicKeyCredentialCreationOptionsDto registrationOptions;
    /**
     * ticket 需回传，用作向服务器发起验证从认证器获得的创建凭证时的结果
     */
    @JsonProperty("ticket")
    private String ticket;

    public PublicKeyCredentialCreationOptionsDto getRegistrationOptions() {
        return registrationOptions;
    }
    public void setRegistrationOptions(PublicKeyCredentialCreationOptionsDto registrationOptions) {
        this.registrationOptions = registrationOptions;
    }

    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }



}