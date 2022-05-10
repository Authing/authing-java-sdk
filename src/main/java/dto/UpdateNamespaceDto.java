package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UpdateNamespaceDto {
    /**
     * 权限分组唯一标志符
     */
    @JsonProperty("getCode")
    private String code;
    /**
     * 权限分组描述信息
     */
    @JsonProperty("getDescription")
    private String description;
    /**
     * 权限分组名称
     */
    @JsonProperty("getName")
    private String name;
    /**
     * 权限分组新的唯一标志符
     */
    @JsonProperty("getNewCode")
    private String newCode;

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



}