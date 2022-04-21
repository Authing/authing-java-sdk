package dto;

import dto.PrincipalAuthenticationInfoDto;

public class PrincipalAuthenticationInfoPagingDto {
    /**
     * 记录总数
     */
    private Int totalCount
    /**
     * 数据
     */
    private Array<PrincipalAuthenticationInfoDto> list

    public Int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Int totalCount) {
        this.totalCount = totalCount;
    }

    public Array<PrincipalAuthenticationInfoDto> getList() {
        return list;
    }
    public void setList(Array<PrincipalAuthenticationInfoDto> list) {
        this.list = list;
    }

};