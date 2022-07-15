package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRoleBatchDto {
    /**
     * 权限分组内角色的唯一标识符,批量可以使用逗号分隔
     */
    @JsonProperty("codeList")
    private String codeList;
    /**
     * 所属权限分组的 code
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