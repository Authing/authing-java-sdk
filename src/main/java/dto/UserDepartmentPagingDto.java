package dto;

import java.util.List;

import dto.UserDepartmentRespDto;

public class UserDepartmentPagingDto {
    /**
     * 记录总数
     */
    private Integer totalCount;
    /**
     * 数据
     */
    private List<UserDepartmentRespDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UserDepartmentRespDto> getList() {
        return list;
    }
    public void setList(List<UserDepartmentRespDto> list) {
        this.list = list;
    }



};