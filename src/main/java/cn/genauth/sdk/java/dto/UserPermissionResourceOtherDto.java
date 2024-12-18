package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserPermissionResourceOtherDto {
    /**
     * 数据策略下所授权的数据资源 Code
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源下节点操作列表
     */
    @JsonProperty("actionList")
    private List<String> actionList;

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public List<String> getActionList() {
        return actionList;
    }
    public void setActionList(List<String> actionList) {
        this.actionList = actionList;
    }



}