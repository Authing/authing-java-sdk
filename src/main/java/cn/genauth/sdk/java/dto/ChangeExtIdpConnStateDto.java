package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChangeExtIdpConnStateDto {
    /**
     * 身份源连接 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 是否开启身份源连接
     */
    @JsonProperty("enabled")
    private Boolean enabled;
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
    /**
     * 应用 ID 列表
     */
    @JsonProperty("appIds")
    private List<String> appIds;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public List<String> getAppIds() {
        return appIds;
    }
    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }



}