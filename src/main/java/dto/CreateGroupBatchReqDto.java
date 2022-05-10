package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.CreateGroupReqDto;

public class CreateGroupBatchReqDto {
    /**
     * 批量分组
     */
    @JsonProperty("getList")
    private List<CreateGroupReqDto> nase list;

    public List<CreateGroupReqDto> nase getList() {
        return list;
    }
    public void setList(List<CreateGroupReqDto> nase list) {
        this.list = list;
    }



}