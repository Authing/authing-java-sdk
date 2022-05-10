package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UpdateRoleDto {
    /**
     * 角色新的权限分组内唯一识别码
     */
    @JsonProperty("getNewCode")
    private String newCode;
    /**
     * 权限分组内角色的唯一标识符
     */
    @JsonProperty("getCode")
    private String code;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("getNamespace")
    private String namespace;
    /**
     * 角色描述
     */
    @JsonProperty("getDescription")
    private String description;

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



}