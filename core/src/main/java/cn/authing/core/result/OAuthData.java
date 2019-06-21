package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class OAuthData {
    @SerializedName("_id")
    private String id;
    private String name;
    private String image;
    private String description;
    private boolean enabled;
    private String client;
    private String user;
    private String url;
}
