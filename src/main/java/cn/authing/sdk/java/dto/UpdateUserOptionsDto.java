package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SendResetPasswordNotificationDto;

public class UpdateUserOptionsDto {
    /**
     * 用户 ID 类型，可以指定为用户 ID、手机号、邮箱、用户名和 externalId。
     */
    @JsonProperty("userIdType")
    private UserIdType userIdType;
    /**
     * 下次登录要求重置密码
     */
    @JsonProperty("resetPasswordOnNextLogin")
    private Boolean resetPasswordOnNextLogin;
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

    public UserIdType getUserIdType() {
        return userIdType;
    }
    public void setUserIdType(UserIdType userIdType) {
        this.userIdType = userIdType;
    }

    public Boolean getResetPasswordOnNextLogin() {
        return resetPasswordOnNextLogin;
    }
    public void setResetPasswordOnNextLogin(Boolean resetPasswordOnNextLogin) {
        this.resetPasswordOnNextLogin = resetPasswordOnNextLogin;
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
     * 用户 ID 类型，可以指定为用户 ID、手机号、邮箱、用户名和 externalId。
     */
    public static enum UserIdType {

        @JsonProperty("user_id")
        USER_ID("user_id"),

        @JsonProperty("external_id")
        EXTERNAL_ID("external_id"),

        @JsonProperty("phone")
        PHONE("phone"),

        @JsonProperty("email")
        EMAIL("email"),

        @JsonProperty("username")
        USERNAME("username"),
        ;

        private String value;

        UserIdType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}