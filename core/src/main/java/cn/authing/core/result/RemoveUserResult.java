package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class RemoveUserResult {
    @SerializedName("_id")
    private String id;
}
