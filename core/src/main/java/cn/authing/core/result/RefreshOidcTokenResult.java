package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class RefreshOidcTokenResult {
    @SerializedName("access_token")
    String accessToken;
    @SerializedName("expires_in")
    int expiresIn;
    @SerializedName("id_token")
    String idToken;
    @SerializedName("refresh_token")
    String refreshToken;
    String scope;
    @SerializedName("token_type")
    String tokenType;
}
