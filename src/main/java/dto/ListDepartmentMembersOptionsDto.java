package dto;


public class ListDepartmentMembersOptionsDto {
    /**
     * 当前页数，从 1 开始
     */
    private Int page
    /**
     * 每页数目，最大不能超过 100，默认为 10
     */
    private Int limit
    /**
     * 是否获取自定义数据
     */
    private Boolean withCustomData
    /**
     * 是否获取 identities
     */
    private Boolean withIdentities
    /**
     * 是否获取部门 ID 列表
     */
    private Boolean withDepartmentIds

    public Int getPage() {
        return page;
    }
    public void setPage(Int page) {
        this.page = page;
    }

    public Int getLimit() {
        return limit;
    }
    public void setLimit(Int limit) {
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

};