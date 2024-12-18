package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListTenantUsersOptionsDto {
    /**
     * 分页配置
     */
    @JsonProperty("pagination")
    private PaginationDto pagination;
    /**
     * 是否获取部门 ID 列表
     */
    @JsonProperty("withDepartmentIds")
    private Boolean withDepartmentIds;

    public PaginationDto getPagination() {
        return pagination;
    }
    public void setPagination(PaginationDto pagination) {
        this.pagination = pagination;
    }


    public Boolean getWithDepartmentIds() {
        return withDepartmentIds;
    }

    public void setWithDepartmentIds(Boolean withDepartmentIds) {
        this.withDepartmentIds = withDepartmentIds;
    }
}