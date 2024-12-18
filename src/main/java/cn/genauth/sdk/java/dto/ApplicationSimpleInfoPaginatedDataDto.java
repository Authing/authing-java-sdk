package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationSimpleInfoPaginatedDataDto {
    /**
     * 列表数据
     */
    @JsonProperty("list")
    private List<ApplicationSimpleInfoDto> list;
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;

    public List<ApplicationSimpleInfoDto> getList() {
        return list;
    }
    public void setList(List<ApplicationSimpleInfoDto> list) {
        this.list = list;
    }

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }



}