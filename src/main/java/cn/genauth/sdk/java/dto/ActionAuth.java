package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ActionAuth {
    /**
     * 数据策略授权用户 ID 列表
     */
    @JsonProperty("userIds")
    private List<String> userIds;
    /**
     * 数据资源权限操作
     */
    @JsonProperty("action")
    private String action;

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }



}