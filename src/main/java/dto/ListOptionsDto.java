package dto;

import java.util.List;


public class ListOptionsDto {
    /**
     * 当前页数，从 1 开始
     */
    private Integer page;
    /**
     * 每页数目，最大不能超过 100，默认为 10
     */
    private Integer limit;

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



};