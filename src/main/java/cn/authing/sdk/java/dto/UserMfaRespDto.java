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
    /**
     * 是否绑定了 SMS MFA，可选值 enabled, disabled
     */
    @JsonProperty("smsMfaStatus")
    private String smsMfaStatus;
    /**
     * 是否绑定了 EMAIL MFA，可选值 enabled, disabled
     */
    @JsonProperty("emailMfaStatus")
    private String emailMfaStatus;

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

    public String getSmsMfaStatus() {
        return smsMfaStatus;
    }
    public void setSmsMfaStatus(String smsMfaStatus) {
        this.smsMfaStatus = smsMfaStatus;
    }

    public String getEmailMfaStatus() {
        return emailMfaStatus;
    }
    public void setEmailMfaStatus(String emailMfaStatus) {
        this.emailMfaStatus = emailMfaStatus;
    }



}