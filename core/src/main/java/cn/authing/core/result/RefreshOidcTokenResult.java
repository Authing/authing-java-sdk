package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

public class RefreshOidcTokenResult {
    @SerializedName("access_token")
    private String accessToken;
    @Getter
    @SerializedName("expires_in")
    private int expiresIn;
    @Getter
    @SerializedName("id_token")
    private String idToken;
    @Getter
    @SerializedName("refresh_token")
    private String refreshToken;
    @Getter
    private String scope;
    @SerializedName("token_type")
    @Getter
    private String tokenType;

    public String getAccessToken() {
        return accessToken;
    }
}
