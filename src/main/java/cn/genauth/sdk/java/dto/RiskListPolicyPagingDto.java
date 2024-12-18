package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RiskListPolicyPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 数据列表
     */
    @JsonProperty("list")
    private List<RiskListPolicyRespDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<RiskListPolicyRespDto> getList() {
        return list;
    }
    public void setList(List<RiskListPolicyRespDto> list) {
        this.list = list;
    }



}