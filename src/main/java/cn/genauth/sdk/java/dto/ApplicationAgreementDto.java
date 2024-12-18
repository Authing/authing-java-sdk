package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationAgreementDto {
    /**
     * 展示的页面（可多选）：
     * - `LoginPage`: 登录页面
     * - `RegisterPage`: 注册页面
     *
     */
    @JsonProperty("displayAt")
    private List<String> displayAt;
    /**
     * 是否要求必须勾选
     */
    @JsonProperty("isRequired")
    private Boolean isRequired;
    /**
     * 此协议针对什么语言有效:
     * - `zh-CN`: 简体中文
     * - `zh-TW`: 繁体中文
     * - `en-US`: 英文
     * - `ja-JP`: 日语
     *
     */
    @JsonProperty("lang")
    private Lang lang;
    /**
     * 此协议针对什么语言有效
     */
    @JsonProperty("content")
    private String content;

    public List<String> getDisplayAt() {
        return displayAt;
    }
    public void setDisplayAt(List<String> displayAt) {
        this.displayAt = displayAt;
    }

    public Boolean getIsRequired() {
        return isRequired;
    }
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public Lang getLang() {
        return lang;
    }
    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }


    /**
     * 此协议针对什么语言有效:
     * - `zh-CN`: 简体中文
     * - `zh-TW`: 繁体中文
     * - `en-US`: 英文
     * - `ja-JP`: 日语
     *
     */
    public static enum Lang {

        @JsonProperty("zh-CN")
        ZH_CN("zh-CN"),

        @JsonProperty("en-US")
        EN_US("en-US"),

        @JsonProperty("zh-TW")
        ZH_TW("zh-TW"),

        @JsonProperty("ja-JP")
        JA_JP("ja-JP"),
        ;

        private String value;

        Lang(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}