package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NamespacesListRespDto {
    /**
     * 权限分组 名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 权限分组 Code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 权限分组描述信息
     */
    @JsonProperty("description")
    private String description;
    /**
     * 权限分组状态：0 -> 关闭、1 -> 开启
     */
    @JsonProperty("status")
    private Integer status;

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

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }



}