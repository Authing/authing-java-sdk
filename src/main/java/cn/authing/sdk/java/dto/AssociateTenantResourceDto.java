package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssociateTenantResourceDto {
    /**
     * 资源 Code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 是否关联应用资源
     */
    @JsonProperty("association")
    private Boolean association;
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

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getAssociation() {
        return association;
    }
    public void setAssociation(Boolean association) {
        this.association = association;
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



}