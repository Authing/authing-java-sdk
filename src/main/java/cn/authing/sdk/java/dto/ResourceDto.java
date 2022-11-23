package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ResourceActionListDto;

public class ResourceDto {
    /**
     * 数据策略下所授权的数据资源 Code
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源权限操作列表
     */
    @JsonProperty("actions")
    private List<ResourceActionListDto> actions;

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public List<ResourceActionListDto> getActions() {
        return actions;
    }
    public void setActions(List<ResourceActionListDto> actions) {
        this.actions = actions;
    }



}