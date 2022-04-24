package dto;

import java.util.List;


public class GetNamespacesBatchDto {
    /**
     * 权限分组 code 列表
     */
    private List<string> codeList;

    public List<string> getCodeList() {
        return codeList;
    }
    public void setCodeList(List<string> codeList) {
        this.codeList = codeList;
    }



};