package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SendEmailOrPhoneNotificationDto {
    /**
     * 邮箱
     */
    @JsonProperty("sendEmailNotification")
    private String sendEmailNotification;
    /**
     * 手机号
     */
    @JsonProperty("sendPhoneNotification")
    private String sendPhoneNotification;
    /**
     * 应用 id
     */
    @JsonProperty("appId")
    private String appId;

    public String getSendEmailNotification() {
        return sendEmailNotification;
    }
    public void setSendEmailNotification(String sendEmailNotification) {
        this.sendEmailNotification = sendEmailNotification;
    }

    public String getSendPhoneNotification() {
        return sendPhoneNotification;
    }
    public void setSendPhoneNotification(String sendPhoneNotification) {
        this.sendPhoneNotification = sendPhoneNotification;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}