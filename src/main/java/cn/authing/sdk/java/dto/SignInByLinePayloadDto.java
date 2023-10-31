package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class SignInByLinePayloadDto {
    /**
     * LINE 移动端社会化登录获取到的 `access_token`
     */
    @JsonProperty("access_token")
    private String accessToken;
    /**
     * LINE 移动端社会化登录获取到的 `id_token`, 需要有 `openid` 的权限，将根据`id_token`获取用户信息，否则根据 `access_token` 获取用户信息
     */
    @JsonProperty("id_token")
    private String idToken;

    public String getAccessToken() {
        return accessToken;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getIdToken() {
        return idToken;
    }
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }



}