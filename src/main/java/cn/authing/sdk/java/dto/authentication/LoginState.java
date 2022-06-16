package cn.authing.sdk.java.dto.authentication;

public class LoginState {
    /**
     * 访问令牌
     */
    private String accessToken;

    /**
     * 身份令牌
     */
    private String idToken;

    /**
     * 刷新令牌
     */
    private String refreshToken;

    /**
     * 过期时间
     */
    private Number expireAt;

    /**
     * 身份令牌解析结果
     */
    private IDToken parsedIDToken;

    /**
     * 访问令牌解析结果
     */
    private AccessToken parsedAccessToken;

    public LoginState(String accessToken, String idToken, String refreshToken, Number expireAt, IDToken parsedIDToken, AccessToken parsedAccessToken) {
        this.accessToken = accessToken;
        this.idToken = idToken;
        this.refreshToken = refreshToken;
        this.expireAt = expireAt;
        this.parsedIDToken = parsedIDToken;
        this.parsedAccessToken = parsedAccessToken;
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

    public Number getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Number expireAt) {
        this.expireAt = expireAt;
    }

    public IDToken getParsedIDToken() {
        return parsedIDToken;
    }

    public void setParsedIDToken(IDToken parsedIDToken) {
        this.parsedIDToken = parsedIDToken;
    }

    public AccessToken getParsedAccessToken() {
        return parsedAccessToken;
    }

    public void setParsedAccessToken(AccessToken parsedAccessToken) {
        this.parsedAccessToken = parsedAccessToken;
    }
}