package cn.authing.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetUserPermissionListDataDto {
    /**
     * 用户权限列表
     */
    @JsonProperty("userPermissionList")
    private List<UserPermissionListDto> userPermissionList;

    public List<UserPermissionListDto> getUserPermissionList() {
        return userPermissionList;
    }

    public void setUserPermissionList(List<UserPermissionListDto> userPermissionList) {
        this.userPermissionList = userPermissionList;
    }

}