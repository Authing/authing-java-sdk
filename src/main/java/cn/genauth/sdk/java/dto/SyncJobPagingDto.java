package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SyncJobPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 数据列表
     */
    @JsonProperty("list")
    private List<SyncJobDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<SyncJobDto> getList() {
        return list;
    }
    public void setList(List<SyncJobDto> list) {
        this.list = list;
    }



}