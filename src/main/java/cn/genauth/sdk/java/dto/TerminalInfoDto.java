package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TerminalInfoDto {
    /**
     * 主键 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 设备唯一标识
     */
    @JsonProperty("deviceUniqueId")
    private String deviceUniqueId;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceUniqueId() {
        return deviceUniqueId;
    }
    public void setDeviceUniqueId(String deviceUniqueId) {
        this.deviceUniqueId = deviceUniqueId;
    }



}