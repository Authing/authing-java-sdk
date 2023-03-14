package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InviteTenantUserRecord {
    /**
     * 邀请记录编号
     */
    @JsonProperty("recordId")
    private Integer recordId;
    /**
     * 邀请账号
     */
    @JsonProperty("inviteAccount")
    private String inviteAccount;
    /**
     * 账号激活状态
     */
    @JsonProperty("verifiedStatus")
    private String verifiedStatus;
    /**
     * 邀请链接
     */
    @JsonProperty("inviteLink")
    private String inviteLink;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 账号激活时间
     */
    @JsonProperty("activatedAt")
    private String activatedAt;

    public Integer getRecordId() {
        return recordId;
    }
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getInviteAccount() {
        return inviteAccount;
    }
    public void setInviteAccount(String inviteAccount) {
        this.inviteAccount = inviteAccount;
    }

    public String getVerifiedStatus() {
        return verifiedStatus;
    }
    public void setVerifiedStatus(String verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
    }

    public String getInviteLink() {
        return inviteLink;
    }
    public void setInviteLink(String inviteLink) {
        this.inviteLink = inviteLink;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getActivatedAt() {
        return activatedAt;
    }
    public void setActivatedAt(String activatedAt) {
        this.activatedAt = activatedAt;
    }



}