package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListApplicationSubjectDataListDto {
    /**
     * 列表数据
     */
    @JsonProperty("list")
    private List<ListApplicationSubjectDataDto> list;

    public List<ListApplicationSubjectDataDto> getList() {
        return list;
    }
    public void setList(List<ListApplicationSubjectDataDto> list) {
        this.list = list;
    }



}