package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NamespaceRolesListRespDto {
    /**
     * 角色 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 角色名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 角色 Code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 角色 描述信息
     */
    @JsonProperty("description")
    private String description;
    /**
     * 权限分组（权限空间） Code
     */
    @JsonProperty("namespace")
    private String namespace;
    /**
     * 更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

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

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }



}