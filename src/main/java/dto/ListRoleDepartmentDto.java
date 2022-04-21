package dto;

import dto.ListRoleDepartmentOptionsDto;

public class ListRoleDepartmentDto {
    /**
     * 部门唯一标识符
     */
    private String code
    /**
     * 权限分组的 code
     */
    private String namespace
    /**
     * 可选参数
     */
    private ListRoleDepartmentOptionsDto options

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

    public ListRoleDepartmentOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListRoleDepartmentOptionsDto options) {
        this.options = options;
    }

};