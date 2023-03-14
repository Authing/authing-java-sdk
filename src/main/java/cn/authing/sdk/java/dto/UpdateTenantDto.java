package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateTenantDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 租户名
     */
    @JsonProperty("name")
    private String name;
    /**
     * 租户关联的应用 ID
     */
    @JsonProperty("appIds")
    private List<String> appIds;
    /**
     * 租户 logo
     */
    @JsonProperty("logo")
    private List<String> logo;
    /**
     * 租户描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 用户被租户拒绝登录时显示的提示文案
     */
    @JsonProperty("rejectHint")
    private String rejectHint;
    /**
     * 租户来源的应用 ID，该值不存在时代表租户来源为 Authing 控制台
     */
    @JsonProperty("sourceAppId")
    private String sourceAppId;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAppIds() {
        return appIds;
    }
    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public List<String> getLogo() {
        return logo;
    }
    public void setLogo(List<String> logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getRejectHint() {
        return rejectHint;
    }
    public void setRejectHint(String rejectHint) {
        this.rejectHint = rejectHint;
    }

    public String getSourceAppId() {
        return sourceAppId;
    }
    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }



}