package dto;

import java.util.List;

import dto.RoleDto;

public class RolePagingDto {
    /**
     * 记录总数
     */
    private Integer totalCount;
    /**
     * 数据
     */
    private List<RoleDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<RoleDto> getList() {
        return list;
    }
    public void setList(List<RoleDto> list) {
        this.list = list;
    }



};