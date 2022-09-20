package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.LangObject;

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