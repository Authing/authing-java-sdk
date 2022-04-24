package dto;

import java.util.List;


public class DeleteResourcesBatchDto {
    /**
     * 资源 code 列表
     */
    private List<String> codeList;
    /**
     * 所属权限分组的 code
     */
    private String namespace;

    public List<String> getCodeList() {
        return codeList;
    }
    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}