package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenePushCodeDataDto {
    /**
     * 推送码（推送登录唯一 ID），可以通过此唯一 ID 查询推送码状态。
     */
    @JsonProperty("pushCodeId")
    private String pushCodeId;
    /**
     * 推送码 `${expireTime}` 秒后过期，如 120 秒后过期。
     */
    @JsonProperty("expireTime")
    private Integer expireTime;

    public String getPushCodeId() {
        return pushCodeId;
    }
    public void setPushCodeId(String pushCodeId) {
        this.pushCodeId = pushCodeId;
    }

    public Integer getExpireTime() {
        return expireTime;
    }
    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }



}