package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.UserInfoDto;

public class CreateDepartmentTreeReqDto {
    /**
     * 部门名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 子部门
     */
    @JsonProperty("children")
    private List<String> children;
    /**
     * 部门成员
     */
    @JsonProperty("members")
    private UserInfoDto members;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getChildren() {
        return children;
    }
    public void setChildren(List<String> children) {
        this.children = children;
    }

    public UserInfoDto getMembers() {
        return members;
    }
    public void setMembers(UserInfoDto members) {
        this.members = members;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }



}