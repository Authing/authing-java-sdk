package dto;

import dto.NamespaceDto;

public class NamespaceListRespDto {
    /**
     * 权限分组列表
     */
    private Array<NamespaceDto> data

    public Array<NamespaceDto> getData() {
        return data;
    }
    public void setData(Array<NamespaceDto> data) {
        this.data = data;
    }

};