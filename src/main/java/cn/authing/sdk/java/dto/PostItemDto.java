package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PostItemDto {
    /**
     * 分组 code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 分组名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 分组描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 岗位关联用户数，只有在 skipCount 不为 true 时才存在
     */
    @JsonProperty("userCount")
    private Integer userCount;
    /**
     * 岗位关联部门数，只有在 skipCount 不为 true 时才存在
     */
    @JsonProperty("departmentCount")
    private Integer departmentCount;
    /**
     * 岗位元数据信息
     */
    @JsonProperty("metadataSource")
    private List<String> metadataSource;

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

    public Integer getUserCount() {
        return userCount;
    }
    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getDepartmentCount() {
        return departmentCount;
    }
    public void setDepartmentCount(Integer departmentCount) {
        this.departmentCount = departmentCount;
    }

    public List<String> getMetadataSource() {
        return metadataSource;
    }
    public void setMetadataSource(List<String> metadataSource) {
        this.metadataSource = metadataSource;
    }



}