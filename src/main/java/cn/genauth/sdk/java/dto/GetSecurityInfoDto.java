package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetSecurityInfoDto {
    /**
     * 密码强度等级
     */
    @JsonProperty("passwordSecurityLevel")
    private Integer passwordSecurityLevel;
    /**
     * 是否绑定了 MFA
     */
    @JsonProperty("mfaEnrolled")
    private Boolean mfaEnrolled;
    /**
     * 是否设置了密码
     */
    @JsonProperty("passwordSet")
    private Boolean passwordSet;
    /**
     * 是否绑定了邮箱
     */
    @JsonProperty("emailBinded")
    private Boolean emailBinded;
    /**
     * 是否绑定了手机号
     */
    @JsonProperty("phoneBinded")
    private Boolean phoneBinded;
    /**
     * 账号等级评分
     */
    @JsonProperty("securityScore")
    private Integer securityScore;

    public Integer getPasswordSecurityLevel() {
        return passwordSecurityLevel;
    }
    public void setPasswordSecurityLevel(Integer passwordSecurityLevel) {
        this.passwordSecurityLevel = passwordSecurityLevel;
    }

    public Boolean getMfaEnrolled() {
        return mfaEnrolled;
    }
    public void setMfaEnrolled(Boolean mfaEnrolled) {
        this.mfaEnrolled = mfaEnrolled;
    }

    public Boolean getPasswordSet() {
        return passwordSet;
    }
    public void setPasswordSet(Boolean passwordSet) {
        this.passwordSet = passwordSet;
    }

    public Boolean getEmailBinded() {
        return emailBinded;
    }
    public void setEmailBinded(Boolean emailBinded) {
        this.emailBinded = emailBinded;
    }

    public Boolean getPhoneBinded() {
        return phoneBinded;
    }
    public void setPhoneBinded(Boolean phoneBinded) {
        this.phoneBinded = phoneBinded;
    }

    public Integer getSecurityScore() {
        return securityScore;
    }
    public void setSecurityScore(Integer securityScore) {
        this.securityScore = securityScore;
    }



}