package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListTenantApplicationsDto {
    /**
     * 获取应用列表的页码
     */
    @JsonProperty("page")
    private String page;
    /**
     * 每页获取的应用数量
     */
    @JsonProperty("limit")
    private String limit;
    /**
     * 搜索关键字
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * 应用是否加入单点登录
     */
    @JsonProperty("sso_enabled")
    private Boolean ssoEnabled;

    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }

    public String getLimit() {
        return limit;
    }
    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Boolean getSsoEnabled() {
        return ssoEnabled;
    }
    public void setSsoEnabled(Boolean ssoEnabled) {
        this.ssoEnabled = ssoEnabled;
    }



}