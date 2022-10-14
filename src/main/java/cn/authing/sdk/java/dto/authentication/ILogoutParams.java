package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ILogoutParams {
    /**
     * 是否开启专家模式
     */
    @JsonProperty("expert")
    private boolean expert = false;

    /**
     * 登出后的重定向地址
     */
    @JsonProperty("post_logout_redirect_uri")
    private String postLogoutRedirectUri;

    /**
     * 用户的 idToken
     */
    @JsonProperty("id_token")
    private String idToken;

    public ILogoutParams() {}

    public boolean isExpert() {
        return expert;
    }

    public void setExpert(boolean expert) {
        this.expert = expert;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getPostLogoutRedirectUri() {
        return postLogoutRedirectUri;
    }

    public void setPostLogoutRedirectUri(String postLogoutRedirectUri) {
        this.postLogoutRedirectUri = postLogoutRedirectUri;
    }

    @Override
    public String toString() {
        return "ILogoutParams{" +
                "expert=" + expert +
                ", postLogoutRedirectUri='" + postLogoutRedirectUri + '\'' +
                ", idToken='" + idToken + '\'' +
                '}';
    }
}
