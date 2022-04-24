package dto;

import java.util.List;

import dto.ListRoleOptionsDto;

public class ListRoleDto {
    /**
     * 角色 namespace
     */
    private String namespace;
    /**
     * 可选参数
     */
    private ListRoleOptionsDto options;

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListRoleOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListRoleOptionsDto options) {
        this.options = options;
    }



};