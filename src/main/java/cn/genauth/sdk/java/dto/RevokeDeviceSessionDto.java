package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RevokeDeviceSessionDto {
    /**
     * 设备唯一标识
     */
    @JsonProperty("deviceId")
    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }



}