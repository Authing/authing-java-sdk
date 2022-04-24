package dto;

import java.util.List;

import dto.CreateNamespacesBatchItemDto;

public class CreateNamespacesBatchDto {
    /**
     * 权限分组列表
     */
    private List<CreateNamespacesBatchItemDto> list;

    public List<CreateNamespacesBatchItemDto> getList() {
        return list;
    }
    public void setList(List<CreateNamespacesBatchItemDto> list) {
        this.list = list;
    }



};