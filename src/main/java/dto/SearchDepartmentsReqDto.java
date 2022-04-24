package dto;

import java.util.List;


public class SearchDepartmentsReqDto {
    /**
     * 搜索关键词
     */
    private String search;
    /**
     * 组织 code
     */
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