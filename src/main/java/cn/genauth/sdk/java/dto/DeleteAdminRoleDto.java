package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteAdminRoleDto {
    /**
     * 角色 code 列表
     */
    @JsonProperty("codeList")
    private List<String> codeList;

    public List<String> getCodeList() {
        return codeList;
    }
    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }



}