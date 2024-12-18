package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ImportOtpReqDto {
    /**
     * 参数列表
     */
    @JsonProperty("list")
    private List<ImportOtpItemDto> list;

    public List<ImportOtpItemDto> getList() {
        return list;
    }
    public void setList(List<ImportOtpItemDto> list) {
        this.list = list;
    }



}