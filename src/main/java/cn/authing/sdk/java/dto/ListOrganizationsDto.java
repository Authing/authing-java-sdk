package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListOrganizationsDto {
    /**
     * 当前页数，从 1 开始
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页数目，最大不能超过 50，默认为 10
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * 拉取所有
     */
    @JsonProperty("fetchAll")
    private Boolean fetchAll;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;

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

    public Boolean getFetchAll() {
        return fetchAll;
    }
    public void setFetchAll(Boolean fetchAll) {
        this.fetchAll = fetchAll;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }



}