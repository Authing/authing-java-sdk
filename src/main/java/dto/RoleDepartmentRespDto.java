package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class RoleDepartmentRespDto {
    /**
     * 部门 ID
     */
    @JsonProperty("getId")
    private String id;
    /**
     * 部门 code
     */
    @JsonProperty("getCode")
    private String code;
    /**
     * 部门名称
     */
    @JsonProperty("getName")
    private String name;
    /**
     * 部门描述信息
     */
    @JsonProperty("getDescription")
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