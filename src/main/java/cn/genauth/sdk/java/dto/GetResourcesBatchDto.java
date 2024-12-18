package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetResourcesBatchDto {
    /**
     * 资源 code 列表，批量可以使用逗号分隔
     */
    @JsonProperty("codeList")
    private String codeList;
    /**
     * 所属权限分组(权限空间)的 Code，不传获取默认权限分组。
     */
    @JsonProperty("namespace")
    private String namespace;

    public String getCodeList() {
        return codeList;
    }
    public void setCodeList(String codeList) {
        this.codeList = codeList;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}