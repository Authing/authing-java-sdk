package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SetUserBaseFieldDto;

public class SetUserBaseFieldsReqDto {
    /**
     * 自定义字段列表
     */
    @JsonProperty("list")
    private List<SetUserBaseFieldDto> list;

    public List<SetUserBaseFieldDto> getList() {
        return list;
    }
    public void setList(List<SetUserBaseFieldDto> list) {
        this.list = list;
    }



}