package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CreateGroupReqDto;

public class CreateGroupBatchReqDto {
    /**
     * 批量分组
     */
    @JsonProperty("list")
    private List<CreateGroupReqDto> list;

    public List<CreateGroupReqDto> getList() {
        return list;
    }
    public void setList(List<CreateGroupReqDto> list) {
        this.list = list;
    }



}