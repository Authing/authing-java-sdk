package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckRoleParamsDto {
    /**
     * 权限分组（权限空间）内角色的唯一标识符
     */
    @JsonProperty("code")
    private String code;
    /**
     * 所属权限分组(权限空间)的 Code，不传使用默认权限分组。
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 权限分组（权限空间）内角色名称
     */
    @JsonProperty("name")
    private String name;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }



}