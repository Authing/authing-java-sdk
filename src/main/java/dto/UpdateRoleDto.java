package dto;


public class UpdateRoleDto {
    /**
     * 新的角色 code
     */
    private String newCode
    /**
     * 角色 code
     */
    private String code
    /**
     * 权限分组
     */
    private String namespace
    /**
     * 角色描述
     */
    private String description

    public String getNewCode() {
        return newCode;
    }
    public void setNewCode(String newCode) {
        this.newCode = newCode;
    }

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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

};