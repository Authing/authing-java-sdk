package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

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