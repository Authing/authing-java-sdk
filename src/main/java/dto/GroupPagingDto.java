package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.ResGroupDto;

public class GroupPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("getTotalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("getList")
    private List<ResGroupDto> nase list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ResGroupDto> nase getList() {
        return list;
    }
    public void setList(List<ResGroupDto> nase list) {
        this.list = list;
    }



}