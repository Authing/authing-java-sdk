package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FunctionModelValueListDto {
    /**
     * 总行数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("list")
    private List<Object> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Object> getList() {
        return list;
    }
    public void setList(List<Object> list) {
        this.list = list;
    }



}