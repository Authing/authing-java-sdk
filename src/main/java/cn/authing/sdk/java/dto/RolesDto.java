package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RolesDto {
    /**
     * 用户描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 用户识别码，权限组下唯一
     */
    @JsonProperty("code")
    private String code;
    /**
     * 权限分组
     */
    @JsonProperty("namespace")
    private String namespace;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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



}