package dto;

import dto.OrganizationDto;

public class OrganizationPagingDto {
    /**
     * 记录总数
     */
    private Int totalCount
    /**
     * 数据
     */
    private Array<OrganizationDto> list

    public Int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Int totalCount) {
        this.totalCount = totalCount;
    }

    public Array<OrganizationDto> getList() {
        return list;
    }
    public void setList(Array<OrganizationDto> list) {
        this.list = list;
    }

};