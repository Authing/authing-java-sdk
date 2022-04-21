package dto;

import dto.CreateUserInfoDto;
import dto.CreateUserOptionsDto;

public class CreateUserBatchReqDto {
    /**
     * 批量用户
     */
    private Array<CreateUserInfoDto> list
    /**
     * 附加选项
     */
    private CreateUserOptionsDto options

    public Array<CreateUserInfoDto> getList() {
        return list;
    }
    public void setList(Array<CreateUserInfoDto> list) {
        this.list = list;
    }

    public CreateUserOptionsDto getOptions() {
        return options;
    }
    public void setOptions(CreateUserOptionsDto options) {
        this.options = options;
    }

};