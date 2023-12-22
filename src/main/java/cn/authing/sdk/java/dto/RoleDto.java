package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoleDto {
    /**
     * 角色 ID
     */
    @JsonProperty("id")
    private String id;
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
     * 所属权限分组(权限空间)的 Code，不传获取默认权限分组。
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
    /**
     * 角色自动禁止时间，单位毫秒, 如果传null表示永久有效
     */
    @JsonProperty("disableTime")
    private Integer disableTime;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

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

    public Integer getDisableTime() {
        return disableTime;
    }
    public void setDisableTime(Integer disableTime) {
        this.disableTime = disableTime;
    }



}