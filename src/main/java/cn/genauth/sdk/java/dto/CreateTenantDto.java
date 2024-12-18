package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateTenantDto {
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
    /**
     * 企业邮箱域名
     */
    @JsonProperty("enterpriseDomains")
    private List<String> enterpriseDomains;
    /**
     * 租户过期时间
     */
    @JsonProperty("expireTime")
    private String expireTime;
    /**
     * 租户 MAU 上限
     */
    @JsonProperty("mauAmount")
    private Integer mauAmount;
    /**
     * 租户成员上限
     */
    @JsonProperty("memberAmount")
    private Integer memberAmount;
    /**
     * 租户管理员上限
     */
    @JsonProperty("adminAmount")
    private Integer adminAmount;

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

    public List<String> getEnterpriseDomains() {
        return enterpriseDomains;
    }
    public void setEnterpriseDomains(List<String> enterpriseDomains) {
        this.enterpriseDomains = enterpriseDomains;
    }

    public String getExpireTime() {
        return expireTime;
    }
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getMauAmount() {
        return mauAmount;
    }
    public void setMauAmount(Integer mauAmount) {
        this.mauAmount = mauAmount;
    }

    public Integer getMemberAmount() {
        return memberAmount;
    }
    public void setMemberAmount(Integer memberAmount) {
        this.memberAmount = memberAmount;
    }

    public Integer getAdminAmount() {
        return adminAmount;
    }
    public void setAdminAmount(Integer adminAmount) {
        this.adminAmount = adminAmount;
    }



}