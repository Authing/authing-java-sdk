package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class EnableExtIdpConnDto {
    /**
     * 应用 ID
     */
    @JsonProperty("getAppId")
    private String appId;
    /**
     * 是否开启身份源连接
     */
    @JsonProperty("getEnabled")
    private Boolean enabled;
    /**
     * 身份源连接 ID
     */
    @JsonProperty("getId")
    private String id;
    /**
     * 租户 ID
     */
    @JsonProperty("getTenantId")
    private String tenantId;

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