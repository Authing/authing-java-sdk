package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class BindThirdPartyOAuthResult {

    @SerializedName("_id")
    private String id;
    @SerializedName("user")
    private String userId;
    @SerializedName("client")
    private String clientId;
    private String type;
    private String userInfo;
    private String unionid;
    private String createdAt;
}
