package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetMfaInfoDataDto {
    /**
     * MFA Token
     */
    @JsonProperty("mfaToken")
    private String mfaToken;
    /**
     * MFA 绑定的手机号
     */
    @JsonProperty("mfaPhone")
    private String mfaPhone;
    /**
     * MFA 绑定的手机区号
     */
    @JsonProperty("mfaPhoneCountryCode")
    private String mfaPhoneCountryCode;
    /**
     * MFA 绑定的邮箱
     */
    @JsonProperty("mfaEmail")
    private String mfaEmail;
    /**
     * 用户昵称
     */
    @JsonProperty("nickname")
    private String nickname;
    /**
     * 用户名
     */
    @JsonProperty("username")
    private String username;
    /**
     * 用户手机号
     */
    @JsonProperty("phone")
    private String phone;
    /**
     * 用户手机区号
     */
    @JsonProperty("phoneCountryCode")
    private String phoneCountryCode;
    /**
     * 人脸校验是否开启
     */
    @JsonProperty("faceMfaEnabled")
    private Boolean faceMfaEnabled;
    /**
     * OTP 校验是否开启
     */
    @JsonProperty("totpMfaEnabled")
    private Boolean totpMfaEnabled;
    /**
     * MFA Factor 列表
     */
    @JsonProperty("applicationMfa")
    private List<ApplicationMfaDto> applicationMfa;

    public String getMfaToken() {
        return mfaToken;
    }
    public void setMfaToken(String mfaToken) {
        this.mfaToken = mfaToken;
    }

    public String getMfaPhone() {
        return mfaPhone;
    }
    public void setMfaPhone(String mfaPhone) {
        this.mfaPhone = mfaPhone;
    }

    public String getMfaPhoneCountryCode() {
        return mfaPhoneCountryCode;
    }
    public void setMfaPhoneCountryCode(String mfaPhoneCountryCode) {
        this.mfaPhoneCountryCode = mfaPhoneCountryCode;
    }

    public String getMfaEmail() {
        return mfaEmail;
    }
    public void setMfaEmail(String mfaEmail) {
        this.mfaEmail = mfaEmail;
    }

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }
    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public Boolean getFaceMfaEnabled() {
        return faceMfaEnabled;
    }
    public void setFaceMfaEnabled(Boolean faceMfaEnabled) {
        this.faceMfaEnabled = faceMfaEnabled;
    }

    public Boolean getTotpMfaEnabled() {
        return totpMfaEnabled;
    }
    public void setTotpMfaEnabled(Boolean totpMfaEnabled) {
        this.totpMfaEnabled = totpMfaEnabled;
    }

    public List<ApplicationMfaDto> getApplicationMfa() {
        return applicationMfa;
    }
    public void setApplicationMfa(List<ApplicationMfaDto> applicationMfa) {
        this.applicationMfa = applicationMfa;
    }



}