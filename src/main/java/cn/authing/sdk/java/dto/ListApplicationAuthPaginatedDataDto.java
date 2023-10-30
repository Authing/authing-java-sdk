package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ListApplicationAuthDataDto;

public class ListApplicationAuthPaginatedDataDto {
    /**
     * 列表数据
     */
    @JsonProperty("list")
    private List<ListApplicationAuthDataDto> list;
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;

    public List<ListApplicationAuthDataDto> getList() {
        return list;
    }
    public void setList(List<ListApplicationAuthDataDto> list) {
        this.list = list;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



}