package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class RoleDto {
    /**
     * 权限分组内角色的唯一标识符
     */
    @JsonProperty("getCode")
    private String code;
    /**
     * 角色描述
     */
    @JsonProperty("getDescription")
    private String description;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("getNamespace")
    private String namespace;

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



}