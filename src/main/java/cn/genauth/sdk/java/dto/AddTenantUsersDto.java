package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AddTenantUsersDto {
    /**
     * 关联的用户池级别的用户 ID
     */
    @JsonProperty("linkUserIds")
    private List<String> linkUserIds;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public List<String> getLinkUserIds() {
        return linkUserIds;
    }
    public void setLinkUserIds(List<String> linkUserIds) {
        this.linkUserIds = linkUserIds;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}