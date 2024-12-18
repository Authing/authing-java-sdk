package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateMultipleTenantAdminDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantIds")
    private List<String> tenantIds;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 是否授权
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

    public List<String> getTenantIds() {
        return tenantIds;
    }
    public void setTenantIds(List<String> tenantIds) {
        this.tenantIds = tenantIds;
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