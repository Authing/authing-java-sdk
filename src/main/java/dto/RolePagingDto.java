package dto;

import dto.RoleDto;

public class RolePagingDto {
    /**
     * 记录总数
     */
    private Int totalCount
    /**
     * 数据
     */
    private Array<RoleDto> list

    public Int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Int totalCount) {
        this.totalCount = totalCount;
    }

    public Array<RoleDto> getList() {
        return list;
    }
    public void setList(Array<RoleDto> list) {
        this.list = list;
    }

};