package dto;

import java.util.List;


public class RoleDto {
    /**
     * 角色 code
     */
    private String code;
    /**
     * 角色描述
     */
    private String description;
    /**
     * namespace
     */
    private String namespace;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}