package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LangObject {
    /**
     * 多语言的中文内容
     */
    @JsonProperty("'zh-CN'")
    private LangUnit zhCN;
    /**
     * 多语言的英文内容
     */
    @JsonProperty("'en-US'")
    private LangUnit enUS;
    /**
     * 多语言的繁体中文内容
     */
    @JsonProperty("'zh-TW'")
    private LangUnit zhTW;
    /**
     * 多语言的日语内容
     */
    @JsonProperty("'ja-JP'")
    private LangUnit jaJP;

    public LangUnit getZhCN() {
        return zhCN;
    }
    public void setZhCN(LangUnit zhCN) {
        this.zhCN = zhCN;
    }

    public LangUnit getEnUS() {
        return enUS;
    }
    public void setEnUS(LangUnit enUS) {
        this.enUS = enUS;
    }

    public LangUnit getZhTW() {
        return zhTW;
    }
    public void setZhTW(LangUnit zhTW) {
        this.zhTW = zhTW;
    }

    public LangUnit getJaJP() {
        return jaJP;
    }
    public void setJaJP(LangUnit jaJP) {
        this.jaJP = jaJP;
    }



}