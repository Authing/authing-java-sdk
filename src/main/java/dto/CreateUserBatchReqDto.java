package dto;

import java.util.List;

import dto.CreateUserInfoDto;
import dto.CreateUserOptionsDto;

public class CreateUserBatchReqDto {
    /**
     * 批量用户
     */
    private List<CreateUserInfoDto> list;
    /**
     * 附加选项
     */
    private CreateUserOptionsDto options;

    public List<CreateUserInfoDto> getList() {
        return list;
    }
    public void setList(List<CreateUserInfoDto> list) {
        this.list = list;
    }

    public CreateUserOptionsDto getOptions() {
        return options;
    }
    public void setOptions(CreateUserOptionsDto options) {
        this.options = options;
    }



}