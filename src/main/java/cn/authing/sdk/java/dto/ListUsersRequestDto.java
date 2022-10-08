package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ListUsersAdvancedFilterItemDto;
import cn.authing.sdk.java.dto.ListUsersOptionsDto;

public class ListUsersRequestDto {
    /**
     * 模糊搜索关键字
     */
    @JsonProperty("query")
    private String query;
    /**
     * 高级搜索
     */
    @JsonProperty("advancedFilter")
    private List<ListUsersAdvancedFilterItemDto> advancedFilter;
    /**
     * 可选项
     */
    @JsonProperty("options")
    private ListUsersOptionsDto options;

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public List<ListUsersAdvancedFilterItemDto> getAdvancedFilter() {
        return advancedFilter;
    }
    public void setAdvancedFilter(List<ListUsersAdvancedFilterItemDto> advancedFilter) {
        this.advancedFilter = advancedFilter;
    }

    public ListUsersOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListUsersOptionsDto options) {
        this.options = options;
    }



}