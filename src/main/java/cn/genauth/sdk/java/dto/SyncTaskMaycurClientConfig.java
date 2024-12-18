package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskMaycurClientConfig {
    /**
     * App Code
     */
    @JsonProperty("app_code")
    private String appCode;
    /**
     * App Secret
     */
    @JsonProperty("app_secret")
    private String appSecret;
    /**
     * 登录域名
     */
    @JsonProperty("endpoint")
    private String endpoint;

    public String getAppCode() {
        return appCode;
    }
    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getAppSecret() {
        return appSecret;
    }
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getEndpoint() {
        return endpoint;
    }
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }



}