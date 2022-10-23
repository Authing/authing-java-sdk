package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskItalentClientConfig {
    /**
     * Tenant Id
     */
    @JsonProperty("tenant_id")
    private String tenantId;
    /**
     * App Key
     */
    @JsonProperty("app_key")
    private String appKey;
    /**
     * App Secret
     */
    @JsonProperty("app_secret")
    private String appSecret;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getAppKey() {
        return appKey;
    }
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }



}