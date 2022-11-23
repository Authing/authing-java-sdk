package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ResourceActionListDto;

public class resourceDto {
    /**
     * 数据策略下所授权的数据资源 Code
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源权限操作列表
     */
    @JsonProperty("actionList")
    private List<ResourceActionListDto> actionList;

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public List<ResourceActionListDto> getActionList() {
        return actionList;
    }
    public void setActionList(List<ResourceActionListDto> actionList) {
        this.actionList = actionList;
    }



}