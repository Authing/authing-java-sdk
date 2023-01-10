package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.LanguageCoinfigGlobalDto;

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