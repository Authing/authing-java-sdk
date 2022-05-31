package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchDepartmentsReqDto {
    /**
     * 搜索关键词
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }



}