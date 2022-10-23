package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetWechatAccessTokenDataDto {
    /**
     * Authing 服务器缓存的微信 Access Token
     */
    @JsonProperty("accessToken")
    private String accessToken;
    /**
     * Access Token 到期时间，为单位为秒的时间戳
     */
    @JsonProperty("expiresAt")
    private Integer expiresAt;

    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresAt() {
        return expiresAt;
    }
    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }



}