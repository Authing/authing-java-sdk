package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetOrganizationBatchDto {
    /**
     * 组织 Code（organizationCode）列表
     */
    @JsonProperty("organizationCodeList")
    private String organizationCodeList;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;
    /**
     * 是否获取 部门信息
     */
    @JsonProperty("withPost")
    private Boolean withPost;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getOrganizationCodeList() {
        return organizationCodeList;
    }
    public void setOrganizationCodeList(String organizationCodeList) {
        this.organizationCodeList = organizationCodeList;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }

    public Boolean getWithPost() {
        return withPost;
    }
    public void setWithPost(Boolean withPost) {
        this.withPost = withPost;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}