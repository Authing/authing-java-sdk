package dto;

import dto.CreateGroupReqDto;

public class CreateGroupBatchReqDto {
    /**
     * 批量分组
     */
    private Array<CreateGroupReqDto> list

    public Array<CreateGroupReqDto> getList() {
        return list;
    }
    public void setList(Array<CreateGroupReqDto> list) {
        this.list = list;
    }

};