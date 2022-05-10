package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.CreateUserInfoDto;
import dto.CreateUserOptionsDto;

public class CreateUserBatchReqDto {
    /**
     * 批量用户
     */
    @JsonProperty("getList")
    private List<CreateUserInfoDto> nase list;
    /**
     * 附加选项
     */
    @JsonProperty("getOptions")
    private CreateUserOptionsDto options;

    public List<CreateUserInfoDto> nase getList() {
        return list;
    }
    public void setList(List<CreateUserInfoDto> nase list) {
        this.list = list;
    }

    public CreateUserOptionsDto getOptions() {
        return options;
    }
    public void setOptions(CreateUserOptionsDto options) {
        this.options = options;
    }



}