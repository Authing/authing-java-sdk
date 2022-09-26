package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SendResetPasswordNotificationDto;

public class UpdateUserBatchOptionsDto {
    /**
     * 下次登录要求重置密码
     */
    @JsonProperty("resetPasswordOnNextLogin")
    private Boolean resetPasswordOnNextLogin;
    /**
     * 密码加密类型，支持 sm2 和 rsa
     */
    @JsonProperty("passwordEncryptType")
    private PasswordEncryptType passwordEncryptType;
    /**
     * 是否自动生成密码
     */
    @JsonProperty("autoGeneratePassword")
    private Boolean autoGeneratePassword;
    /**
     * 重置密码发送邮件和手机号选项
     */
    @JsonProperty("sendPasswordResetedNotification")
    private SendResetPasswordNotificationDto sendPasswordResetedNotification;

    public Boolean getResetPasswordOnNextLogin() {
        return resetPasswordOnNextLogin;
    }
    public void setResetPasswordOnNextLogin(Boolean resetPasswordOnNextLogin) {
        this.resetPasswordOnNextLogin = resetPasswordOnNextLogin;
    }

    public PasswordEncryptType getPasswordEncryptType() {
        return passwordEncryptType;
    }
    public void setPasswordEncryptType(PasswordEncryptType passwordEncryptType) {
        this.passwordEncryptType = passwordEncryptType;
    }

    public Boolean getAutoGeneratePassword() {
        return autoGeneratePassword;
    }
    public void setAutoGeneratePassword(Boolean autoGeneratePassword) {
        this.autoGeneratePassword = autoGeneratePassword;
    }

    public SendResetPasswordNotificationDto getSendPasswordResetedNotification() {
        return sendPasswordResetedNotification;
    }
    public void setSendPasswordResetedNotification(SendResetPasswordNotificationDto sendPasswordResetedNotification) {
        this.sendPasswordResetedNotification = sendPasswordResetedNotification;
    }


    /**
     * 密码加密类型，支持 sm2 和 rsa
     */
    public static enum PasswordEncryptType {

        @JsonProperty("sm2")
        SM2("sm2"),

        @JsonProperty("rsa")
        RSA("rsa"),

        @JsonProperty("none")
        NONE("none"),
        ;

        private String value;

        PasswordEncryptType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}