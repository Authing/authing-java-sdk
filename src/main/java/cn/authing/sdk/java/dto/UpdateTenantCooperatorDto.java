package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateTenantCooperatorDto {
    /**
     * 是否授权 API
     */
    @JsonProperty("apiAuthorized")
    private Boolean apiAuthorized;
    /**
     * 策略
     */
    @JsonProperty("policies")
    private List<String> policies;

    public Boolean getApiAuthorized() {
        return apiAuthorized;
    }
    public void setApiAuthorized(Boolean apiAuthorized) {
        this.apiAuthorized = apiAuthorized;
    }

    public List<String> getPolicies() {
        return policies;
    }
    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }



}