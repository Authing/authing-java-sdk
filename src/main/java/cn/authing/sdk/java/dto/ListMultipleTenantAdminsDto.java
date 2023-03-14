package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListMultipleTenantAdminsDto {
    /**
     * 搜索关键字
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * 页码
     */
    @JsonProperty("page")
    private String page;
    /**
     * 每页获取的数据量
     */
    @JsonProperty("limit")
    private String limit;

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }

    public String getLimit() {
        return limit;
    }
    public void setLimit(String limit) {
        this.limit = limit;
    }



}