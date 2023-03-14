package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.PaginationDto;

public class ListTenantUsersOptionsDto {
    /**
     * 分页配置
     */
    @JsonProperty("pagination")
    private PaginationDto pagination;

    public PaginationDto getPagination() {
        return pagination;
    }
    public void setPagination(PaginationDto pagination) {
        this.pagination = pagination;
    }



}