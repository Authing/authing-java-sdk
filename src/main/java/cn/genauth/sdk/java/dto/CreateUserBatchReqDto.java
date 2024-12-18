package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserBatchReqDto {
    /**
     * 用户列表
     */
    @JsonProperty("list")
    private List<CreateUserInfoDto> list;
    /**
     * 可选参数
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