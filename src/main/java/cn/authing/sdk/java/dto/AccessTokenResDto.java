package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AccessTokenResDto {
    /**
     * Access Token 内容
     */
    @JsonProperty("access_token")
    private String accessToken;
    /**
     * access_token 有效时间，默认为 7200 秒（两小时），过期之后应该重新获取新的 access_token。
     */
    @JsonProperty("expires_in")
    private Integer expiresIn;

    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }



}