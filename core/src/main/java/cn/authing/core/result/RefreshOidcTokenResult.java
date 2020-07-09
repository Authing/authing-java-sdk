package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

public class RefreshOidcTokenResult {
    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("expires_in")
    private int expiresIn;
    @SerializedName("id_token")
    private String idToken;
    @SerializedName("refresh_token")
    private String refreshToken;
    private String scope;
    @SerializedName("token_type")
    private String tokenType;

    public String getAccessToken() {
        return accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public String getIdToken() {
        return idToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public String getScope() {
        return scope;
    }

    public String getTokenType() {
        return tokenType;
    }
}
