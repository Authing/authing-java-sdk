package dto;


public class CreateRoleDto {
    /**
     * 角色 code
     */
    private String code
    /**
     * 角色 namespace
     */
    private String namespace
    /**
     * 角色描述
     */
    private String description

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