package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthUrlResult {
    /**
     * 认证登录地址
     */
    @JsonProperty("url")
    private String url;

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

    public AuthUrlResult(String url, String state, String nonce) {
        this.url = url;
        this.state = state;
        this.nonce = nonce;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
}