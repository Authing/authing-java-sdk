package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.NamespaceDto;

public class NamespaceListRespDto {
    /**
     * 权限分组列表
     */
    @JsonProperty("data")
    private List<NamespaceDto> data;

    public List<NamespaceDto> getData() {
        return data;
    }
    public void setData(List<NamespaceDto> data) {
        this.data = data;
    }



}