package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ResetPasswordDto {
    /**
     * 密码
     */
    @JsonProperty("password")
    private String password;
    /**
     * 重置密码的 token
     */
    @JsonProperty("passwordResetToken")
    private String passwordResetToken;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordResetToken() {
        return passwordResetToken;
    }
    public void setPasswordResetToken(String passwordResetToken) {
        this.passwordResetToken = passwordResetToken;
    }



}