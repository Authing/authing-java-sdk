package cn.authing.sdk.java.enums;

/**
 * @author luojielin
 */
public enum LanguageEnum {

    CHINESE("zh-CN"),
    ENGLISH("en-US");

    private String value;

    LanguageEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
