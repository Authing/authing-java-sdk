package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchDepartmentMembersDto {
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 部门 ID，根部门传 `root`
     */
    @JsonProperty("departmentId")
    private String departmentId;
    /**
     * 搜索关键词，如成员名称
     */
    @JsonProperty("keywords")
    private String keywords;
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
     * 此次调用中使用的部门 ID 的类型
     */
    @JsonProperty("departmentIdType")
    private String departmentIdType;
    /**
     * 是否包含子部门的成员
     */
    @JsonProperty("includeChildrenDepartments")
    private Boolean includeChildrenDepartments;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;
    /**
     * 是否获取 identities
     */
    @JsonProperty("withIdentities")
    private Boolean withIdentities;
    /**
     * 是否获取部门 ID 列表
     */
    @JsonProperty("withDepartmentIds")
    private Boolean withDepartmentIds;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

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

    public String getDepartmentIdType() {
        return departmentIdType;
    }
    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public Boolean getIncludeChildrenDepartments() {
        return includeChildrenDepartments;
    }
    public void setIncludeChildrenDepartments(Boolean includeChildrenDepartments) {
        this.includeChildrenDepartments = includeChildrenDepartments;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }

    public Boolean getWithIdentities() {
        return withIdentities;
    }
    public void setWithIdentities(Boolean withIdentities) {
        this.withIdentities = withIdentities;
    }

    public Boolean getWithDepartmentIds() {
        return withDepartmentIds;
    }
    public void setWithDepartmentIds(Boolean withDepartmentIds) {
        this.withDepartmentIds = withDepartmentIds;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}