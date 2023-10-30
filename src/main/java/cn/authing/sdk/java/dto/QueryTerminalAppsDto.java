package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class QueryTerminalAppsDto {
    /**
     * 设备唯一标识列表
     */
    @JsonProperty("deviceIds")
    private List<String> deviceIds;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;

    public List<String> getDeviceIds() {
        return deviceIds;
    }
    public void setDeviceIds(List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}