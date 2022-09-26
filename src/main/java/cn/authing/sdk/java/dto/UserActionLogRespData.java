package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.UserActionLogDto;

public class UserActionLogRespData {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 返回列表
     */
    @JsonProperty("list")
    private List<UserActionLogDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UserActionLogDto> getList() {
        return list;
    }
    public void setList(List<UserActionLogDto> list) {
        this.list = list;
    }



}