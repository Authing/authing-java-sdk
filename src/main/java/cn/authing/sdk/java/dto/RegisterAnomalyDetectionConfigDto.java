package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RegisterAnomalyDetectionConfigDto {
    /**
     * 是否开启频繁注册限制
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 在一定时间周期内，对于同一个 IP，最多只能注册多少次。
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * 限定周期时间长度，单位为秒。
     */
    @JsonProperty("timeInterval")
    private Integer timeInterval;

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTimeInterval() {
        return timeInterval;
    }
    public void setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
    }



}