package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DepartmentDto;

public class DepartmentPagingDto {
    /**
     * 总数
     */
    @JsonProperty("totalCount")
    private Boolean totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("list")
    private List<DepartmentDto> list;

    public Boolean getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Boolean totalCount) {
        this.totalCount = totalCount;
    }

    public List<DepartmentDto> getList() {
        return list;
    }
    public void setList(List<DepartmentDto> list) {
        this.list = list;
    }



}