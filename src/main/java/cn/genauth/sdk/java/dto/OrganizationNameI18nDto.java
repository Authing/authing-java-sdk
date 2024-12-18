package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrganizationNameI18nDto {
    /**
     * 支持多语言的字段
     */
    @JsonProperty("organizationName")
    private LangObject organizationName;

    public LangObject getOrganizationName() {
        return organizationName;
    }
    public void setOrganizationName(LangObject organizationName) {
        this.organizationName = organizationName;
    }



}