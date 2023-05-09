package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListPostDto {
    /**
     * 搜索岗位 code 或名称
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * 是否统计岗位关联的部门数和用户数
     */
    @JsonProperty("skipCount")
    private Boolean skipCount;
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
     * 是否展示元数据内容
     */
    @JsonProperty("withMetadata")
    private Boolean withMetadata;

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Boolean getSkipCount() {
        return skipCount;
    }
    public void setSkipCount(Boolean skipCount) {
        this.skipCount = skipCount;
    }

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

    public Boolean getWithMetadata() {
        return withMetadata;
    }
    public void setWithMetadata(Boolean withMetadata) {
        this.withMetadata = withMetadata;
    }



}