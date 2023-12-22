package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteResourcesBatchDto {
    /**
     * 所属权限分组(权限空间)的 Code，不传获取默认权限分组。
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 资源 Code 列表
     */
    @JsonProperty("codeList")
    private List<String> codeList;
    /**
     * 资源 Id 列表
     */
    @JsonProperty("ids")
    private List<String> ids;

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<String> getCodeList() {
        return codeList;
    }
    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public List<String> getIds() {
        return ids;
    }
    public void setIds(List<String> ids) {
        this.ids = ids;
    }



}