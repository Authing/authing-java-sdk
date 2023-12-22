package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckPushcodeStatusDto {
    /**
     * 推送码（推送登录唯一 ID）
     */
    @JsonProperty("pushCodeId")
    private String pushCodeId;

    public String getPushCodeId() {
        return pushCodeId;
    }
    public void setPushCodeId(String pushCodeId) {
        this.pushCodeId = pushCodeId;
    }



}