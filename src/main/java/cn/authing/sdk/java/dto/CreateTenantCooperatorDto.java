package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateTenantCooperatorDto {
    /**
     * 策略
     */
    @JsonProperty("policies")
    private List<String> policies;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 是否授权 API
     */
    @JsonProperty("apiAuthorized")
    private Boolean apiAuthorized;
    /**
     * SMS 通知
     */
    @JsonProperty("sendPhoneNotification")
    private Boolean sendPhoneNotification;
    /**
     * Email 通知
     */
    @JsonProperty("sendEmailNotification")
    private Boolean sendEmailNotification;

    public List<String> getPolicies() {
        return policies;
    }
    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getApiAuthorized() {
        return apiAuthorized;
    }
    public void setApiAuthorized(Boolean apiAuthorized) {
        this.apiAuthorized = apiAuthorized;
    }

    public Boolean getSendPhoneNotification() {
        return sendPhoneNotification;
    }
    public void setSendPhoneNotification(Boolean sendPhoneNotification) {
        this.sendPhoneNotification = sendPhoneNotification;
    }

    public Boolean getSendEmailNotification() {
        return sendEmailNotification;
    }
    public void setSendEmailNotification(Boolean sendEmailNotification) {
        this.sendEmailNotification = sendEmailNotification;
    }



}