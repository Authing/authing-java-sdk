package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateMultipleTenantAdminDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantIds")
    private List<String> tenantIds;
    /**
     * 是否授权
     */
    @JsonProperty("apiAuthorized")
    private Boolean apiAuthorized;

    public List<String> getTenantIds() {
        return tenantIds;
    }
    public void setTenantIds(List<String> tenantIds) {
        this.tenantIds = tenantIds;
    }

    public Boolean getApiAuthorized() {
        return apiAuthorized;
    }
    public void setApiAuthorized(Boolean apiAuthorized) {
        this.apiAuthorized = apiAuthorized;
    }



}