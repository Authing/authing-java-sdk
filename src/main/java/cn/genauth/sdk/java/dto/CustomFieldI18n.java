package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomFieldI18n {
    /**
     * 支持多语言的字段
     */
    @JsonProperty("label")
    private LangObject label;

    public LangObject getLabel() {
        return label;
    }
    public void setLabel(LangObject label) {
        this.label = label;
    }



}