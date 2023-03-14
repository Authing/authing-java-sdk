package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RemoveTenantUsersDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 关联的用户池级别的用户 ID
     */
    @JsonProperty("linkUserIds")
    private List<String> linkUserIds;
    /**
     * 租户成员 ID
     */
    @JsonProperty("memberIds")
    private List<String> memberIds;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public List<String> getLinkUserIds() {
        return linkUserIds;
    }
    public void setLinkUserIds(List<String> linkUserIds) {
        this.linkUserIds = linkUserIds;
    }

    public List<String> getMemberIds() {
        return memberIds;
    }
    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }



}