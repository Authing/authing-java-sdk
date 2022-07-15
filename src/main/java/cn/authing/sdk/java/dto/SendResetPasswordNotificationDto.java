package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SendResetPasswordNotificationDto {
    /**
     * 重置密码之后，是否发送用户默认邮件通知
     */
    @JsonProperty("sendDefaultEmailNotification")
    private Boolean sendDefaultEmailNotification;
    /**
     * 重置密码之后，是否发送用户默认短信通知
     */
    @JsonProperty("sendDefaultPhoneNotification")
    private Boolean sendDefaultPhoneNotification;
    /**
     * 当用户密码修改之后，输入发送邮箱
     */
    @JsonProperty("inputSendEmailNotification")
    private String inputSendEmailNotification;
    /**
     * 当用户密码修改之后，输入发送手机号
     */
    @JsonProperty("inputSendPhoneNotification")
    private String inputSendPhoneNotification;
    /**
     * 发送登录地址时，指定的应用 id，会将此应用的登录地址发送给用户的邮箱或者手机号。默认为用户池应用面板的登录地址。
     */
    @JsonProperty("appId")
    private String appId;

    public Boolean getSendDefaultEmailNotification() {
        return sendDefaultEmailNotification;
    }
    public void setSendDefaultEmailNotification(Boolean sendDefaultEmailNotification) {
        this.sendDefaultEmailNotification = sendDefaultEmailNotification;
    }

    public Boolean getSendDefaultPhoneNotification() {
        return sendDefaultPhoneNotification;
    }
    public void setSendDefaultPhoneNotification(Boolean sendDefaultPhoneNotification) {
        this.sendDefaultPhoneNotification = sendDefaultPhoneNotification;
    }

    public String getInputSendEmailNotification() {
        return inputSendEmailNotification;
    }
    public void setInputSendEmailNotification(String inputSendEmailNotification) {
        this.inputSendEmailNotification = inputSendEmailNotification;
    }

    public String getInputSendPhoneNotification() {
        return inputSendPhoneNotification;
    }
    public void setInputSendPhoneNotification(String inputSendPhoneNotification) {
        this.inputSendPhoneNotification = inputSendPhoneNotification;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}