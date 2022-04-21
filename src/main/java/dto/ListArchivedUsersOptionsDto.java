package dto;


public class ListArchivedUsersOptionsDto {
    /**
     * 当前页数，从 1 开始
     */
    private Int page
    /**
     * 每页数目，最大不能超过 100，默认为 10
     */
    private Int limit

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

};