package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePublicAccountBatchReqDto {
    /**
     * 公共账号列表
     */
    @JsonProperty("list")
    private List<CreatePublicAccountReqDto> list;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private CreatePublicAccountOptionsDto options;

    public List<CreatePublicAccountReqDto> getList() {
        return list;
    }
    public void setList(List<CreatePublicAccountReqDto> list) {
        this.list = list;
    }

    public CreatePublicAccountOptionsDto getOptions() {
        return options;
    }
    public void setOptions(CreatePublicAccountOptionsDto options) {
        this.options = options;
    }



}