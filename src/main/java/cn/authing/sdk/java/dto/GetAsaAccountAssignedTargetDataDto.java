package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.AsaAccountTargetDto;

public class GetAsaAccountAssignedTargetDataDto {
    /**
     * 总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 主体列表
     */
    @JsonProperty("list")
    private List<AsaAccountTargetDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<AsaAccountTargetDto> getList() {
        return list;
    }
    public void setList(List<AsaAccountTargetDto> list) {
        this.list = list;
    }



}