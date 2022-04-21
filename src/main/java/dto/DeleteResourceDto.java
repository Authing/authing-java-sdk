package dto;


public class DeleteResourceDto {
    /**
     * 资源唯一标志符
     */
    private String code
    /**
     * 所属权限分组的 code
     */
    private String namespace

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