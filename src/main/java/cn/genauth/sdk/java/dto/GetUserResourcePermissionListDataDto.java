package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetUserResourcePermissionListDataDto {
    /**
     * 权限列表
     */
    @JsonProperty("permissionList")
    private List<GetUserResourcePermissionList> permissionList;

    public List<GetUserResourcePermissionList> getPermissionList() {
        return permissionList;
    }
    public void setPermissionList(List<GetUserResourcePermissionList> permissionList) {
        this.permissionList = permissionList;
    }



}