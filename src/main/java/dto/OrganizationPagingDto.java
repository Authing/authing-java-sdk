package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.OrganizationDto;

public class OrganizationPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("getTotalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("getList")
    private List<OrganizationDto> nase list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<OrganizationDto> nase getList() {
        return list;
    }
    public void setList(List<OrganizationDto> nase list) {
        this.list = list;
    }



}