package cn.genauth.sdk.java.enums;

public enum CodeChallengeMethodEnum {
    S256("S256"),
    PLAIN("plain");

    private String value;

    CodeChallengeMethodEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
