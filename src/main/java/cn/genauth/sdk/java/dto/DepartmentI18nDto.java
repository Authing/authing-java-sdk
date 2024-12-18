package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DepartmentI18nDto {
    /**
     * 支持多语言的字段
     */
    @JsonProperty("name")
    private LangObject name;

    public LangObject getName() {
        return name;
    }
    public void setName(LangObject name) {
        this.name = name;
    }



}