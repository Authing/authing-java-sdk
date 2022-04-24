package dto;

import java.util.List;

import dto.CreateResourceBatchItemDto;

public class CreateResourcesBatchDto {
    /**
     * 资源列表
     */
    private List<CreateResourceBatchItemDto> list;
    /**
     * 所属权限分组的 code
     */
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



};