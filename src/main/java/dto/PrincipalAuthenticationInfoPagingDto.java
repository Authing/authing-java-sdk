package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.PrincipalAuthenticationInfoDto;

public class PrincipalAuthenticationInfoPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("getTotalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("getList")
    private List<PrincipalAuthenticationInfoDto> nase list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<PrincipalAuthenticationInfoDto> nase getList() {
        return list;
    }
    public void setList(List<PrincipalAuthenticationInfoDto> nase list) {
        this.list = list;
    }



}