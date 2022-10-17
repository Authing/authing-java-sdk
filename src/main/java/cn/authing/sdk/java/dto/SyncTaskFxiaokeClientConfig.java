package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskFxiaokeClientConfig {
    /**
     * App Id
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * App Secret
     */
    @JsonProperty("appSecret")
    private String appSecret;
    /**
     * Permanent Code
     */
    @JsonProperty("permanentCode")
    private String permanentCode;
    /**
     * Current Open User Id
     */
    @JsonProperty("currentOpenUserId")
    private String currentOpenUserId;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getPermanentCode() {
        return permanentCode;
    }
    public void setPermanentCode(String permanentCode) {
        this.permanentCode = permanentCode;
    }

    public String getCurrentOpenUserId() {
        return currentOpenUserId;
    }
    public void setCurrentOpenUserId(String currentOpenUserId) {
        this.currentOpenUserId = currentOpenUserId;
    }



}