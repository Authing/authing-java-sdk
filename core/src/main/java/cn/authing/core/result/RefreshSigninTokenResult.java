package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class RefreshSigninTokenResult {
    @SerializedName("access_token")
    String accessToken;
    @SerializedName("id_token")
    String idToken;
    @SerializedName("refresh_token")
    String refreshToken;
    @SerializedName("expires_in")
    int expiresIn;
    String scope;
} 
