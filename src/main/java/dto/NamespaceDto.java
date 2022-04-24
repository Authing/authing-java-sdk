package dto;

import java.util.List;


public class NamespaceDto {
    /**
     * 权限分组唯一标志符
     */
    private String code;
    /**
     * 权限分组名称
     */
    private String name;
    /**
     * 权限分组描述信息
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