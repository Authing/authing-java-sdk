package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListPermissionViewDto {
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
     * 关键字搜索,可以支持 userName 搜索
     */
    @JsonProperty("keyword")
    private String keyword;

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

    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }



}