package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListArchivedUsersDto {
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
     * 开始时间，为精确到秒的 UNIX 时间戳，默认不指定
     */
    @JsonProperty("startAt")
    private Integer startAt;

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

    public Integer getStartAt() {
        return startAt;
    }
    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }



}