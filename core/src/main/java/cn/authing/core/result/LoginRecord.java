package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class LoginRecord {
    @SerializedName("_id")
    private String id;
    private String when;
    private boolean success;
    private String ip;
    private boolean result;
}
