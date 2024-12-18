package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LoginTokenResponseDataDto {
    /**
     * access_token 对应的 scope
     */
    @JsonProperty("scope")
    private String scope;
    /**
     * 接口调用凭据，在限制时间内被授权访问资源 API
     */
    @JsonProperty("access_token")
    private String accessToken;
    /**
     * 用户的身份凭证，解析后会包含用户信息
     */
    @JsonProperty("id_token")
    private String idToken;
    /**
     * refresh_token 用于获取新的 AccessToken
     */
    @JsonProperty("refresh_token")
    private String refreshToken;
    /**
     * token 类型
     */
    @JsonProperty("token_type")
    private String tokenType;
    /**
     * 过期时间 单位是秒
     */
    @JsonProperty("expire_in")
    private Integer expireIn;

    public String getScope() {
        return scope;
    }
    public void setScope(String scope) {
        this.scope = scope;
    }

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

    public String getRefreshToken() {
        return refreshToken;
    }
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getTokenType() {
        return tokenType;
    }
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Integer getExpireIn() {
        return expireIn;
    }
    public void setExpireIn(Integer expireIn) {
        this.expireIn = expireIn;
    }



}