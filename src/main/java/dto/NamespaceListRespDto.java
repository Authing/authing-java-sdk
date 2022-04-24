package dto;

import java.util.List;

import dto.NamespaceDto;

public class NamespaceListRespDto {
    /**
     * 权限分组列表
     */
    private List<NamespaceDto> data;

    public List<NamespaceDto> getData() {
        return data;
    }
    public void setData(List<NamespaceDto> data) {
        this.data = data;
    }



}