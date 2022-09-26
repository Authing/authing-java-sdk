package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckSessionStatusDataDto {
    /**
     * 是否具有登录态
     */
    @JsonProperty("active")
    private Boolean active;

    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }



}