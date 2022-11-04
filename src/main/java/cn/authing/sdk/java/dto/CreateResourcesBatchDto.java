package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CreateResourceBatchItemDto;

public class CreateResourcesBatchDto {
    /**
     * 资源列表
     */
    @JsonProperty("list")
    private List<CreateResourceBatchItemDto> list;
    /**
     * 所属权限分组(权限空间)的 Code
     */
    @JsonProperty("namespace")
    private String namespace;

    public List<CreateResourceBatchItemDto> getList() {
        return list;
    }
    public void setList(List<CreateResourceBatchItemDto> list) {
        this.list = list;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}