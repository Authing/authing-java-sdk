package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DataPoliciesSimplePaginatedRespDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("list")
    private List<ListSimpleDataPoliciesRespDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ListSimpleDataPoliciesRespDto> getList() {
        return list;
    }
    public void setList(List<ListSimpleDataPoliciesRespDto> list) {
        this.list = list;
    }



}