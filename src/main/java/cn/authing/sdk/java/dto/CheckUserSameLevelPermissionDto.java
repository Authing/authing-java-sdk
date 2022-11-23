package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckUserSameLevelPermissionDto {
    /**
     * 是否拥有 action 权限
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 数据资源权限操作
     */
    @JsonProperty("action")
    private String action;
    /**
     * 树资源节点code
     */
    @JsonProperty("resourceNodeCode")
    private String resourceNodeCode;

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public String getResourceNodeCode() {
        return resourceNodeCode;
    }
    public void setResourceNodeCode(String resourceNodeCode) {
        this.resourceNodeCode = resourceNodeCode;
    }



}