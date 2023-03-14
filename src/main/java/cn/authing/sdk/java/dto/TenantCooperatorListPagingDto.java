package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.TenantCooperatorDto;

public class TenantCooperatorListPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("list")
    private List<TenantCooperatorDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<TenantCooperatorDto> getList() {
        return list;
    }
    public void setList(List<TenantCooperatorDto> list) {
        this.list = list;
    }



}