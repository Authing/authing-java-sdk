package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetWechatAccessTokenDto {
    /**
     * 微信小程序或微信公众号的 AppSecret
     */
    @JsonProperty("appSecret")
    private String appSecret;
    /**
     * 微信小程序或微信公众号的 AppId
     */
    @JsonProperty("appId")
    private String appId;

    public String getAppSecret() {
        return appSecret;
    }
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }



}