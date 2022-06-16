package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RefreshTokenParams {

    /**
     * app id
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * app 密钥
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * 刷新令牌
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * 授权类型
     */
    @JsonProperty("grant_type")
    private String grantType = "refresh_token";

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

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public RefreshTokenParams(String clientId, String clientSecret, String refreshToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.refreshToken = refreshToken;
    }
}