package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.NamespaceDto;

public class NamespaceRespDto {
    /**
     * 权限分组详情
     */
    @JsonProperty("data")
    private NamespaceDto data;

    public NamespaceDto getData() {
        return data;
    }
    public void setData(NamespaceDto data) {
        this.data = data;
    }



}