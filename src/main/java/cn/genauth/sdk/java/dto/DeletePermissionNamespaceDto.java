package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePermissionNamespaceDto {
    /**
     * 权限空间 Code
     */
    @JsonProperty("code")
    private String code;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }



}