package cn.authing.sdk.java.enums;

public enum AuthMethodEnum {
    CLIENT_SECRET_POST("client_secret_post"),
    CLIENT_SECRET_BASIC("client_secret_basic"),
    NONE("none");

    private String value;

    AuthMethodEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
