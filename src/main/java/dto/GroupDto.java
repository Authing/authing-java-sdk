package dto;

import java.util.List;


public class GroupDto {
    /**
     * 分组 code
     */
    private String code;
    /**
     * 分组名称
     */
    private String name;
    /**
     * 分组描述
     */
    private String description;

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



};