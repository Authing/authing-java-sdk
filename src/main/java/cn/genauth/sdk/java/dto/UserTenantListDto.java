package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserTenantListDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 租户名称
     */
    @JsonProperty("tenantName")
    private String tenantName;
    /**
     * 加入租户的时间
     */
    @JsonProperty("joinAt")
    private String joinAt;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantName() {
        return tenantName;
    }
    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getJoinAt() {
        return joinAt;
    }
    public void setJoinAt(String joinAt) {
        this.joinAt = joinAt;
    }



}