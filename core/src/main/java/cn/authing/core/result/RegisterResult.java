package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class RegisterResult {
    @SerializedName("_id")
    private String id;
    private String email;
    private boolean emailVerified;
    private String username;
    private String nickname;
    private String company;
    private String photo;
    private String browser;
    private String token;
    private String tokenExpiredAt;
    private int loginsCount;
    private String lastLogin;
    private String lastIP;
    private String signedUp;
    private boolean blocked;
    private boolean isDeleted;
    private UserGroup group;
}
