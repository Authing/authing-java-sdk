package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class MfaOtpVerityDto {
    /**
     * OTP 口令
     */
    @JsonProperty("totp")
    private String totp;

    public String getTotp() {
        return totp;
    }
    public void setTotp(String totp) {
        this.totp = totp;
    }



}