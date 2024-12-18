package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteRoleDto {
    /**
     * 角色 code 列表
     */
    @JsonProperty("codeList")
    private List<String> codeList;
    /**
     * 所属权限分组(权限空间)的 code，不传获取默认权限分组。
     */
    @JsonProperty("namespace")
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