package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckPermissionTreeResourceDto {
    /**
     * 树数据资源路径列表,
     */
    @JsonProperty("resources")
    private List<String> resources;
    /**
     * 数据资源权限操作, read、get、write 等动作
     */
    @JsonProperty("action")
    private String action;

    public List<String> getResources() {
        return resources;
    }
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }



}