package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchDepartmentsReqDto {
    /**
     * 搜索关键词
     */
    @JsonProperty("search")
    private String search;
    /**
     * 组织 code
     */
    @JsonProperty("organizationCode")
    private String organizationCode;

    public String getSearch() {
        return search;
    }
    public void setSearch(String search) {
        this.search = search;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }



}