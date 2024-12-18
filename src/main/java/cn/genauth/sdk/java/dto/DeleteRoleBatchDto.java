package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteRoleBatchDto {
    /**
     * 角色 Code 和 namespace 列表
     */
    @JsonProperty("roleList")
    private List<RoleCodeAndNamespaceDto> roleList;

    public List<RoleCodeAndNamespaceDto> getRoleList() {
        return roleList;
    }
    public void setRoleList(List<RoleCodeAndNamespaceDto> roleList) {
        this.roleList = roleList;
    }



}