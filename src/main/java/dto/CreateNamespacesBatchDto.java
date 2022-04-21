package dto;

import dto.CreateNamespacesBatchItemDto;

public class CreateNamespacesBatchDto {
    /**
     * 权限分组列表
     */
    private Array<CreateNamespacesBatchItemDto> list

    public Array<CreateNamespacesBatchItemDto> getList() {
        return list;
    }
    public void setList(Array<CreateNamespacesBatchItemDto> list) {
        this.list = list;
    }

};