package dto;

import java.util.List;

import dto.UserLoginHistoryDto;

public class UserLoginHistoryPagingDto {
    /**
     * 记录总数
     */
    private Integer totalCount;
    /**
     * 数据
     */
    private List<UserLoginHistoryDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UserLoginHistoryDto> getList() {
        return list;
    }
    public void setList(List<UserLoginHistoryDto> list) {
        this.list = list;
    }



}