package dto;

import java.util.List;


public class RoleCodeDto {
    /**
     * 角色 code
     */
    private String code;
    /**
     * 权限分组
     */
    private String namespace;

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



};