package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetTenantUserDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 关联的用户池级别的用户 ID
     */
    @JsonProperty("linkUserId")
    private String linkUserId;
    /**
     * 租户成员 ID
     */
    @JsonProperty("memberId")
    private String memberId;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getLinkUserId() {
        return linkUserId;
    }
    public void setLinkUserId(String linkUserId) {
        this.linkUserId = linkUserId;
    }

    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }



}