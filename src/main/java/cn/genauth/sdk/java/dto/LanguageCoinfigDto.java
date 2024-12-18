package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LanguageCoinfigDto {
    @JsonProperty("global")
    private LanguageCoinfigGlobalDto global;

    public LanguageCoinfigGlobalDto getGlobal() {
        return global;
    }
    public void setGlobal(LanguageCoinfigGlobalDto global) {
        this.global = global;
    }



}