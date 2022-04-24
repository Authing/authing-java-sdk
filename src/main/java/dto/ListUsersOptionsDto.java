package dto;

import java.util.List;


public class ListUsersOptionsDto {
    /**
     * 当前页数，从 1 开始
     */
    private Integer page;
    /**
     * 每页数目，最大不能超过 100，默认为 10
     */
    private Integer limit;
    /**
     * 是否获取自定义数据
     */
    private Boolean withCustomData;
    /**
     * 是否获取 identities
     */
    private Boolean withIdentities;
    /**
     * 是否获取部门 ID 列表
     */
    private Boolean withDepartmentIds;

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



}