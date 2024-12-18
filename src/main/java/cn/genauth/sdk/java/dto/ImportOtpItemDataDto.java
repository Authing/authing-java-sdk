package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImportOtpItemDataDto {
    /**
     * OTP 密钥
     */
    @JsonProperty("secret")
    private String secret;
    /**
     * OTP Recovery Code
     */
    @JsonProperty("recoveryCode")
    private String recoveryCode;

    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getRecoveryCode() {
        return recoveryCode;
    }
    public void setRecoveryCode(String recoveryCode) {
        this.recoveryCode = recoveryCode;
    }



}