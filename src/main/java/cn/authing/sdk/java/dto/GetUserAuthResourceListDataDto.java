package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.UserAuthResourceListDto;


public class GetUserAuthResourceListDataDto {
    /**
     * 用户权限列表
     */
    @JsonProperty("userPermissionList")
    private List<UserAuthResourceListDto> userPermissionList;

    public List<UserAuthResourceListDto> getUserPermissionList() {
        return userPermissionList;
    }
    public void setUserPermissionList(List<UserAuthResourceListDto> userPermissionList) {
        this.userPermissionList = userPermissionList;
    }



}