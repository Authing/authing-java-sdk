package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateTerminalDto {
    /**
     * 设备唯一标识
     */
    @JsonProperty("deviceUniqueId")
    private String deviceUniqueId;
    /**
     * 设备类型
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 自定义数据, 自定义数据的属性对应在元数据里自定义的字段
     */
    @JsonProperty("customData")
    private Object customData;
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
     * 硬件存储秘钥
     */
    @JsonProperty("hks")
    private String hks;
    /**
     * 磁盘加密
     */
    @JsonProperty("fde")
    private String fde;
    /**
     * 硬件越狱
     */
    @JsonProperty("hor")
    private Boolean hor;
    /**
     * 设备序列号
     */
    @JsonProperty("sn")
    private String sn;
    /**
     * 制造商
     */
    @JsonProperty("producer")
    private String producer;
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
     * 国际识别码
     */
    @JsonProperty("imei")
    private String imei;
    /**
     * 设备识别码
     */
    @JsonProperty("meid")
    private String meid;
    /**
     * 设备描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 设备语言
     */
    @JsonProperty("language")
    private String language;
    /**
     * 是否开启 Cookies
     */
    @JsonProperty("cookie")
    private Boolean cookie;
    /**
     * 用户代理
     */
    @JsonProperty("userAgent")
    private String userAgent;

    public String getDeviceUniqueId() {
        return deviceUniqueId;
    }
    public void setDeviceUniqueId(String deviceUniqueId) {
        this.deviceUniqueId = deviceUniqueId;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
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

    public String getHks() {
        return hks;
    }
    public void setHks(String hks) {
        this.hks = hks;
    }

    public String getFde() {
        return fde;
    }
    public void setFde(String fde) {
        this.fde = fde;
    }

    public Boolean getHor() {
        return hor;
    }
    public void setHor(Boolean hor) {
        this.hor = hor;
    }

    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
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

    public String getImei() {
        return imei;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMeid() {
        return meid;
    }
    public void setMeid(String meid) {
        this.meid = meid;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getCookie() {
        return cookie;
    }
    public void setCookie(Boolean cookie) {
        this.cookie = cookie;
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


}