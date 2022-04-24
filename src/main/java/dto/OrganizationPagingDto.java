package dto;

import java.util.List;

import dto.OrganizationDto;

public class OrganizationPagingDto {
    /**
     * 记录总数
     */
    private Integer totalCount;
    /**
     * 数据
     */
    private List<OrganizationDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<OrganizationDto> getList() {
        return list;
    }
    public void setList(List<OrganizationDto> list) {
        this.list = list;
    }



};