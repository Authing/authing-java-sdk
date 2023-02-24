package cn.authing.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GetUserAuthResourcePermissionListDto {
  /**
   * 树数据资源路径列表,
   */
  @JsonProperty("resources")
  private List<String> resources;
  public List<String> getResources() {
    return resources;
  }
  public void setResources(List<String> resources) {
    this.resources = resources;
  }


}
