package dto;


public class DeleteResourcesBatchDto {
    /**
     * 资源 code 列表
     */
    private Array<string> codeList
    /**
     * 所属权限分组的 code
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