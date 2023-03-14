package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetTenantDto {
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 是否增加返回租户成员统计
     */
    @JsonProperty("withMembersCount")
    private Boolean withMembersCount;
    /**
     * 增加返回租户关联应用简单信息
     */
    @JsonProperty("withAppDetail")
    private Boolean withAppDetail;
    /**
     * 增加返回租户下创建者简单信息
     */
    @JsonProperty("withCreatorDetail")
    private Boolean withCreatorDetail;
    /**
     * 增加返回租户来源应用简单信息
     */
    @JsonProperty("withSourceAppDetail")
    private Boolean withSourceAppDetail;

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Boolean getWithMembersCount() {
        return withMembersCount;
    }
    public void setWithMembersCount(Boolean withMembersCount) {
        this.withMembersCount = withMembersCount;
    }

    public Boolean getWithAppDetail() {
        return withAppDetail;
    }
    public void setWithAppDetail(Boolean withAppDetail) {
        this.withAppDetail = withAppDetail;
    }

    public Boolean getWithCreatorDetail() {
        return withCreatorDetail;
    }
    public void setWithCreatorDetail(Boolean withCreatorDetail) {
        this.withCreatorDetail = withCreatorDetail;
    }

    public Boolean getWithSourceAppDetail() {
        return withSourceAppDetail;
    }
    public void setWithSourceAppDetail(Boolean withSourceAppDetail) {
        this.withSourceAppDetail = withSourceAppDetail;
    }



}