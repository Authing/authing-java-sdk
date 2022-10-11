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
    @JsonProperty("redirect-uri")
    private String redirectUri;

    /**
     * 用户的 idToken
     */
    @JsonProperty("id-token")
    private String idToken;

    public ILogoutParams() {}

    public boolean isExpert() {
        return expert;
    }

    public void setExpert(boolean expert) {
        this.expert = expert;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    @Override
    public String toString() {
        return "ILogoutParams{" +
                "expert=" + expert +
                ", redirectUri='" + redirectUri + '\'' +
                ", idToken='" + idToken + '\'' +
                '}';
    }
}
