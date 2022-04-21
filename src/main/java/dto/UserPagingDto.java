package dto;

import dto.UserDto;

public class UserPagingDto {
    /**
     * 记录总数
     */
    private Int totalCount
    /**
     * 数据
     */
    private Array<UserDto> list

    public Int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Int totalCount) {
        this.totalCount = totalCount;
    }

    public Array<UserDto> getList() {
        return list;
    }
    public void setList(Array<UserDto> list) {
        this.list = list;
    }

};