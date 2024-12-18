package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPermissionResourceDto {
    /**
     * 数据策略下所授权的数据资源 Code
     */
    @JsonProperty("resourceCode")
    private String resourceCode;
    /**
     * 数据资源权限操作列表
     */
    @JsonProperty("actionList")
    private List<DataResourceActionListDto> actionList;

    public String getResourceCode() {
        return resourceCode;
    }
    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public List<DataResourceActionListDto> getActionList() {
        return actionList;
    }
    public void setActionList(List<DataResourceActionListDto> actionList) {
        this.actionList = actionList;
    }



}