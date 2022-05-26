package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserMfaRespDto {
    /**
     * 是否绑定了 TOTP，可选值 enabled, disabled
     */
    @JsonProperty("totpStatus")
    private String totpStatus;
    /**
     * 是否绑定了人脸 MFA，可选值 enabled, disabled
     */
    @JsonProperty("faceMfaStatus")
    private String faceMfaStatus;

    public String getTotpStatus() {
        return totpStatus;
    }
    public void setTotpStatus(String totpStatus) {
        this.totpStatus = totpStatus;
    }

    public String getFaceMfaStatus() {
        return faceMfaStatus;
    }
    public void setFaceMfaStatus(String faceMfaStatus) {
        this.faceMfaStatus = faceMfaStatus;
    }



}