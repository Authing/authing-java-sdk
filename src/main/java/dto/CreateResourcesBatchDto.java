package dto;

import dto.CreateResourceBatchItemDto;

public class CreateResourcesBatchDto {
    /**
     * 资源列表
     */
    private Array<CreateResourceBatchItemDto> list
    /**
     * 所属权限分组的 code
     */
    private String namespace

    public Array<CreateResourceBatchItemDto> getList() {
        return list;
    }
    public void setList(Array<CreateResourceBatchItemDto> list) {
        this.list = list;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

};