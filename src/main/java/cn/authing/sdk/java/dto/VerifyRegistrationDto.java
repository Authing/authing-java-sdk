package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.RegistrationCredentialDto;


public class VerifyRegistrationDto {
    /**
     * 获取凭证创建初始化参数时的 ticket
     */
    @JsonProperty("ticket")
    private String ticket;
    /**
     * 绑定认证器凭证信息
     */
    @JsonProperty("registrationCredential")
    private RegistrationCredentialDto registrationCredential;
    /**
     * 凭证信息类型：
     * - `FINGERPRINT`: 指纹
     * - `FACE`: 人脸
     * - `OTHER` 其他
     */
    @JsonProperty("authenticatorCode")
    private AuthenticatorCode authenticatorCode;

    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public RegistrationCredentialDto getRegistrationCredential() {
        return registrationCredential;
    }
    public void setRegistrationCredential(RegistrationCredentialDto registrationCredential) {
        this.registrationCredential = registrationCredential;
    }

    public AuthenticatorCode getAuthenticatorCode() {
        return authenticatorCode;
    }
    public void setAuthenticatorCode(AuthenticatorCode authenticatorCode) {
        this.authenticatorCode = authenticatorCode;
    }


    /**
     * 凭证信息类型：
     * - `FINGERPRINT`: 指纹
     * - `FACE`: 人脸
     * - `OTHER` 其他
     */
    public static enum AuthenticatorCode {

        @JsonProperty("fingerprint")
        FINGERPRINT("fingerprint"),

        @JsonProperty("face")
        FACE("face"),

        @JsonProperty("other")
        OTHER("other"),
        ;

        private String value;

        AuthenticatorCode(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}