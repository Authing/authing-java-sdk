package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationPaginatedDataDto {
    /**
     * 列表数据
     */
    @JsonProperty("list")
    private List<ApplicationDto> list;
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;

    public List<ApplicationDto> getList() {
        return list;
    }
    public void setList(List<ApplicationDto> list) {
        this.list = list;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



}