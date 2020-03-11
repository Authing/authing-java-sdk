package cn.authing.core.result;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class CheckLoginStatusResult {
    private boolean status;
    private int code;
    private String message;
    private Token token;

    @Getter
    public static class Data {
        private String email;
        private String id;
        @SerializedName("clientId")
        private String clientid;
        private String unionid;
    }

    @Getter
    public static class Token {
        private Data data;
        private int iat;
        private int exp;
    }
}
 