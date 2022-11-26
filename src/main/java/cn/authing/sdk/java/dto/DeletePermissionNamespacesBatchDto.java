package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePermissionNamespacesBatchDto {
    /**
     * 权限分组 code 列表
     */
    @JsonProperty("codes")
    private List<String> codes;

    public List<String> getCodes() {
        return codes;
    }
    public void setCodes(List<String> codes) {
        this.codes = codes;
    }



}