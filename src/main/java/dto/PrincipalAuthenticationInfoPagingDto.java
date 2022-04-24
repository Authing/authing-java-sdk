package dto;

import java.util.List;

import dto.PrincipalAuthenticationInfoDto;

public class PrincipalAuthenticationInfoPagingDto {
    /**
     * 记录总数
     */
    private Integer totalCount;
    /**
     * 数据
     */
    private List<PrincipalAuthenticationInfoDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<PrincipalAuthenticationInfoDto> getList() {
        return list;
    }
    public void setList(List<PrincipalAuthenticationInfoDto> list) {
        this.list = list;
    }



}