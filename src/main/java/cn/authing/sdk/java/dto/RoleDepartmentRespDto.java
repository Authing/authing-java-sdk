package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RoleDepartmentRespDto {
    /**
     * 部门 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 部门 code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 部门名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 部门描述信息
     */
    @JsonProperty("description")
    private String description;

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



}