package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SendEmailOrPhoneNotificationDto;

public class UpdateUserOptionsDto {
    /**
     * 下次登录要求重置密码
     */
    @JsonProperty("resetPasswordOnNextLogin")
    private Boolean resetPasswordOnNextLogin;
    /**
     * 重置密码发送邮件和手机号选项
     */
    @JsonProperty("sendEmailOrPhoneNotification")
    private SendEmailOrPhoneNotificationDto sendEmailOrPhoneNotification;

    public Boolean getResetPasswordOnNextLogin() {
        return resetPasswordOnNextLogin;
    }
    public void setResetPasswordOnNextLogin(Boolean resetPasswordOnNextLogin) {
        this.resetPasswordOnNextLogin = resetPasswordOnNextLogin;
    }

    public SendEmailOrPhoneNotificationDto getSendEmailOrPhoneNotification() {
        return sendEmailOrPhoneNotification;
    }
    public void setSendEmailOrPhoneNotification(SendEmailOrPhoneNotificationDto sendEmailOrPhoneNotification) {
        this.sendEmailOrPhoneNotification = sendEmailOrPhoneNotification;
    }



}