package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.AuthorizedResourceDto;

public class AuthorizedResourcePagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("getTotalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("getList")
    private List<AuthorizedResourceDto> nase list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<AuthorizedResourceDto> nase getList() {
        return list;
    }
    public void setList(List<AuthorizedResourceDto> nase list) {
        this.list = list;
    }



}