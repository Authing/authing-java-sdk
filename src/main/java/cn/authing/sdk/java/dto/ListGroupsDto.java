package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListGroupsDto {
    /**
     * 搜索分组 code 或分组名称
     */
    @JsonProperty("keywords")
    private String keywords;
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
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;
    /**
     * 是否拍平扩展字段
     */
    @JsonProperty("flatCustomData")
    private Boolean flatCustomData;

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
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

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }

    public Boolean getFlatCustomData() {
        return flatCustomData;
    }
    public void setFlatCustomData(Boolean flatCustomData) {
        this.flatCustomData = flatCustomData;
    }



}