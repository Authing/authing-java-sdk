package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EnableExtIdpConnDto {
    /**
     * 应用 ID
     */
    @JsonProperty("appIds")
    private String appIds;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 是否开启身份源连接
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 身份源连接 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getAppIds() {
        return appIds;
    }
    public void setAppIds(String appIds) {
        this.appIds = appIds;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}