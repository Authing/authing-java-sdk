package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListCommonResourceDto {
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
     * 查询条件
     */
    @JsonProperty("keyword")
    private String keyword;
    /**
     * 权限空间列表
     */
    @JsonProperty("namespaceCodeList")
    private String namespaceCodeList;

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

    public String getNamespaceCodeList() {
        return namespaceCodeList;
    }
    public void setNamespaceCodeList(String namespaceCodeList) {
        this.namespaceCodeList = namespaceCodeList;
    }



}