package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LdapSetEnabledFlagDto {
    /**
     * 开关是否开启
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }



}