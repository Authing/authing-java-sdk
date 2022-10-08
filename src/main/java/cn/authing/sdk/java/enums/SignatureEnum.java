package cn.authing.sdk.java.enums;

public enum SignatureEnum {
    X_AUTHING_SDK_CLIENT("Node.js(v14.18.0), authing-java-sdk: 0.0.19"),
    X_AUTHING_SIGNATURE_METHOD("HMAC-SHA1"),
    X_AUTHING_SIGNATURE_VERSION("1.0");

    private final String value;

    SignatureEnum (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
