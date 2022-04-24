package dto;

import java.util.List;


public class HasRoleRolesDto {
    /**
     * 所属权限分组的 code
     */
    private String namespace;
    /**
     * 角色 code
     */
    private String code;

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }



}