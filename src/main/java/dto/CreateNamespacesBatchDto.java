package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.CreateNamespacesBatchItemDto;

public class CreateNamespacesBatchDto {
    /**
     * 权限分组列表
     */
    @JsonProperty("getList")
    private List<CreateNamespacesBatchItemDto> nase list;

    public List<CreateNamespacesBatchItemDto> nase getList() {
        return list;
    }
    public void setList(List<CreateNamespacesBatchItemDto> nase list) {
        this.list = list;
    }



}