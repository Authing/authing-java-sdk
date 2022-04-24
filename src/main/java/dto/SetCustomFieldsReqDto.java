package dto;

import java.util.List;

import dto.SetCustomFieldDto;

public class SetCustomFieldsReqDto {
    /**
     * 扩展字段列表
     */
    private List<SetCustomFieldDto> list;

    public List<SetCustomFieldDto> getList() {
        return list;
    }
    public void setList(List<SetCustomFieldDto> list) {
        this.list = list;
    }



};