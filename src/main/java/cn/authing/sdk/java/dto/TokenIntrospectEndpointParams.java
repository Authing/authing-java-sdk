package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TokenIntrospectEndpointParams {
    /**
     * `access_token` 或者 `refresh_token` 的值
     */
    @JsonProperty("token")
    private String token;
    /**
     * Authing 应用 ID。当在控制台配置检验 token 身份验证方式为 client_secret_post 和 none 时必填。
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * Authing 应用密钥。在控制台配置检验 token 身份验证方式为 client_secret_post 时必填。
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public String getClientId() {
        return clientId;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }



}