package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OpenEventPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 数据列表
     */
    @JsonProperty("list")
    private List<OpenEventDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<OpenEventDto> getList() {
        return list;
    }
    public void setList(List<OpenEventDto> list) {
        this.list = list;
    }



}