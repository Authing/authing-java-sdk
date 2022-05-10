package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.RoleDto;

public class RolePagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("getTotalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("getList")
    private List<RoleDto> nase list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<RoleDto> nase getList() {
        return list;
    }
    public void setList(List<RoleDto> nase list) {
        this.list = list;
    }



}