package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreatePermissionNamespaceDto {
    /**
     * 权限空间名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 权限空间 Code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 权限空间描述
     */
    @JsonProperty("description")
    private String description;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}