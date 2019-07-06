package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class RoleInfoResult {

    @SerializedName("_id")
    private String id;
    private String name;
    private String client;
    private String descriptions;
    private String createdAt;
    private String permissions;
}
