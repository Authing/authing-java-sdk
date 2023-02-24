package cn.authing.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetUserAuthResourcePermissionListDataDto {


  /**
   * 用户权限列表
   */
  @JsonProperty("userPermissionList")
  private List<GetUserAuthResourcePermissionList> permissionList;

  public List<GetUserAuthResourcePermissionList> getUserPermissionList() {
    return permissionList;
  }
  public void setUserPermissionList(List<GetUserAuthResourcePermissionList> userPermissionList) {
    this.permissionList = userPermissionList;
  }

}
