package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class RoleCodeDto {
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