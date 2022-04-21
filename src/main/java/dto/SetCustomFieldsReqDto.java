package dto;

import dto.SetCustomFieldDto;

public class SetCustomFieldsReqDto {
    /**
     * 扩展字段列表
     */
    private Array<SetCustomFieldDto> list

    public Array<SetCustomFieldDto> getList() {
        return list;
    }
    public void setList(Array<SetCustomFieldDto> list) {
        this.list = list;
    }

};