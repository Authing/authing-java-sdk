package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ActionAuth;

public class ListResourceTargetsDto {
    /**
     * 资源路径
     */
    @JsonProperty("resource")
    private String resource;
    /**
     * 数据资源权限操作列表
     */
    @JsonProperty("actionAuthList")
    private List<ActionAuth> actionAuthList;

    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }

    public List<ActionAuth> getActionAuthList() {
        return actionAuthList;
    }
    public void setActionAuthList(List<ActionAuth> actionAuthList) {
        this.actionAuthList = actionAuthList;
    }



}