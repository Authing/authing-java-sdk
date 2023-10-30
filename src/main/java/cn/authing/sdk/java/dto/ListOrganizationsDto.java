package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListOrganizationsDto {
    /**
     * 当前页数，从 1 开始
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页数目，最大不能超过 50，默认为 10
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * 拉取所有
     */
    @JsonProperty("fetchAll")
    private Boolean fetchAll;
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
    /**
     * 组织的状态
     */
    @JsonProperty("status")
    private Boolean status;

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Boolean getFetchAll() {
        return fetchAll;
    }
    public void setFetchAll(Boolean fetchAll) {
        this.fetchAll = fetchAll;
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

    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }



}