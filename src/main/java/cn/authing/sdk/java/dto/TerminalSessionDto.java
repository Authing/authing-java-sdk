package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.DeviceInfo;


public class TerminalSessionDto {
    /**
     * 设备信息
     */
    @JsonProperty("device")
    private DeviceInfo device;
    /**
     * 最近登录时间
     */
    @JsonProperty("lastLoginTime")
    private String lastLoginTime;
    /**
     * 最近登录 IP
     */
    @JsonProperty("lastIp")
    private String lastIp;
    /**
     * 是否在线
     */
    @JsonProperty("online")
    private Boolean online;

    public DeviceInfo getDevice() {
        return device;
    }
    public void setDevice(DeviceInfo device) {
        this.device = device;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }
    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastIp() {
        return lastIp;
    }
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Boolean getOnline() {
        return online;
    }
    public void setOnline(Boolean online) {
        this.online = online;
    }



}