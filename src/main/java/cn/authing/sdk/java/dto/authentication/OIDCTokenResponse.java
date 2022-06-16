package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OIDCTokenResponse {
    /**
     * 访问令牌
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * 身份令牌
     */
    @JsonProperty("id_token")
    private String idToken;

    /**
     * 过期时间
     */
    @JsonProperty("expires_in")
    private Number expiresIn;

    /**
     * 刷新令牌
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

    /**
     * 令牌类型
     */
    @JsonProperty("token_type")
    private String tokenType;

    public String getAccessToken() {
        return accessToken;
    }

    public String getIdToken() {
        return idToken;
    }

    public Number getExpiresIn() {
        return expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public String getTokenType() {
        return tokenType;
    }
}