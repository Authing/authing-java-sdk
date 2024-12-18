package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ParsedUserAgent {
    /**
     * 使用的设备类型
     */
    @JsonProperty("device")
    private String device;
    /**
     * 浏览器名称
     */
    @JsonProperty("browser")
    private String browser;
    /**
     * 操作系统
     */
    @JsonProperty("os")
    private String os;

    public String getDevice() {
        return device;
    }
    public void setDevice(String device) {
        this.device = device;
    }

    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }



}