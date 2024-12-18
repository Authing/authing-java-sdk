package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResourceAuthorizedTargetDataDto {
    /**
     * 总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 元素列表
     */
    @JsonProperty("list")
    private List<ResourceAuthorizedTargetDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ResourceAuthorizedTargetDto> getList() {
        return list;
    }
    public void setList(List<ResourceAuthorizedTargetDto> list) {
        this.list = list;
    }



}