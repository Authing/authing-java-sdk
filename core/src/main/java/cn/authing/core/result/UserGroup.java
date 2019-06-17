package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class UserGroup {
    @SerializedName("_id")
    private String id;
    private String name;
    private String descriptions;
    private String createdAt;
}
