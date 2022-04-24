package dto;

import java.util.List;


public class DeleteGroupsReqDto {
    /**
     * 分组 code 列表
     */
    private List<string> codeList;

    public List<string> getCodeList() {
        return codeList;
    }
    public void setCodeList(List<string> codeList) {
        this.codeList = codeList;
    }



};