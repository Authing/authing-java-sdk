package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Location {
    @SerializedName("_id")
    private String id;
    private String when;
    private String where;
}
