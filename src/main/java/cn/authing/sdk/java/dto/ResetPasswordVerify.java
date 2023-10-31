package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ResetPasswordVerify {
    /**
     * 用于重置密码 token
     */
    @JsonProperty("passwordResetToken")
    private String passwordResetToken;
    /**
     * 过期时间
     */
    @JsonProperty("tokenExpiresIn")
    private Integer tokenExpiresIn;

    public String getPasswordResetToken() {
        return passwordResetToken;
    }
    public void setPasswordResetToken(String passwordResetToken) {
        this.passwordResetToken = passwordResetToken;
    }

    public Integer getTokenExpiresIn() {
        return tokenExpiresIn;
    }
    public void setTokenExpiresIn(Integer tokenExpiresIn) {
        this.tokenExpiresIn = tokenExpiresIn;
    }



}