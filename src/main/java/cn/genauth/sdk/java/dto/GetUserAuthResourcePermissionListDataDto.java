package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

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