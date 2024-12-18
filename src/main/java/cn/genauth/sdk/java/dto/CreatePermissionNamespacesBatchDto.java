package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePermissionNamespacesBatchDto {
    /**
     * 权限空间列表
     */
    @JsonProperty("list")
    private List<CreatePermissionNamespacesBatchItemDto> list;

    public List<CreatePermissionNamespacesBatchItemDto> getList() {
        return list;
    }
    public void setList(List<CreatePermissionNamespacesBatchItemDto> list) {
        this.list = list;
    }



}