package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogoutUrlParams {
    /**
     * 登出重定向地址
     */
    @JsonProperty("post_logout_redirect_uri")
    private String postLogoutRedirectUri;

    public LogoutUrlParams() {
    }

    /**
     * 用户登录时获取的 ID Token
     */
    @JsonProperty("id_token_hint")
    private String idTokenHint;

    /**
     * 任意的随机数值
     */
    @JsonProperty("state")
    private String state;

    public String getPostLogoutRedirectUri() {
        return postLogoutRedirectUri;
    }

    public void setPostLogoutRedirectUri(String postLogoutRedirectUri) {
        this.postLogoutRedirectUri = postLogoutRedirectUri;
    }

    public String getIdTokenHint() {
        return idTokenHint;
    }

    public void setIdTokenHint(String idTokenHint) {
        this.idTokenHint = idTokenHint;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}