package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class SigninResult {
    String sub;
    String birthdate;
    @SerializedName("family_name")
    String familyName;
    String gender;
    @SerializedName("given_name")
    String givenName;
    String locale;
    @SerializedName("middle_name")
    String middleName;
    @SerializedName("preferred_username")
    String preferredUsername;
    @SerializedName("updated_at")
    String updatedAt;
    @SerializedName("logins_count")
    int loginsCount;
    @SerializedName("register_method")
    String registerMethod;
    @SerializedName("last_ip")
    String lastIp;
    @SerializedName("register_in_userpool")
    String registerInUserpool;
    @SerializedName("last_login")
    String lastLogin;
    @SerializedName("signed_up")
    String signedUp;
    @SerializedName("email_verified")
    boolean isEmailVerified;
    @SerializedName("phone_number")
    String phoneNumber;
    @SerializedName("phone_number_verified")
    boolean isPhoneNumberVerified;
    @SerializedName("access_token")
    String accessToken;
    @SerializedName("id_token")
    String idToken;
    @SerializedName("refresh_token")
    String refreshToken;
    @SerializedName("expires_in")
    int expiresIn;
    @SerializedName("token_type")
    String tokenType;
    String name;
    String nickname;
    String picture;
    String profile;
    String website;
    String zoneinfo;
    String username;
    @SerializedName("_id")
    String id;
    String company;
    String browser;
    String device;
    boolean blocked;
    String email;
    String token;
    String scope;
}
