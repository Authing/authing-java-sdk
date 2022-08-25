package cn.authing.sdk.java.dto.authentication;

import cn.authing.sdk.java.util.CommonUtils;

public class BuildAuthUrlParams {
    /**
     * 应用侧向 Authing 请求的权限
     */
    private String scope = "openid profile";

    /**
     * 任意的随机数值
     */
    private String state = CommonUtils.createRandomString(16);

    /**
     * 一个只被使用一次的任意或非重复的随机数值
     */
    private String nonce = CommonUtils.createRandomString(16);

    /**
     * 重定向地址
     */
    private String redirectUri;

    /**
     * 是否强制跳转
     */
    private Boolean forced = false;

    public BuildAuthUrlParams() {
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
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

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public boolean getForced() {
        return forced;
    }

    public void setForced(Boolean forced) {
        this.forced = forced;
    }

}