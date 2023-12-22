package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeviceInfo {
    /**
     * 设备唯一标识
     */
    @JsonProperty("deviceId")
    private String deviceId;
    /**
     * 设备名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 系统版本
     */
    @JsonProperty("version")
    private String version;
    /**
     * 设备类型
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 设备模组
     */
    @JsonProperty("mod")
    private String mod;
    /**
     * 设备系统
     */
    @JsonProperty("os")
    private String os;
    /**
     * 设备状态
     */
    @JsonProperty("status")
    private Status status;
    /**
     * 用户代理
     */
    @JsonProperty("userAgent")
    private String userAgent;

    public String getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getMod() {
        return mod;
    }
    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUserAgent() {
        return userAgent;
    }
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }


    /**
     * 设备类型
     */
    public static enum Type {

        @JsonProperty("Browser")
        BROWSER("Browser"),

        @JsonProperty("Mobile")
        MOBILE("Mobile"),

        @JsonProperty("Desktop")
        DESKTOP("Desktop"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 设备状态
     */
    public static enum Status {

        @JsonProperty("activated")
        ACTIVATED("activated"),

        @JsonProperty("suspended")
        SUSPENDED("suspended"),

        @JsonProperty("deactivated")
        DEACTIVATED("deactivated"),
        ;

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}