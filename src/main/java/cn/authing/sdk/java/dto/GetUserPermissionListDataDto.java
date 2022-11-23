package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.UserPermissionListDto;

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