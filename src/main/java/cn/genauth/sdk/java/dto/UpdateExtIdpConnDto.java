package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateExtIdpConnDto {
    /**
     * 身份源连接 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 身份源连接显示名称
     */
    @JsonProperty("displayName")
    private String displayName;
    /**
     * 身份源连接自定义参数（增量修改）
     */
    @JsonProperty("fields")
    private Object fields;
    /**
     * 身份源连接的图标
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 是否只支持登录
     */
    @JsonProperty("loginOnly")
    private Boolean loginOnly;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Object getFields() {
        return fields;
    }
    public void setFields(Object fields) {
        this.fields = fields;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getLoginOnly() {
        return loginOnly;
    }
    public void setLoginOnly(Boolean loginOnly) {
        this.loginOnly = loginOnly;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}