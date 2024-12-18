package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreatePermissionNamespaceRespDto {
    /**
     * 权限空间唯一标志符
     */
    @JsonProperty("code")
    private String code;
    /**
     * 权限空间名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 权限空间描述信息
     */
    @JsonProperty("description")
    private String description;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}