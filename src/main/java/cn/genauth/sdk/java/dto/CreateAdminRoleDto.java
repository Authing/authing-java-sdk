package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAdminRoleDto {
    /**
     * 管理员角色名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 管理员角色的唯一标识符
     */
    @JsonProperty("code")
    private String code;
    /**
     * 角色描述
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