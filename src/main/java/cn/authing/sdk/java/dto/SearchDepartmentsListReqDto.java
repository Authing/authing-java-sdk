package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DepartmentSortingDto;
import cn.authing.sdk.java.dto.SearchDepartmentsFilterItemDto;

public class SearchDepartmentsListReqDto {
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
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
     * 高级搜索
     */
    @JsonProperty("advancedFilter")
    private List<SearchDepartmentsFilterItemDto> advancedFilter;
    /**
     * 排序依据，如 更新时间或创建时间
     */
    @JsonProperty("sortBy")
    private SortBy sortBy;
    /**
     * 增序或降序
     */
    @JsonProperty("orderBy")
    private OrderBy orderBy;
    /**
     * 排序设置，可以设置多项按照多个字段进行排序
     */
    @JsonProperty("sort")
    private List<DepartmentSortingDto> sort;
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

    public List<SearchDepartmentsFilterItemDto> getAdvancedFilter() {
        return advancedFilter;
    }
    public void setAdvancedFilter(List<SearchDepartmentsFilterItemDto> advancedFilter) {
        this.advancedFilter = advancedFilter;
    }

    public SortBy getSortBy() {
        return sortBy;
    }
    public void setSortBy(SortBy sortBy) {
        this.sortBy = sortBy;
    }

    public OrderBy getOrderBy() {
        return orderBy;
    }
    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    public List<DepartmentSortingDto> getSort() {
        return sort;
    }
    public void setSort(List<DepartmentSortingDto> sort) {
        this.sort = sort;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }


    /**
     * 排序依据，如 更新时间或创建时间
     */
    public static enum SortBy {

        @JsonProperty("updatedAt")
        UPDATED_AT("updatedAt"),

        @JsonProperty("createdAt")
        CREATED_AT("createdAt"),
        ;

        private String value;

        SortBy(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 增序或降序
     */
    public static enum OrderBy {

        @JsonProperty("ASC")
        ASC("ASC"),

        @JsonProperty("DESC")
        DESC("DESC"),
        ;

        private String value;

        OrderBy(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}