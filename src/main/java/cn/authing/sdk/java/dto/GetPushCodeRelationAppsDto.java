package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPushCodeRelationAppsDto {
    /**
     * 发起推送登录的应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 推送码（推送登录唯一 ID）
     */
    @JsonProperty("pushCodeId")
    private String pushCodeId;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getPushCodeId() {
        return pushCodeId;
    }
    public void setPushCodeId(String pushCodeId) {
        this.pushCodeId = pushCodeId;
    }



}