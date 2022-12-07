package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CreateAsaAccountsBatchItemDto;

public class CreateAsaAccountsBatchDto {
    /**
     * 账号列表
     */
    @JsonProperty("list")
    private List<CreateAsaAccountsBatchItemDto> list;
    /**
     * 所属应用 ID
     */
    @JsonProperty("appId")
    private String appId;

    public List<CreateAsaAccountsBatchItemDto> getList() {
        return list;
    }
    public void setList(List<CreateAsaAccountsBatchItemDto> list) {
        this.list = list;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}