package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateRoleDto {
    /**
     * 权限分组（权限空间）角色名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 角色新的权限分组（权限空间）内唯一识别码
     */
    @JsonProperty("newCode")
    private String newCode;
    /**
     * 权限分组(权限空间）内角色的唯一标识符
     */
    @JsonProperty("code")
    private String code;
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
    /**
     * 角色状态，ENABLE-表示正常，DISABLE-表示禁止
     */
    @JsonProperty("status")
    private String status;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNewCode() {
        return newCode;
    }
    public void setNewCode(String newCode) {
        this.newCode = newCode;
    }

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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }



}