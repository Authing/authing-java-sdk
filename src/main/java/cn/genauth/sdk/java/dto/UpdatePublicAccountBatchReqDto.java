package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdatePublicAccountBatchReqDto {
    /**
     * 公共账号列表
     */
    @JsonProperty("list")
    private List<UpdatePublicAccountInfoDto> list;
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private UpdatePublicAccountBatchOptionsDto options;

    public List<UpdatePublicAccountInfoDto> getList() {
        return list;
    }
    public void setList(List<UpdatePublicAccountInfoDto> list) {
        this.list = list;
    }

    public UpdatePublicAccountBatchOptionsDto getOptions() {
        return options;
    }
    public void setOptions(UpdatePublicAccountBatchOptionsDto options) {
        this.options = options;
    }



}