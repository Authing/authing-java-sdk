package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenerateInviteTenantUserLink {
    /**
     * 链接有效期
     */
    @JsonProperty("validityTerm")
    private String validityTerm;
    /**
     * 要邀请的用户邮箱
     */
    @JsonProperty("emails")
    private List<String> emails;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getValidityTerm() {
        return validityTerm;
    }
    public void setValidityTerm(String validityTerm) {
        this.validityTerm = validityTerm;
    }

    public List<String> getEmails() {
        return emails;
    }
    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}