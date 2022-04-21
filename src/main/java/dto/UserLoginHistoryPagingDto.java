package dto;

import dto.UserLoginHistoryDto;

public class UserLoginHistoryPagingDto {
    /**
     * 记录总数
     */
    private Int totalCount
    /**
     * 数据
     */
    private Array<UserLoginHistoryDto> list

    public Int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Int totalCount) {
        this.totalCount = totalCount;
    }

    public Array<UserLoginHistoryDto> getList() {
        return list;
    }
    public void setList(Array<UserLoginHistoryDto> list) {
        this.list = list;
    }

};