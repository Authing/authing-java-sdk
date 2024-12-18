package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserAuthResourcePermissionListDto {
    /**
     * 数据资源路径列表,**树资源需到具体树节点**
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