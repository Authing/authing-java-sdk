package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CodeToTokenParams {
    /**
     * 授权码
     */
    @JsonProperty("code")
    private String code;

    /**
     * 客户端 ID
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * 客户端密钥
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * 重定向地址
     */
    @JsonProperty("redirect_uri")
    private String redirectUri;

    /**
     * 收取类型
     */
    @JsonProperty("grant_type")
    private String grantType;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public CodeToTokenParams(String code, String clientId, String clientSecret, String redirectUri, String grantType) {
        this.code = code;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUri = redirectUri;
        this.grantType = grantType;
    }
}
