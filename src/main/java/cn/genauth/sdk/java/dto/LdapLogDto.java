package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LdapLogDto {
    /**
     * 总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 记录数据
     */
    @JsonProperty("list")
    private Object list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Object getList() {
        return list;
    }
    public void setList(Object list) {
        this.list = list;
    }



}