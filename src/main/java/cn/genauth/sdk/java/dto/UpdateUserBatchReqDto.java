package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateUserBatchReqDto {
    /**
     * 用户列表
     */
    @JsonProperty("list")
    private List<UpdateUserInfoDto> list;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private UpdateUserBatchOptionsDto options;

    public List<UpdateUserInfoDto> getList() {
        return list;
    }
    public void setList(List<UpdateUserInfoDto> list) {
        this.list = list;
    }

    public UpdateUserBatchOptionsDto getOptions() {
        return options;
    }
    public void setOptions(UpdateUserBatchOptionsDto options) {
        this.options = options;
    }



}