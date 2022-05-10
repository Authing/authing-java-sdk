package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class DeleteNamespacesBatchDto {
    /**
     * 权限分组 code 列表
     */
    @JsonProperty("getCodeList")
    private List<String> codeList;

    public List<String> getCodeList() {
        return codeList;
    }
    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }



}