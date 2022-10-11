package cn.authing.sdk.java.model;

import cn.authing.sdk.java.util.HttpUtils;
import com.nimbusds.jose.jwk.JWKSet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZKB
 */
public class AuthenticationClientOptions extends AuthingClientOptions {
    /** 应用 ID */
    private String appId;

    /** 应用 Secret */
    private String appSecret;

    /** 应用对应的用户池域名，例如 pool.authing.cn */
    private String host;

    /** 认证完成后的重定向目标 URL */
    private String redirectUri;

    /** 登出完成后的重定向目标 URL */
    private String logoutRedirectUri;

    /**
     * 应用侧向 Authing 请求的权限，以空格分隔，默认为 'openid profile'
     * 成功获取的权限会出现在 Access Token 的 scope 字段中
     * 一些示例：
     * - openid: OIDC 标准规定的权限，必须包含
     * - profile: 获取用户的基本身份信息
     * - offline_access: 获取用户的 Refresh Token，可用于调用 refreshLoginState 刷新用户的登录态
     */
    private String scope = "openid profile offline_access";

    /**
     * 服务端的 JWKS 公钥，用于验证 Token 签名，默认会通过网络请求从服务端的 JWKS 端点自动获取
     */
    private JWKSet serverJWKS;

    /**
     * 存储认证上下文的 Cookie 名称
     */
    private String cookieKey;

    /**
     * 超时时间
     */
    private int timeout = 10000;

    public AuthenticationClientOptions(String appId, String appSecret, String domain, String redirectUri) {
        this.appId = appId;
        this.appSecret = appSecret;
        this.host = domain;
        this.redirectUri = redirectUri;
    }

    @Override
    public String doRequest(String url, String method, Map<String, String> headers, Object body) {
        if (headers == null) {
            headers = new HashMap<>();
        }
        headers.put("x-authing-request-from", AuthingClientOptions.REQUEST_FROM);
        headers.put("x-authing-sdk-version", AuthingClientOptions.SDK_VERSION);
        return HttpUtils.request(getHost() + url, method, body, headers, getTimeout());
    }

    public int getTimeout() {
        return timeout;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getLogoutRedirectUri() {
        return logoutRedirectUri;
    }

    public void setLogoutRedirectUri(String logoutRedirectUri) {
        this.logoutRedirectUri = logoutRedirectUri;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public JWKSet getServerJWKS() {
        return serverJWKS;
    }

    public void setServerJWKS(JWKSet serverJWKS) {
        this.serverJWKS = serverJWKS;
    }

    public String getCookieKey() {
        return cookieKey;
    }

    public void setCookieKey(String cookieKey) {
        this.cookieKey = cookieKey;
    }
}

