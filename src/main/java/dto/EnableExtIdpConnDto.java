package dto;

import java.util.List;


public class EnableExtIdpConnDto {
    /**
     * 租户 ID
     */
    private String tenantId;
    /**
     * 应用 ID
     */
    private String appId;
    /**
     * 是否开启身份源连接
     */
    private Boolean enabled;
    /**
     * 连接 ID
     */
    private String id;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
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



};