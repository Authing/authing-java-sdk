package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.CreateResourceBatchItemDto;

public class CreateResourcesBatchDto {
    /**
     * 资源列表
     */
    @JsonProperty("getList")
    private List<CreateResourceBatchItemDto> nase list;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("getNamespace")
    private String namespace;

    public List<CreateResourceBatchItemDto> nase getList() {
        return list;
    }
    public void setList(List<CreateResourceBatchItemDto> nase list) {
        this.list = list;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}