package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthenticateByYidunDto {
    /**
     * 网易易盾 token
     */
    @JsonProperty("token")
    private String token;
    /**
     * 网易易盾运营商授权码
     */
    @JsonProperty("accessToken")
    private String accessToken;

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }



}