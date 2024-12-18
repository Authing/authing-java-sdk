package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LoginIpWhitelistCheckConfigDto {
    /**
     * 是否开启登录 ip 白名单验证
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 人机验证 ip 白名单
     */
    @JsonProperty("ipWhitelist")
    private String ipWhitelist;

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getIpWhitelist() {
        return ipWhitelist;
    }
    public void setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }



}