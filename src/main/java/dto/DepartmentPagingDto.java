package dto;

import java.util.List;

import dto.DepartmentDto;

public class DepartmentPagingDto {
    /**
     * 记录总数
     */
    private Integer totalCount;
    /**
     * 数据
     */
    private List<DepartmentDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<DepartmentDto> getList() {
        return list;
    }
    public void setList(List<DepartmentDto> list) {
        this.list = list;
    }



}