package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPermissionNamespacesBatchDto {
    /**
     * 权限空间 code 列表，批量可以使用逗号分隔
     */
    @JsonProperty("codes")
    private String codes;

    public String getCodes() {
        return codes;
    }
    public void setCodes(String codes) {
        this.codes = codes;
    }



}