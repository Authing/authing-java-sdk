package dto;

import java.util.List;

import dto.CreateGroupReqDto;

public class CreateGroupBatchReqDto {
    /**
     * 批量分组
     */
    private List<CreateGroupReqDto> list;

    public List<CreateGroupReqDto> getList() {
        return list;
    }
    public void setList(List<CreateGroupReqDto> list) {
        this.list = list;
    }



}