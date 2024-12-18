package cn.genauth.sdk.java.enums;

public enum ProtocolEnum {
    OAUTH("oauth"),
    OIDC("oidc"),
    CAS("cas"),
    SAML("saml");

    private String value;

    ProtocolEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
