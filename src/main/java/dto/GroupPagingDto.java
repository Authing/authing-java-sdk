package dto;

import dto.ResGroupDto;

public class GroupPagingDto {
    /**
     * 记录总数
     */
    private Int totalCount
    /**
     * 数据
     */
    private Array<ResGroupDto> list

    public Int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Int totalCount) {
        this.totalCount = totalCount;
    }

    public Array<ResGroupDto> getList() {
        return list;
    }
    public void setList(Array<ResGroupDto> list) {
        this.list = list;
    }

};