package dto;


public class UpdateNamespaceDto {
    /**
     * 权限分组新的唯一标志符
     */
    private String newCode
    /**
     * 权限分组唯一标志符
     */
    private String code
    /**
     * 权限分组描述信息
     */
    private String description
    /**
     * 权限分组名称
     */
    private String name

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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

};