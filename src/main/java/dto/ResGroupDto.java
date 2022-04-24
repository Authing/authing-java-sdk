package dto;

import java.util.List;


public class ResGroupDto {
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
    /**
     * 创建时间
     */
    private String createdAt;
    /**
     * 更新时间
     */
    private String updatedAt;

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

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }



}