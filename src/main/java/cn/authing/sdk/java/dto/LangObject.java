package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.LangUnit;

public class LangObject {
    /**
     * 多语言的中文内容
     */
    @JsonProperty("'zh-CN'")
    private LangUnit 'zh-CN';
    /**
     * 多语言的英文内容
     */
    @JsonProperty("'en-US'")
    private LangUnit 'en-US';
    /**
     * 多语言的繁体中文内容
     */
    @JsonProperty("'zh-TW'")
    private LangUnit 'zh-TW';
    /**
     * 多语言的日语内容
     */
    @JsonProperty("'ja-JP'")
    private LangUnit 'ja-JP';

    public LangUnit get'Zh-CN'() {
        return 'zh-CN';
    }
    public void set'Zh-CN'(LangUnit 'zh-CN') {
        this.'zh-CN' = 'zh-CN';
    }

    public LangUnit get'En-US'() {
        return 'en-US';
    }
    public void set'En-US'(LangUnit 'en-US') {
        this.'en-US' = 'en-US';
    }

    public LangUnit get'Zh-TW'() {
        return 'zh-TW';
    }
    public void set'Zh-TW'(LangUnit 'zh-TW') {
        this.'zh-TW' = 'zh-TW';
    }

    public LangUnit get'Ja-JP'() {
        return 'ja-JP';
    }
    public void set'Ja-JP'(LangUnit 'ja-JP') {
        this.'ja-JP' = 'ja-JP';
    }



}