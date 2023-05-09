package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetLdapSubEntriesDto {
    /**
     * 当前页,从 1 开始
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页条数
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * 当前 DN
     */
    @JsonProperty("dn")
    private String dn;

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getDn() {
        return dn;
    }
    public void setDn(String dn) {
        this.dn = dn;
    }



}