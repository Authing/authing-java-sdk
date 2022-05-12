package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CreateNamespacesBatchItemDto;

public class CreateNamespacesBatchDto {
    /**
     * 权限分组列表
     */
    @JsonProperty("list")
    private List<CreateNamespacesBatchItemDto> list;

    public List<CreateNamespacesBatchItemDto> getList() {
        return list;
    }
    public void setList(List<CreateNamespacesBatchItemDto> list) {
        this.list = list;
    }



}