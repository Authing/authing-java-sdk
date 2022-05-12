package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KickUsersDto {
    /**
     * APP ID 集合
     */
    @JsonProperty("appIds")
    private List<String> appIds;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;

    public List<String> getAppIds() {
        return appIds;
    }
    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}