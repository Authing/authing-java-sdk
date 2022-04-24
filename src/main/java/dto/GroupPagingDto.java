package dto;

import java.util.List;

import dto.ResGroupDto;

public class GroupPagingDto {
    /**
     * 记录总数
     */
    private Integer totalCount;
    /**
     * 数据
     */
    private List<ResGroupDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ResGroupDto> getList() {
        return list;
    }
    public void setList(List<ResGroupDto> list) {
        this.list = list;
    }



};