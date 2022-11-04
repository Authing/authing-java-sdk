package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateRoleDto {
    /**
     * 权限分组（权限空间）内角色的唯一标识符
     */
    @JsonProperty("code")
    private String code;
    /**
     * 权限分组（权限空间）内角色名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 所属权限分组(权限空间)的 code
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 角色描述
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

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



}