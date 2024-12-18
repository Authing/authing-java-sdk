package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

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