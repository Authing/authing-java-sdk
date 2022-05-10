package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.DepartmentDto;

public class DepartmentPagingDto {
    /**
     * 总数
     */
    @JsonProperty("getTotalCount")
    private Boolean totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("getList")
    private List<DepartmentDto> nase list;

    public Boolean getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Boolean totalCount) {
        this.totalCount = totalCount;
    }

    public List<DepartmentDto> nase getList() {
        return list;
    }
    public void setList(List<DepartmentDto> nase list) {
        this.list = list;
    }



}