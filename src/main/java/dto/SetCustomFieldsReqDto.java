package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.SetCustomFieldDto;

public class SetCustomFieldsReqDto {
    /**
     * 扩展字段列表
     */
    @JsonProperty("getList")
    private List<SetCustomFieldDto> nase list;

    public List<SetCustomFieldDto> nase getList() {
        return list;
    }
    public void setList(List<SetCustomFieldDto> nase list) {
        this.list = list;
    }



}