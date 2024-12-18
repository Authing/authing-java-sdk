package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPublicAccountsRequestDto {
    /**
     * 模糊搜索关键字
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * 高级搜索
     */
    @JsonProperty("advancedFilter")
    private List<ListPublicAccountsAdvancedFilterItemDto> advancedFilter;
    /**
     * 使用 ES 查询语句执行搜索命令
     */
    @JsonProperty("searchQuery")
    private Object searchQuery;
    /**
     * 可选项
     */
    @JsonProperty("options")
    private ListPublicAccountsOptionsDto options;

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public List<ListPublicAccountsAdvancedFilterItemDto> getAdvancedFilter() {
        return advancedFilter;
    }
    public void setAdvancedFilter(List<ListPublicAccountsAdvancedFilterItemDto> advancedFilter) {
        this.advancedFilter = advancedFilter;
    }

    public Object getSearchQuery() {
        return searchQuery;
    }
    public void setSearchQuery(Object searchQuery) {
        this.searchQuery = searchQuery;
    }

    public ListPublicAccountsOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListPublicAccountsOptionsDto options) {
        this.options = options;
    }



}