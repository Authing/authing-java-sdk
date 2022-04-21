package dto;


public class DeleteNamespacesBatchDto {
    /**
     * 权限分组 code 列表
     */
    private Array<string> codeList

    public Array<string> getCodeList() {
        return codeList;
    }
    public void setCodeList(Array<string> codeList) {
        this.codeList = codeList;
    }

};