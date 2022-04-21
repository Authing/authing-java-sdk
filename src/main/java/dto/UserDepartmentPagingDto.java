package dto;

import dto.UserDepartmentRespDto;

public class UserDepartmentPagingDto {
    /**
     * 记录总数
     */
    private Int totalCount
    /**
     * 数据
     */
    private Array<UserDepartmentRespDto> list

    public Int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Int totalCount) {
        this.totalCount = totalCount;
    }

    public Array<UserDepartmentRespDto> getList() {
        return list;
    }
    public void setList(Array<UserDepartmentRespDto> list) {
        this.list = list;
    }

};