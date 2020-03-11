package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Getter;

@Getter
public class UserInfoResult {
    @SerializedName("_id")
    private String id;
    private String email;
    private boolean emailVerified;
    private String username;
    private String nickname;
    private String company;
    private String photo;
    private String browser;
    private String registerInClient;
    private String registerMethod;
    private String oauth;
    private String token;
    private String tokenExpiredAt;
    private int loginsCount;
    private String lastLogin;
    private String lastIP;
    private String signedUp;
    private boolean blocked;
    private boolean isDeleted;
    private List<Location> userLocation;
    private UserLoginHistory userLoginHistory;
    private UserGroup group;
    private ClientType clientType;
}
