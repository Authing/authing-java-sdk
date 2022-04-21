package dto;

import dto.DepartmentDto;

public class DepartmentPagingDto {
    /**
     * 记录总数
     */
    private Int totalCount
    /**
     * 数据
     */
    private Array<DepartmentDto> list

    public Int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Int totalCount) {
        this.totalCount = totalCount;
    }

    public Array<DepartmentDto> getList() {
        return list;
    }
    public void setList(Array<DepartmentDto> list) {
        this.list = list;
    }

};