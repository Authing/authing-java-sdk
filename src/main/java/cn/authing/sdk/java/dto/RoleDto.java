package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoleDto {
    /**
     * 权限分组(权限空间)内角色的唯一标识符 Code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 权限分组(权限空间)内角色名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 角色描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 所属权限分组(权限空间)的 Code
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 所属权限分组(权限空间)的名称
     */
    @JsonProperty("namespaceName")
    private String namespaceName;
    /**
     * 角色状态，ENABLE-表示正常，DISABLE-表示禁止
     */
    @JsonProperty("status")
    private String status;

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

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getNamespaceName() {
        return namespaceName;
    }
    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }



}