package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class SearchDepartmentsReqDto {
    /**
     * 搜索关键词
     */
    @JsonProperty("getSearch")
    private String search;
    /**
     * 组织 code
     */
    @JsonProperty("getOrganizationCode")
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