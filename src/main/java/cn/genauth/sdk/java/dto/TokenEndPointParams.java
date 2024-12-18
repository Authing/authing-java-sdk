package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TokenEndPointParams {
    /**
     * Authing 应用 ID，当换取 token 身份验证方式为 `client_secret_post` 或 `none` 时必填。
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * Authing 应用密钥，当换取 token 身份验证方式为 `client_secret_post` 时必填。
     */
    @JsonProperty("client_secret")
    private String clientSecret;
    /**
     * 授权模式：
     * - `authorization_code`: 使用一次性授权码 `code` 换取。
     * - `refresh_token`: 使用 Refresh Token 获取。
     * - `client_credentials`: M2M 无用户交互场景使用。
     * - `password`: 密码模式，使用用户的账号密码获取，不推荐使用。
     * - `http://authing.cn/oidc/grant_type/authing_token`: 使用 Authing 历史版本签发的 Token 换取，不推荐使用。
     *
     */
    @JsonProperty("grant_type")
    private Grant_type grantType;
    /**
     * 发起 OIDC 授权登录时的 redirect_uri 值，必须与发起登录请求时的参数一致
     */
    @JsonProperty("redirect_uri")
    private String redirectUri;
    /**
     * 获取到的一次性授权码，**一个 code 仅限一次性使用**，用后作废。有效期为 10 分钟。当 `grant_type` 为 `authorization_code` 时必填。
     */
    @JsonProperty("code")
    private String code;
    /**
     * 拼接 OIDC 授权登录连接时生成的随机字符串值，也就是 code_challenge 原始值，不是其摘要值。当使用**授权码 + PKCE 模式**时需要填写此参数。当 `grant_type` 为 `authorization_code` 并且使用 PKCE 模式时必填。
     */
    @JsonProperty("code_verifier")
    private String codeVerifier;
    /**
     * 用户的 Refresh Token。当 `grant_type` 为 `refresh_token` 时必填。
     */
    @JsonProperty("refresh_token")
    private String refreshToken;

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

    public Grant_type getGrantType() {
        return grantType;
    }
    public void setGrantType(Grant_type grantType) {
        this.grantType = grantType;
    }

    public String getRedirectUri() {
        return redirectUri;
    }
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeVerifier() {
        return codeVerifier;
    }
    public void setCodeVerifier(String codeVerifier) {
        this.codeVerifier = codeVerifier;
    }

    public String getRefreshToken() {
        return refreshToken;
    }
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }


    /**
     * 授权模式：
     * - `authorization_code`: 使用一次性授权码 `code` 换取。
     * - `refresh_token`: 使用 Refresh Token 获取。
     * - `client_credentials`: M2M 无用户交互场景使用。
     * - `password`: 密码模式，使用用户的账号密码获取，不推荐使用。
     * - `http://authing.cn/oidc/grant_type/authing_token`: 使用 Authing 历史版本签发的 Token 换取，不推荐使用。
     *
     */
    public static enum Grant_type {

        @JsonProperty("authorization_code")
        AUTHORIZATION_CODE("authorization_code"),

        @JsonProperty("refresh_token")
        REFRESH_TOKEN("refresh_token"),

        @JsonProperty("client_credentials")
        CLIENT_CREDENTIALS("client_credentials"),

        @JsonProperty("password")
        PASSWORD("password"),

        @JsonProperty("http://authing.cn/oidc/grant_type/authing_token")
        HTTP_AUTHING_CN_OIDC_GRANT_TYPE_AUTHING_TOKEN("http://authing.cn/oidc/grant_type/authing_token"),
        ;

        private String value;

        Grant_type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}