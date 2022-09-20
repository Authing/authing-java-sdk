package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SendCreateAccountNotificationDto {
    /**
     * 创建账号之后，是否发送邮件通知
     */
    @JsonProperty("sendEmailNotification")
    private Boolean sendEmailNotification;
    /**
     * 创建账号之后，是否发送短信通知
     */
    @JsonProperty("sendPhoneNotification")
    private Boolean sendPhoneNotification;
    /**
     * 发送登录地址时，指定的应用 id，会将此应用的登录地址发送给用户的邮箱或者手机号。默认为用户池应用面板的登录地址。
     */
    @JsonProperty("appId")
    private String appId;

    public Boolean getSendEmailNotification() {
        return sendEmailNotification;
    }
    public void setSendEmailNotification(Boolean sendEmailNotification) {
        this.sendEmailNotification = sendEmailNotification;
    }

    public Boolean getSendPhoneNotification() {
        return sendPhoneNotification;
    }
    public void setSendPhoneNotification(Boolean sendPhoneNotification) {
        this.sendPhoneNotification = sendPhoneNotification;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}