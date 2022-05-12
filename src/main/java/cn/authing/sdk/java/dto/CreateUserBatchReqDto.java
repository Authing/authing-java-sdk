package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CreateUserInfoDto;
import cn.authing.sdk.java.dto.CreateUserOptionsDto;

public class CreateUserBatchReqDto {
    /**
     * 批量用户
     */
    @JsonProperty("list")
    private List<CreateUserInfoDto> list;
    /**
     * 附加选项
     */
    @JsonProperty("options")
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