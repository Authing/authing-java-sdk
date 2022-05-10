package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UpdateGroupReqDto {
    /**
     * 分组描述
     */
    @JsonProperty("getDescription")
    private String description;
    /**
     * 分组名称
     */
    @JsonProperty("getName")
    private String name;
    /**
     * 分组 code
     */
    @JsonProperty("getCode")
    private String code;
    /**
     * 分组新的 code
     */
    @JsonProperty("getNewCode")
    private String newCode;

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

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getNewCode() {
        return newCode;
    }
    public void setNewCode(String newCode) {
        this.newCode = newCode;
    }



}