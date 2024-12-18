package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetNamespacesBatchDto {
    /**
     * 权限分组 code 列表，批量可以使用逗号分隔
     */
    @JsonProperty("codeList")
    private String codeList;

    public String getCodeList() {
        return codeList;
    }
    public void setCodeList(String codeList) {
        this.codeList = codeList;
    }



}