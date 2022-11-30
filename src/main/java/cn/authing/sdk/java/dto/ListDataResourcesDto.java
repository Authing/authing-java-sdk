package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListDataResourcesDto {
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
     * 关键字搜索，可以是数据资源名称或者数据资源 Code
     */
    @JsonProperty("query")
    private String query;
    /**
     * 权限数据所属权限空间 Code 列表
     */
    @JsonProperty("namespaceCodes")
    private String namespaceCodes;

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

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public String getNamespaceCodes() {
        return namespaceCodes;
    }
    public void setNamespaceCodes(String namespaceCodes) {
        this.namespaceCodes = namespaceCodes;
    }



}