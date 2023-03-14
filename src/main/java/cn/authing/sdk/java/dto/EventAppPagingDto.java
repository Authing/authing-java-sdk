package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.EventAppDto;

public class EventAppPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 数据列表
     */
    @JsonProperty("list")
    private List<EventAppDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<EventAppDto> getList() {
        return list;
    }
    public void setList(List<EventAppDto> list) {
        this.list = list;
    }



}