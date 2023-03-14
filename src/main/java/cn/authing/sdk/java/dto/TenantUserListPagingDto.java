package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.TenantUserDto;

public class TenantUserListPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("list")
    private List<TenantUserDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<TenantUserDto> getList() {
        return list;
    }
    public void setList(List<TenantUserDto> list) {
        this.list = list;
    }



}