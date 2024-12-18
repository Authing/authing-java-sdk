package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthEnvParams {
    /**
     * ip
     */
    @JsonProperty("ip")
    private String ip;
    /**
     * 城市
     */
    @JsonProperty("city")
    private String city;
    /**
     * 省份
     */
    @JsonProperty("province")
    private String province;
    /**
     * 国家
     */
    @JsonProperty("country")
    private String country;
    /**
     * 设备类型：PC/Mobile
     */
    @JsonProperty("deviceType")
    private DeviceType deviceType;
    /**
     * 操作类型：Windows、Android、iOS、MacOS
     */
    @JsonProperty("systemType")
    private SystemType systemType;
    /**
     * 浏览器类型：IE/Chrome/Firefox
     */
    @JsonProperty("browserType")
    private BrowserType browserType;
    /**
     * 请求时间
     */
    @JsonProperty("requestDate")
    private String requestDate;

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public DeviceType getDeviceType() {
        return deviceType;
    }
    public void setDeviceType(DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    public SystemType getSystemType() {
        return systemType;
    }
    public void setSystemType(SystemType systemType) {
        this.systemType = systemType;
    }

    public BrowserType getBrowserType() {
        return browserType;
    }
    public void setBrowserType(BrowserType browserType) {
        this.browserType = browserType;
    }

    public String getRequestDate() {
        return requestDate;
    }
    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }


    /**
     * 设备类型：PC/Mobile
     */
    public static enum DeviceType {

        @JsonProperty("PC")
        PC("PC"),

        @JsonProperty("Mobile")
        MOBILE("Mobile"),
        ;

        private String value;

        DeviceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 操作类型：Windows、Android、iOS、MacOS
     */
    public static enum SystemType {

        @JsonProperty("Windows")
        WINDOWS("Windows"),

        @JsonProperty("MacOS")
        MAC_OS("MacOS"),

        @JsonProperty("Android")
        ANDROID("Android"),

        @JsonProperty("iOS")
        I_OS("iOS"),
        ;

        private String value;

        SystemType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 浏览器类型：IE/Chrome/Firefox
     */
    public static enum BrowserType {

        @JsonProperty("IE")
        IE("IE"),

        @JsonProperty("Chrome")
        CHROME("Chrome"),

        @JsonProperty("Firefox")
        FIREFOX("Firefox"),

        @JsonProperty("Safari")
        SAFARI("Safari"),

        @JsonProperty("Edge")
        EDGE("Edge"),

        @JsonProperty("Opera")
        OPERA("Opera"),

        @JsonProperty("Safe360")
        SAFE360("Safe360"),

        @JsonProperty("QQBrowser")
        QQBROWSER("QQBrowser"),
        ;

        private String value;

        BrowserType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}