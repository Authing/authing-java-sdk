package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateAuthEnabledDto {
    /**
     * 授权是否生效开关,
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 授权 ID
     */
    @JsonProperty("id")
    private String id;

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}