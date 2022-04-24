package dto;

import java.util.List;

import dto.AuthorizedResourceDto;

public class AuthorizedResourcePagingDto {
    /**
     * 记录总数
     */
    private Integer totalCount;
    /**
     * 数据
     */
    private List<AuthorizedResourceDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<AuthorizedResourceDto> getList() {
        return list;
    }
    public void setList(List<AuthorizedResourceDto> list) {
        this.list = list;
    }



};