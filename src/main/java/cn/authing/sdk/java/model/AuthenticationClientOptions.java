package cn.authing.sdk.java.model;

import cn.authing.sdk.java.enums.AuthMethodEnum;
import cn.authing.sdk.java.enums.ProtocolEnum;
import cn.authing.sdk.java.util.HttpUtils;
import cn.hutool.core.util.StrUtil;

import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZKB
 */
public class AuthenticationClientOptions extends AuthingClientOptions {
    /**
     * Authing 应用 ID，必填。
     */
    private String appId;

    /**
     * Authing 应用密钥，必填。
     */
    private String appSecret;

    /**
     * Authing 应用域名，如 https://example.authing.cn，必填。
     */
    private String appHost;

    /**
     * 认证完成后的重定向目标 URL，可选。Authing 服务器会对此链接进行校验，需要和控制台的设置保持一致。
     */
    private String redirectUri;

    /**
     * 登出完成后的重定向目标 URL，可选。Authing 服务器会对此链接进行校验，需要和控制台的设置保持一致。
     */
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
     * 存储认证上下文的 Cookie 名称
     */
    private String cookieKey;

    /**
     * 超时时间
     */
    private int timeout = 10000;

    /**
     * 获取 token 端点认证方式
     */
    private String tokenEndPointAuthMethod = AuthMethodEnum.CLIENT_SECRET_POST.getValue();

    /**
     * 获取 token 端点认证方式
     */
    private String protocol = ProtocolEnum.OIDC.getValue();

    /**
     * 检查 token 端点认证方式
     */
    private String introspectionEndPointAuthMethod = AuthMethodEnum.CLIENT_SECRET_POST.getValue();

    /**
     * 检查 token 端点认证方式
     */
    private String revocationEndPointAuthMethod = AuthMethodEnum.CLIENT_SECRET_POST.getValue();

    /**
     * 用户的AccessToken
     */
    private String AccessToken;

    @Override
    public String doRequest(String url, String method, Map<String, String> headers, Object body) {
        if (headers == null) {
            headers = new HashMap<>();
        }
        headers.put("x-authing-request-from", AuthingClientOptions.REQUEST_FROM);
        headers.put("x-authing-sdk-version", AuthingClientOptions.SDK_VERSION);
        headers.put("x-authing-app-id", this.appId);

        // 如果设置的 tokenEndPointAuthMethod 为 client_secret_basic 并且调用的是 /oidc 相关接口：
        // 1. 获取 token: /oidc(oauth)/token
        // 2. 撤销 token: /oidc(oauth)/token/revocation
        // 3. 检查 token: /oidc(oauth)/token/introspection
        // 4. 其他登录获取 token 接口
        String[] endpointsToSendBasicHeader = {
                "/oidc/token",
                "/oidc/token/revocation",
                "/oidc/token/introspection",
                "/oauth/token",
                "/oauth/token/revocation",
                "/oauth/token/introspection",
                "/api/v3/signin",
                "/api/v3/signin-by-mobile",
                "/api/v3/exchange-tokenset-with-qrcode-ticket"
        };
        if (this.getTokenEndPointAuthMethod() == AuthMethodEnum.CLIENT_SECRET_BASIC.getValue() && Arrays.asList(endpointsToSendBasicHeader).contains(url)) {
            headers.put("authorization", "Basic " + Base64.getEncoder().encodeToString((this.getAppId() + ":" + this.getAppSecret()).getBytes()));
        } else if (StrUtil.isNotBlank(this.getAccessToken())) {
            headers.put("authorization", "Bearer" + this.getAccessToken());
        }

        return HttpUtils.request(getAppHost() + url, method, body, headers, getTimeout());
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

    public String getAppHost() {
        return appHost;
    }

    public void setAppHost(String appHost) {
        this.appHost = appHost;
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

    public String getTokenEndPointAuthMethod() {
        return tokenEndPointAuthMethod;
    }

    public void setTokenEndPointAuthMethod(String tokenEndPointAuthMethod) {
        this.tokenEndPointAuthMethod = tokenEndPointAuthMethod;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getIntrospectionEndPointAuthMethod() {
        return introspectionEndPointAuthMethod;
    }

    public void setIntrospectionEndPointAuthMethod(String introspectionEndPointAuthMethod) {
        this.introspectionEndPointAuthMethod = introspectionEndPointAuthMethod;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String accessToken) {
        AccessToken = accessToken;
    }

    public String getRevocationEndPointAuthMethod() {
        return revocationEndPointAuthMethod;
    }

    public void setRevocationEndPointAuthMethod(String revocationEndPointAuthMethod) {
        this.revocationEndPointAuthMethod = revocationEndPointAuthMethod;
    }
}

