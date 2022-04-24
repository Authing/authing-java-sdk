package dto;

import java.util.List;

import dto.UserDto;

public class UserPagingDto {
    /**
     * 记录总数
     */
    private Integer totalCount;
    /**
     * 数据
     */
    private List<UserDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UserDto> getList() {
        return list;
    }
    public void setList(List<UserDto> list) {
        this.list = list;
    }



};