package dto;


public class DeleteRoleDto {
    /**
     * 角色 code 集合
     */
    private Array<string> codeList
    /**
     * 权限分组的 code
     */
    private String namespace

    public Array<string> getCodeList() {
        return codeList;
    }
    public void setCodeList(Array<string> codeList) {
        this.codeList = codeList;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

};