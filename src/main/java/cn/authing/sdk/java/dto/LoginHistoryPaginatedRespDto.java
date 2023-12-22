package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.LoginHistoryDto;

public class LoginHistoryPaginatedRespDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 记录列表
     */
    @JsonProperty("list")
    private List<LoginHistoryDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<LoginHistoryDto> getList() {
        return list;
    }
    public void setList(List<LoginHistoryDto> list) {
        this.list = list;
    }



}