package cn.genauth.sdk.java.dto;

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
    /**
     * 是否不显示 metadata 的 fieldId 字段
     */
    @JsonProperty("metadataNoFieldId")
    private Boolean metadataNoFieldId;
    /**
     * 创建时间在此时间之后的岗位
     */
    @JsonProperty("createdAfter")
    private Integer createdAfter;
    /**
     * 创建时间在此时间之前的岗位
     */
    @JsonProperty("createdBefore")
    private Integer createdBefore;

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

    public Boolean getMetadataNoFieldId() {
        return metadataNoFieldId;
    }
    public void setMetadataNoFieldId(Boolean metadataNoFieldId) {
        this.metadataNoFieldId = metadataNoFieldId;
    }

    public Integer getCreatedAfter() {
        return createdAfter;
    }
    public void setCreatedAfter(Integer createdAfter) {
        this.createdAfter = createdAfter;
    }

    public Integer getCreatedBefore() {
        return createdBefore;
    }
    public void setCreatedBefore(Integer createdBefore) {
        this.createdBefore = createdBefore;
    }



}