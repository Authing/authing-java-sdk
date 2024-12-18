package cn.genauth.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthUrlParams {
    /**
     * 登录完成重定向地址
     */
    @JsonProperty("redirect_uri")
    private String redirectUri;

    /**
     * 响应类型
     */
    @JsonProperty("response_type")
    private String responseType;

    /**
     * 响应模式
     */
    @JsonProperty("response_mode")
    private String responseMode;

    /**
     * 客户端 ID
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * 任意的随机数值
     */
    @JsonProperty("state")
    private String state;

    /**
     * 一个只被使用一次的任意或非重复的随机数值
     */
    @JsonProperty("nonce")
    private String nonce;

    /**
     * 应用侧向 Authing 请求的权限
     */
    @JsonProperty("scope")
    private String scope;

    /**
     * 认证接口显示弹窗类型
     */
    @JsonProperty("prompt")
    private String prompt;

    public String getRedirectUri() {
        return redirectUri;
    }

    public AuthUrlParams(String redirectUri, String responseType, String responseMode, String clientId, String state, String nonce, String scope, String prompt) {
        this.redirectUri = redirectUri;
        this.responseType = responseType;
        this.responseMode = responseMode;
        this.clientId = clientId;
        this.state = state;
        this.nonce = nonce;
        this.scope = scope;
        this.prompt = prompt;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getResponseMode() {
        return responseMode;
    }

    public void setResponseMode(String responseMode) {
        this.responseMode = responseMode;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}