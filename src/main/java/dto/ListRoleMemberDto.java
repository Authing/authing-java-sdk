package dto;

import java.util.List;

import dto.ListRoleMemberOptionsDto;

public class ListRoleMemberDto {
    /**
     * 角色唯一标识符
     */
    private String code;
    /**
     * 权限分组的 code
     */
    private String namespace;
    /**
     * 可选参数
     */
    private ListRoleMemberOptionsDto options;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListRoleMemberOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListRoleMemberOptionsDto options) {
        this.options = options;
    }



};