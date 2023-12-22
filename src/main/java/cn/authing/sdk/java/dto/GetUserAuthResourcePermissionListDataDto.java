package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.GetUserAuthResourcePermissionList;

public class GetUserAuthResourcePermissionListDataDto {
    /**
     * 权限列表
     */
    @JsonProperty("permissionList")
    private List<GetUserAuthResourcePermissionList> permissionList;

    public List<GetUserAuthResourcePermissionList> getPermissionList() {
        return permissionList;
    }
    public void setPermissionList(List<GetUserAuthResourcePermissionList> permissionList) {
        this.permissionList = permissionList;
    }



}