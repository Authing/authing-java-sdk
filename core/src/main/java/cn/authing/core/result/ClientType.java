package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class ClientType {
    @SerializedName("_id")
    private String id;
    private String name;
    private String description;
    private String image;
    private String example;
}
