package dto;

import dto.AuthorizedResourceDto;

public class AuthorizedResourcePagingDto {
    /**
     * 记录总数
     */
    private Int totalCount
    /**
     * 数据
     */
    private Array<AuthorizedResourceDto> list

    public Int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Int totalCount) {
        this.totalCount = totalCount;
    }

    public Array<AuthorizedResourceDto> getList() {
        return list;
    }
    public void setList(Array<AuthorizedResourceDto> list) {
        this.list = list;
    }

};