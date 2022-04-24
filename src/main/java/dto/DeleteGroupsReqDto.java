package dto;

import java.util.List;


public class DeleteGroupsReqDto {
    /**
     * 分组 code 列表
     */
    private List<String> codeList;

    public List<String> getCodeList() {
        return codeList;
    }
    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }



}